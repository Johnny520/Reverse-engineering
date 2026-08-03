.class public final Li4/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li4/k;


# instance fields
.field public g:I

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;


# virtual methods
.method public a(IILw4/c;)V
    .locals 2

    .line 1
    const/16 v0, 0x6c

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq p1, v0, :cond_3

    .line 5
    .line 6
    const/16 v0, 0x70

    .line 7
    .line 8
    if-eq p1, v0, :cond_3

    .line 9
    .line 10
    const/16 p3, 0xac

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    if-eq p1, p3, :cond_2

    .line 14
    .line 15
    const/16 p3, 0xb1

    .line 16
    .line 17
    if-eq p1, p3, :cond_2

    .line 18
    .line 19
    const/16 p3, 0xbe

    .line 20
    .line 21
    if-eq p1, p3, :cond_1

    .line 22
    .line 23
    const/16 p3, 0xbf

    .line 24
    .line 25
    if-eq p1, p3, :cond_0

    .line 26
    .line 27
    const/16 p3, 0xc2

    .line 28
    .line 29
    if-eq p1, p3, :cond_1

    .line 30
    .line 31
    const/16 p3, 0xc3

    .line 32
    .line 33
    if-eq p1, p3, :cond_1

    .line 34
    .line 35
    packed-switch p1, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    packed-switch p1, :pswitch_data_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p2, v1, v1}, Li4/a;->k(IIZ)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    invoke-virtual {p0, p2, v1, v0}, Li4/a;->k(IIZ)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p2, v1, v0}, Li4/a;->l(IIZ)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    :pswitch_0
    invoke-virtual {p0, p2, v1, v1}, Li4/a;->k(IIZ)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p2, v1, v1}, Li4/a;->l(IIZ)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    invoke-virtual {p0, p2, v1, v0}, Li4/a;->k(IIZ)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Li4/a;->l:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, [Lz4/g;

    .line 65
    .line 66
    sget-object p3, Lz4/g;->k:Lz4/g;

    .line 67
    .line 68
    aput-object p3, p1, p2

    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    invoke-virtual {p0, p2, v1, v1}, Li4/a;->k(IIZ)V

    .line 72
    .line 73
    .line 74
    sget-object p1, Lw4/c;->t:Lw4/c;

    .line 75
    .line 76
    if-eq p3, p1, :cond_5

    .line 77
    .line 78
    sget-object p1, Lw4/c;->u:Lw4/c;

    .line 79
    .line 80
    if-ne p3, p1, :cond_4

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    return-void

    .line 84
    :cond_5
    :goto_0
    invoke-virtual {p0, p2, v1, v1}, Li4/a;->l(IIZ)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x2e
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    :pswitch_data_1
    .packed-switch 0x4f
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public b(IIILv4/a;I)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p2, p3, p1}, Li4/a;->k(IIZ)V

    .line 3
    .line 4
    .line 5
    instance-of p5, p4, Lv4/w;

    .line 6
    .line 7
    if-nez p5, :cond_1

    .line 8
    .line 9
    instance-of p5, p4, Lv4/d0;

    .line 10
    .line 11
    if-nez p5, :cond_1

    .line 12
    .line 13
    instance-of p5, p4, Lv4/c0;

    .line 14
    .line 15
    if-nez p5, :cond_1

    .line 16
    .line 17
    instance-of p5, p4, Lv4/q;

    .line 18
    .line 19
    if-nez p5, :cond_1

    .line 20
    .line 21
    instance-of p5, p4, Lv4/x;

    .line 22
    .line 23
    if-nez p5, :cond_1

    .line 24
    .line 25
    instance-of p4, p4, Lv4/a0;

    .line 26
    .line 27
    if-eqz p4, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void

    .line 31
    :cond_1
    :goto_0
    invoke-virtual {p0, p2, p3, p1}, Li4/a;->l(IIZ)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public c(IILv4/d0;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    const/4 p3, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Li4/a;->k(IIZ)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Li4/a;->l(IIZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(II)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p2, p1, p1}, Li4/a;->k(IIZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public e(IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    invoke-static {v0, p1}, Lx6/d;->z([II)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Li4/a;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, [I

    .line 14
    .line 15
    invoke-static {v0, p1}, Lx6/d;->g0([II)V

    .line 16
    .line 17
    .line 18
    :cond_0
    if-eqz p2, :cond_1

    .line 19
    .line 20
    iget-object p2, p0, Li4/a;->k:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p2, [I

    .line 23
    .line 24
    invoke-static {p2, p1}, Lx6/d;->g0([II)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Li4/a;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public g(IILi4/n;I)V
    .locals 2

    .line 1
    const/4 p4, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, p4}, Li4/a;->k(IIZ)V

    .line 3
    .line 4
    .line 5
    iget-object p2, p3, Li4/n;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p2, Lz4/g;

    .line 8
    .line 9
    iget v0, p3, Li4/n;->i:I

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Lz4/g;->n(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {p0, v0, v1}, Li4/a;->e(IZ)V

    .line 17
    .line 18
    .line 19
    iget p3, p3, Li4/n;->i:I

    .line 20
    .line 21
    :goto_0
    if-ge p4, p3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2, p4}, Lz4/g;->n(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0, v0, v1}, Li4/a;->e(IZ)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 p4, p4, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object p3, p0, Li4/a;->l:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p3, [Lz4/g;

    .line 36
    .line 37
    aput-object p2, p3, p1

    .line 38
    .line 39
    return-void
.end method

.method public h(IIII)V
    .locals 4

    .line 1
    iget-object v0, p0, Li4/a;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Lz4/g;

    .line 4
    .line 5
    const/16 v1, 0xa7

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eq p1, v1, :cond_1

    .line 10
    .line 11
    const/16 v1, 0xa8

    .line 12
    .line 13
    if-eq p1, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0, p2, v3}, Li4/a;->e(IZ)V

    .line 17
    .line 18
    .line 19
    :goto_0
    add-int p1, p2, p3

    .line 20
    .line 21
    invoke-virtual {p0, p2, p3, v3}, Li4/a;->k(IIZ)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, v3}, Li4/a;->e(IZ)V

    .line 25
    .line 26
    .line 27
    new-instance p3, Lz4/g;

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    invoke-direct {p3, v1}, Lz4/g;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3, p1}, Lz4/g;->l(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3, p4}, Lz4/g;->l(I)V

    .line 37
    .line 38
    .line 39
    iput-boolean v2, p3, Lz4/j;->g:Z

    .line 40
    .line 41
    aput-object p3, v0, p2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p0, p2, p3, v2}, Li4/a;->k(IIZ)V

    .line 45
    .line 46
    .line 47
    invoke-static {p4}, Lz4/g;->o(I)Lz4/g;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    aput-object p1, v0, p2

    .line 52
    .line 53
    :goto_1
    invoke-virtual {p0, p4, v3}, Li4/a;->e(IZ)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public i(IIIILw4/c;I)V
    .locals 0

    .line 1
    const/16 p4, 0xa9

    .line 2
    .line 3
    if-ne p1, p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p2, p3, p1}, Li4/a;->k(IIZ)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Li4/a;->l:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, [Lz4/g;

    .line 12
    .line 13
    sget-object p3, Lz4/g;->k:Lz4/g;

    .line 14
    .line 15
    aput-object p3, p1, p2

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const/4 p1, 0x1

    .line 19
    invoke-virtual {p0, p2, p3, p1}, Li4/a;->k(IIZ)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public j()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Li4/a;->m:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lp4/i;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v1, v0, Li4/a;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lp4/u;

    .line 13
    .line 14
    iget v2, v1, Lp4/u;->b:I

    .line 15
    .line 16
    iget v3, v1, Lp4/u;->f:I

    .line 17
    .line 18
    if-gez v3, :cond_56

    .line 19
    .line 20
    iget-object v3, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    new-array v4, v3, [Lp4/j;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    move v6, v5

    .line 30
    :goto_0
    if-ge v6, v3, :cond_1

    .line 31
    .line 32
    iget-object v7, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    check-cast v7, Lp4/h;

    .line 39
    .line 40
    iget-object v7, v7, Lp4/h;->b:Lp4/j;

    .line 41
    .line 42
    aput-object v7, v4, v6

    .line 43
    .line 44
    add-int/lit8 v6, v6, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v1, v4}, Lp4/u;->f([Lp4/j;)Z

    .line 48
    .line 49
    .line 50
    iget-object v3, v1, Lp4/u;->a:Ln4/a;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget v3, v1, Lp4/u;->h:I

    .line 56
    .line 57
    :cond_2
    iget v6, v1, Lp4/u;->f:I

    .line 58
    .line 59
    add-int/2addr v6, v2

    .line 60
    iget v7, v1, Lp4/u;->g:I

    .line 61
    .line 62
    add-int/2addr v6, v7

    .line 63
    sub-int/2addr v6, v3

    .line 64
    iget-object v7, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    move v8, v5

    .line 71
    move v9, v8

    .line 72
    move v10, v9

    .line 73
    move v11, v10

    .line 74
    :cond_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v12

    .line 78
    if-eqz v12, :cond_9

    .line 79
    .line 80
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v12

    .line 84
    check-cast v12, Lp4/h;

    .line 85
    .line 86
    iget-object v12, v12, Lp4/h;->d:Lu4/p;

    .line 87
    .line 88
    move v14, v5

    .line 89
    :goto_1
    iget-object v15, v12, Lz4/e;->h:[Ljava/lang/Object;

    .line 90
    .line 91
    array-length v15, v15

    .line 92
    if-ge v14, v15, :cond_3

    .line 93
    .line 94
    invoke-virtual {v12, v14}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v15

    .line 98
    check-cast v15, Lu4/o;

    .line 99
    .line 100
    const/16 v16, 0x1

    .line 101
    .line 102
    iget-object v13, v15, Lu4/o;->h:Lw4/d;

    .line 103
    .line 104
    invoke-interface {v13}, Lw4/d;->getType()Lw4/c;

    .line 105
    .line 106
    .line 107
    move-result-object v13

    .line 108
    invoke-virtual {v13}, Lw4/c;->r()Z

    .line 109
    .line 110
    .line 111
    move-result v13

    .line 112
    if-eqz v13, :cond_8

    .line 113
    .line 114
    iget v13, v15, Lu4/o;->g:I

    .line 115
    .line 116
    if-lt v13, v6, :cond_4

    .line 117
    .line 118
    move/from16 v15, v16

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    move v15, v5

    .line 122
    :goto_2
    and-int/lit8 v13, v13, 0x1

    .line 123
    .line 124
    if-nez v13, :cond_6

    .line 125
    .line 126
    if-eqz v15, :cond_5

    .line 127
    .line 128
    add-int/lit8 v9, v9, 0x1

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_5
    add-int/lit8 v11, v11, 0x1

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_6
    if-eqz v15, :cond_7

    .line 135
    .line 136
    add-int/lit8 v8, v8, 0x1

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_7
    add-int/lit8 v10, v10, 0x1

    .line 140
    .line 141
    :cond_8
    :goto_3
    add-int/lit8 v14, v14, 0x1

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_9
    const/16 v16, 0x1

    .line 145
    .line 146
    if-le v8, v9, :cond_a

    .line 147
    .line 148
    if-le v10, v11, :cond_a

    .line 149
    .line 150
    invoke-virtual {v1}, Lp4/u;->c()V

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_a
    if-le v8, v9, :cond_b

    .line 155
    .line 156
    invoke-virtual {v1}, Lp4/u;->b()V

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_b
    if-le v10, v11, :cond_d

    .line 161
    .line 162
    invoke-virtual {v1}, Lp4/u;->c()V

    .line 163
    .line 164
    .line 165
    if-eqz v3, :cond_c

    .line 166
    .line 167
    if-le v9, v8, :cond_c

    .line 168
    .line 169
    invoke-virtual {v1}, Lp4/u;->b()V

    .line 170
    .line 171
    .line 172
    :cond_c
    :goto_4
    invoke-virtual {v1, v4}, Lp4/u;->f([Lp4/j;)Z

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    if-nez v6, :cond_2

    .line 177
    .line 178
    :cond_d
    iget v3, v1, Lp4/u;->f:I

    .line 179
    .line 180
    iget-object v6, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 181
    .line 182
    if-nez v3, :cond_10

    .line 183
    .line 184
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    move v6, v5

    .line 189
    :goto_5
    if-ge v6, v3, :cond_f

    .line 190
    .line 191
    iget-object v8, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    check-cast v8, Lp4/h;

    .line 198
    .line 199
    iget-object v9, v8, Lp4/h;->b:Lp4/j;

    .line 200
    .line 201
    aget-object v10, v4, v6

    .line 202
    .line 203
    if-eq v9, v10, :cond_e

    .line 204
    .line 205
    iget-object v9, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-virtual {v8, v10}, Lp4/h;->i(Lp4/j;)Lp4/h;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    invoke-virtual {v9, v6, v8}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    :cond_e
    add-int/lit8 v6, v6, 0x1

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_f
    move/from16 v18, v2

    .line 218
    .line 219
    goto/16 :goto_f

    .line 220
    .line 221
    :cond_10
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    new-instance v6, Ljava/util/ArrayList;

    .line 226
    .line 227
    mul-int/lit8 v8, v3, 0x2

    .line 228
    .line 229
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 230
    .line 231
    .line 232
    new-instance v8, Ljava/util/ArrayList;

    .line 233
    .line 234
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 235
    .line 236
    .line 237
    move v9, v5

    .line 238
    :goto_6
    if-ge v9, v3, :cond_20

    .line 239
    .line 240
    iget-object v10, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v10

    .line 246
    check-cast v10, Lp4/h;

    .line 247
    .line 248
    iget-object v11, v10, Lp4/h;->b:Lp4/j;

    .line 249
    .line 250
    iget-object v12, v10, Lp4/h;->c:Lu4/t;

    .line 251
    .line 252
    iget-object v13, v10, Lp4/h;->d:Lu4/p;

    .line 253
    .line 254
    aget-object v14, v4, v9

    .line 255
    .line 256
    if-eqz v14, :cond_11

    .line 257
    .line 258
    move/from16 v18, v2

    .line 259
    .line 260
    move/from16 v19, v3

    .line 261
    .line 262
    move-object/from16 v20, v4

    .line 263
    .line 264
    move/from16 v21, v9

    .line 265
    .line 266
    const/4 v3, 0x0

    .line 267
    const/4 v4, 0x0

    .line 268
    goto/16 :goto_c

    .line 269
    .line 270
    :cond_11
    invoke-virtual {v1, v10}, Lp4/u;->d(Lp4/h;)Lp4/j;

    .line 271
    .line 272
    .line 273
    move-result-object v14

    .line 274
    iget-object v15, v14, Lp4/j;->d:Lf8/i;

    .line 275
    .line 276
    invoke-virtual {v15, v10}, Lf8/i;->m(Lp4/h;)Ljava/util/BitSet;

    .line 277
    .line 278
    .line 279
    move-result-object v15

    .line 280
    invoke-virtual {v15, v5}, Ljava/util/BitSet;->get(I)Z

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    move/from16 v18, v2

    .line 285
    .line 286
    iget-boolean v2, v11, Lp4/j;->e:Z

    .line 287
    .line 288
    if-eqz v2, :cond_12

    .line 289
    .line 290
    invoke-virtual {v15, v5}, Ljava/util/BitSet;->set(I)V

    .line 291
    .line 292
    .line 293
    :cond_12
    iget-object v5, v13, Lz4/e;->h:[Ljava/lang/Object;

    .line 294
    .line 295
    array-length v5, v5

    .line 296
    invoke-virtual {v15}, Ljava/util/BitSet;->cardinality()I

    .line 297
    .line 298
    .line 299
    move-result v19

    .line 300
    sub-int v5, v5, v19

    .line 301
    .line 302
    if-nez v5, :cond_13

    .line 303
    .line 304
    sget-object v5, Lu4/p;->i:Lu4/p;

    .line 305
    .line 306
    move/from16 v19, v3

    .line 307
    .line 308
    move-object/from16 v20, v4

    .line 309
    .line 310
    move/from16 v21, v9

    .line 311
    .line 312
    const/4 v4, 0x0

    .line 313
    goto :goto_9

    .line 314
    :cond_13
    move/from16 v19, v3

    .line 315
    .line 316
    new-instance v3, Lu4/p;

    .line 317
    .line 318
    invoke-direct {v3, v5}, Lz4/e;-><init>(I)V

    .line 319
    .line 320
    .line 321
    move-object/from16 v20, v4

    .line 322
    .line 323
    move/from16 v21, v9

    .line 324
    .line 325
    const/4 v4, 0x0

    .line 326
    const/4 v5, 0x0

    .line 327
    :goto_7
    iget-object v9, v13, Lz4/e;->h:[Ljava/lang/Object;

    .line 328
    .line 329
    array-length v9, v9

    .line 330
    if-ge v5, v9, :cond_15

    .line 331
    .line 332
    invoke-virtual {v15, v5}, Ljava/util/BitSet;->get(I)Z

    .line 333
    .line 334
    .line 335
    move-result v9

    .line 336
    if-nez v9, :cond_14

    .line 337
    .line 338
    invoke-virtual {v13, v5}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    invoke-virtual {v3, v4, v9}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    add-int/lit8 v4, v4, 0x1

    .line 346
    .line 347
    :cond_14
    add-int/lit8 v5, v5, 0x1

    .line 348
    .line 349
    goto :goto_7

    .line 350
    :cond_15
    iget-boolean v4, v13, Lz4/j;->g:Z

    .line 351
    .line 352
    if-nez v4, :cond_16

    .line 353
    .line 354
    const/4 v4, 0x0

    .line 355
    iput-boolean v4, v3, Lz4/j;->g:Z

    .line 356
    .line 357
    :goto_8
    move-object v5, v3

    .line 358
    goto :goto_9

    .line 359
    :cond_16
    const/4 v4, 0x0

    .line 360
    goto :goto_8

    .line 361
    :goto_9
    if-eqz v2, :cond_17

    .line 362
    .line 363
    invoke-virtual {v15, v4, v7}, Ljava/util/BitSet;->set(IZ)V

    .line 364
    .line 365
    .line 366
    :cond_17
    iget-object v3, v5, Lz4/e;->h:[Ljava/lang/Object;

    .line 367
    .line 368
    array-length v3, v3

    .line 369
    if-nez v3, :cond_18

    .line 370
    .line 371
    const/4 v3, 0x0

    .line 372
    goto :goto_a

    .line 373
    :cond_18
    new-instance v3, Lp4/m;

    .line 374
    .line 375
    invoke-direct {v3, v12, v5}, Lp4/m;-><init>(Lu4/t;Lu4/p;)V

    .line 376
    .line 377
    .line 378
    :goto_a
    if-eqz v2, :cond_19

    .line 379
    .line 380
    invoke-virtual {v15, v4}, Ljava/util/BitSet;->get(I)Z

    .line 381
    .line 382
    .line 383
    move-result v5

    .line 384
    if-nez v5, :cond_19

    .line 385
    .line 386
    invoke-virtual {v13, v4}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    check-cast v5, Lu4/o;

    .line 391
    .line 392
    invoke-virtual {v5, v4}, Lu4/o;->o(I)Lu4/o;

    .line 393
    .line 394
    .line 395
    move-result-object v7

    .line 396
    invoke-static {v12, v5, v7}, Lp4/h;->h(Lu4/t;Lu4/o;Lu4/o;)Lp4/z;

    .line 397
    .line 398
    .line 399
    move-result-object v4

    .line 400
    goto :goto_b

    .line 401
    :cond_19
    const/4 v4, 0x0

    .line 402
    :goto_b
    invoke-virtual {v13, v2, v15}, Lu4/p;->r(ZLjava/util/BitSet;)Lu4/p;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    invoke-virtual {v10, v2}, Lp4/h;->k(Lu4/p;)Lp4/h;

    .line 407
    .line 408
    .line 409
    move-result-object v10

    .line 410
    :goto_c
    instance-of v2, v10, Lp4/f;

    .line 411
    .line 412
    if-eqz v2, :cond_1a

    .line 413
    .line 414
    move-object v2, v10

    .line 415
    check-cast v2, Lp4/f;

    .line 416
    .line 417
    iget-boolean v5, v2, Lp4/f;->e:Z

    .line 418
    .line 419
    if-eqz v5, :cond_1a

    .line 420
    .line 421
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    goto :goto_e

    .line 425
    :cond_1a
    if-eqz v3, :cond_1b

    .line 426
    .line 427
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    :cond_1b
    instance-of v2, v10, Lp4/c0;

    .line 431
    .line 432
    if-nez v2, :cond_1d

    .line 433
    .line 434
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 435
    .line 436
    .line 437
    move-result v2

    .line 438
    if-lez v2, :cond_1d

    .line 439
    .line 440
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 441
    .line 442
    .line 443
    move-result-object v2

    .line 444
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    if-eqz v3, :cond_1c

    .line 449
    .line 450
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    check-cast v3, Lp4/f;

    .line 455
    .line 456
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    goto :goto_d

    .line 460
    :cond_1c
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 461
    .line 462
    .line 463
    :cond_1d
    if-eq v14, v11, :cond_1e

    .line 464
    .line 465
    invoke-virtual {v10, v14}, Lp4/h;->i(Lp4/j;)Lp4/h;

    .line 466
    .line 467
    .line 468
    move-result-object v10

    .line 469
    :cond_1e
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    if-eqz v4, :cond_1f

    .line 473
    .line 474
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    :cond_1f
    :goto_e
    add-int/lit8 v9, v21, 0x1

    .line 478
    .line 479
    move/from16 v2, v18

    .line 480
    .line 481
    move/from16 v3, v19

    .line 482
    .line 483
    move-object/from16 v4, v20

    .line 484
    .line 485
    const/4 v5, 0x0

    .line 486
    goto/16 :goto_6

    .line 487
    .line 488
    :cond_20
    move/from16 v18, v2

    .line 489
    .line 490
    iput-object v6, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 491
    .line 492
    :cond_21
    :goto_f
    iget-object v2, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 493
    .line 494
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 495
    .line 496
    .line 497
    move-result v2

    .line 498
    const/4 v3, 0x0

    .line 499
    const/4 v4, 0x0

    .line 500
    :goto_10
    iget-object v5, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 501
    .line 502
    if-ge v3, v2, :cond_23

    .line 503
    .line 504
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v5

    .line 508
    check-cast v5, Lp4/h;

    .line 509
    .line 510
    if-ltz v4, :cond_22

    .line 511
    .line 512
    iput v4, v5, Lp4/h;->a:I

    .line 513
    .line 514
    invoke-virtual {v5}, Lp4/h;->b()I

    .line 515
    .line 516
    .line 517
    move-result v5

    .line 518
    add-int/2addr v4, v5

    .line 519
    add-int/lit8 v3, v3, 0x1

    .line 520
    .line 521
    goto :goto_10

    .line 522
    :cond_22
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    const-string v1, "address < 0"

    .line 526
    .line 527
    invoke-static {v1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    return-void

    .line 531
    :cond_23
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 532
    .line 533
    .line 534
    move-result v2

    .line 535
    const/4 v3, 0x0

    .line 536
    const/4 v4, 0x0

    .line 537
    :goto_11
    if-ge v4, v2, :cond_28

    .line 538
    .line 539
    iget-object v5, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 540
    .line 541
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v5

    .line 545
    check-cast v5, Lp4/h;

    .line 546
    .line 547
    instance-of v6, v5, Lp4/b0;

    .line 548
    .line 549
    if-nez v6, :cond_24

    .line 550
    .line 551
    goto :goto_13

    .line 552
    :cond_24
    iget-object v6, v5, Lp4/h;->b:Lp4/j;

    .line 553
    .line 554
    move-object v7, v5

    .line 555
    check-cast v7, Lp4/b0;

    .line 556
    .line 557
    iget-object v8, v6, Lp4/j;->d:Lf8/i;

    .line 558
    .line 559
    invoke-virtual {v8, v7}, Lf8/i;->f(Lp4/b0;)Z

    .line 560
    .line 561
    .line 562
    move-result v8

    .line 563
    if-eqz v8, :cond_25

    .line 564
    .line 565
    goto :goto_13

    .line 566
    :cond_25
    iget v3, v6, Lp4/j;->b:I

    .line 567
    .line 568
    const/16 v8, 0x28

    .line 569
    .line 570
    if-ne v3, v8, :cond_27

    .line 571
    .line 572
    invoke-virtual {v1, v5, v6}, Lp4/u;->e(Lp4/h;Lp4/j;)Lp4/j;

    .line 573
    .line 574
    .line 575
    move-result-object v3

    .line 576
    if-eqz v3, :cond_26

    .line 577
    .line 578
    iget-object v6, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 579
    .line 580
    invoke-virtual {v5, v3}, Lp4/h;->i(Lp4/j;)Lp4/h;

    .line 581
    .line 582
    .line 583
    move-result-object v3

    .line 584
    invoke-virtual {v6, v4, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    goto :goto_12

    .line 588
    :cond_26
    const-string v1, "method too long"

    .line 589
    .line 590
    invoke-static {v1}, Lj8/o;->w(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    return-void

    .line 594
    :cond_27
    :try_start_0
    iget-object v3, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 595
    .line 596
    add-int/lit8 v5, v4, 0x1

    .line 597
    .line 598
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v3

    .line 602
    check-cast v3, Lp4/f;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 603
    .line 604
    new-instance v6, Lp4/b0;

    .line 605
    .line 606
    sget-object v8, Lp4/k;->I:Lp4/j;

    .line 607
    .line 608
    iget-object v9, v7, Lp4/h;->c:Lu4/t;

    .line 609
    .line 610
    sget-object v10, Lu4/p;->i:Lu4/p;

    .line 611
    .line 612
    iget-object v11, v7, Lp4/b0;->f:Lp4/f;

    .line 613
    .line 614
    invoke-direct {v6, v8, v9, v10, v11}, Lp4/b0;-><init>(Lp4/j;Lu4/t;Lu4/p;Lp4/f;)V

    .line 615
    .line 616
    .line 617
    iget-object v8, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 618
    .line 619
    invoke-virtual {v8, v4, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    iget-object v6, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 623
    .line 624
    invoke-virtual {v7, v3}, Lp4/b0;->o(Lp4/f;)Lp4/b0;

    .line 625
    .line 626
    .line 627
    move-result-object v3

    .line 628
    invoke-virtual {v6, v4, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 629
    .line 630
    .line 631
    add-int/lit8 v2, v2, 0x1

    .line 632
    .line 633
    move v4, v5

    .line 634
    :goto_12
    move/from16 v3, v16

    .line 635
    .line 636
    :goto_13
    add-int/lit8 v4, v4, 0x1

    .line 637
    .line 638
    goto :goto_11

    .line 639
    :catch_0
    const-string v1, "unpaired TargetInsn"

    .line 640
    .line 641
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    return-void

    .line 645
    :catch_1
    const-string v1, "unpaired TargetInsn (dangling)"

    .line 646
    .line 647
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    return-void

    .line 651
    :cond_28
    if-nez v3, :cond_21

    .line 652
    .line 653
    iget-object v2, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 654
    .line 655
    iget v3, v1, Lp4/u;->f:I

    .line 656
    .line 657
    add-int v3, v3, v18

    .line 658
    .line 659
    iget v1, v1, Lp4/u;->g:I

    .line 660
    .line 661
    add-int/2addr v3, v1

    .line 662
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 663
    .line 664
    .line 665
    move-result v1

    .line 666
    new-instance v4, Lp4/i;

    .line 667
    .line 668
    invoke-direct {v4, v1, v3}, Lp4/i;-><init>(II)V

    .line 669
    .line 670
    .line 671
    const/4 v3, 0x0

    .line 672
    :goto_14
    if-ge v3, v1, :cond_29

    .line 673
    .line 674
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v5

    .line 678
    check-cast v5, Lp4/h;

    .line 679
    .line 680
    invoke-virtual {v4, v3, v5}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 681
    .line 682
    .line 683
    add-int/lit8 v3, v3, 0x1

    .line 684
    .line 685
    goto :goto_14

    .line 686
    :cond_29
    const/4 v3, 0x0

    .line 687
    iput-boolean v3, v4, Lz4/j;->g:Z

    .line 688
    .line 689
    iput-object v4, v0, Li4/a;->m:Ljava/lang/Object;

    .line 690
    .line 691
    iget v1, v0, Li4/a;->g:I

    .line 692
    .line 693
    sget-object v2, Lp4/w;->i:Lp4/w;

    .line 694
    .line 695
    const/4 v2, 0x3

    .line 696
    move/from16 v3, v16

    .line 697
    .line 698
    if-eq v1, v3, :cond_32

    .line 699
    .line 700
    const/4 v3, 0x2

    .line 701
    if-eq v1, v3, :cond_2b

    .line 702
    .line 703
    if-ne v1, v2, :cond_2a

    .line 704
    .line 705
    goto :goto_15

    .line 706
    :cond_2a
    const-string v1, "bogus howMuch"

    .line 707
    .line 708
    invoke-static {v1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    return-void

    .line 712
    :cond_2b
    :goto_15
    sget-object v3, Lu4/t;->d:Lu4/t;

    .line 713
    .line 714
    iget-object v5, v4, Lz4/e;->h:[Ljava/lang/Object;

    .line 715
    .line 716
    array-length v5, v5

    .line 717
    new-array v6, v5, [Lp4/v;

    .line 718
    .line 719
    move-object v10, v3

    .line 720
    const/4 v7, 0x0

    .line 721
    const/4 v8, 0x0

    .line 722
    const/4 v9, 0x0

    .line 723
    :goto_16
    if-ge v8, v5, :cond_30

    .line 724
    .line 725
    invoke-virtual {v4, v8}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v11

    .line 729
    check-cast v11, Lp4/h;

    .line 730
    .line 731
    instance-of v12, v11, Lp4/f;

    .line 732
    .line 733
    if-eqz v12, :cond_2c

    .line 734
    .line 735
    const/4 v7, 0x1

    .line 736
    goto :goto_17

    .line 737
    :cond_2c
    iget-object v12, v11, Lp4/h;->c:Lu4/t;

    .line 738
    .line 739
    invoke-virtual {v12, v3}, Lu4/t;->equals(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    move-result v13

    .line 743
    if-nez v13, :cond_2f

    .line 744
    .line 745
    iget v13, v12, Lu4/t;->c:I

    .line 746
    .line 747
    iget v14, v10, Lu4/t;->c:I

    .line 748
    .line 749
    if-ne v13, v14, :cond_2d

    .line 750
    .line 751
    goto :goto_17

    .line 752
    :cond_2d
    if-ne v1, v2, :cond_2e

    .line 753
    .line 754
    if-nez v7, :cond_2e

    .line 755
    .line 756
    goto :goto_17

    .line 757
    :cond_2e
    new-instance v7, Lp4/v;

    .line 758
    .line 759
    invoke-virtual {v11}, Lp4/h;->e()I

    .line 760
    .line 761
    .line 762
    move-result v10

    .line 763
    invoke-direct {v7, v10, v12}, Lp4/v;-><init>(ILu4/t;)V

    .line 764
    .line 765
    .line 766
    aput-object v7, v6, v9

    .line 767
    .line 768
    add-int/lit8 v9, v9, 0x1

    .line 769
    .line 770
    move-object v10, v12

    .line 771
    const/4 v7, 0x0

    .line 772
    :cond_2f
    :goto_17
    add-int/lit8 v8, v8, 0x1

    .line 773
    .line 774
    goto :goto_16

    .line 775
    :cond_30
    new-instance v1, Lp4/w;

    .line 776
    .line 777
    invoke-direct {v1, v9}, Lz4/e;-><init>(I)V

    .line 778
    .line 779
    .line 780
    const/4 v3, 0x0

    .line 781
    :goto_18
    if-ge v3, v9, :cond_31

    .line 782
    .line 783
    aget-object v4, v6, v3

    .line 784
    .line 785
    invoke-virtual {v1, v3, v4}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 786
    .line 787
    .line 788
    add-int/lit8 v3, v3, 0x1

    .line 789
    .line 790
    goto :goto_18

    .line 791
    :cond_31
    const/4 v3, 0x0

    .line 792
    iput-boolean v3, v1, Lz4/j;->g:Z

    .line 793
    .line 794
    goto :goto_19

    .line 795
    :cond_32
    sget-object v1, Lp4/w;->i:Lp4/w;

    .line 796
    .line 797
    :goto_19
    iput-object v1, v0, Li4/a;->k:Ljava/lang/Object;

    .line 798
    .line 799
    iget-object v1, v0, Li4/a;->m:Ljava/lang/Object;

    .line 800
    .line 801
    check-cast v1, Lp4/i;

    .line 802
    .line 803
    sget-object v3, Lp4/o;->i:Lp4/o;

    .line 804
    .line 805
    iget-object v3, v1, Lz4/e;->h:[Ljava/lang/Object;

    .line 806
    .line 807
    array-length v3, v3

    .line 808
    new-instance v4, Lf1/h;

    .line 809
    .line 810
    invoke-direct {v4, v3}, Lf1/h;-><init>(I)V

    .line 811
    .line 812
    .line 813
    const/4 v5, 0x0

    .line 814
    :goto_1a
    const/4 v6, -0x1

    .line 815
    iget-object v7, v4, Lf1/h;->i:Ljava/lang/Object;

    .line 816
    .line 817
    if-ge v5, v3, :cond_40

    .line 818
    .line 819
    invoke-virtual {v1, v5}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v8

    .line 823
    check-cast v8, Lp4/h;

    .line 824
    .line 825
    instance-of v9, v8, Lp4/p;

    .line 826
    .line 827
    if-nez v9, :cond_3f

    .line 828
    .line 829
    instance-of v9, v8, Lp4/q;

    .line 830
    .line 831
    if-eqz v9, :cond_3e

    .line 832
    .line 833
    invoke-virtual {v8}, Lp4/h;->e()I

    .line 834
    .line 835
    .line 836
    move-result v8

    .line 837
    check-cast v7, Ljava/util/ArrayList;

    .line 838
    .line 839
    const/4 v9, 0x0

    .line 840
    iget v10, v9, Lu4/o;->g:I

    .line 841
    .line 842
    invoke-static {v9}, Lf1/h;->n(Lu4/o;)Lu4/o;

    .line 843
    .line 844
    .line 845
    move-result-object v11

    .line 846
    invoke-virtual {v4, v8, v10}, Lf1/h;->e(II)V

    .line 847
    .line 848
    .line 849
    iget-object v9, v4, Lf1/h;->j:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast v9, Lu4/q;

    .line 852
    .line 853
    invoke-virtual {v9, v10}, Lu4/q;->l(I)Lu4/o;

    .line 854
    .line 855
    .line 856
    move-result-object v9

    .line 857
    invoke-virtual {v11, v9}, Lu4/o;->i(Lu4/o;)Z

    .line 858
    .line 859
    .line 860
    move-result v12

    .line 861
    if-eqz v12, :cond_33

    .line 862
    .line 863
    goto/16 :goto_20

    .line 864
    .line 865
    :cond_33
    iget-object v12, v4, Lf1/h;->j:Ljava/lang/Object;

    .line 866
    .line 867
    check-cast v12, Lu4/q;

    .line 868
    .line 869
    iget-object v12, v12, Lu4/q;->h:[Lu4/o;

    .line 870
    .line 871
    array-length v13, v12

    .line 872
    const/4 v14, 0x0

    .line 873
    :goto_1b
    if-ge v14, v13, :cond_36

    .line 874
    .line 875
    aget-object v15, v12, v14

    .line 876
    .line 877
    if-nez v15, :cond_34

    .line 878
    .line 879
    goto :goto_1c

    .line 880
    :cond_34
    invoke-virtual {v11, v15}, Lu4/o;->l(Lu4/o;)Z

    .line 881
    .line 882
    .line 883
    move-result v18

    .line 884
    if-eqz v18, :cond_35

    .line 885
    .line 886
    goto :goto_1d

    .line 887
    :cond_35
    :goto_1c
    add-int/lit8 v14, v14, 0x1

    .line 888
    .line 889
    goto :goto_1b

    .line 890
    :cond_36
    const/4 v15, 0x0

    .line 891
    :goto_1d
    if-eqz v15, :cond_37

    .line 892
    .line 893
    const/4 v12, 0x4

    .line 894
    invoke-virtual {v4, v8, v12, v15}, Lf1/h;->k(IILu4/o;)V

    .line 895
    .line 896
    .line 897
    :cond_37
    iget-object v12, v4, Lf1/h;->k:Ljava/lang/Object;

    .line 898
    .line 899
    check-cast v12, [I

    .line 900
    .line 901
    aget v12, v12, v10

    .line 902
    .line 903
    if-eqz v9, :cond_38

    .line 904
    .line 905
    invoke-virtual {v4, v8, v2, v9}, Lf1/h;->j(IILu4/o;)V

    .line 906
    .line 907
    .line 908
    goto :goto_1f

    .line 909
    :cond_38
    if-ltz v12, :cond_3b

    .line 910
    .line 911
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object v9

    .line 915
    check-cast v9, Lp4/n;

    .line 916
    .line 917
    iget v13, v9, Lp4/n;->g:I

    .line 918
    .line 919
    iget-object v14, v9, Lp4/n;->i:Lu4/o;

    .line 920
    .line 921
    if-ne v13, v8, :cond_3b

    .line 922
    .line 923
    invoke-virtual {v14, v11}, Lu4/o;->i(Lu4/o;)Z

    .line 924
    .line 925
    .line 926
    move-result v13

    .line 927
    if-eqz v13, :cond_39

    .line 928
    .line 929
    const/4 v13, 0x0

    .line 930
    invoke-virtual {v7, v12, v13}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    iget v7, v4, Lf1/h;->h:I

    .line 934
    .line 935
    const/16 v16, 0x1

    .line 936
    .line 937
    add-int/lit8 v7, v7, 0x1

    .line 938
    .line 939
    iput v7, v4, Lf1/h;->h:I

    .line 940
    .line 941
    iget-object v7, v4, Lf1/h;->j:Ljava/lang/Object;

    .line 942
    .line 943
    check-cast v7, Lu4/q;

    .line 944
    .line 945
    invoke-virtual {v7, v11}, Lu4/q;->m(Lu4/o;)V

    .line 946
    .line 947
    .line 948
    iget-object v7, v4, Lf1/h;->k:Ljava/lang/Object;

    .line 949
    .line 950
    check-cast v7, [I

    .line 951
    .line 952
    aput v6, v7, v10

    .line 953
    .line 954
    goto :goto_20

    .line 955
    :cond_39
    iget v6, v9, Lp4/n;->h:I

    .line 956
    .line 957
    if-ne v2, v6, :cond_3a

    .line 958
    .line 959
    goto :goto_1e

    .line 960
    :cond_3a
    new-instance v6, Lp4/n;

    .line 961
    .line 962
    iget v9, v9, Lp4/n;->g:I

    .line 963
    .line 964
    invoke-direct {v6, v9, v2, v14}, Lp4/n;-><init>(IILu4/o;)V

    .line 965
    .line 966
    .line 967
    move-object v9, v6

    .line 968
    :goto_1e
    invoke-virtual {v7, v12, v9}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 969
    .line 970
    .line 971
    :cond_3b
    :goto_1f
    if-lez v10, :cond_3c

    .line 972
    .line 973
    iget-object v6, v4, Lf1/h;->j:Ljava/lang/Object;

    .line 974
    .line 975
    check-cast v6, Lu4/q;

    .line 976
    .line 977
    add-int/lit8 v7, v10, -0x1

    .line 978
    .line 979
    invoke-virtual {v6, v7}, Lu4/q;->l(I)Lu4/o;

    .line 980
    .line 981
    .line 982
    move-result-object v6

    .line 983
    if-eqz v6, :cond_3c

    .line 984
    .line 985
    iget-object v7, v6, Lu4/o;->h:Lw4/d;

    .line 986
    .line 987
    invoke-interface {v7}, Lw4/d;->getType()Lw4/c;

    .line 988
    .line 989
    .line 990
    move-result-object v7

    .line 991
    invoke-virtual {v7}, Lw4/c;->r()Z

    .line 992
    .line 993
    .line 994
    move-result v7

    .line 995
    if-eqz v7, :cond_3c

    .line 996
    .line 997
    const/4 v7, 0x6

    .line 998
    invoke-virtual {v4, v8, v7, v6}, Lf1/h;->k(IILu4/o;)V

    .line 999
    .line 1000
    .line 1001
    :cond_3c
    iget-object v6, v11, Lu4/o;->h:Lw4/d;

    .line 1002
    .line 1003
    invoke-interface {v6}, Lw4/d;->getType()Lw4/c;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v6

    .line 1007
    invoke-virtual {v6}, Lw4/c;->r()Z

    .line 1008
    .line 1009
    .line 1010
    move-result v6

    .line 1011
    if-eqz v6, :cond_3d

    .line 1012
    .line 1013
    iget-object v6, v4, Lf1/h;->j:Ljava/lang/Object;

    .line 1014
    .line 1015
    check-cast v6, Lu4/q;

    .line 1016
    .line 1017
    add-int/lit8 v10, v10, 0x1

    .line 1018
    .line 1019
    invoke-virtual {v6, v10}, Lu4/q;->l(I)Lu4/o;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v6

    .line 1023
    if-eqz v6, :cond_3d

    .line 1024
    .line 1025
    const/4 v7, 0x5

    .line 1026
    invoke-virtual {v4, v8, v7, v6}, Lf1/h;->k(IILu4/o;)V

    .line 1027
    .line 1028
    .line 1029
    :cond_3d
    const/4 v6, 0x1

    .line 1030
    invoke-virtual {v4, v8, v6, v11}, Lf1/h;->j(IILu4/o;)V

    .line 1031
    .line 1032
    .line 1033
    goto :goto_21

    .line 1034
    :cond_3e
    :goto_20
    const/4 v6, 0x1

    .line 1035
    :goto_21
    add-int/lit8 v5, v5, 0x1

    .line 1036
    .line 1037
    goto/16 :goto_1a

    .line 1038
    .line 1039
    :cond_3f
    invoke-virtual {v8}, Lp4/h;->e()I

    .line 1040
    .line 1041
    .line 1042
    const/16 v17, 0x0

    .line 1043
    .line 1044
    throw v17

    .line 1045
    :cond_40
    const v1, 0x7fffffff

    .line 1046
    .line 1047
    .line 1048
    const/4 v3, 0x0

    .line 1049
    invoke-virtual {v4, v1, v3}, Lf1/h;->e(II)V

    .line 1050
    .line 1051
    .line 1052
    check-cast v7, Ljava/util/ArrayList;

    .line 1053
    .line 1054
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1055
    .line 1056
    .line 1057
    move-result v1

    .line 1058
    iget v2, v4, Lf1/h;->h:I

    .line 1059
    .line 1060
    sub-int v2, v1, v2

    .line 1061
    .line 1062
    if-nez v2, :cond_41

    .line 1063
    .line 1064
    sget-object v1, Lp4/o;->i:Lp4/o;

    .line 1065
    .line 1066
    goto :goto_25

    .line 1067
    :cond_41
    new-array v3, v2, [Lp4/n;

    .line 1068
    .line 1069
    if-ne v1, v2, :cond_42

    .line 1070
    .line 1071
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    goto :goto_23

    .line 1075
    :cond_42
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v1

    .line 1079
    const/4 v4, 0x0

    .line 1080
    :cond_43
    :goto_22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1081
    .line 1082
    .line 1083
    move-result v5

    .line 1084
    if-eqz v5, :cond_44

    .line 1085
    .line 1086
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v5

    .line 1090
    check-cast v5, Lp4/n;

    .line 1091
    .line 1092
    if-eqz v5, :cond_43

    .line 1093
    .line 1094
    add-int/lit8 v7, v4, 0x1

    .line 1095
    .line 1096
    aput-object v5, v3, v4

    .line 1097
    .line 1098
    move v4, v7

    .line 1099
    goto :goto_22

    .line 1100
    :cond_44
    :goto_23
    invoke-static {v3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 1101
    .line 1102
    .line 1103
    new-instance v1, Lp4/o;

    .line 1104
    .line 1105
    invoke-direct {v1, v2}, Lz4/e;-><init>(I)V

    .line 1106
    .line 1107
    .line 1108
    const/4 v4, 0x0

    .line 1109
    :goto_24
    if-ge v4, v2, :cond_45

    .line 1110
    .line 1111
    aget-object v5, v3, v4

    .line 1112
    .line 1113
    invoke-virtual {v1, v4, v5}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 1114
    .line 1115
    .line 1116
    add-int/lit8 v4, v4, 0x1

    .line 1117
    .line 1118
    goto :goto_24

    .line 1119
    :cond_45
    const/4 v4, 0x0

    .line 1120
    iput-boolean v4, v1, Lz4/j;->g:Z

    .line 1121
    .line 1122
    :goto_25
    iput-object v1, v0, Li4/a;->l:Ljava/lang/Object;

    .line 1123
    .line 1124
    iget-object v1, v0, Li4/a;->i:Ljava/lang/Object;

    .line 1125
    .line 1126
    check-cast v1, Lb5/c;

    .line 1127
    .line 1128
    iget-object v2, v1, Lb5/c;->a:Ljava/lang/Object;

    .line 1129
    .line 1130
    check-cast v2, Lf1/h;

    .line 1131
    .line 1132
    iget-object v3, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 1133
    .line 1134
    check-cast v3, [I

    .line 1135
    .line 1136
    iget-object v1, v1, Lb5/c;->c:Ljava/lang/Object;

    .line 1137
    .line 1138
    check-cast v1, Lb5/c;

    .line 1139
    .line 1140
    array-length v4, v3

    .line 1141
    iget-object v2, v2, Lf1/h;->i:Ljava/lang/Object;

    .line 1142
    .line 1143
    check-cast v2, Lu4/c;

    .line 1144
    .line 1145
    new-instance v5, Ljava/util/ArrayList;

    .line 1146
    .line 1147
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1148
    .line 1149
    .line 1150
    sget-object v7, Lp4/c;->i:Lp4/c;

    .line 1151
    .line 1152
    move-object v8, v7

    .line 1153
    const/4 v7, 0x0

    .line 1154
    const/4 v9, 0x0

    .line 1155
    const/4 v10, 0x0

    .line 1156
    :goto_26
    if-ge v7, v4, :cond_52

    .line 1157
    .line 1158
    aget v11, v3, v7

    .line 1159
    .line 1160
    invoke-virtual {v2, v11}, Lu4/c;->s(I)Lu4/b;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v11

    .line 1164
    iget-object v12, v11, Lu4/b;->b:Lh4/u;

    .line 1165
    .line 1166
    invoke-virtual {v12}, Lh4/u;->p()Lu4/i;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v13

    .line 1170
    iget-object v13, v13, Lu4/i;->g:Lu4/r;

    .line 1171
    .line 1172
    invoke-virtual {v13}, Lu4/r;->a()Z

    .line 1173
    .line 1174
    .line 1175
    move-result v13

    .line 1176
    if-nez v13, :cond_46

    .line 1177
    .line 1178
    move-object/from16 v18, v2

    .line 1179
    .line 1180
    move-object/from16 v19, v3

    .line 1181
    .line 1182
    move/from16 v20, v4

    .line 1183
    .line 1184
    goto/16 :goto_2d

    .line 1185
    .line 1186
    :cond_46
    iget-object v13, v11, Lu4/b;->c:Lz4/g;

    .line 1187
    .line 1188
    iget v14, v13, Lz4/g;->i:I

    .line 1189
    .line 1190
    iget v15, v11, Lu4/b;->d:I

    .line 1191
    .line 1192
    invoke-virtual {v12}, Lh4/u;->p()Lu4/i;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v12

    .line 1196
    invoke-virtual {v12}, Lu4/i;->e()Lw4/e;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v12

    .line 1200
    invoke-interface {v12}, Lw4/e;->size()I

    .line 1201
    .line 1202
    .line 1203
    move-result v6

    .line 1204
    if-nez v6, :cond_47

    .line 1205
    .line 1206
    sget-object v6, Lp4/c;->i:Lp4/c;

    .line 1207
    .line 1208
    move-object/from16 v18, v2

    .line 1209
    .line 1210
    move-object/from16 v19, v3

    .line 1211
    .line 1212
    move/from16 v20, v4

    .line 1213
    .line 1214
    goto/16 :goto_2b

    .line 1215
    .line 1216
    :cond_47
    move-object/from16 v18, v2

    .line 1217
    .line 1218
    const/4 v2, -0x1

    .line 1219
    if-ne v15, v2, :cond_48

    .line 1220
    .line 1221
    if-ne v14, v6, :cond_49

    .line 1222
    .line 1223
    :cond_48
    if-eq v15, v2, :cond_4a

    .line 1224
    .line 1225
    add-int/lit8 v2, v6, 0x1

    .line 1226
    .line 1227
    if-ne v14, v2, :cond_49

    .line 1228
    .line 1229
    invoke-virtual {v13, v6}, Lz4/g;->n(I)I

    .line 1230
    .line 1231
    .line 1232
    move-result v2

    .line 1233
    if-ne v15, v2, :cond_49

    .line 1234
    .line 1235
    goto :goto_27

    .line 1236
    :cond_49
    const-string v1, "shouldn\'t happen: weird successors list"

    .line 1237
    .line 1238
    invoke-static {v1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 1239
    .line 1240
    .line 1241
    return-void

    .line 1242
    :cond_4a
    :goto_27
    const/4 v2, 0x0

    .line 1243
    :goto_28
    if-ge v2, v6, :cond_4c

    .line 1244
    .line 1245
    invoke-interface {v12, v2}, Lw4/e;->getType(I)Lw4/c;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v14

    .line 1249
    sget-object v15, Lw4/c;->E:Lw4/c;

    .line 1250
    .line 1251
    invoke-virtual {v14, v15}, Lw4/c;->equals(Ljava/lang/Object;)Z

    .line 1252
    .line 1253
    .line 1254
    move-result v14

    .line 1255
    if-eqz v14, :cond_4b

    .line 1256
    .line 1257
    add-int/lit8 v6, v2, 0x1

    .line 1258
    .line 1259
    goto :goto_29

    .line 1260
    :cond_4b
    add-int/lit8 v2, v2, 0x1

    .line 1261
    .line 1262
    goto :goto_28

    .line 1263
    :cond_4c
    :goto_29
    new-instance v2, Lp4/c;

    .line 1264
    .line 1265
    invoke-direct {v2, v6}, Lz4/e;-><init>(I)V

    .line 1266
    .line 1267
    .line 1268
    const/4 v14, 0x0

    .line 1269
    :goto_2a
    if-ge v14, v6, :cond_4d

    .line 1270
    .line 1271
    new-instance v15, Lv4/d0;

    .line 1272
    .line 1273
    move-object/from16 v19, v3

    .line 1274
    .line 1275
    invoke-interface {v12, v14}, Lw4/e;->getType(I)Lw4/c;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v3

    .line 1279
    invoke-direct {v15, v3}, Lv4/d0;-><init>(Lw4/c;)V

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual {v13, v14}, Lz4/g;->n(I)I

    .line 1283
    .line 1284
    .line 1285
    move-result v3

    .line 1286
    move/from16 v20, v3

    .line 1287
    .line 1288
    iget-object v3, v1, Lb5/c;->a:Ljava/lang/Object;

    .line 1289
    .line 1290
    check-cast v3, [Lp4/f;

    .line 1291
    .line 1292
    aget-object v3, v3, v20

    .line 1293
    .line 1294
    invoke-virtual {v3}, Lp4/h;->e()I

    .line 1295
    .line 1296
    .line 1297
    move-result v3

    .line 1298
    move/from16 v20, v4

    .line 1299
    .line 1300
    new-instance v4, Lp4/b;

    .line 1301
    .line 1302
    invoke-direct {v4, v15, v3}, Lp4/b;-><init>(Lv4/d0;I)V

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual {v2, v14, v4}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 1306
    .line 1307
    .line 1308
    add-int/lit8 v14, v14, 0x1

    .line 1309
    .line 1310
    move-object/from16 v3, v19

    .line 1311
    .line 1312
    move/from16 v4, v20

    .line 1313
    .line 1314
    goto :goto_2a

    .line 1315
    :cond_4d
    move-object/from16 v19, v3

    .line 1316
    .line 1317
    move/from16 v20, v4

    .line 1318
    .line 1319
    const/4 v3, 0x0

    .line 1320
    iput-boolean v3, v2, Lz4/j;->g:Z

    .line 1321
    .line 1322
    move-object v6, v2

    .line 1323
    :goto_2b
    iget-object v2, v8, Lz4/e;->h:[Ljava/lang/Object;

    .line 1324
    .line 1325
    array-length v2, v2

    .line 1326
    if-nez v2, :cond_4e

    .line 1327
    .line 1328
    goto :goto_2c

    .line 1329
    :cond_4e
    invoke-virtual {v8, v6}, Lz4/e;->equals(Ljava/lang/Object;)Z

    .line 1330
    .line 1331
    .line 1332
    move-result v2

    .line 1333
    if-eqz v2, :cond_50

    .line 1334
    .line 1335
    if-eqz v9, :cond_4f

    .line 1336
    .line 1337
    iget-object v2, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 1338
    .line 1339
    check-cast v2, [Lp4/f;

    .line 1340
    .line 1341
    iget v3, v9, Lu4/b;->a:I

    .line 1342
    .line 1343
    aget-object v2, v2, v3

    .line 1344
    .line 1345
    invoke-virtual {v2}, Lp4/h;->e()I

    .line 1346
    .line 1347
    .line 1348
    move-result v2

    .line 1349
    iget-object v3, v1, Lb5/c;->c:Ljava/lang/Object;

    .line 1350
    .line 1351
    check-cast v3, [Lp4/f;

    .line 1352
    .line 1353
    iget v4, v11, Lu4/b;->a:I

    .line 1354
    .line 1355
    aget-object v3, v3, v4

    .line 1356
    .line 1357
    invoke-virtual {v3}, Lp4/h;->e()I

    .line 1358
    .line 1359
    .line 1360
    move-result v3

    .line 1361
    sub-int/2addr v3, v2

    .line 1362
    const v2, 0xffff

    .line 1363
    .line 1364
    .line 1365
    if-gt v3, v2, :cond_50

    .line 1366
    .line 1367
    move-object v10, v11

    .line 1368
    goto :goto_2d

    .line 1369
    :cond_4f
    const-string v1, "start == null"

    .line 1370
    .line 1371
    invoke-static {v1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 1372
    .line 1373
    .line 1374
    return-void

    .line 1375
    :cond_50
    iget-object v2, v8, Lz4/e;->h:[Ljava/lang/Object;

    .line 1376
    .line 1377
    array-length v2, v2

    .line 1378
    if-eqz v2, :cond_51

    .line 1379
    .line 1380
    iget-object v2, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 1381
    .line 1382
    check-cast v2, [Lp4/f;

    .line 1383
    .line 1384
    iget v3, v9, Lu4/b;->a:I

    .line 1385
    .line 1386
    aget-object v2, v2, v3

    .line 1387
    .line 1388
    iget-object v3, v1, Lb5/c;->c:Ljava/lang/Object;

    .line 1389
    .line 1390
    check-cast v3, [Lp4/f;

    .line 1391
    .line 1392
    iget v4, v10, Lu4/b;->a:I

    .line 1393
    .line 1394
    aget-object v3, v3, v4

    .line 1395
    .line 1396
    new-instance v4, Lp4/d;

    .line 1397
    .line 1398
    invoke-virtual {v2}, Lp4/h;->e()I

    .line 1399
    .line 1400
    .line 1401
    move-result v2

    .line 1402
    invoke-virtual {v3}, Lp4/h;->e()I

    .line 1403
    .line 1404
    .line 1405
    move-result v3

    .line 1406
    invoke-direct {v4, v2, v3, v8}, Lp4/d;-><init>(IILp4/c;)V

    .line 1407
    .line 1408
    .line 1409
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1410
    .line 1411
    .line 1412
    :cond_51
    :goto_2c
    move-object v8, v6

    .line 1413
    move-object v9, v11

    .line 1414
    move-object v10, v9

    .line 1415
    :goto_2d
    add-int/lit8 v7, v7, 0x1

    .line 1416
    .line 1417
    move-object/from16 v2, v18

    .line 1418
    .line 1419
    move-object/from16 v3, v19

    .line 1420
    .line 1421
    move/from16 v4, v20

    .line 1422
    .line 1423
    const/4 v6, -0x1

    .line 1424
    goto/16 :goto_26

    .line 1425
    .line 1426
    :cond_52
    iget-object v2, v8, Lz4/e;->h:[Ljava/lang/Object;

    .line 1427
    .line 1428
    array-length v2, v2

    .line 1429
    if-eqz v2, :cond_53

    .line 1430
    .line 1431
    iget-object v2, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 1432
    .line 1433
    check-cast v2, [Lp4/f;

    .line 1434
    .line 1435
    iget v3, v9, Lu4/b;->a:I

    .line 1436
    .line 1437
    aget-object v2, v2, v3

    .line 1438
    .line 1439
    iget-object v1, v1, Lb5/c;->c:Ljava/lang/Object;

    .line 1440
    .line 1441
    check-cast v1, [Lp4/f;

    .line 1442
    .line 1443
    iget v3, v10, Lu4/b;->a:I

    .line 1444
    .line 1445
    aget-object v1, v1, v3

    .line 1446
    .line 1447
    new-instance v3, Lp4/d;

    .line 1448
    .line 1449
    invoke-virtual {v2}, Lp4/h;->e()I

    .line 1450
    .line 1451
    .line 1452
    move-result v2

    .line 1453
    invoke-virtual {v1}, Lp4/h;->e()I

    .line 1454
    .line 1455
    .line 1456
    move-result v1

    .line 1457
    invoke-direct {v3, v2, v1, v8}, Lp4/d;-><init>(IILp4/c;)V

    .line 1458
    .line 1459
    .line 1460
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1461
    .line 1462
    .line 1463
    :cond_53
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1464
    .line 1465
    .line 1466
    move-result v1

    .line 1467
    if-nez v1, :cond_54

    .line 1468
    .line 1469
    sget-object v1, Lp4/e;->i:Lp4/e;

    .line 1470
    .line 1471
    goto :goto_2f

    .line 1472
    :cond_54
    new-instance v2, Lp4/e;

    .line 1473
    .line 1474
    invoke-direct {v2, v1}, Lz4/e;-><init>(I)V

    .line 1475
    .line 1476
    .line 1477
    const/4 v4, 0x0

    .line 1478
    :goto_2e
    if-ge v4, v1, :cond_55

    .line 1479
    .line 1480
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v3

    .line 1484
    check-cast v3, Lp4/d;

    .line 1485
    .line 1486
    invoke-virtual {v2, v4, v3}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 1487
    .line 1488
    .line 1489
    add-int/lit8 v4, v4, 0x1

    .line 1490
    .line 1491
    goto :goto_2e

    .line 1492
    :cond_55
    const/4 v3, 0x0

    .line 1493
    iput-boolean v3, v2, Lz4/j;->g:Z

    .line 1494
    .line 1495
    move-object v1, v2

    .line 1496
    :goto_2f
    iput-object v1, v0, Li4/a;->j:Ljava/lang/Object;

    .line 1497
    .line 1498
    const/4 v9, 0x0

    .line 1499
    iput-object v9, v0, Li4/a;->h:Ljava/lang/Object;

    .line 1500
    .line 1501
    iput-object v9, v0, Li4/a;->i:Ljava/lang/Object;

    .line 1502
    .line 1503
    return-void

    .line 1504
    :cond_56
    const-string v1, "already processed"

    .line 1505
    .line 1506
    invoke-static {v1}, Lj8/o;->w(Ljava/lang/String;)V

    .line 1507
    .line 1508
    .line 1509
    return-void
.end method

.method public k(IIZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    invoke-static {v0, p1}, Lx6/d;->g0([II)V

    .line 6
    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    add-int/2addr p1, p2

    .line 11
    const/4 p2, 0x0

    .line 12
    invoke-virtual {p0, p1, p2}, Li4/a;->e(IZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object p3, p0, Li4/a;->k:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p3, [I

    .line 19
    .line 20
    add-int/2addr p1, p2

    .line 21
    invoke-static {p3, p1}, Lx6/d;->g0([II)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public l(IIZ)V
    .locals 12

    .line 1
    add-int/2addr p2, p1

    .line 2
    const/4 v0, 0x1

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p2, v0}, Li4/a;->e(IZ)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v1, p0, Li4/a;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Li4/m;

    .line 11
    .line 12
    iget-object v1, v1, Li4/m;->c:Lh4/c;

    .line 13
    .line 14
    iget-object v1, v1, Lh4/c;->e:Li4/g;

    .line 15
    .line 16
    iget-object v2, v1, Lz4/e;->h:[Ljava/lang/Object;

    .line 17
    .line 18
    array-length v2, v2

    .line 19
    new-array v3, v2, [Li4/f;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    move v5, v4

    .line 23
    move v6, v5

    .line 24
    :goto_0
    if-ge v5, v2, :cond_6

    .line 25
    .line 26
    invoke-virtual {v1, v5}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    check-cast v7, Li4/f;

    .line 31
    .line 32
    iget v8, v7, Li4/f;->a:I

    .line 33
    .line 34
    if-lt p1, v8, :cond_5

    .line 35
    .line 36
    iget v8, v7, Li4/f;->b:I

    .line 37
    .line 38
    if-ge p1, v8, :cond_5

    .line 39
    .line 40
    iget-object v8, v7, Li4/f;->d:Lv4/d0;

    .line 41
    .line 42
    if-eqz v8, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    sget-object v8, Lv4/d0;->j:Lv4/d0;

    .line 46
    .line 47
    :goto_1
    move v9, v4

    .line 48
    :goto_2
    if-ge v9, v6, :cond_4

    .line 49
    .line 50
    aget-object v10, v3, v9

    .line 51
    .line 52
    iget-object v10, v10, Li4/f;->d:Lv4/d0;

    .line 53
    .line 54
    if-eqz v10, :cond_2

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_2
    sget-object v10, Lv4/d0;->j:Lv4/d0;

    .line 58
    .line 59
    :goto_3
    if-eq v10, v8, :cond_5

    .line 60
    .line 61
    sget-object v11, Lv4/d0;->j:Lv4/d0;

    .line 62
    .line 63
    if-ne v10, v11, :cond_3

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    aput-object v7, v3, v6

    .line 70
    .line 71
    add-int/lit8 v6, v6, 0x1

    .line 72
    .line 73
    :cond_5
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_6
    if-nez v6, :cond_7

    .line 77
    .line 78
    sget-object v1, Li4/g;->i:Li4/g;

    .line 79
    .line 80
    goto :goto_6

    .line 81
    :cond_7
    new-instance v1, Li4/g;

    .line 82
    .line 83
    invoke-direct {v1, v6}, Lz4/e;-><init>(I)V

    .line 84
    .line 85
    .line 86
    move v2, v4

    .line 87
    :goto_5
    if-ge v2, v6, :cond_9

    .line 88
    .line 89
    aget-object v5, v3, v2

    .line 90
    .line 91
    if-eqz v5, :cond_8

    .line 92
    .line 93
    invoke-virtual {v1, v2, v5}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    add-int/lit8 v2, v2, 0x1

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_8
    const-string p1, "item == null"

    .line 100
    .line 101
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_9
    iput-boolean v4, v1, Lz4/j;->g:Z

    .line 106
    .line 107
    :goto_6
    iget-object v2, p0, Li4/a;->m:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v2, [Li4/g;

    .line 110
    .line 111
    aput-object v1, v2, p1

    .line 112
    .line 113
    iget-object v2, p0, Li4/a;->l:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v2, [Lz4/g;

    .line 116
    .line 117
    const/4 v3, -0x1

    .line 118
    if-eqz p3, :cond_a

    .line 119
    .line 120
    goto :goto_7

    .line 121
    :cond_a
    move p2, v3

    .line 122
    :goto_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    if-lt p2, v3, :cond_10

    .line 126
    .line 127
    if-ltz p2, :cond_b

    .line 128
    .line 129
    goto :goto_8

    .line 130
    :cond_b
    move v0, v4

    .line 131
    :goto_8
    iget-object p3, v1, Lz4/e;->h:[Ljava/lang/Object;

    .line 132
    .line 133
    array-length p3, p3

    .line 134
    if-nez p3, :cond_d

    .line 135
    .line 136
    if-eqz v0, :cond_c

    .line 137
    .line 138
    invoke-static {p2}, Lz4/g;->o(I)Lz4/g;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    goto :goto_a

    .line 143
    :cond_c
    sget-object p2, Lz4/g;->k:Lz4/g;

    .line 144
    .line 145
    goto :goto_a

    .line 146
    :cond_d
    new-instance v3, Lz4/g;

    .line 147
    .line 148
    add-int v5, p3, v0

    .line 149
    .line 150
    invoke-direct {v3, v5}, Lz4/g;-><init>(I)V

    .line 151
    .line 152
    .line 153
    move v5, v4

    .line 154
    :goto_9
    if-ge v5, p3, :cond_e

    .line 155
    .line 156
    invoke-virtual {v1, v5}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    check-cast v6, Li4/f;

    .line 161
    .line 162
    iget v6, v6, Li4/f;->c:I

    .line 163
    .line 164
    invoke-virtual {v3, v6}, Lz4/g;->l(I)V

    .line 165
    .line 166
    .line 167
    add-int/lit8 v5, v5, 0x1

    .line 168
    .line 169
    goto :goto_9

    .line 170
    :cond_e
    if-eqz v0, :cond_f

    .line 171
    .line 172
    invoke-virtual {v3, p2}, Lz4/g;->l(I)V

    .line 173
    .line 174
    .line 175
    :cond_f
    iput-boolean v4, v3, Lz4/j;->g:Z

    .line 176
    .line 177
    move-object p2, v3

    .line 178
    :goto_a
    aput-object p2, v2, p1

    .line 179
    .line 180
    return-void

    .line 181
    :cond_10
    const-string p1, "noException < -1"

    .line 182
    .line 183
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    return-void
.end method
