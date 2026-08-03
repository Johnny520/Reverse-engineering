.class public final Lg0/j;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/v;
.implements Lx1/m;
.implements Lx1/z1;


# instance fields
.field public A:I

.field public B:I

.field public C:Ljava/util/List;

.field public D:Lfg/l;

.field public E:Lfg/l;

.field public F:Ljava/util/Map;

.field public G:Lg0/d;

.field public H:Lg0/h;

.field public I:Lg0/i;

.field public u:Li2/g;

.field public v:Li2/n0;

.field public w:Lm2/d;

.field public x:Lfg/l;

.field public y:I

.field public z:Z


# virtual methods
.method public final B(Lx1/h0;)V
    .locals 13

    .line 1
    iget-boolean v0, p0, Ly0/n;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_7

    .line 6
    .line 7
    :cond_0
    iget-object v0, p1, Lx1/h0;->g:Lh1/b;

    .line 8
    .line 9
    iget-object v0, v0, Lh1/b;->h:Lb5/c;

    .line 10
    .line 11
    invoke-virtual {v0}, Lb5/c;->p()Lf1/u;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0, p1}, Lg0/j;->l1(Lu2/c;)Lg0/d;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, v0, Lg0/d;->n:Li2/k0;

    .line 20
    .line 21
    if-eqz v1, :cond_11

    .line 22
    .line 23
    move-object v3, v1

    .line 24
    iget-object v1, v3, Li2/k0;->b:Li2/o;

    .line 25
    .line 26
    invoke-virtual {v3}, Li2/k0;->d()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v8, 0x1

    .line 31
    const/4 v9, 0x0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget v0, p0, Lg0/j;->y:I

    .line 35
    .line 36
    const/4 v4, 0x3

    .line 37
    if-ne v0, v4, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v10, v8

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    :goto_0
    move v10, v9

    .line 43
    :goto_1
    if-eqz v10, :cond_3

    .line 44
    .line 45
    iget-wide v3, v3, Li2/k0;->c:J

    .line 46
    .line 47
    const/16 v0, 0x20

    .line 48
    .line 49
    shr-long v5, v3, v0

    .line 50
    .line 51
    long-to-int v5, v5

    .line 52
    int-to-float v5, v5

    .line 53
    const-wide v6, 0xffffffffL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    and-long/2addr v3, v6

    .line 59
    long-to-int v3, v3

    .line 60
    int-to-float v3, v3

    .line 61
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    int-to-long v4, v4

    .line 66
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    int-to-long v11, v3

    .line 71
    shl-long v3, v4, v0

    .line 72
    .line 73
    and-long v5, v11, v6

    .line 74
    .line 75
    or-long/2addr v3, v5

    .line 76
    const-wide/16 v5, 0x0

    .line 77
    .line 78
    invoke-static {v5, v6, v3, v4}, Lac/p;->a(JJ)Le1/c;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-interface {v2}, Lf1/u;->e()V

    .line 83
    .line 84
    .line 85
    invoke-static {v2, v0}, Lf1/u;->k(Lf1/u;Le1/c;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    :try_start_0
    iget-object v0, p0, Lg0/j;->v:Li2/n0;

    .line 89
    .line 90
    iget-object v0, v0, Li2/n0;->a:Li2/f0;

    .line 91
    .line 92
    iget-object v3, v0, Li2/f0;->m:Lt2/l;

    .line 93
    .line 94
    if-nez v3, :cond_4

    .line 95
    .line 96
    sget-object v3, Lt2/l;->b:Lt2/l;

    .line 97
    .line 98
    :cond_4
    move-object v6, v3

    .line 99
    goto :goto_2

    .line 100
    :catchall_0
    move-exception v0

    .line 101
    move-object p1, v0

    .line 102
    goto/16 :goto_9

    .line 103
    .line 104
    :goto_2
    iget-object v3, v0, Li2/f0;->n:Lf1/q0;

    .line 105
    .line 106
    if-nez v3, :cond_5

    .line 107
    .line 108
    sget-object v3, Lf1/q0;->d:Lf1/q0;

    .line 109
    .line 110
    :cond_5
    move-object v5, v3

    .line 111
    iget-object v3, v0, Li2/f0;->o:Lh1/c;

    .line 112
    .line 113
    if-nez v3, :cond_6

    .line 114
    .line 115
    sget-object v3, Lh1/f;->b:Lh1/f;

    .line 116
    .line 117
    :cond_6
    move-object v7, v3

    .line 118
    iget-object v0, v0, Li2/f0;->a:Lt2/o;

    .line 119
    .line 120
    invoke-interface {v0}, Lt2/o;->c()Lf1/s;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-eqz v3, :cond_7

    .line 125
    .line 126
    iget-object v0, p0, Lg0/j;->v:Li2/n0;

    .line 127
    .line 128
    iget-object v0, v0, Li2/n0;->a:Li2/f0;

    .line 129
    .line 130
    iget-object v0, v0, Li2/f0;->a:Lt2/o;

    .line 131
    .line 132
    invoke-interface {v0}, Lt2/o;->a()F

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    invoke-static/range {v1 .. v7}, Li2/o;->j(Li2/o;Lf1/u;Lf1/s;FLf1/q0;Lt2/l;Lh1/c;)V

    .line 137
    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_7
    sget-wide v3, Lf1/w;->g:J

    .line 141
    .line 142
    const-wide/16 v11, 0x10

    .line 143
    .line 144
    cmp-long v0, v3, v11

    .line 145
    .line 146
    if-eqz v0, :cond_8

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_8
    iget-object v0, p0, Lg0/j;->v:Li2/n0;

    .line 150
    .line 151
    invoke-virtual {v0}, Li2/n0;->a()J

    .line 152
    .line 153
    .line 154
    move-result-wide v3

    .line 155
    cmp-long v0, v3, v11

    .line 156
    .line 157
    if-eqz v0, :cond_9

    .line 158
    .line 159
    iget-object v0, p0, Lg0/j;->v:Li2/n0;

    .line 160
    .line 161
    invoke-virtual {v0}, Li2/n0;->a()J

    .line 162
    .line 163
    .line 164
    move-result-wide v3

    .line 165
    goto :goto_3

    .line 166
    :cond_9
    sget-wide v3, Lf1/w;->b:J

    .line 167
    .line 168
    :goto_3
    invoke-static/range {v1 .. v7}, Li2/o;->i(Li2/o;Lf1/u;JLf1/q0;Lt2/l;Lh1/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    .line 170
    .line 171
    :goto_4
    if-eqz v10, :cond_a

    .line 172
    .line 173
    invoke-interface {v2}, Lf1/u;->p()V

    .line 174
    .line 175
    .line 176
    :cond_a
    iget-object v0, p0, Lg0/j;->I:Lg0/i;

    .line 177
    .line 178
    if-eqz v0, :cond_b

    .line 179
    .line 180
    iget-boolean v0, v0, Lg0/i;->c:Z

    .line 181
    .line 182
    if-ne v0, v8, :cond_b

    .line 183
    .line 184
    move v0, v9

    .line 185
    goto :goto_5

    .line 186
    :cond_b
    iget-object v0, p0, Lg0/j;->u:Li2/g;

    .line 187
    .line 188
    invoke-static {v0}, Lf8/i;->N(Li2/g;)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    :goto_5
    if-nez v0, :cond_f

    .line 193
    .line 194
    iget-object v0, p0, Lg0/j;->C:Ljava/util/List;

    .line 195
    .line 196
    if-eqz v0, :cond_d

    .line 197
    .line 198
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_c

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_c
    move v8, v9

    .line 206
    :cond_d
    :goto_6
    if-nez v8, :cond_e

    .line 207
    .line 208
    goto :goto_8

    .line 209
    :cond_e
    :goto_7
    return-void

    .line 210
    :cond_f
    :goto_8
    invoke-virtual {p1}, Lx1/h0;->e()V

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :goto_9
    if-eqz v10, :cond_10

    .line 215
    .line 216
    invoke-interface {v2}, Lf1/u;->p()V

    .line 217
    .line 218
    .line 219
    :cond_10
    throw p1

    .line 220
    :cond_11
    const-string p1, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: "

    .line 221
    .line 222
    invoke-static {v0, p1}, Lg1/d;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    return-void
.end method

.method public final G(Lx1/n0;Lv1/m0;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lg0/j;->l1(Lu2/c;)Lg0/d;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p1}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p2, p1}, Lg0/d;->e(Lu2/m;)Lbe/k;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lbe/k;->b()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p1}, Lw/s;->n(F)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final K0(Lx1/n0;Lv1/m0;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lg0/j;->l1(Lu2/c;)Lg0/d;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p1}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p2, p3, p1}, Lg0/d;->a(ILu2/m;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final Q(Lx1/n0;Lv1/m0;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lg0/j;->l1(Lu2/c;)Lg0/d;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p1}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p2, p1}, Lg0/d;->e(Lu2/m;)Lbe/k;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lbe/k;->c()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p1}, Lw/s;->n(F)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final R0(Lx1/n0;Lv1/m0;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lg0/j;->l1(Lu2/c;)Lg0/d;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p1}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p2, p3, p1}, Lg0/d;->a(ILu2/m;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final X0(Lf2/y;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lg0/j;->H:Lg0/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lg0/h;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lg0/h;-><init>(Lg0/j;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lg0/j;->H:Lg0/h;

    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lg0/j;->u:Li2/g;

    .line 14
    .line 15
    sget-object v2, Lf2/w;->a:[Lmg/d;

    .line 16
    .line 17
    sget-object v2, Lf2/u;->B:Lf2/x;

    .line 18
    .line 19
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {p1, v2, v1}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lg0/j;->I:Lg0/i;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget-object v2, v1, Lg0/i;->b:Li2/g;

    .line 31
    .line 32
    sget-object v3, Lf2/u;->C:Lf2/x;

    .line 33
    .line 34
    sget-object v4, Lf2/w;->a:[Lmg/d;

    .line 35
    .line 36
    const/16 v5, 0x10

    .line 37
    .line 38
    aget-object v5, v4, v5

    .line 39
    .line 40
    invoke-interface {p1, v3, v2}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-boolean v1, v1, Lg0/i;->c:Z

    .line 44
    .line 45
    sget-object v2, Lf2/u;->D:Lf2/x;

    .line 46
    .line 47
    const/16 v3, 0x11

    .line 48
    .line 49
    aget-object v3, v4, v3

    .line 50
    .line 51
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-interface {p1, v2, v1}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    new-instance v1, Lg0/h;

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    invoke-direct {v1, p0, v2}, Lg0/h;-><init>(Lg0/j;I)V

    .line 62
    .line 63
    .line 64
    sget-object v2, Lf2/l;->l:Lf2/x;

    .line 65
    .line 66
    new-instance v3, Lf2/a;

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    invoke-direct {v3, v4, v1}, Lf2/a;-><init>(Ljava/lang/String;Lsf/b;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, v2, v3}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lg0/h;

    .line 76
    .line 77
    const/4 v2, 0x2

    .line 78
    invoke-direct {v1, p0, v2}, Lg0/h;-><init>(Lg0/j;I)V

    .line 79
    .line 80
    .line 81
    sget-object v2, Lf2/l;->m:Lf2/x;

    .line 82
    .line 83
    new-instance v3, Lf2/a;

    .line 84
    .line 85
    invoke-direct {v3, v4, v1}, Lf2/a;-><init>(Ljava/lang/String;Lsf/b;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p1, v2, v3}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    new-instance v1, Lab/a;

    .line 92
    .line 93
    const/16 v2, 0x15

    .line 94
    .line 95
    invoke-direct {v1, p0, v2}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 96
    .line 97
    .line 98
    sget-object v2, Lf2/l;->n:Lf2/x;

    .line 99
    .line 100
    new-instance v3, Lf2/a;

    .line 101
    .line 102
    invoke-direct {v3, v4, v1}, Lf2/a;-><init>(Ljava/lang/String;Lsf/b;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {p1, v2, v3}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-static {p1, v0}, Lf2/w;->a(Lf2/y;Lfg/l;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final Z0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final j(Lv1/p0;Lv1/m0;J)Lv1/o0;
    .locals 4

    .line 1
    const-string v0, "TextAnnotatedStringNode:measure"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0, p1}, Lg0/j;->l1(Lu2/c;)Lg0/d;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, p3, p4, v1}, Lg0/d;->c(JLu2/m;)Z

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    iget-object p4, v0, Lg0/d;->n:Li2/k0;

    .line 19
    .line 20
    if-eqz p4, :cond_4

    .line 21
    .line 22
    iget-wide v0, p4, Li2/k0;->c:J

    .line 23
    .line 24
    iget-object v2, p4, Li2/k0;->b:Li2/o;

    .line 25
    .line 26
    iget-object v2, v2, Li2/o;->a:Lbe/k;

    .line 27
    .line 28
    invoke-virtual {v2}, Lbe/k;->a()Z

    .line 29
    .line 30
    .line 31
    if-eqz p3, :cond_2

    .line 32
    .line 33
    const/4 p3, 0x2

    .line 34
    invoke-static {p0, p3}, Lx1/k;->t(Lx1/i;I)Lx1/i1;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Lx1/i1;->y1()V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lg0/j;->x:Lfg/l;

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-interface {v2, p4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    :goto_0
    iget-object v2, p0, Lg0/j;->F:Ljava/util/Map;

    .line 52
    .line 53
    if-nez v2, :cond_1

    .line 54
    .line 55
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    invoke-direct {v2, p3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 58
    .line 59
    .line 60
    :cond_1
    sget-object p3, Lv1/c;->a:Lv1/j;

    .line 61
    .line 62
    iget v3, p4, Li2/k0;->d:F

    .line 63
    .line 64
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-interface {v2, p3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    sget-object p3, Lv1/c;->b:Lv1/j;

    .line 76
    .line 77
    iget v3, p4, Li2/k0;->e:F

    .line 78
    .line 79
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-interface {v2, p3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    iput-object v2, p0, Lg0/j;->F:Ljava/util/Map;

    .line 91
    .line 92
    :cond_2
    iget-object p3, p0, Lg0/j;->D:Lfg/l;

    .line 93
    .line 94
    if-eqz p3, :cond_3

    .line 95
    .line 96
    iget-object p4, p4, Li2/k0;->f:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-interface {p3, p4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    :cond_3
    const/16 p3, 0x20

    .line 102
    .line 103
    shr-long p3, v0, p3

    .line 104
    .line 105
    long-to-int p3, p3

    .line 106
    const-wide v2, 0xffffffffL

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    and-long/2addr v0, v2

    .line 112
    long-to-int p4, v0

    .line 113
    invoke-static {p3, p3, p4, p4}, Lf8/i;->u(IIII)J

    .line 114
    .line 115
    .line 116
    move-result-wide v0

    .line 117
    invoke-interface {p2, v0, v1}, Lv1/m0;->Q(J)Lv1/b1;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    iget-object v0, p0, Lg0/j;->F:Ljava/util/Map;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance v1, Lg0/g;

    .line 127
    .line 128
    const/4 v2, 0x0

    .line 129
    invoke-direct {v1, p2, v2}, Lg0/g;-><init>(Lv1/b1;I)V

    .line 130
    .line 131
    .line 132
    invoke-interface {p1, p3, p4, v0, v1}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 133
    .line 134
    .line 135
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 137
    .line 138
    .line 139
    return-object p1

    .line 140
    :cond_4
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 141
    .line 142
    new-instance p2, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string p3, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: "

    .line 145
    .line 146
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 160
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 161
    .line 162
    .line 163
    throw p1
.end method

.method public final k1()Lg0/d;
    .locals 10

    .line 1
    iget-object v0, p0, Lg0/j;->G:Lg0/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lg0/d;

    .line 6
    .line 7
    iget-object v2, p0, Lg0/j;->u:Li2/g;

    .line 8
    .line 9
    iget-object v3, p0, Lg0/j;->v:Li2/n0;

    .line 10
    .line 11
    iget-object v4, p0, Lg0/j;->w:Lm2/d;

    .line 12
    .line 13
    iget v5, p0, Lg0/j;->y:I

    .line 14
    .line 15
    iget-boolean v6, p0, Lg0/j;->z:Z

    .line 16
    .line 17
    iget v7, p0, Lg0/j;->A:I

    .line 18
    .line 19
    iget v8, p0, Lg0/j;->B:I

    .line 20
    .line 21
    iget-object v9, p0, Lg0/j;->C:Ljava/util/List;

    .line 22
    .line 23
    invoke-direct/range {v1 .. v9}, Lg0/d;-><init>(Li2/g;Li2/n0;Lm2/d;IZIILjava/util/List;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lg0/j;->G:Lg0/d;

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lg0/j;->G:Lg0/d;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public final l1(Lu2/c;)Lg0/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lg0/j;->I:Lg0/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, v0, Lg0/i;->c:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lg0/i;->d:Lg0/d;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lg0/d;->d(Lu2/c;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    invoke-virtual {p0}, Lg0/j;->k1()Lg0/d;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Lg0/d;->d(Lu2/c;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method
