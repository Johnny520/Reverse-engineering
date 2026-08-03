.class public final Lw/q0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final A:Li0/j1;

.field public final B:Li0/j1;

.field public a:Lw/x0;

.field public final b:Li0/r1;

.field public final c:Ly1/g2;

.field public final d:Lb/e;

.field public e:Ln2/y;

.field public final f:Li0/j1;

.field public final g:Li0/j1;

.field public h:Lv1/t;

.field public final i:Li0/j1;

.field public j:Li2/g;

.field public final k:Li0/j1;

.field public final l:Li0/j1;

.field public final m:Li0/j1;

.field public final n:Li0/j1;

.field public final o:Li0/j1;

.field public p:Z

.field public final q:Li0/j1;

.field public final r:Lb5/c;

.field public final s:Li0/j1;

.field public final t:Li0/j1;

.field public u:Lfg/l;

.field public final v:Lw/w;

.field public final w:Lw/w;

.field public final x:Lw/w;

.field public final y:Lf1/h;

.field public z:J


# direct methods
.method public constructor <init>(Lw/x0;Li0/r1;Ly1/g2;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/q0;->a:Lw/x0;

    .line 5
    .line 6
    iput-object p2, p0, Lw/q0;->b:Li0/r1;

    .line 7
    .line 8
    iput-object p3, p0, Lw/q0;->c:Ly1/g2;

    .line 9
    .line 10
    new-instance p1, Lb/e;

    .line 11
    .line 12
    const/16 p2, 0x1b

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-direct {p1, p2, v0}, Lb/e;-><init>(IZ)V

    .line 16
    .line 17
    .line 18
    new-instance p2, Ln2/s;

    .line 19
    .line 20
    sget-object v0, Li2/h;->a:Li2/g;

    .line 21
    .line 22
    sget-wide v1, Li2/m0;->b:J

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-direct {p2, v0, v1, v2, v3}, Ln2/s;-><init>(Li2/g;JLi2/m0;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p1, Lb/e;->h:Ljava/lang/Object;

    .line 29
    .line 30
    new-instance v4, Lk5/n;

    .line 31
    .line 32
    iget-wide v5, p2, Ln2/s;->b:J

    .line 33
    .line 34
    invoke-direct {v4, v0, v5, v6}, Lk5/n;-><init>(Li2/g;J)V

    .line 35
    .line 36
    .line 37
    iput-object v4, p1, Lb/e;->i:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object p1, p0, Lw/q0;->d:Lb/e;

    .line 40
    .line 41
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iput-object p2, p0, Lw/q0;->f:Li0/j1;

    .line 48
    .line 49
    const/4 p2, 0x0

    .line 50
    int-to-float p2, p2

    .line 51
    new-instance v0, Lu2/f;

    .line 52
    .line 53
    invoke-direct {v0, p2}, Lu2/f;-><init>(F)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    iput-object p2, p0, Lw/q0;->g:Li0/j1;

    .line 61
    .line 62
    invoke-static {v3}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iput-object p2, p0, Lw/q0;->i:Li0/j1;

    .line 67
    .line 68
    sget-object p2, Lw/h0;->g:Lw/h0;

    .line 69
    .line 70
    invoke-static {p2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    iput-object p2, p0, Lw/q0;->k:Li0/j1;

    .line 75
    .line 76
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    iput-object p2, p0, Lw/q0;->l:Li0/j1;

    .line 81
    .line 82
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    iput-object p2, p0, Lw/q0;->m:Li0/j1;

    .line 87
    .line 88
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    iput-object p2, p0, Lw/q0;->n:Li0/j1;

    .line 93
    .line 94
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    iput-object p2, p0, Lw/q0;->o:Li0/j1;

    .line 99
    .line 100
    const/4 p2, 0x1

    .line 101
    iput-boolean p2, p0, Lw/q0;->p:Z

    .line 102
    .line 103
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-static {p2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    iput-object p2, p0, Lw/q0;->q:Li0/j1;

    .line 110
    .line 111
    new-instance p2, Lb5/c;

    .line 112
    .line 113
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 114
    .line 115
    .line 116
    iput-object p3, p2, Lb5/c;->a:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object p2, p0, Lw/q0;->r:Lb5/c;

    .line 119
    .line 120
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    iput-object p2, p0, Lw/q0;->s:Li0/j1;

    .line 125
    .line 126
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iput-object p1, p0, Lw/q0;->t:Li0/j1;

    .line 131
    .line 132
    new-instance p1, Lr9/p;

    .line 133
    .line 134
    const/16 p2, 0x13

    .line 135
    .line 136
    invoke-direct {p1, p2}, Lr9/p;-><init>(I)V

    .line 137
    .line 138
    .line 139
    iput-object p1, p0, Lw/q0;->u:Lfg/l;

    .line 140
    .line 141
    new-instance p1, Lw/w;

    .line 142
    .line 143
    const/4 p2, 0x1

    .line 144
    invoke-direct {p1, p0, p2}, Lw/w;-><init>(Lw/q0;I)V

    .line 145
    .line 146
    .line 147
    iput-object p1, p0, Lw/q0;->v:Lw/w;

    .line 148
    .line 149
    new-instance p1, Lw/w;

    .line 150
    .line 151
    const/4 p2, 0x2

    .line 152
    invoke-direct {p1, p0, p2}, Lw/w;-><init>(Lw/q0;I)V

    .line 153
    .line 154
    .line 155
    iput-object p1, p0, Lw/q0;->w:Lw/w;

    .line 156
    .line 157
    new-instance p1, Lw/w;

    .line 158
    .line 159
    const/4 p2, 0x3

    .line 160
    invoke-direct {p1, p0, p2}, Lw/w;-><init>(Lw/q0;I)V

    .line 161
    .line 162
    .line 163
    iput-object p1, p0, Lw/q0;->x:Lw/w;

    .line 164
    .line 165
    invoke-static {}, Lf1/c0;->f()Lf1/h;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    iput-object p1, p0, Lw/q0;->y:Lf1/h;

    .line 170
    .line 171
    sget-wide p1, Lf1/w;->g:J

    .line 172
    .line 173
    iput-wide p1, p0, Lw/q0;->z:J

    .line 174
    .line 175
    new-instance p1, Li2/m0;

    .line 176
    .line 177
    invoke-direct {p1, v1, v2}, Li2/m0;-><init>(J)V

    .line 178
    .line 179
    .line 180
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    iput-object p1, p0, Lw/q0;->A:Li0/j1;

    .line 185
    .line 186
    new-instance p1, Li2/m0;

    .line 187
    .line 188
    invoke-direct {p1, v1, v2}, Li2/m0;-><init>(J)V

    .line 189
    .line 190
    .line 191
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    iput-object p1, p0, Lw/q0;->B:Li0/j1;

    .line 196
    .line 197
    return-void
.end method


# virtual methods
.method public final a()Lw/h0;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/q0;->k:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lw/h0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw/q0;->f:Li0/j1;

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

.method public final c()Lv1/t;
    .locals 2

    .line 1
    iget-object v0, p0, Lw/q0;->h:Lv1/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lv1/t;->C()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public final d()Lw/m1;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/q0;->i:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lw/m1;

    .line 8
    .line 9
    return-object v0
.end method

.method public final e(J)V
    .locals 1

    .line 1
    new-instance v0, Li2/m0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Li2/m0;-><init>(J)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lw/q0;->B:Li0/j1;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final f(J)V
    .locals 1

    .line 1
    new-instance v0, Li2/m0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Li2/m0;-><init>(J)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lw/q0;->A:Li0/j1;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
