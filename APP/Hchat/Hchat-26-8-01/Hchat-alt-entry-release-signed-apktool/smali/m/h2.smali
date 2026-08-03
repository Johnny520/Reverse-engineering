.class public final Lm/h2;
.super Lm/p0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lq1/e;
.implements Lx1/z1;


# instance fields
.field public P:Lk/k1;

.field public Q:Lm/p;

.field public final R:Lr1/d;

.field public final S:Lm/p;

.field public final T:Lm/o2;

.field public final U:Lfd/h;

.field public final V:Ld1/b0;

.field public final W:Lm/k;

.field public X:Lb0/t;

.field public Y:Lm/f2;

.field public Z:Lm/l1;

.field public a0:Lm/d3;


# direct methods
.method public constructor <init>(Lk/k1;Lm/p;Lm/p1;Lm/i2;Ln/k;ZZ)V
    .locals 10

    .line 1
    move/from16 v9, p6

    .line 2
    .line 3
    sget-object v0, Lm/a2;->a:Li2/z;

    .line 4
    .line 5
    invoke-direct {p0, v0, v9, p5, p3}, Lm/p0;-><init>(Lfg/l;ZLn/k;Lm/p1;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lm/h2;->P:Lk/k1;

    .line 9
    .line 10
    iput-object p2, p0, Lm/h2;->Q:Lm/p;

    .line 11
    .line 12
    new-instance v6, Lr1/d;

    .line 13
    .line 14
    invoke-direct {v6}, Lr1/d;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v6, p0, Lm/h2;->R:Lr1/d;

    .line 18
    .line 19
    new-instance v0, Lm/p;

    .line 20
    .line 21
    sget-object v1, Lm/a2;->d:Lm/y1;

    .line 22
    .line 23
    new-instance v2, Landroidx/lifecycle/x;

    .line 24
    .line 25
    invoke-direct {v2, v1}, Landroidx/lifecycle/x;-><init>(Lu2/c;)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Li/u;

    .line 29
    .line 30
    invoke-direct {v1, v2}, Li/u;-><init>(Landroidx/lifecycle/x;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1}, Lm/p;-><init>(Li/u;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lm/h2;->S:Lm/p;

    .line 37
    .line 38
    iget-object v2, p0, Lm/h2;->P:Lk/k1;

    .line 39
    .line 40
    iget-object v1, p0, Lm/h2;->Q:Lm/p;

    .line 41
    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    move-object v3, v0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v3, v1

    .line 47
    :goto_0
    new-instance v0, Lm/o2;

    .line 48
    .line 49
    new-instance v8, Lm/c2;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {v8, p0, v1}, Lm/c2;-><init>(Lm/h2;I)V

    .line 53
    .line 54
    .line 55
    move-object v7, p0

    .line 56
    move-object v4, p3

    .line 57
    move-object v1, p4

    .line 58
    move/from16 v5, p7

    .line 59
    .line 60
    invoke-direct/range {v0 .. v8}, Lm/o2;-><init>(Lm/i2;Lk/k1;Lm/p;Lm/p1;ZLr1/d;Lm/h2;Lm/c2;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lm/h2;->T:Lm/o2;

    .line 64
    .line 65
    new-instance v1, Lfd/h;

    .line 66
    .line 67
    invoke-direct {v1, v0, v9}, Lfd/h;-><init>(Ljava/lang/Object;Z)V

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, Lm/h2;->U:Lfd/h;

    .line 71
    .line 72
    new-instance v2, Ld1/b0;

    .line 73
    .line 74
    const/16 v3, 0xa

    .line 75
    .line 76
    const/4 v5, 0x2

    .line 77
    const/4 v8, 0x0

    .line 78
    invoke-direct {v2, v5, v8, v3}, Ld1/b0;-><init>(ILfg/p;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v2}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 82
    .line 83
    .line 84
    iput-object v2, p0, Lm/h2;->V:Ld1/b0;

    .line 85
    .line 86
    new-instance v2, Lm/k;

    .line 87
    .line 88
    new-instance v3, Lm/c2;

    .line 89
    .line 90
    const/4 v5, 0x1

    .line 91
    invoke-direct {v3, p0, v5}, Lm/c2;-><init>(Lm/h2;I)V

    .line 92
    .line 93
    .line 94
    move/from16 v5, p7

    .line 95
    .line 96
    invoke-direct {v2, p3, v0, v5, v3}, Lm/k;-><init>(Lm/p1;Lm/o2;ZLm/c2;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v2}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 100
    .line 101
    .line 102
    iput-object v2, p0, Lm/h2;->W:Lm/k;

    .line 103
    .line 104
    new-instance v0, Lr1/i;

    .line 105
    .line 106
    invoke-direct {v0, v1, v6}, Lr1/i;-><init>(Lr1/a;Lr1/d;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v0}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 110
    .line 111
    .line 112
    new-instance v0, Lt/h;

    .line 113
    .line 114
    invoke-direct {v0}, Ly0/n;-><init>()V

    .line 115
    .line 116
    .line 117
    iput-object v2, v0, Lt/h;->u:Lm/k;

    .line 118
    .line 119
    invoke-virtual {p0, v0}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 120
    .line 121
    .line 122
    return-void
.end method


# virtual methods
.method public final C(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final C1()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lm/h2;->T:Lm/o2;

    .line 2
    .line 3
    iget-object v1, v0, Lm/o2;->a:Lm/i2;

    .line 4
    .line 5
    invoke-interface {v1}, Lm/i2;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_2

    .line 10
    .line 11
    iget-object v0, v0, Lm/o2;->b:Lk/k1;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Lk/k1;->d()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v1

    .line 22
    :goto_0
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    return v1

    .line 26
    :cond_2
    :goto_1
    const/4 v0, 0x1

    .line 27
    return v0
.end method

.method public final F1(Lk/k1;Lm/p;Lm/p1;Lm/i2;Ln/k;ZZ)V
    .locals 10

    .line 1
    move/from16 v2, p6

    .line 2
    .line 3
    move/from16 v3, p7

    .line 4
    .line 5
    iget-boolean v4, p0, Lm/p0;->y:Z

    .line 6
    .line 7
    const/4 v5, 0x1

    .line 8
    const/4 v6, 0x0

    .line 9
    if-eq v4, v2, :cond_0

    .line 10
    .line 11
    iget-object v4, p0, Lm/h2;->U:Lfd/h;

    .line 12
    .line 13
    iput-boolean v2, v4, Lfd/h;->g:Z

    .line 14
    .line 15
    move v7, v5

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v7, v6

    .line 18
    :goto_0
    if-nez p2, :cond_1

    .line 19
    .line 20
    iget-object v4, p0, Lm/h2;->S:Lm/p;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object v4, p2

    .line 24
    :goto_1
    iget-object v8, p0, Lm/h2;->T:Lm/o2;

    .line 25
    .line 26
    iget-object v9, v8, Lm/o2;->a:Lm/i2;

    .line 27
    .line 28
    invoke-static {v9, p4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    if-nez v9, :cond_2

    .line 33
    .line 34
    iput-object p4, v8, Lm/o2;->a:Lm/i2;

    .line 35
    .line 36
    move v6, v5

    .line 37
    :cond_2
    iput-object p1, v8, Lm/o2;->b:Lk/k1;

    .line 38
    .line 39
    iget-object v1, v8, Lm/o2;->d:Lm/p1;

    .line 40
    .line 41
    if-eq v1, p3, :cond_3

    .line 42
    .line 43
    iput-object p3, v8, Lm/o2;->d:Lm/p1;

    .line 44
    .line 45
    move v6, v5

    .line 46
    :cond_3
    iget-boolean v1, v8, Lm/o2;->e:Z

    .line 47
    .line 48
    if-eq v1, v3, :cond_4

    .line 49
    .line 50
    iput-boolean v3, v8, Lm/o2;->e:Z

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_4
    move v5, v6

    .line 54
    :goto_2
    iput-object v4, v8, Lm/o2;->c:Lm/p;

    .line 55
    .line 56
    iget-object v1, p0, Lm/h2;->R:Lr1/d;

    .line 57
    .line 58
    iput-object v1, v8, Lm/o2;->f:Lr1/d;

    .line 59
    .line 60
    iget-object v1, p0, Lm/h2;->W:Lm/k;

    .line 61
    .line 62
    iput-object p3, v1, Lm/k;->u:Lm/p1;

    .line 63
    .line 64
    iput-boolean v3, v1, Lm/k;->w:Z

    .line 65
    .line 66
    iput-object p1, p0, Lm/h2;->P:Lk/k1;

    .line 67
    .line 68
    iput-object p2, p0, Lm/h2;->Q:Lm/p;

    .line 69
    .line 70
    sget-object v1, Lm/a2;->a:Li2/z;

    .line 71
    .line 72
    iget-object p1, v8, Lm/o2;->d:Lm/p1;

    .line 73
    .line 74
    sget-object p2, Lm/p1;->g:Lm/p1;

    .line 75
    .line 76
    if-ne p1, p2, :cond_5

    .line 77
    .line 78
    :goto_3
    move-object v0, p0

    .line 79
    move-object v4, p2

    .line 80
    move-object v3, p5

    .line 81
    goto :goto_4

    .line 82
    :cond_5
    sget-object p2, Lm/p1;->h:Lm/p1;

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :goto_4
    invoke-virtual/range {v0 .. v5}, Lm/p0;->E1(Lfg/l;ZLn/k;Lm/p1;Z)V

    .line 86
    .line 87
    .line 88
    if-eqz v7, :cond_6

    .line 89
    .line 90
    const/4 p1, 0x0

    .line 91
    iput-object p1, p0, Lm/h2;->X:Lb0/t;

    .line 92
    .line 93
    iput-object p1, p0, Lm/h2;->Y:Lm/f2;

    .line 94
    .line 95
    invoke-static {p0}, Lx1/k;->n(Lx1/z1;)V

    .line 96
    .line 97
    .line 98
    :cond_6
    return-void
.end method

.method public final P(Ls1/k;Ls1/l;J)V
    .locals 19

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    iget-object v10, v8, Ls1/k;->a:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Ls1/t;

    .line 21
    .line 22
    iget-object v4, v2, Lm/p0;->x:Lfg/l;

    .line 23
    .line 24
    iget v3, v3, Ls1/t;->i:I

    .line 25
    .line 26
    new-instance v5, Ls1/d0;

    .line 27
    .line 28
    invoke-direct {v5, v3}, Ls1/d0;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v4, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    invoke-super/range {p0 .. p4}, Lm/p0;->P(Ls1/k;Ls1/l;J)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    iget-object v0, v2, Lm/p0;->A:Lk/l0;

    .line 51
    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    new-instance v0, Lk/l0;

    .line 55
    .line 56
    invoke-direct {v0, v2}, Lk/l0;-><init>(Lk/k0;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v0}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 60
    .line 61
    .line 62
    iput-object v0, v2, Lm/p0;->A:Lk/l0;

    .line 63
    .line 64
    :cond_2
    iget-boolean v0, v2, Lm/p0;->y:Z

    .line 65
    .line 66
    if-eqz v0, :cond_12

    .line 67
    .line 68
    sget-object v13, Ls1/l;->g:Ls1/l;

    .line 69
    .line 70
    const/4 v14, 0x0

    .line 71
    iget-object v15, v2, Lm/h2;->T:Lm/o2;

    .line 72
    .line 73
    const/4 v0, 0x6

    .line 74
    if-ne v9, v13, :cond_4

    .line 75
    .line 76
    iget v1, v8, Ls1/k;->f:I

    .line 77
    .line 78
    if-ne v1, v0, :cond_4

    .line 79
    .line 80
    iget-object v1, v2, Lm/h2;->Z:Lm/l1;

    .line 81
    .line 82
    if-nez v1, :cond_3

    .line 83
    .line 84
    new-instance v1, Lm/l1;

    .line 85
    .line 86
    new-instance v3, Lm/a;

    .line 87
    .line 88
    invoke-static {v2}, Lx1/k;->y(Lx1/i;)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    const/4 v5, 0x0

    .line 101
    invoke-direct {v3, v4, v5}, Lm/a;-><init>(Ljava/lang/Object;I)V

    .line 102
    .line 103
    .line 104
    move v4, v0

    .line 105
    new-instance v0, Lm/d2;

    .line 106
    .line 107
    const/4 v6, 0x4

    .line 108
    const/4 v7, 0x0

    .line 109
    move-object v5, v1

    .line 110
    const/4 v1, 0x2

    .line 111
    move-object/from16 v16, v3

    .line 112
    .line 113
    const-class v3, Lm/h2;

    .line 114
    .line 115
    move/from16 v17, v4

    .line 116
    .line 117
    const-string v4, "onWheelScrollStopped"

    .line 118
    .line 119
    move-object/from16 v18, v5

    .line 120
    .line 121
    const-string v5, "onWheelScrollStopped-TH1AsA0(J)V"

    .line 122
    .line 123
    move-object/from16 v12, v16

    .line 124
    .line 125
    move-object/from16 v11, v18

    .line 126
    .line 127
    invoke-direct/range {v0 .. v7}, Lm/d2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 128
    .line 129
    .line 130
    invoke-static {v2}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    iget-object v1, v1, Lx1/f0;->E:Lu2/c;

    .line 135
    .line 136
    invoke-direct {v11, v15, v12, v0, v1}, Lm/l1;-><init>(Lm/o2;Lm/a;Lm/d2;Lu2/c;)V

    .line 137
    .line 138
    .line 139
    iput-object v11, v2, Lm/h2;->Z:Lm/l1;

    .line 140
    .line 141
    :cond_3
    iget-object v0, v2, Lm/h2;->Z:Lm/l1;

    .line 142
    .line 143
    if-eqz v0, :cond_4

    .line 144
    .line 145
    invoke-virtual {v2}, Ly0/n;->Y0()Lqg/t;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iget-object v3, v0, Lm/l1;->h:Lqg/e1;

    .line 150
    .line 151
    if-nez v3, :cond_4

    .line 152
    .line 153
    new-instance v3, Lci/j;

    .line 154
    .line 155
    const/16 v4, 0x9

    .line 156
    .line 157
    invoke-direct {v3, v0, v14, v4}, Lci/j;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 158
    .line 159
    .line 160
    const/4 v4, 0x3

    .line 161
    invoke-static {v1, v14, v3, v4}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    iput-object v1, v0, Lm/l1;->h:Lqg/e1;

    .line 166
    .line 167
    :cond_4
    iget-object v0, v2, Lm/h2;->Z:Lm/l1;

    .line 168
    .line 169
    sget-object v11, Ls1/l;->h:Ls1/l;

    .line 170
    .line 171
    if-eqz v0, :cond_8

    .line 172
    .line 173
    iget v1, v8, Ls1/k;->f:I

    .line 174
    .line 175
    const/4 v4, 0x6

    .line 176
    if-ne v1, v4, :cond_8

    .line 177
    .line 178
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    const/4 v3, 0x0

    .line 183
    :goto_2
    if-ge v3, v1, :cond_6

    .line 184
    .line 185
    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    check-cast v4, Ls1/t;

    .line 190
    .line 191
    invoke-virtual {v4}, Ls1/t;->b()Z

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-eqz v4, :cond_5

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_6
    if-ne v9, v13, :cond_7

    .line 202
    .line 203
    iget-boolean v1, v0, Lm/o1;->d:Z

    .line 204
    .line 205
    if-eqz v1, :cond_7

    .line 206
    .line 207
    invoke-virtual {v0, v8}, Lm/l1;->f(Ls1/k;)Z

    .line 208
    .line 209
    .line 210
    invoke-static {v8}, Lm/o1;->a(Ls1/k;)V

    .line 211
    .line 212
    .line 213
    :cond_7
    if-ne v9, v11, :cond_8

    .line 214
    .line 215
    iget-boolean v1, v0, Lm/o1;->d:Z

    .line 216
    .line 217
    if-nez v1, :cond_8

    .line 218
    .line 219
    invoke-virtual {v0, v8}, Lm/l1;->f(Ls1/k;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_8

    .line 224
    .line 225
    invoke-static {v8}, Lm/o1;->a(Ls1/k;)V

    .line 226
    .line 227
    .line 228
    :cond_8
    :goto_3
    const/16 v12, 0xc

    .line 229
    .line 230
    const/16 v0, 0xb

    .line 231
    .line 232
    const/16 v1, 0xa

    .line 233
    .line 234
    if-ne v9, v13, :cond_c

    .line 235
    .line 236
    iget v3, v8, Ls1/k;->f:I

    .line 237
    .line 238
    if-ne v3, v1, :cond_9

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_9
    if-ne v3, v0, :cond_a

    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_a
    if-ne v3, v12, :cond_c

    .line 245
    .line 246
    :goto_4
    iget-object v3, v2, Lm/h2;->a0:Lm/d3;

    .line 247
    .line 248
    if-nez v3, :cond_b

    .line 249
    .line 250
    new-instance v3, Lm/d3;

    .line 251
    .line 252
    move v4, v0

    .line 253
    new-instance v0, Lm/d2;

    .line 254
    .line 255
    const/4 v6, 0x4

    .line 256
    const/4 v7, 0x1

    .line 257
    move v5, v1

    .line 258
    const/4 v1, 0x2

    .line 259
    move-object/from16 v16, v3

    .line 260
    .line 261
    const-class v3, Lm/h2;

    .line 262
    .line 263
    move/from16 v17, v4

    .line 264
    .line 265
    const-string v4, "onTrackpadScrollStopped"

    .line 266
    .line 267
    move/from16 v18, v5

    .line 268
    .line 269
    const-string v5, "onTrackpadScrollStopped-TH1AsA0(J)V"

    .line 270
    .line 271
    move-object/from16 v12, v16

    .line 272
    .line 273
    invoke-direct/range {v0 .. v7}, Lm/d2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 274
    .line 275
    .line 276
    invoke-static {v2}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    iget-object v1, v1, Lx1/f0;->E:Lu2/c;

    .line 281
    .line 282
    invoke-direct {v12, v15, v0, v1}, Lm/d3;-><init>(Lm/o2;Lm/d2;Lu2/c;)V

    .line 283
    .line 284
    .line 285
    iput-object v12, v2, Lm/h2;->a0:Lm/d3;

    .line 286
    .line 287
    :cond_b
    iget-object v0, v2, Lm/h2;->a0:Lm/d3;

    .line 288
    .line 289
    if-eqz v0, :cond_c

    .line 290
    .line 291
    invoke-virtual {v2}, Ly0/n;->Y0()Lqg/t;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    iget-object v3, v0, Lm/d3;->g:Lqg/e1;

    .line 296
    .line 297
    if-nez v3, :cond_c

    .line 298
    .line 299
    new-instance v3, Lci/e;

    .line 300
    .line 301
    invoke-direct {v3, v0, v14}, Lci/e;-><init>(Lm/d3;Lwf/c;)V

    .line 302
    .line 303
    .line 304
    const/4 v4, 0x3

    .line 305
    invoke-static {v1, v14, v3, v4}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    iput-object v1, v0, Lm/d3;->g:Lqg/e1;

    .line 310
    .line 311
    :cond_c
    iget-object v0, v2, Lm/h2;->a0:Lm/d3;

    .line 312
    .line 313
    if-eqz v0, :cond_12

    .line 314
    .line 315
    iget v1, v8, Ls1/k;->f:I

    .line 316
    .line 317
    const/16 v5, 0xa

    .line 318
    .line 319
    if-ne v1, v5, :cond_d

    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_d
    const/16 v4, 0xb

    .line 323
    .line 324
    if-ne v1, v4, :cond_e

    .line 325
    .line 326
    goto :goto_5

    .line 327
    :cond_e
    const/16 v3, 0xc

    .line 328
    .line 329
    if-ne v1, v3, :cond_12

    .line 330
    .line 331
    :goto_5
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    const/4 v3, 0x0

    .line 336
    :goto_6
    if-ge v3, v1, :cond_10

    .line 337
    .line 338
    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    check-cast v4, Ls1/t;

    .line 343
    .line 344
    invoke-virtual {v4}, Ls1/t;->b()Z

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    if-eqz v4, :cond_f

    .line 349
    .line 350
    goto :goto_7

    .line 351
    :cond_f
    add-int/lit8 v3, v3, 0x1

    .line 352
    .line 353
    goto :goto_6

    .line 354
    :cond_10
    if-ne v9, v13, :cond_11

    .line 355
    .line 356
    iget-boolean v1, v0, Lm/o1;->d:Z

    .line 357
    .line 358
    if-eqz v1, :cond_11

    .line 359
    .line 360
    invoke-virtual {v0, v8}, Lm/d3;->d(Ls1/k;)Z

    .line 361
    .line 362
    .line 363
    invoke-static {v8}, Lm/o1;->a(Ls1/k;)V

    .line 364
    .line 365
    .line 366
    :cond_11
    if-ne v9, v11, :cond_12

    .line 367
    .line 368
    iget-boolean v1, v0, Lm/o1;->d:Z

    .line 369
    .line 370
    if-nez v1, :cond_12

    .line 371
    .line 372
    invoke-virtual {v0, v8}, Lm/d3;->d(Ls1/k;)Z

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-eqz v0, :cond_12

    .line 377
    .line 378
    invoke-static {v8}, Lm/o1;->a(Ls1/k;)V

    .line 379
    .line 380
    .line 381
    :cond_12
    :goto_7
    return-void
.end method

.method public final W(Landroid/view/KeyEvent;)Z
    .locals 10

    .line 1
    iget-boolean v0, p0, Lm/p0;->y:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    invoke-static {p1}, Lq1/d;->b(Landroid/view/KeyEvent;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    sget-wide v4, Lq1/a;->D:J

    .line 11
    .line 12
    invoke-static {v2, v3, v4, v5}, Lq1/a;->a(JJ)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0}, Lq1/d;->a(I)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    sget-wide v4, Lq1/a;->C:J

    .line 27
    .line 28
    invoke-static {v2, v3, v4, v5}, Lq1/a;->a(JJ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_5

    .line 33
    .line 34
    :cond_0
    invoke-static {p1}, Lq1/d;->c(Landroid/view/KeyEvent;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v2, 0x2

    .line 39
    if-ne v0, v2, :cond_5

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_5

    .line 46
    .line 47
    iget-object v0, p0, Lm/h2;->T:Lm/o2;

    .line 48
    .line 49
    iget-object v0, v0, Lm/o2;->d:Lm/p1;

    .line 50
    .line 51
    sget-object v2, Lm/p1;->g:Lm/p1;

    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    if-ne v0, v2, :cond_1

    .line 55
    .line 56
    move v1, v3

    .line 57
    :cond_1
    const/4 v0, 0x0

    .line 58
    const/16 v2, 0x20

    .line 59
    .line 60
    const-wide v4, 0xffffffffL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    iget-object v6, p0, Lm/h2;->W:Lm/k;

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    invoke-virtual {v6}, Lm/k;->l1()J

    .line 70
    .line 71
    .line 72
    move-result-wide v6

    .line 73
    and-long/2addr v6, v4

    .line 74
    long-to-int v1, v6

    .line 75
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    invoke-static {p1}, Lq1/d;->a(I)J

    .line 80
    .line 81
    .line 82
    move-result-wide v6

    .line 83
    sget-wide v8, Lq1/a;->C:J

    .line 84
    .line 85
    invoke-static {v6, v7, v8, v9}, Lq1/a;->a(JJ)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    int-to-float p1, v1

    .line 92
    goto :goto_0

    .line 93
    :cond_2
    int-to-float p1, v1

    .line 94
    neg-float p1, p1

    .line 95
    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    int-to-long v0, v0

    .line 100
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    int-to-long v6, p1

    .line 105
    shl-long/2addr v0, v2

    .line 106
    and-long/2addr v4, v6

    .line 107
    or-long/2addr v0, v4

    .line 108
    :goto_1
    move-wide v6, v0

    .line 109
    goto :goto_3

    .line 110
    :cond_3
    invoke-virtual {v6}, Lm/k;->l1()J

    .line 111
    .line 112
    .line 113
    move-result-wide v6

    .line 114
    shr-long/2addr v6, v2

    .line 115
    long-to-int v1, v6

    .line 116
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    invoke-static {p1}, Lq1/d;->a(I)J

    .line 121
    .line 122
    .line 123
    move-result-wide v6

    .line 124
    sget-wide v8, Lq1/a;->C:J

    .line 125
    .line 126
    invoke-static {v6, v7, v8, v9}, Lq1/a;->a(JJ)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_4

    .line 131
    .line 132
    int-to-float p1, v1

    .line 133
    goto :goto_2

    .line 134
    :cond_4
    int-to-float p1, v1

    .line 135
    neg-float p1, p1

    .line 136
    :goto_2
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    int-to-long v6, p1

    .line 141
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    int-to-long v0, p1

    .line 146
    shl-long/2addr v6, v2

    .line 147
    and-long/2addr v0, v4

    .line 148
    or-long/2addr v0, v6

    .line 149
    goto :goto_1

    .line 150
    :goto_3
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    new-instance v4, Lm/f2;

    .line 155
    .line 156
    const/4 v9, 0x0

    .line 157
    const/4 v8, 0x0

    .line 158
    move-object v5, p0

    .line 159
    invoke-direct/range {v4 .. v9}, Lm/f2;-><init>(Lm/h2;JLwf/c;I)V

    .line 160
    .line 161
    .line 162
    const/4 v0, 0x3

    .line 163
    invoke-static {p1, v8, v4, v0}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 164
    .line 165
    .line 166
    return v3

    .line 167
    :cond_5
    return v1
.end method

.method public final X0(Lf2/y;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lm/p0;->y:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lm/h2;->X:Lb0/t;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lm/h2;->Y:Lm/f2;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :cond_0
    new-instance v0, Lb0/t;

    .line 15
    .line 16
    const/16 v2, 0xf

    .line 17
    .line 18
    invoke-direct {v0, p0, v2}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lm/h2;->X:Lb0/t;

    .line 22
    .line 23
    new-instance v0, Lm/f2;

    .line 24
    .line 25
    invoke-direct {v0, p0, v1}, Lm/f2;-><init>(Lm/h2;Lwf/c;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lm/h2;->Y:Lm/f2;

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lm/h2;->X:Lb0/t;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    sget-object v2, Lf2/w;->a:[Lmg/d;

    .line 35
    .line 36
    sget-object v2, Lf2/l;->d:Lf2/x;

    .line 37
    .line 38
    new-instance v3, Lf2/a;

    .line 39
    .line 40
    invoke-direct {v3, v1, v0}, Lf2/a;-><init>(Ljava/lang/String;Lsf/b;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v2, v3}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object v0, p0, Lm/h2;->Y:Lm/f2;

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    sget-object v1, Lf2/w;->a:[Lmg/d;

    .line 51
    .line 52
    sget-object v1, Lf2/l;->e:Lf2/x;

    .line 53
    .line 54
    invoke-interface {p1, v1, v0}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_3
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
    .locals 3

    .line 1
    iget-boolean v0, p0, Ly0/n;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lx1/f0;->E:Lu2/c;

    .line 11
    .line 12
    iget-object v1, p0, Lm/h2;->S:Lm/p;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v2, Landroidx/lifecycle/x;

    .line 18
    .line 19
    invoke-direct {v2, v0}, Landroidx/lifecycle/x;-><init>(Lu2/c;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Li/u;

    .line 23
    .line 24
    invoke-direct {v0, v2}, Li/u;-><init>(Landroidx/lifecycle/x;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, v1, Lm/p;->a:Li/u;

    .line 28
    .line 29
    :goto_0
    iget-object v0, p0, Lm/h2;->Z:Lm/l1;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v1, v1, Lx1/f0;->E:Lu2/c;

    .line 38
    .line 39
    iput-object v1, v0, Lm/o1;->c:Lu2/c;

    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, Lm/h2;->a0:Lm/d3;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v1, v1, Lx1/f0;->E:Lu2/c;

    .line 50
    .line 51
    iput-object v1, v0, Lm/o1;->c:Lu2/c;

    .line 52
    .line 53
    :cond_2
    return-void
.end method

.method public final m()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lm/p0;->b0()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Ly0/n;->t:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, Lx1/f0;->E:Lu2/c;

    .line 14
    .line 15
    iget-object v1, p0, Lm/h2;->S:Lm/p;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v2, Landroidx/lifecycle/x;

    .line 21
    .line 22
    invoke-direct {v2, v0}, Landroidx/lifecycle/x;-><init>(Lu2/c;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Li/u;

    .line 26
    .line 27
    invoke-direct {v0, v2}, Li/u;-><init>(Landroidx/lifecycle/x;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, v1, Lm/p;->a:Li/u;

    .line 31
    .line 32
    :goto_0
    iget-object v0, p0, Lm/h2;->Z:Lm/l1;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v1, v1, Lx1/f0;->E:Lu2/c;

    .line 41
    .line 42
    iput-object v1, v0, Lm/o1;->c:Lu2/c;

    .line 43
    .line 44
    :cond_1
    iget-object v0, p0, Lm/h2;->a0:Lm/d3;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v1, v1, Lx1/f0;->E:Lu2/c;

    .line 53
    .line 54
    iput-object v1, v0, Lm/o1;->c:Lu2/c;

    .line 55
    .line 56
    :cond_2
    return-void
.end method

.method public final r1(Lm/o0;Lm/o0;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lc0/m;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0xd

    .line 5
    .line 6
    iget-object v3, p0, Lm/h2;->T:Lm/o2;

    .line 7
    .line 8
    invoke-direct {v0, p1, v3, v1, v2}, Lc0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lk/d1;->h:Lk/d1;

    .line 12
    .line 13
    invoke-virtual {v3, p1, v0, p2}, Lm/o2;->f(Lk/d1;Lfg/p;Lyf/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 18
    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 23
    .line 24
    return-object p1
.end method

.method public final w1(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final x1(Lm/a0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lm/h2;->R:Lr1/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr1/d;->e()Lqg/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lci/j;

    .line 8
    .line 9
    const/16 v2, 0xc

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v1, p1, p0, v3, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x3

    .line 16
    invoke-static {v0, v3, v1, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 17
    .line 18
    .line 19
    return-void
.end method
