.class public final Lke/f;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lke/e;


# static fields
.field public static final g:Lmh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lke/f;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lke/f;->g:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public static i(Lud/r;Lzd/c;Lqd/r;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, Lqd/r;->f0()Lud/p;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    goto :goto_3

    .line 8
    :cond_0
    iget-object v0, p2, Lud/p;->l:Lqd/r;

    .line 9
    .line 10
    iget-object v0, v0, Lqd/l;->j:Lud/p;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :goto_0
    move v0, v1

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    iget-object v2, p0, Lud/r;->z:Ljava/util/List;

    .line 18
    .line 19
    invoke-static {p0, v0, v2}, La/a;->S(Lud/r;Lud/p;Ljava/util/List;)Lud/a;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    sget-object v2, Lke/f;->g:Lmh/b;

    .line 26
    .line 27
    const-string v3, " LoopRegionVisitor: instruction not found: {}, mth: {}"

    .line 28
    .line 29
    invoke-interface {v2, v0, v3, p0}, Lmh/b;->y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-static {v2, p1}, Lf8/i;->Z(Lud/a;Lud/j;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    :goto_1
    if-nez v0, :cond_3

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    instance-of v0, p2, Lpd/q;

    .line 41
    .line 42
    if-eqz v0, :cond_5

    .line 43
    .line 44
    check-cast p2, Lpd/q;

    .line 45
    .line 46
    iget-object p2, p2, Lud/p;->m:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_5

    .line 57
    .line 58
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lqd/l;

    .line 63
    .line 64
    check-cast v0, Lqd/r;

    .line 65
    .line 66
    invoke-static {p0, p1, v0}, Lke/f;->i(Lud/r;Lzd/c;Lqd/r;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_4

    .line 71
    .line 72
    :goto_2
    return v1

    .line 73
    :cond_5
    :goto_3
    const/4 p0, 0x1

    .line 74
    return p0
.end method

.method public static j(Lud/p;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lud/p;->k:Lpd/k;

    .line 5
    .line 6
    sget-object v1, Lpd/k;->O:Lpd/k;

    .line 7
    .line 8
    if-ne v0, v1, :cond_3

    .line 9
    .line 10
    check-cast p0, Lpd/n;

    .line 11
    .line 12
    iget-object v0, p0, Lpd/n;->p:Lod/d;

    .line 13
    .line 14
    iget p0, p0, Lpd/n;->o:I

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    if-eq p0, v1, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-ne p0, v1, :cond_3

    .line 21
    .line 22
    :cond_1
    iget-object p0, v0, Lod/d;->k:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :cond_2
    iget-object p0, v0, Lod/d;->j:Lod/a;

    .line 35
    .line 36
    iget-object p0, p0, Lod/a;->j:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0

    .line 43
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 44
    return p0
.end method

.method public static k(Lud/r;Lqd/l;Lqd/r;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lqd/l;->I()Lqd/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, Lqd/r;->I()Lqd/j;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Lqd/j;->t()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eqz v2, :cond_6

    .line 15
    .line 16
    invoke-virtual {v0}, Lqd/j;->j()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v0, 0x0

    .line 21
    if-eqz p1, :cond_5

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eq v2, v3, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lqd/j;

    .line 35
    .line 36
    invoke-virtual {p1, v1}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_1
    instance-of v2, p1, Lqd/c;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Lqd/r;->W(Lqd/j;)V

    .line 49
    .line 50
    .line 51
    return v3

    .line 52
    :cond_2
    iget-object p2, p0, Lud/r;->l:Lud/e;

    .line 53
    .line 54
    iget-object p2, p2, Lud/e;->k:Lud/u;

    .line 55
    .line 56
    invoke-static {p2, p1, v1}, Lqd/j;->u(Lud/u;Lqd/j;Lqd/j;)Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-eqz p2, :cond_3

    .line 61
    .line 62
    goto/16 :goto_2

    .line 63
    .line 64
    :cond_3
    invoke-virtual {p1}, Lqd/j;->r()Lqd/j;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-eqz p2, :cond_4

    .line 69
    .line 70
    invoke-virtual {p1}, Lqd/j;->q()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-ne v2, v3, :cond_4

    .line 75
    .line 76
    iget-object v2, p0, Lud/r;->l:Lud/e;

    .line 77
    .line 78
    iget-object v2, v2, Lud/e;->k:Lud/u;

    .line 79
    .line 80
    invoke-static {v2, p2, v1}, Lqd/j;->u(Lud/u;Lqd/j;Lqd/j;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-eqz p2, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    const-string p2, "Generic type differs: \'{}\' and \'{}\' in {}"

    .line 88
    .line 89
    filled-new-array {p1, v1, p0}, [Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    sget-object p1, Lke/f;->g:Lmh/b;

    .line 94
    .line 95
    invoke-interface {p1, p2, p0}, Lmh/b;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_5
    :goto_0
    return v0

    .line 99
    :cond_6
    instance-of p0, p1, Lqd/r;

    .line 100
    .line 101
    if-eqz p0, :cond_b

    .line 102
    .line 103
    invoke-virtual {v0}, Lqd/j;->v()Z

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    if-nez p2, :cond_7

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_7
    invoke-virtual {v0}, Lqd/j;->l()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    new-instance v2, Lqd/b;

    .line 119
    .line 120
    invoke-static {p2}, Lxe/s;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-direct {v2, p2, v0}, Lqd/b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 125
    .line 126
    .line 127
    if-eqz p0, :cond_a

    .line 128
    .line 129
    move-object p0, p1

    .line 130
    check-cast p0, Lqd/r;

    .line 131
    .line 132
    iget-object p2, p0, Lqd/r;->m:Lqd/s;

    .line 133
    .line 134
    if-eqz p2, :cond_8

    .line 135
    .line 136
    invoke-virtual {p2}, Lqd/s;->d()Lqd/j;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    goto :goto_1

    .line 141
    :cond_8
    sget-object p2, Lmd/a;->N:Lmd/a;

    .line 142
    .line 143
    iget-object v0, p0, Lmd/e;->g:Lmd/f;

    .line 144
    .line 145
    invoke-virtual {v0, p2}, Lmd/f;->a(Lmd/a;)Z

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    if-eqz p2, :cond_9

    .line 150
    .line 151
    iget-object p0, p0, Lqd/l;->i:Lqd/j;

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_9
    const/4 p0, 0x0

    .line 155
    :goto_1
    if-eqz p0, :cond_a

    .line 156
    .line 157
    invoke-virtual {p0, v2}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    if-nez p0, :cond_a

    .line 162
    .line 163
    sget-object p0, Lqd/j;->k:Lqd/e;

    .line 164
    .line 165
    invoke-virtual {v1, p0}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    return p0

    .line 170
    :cond_a
    invoke-virtual {p1, v2}, Lqd/l;->W(Lqd/j;)V

    .line 171
    .line 172
    .line 173
    :cond_b
    :goto_2
    return v3
.end method

.method public static l(Lud/r;Lzd/c;Lqd/r;)Z
    .locals 4

    .line 1
    iget-object p2, p2, Lqd/r;->m:Lqd/s;

    .line 2
    .line 3
    iget-object p2, p2, Lqd/s;->j:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lqd/r;

    .line 20
    .line 21
    iget-object v0, v0, Lqd/l;->j:Lud/p;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    :goto_0
    move v0, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    iget-object v2, p0, Lud/r;->z:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {p0, v0, v2}, La/a;->S(Lud/r;Lud/p;Ljava/util/List;)Lud/a;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    sget-object v2, Lke/f;->g:Lmh/b;

    .line 37
    .line 38
    const-string v3, " LoopRegionVisitor: instruction not found: {}, mth: {}"

    .line 39
    .line 40
    invoke-interface {v2, v0, v3, p0}, Lmh/b;->y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-static {v2, p1}, Lf8/i;->Z(Lud/a;Lud/j;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    :goto_1
    if-nez v0, :cond_0

    .line 49
    .line 50
    return v1

    .line 51
    :cond_3
    const/4 p0, 0x1

    .line 52
    return p0
.end method


# virtual methods
.method public final a(Lud/r;Lud/n;)Z
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lzd/c;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v2, :cond_3d

    .line 9
    .line 10
    check-cast v1, Lzd/c;

    .line 11
    .line 12
    iget-boolean v2, v1, Lzd/c;->n:Z

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto/16 :goto_d

    .line 17
    .line 18
    :cond_0
    iget-object v2, v1, Lyd/a;->k:Lyd/b;

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    goto/16 :goto_d

    .line 23
    .line 24
    :cond_1
    iget-object v4, v1, Lzd/c;->m:Lnd/t;

    .line 25
    .line 26
    iget-object v4, v4, Lnd/t;->b:Lud/a;

    .line 27
    .line 28
    invoke-static {v4}, La/a;->O0(Lud/a;)Lud/a;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-static {v4}, La/a;->c0(Lud/h;)Lud/p;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    sget-object v7, Lmd/a;->S:Lmd/a;

    .line 39
    .line 40
    const/4 v8, 0x2

    .line 41
    sget-object v9, Lmd/a;->s:Lmd/a;

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    goto/16 :goto_8

    .line 46
    .line 47
    :cond_2
    iget-object v10, v4, Lud/p;->l:Lqd/r;

    .line 48
    .line 49
    if-eqz v10, :cond_29

    .line 50
    .line 51
    iget-object v11, v10, Lqd/r;->m:Lqd/s;

    .line 52
    .line 53
    if-eqz v11, :cond_29

    .line 54
    .line 55
    invoke-virtual {v11}, Lqd/s;->j()Z

    .line 56
    .line 57
    .line 58
    move-result v11

    .line 59
    if-nez v11, :cond_3

    .line 60
    .line 61
    goto/16 :goto_8

    .line 62
    .line 63
    :cond_3
    iget-object v11, v10, Lqd/r;->m:Lqd/s;

    .line 64
    .line 65
    iget-object v11, v11, Lqd/s;->k:Ljava/util/ArrayList;

    .line 66
    .line 67
    if-nez v11, :cond_4

    .line 68
    .line 69
    sget-object v11, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 70
    .line 71
    :cond_4
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    if-eq v12, v3, :cond_5

    .line 76
    .line 77
    goto/16 :goto_8

    .line 78
    .line 79
    :cond_5
    invoke-interface {v11, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    check-cast v11, Lpd/q;

    .line 84
    .line 85
    iget-object v12, v11, Lud/p;->m:Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v12

    .line 91
    if-ne v12, v8, :cond_29

    .line 92
    .line 93
    iget-object v12, v11, Lud/p;->m:Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v13

    .line 99
    if-nez v13, :cond_6

    .line 100
    .line 101
    move v12, v5

    .line 102
    goto :goto_0

    .line 103
    :cond_6
    invoke-static {v12, v10}, Lxe/m;->b(Ljava/util/List;Lqd/r;)Z

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    :goto_0
    if-eqz v12, :cond_29

    .line 108
    .line 109
    iget-object v10, v10, Lqd/r;->m:Lqd/s;

    .line 110
    .line 111
    iget-object v10, v10, Lqd/s;->j:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-eq v10, v3, :cond_7

    .line 118
    .line 119
    goto/16 :goto_8

    .line 120
    .line 121
    :cond_7
    iget-object v10, v11, Lud/p;->l:Lqd/r;

    .line 122
    .line 123
    invoke-virtual {v2}, Lyd/b;->J()Ljava/util/ArrayList;

    .line 124
    .line 125
    .line 126
    move-result-object v12

    .line 127
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v12

    .line 131
    if-eqz v12, :cond_29

    .line 132
    .line 133
    iget-object v12, v10, Lqd/r;->m:Lqd/s;

    .line 134
    .line 135
    invoke-virtual {v12}, Lqd/s;->j()Z

    .line 136
    .line 137
    .line 138
    move-result v12

    .line 139
    if-eqz v12, :cond_8

    .line 140
    .line 141
    goto/16 :goto_8

    .line 142
    .line 143
    :cond_8
    invoke-virtual {v11, v5}, Lpd/q;->j0(I)Lqd/r;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    invoke-virtual {v11}, Lqd/r;->f0()Lud/p;

    .line 148
    .line 149
    .line 150
    move-result-object v12

    .line 151
    if-eqz v12, :cond_29

    .line 152
    .line 153
    iget-object v13, v12, Lmd/e;->g:Lmd/f;

    .line 154
    .line 155
    invoke-virtual {v13, v9}, Lmd/f;->a(Lmd/a;)Z

    .line 156
    .line 157
    .line 158
    move-result v13

    .line 159
    if-nez v13, :cond_29

    .line 160
    .line 161
    iget-object v11, v11, Lqd/r;->m:Lqd/s;

    .line 162
    .line 163
    iget-object v11, v11, Lqd/s;->j:Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    if-eq v11, v3, :cond_9

    .line 170
    .line 171
    goto/16 :goto_8

    .line 172
    .line 173
    :cond_9
    invoke-static {v0, v1, v10}, Lke/f;->l(Lud/r;Lzd/c;Lqd/r;)Z

    .line 174
    .line 175
    .line 176
    move-result v10

    .line 177
    if-nez v10, :cond_a

    .line 178
    .line 179
    goto/16 :goto_8

    .line 180
    .line 181
    :cond_a
    new-instance v10, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4, v10}, Lud/p;->U(Ljava/util/Collection;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    :cond_b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v11

    .line 197
    if-eqz v11, :cond_c

    .line 198
    .line 199
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    check-cast v11, Lqd/r;

    .line 204
    .line 205
    :try_start_0
    invoke-static {v0, v1, v11}, Lke/f;->i(Lud/r;Lzd/c;Lqd/r;)Z

    .line 206
    .line 207
    .line 208
    move-result v11
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    .line 209
    if-eqz v11, :cond_b

    .line 210
    .line 211
    goto/16 :goto_8

    .line 212
    .line 213
    :catch_0
    new-instance v0, Laf/f;

    .line 214
    .line 215
    const-string v1, "LoopRegionVisitor.assignOnlyInLoop endless recursion"

    .line 216
    .line 217
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw v0

    .line 221
    :cond_c
    invoke-virtual {v12, v9}, Lmd/e;->w(Lmd/a;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4, v9}, Lmd/e;->w(Lmd/a;)V

    .line 225
    .line 226
    .line 227
    instance-of v8, v4, Lpd/a;

    .line 228
    .line 229
    if-nez v8, :cond_d

    .line 230
    .line 231
    goto/16 :goto_6

    .line 232
    .line 233
    :cond_d
    move-object v8, v4

    .line 234
    check-cast v8, Lpd/a;

    .line 235
    .line 236
    iget v8, v8, Lpd/a;->o:I

    .line 237
    .line 238
    if-eq v8, v3, :cond_e

    .line 239
    .line 240
    goto/16 :goto_6

    .line 241
    .line 242
    :cond_e
    invoke-virtual {v4, v3}, Lud/p;->S(I)Lqd/l;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    instance-of v10, v8, Lqd/n;

    .line 250
    .line 251
    if-eqz v10, :cond_27

    .line 252
    .line 253
    check-cast v8, Lqd/n;

    .line 254
    .line 255
    iget-wide v10, v8, Lqd/n;->l:J

    .line 256
    .line 257
    const-wide/16 v13, 0x1

    .line 258
    .line 259
    cmp-long v8, v10, v13

    .line 260
    .line 261
    if-eqz v8, :cond_f

    .line 262
    .line 263
    goto/16 :goto_6

    .line 264
    .line 265
    :cond_f
    iget-object v8, v12, Lud/p;->k:Lpd/k;

    .line 266
    .line 267
    sget-object v10, Lpd/k;->g:Lpd/k;

    .line 268
    .line 269
    if-ne v8, v10, :cond_27

    .line 270
    .line 271
    invoke-virtual {v12, v5}, Lud/p;->S(I)Lqd/l;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    instance-of v8, v8, Lqd/n;

    .line 279
    .line 280
    if-eqz v8, :cond_27

    .line 281
    .line 282
    invoke-virtual {v12, v5}, Lud/p;->S(I)Lqd/l;

    .line 283
    .line 284
    .line 285
    move-result-object v8

    .line 286
    check-cast v8, Lqd/n;

    .line 287
    .line 288
    iget-wide v10, v8, Lqd/n;->l:J

    .line 289
    .line 290
    const-wide/16 v13, 0x0

    .line 291
    .line 292
    cmp-long v8, v10, v13

    .line 293
    .line 294
    if-eqz v8, :cond_10

    .line 295
    .line 296
    goto/16 :goto_6

    .line 297
    .line 298
    :cond_10
    invoke-virtual {v4, v5}, Lud/p;->S(I)Lqd/l;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    instance-of v10, v8, Lqd/r;

    .line 306
    .line 307
    if-nez v10, :cond_11

    .line 308
    .line 309
    goto/16 :goto_6

    .line 310
    .line 311
    :cond_11
    check-cast v8, Lqd/r;

    .line 312
    .line 313
    iget-object v8, v8, Lqd/r;->m:Lqd/s;

    .line 314
    .line 315
    iget-object v8, v8, Lqd/s;->j:Ljava/util/ArrayList;

    .line 316
    .line 317
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 318
    .line 319
    .line 320
    move-result v10

    .line 321
    const/4 v11, 0x3

    .line 322
    if-eq v10, v11, :cond_12

    .line 323
    .line 324
    goto/16 :goto_6

    .line 325
    .line 326
    :cond_12
    sget-object v10, Lxe/m;->a:Lmh/b;

    .line 327
    .line 328
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 329
    .line 330
    .line 331
    move-result-object v10

    .line 332
    :cond_13
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    .line 334
    .line 335
    move-result v13

    .line 336
    if-eqz v13, :cond_14

    .line 337
    .line 338
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v13

    .line 342
    check-cast v13, Lqd/r;

    .line 343
    .line 344
    iget-object v14, v13, Lqd/l;->j:Lud/p;

    .line 345
    .line 346
    if-eqz v14, :cond_13

    .line 347
    .line 348
    iget-object v14, v14, Lud/p;->k:Lpd/k;

    .line 349
    .line 350
    sget-object v15, Lpd/k;->v:Lpd/k;

    .line 351
    .line 352
    if-ne v14, v15, :cond_13

    .line 353
    .line 354
    goto :goto_1

    .line 355
    :cond_14
    move-object v13, v6

    .line 356
    :goto_1
    if-nez v13, :cond_15

    .line 357
    .line 358
    goto/16 :goto_6

    .line 359
    .line 360
    :cond_15
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 361
    .line 362
    .line 363
    move-result-object v8

    .line 364
    :cond_16
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 365
    .line 366
    .line 367
    move-result v10

    .line 368
    if-eqz v10, :cond_17

    .line 369
    .line 370
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v10

    .line 374
    check-cast v10, Lqd/r;

    .line 375
    .line 376
    iget-object v14, v10, Lqd/l;->j:Lud/p;

    .line 377
    .line 378
    if-eqz v14, :cond_16

    .line 379
    .line 380
    iget-object v14, v14, Lud/p;->k:Lpd/k;

    .line 381
    .line 382
    sget-object v15, Lpd/k;->G:Lpd/k;

    .line 383
    .line 384
    if-ne v14, v15, :cond_16

    .line 385
    .line 386
    goto :goto_2

    .line 387
    :cond_17
    move-object v10, v6

    .line 388
    :goto_2
    if-nez v10, :cond_18

    .line 389
    .line 390
    goto/16 :goto_6

    .line 391
    .line 392
    :cond_18
    iget-object v8, v10, Lqd/l;->j:Lud/p;

    .line 393
    .line 394
    if-eqz v8, :cond_27

    .line 395
    .line 396
    iget-object v10, v8, Lud/p;->m:Ljava/util/List;

    .line 397
    .line 398
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 399
    .line 400
    .line 401
    move-result-object v10

    .line 402
    :cond_19
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 403
    .line 404
    .line 405
    move-result v14

    .line 406
    if-eqz v14, :cond_1a

    .line 407
    .line 408
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v14

    .line 412
    check-cast v14, Lqd/l;

    .line 413
    .line 414
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    instance-of v14, v14, Lqd/m;

    .line 418
    .line 419
    if-eqz v14, :cond_19

    .line 420
    .line 421
    goto/16 :goto_6

    .line 422
    .line 423
    :cond_1a
    invoke-virtual {v2}, Lyd/b;->L()Z

    .line 424
    .line 425
    .line 426
    move-result v10

    .line 427
    if-nez v10, :cond_1b

    .line 428
    .line 429
    goto/16 :goto_6

    .line 430
    .line 431
    :cond_1b
    iget-object v2, v2, Lyd/b;->k:Lxe/e;

    .line 432
    .line 433
    iget-object v10, v2, Lxe/e;->b:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v10, Lpd/i;

    .line 436
    .line 437
    iget v14, v10, Lpd/i;->p:I

    .line 438
    .line 439
    if-ne v14, v11, :cond_27

    .line 440
    .line 441
    invoke-virtual {v10, v5}, Lud/p;->S(I)Lqd/l;

    .line 442
    .line 443
    .line 444
    move-result-object v10

    .line 445
    if-eq v10, v13, :cond_1c

    .line 446
    .line 447
    goto/16 :goto_6

    .line 448
    .line 449
    :cond_1c
    invoke-virtual {v2}, Lxe/e;->a()Lqd/l;

    .line 450
    .line 451
    .line 452
    move-result-object v10

    .line 453
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    instance-of v11, v10, Lqd/m;

    .line 457
    .line 458
    if-eqz v11, :cond_1d

    .line 459
    .line 460
    move-object v11, v10

    .line 461
    check-cast v11, Lqd/m;

    .line 462
    .line 463
    iget-object v11, v11, Lqd/m;->l:Lud/p;

    .line 464
    .line 465
    goto :goto_3

    .line 466
    :cond_1d
    instance-of v11, v10, Lqd/r;

    .line 467
    .line 468
    if-eqz v11, :cond_27

    .line 469
    .line 470
    move-object v11, v10

    .line 471
    check-cast v11, Lqd/r;

    .line 472
    .line 473
    invoke-virtual {v11}, Lqd/r;->f0()Lud/p;

    .line 474
    .line 475
    .line 476
    move-result-object v11

    .line 477
    :goto_3
    if-eqz v11, :cond_27

    .line 478
    .line 479
    iget-object v14, v11, Lud/p;->k:Lpd/k;

    .line 480
    .line 481
    sget-object v15, Lpd/k;->C:Lpd/k;

    .line 482
    .line 483
    if-eq v14, v15, :cond_1e

    .line 484
    .line 485
    goto/16 :goto_6

    .line 486
    .line 487
    :cond_1e
    invoke-virtual {v11, v5}, Lud/p;->S(I)Lqd/l;

    .line 488
    .line 489
    .line 490
    move-result-object v14

    .line 491
    invoke-virtual {v8, v5}, Lud/p;->S(I)Lqd/l;

    .line 492
    .line 493
    .line 494
    move-result-object v15

    .line 495
    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result v14

    .line 499
    if-nez v14, :cond_1f

    .line 500
    .line 501
    goto/16 :goto_6

    .line 502
    .line 503
    :cond_1f
    iget-object v14, v8, Lud/p;->l:Lqd/r;

    .line 504
    .line 505
    if-eqz v14, :cond_20

    .line 506
    .line 507
    invoke-static {v0, v1, v14}, Lke/f;->l(Lud/r;Lzd/c;Lqd/r;)Z

    .line 508
    .line 509
    .line 510
    move-result v7

    .line 511
    if-nez v7, :cond_23

    .line 512
    .line 513
    goto/16 :goto_6

    .line 514
    .line 515
    :cond_20
    iget-object v14, v8, Lmd/e;->g:Lmd/f;

    .line 516
    .line 517
    invoke-virtual {v14, v7}, Lmd/f;->a(Lmd/a;)Z

    .line 518
    .line 519
    .line 520
    move-result v7

    .line 521
    if-nez v7, :cond_21

    .line 522
    .line 523
    goto/16 :goto_6

    .line 524
    .line 525
    :cond_21
    invoke-static {v0, v8}, La/a;->M0(Lud/r;Lud/p;)Lqd/l;

    .line 526
    .line 527
    .line 528
    move-result-object v7

    .line 529
    if-eqz v7, :cond_26

    .line 530
    .line 531
    iget-object v14, v7, Lqd/l;->j:Lud/p;

    .line 532
    .line 533
    if-nez v14, :cond_22

    .line 534
    .line 535
    goto :goto_5

    .line 536
    :cond_22
    invoke-virtual {v7}, Lqd/l;->I()Lqd/j;

    .line 537
    .line 538
    .line 539
    move-result-object v6

    .line 540
    invoke-virtual {v0, v6}, Lud/r;->c0(Lqd/j;)Lqd/r;

    .line 541
    .line 542
    .line 543
    move-result-object v14

    .line 544
    iget-object v6, v7, Lqd/l;->j:Lud/p;

    .line 545
    .line 546
    invoke-virtual {v14}, Lqd/r;->c0()Lqd/r;

    .line 547
    .line 548
    .line 549
    move-result-object v15

    .line 550
    invoke-virtual {v6, v7, v15}, Lud/p;->b0(Lqd/l;Lqd/l;)Z

    .line 551
    .line 552
    .line 553
    invoke-virtual {v6}, Lud/p;->Z()V

    .line 554
    .line 555
    .line 556
    :cond_23
    iget-object v6, v4, Lud/p;->l:Lqd/r;

    .line 557
    .line 558
    invoke-virtual {v6, v9}, Lmd/e;->w(Lmd/a;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v13, v9}, Lmd/e;->w(Lmd/a;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v10, v9}, Lmd/e;->w(Lmd/a;)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v8, v9}, Lmd/e;->w(Lmd/a;)V

    .line 568
    .line 569
    .line 570
    iget-object v2, v2, Lxe/e;->b:Ljava/lang/Object;

    .line 571
    .line 572
    check-cast v2, Lpd/i;

    .line 573
    .line 574
    invoke-virtual {v2, v9}, Lmd/e;->w(Lmd/a;)V

    .line 575
    .line 576
    .line 577
    new-instance v6, Lzd/a;

    .line 578
    .line 579
    invoke-virtual {v11, v5}, Lud/p;->S(I)Lqd/l;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    invoke-direct {v6, v2, v14}, Lzd/a;-><init>(Lqd/l;Lqd/r;)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v6, v1}, Lzd/a;->P(Lzd/c;)V

    .line 587
    .line 588
    .line 589
    iget-object v2, v11, Lud/p;->l:Lqd/r;

    .line 590
    .line 591
    if-eqz v2, :cond_25

    .line 592
    .line 593
    iget-object v2, v2, Lqd/r;->m:Lqd/s;

    .line 594
    .line 595
    iget-object v2, v2, Lqd/s;->j:Ljava/util/ArrayList;

    .line 596
    .line 597
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    :cond_24
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 602
    .line 603
    .line 604
    move-result v5

    .line 605
    if-eqz v5, :cond_25

    .line 606
    .line 607
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v5

    .line 611
    check-cast v5, Lqd/r;

    .line 612
    .line 613
    iget-object v5, v5, Lqd/l;->j:Lud/p;

    .line 614
    .line 615
    if-eqz v5, :cond_24

    .line 616
    .line 617
    iget-object v5, v5, Lmd/e;->g:Lmd/f;

    .line 618
    .line 619
    invoke-virtual {v5, v9}, Lmd/f;->a(Lmd/a;)Z

    .line 620
    .line 621
    .line 622
    move-result v5

    .line 623
    if-nez v5, :cond_24

    .line 624
    .line 625
    goto :goto_4

    .line 626
    :cond_25
    invoke-virtual {v11, v9}, Lmd/e;->w(Lmd/a;)V

    .line 627
    .line 628
    .line 629
    invoke-static {v0, v11}, Lxe/l;->d(Lud/r;Lud/p;)V

    .line 630
    .line 631
    .line 632
    :goto_4
    invoke-static {v0}, Lbe/b;->Y(Lud/r;)V

    .line 633
    .line 634
    .line 635
    goto :goto_6

    .line 636
    :cond_26
    :goto_5
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    const-string v5, "checkArrayForEach: Wrapped insn not found: "

    .line 641
    .line 642
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v2

    .line 646
    invoke-virtual {v0, v2}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    :cond_27
    :goto_6
    if-eqz v6, :cond_28

    .line 650
    .line 651
    goto :goto_7

    .line 652
    :cond_28
    new-instance v6, Lzd/b;

    .line 653
    .line 654
    invoke-direct {v6, v12, v4}, Lzd/b;-><init>(Lud/p;Lud/p;)V

    .line 655
    .line 656
    .line 657
    :goto_7
    iput-object v6, v1, Lzd/c;->r:Lg4/a;

    .line 658
    .line 659
    goto/16 :goto_c

    .line 660
    .line 661
    :cond_29
    :goto_8
    invoke-virtual {v2}, Lyd/b;->J()Ljava/util/ArrayList;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 666
    .line 667
    .line 668
    move-result v4

    .line 669
    if-eq v4, v3, :cond_2a

    .line 670
    .line 671
    goto/16 :goto_d

    .line 672
    .line 673
    :cond_2a
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v2

    .line 677
    check-cast v2, Lqd/r;

    .line 678
    .line 679
    iget-object v4, v2, Lqd/r;->m:Lqd/s;

    .line 680
    .line 681
    if-eqz v4, :cond_3d

    .line 682
    .line 683
    invoke-virtual {v4}, Lqd/s;->j()Z

    .line 684
    .line 685
    .line 686
    move-result v10

    .line 687
    if-eqz v10, :cond_2b

    .line 688
    .line 689
    goto/16 :goto_d

    .line 690
    .line 691
    :cond_2b
    iget-object v4, v4, Lqd/s;->j:Ljava/util/ArrayList;

    .line 692
    .line 693
    invoke-virtual {v2}, Lqd/r;->f0()Lud/p;

    .line 694
    .line 695
    .line 696
    move-result-object v2

    .line 697
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 698
    .line 699
    .line 700
    move-result v10

    .line 701
    if-eq v10, v8, :cond_2c

    .line 702
    .line 703
    goto/16 :goto_d

    .line 704
    .line 705
    :cond_2c
    const-string v8, "iterator()Ljava/util/Iterator;"

    .line 706
    .line 707
    invoke-static {v2, v6, v8}, Lke/f;->j(Lud/p;Ljava/lang/String;Ljava/lang/String;)Z

    .line 708
    .line 709
    .line 710
    move-result v8

    .line 711
    if-nez v8, :cond_2d

    .line 712
    .line 713
    goto/16 :goto_d

    .line 714
    .line 715
    :cond_2d
    invoke-virtual {v2, v5}, Lud/p;->S(I)Lqd/l;

    .line 716
    .line 717
    .line 718
    move-result-object v8

    .line 719
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v5

    .line 723
    check-cast v5, Lqd/r;

    .line 724
    .line 725
    iget-object v5, v5, Lqd/l;->j:Lud/p;

    .line 726
    .line 727
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v10

    .line 731
    check-cast v10, Lqd/r;

    .line 732
    .line 733
    iget-object v10, v10, Lqd/l;->j:Lud/p;

    .line 734
    .line 735
    const-string v11, "hasNext()Z"

    .line 736
    .line 737
    const-string v12, "java.util.Iterator"

    .line 738
    .line 739
    invoke-static {v5, v12, v11}, Lke/f;->j(Lud/p;Ljava/lang/String;Ljava/lang/String;)Z

    .line 740
    .line 741
    .line 742
    move-result v5

    .line 743
    if-eqz v5, :cond_3d

    .line 744
    .line 745
    const-string v5, "next()Ljava/lang/Object;"

    .line 746
    .line 747
    invoke-static {v10, v12, v5}, Lke/f;->j(Lud/p;Ljava/lang/String;Ljava/lang/String;)Z

    .line 748
    .line 749
    .line 750
    move-result v5

    .line 751
    if-nez v5, :cond_2e

    .line 752
    .line 753
    goto/16 :goto_d

    .line 754
    .line 755
    :cond_2e
    new-instance v5, Ljava/util/ArrayList;

    .line 756
    .line 757
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 758
    .line 759
    .line 760
    iget-object v11, v10, Lmd/e;->g:Lmd/f;

    .line 761
    .line 762
    invoke-virtual {v11, v7}, Lmd/f;->a(Lmd/a;)Z

    .line 763
    .line 764
    .line 765
    move-result v7

    .line 766
    if-eqz v7, :cond_37

    .line 767
    .line 768
    invoke-static {v0, v10}, La/a;->M0(Lud/r;Lud/p;)Lqd/l;

    .line 769
    .line 770
    .line 771
    move-result-object v7

    .line 772
    if-eqz v7, :cond_36

    .line 773
    .line 774
    iget-object v11, v7, Lqd/l;->j:Lud/p;

    .line 775
    .line 776
    if-eqz v11, :cond_36

    .line 777
    .line 778
    iget-object v12, v0, Lud/r;->z:Ljava/util/List;

    .line 779
    .line 780
    invoke-static {v0, v11, v12}, La/a;->S(Lud/r;Lud/p;Ljava/util/List;)Lud/a;

    .line 781
    .line 782
    .line 783
    move-result-object v12

    .line 784
    if-nez v12, :cond_2f

    .line 785
    .line 786
    goto/16 :goto_d

    .line 787
    .line 788
    :cond_2f
    invoke-static {v12, v1}, Lf8/i;->Z(Lud/a;Lud/j;)Z

    .line 789
    .line 790
    .line 791
    move-result v12

    .line 792
    if-nez v12, :cond_30

    .line 793
    .line 794
    goto/16 :goto_d

    .line 795
    .line 796
    :cond_30
    iget-object v12, v11, Lud/p;->k:Lpd/k;

    .line 797
    .line 798
    sget-object v13, Lpd/k;->A:Lpd/k;

    .line 799
    .line 800
    if-ne v12, v13, :cond_33

    .line 801
    .line 802
    iget-object v7, v11, Lud/p;->l:Lqd/r;

    .line 803
    .line 804
    if-eqz v7, :cond_3d

    .line 805
    .line 806
    invoke-static {v0, v8, v7}, Lke/f;->k(Lud/r;Lqd/l;Lqd/r;)Z

    .line 807
    .line 808
    .line 809
    move-result v10

    .line 810
    if-nez v10, :cond_31

    .line 811
    .line 812
    goto/16 :goto_d

    .line 813
    .line 814
    :cond_31
    invoke-static {v0, v11}, La/a;->M0(Lud/r;Lud/p;)Lqd/l;

    .line 815
    .line 816
    .line 817
    move-result-object v10

    .line 818
    if-eqz v10, :cond_32

    .line 819
    .line 820
    iget-object v12, v10, Lqd/l;->j:Lud/p;

    .line 821
    .line 822
    if-eqz v12, :cond_32

    .line 823
    .line 824
    invoke-virtual {v12, v10, v7}, Lud/p;->b0(Lqd/l;Lqd/l;)Z

    .line 825
    .line 826
    .line 827
    goto :goto_9

    .line 828
    :cond_32
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 829
    .line 830
    .line 831
    goto :goto_9

    .line 832
    :cond_33
    iget-object v12, v10, Lud/p;->l:Lqd/r;

    .line 833
    .line 834
    if-nez v12, :cond_34

    .line 835
    .line 836
    goto/16 :goto_d

    .line 837
    .line 838
    :cond_34
    sget-object v13, Lmd/a;->u:Lmd/a;

    .line 839
    .line 840
    invoke-virtual {v12, v13}, Lmd/e;->D(Lmd/a;)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v10, v9}, Lmd/e;->w(Lmd/a;)V

    .line 844
    .line 845
    .line 846
    invoke-static {v0, v8, v12}, Lke/f;->k(Lud/r;Lqd/l;Lqd/r;)Z

    .line 847
    .line 848
    .line 849
    move-result v10

    .line 850
    if-nez v10, :cond_35

    .line 851
    .line 852
    goto :goto_d

    .line 853
    :cond_35
    invoke-virtual {v11, v7, v12}, Lud/p;->b0(Lqd/l;Lqd/l;)Z

    .line 854
    .line 855
    .line 856
    move-object v7, v12

    .line 857
    goto :goto_9

    .line 858
    :cond_36
    sget-object v1, Lke/f;->g:Lmh/b;

    .line 859
    .line 860
    const-string v2, " checkIterableForEach: Wrapped insn not found: {}, mth: {}"

    .line 861
    .line 862
    invoke-interface {v1, v10, v2, v0}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 863
    .line 864
    .line 865
    return v3

    .line 866
    :cond_37
    iget-object v7, v10, Lud/p;->l:Lqd/r;

    .line 867
    .line 868
    if-nez v7, :cond_38

    .line 869
    .line 870
    goto :goto_d

    .line 871
    :cond_38
    invoke-static {v0, v1, v7}, Lke/f;->l(Lud/r;Lzd/c;Lqd/r;)Z

    .line 872
    .line 873
    .line 874
    move-result v11

    .line 875
    if-nez v11, :cond_39

    .line 876
    .line 877
    goto :goto_d

    .line 878
    :cond_39
    invoke-static {v0, v1, v7}, Lke/f;->i(Lud/r;Lzd/c;Lqd/r;)Z

    .line 879
    .line 880
    .line 881
    move-result v11

    .line 882
    if-nez v11, :cond_3a

    .line 883
    .line 884
    goto :goto_d

    .line 885
    :cond_3a
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 886
    .line 887
    .line 888
    :goto_9
    invoke-virtual {v2, v9}, Lmd/e;->w(Lmd/a;)V

    .line 889
    .line 890
    .line 891
    iget-object v2, v2, Lud/p;->l:Lqd/r;

    .line 892
    .line 893
    invoke-virtual {v2, v9}, Lmd/e;->w(Lmd/a;)V

    .line 894
    .line 895
    .line 896
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 897
    .line 898
    .line 899
    move-result-object v2

    .line 900
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 901
    .line 902
    .line 903
    move-result v5

    .line 904
    if-eqz v5, :cond_3b

    .line 905
    .line 906
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v5

    .line 910
    check-cast v5, Lud/p;

    .line 911
    .line 912
    iput-object v6, v5, Lud/p;->l:Lqd/r;

    .line 913
    .line 914
    invoke-virtual {v5, v9}, Lmd/e;->w(Lmd/a;)V

    .line 915
    .line 916
    .line 917
    goto :goto_a

    .line 918
    :cond_3b
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 919
    .line 920
    .line 921
    move-result-object v2

    .line 922
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 923
    .line 924
    .line 925
    move-result v4

    .line 926
    if-eqz v4, :cond_3c

    .line 927
    .line 928
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 929
    .line 930
    .line 931
    move-result-object v4

    .line 932
    check-cast v4, Lqd/r;

    .line 933
    .line 934
    invoke-virtual {v4, v9}, Lmd/e;->w(Lmd/a;)V

    .line 935
    .line 936
    .line 937
    goto :goto_b

    .line 938
    :cond_3c
    new-instance v2, Lzd/a;

    .line 939
    .line 940
    invoke-direct {v2, v8, v7}, Lzd/a;-><init>(Lqd/l;Lqd/r;)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v2, v1}, Lzd/a;->P(Lzd/c;)V

    .line 944
    .line 945
    .line 946
    iput-object v2, v1, Lzd/c;->r:Lg4/a;

    .line 947
    .line 948
    :goto_c
    sget-object v1, Lmd/a;->a0:Lmd/a;

    .line 949
    .line 950
    invoke-virtual {v0, v1}, Lmd/e;->w(Lmd/a;)V

    .line 951
    .line 952
    .line 953
    :cond_3d
    :goto_d
    return v3
.end method

.method public final b(Lud/r;Lud/n;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final d(Lud/r;Lud/h;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final g(Lud/r;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lud/r;->G:Lxd/b;

    .line 2
    .line 3
    invoke-static {p1, p0, v0}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lmd/e;->g:Lmd/f;

    .line 7
    .line 8
    sget-object v1, Lmd/a;->a0:Lmd/a;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lmd/f;->a(Lmd/a;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-static {p1}, Lke/c;->r(Lud/r;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1}, Lmd/e;->D(Lmd/a;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    invoke-virtual {p1, v1}, Lmd/e;->D(Lmd/a;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_0
    return-void
.end method
