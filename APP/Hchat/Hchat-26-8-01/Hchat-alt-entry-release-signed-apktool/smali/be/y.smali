.class public final Lbe/y;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:Lud/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lbe/y;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static i(Lpd/b;ILjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    move v1, p1

    .line 8
    :goto_0
    if-ge v1, v0, :cond_4

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lud/p;->S(I)Lqd/l;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    sub-int v3, v1, p1

    .line 15
    .line 16
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, Lqd/j;

    .line 21
    .line 22
    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lqd/j;

    .line 27
    .line 28
    if-eqz v3, :cond_3

    .line 29
    .line 30
    invoke-virtual {v3, v4}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    sget-object v6, Lmd/a;->X:Lmd/a;

    .line 35
    .line 36
    sget-object v7, Lpd/k;->A:Lpd/k;

    .line 37
    .line 38
    if-nez v5, :cond_2

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    instance-of v5, v2, Lqd/n;

    .line 44
    .line 45
    if-eqz v5, :cond_0

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    instance-of v4, v4, Lqd/g;

    .line 51
    .line 52
    if-eqz v4, :cond_0

    .line 53
    .line 54
    instance-of v4, v3, Lqd/g;

    .line 55
    .line 56
    if-eqz v4, :cond_0

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Lqd/l;->W(Lqd/j;)V

    .line 59
    .line 60
    .line 61
    sget-object v3, Lmd/a;->W:Lmd/a;

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Lmd/e;->w(Lmd/a;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_0
    sget-object v4, Lxe/m;->a:Lmh/b;

    .line 68
    .line 69
    instance-of v4, v2, Lqd/m;

    .line 70
    .line 71
    if-eqz v4, :cond_1

    .line 72
    .line 73
    move-object v4, v2

    .line 74
    check-cast v4, Lqd/m;

    .line 75
    .line 76
    iget-object v4, v4, Lqd/m;->l:Lud/p;

    .line 77
    .line 78
    iget-object v4, v4, Lud/p;->k:Lpd/k;

    .line 79
    .line 80
    if-ne v4, v7, :cond_1

    .line 81
    .line 82
    check-cast v2, Lqd/m;

    .line 83
    .line 84
    iget-object v2, v2, Lqd/m;->l:Lud/p;

    .line 85
    .line 86
    check-cast v2, Lpd/j;

    .line 87
    .line 88
    iput-object v3, v2, Lpd/j;->o:Ljava/lang/Object;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    new-instance v4, Lpd/j;

    .line 92
    .line 93
    sget-object v5, Lpd/k;->o:Lpd/k;

    .line 94
    .line 95
    const/4 v7, 0x1

    .line 96
    invoke-direct {v4, v5, v3, v7}, Lpd/j;-><init>(Lpd/k;Ljava/lang/Object;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v2}, Lud/p;->I(Lqd/l;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4, v6}, Lmd/e;->w(Lmd/a;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v4}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    iput-object v3, v2, Lqd/l;->i:Lqd/j;

    .line 110
    .line 111
    invoke-virtual {p0, v1, v2}, Lud/p;->c0(ILqd/l;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    instance-of v3, v2, Lqd/m;

    .line 119
    .line 120
    if-eqz v3, :cond_3

    .line 121
    .line 122
    check-cast v2, Lqd/m;

    .line 123
    .line 124
    iget-object v2, v2, Lqd/m;->l:Lud/p;

    .line 125
    .line 126
    iget-object v3, v2, Lud/p;->k:Lpd/k;

    .line 127
    .line 128
    if-ne v3, v7, :cond_3

    .line 129
    .line 130
    invoke-virtual {v2, v6}, Lmd/e;->w(Lmd/a;)V

    .line 131
    .line 132
    .line 133
    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_4
    return-void
.end method

.method public static j(Lpd/b;I)Ljava/util/ArrayList;
    .locals 9

    .line 1
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    :goto_0
    if-ge p1, v0, :cond_8

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lud/p;->S(I)Lqd/l;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    instance-of v3, v2, Lqd/n;

    .line 19
    .line 20
    if-eqz v3, :cond_3

    .line 21
    .line 22
    move-object v3, v2

    .line 23
    check-cast v3, Lqd/n;

    .line 24
    .line 25
    iget-object v4, v3, Lqd/l;->i:Lqd/j;

    .line 26
    .line 27
    iget-wide v5, v3, Lqd/n;->l:J

    .line 28
    .line 29
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    cmp-long v3, v5, v7

    .line 32
    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v4}, Lqd/j;->v()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    instance-of v3, v4, Lqd/a;

    .line 42
    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    :cond_0
    sget-object v2, Lqd/j;->v:Lqd/h;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    instance-of v3, v4, Lqd/g;

    .line 52
    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    sget-object v3, Lmd/a;->W:Lmd/a;

    .line 56
    .line 57
    iget-object v4, v2, Lmd/e;->g:Lmd/f;

    .line 58
    .line 59
    invoke-virtual {v4, v3}, Lmd/f;->a(Lmd/a;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_2

    .line 64
    .line 65
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    iget-object v2, v2, Lqd/l;->i:Lqd/j;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    instance-of v3, v2, Lqd/r;

    .line 72
    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    invoke-virtual {v2}, Lqd/l;->I()Lqd/j;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    goto :goto_1

    .line 80
    :cond_4
    instance-of v3, v2, Lqd/m;

    .line 81
    .line 82
    if-eqz v3, :cond_7

    .line 83
    .line 84
    move-object v3, v2

    .line 85
    check-cast v3, Lqd/m;

    .line 86
    .line 87
    iget-object v3, v3, Lqd/m;->l:Lud/p;

    .line 88
    .line 89
    iget-object v4, v3, Lud/p;->k:Lpd/k;

    .line 90
    .line 91
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    const/16 v5, 0x8

    .line 96
    .line 97
    if-eq v4, v5, :cond_6

    .line 98
    .line 99
    const/16 v5, 0x14

    .line 100
    .line 101
    if-eq v4, v5, :cond_6

    .line 102
    .line 103
    iget-object v3, v3, Lud/p;->l:Lqd/r;

    .line 104
    .line 105
    if-eqz v3, :cond_5

    .line 106
    .line 107
    invoke-virtual {v3}, Lqd/r;->I()Lqd/j;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    goto :goto_1

    .line 112
    :cond_5
    iget-object v2, v2, Lqd/l;->i:Lqd/j;

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_6
    check-cast v3, Lpd/j;

    .line 116
    .line 117
    iget-object v2, v3, Lpd/j;->o:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v2, Lqd/j;

    .line 120
    .line 121
    :goto_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    add-int/lit8 p1, p1, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_7
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    const-string p1, "Unknown var type for: "

    .line 132
    .line 133
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    const/4 p0, 0x0

    .line 141
    return-object p0

    .line 142
    :cond_8
    return-object v1
.end method

.method public static m(Ljava/util/ArrayList;Ljava/util/List;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v1, v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, Lqd/j;

    .line 14
    .line 15
    invoke-virtual {v3}, Lqd/j;->w()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lqd/j;

    .line 26
    .line 27
    invoke-virtual {p0, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return v2
.end method


# virtual methods
.method public final f(Lud/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbe/y;->g:Lud/u;

    .line 2
    .line 3
    return-void
.end method

.method public final g(Lud/r;)V
    .locals 5

    .line 1
    iget-boolean v0, p1, Lud/r;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    iget-object v0, p1, Lud/r;->z:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_4

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lud/a;

    .line 23
    .line 24
    iget-object v2, v1, Lmd/e;->g:Lmd/f;

    .line 25
    .line 26
    sget-object v3, Lmd/a;->s:Lmd/a;

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Lmd/f;->a(Lmd/a;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-object v1, v1, Lud/a;->l:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lud/p;

    .line 52
    .line 53
    iget-object v4, v2, Lmd/e;->g:Lmd/f;

    .line 54
    .line 55
    invoke-virtual {v4, v3}, Lmd/f;->a(Lmd/a;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    new-instance v4, Lbe/w;

    .line 63
    .line 64
    invoke-direct {v4, p0, p1}, Lbe/w;-><init>(Lbe/y;Lud/r;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v4}, Lud/p;->h0(Ljava/util/function/Consumer;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    :goto_2
    return-void
.end method

.method public final k(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/function/Function;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lud/m;

    .line 25
    .line 26
    invoke-interface {v1}, Lud/m;->c()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eq v3, v4, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object v4, p0, Lbe/y;->g:Lud/u;

    .line 42
    .line 43
    iget-object v4, v4, Lud/u;->g:Lqe/x;

    .line 44
    .line 45
    iget-object v4, v4, Lqe/x;->c:Lqe/k;

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    :goto_1
    if-ge v5, v3, :cond_2

    .line 49
    .line 50
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    check-cast v6, Lqd/j;

    .line 55
    .line 56
    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    check-cast v7, Lqd/j;

    .line 61
    .line 62
    invoke-virtual {v4, v7, v6}, Lqe/k;->d(Lqd/j;Lqd/j;)Lqe/l;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-interface {p3, v6}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    check-cast v6, Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-nez v6, :cond_1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    return-object v0
.end method

.method public final l(Lud/m;Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Lae/d;

    .line 10
    .line 11
    const/16 v2, 0xe

    .line 12
    .line 13
    invoke-direct {v0, v2}, Lae/d;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2, p3, v0}, Lbe/y;->k(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/function/Function;)Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x1

    .line 25
    if-ne v2, v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, Lud/m;

    .line 32
    .line 33
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1

    .line 38
    :cond_1
    new-instance v0, Lae/d;

    .line 39
    .line 40
    const/16 v2, 0xf

    .line 41
    .line 42
    invoke-direct {v0, v2}, Lae/d;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p2, p3, v0}, Lbe/y;->k(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/function/Function;)Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    if-ne p3, v3, :cond_2

    .line 54
    .line 55
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    check-cast p2, Lud/m;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    return p1

    .line 66
    :cond_2
    :goto_0
    return v1
.end method

.method public final n(Lud/m;Ljava/util/Map;)Lud/m;
    .locals 8

    .line 1
    invoke-interface {p1}, Lud/m;->c()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-instance v2, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    const/4 v5, 0x1

    .line 17
    if-ge v3, v1, :cond_4

    .line 18
    .line 19
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    check-cast v6, Lqd/j;

    .line 24
    .line 25
    if-eqz v6, :cond_3

    .line 26
    .line 27
    invoke-virtual {v6}, Lqd/j;->c()Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-eqz v7, :cond_2

    .line 32
    .line 33
    iget-object v4, p0, Lbe/y;->g:Lud/u;

    .line 34
    .line 35
    iget-object v4, v4, Lud/u;->i:Lfe/a;

    .line 36
    .line 37
    invoke-virtual {v4, v6, p2}, Lfe/a;->m(Lqd/j;Ljava/util/Map;)Lqd/j;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    invoke-virtual {v4, v6}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-eqz v6, :cond_1

    .line 48
    .line 49
    :cond_0
    invoke-interface {p1}, Lud/m;->q()Lod/d;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    iget-object v4, v4, Lod/d;->i:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Lqd/j;

    .line 60
    .line 61
    :cond_1
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move v4, v5

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    new-instance p2, Laf/g;

    .line 73
    .line 74
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v1, " at: "

    .line 83
    .line 84
    const-string v2, " in: "

    .line 85
    .line 86
    const-string v4, "Null arg type in "

    .line 87
    .line 88
    invoke-static {v3, v4, p1, v1, v2}, Leh/a;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p2

    .line 103
    :cond_4
    invoke-interface {p1}, Lud/m;->e()Lqd/j;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Lqd/j;->c()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_6

    .line 112
    .line 113
    iget-object v1, p0, Lbe/y;->g:Lud/u;

    .line 114
    .line 115
    iget-object v1, v1, Lud/u;->i:Lfe/a;

    .line 116
    .line 117
    invoke-virtual {v1, v0, p2}, Lfe/a;->m(Lqd/j;Ljava/util/Map;)Lqd/j;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    if-eqz p2, :cond_5

    .line 122
    .line 123
    invoke-virtual {p2}, Lqd/j;->c()Z

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    if-eqz p2, :cond_6

    .line 128
    .line 129
    :cond_5
    invoke-interface {p1}, Lud/m;->q()Lod/d;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    iget-object v0, p2, Lod/d;->h:Lqd/j;

    .line 134
    .line 135
    move v4, v5

    .line 136
    :cond_6
    if-nez v4, :cond_7

    .line 137
    .line 138
    return-object p1

    .line 139
    :cond_7
    new-instance p2, Lie/a;

    .line 140
    .line 141
    invoke-direct {p2, p1}, Lie/a;-><init>(Lud/m;)V

    .line 142
    .line 143
    .line 144
    iput-object v2, p2, Lie/a;->i:Ljava/util/List;

    .line 145
    .line 146
    iput-object v0, p2, Lie/a;->h:Lqd/j;

    .line 147
    .line 148
    return-object p2
.end method
