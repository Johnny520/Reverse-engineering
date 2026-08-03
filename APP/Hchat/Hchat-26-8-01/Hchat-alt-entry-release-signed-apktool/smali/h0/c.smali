.class public final synthetic Lh0/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:J

.field public final synthetic h:Z

.field public final synthetic i:Ly0/o;

.field public final synthetic j:Lh0/l;


# direct methods
.method public synthetic constructor <init>(JZLy0/o;Lh0/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lh0/c;->g:J

    .line 5
    .line 6
    iput-boolean p3, p0, Lh0/c;->h:Z

    .line 7
    .line 8
    iput-object p4, p0, Lh0/c;->i:Ly0/o;

    .line 9
    .line 10
    iput-object p5, p0, Lh0/c;->j:Lh0/l;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    check-cast p1, Li0/h0;

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
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v3

    .line 19
    :goto_0
    and-int/2addr p2, v2

    .line 20
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_8

    .line 25
    .line 26
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    iget-wide v4, p0, Lh0/c;->g:J

    .line 32
    .line 33
    cmp-long p2, v4, v0

    .line 34
    .line 35
    iget-boolean v0, p0, Lh0/c;->h:Z

    .line 36
    .line 37
    iget-object v6, p0, Lh0/c;->i:Ly0/o;

    .line 38
    .line 39
    iget-object v1, p0, Lh0/c;->j:Lh0/l;

    .line 40
    .line 41
    sget-object v12, Li0/l;->a:Li0/e;

    .line 42
    .line 43
    if-eqz p2, :cond_5

    .line 44
    .line 45
    const p2, 0x34c4c6

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 49
    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    sget-object p2, Lp/d;->b:Lp/c;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    sget-object p2, Lp/d;->a:Lp/c;

    .line 57
    .line 58
    :goto_1
    invoke-static {v4, v5}, Lu2/h;->b(J)F

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    invoke-static {v4, v5}, Lu2/h;->a(J)F

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    const/4 v10, 0x0

    .line 67
    const/16 v11, 0xc

    .line 68
    .line 69
    const/4 v9, 0x0

    .line 70
    invoke-static/range {v6 .. v11}, Lp/h1;->i(Ly0/o;FFFFI)Ly0/o;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    sget-object v5, Ly0/b;->p:Ly0/f;

    .line 75
    .line 76
    invoke-static {p2, v5, p1, v3}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    iget-wide v5, p1, Li0/h0;->T:J

    .line 81
    .line 82
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    invoke-virtual {p1}, Li0/h0;->l()Ls0/h;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-static {p1, v4}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    sget-object v7, Lx1/g;->f:Lx1/f;

    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    sget-object v7, Lx1/f;->b:Lx1/y;

    .line 100
    .line 101
    invoke-virtual {p1}, Li0/h0;->d0()V

    .line 102
    .line 103
    .line 104
    iget-boolean v8, p1, Li0/h0;->S:Z

    .line 105
    .line 106
    if-eqz v8, :cond_2

    .line 107
    .line 108
    invoke-virtual {p1, v7}, Li0/h0;->k(Lfg/a;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_2
    invoke-virtual {p1}, Li0/h0;->n0()V

    .line 113
    .line 114
    .line 115
    :goto_2
    sget-object v7, Lx1/f;->e:Lx1/e;

    .line 116
    .line 117
    invoke-static {v7, p1, p2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    sget-object p2, Lx1/f;->d:Lx1/e;

    .line 121
    .line 122
    invoke-static {p2, p1, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    sget-object v5, Lx1/f;->f:Lx1/e;

    .line 130
    .line 131
    invoke-static {v5, p1, p2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    sget-object p2, Lx1/f;->g:Lx1/d;

    .line 135
    .line 136
    invoke-static {p2, p1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 137
    .line 138
    .line 139
    sget-object p2, Lx1/f;->c:Lx1/e;

    .line 140
    .line 141
    invoke-static {p2, p1, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p2

    .line 148
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    if-nez p2, :cond_3

    .line 153
    .line 154
    if-ne v4, v12, :cond_4

    .line 155
    .line 156
    :cond_3
    new-instance v4, Lh0/d;

    .line 157
    .line 158
    const/4 p2, 0x0

    .line 159
    invoke-direct {v4, v1, p2}, Lh0/d;-><init>(Lh0/l;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    :cond_4
    check-cast v4, Lfg/a;

    .line 166
    .line 167
    const/4 p2, 0x6

    .line 168
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 169
    .line 170
    invoke-static {v1, v4, v0, p1, p2}, Loh/h;->c(Ly0/o;Lfg/a;ZLi0/h0;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, v2}, Li0/h0;->p(Z)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_5
    const p2, 0x42f938

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result p2

    .line 190
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    if-nez p2, :cond_6

    .line 195
    .line 196
    if-ne v2, v12, :cond_7

    .line 197
    .line 198
    :cond_6
    new-instance v2, Lh0/d;

    .line 199
    .line 200
    const/4 p2, 0x1

    .line 201
    invoke-direct {v2, v1, p2}, Lh0/d;-><init>(Lh0/l;I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :cond_7
    check-cast v2, Lfg/a;

    .line 208
    .line 209
    invoke-static {v6, v2, v0, p1, v3}, Loh/h;->c(Ly0/o;Lfg/a;ZLi0/h0;I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 213
    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_8
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 217
    .line 218
    .line 219
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 220
    .line 221
    return-object p1
.end method
