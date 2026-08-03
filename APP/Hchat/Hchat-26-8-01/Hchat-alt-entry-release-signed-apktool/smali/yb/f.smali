.class public final Lyb/f;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/m;


# instance fields
.field public u:Lf1/r0;

.field public v:Lfg/a;

.field public w:Li1/b;

.field public final x:Lf1/h;

.field public final y:Lf1/j;

.field public z:F


# direct methods
.method public constructor <init>(Lf1/r0;Lfg/a;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lyb/f;->u:Lf1/r0;

    .line 11
    .line 12
    iput-object p2, p0, Lyb/f;->v:Lfg/a;

    .line 13
    .line 14
    invoke-static {}, Lf1/c0;->f()Lf1/h;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lyb/f;->x:Lf1/h;

    .line 19
    .line 20
    invoke-static {}, Lf1/l;->a()Lf1/j;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lyb/f;->y:Lf1/j;

    .line 25
    .line 26
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 27
    .line 28
    iput p1, p0, Lyb/f;->z:F

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final B(Lx1/h0;)V
    .locals 11

    .line 1
    iget-object v0, p1, Lx1/h0;->g:Lh1/b;

    .line 2
    .line 3
    invoke-virtual {p1}, Lx1/h0;->e()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lyb/f;->v:Lfg/a;

    .line 7
    .line 8
    invoke-interface {v1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lyb/b;

    .line 13
    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    iget-wide v2, v1, Lyb/b;->b:J

    .line 17
    .line 18
    iget-object v4, p0, Lyb/f;->w:Li1/b;

    .line 19
    .line 20
    if-eqz v4, :cond_6

    .line 21
    .line 22
    iget v5, v1, Lyb/b;->a:F

    .line 23
    .line 24
    invoke-virtual {p1, v5}, Lx1/h0;->x0(F)F

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    const/16 v6, 0x20

    .line 29
    .line 30
    shr-long v6, v2, v6

    .line 31
    .line 32
    long-to-int v6, v6

    .line 33
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    invoke-virtual {p1, v6}, Lx1/h0;->x0(F)F

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    const-wide v7, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v2, v7

    .line 47
    long-to-int v2, v2

    .line 48
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {p1, v2}, Lx1/h0;->x0(F)F

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    iget-object v3, p0, Lyb/f;->u:Lf1/r0;

    .line 57
    .line 58
    invoke-interface {v0}, Lh1/d;->a()J

    .line 59
    .line 60
    .line 61
    move-result-wide v7

    .line 62
    invoke-virtual {p1}, Lx1/h0;->getLayoutDirection()Lu2/m;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-interface {v3, v7, v8, v9, p1}, Lf1/r0;->a(JLu2/m;Lu2/c;)Lf1/c0;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iget-object v7, p0, Lyb/f;->y:Lf1/j;

    .line 71
    .line 72
    invoke-virtual {v7}, Lf1/j;->h()V

    .line 73
    .line 74
    .line 75
    instance-of v8, v3, Lf1/k0;

    .line 76
    .line 77
    if-eqz v8, :cond_0

    .line 78
    .line 79
    move-object v8, v3

    .line 80
    check-cast v8, Lf1/k0;

    .line 81
    .line 82
    iget-object v8, v8, Lf1/k0;->f:Le1/c;

    .line 83
    .line 84
    invoke-static {v7, v8}, Lf1/j;->b(Lf1/j;Le1/c;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    instance-of v8, v3, Lf1/l0;

    .line 89
    .line 90
    if-eqz v8, :cond_1

    .line 91
    .line 92
    move-object v8, v3

    .line 93
    check-cast v8, Lf1/l0;

    .line 94
    .line 95
    iget-object v8, v8, Lf1/l0;->f:Le1/d;

    .line 96
    .line 97
    invoke-static {v7, v8}, Lf1/j;->c(Lf1/j;Le1/d;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    instance-of v8, v3, Lf1/j0;

    .line 102
    .line 103
    if-eqz v8, :cond_5

    .line 104
    .line 105
    move-object v8, v3

    .line 106
    check-cast v8, Lf1/j0;

    .line 107
    .line 108
    iget-object v8, v8, Lf1/j0;->f:Lf1/j;

    .line 109
    .line 110
    invoke-static {v7, v8}, Lf1/j;->a(Lf1/j;Lf1/j;)V

    .line 111
    .line 112
    .line 113
    :goto_0
    iget-object v8, p0, Lyb/f;->x:Lf1/h;

    .line 114
    .line 115
    iget-wide v9, v1, Lyb/b;->c:J

    .line 116
    .line 117
    invoke-virtual {v8, v9, v10}, Lf1/h;->w(J)V

    .line 118
    .line 119
    .line 120
    iget v8, v1, Lyb/b;->d:F

    .line 121
    .line 122
    invoke-virtual {v4, v8}, Li1/b;->f(F)V

    .line 123
    .line 124
    .line 125
    iget v1, v1, Lyb/b;->e:I

    .line 126
    .line 127
    iget-object v8, v4, Li1/b;->a:Li1/d;

    .line 128
    .line 129
    invoke-interface {v8}, Li1/d;->O()I

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    if-ne v9, v1, :cond_2

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_2
    invoke-interface {v8, v1}, Li1/d;->h(I)V

    .line 137
    .line 138
    .line 139
    :goto_1
    iget v1, p0, Lyb/f;->z:F

    .line 140
    .line 141
    cmpg-float v1, v1, v5

    .line 142
    .line 143
    if-nez v1, :cond_3

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_3
    const/4 v1, 0x0

    .line 147
    cmpl-float v1, v5, v1

    .line 148
    .line 149
    if-lez v1, :cond_4

    .line 150
    .line 151
    new-instance v1, Lf1/r;

    .line 152
    .line 153
    invoke-direct {v1, v5, v5}, Lf1/r;-><init>(FF)V

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_4
    const/4 v1, 0x0

    .line 158
    :goto_2
    invoke-virtual {v4, v1}, Li1/b;->g(Lf1/n0;)V

    .line 159
    .line 160
    .line 161
    iput v5, p0, Lyb/f;->z:F

    .line 162
    .line 163
    :goto_3
    new-instance v1, Lyb/e;

    .line 164
    .line 165
    invoke-direct {v1, p0, v3, v6, v2}, Lyb/e;-><init>(Lyb/f;Lf1/c0;FF)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v0}, Lh1/d;->a()J

    .line 169
    .line 170
    .line 171
    move-result-wide v2

    .line 172
    invoke-static {v2, v3}, Lr9/e0;->p0(J)J

    .line 173
    .line 174
    .line 175
    move-result-wide v2

    .line 176
    invoke-virtual {p1, v2, v3, v1, v4}, Lx1/h0;->y(JLfg/l;Li1/b;)V

    .line 177
    .line 178
    .line 179
    iget-object v0, v0, Lh1/b;->h:Lb5/c;

    .line 180
    .line 181
    invoke-virtual {v0}, Lb5/c;->p()Lf1/u;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-interface {v0}, Lf1/u;->e()V

    .line 186
    .line 187
    .line 188
    invoke-interface {v0, v7}, Lf1/u;->d(Lf1/j;)V

    .line 189
    .line 190
    .line 191
    invoke-static {p1, v4}, Loh/h;->u(Lh1/d;Li1/b;)V

    .line 192
    .line 193
    .line 194
    invoke-interface {v0}, Lf1/u;->p()V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_5
    invoke-static {}, Lokio/a;->k()V

    .line 199
    .line 200
    .line 201
    :cond_6
    return-void
.end method

.method public final Z0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final c1()V
    .locals 4

    .line 1
    invoke-static {p0}, Lx1/k;->u(Ly0/n;)Lf1/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lf1/z;->c()Li1/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, v0, Li1/b;->a:Li1/d;

    .line 10
    .line 11
    invoke-interface {v1}, Li1/d;->w()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x1

    .line 16
    if-ne v2, v3, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {v1, v3}, Li1/d;->J(I)V

    .line 20
    .line 21
    .line 22
    :goto_0
    iput-object v0, p0, Lyb/f;->w:Li1/b;

    .line 23
    .line 24
    return-void
.end method

.method public final d1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyb/f;->w:Li1/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lx1/k;->u(Ly0/n;)Lf1/z;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1, v0}, Lf1/z;->a(Li1/b;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lyb/f;->w:Li1/b;

    .line 14
    .line 15
    :cond_0
    return-void
.end method
