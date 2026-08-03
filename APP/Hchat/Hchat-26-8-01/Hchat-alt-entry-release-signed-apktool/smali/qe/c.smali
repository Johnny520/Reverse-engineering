.class public final Lqe/c;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Lqe/n;

.field public h:Lqe/x;

.field public i:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lqe/c;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lqe/n;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lqe/c;->g:Lqe/n;

    .line 10
    .line 11
    return-void
.end method

.method public static j(Lud/a;)Lud/a;
    .locals 2

    .line 1
    sget-object v0, Lmd/a;->m:Lmd/a;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {p0}, La/a;->c0(Lud/h;)Lud/p;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v0, v0, Lud/p;->k:Lpd/k;

    .line 19
    .line 20
    sget-object v1, Lce/m;->g:Ljava/util/EnumSet;

    .line 21
    .line 22
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object p0, p0, Lud/a;->m:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x1

    .line 35
    if-ne v0, v1, :cond_1

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Lud/a;

    .line 43
    .line 44
    invoke-static {p0}, Lqe/c;->j(Lud/a;)Lud/a;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 50
    :cond_2
    return-object p0
.end method

.method public static k(Lud/r;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Lud/r;->D:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lqd/s;

    .line 18
    .line 19
    iget-object v0, v0, Lqd/s;->l:Lp4/t;

    .line 20
    .line 21
    iget-object v0, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lqd/j;

    .line 24
    .line 25
    invoke-virtual {v0}, Lqd/j;->w()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_1
    const/4 p0, 0x1

    .line 34
    return p0
.end method

.method public static l(Lud/r;Lpd/q;Z)I
    .locals 13

    .line 1
    iget-object v0, p1, Lud/p;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    move v3, v2

    .line 10
    :goto_0
    if-ge v2, v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {p1, v2}, Lpd/q;->j0(I)Lqd/r;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    iget-object v5, p1, Lpd/q;->o:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Lud/a;

    .line 23
    .line 24
    invoke-static {v5}, Lqe/c;->j(Lud/a;)Lud/a;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    if-nez v6, :cond_0

    .line 29
    .line 30
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string p2, "Failed to insert an additional move for type inference into block "

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0, p1}, Lnd/b0;->I(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return v1

    .line 44
    :cond_0
    iget-object v5, v4, Lqd/r;->m:Lqd/s;

    .line 45
    .line 46
    iget-object v7, v5, Lqd/s;->i:Lqd/r;

    .line 47
    .line 48
    invoke-virtual {v7}, Lqd/r;->f0()Lud/p;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    sget-object v8, Lpd/k;->m:Lpd/k;

    .line 53
    .line 54
    const/4 v9, 0x1

    .line 55
    if-eqz v7, :cond_1

    .line 56
    .line 57
    iget-object v7, v7, Lud/p;->k:Lpd/k;

    .line 58
    .line 59
    sget-object v10, Lpd/k;->g:Lpd/k;

    .line 60
    .line 61
    if-eq v7, v10, :cond_2

    .line 62
    .line 63
    if-ne v7, v8, :cond_1

    .line 64
    .line 65
    iget-object v5, v5, Lqd/s;->j:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-ne v5, v9, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 75
    .line 76
    if-eqz p2, :cond_2

    .line 77
    .line 78
    iget-object v5, v4, Lqd/r;->m:Lqd/s;

    .line 79
    .line 80
    iget v7, v4, Lqd/r;->l:I

    .line 81
    .line 82
    const/4 v10, 0x0

    .line 83
    iget-object v11, v4, Lqd/l;->i:Lqd/j;

    .line 84
    .line 85
    invoke-virtual {v4, v7, v11, v10}, Lqd/r;->d0(ILqd/j;Lqd/s;)Lqd/r;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    invoke-virtual {p0, v10}, Lud/r;->b0(Lqd/r;)Lqd/s;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    iget-object v12, v4, Lqd/l;->i:Lqd/j;

    .line 94
    .line 95
    invoke-virtual {v4, v7, v12, v5}, Lqd/r;->d0(ILqd/j;Lqd/s;)Lqd/r;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    new-instance v12, Lud/p;

    .line 100
    .line 101
    invoke-direct {v12, v8, v9}, Lud/p;-><init>(Lpd/k;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12, v10}, Lud/p;->d0(Lqd/r;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v12, v5}, Lud/p;->I(Lqd/l;)V

    .line 108
    .line 109
    .line 110
    sget-object v5, Lmd/a;->m:Lmd/a;

    .line 111
    .line 112
    invoke-virtual {v12, v5}, Lmd/e;->w(Lmd/a;)V

    .line 113
    .line 114
    .line 115
    iget-object v5, v6, Lud/a;->l:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    iget-object v5, v4, Lqd/l;->i:Lqd/j;

    .line 121
    .line 122
    invoke-virtual {v4, v7, v5, v11}, Lqd/r;->d0(ILqd/j;Lqd/s;)Lqd/r;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-virtual {p1, v4, v5}, Lpd/q;->b0(Lqd/l;Lqd/l;)Z

    .line 127
    .line 128
    .line 129
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_3
    return v3
.end method

.method public static m(Lud/r;Lqd/r;Lqd/j;)Lpd/j;
    .locals 6

    .line 1
    iget-object v0, p1, Lqd/l;->j:Lud/p;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-object v1, v0, Lud/p;->k:Lpd/k;

    .line 6
    .line 7
    sget-object v2, Lpd/k;->X:Lpd/k;

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v2, Lpd/k;->v:Lpd/k;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-ne v1, v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Lud/p;->S(I)Lqd/l;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Lqd/l;->Q()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object v1, p0, Lud/r;->z:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {p0, v0, v1}, La/a;->S(Lud/r;Lud/p;Ljava/util/List;)Lud/a;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-virtual {p1, p0}, Lqd/r;->e0(Lud/r;)Lqd/r;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p1}, Lqd/r;->c0()Lqd/r;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    new-instance v4, Lpd/j;

    .line 46
    .line 47
    sget-object v5, Lpd/k;->A:Lpd/k;

    .line 48
    .line 49
    invoke-direct {v4, v5, p2, v3}, Lpd/j;-><init>(Lpd/k;Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, p0}, Lud/p;->d0(Lqd/r;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v2}, Lud/p;->I(Lqd/l;)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lmd/a;->m:Lmd/a;

    .line 59
    .line 60
    invoke-virtual {v4, p0}, Lmd/e;->w(Lmd/a;)V

    .line 61
    .line 62
    .line 63
    iget-object p0, v4, Lud/p;->l:Lqd/r;

    .line 64
    .line 65
    invoke-virtual {p0}, Lqd/r;->c0()Lqd/r;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {v0, p1, p0}, Lud/p;->b0(Lqd/l;Lqd/l;)Z

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v0}, La/a;->Y(Lud/a;Lud/p;)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    const/4 p1, -0x1

    .line 77
    if-ne p0, p1, :cond_3

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    iget-object p1, v1, Lud/a;->l:Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-virtual {p1, p0, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-object v4

    .line 86
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 87
    return-object p0
.end method

.method public static n(Lqd/j;Lqd/s;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Lqd/a;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    new-instance p1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lqd/j;->g()Lqd/j;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-static {p0, v0}, Lqe/c;->n(Lqd/j;Lqd/s;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lqd/j;

    .line 37
    .line 38
    new-instance v1, Lqd/a;

    .line 39
    .line 40
    invoke-direct {v1, v0}, Lqd/a;-><init>(Lqd/j;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return-object p1

    .line 48
    :cond_1
    if-eqz p1, :cond_4

    .line 49
    .line 50
    iget-object p1, p1, Lqd/s;->l:Lp4/t;

    .line 51
    .line 52
    iget-object p1, p1, Lp4/t;->i:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Ljava/util/LinkedHashSet;

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Lqe/d;

    .line 71
    .line 72
    invoke-interface {v0}, Lqe/d;->getType()Lqd/j;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Lqd/j;->v()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_3

    .line 81
    .line 82
    instance-of v0, v0, Lqd/a;

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    :cond_3
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lqd/j;->n()[Lqd/q;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    array-length v0, p0

    .line 99
    const/4 v1, 0x0

    .line 100
    :goto_1
    if-ge v1, v0, :cond_6

    .line 101
    .line 102
    aget-object v2, p0, v1

    .line 103
    .line 104
    sget-object v3, Lqd/q;->t:Lqd/q;

    .line 105
    .line 106
    if-ne v2, v3, :cond_5

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    invoke-static {v2}, Lqd/j;->d(Lqd/q;)Lqd/d;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_6
    return-object p1
.end method

.method public static q(Lud/r;Lqd/s;Z)Z
    .locals 13

    .line 1
    iget-object v0, p1, Lqd/s;->l:Lp4/t;

    .line 2
    .line 3
    iget-object v0, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lqd/j;

    .line 6
    .line 7
    invoke-virtual {v0}, Lqd/j;->w()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_f

    .line 13
    .line 14
    invoke-virtual {p1}, Lqd/s;->i()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_0
    iget-object v0, p1, Lqd/s;->i:Lqd/r;

    .line 23
    .line 24
    iget-object v0, v0, Lqd/l;->j:Lud/p;

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_1
    iget-object v2, v0, Lud/p;->k:Lpd/k;

    .line 31
    .line 32
    sget-object v3, Lpd/k;->K:Lpd/k;

    .line 33
    .line 34
    if-eq v2, v3, :cond_2

    .line 35
    .line 36
    sget-object v3, Lpd/k;->M:Lpd/k;

    .line 37
    .line 38
    if-eq v2, v3, :cond_2

    .line 39
    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :cond_2
    iget-object v0, v0, Lud/p;->l:Lqd/r;

    .line 43
    .line 44
    iget-object v0, v0, Lqd/l;->i:Lqd/j;

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    if-eqz p2, :cond_e

    .line 48
    .line 49
    iget-object p2, p1, Lqd/s;->j:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    move v3, v1

    .line 56
    :cond_3
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_d

    .line 61
    .line 62
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Lqd/r;

    .line 67
    .line 68
    iget-object v4, v4, Lqd/l;->j:Lud/p;

    .line 69
    .line 70
    sget-object v5, Lpd/k;->O:Lpd/k;

    .line 71
    .line 72
    invoke-static {v4, v5}, Lxe/m;->j(Lud/p;Lpd/k;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-nez v5, :cond_5

    .line 77
    .line 78
    :cond_4
    :goto_1
    move v4, v1

    .line 79
    goto/16 :goto_4

    .line 80
    .line 81
    :cond_5
    check-cast v4, Lpd/n;

    .line 82
    .line 83
    invoke-virtual {v4}, Lpd/n;->k0()Lqd/l;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    if-eqz v5, :cond_4

    .line 88
    .line 89
    instance-of v6, v5, Lqd/r;

    .line 90
    .line 91
    if-eqz v6, :cond_6

    .line 92
    .line 93
    move-object v6, v5

    .line 94
    check-cast v6, Lqd/r;

    .line 95
    .line 96
    iget-object v6, v6, Lqd/r;->m:Lqd/s;

    .line 97
    .line 98
    invoke-static {v6, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    goto :goto_2

    .line 103
    :cond_6
    move v6, v1

    .line 104
    :goto_2
    if-nez v6, :cond_7

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_7
    iget-object v6, p0, Lud/r;->l:Lud/e;

    .line 108
    .line 109
    iget-object v6, v6, Lud/e;->k:Lud/u;

    .line 110
    .line 111
    iget-object v6, v6, Lud/u;->h:Lfe/a;

    .line 112
    .line 113
    invoke-virtual {v6, v4}, Lfe/a;->g(Lpd/b;)Lud/m;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    if-nez v6, :cond_8

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_8
    iget-object v4, v4, Lud/p;->m:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    const/4 v7, -0x1

    .line 127
    move v8, v1

    .line 128
    :cond_9
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    if-eqz v9, :cond_c

    .line 133
    .line 134
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    check-cast v9, Lqd/l;

    .line 139
    .line 140
    if-ne v9, v5, :cond_a

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 144
    .line 145
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    instance-of v10, v9, Lqd/r;

    .line 149
    .line 150
    if-nez v10, :cond_b

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_b
    invoke-interface {v6}, Lud/m;->c()Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    invoke-interface {v10, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    check-cast v10, Lqd/j;

    .line 162
    .line 163
    invoke-virtual {v9}, Lqd/l;->I()Lqd/j;

    .line 164
    .line 165
    .line 166
    move-result-object v11

    .line 167
    iget-object v12, p0, Lud/r;->l:Lud/e;

    .line 168
    .line 169
    iget-object v12, v12, Lud/e;->k:Lud/u;

    .line 170
    .line 171
    iget-object v12, v12, Lud/u;->i:Lfe/a;

    .line 172
    .line 173
    invoke-virtual {v12, v0, v11, v10}, Lfe/a;->l(Lqd/j;Lqd/j;Lqd/j;)Lqd/j;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    if-eqz v10, :cond_9

    .line 178
    .line 179
    invoke-virtual {v10, v11}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    if-nez v11, :cond_9

    .line 184
    .line 185
    check-cast v9, Lqd/r;

    .line 186
    .line 187
    invoke-static {p0, v9, v10}, Lqe/c;->m(Lud/r;Lqd/r;Lqd/j;)Lpd/j;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    if-eqz v9, :cond_9

    .line 192
    .line 193
    sget-object v10, Lmd/a;->X:Lmd/a;

    .line 194
    .line 195
    invoke-virtual {v9, v10}, Lmd/e;->w(Lmd/a;)V

    .line 196
    .line 197
    .line 198
    add-int/lit8 v8, v8, 0x1

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_c
    if-lez v8, :cond_4

    .line 202
    .line 203
    move v4, v2

    .line 204
    :goto_4
    if-eqz v4, :cond_3

    .line 205
    .line 206
    move v3, v2

    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :cond_d
    return v3

    .line 210
    :cond_e
    invoke-virtual {p1, v0}, Lqd/s;->n(Lqd/j;)V

    .line 211
    .line 212
    .line 213
    return v2

    .line 214
    :cond_f
    :goto_5
    return v1
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "FixTypesVisitor"

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Lud/u;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lud/u;->g:Lqe/x;

    .line 6
    .line 7
    iput-object v2, v0, Lqe/c;->h:Lqe/x;

    .line 8
    .line 9
    iget-object v2, v0, Lqe/c;->g:Lqe/n;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Lqe/n;->f(Lud/u;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lqe/b;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, v0, v2}, Lqe/b;-><init>(Lqe/c;I)V

    .line 18
    .line 19
    .line 20
    new-instance v3, Lqe/b;

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-direct {v3, v0, v4}, Lqe/b;-><init>(Lqe/c;I)V

    .line 24
    .line 25
    .line 26
    new-instance v5, Lqe/b;

    .line 27
    .line 28
    const/4 v6, 0x2

    .line 29
    invoke-direct {v5, v0, v6}, Lqe/b;-><init>(Lqe/c;I)V

    .line 30
    .line 31
    .line 32
    new-instance v7, Lqe/b;

    .line 33
    .line 34
    const/4 v8, 0x3

    .line 35
    invoke-direct {v7, v0, v8}, Lqe/b;-><init>(Lqe/c;I)V

    .line 36
    .line 37
    .line 38
    new-instance v9, Lqe/b;

    .line 39
    .line 40
    const/4 v10, 0x4

    .line 41
    invoke-direct {v9, v0, v10}, Lqe/b;-><init>(Lqe/c;I)V

    .line 42
    .line 43
    .line 44
    new-instance v11, Lqe/b;

    .line 45
    .line 46
    const/4 v12, 0x5

    .line 47
    invoke-direct {v11, v0, v12}, Lqe/b;-><init>(Lqe/c;I)V

    .line 48
    .line 49
    .line 50
    new-instance v13, Lqe/b;

    .line 51
    .line 52
    const/4 v14, 0x6

    .line 53
    invoke-direct {v13, v0, v14}, Lqe/b;-><init>(Lqe/c;I)V

    .line 54
    .line 55
    .line 56
    new-instance v15, Lqe/b;

    .line 57
    .line 58
    move/from16 p1, v2

    .line 59
    .line 60
    const/4 v2, 0x7

    .line 61
    invoke-direct {v15, v0, v2}, Lqe/b;-><init>(Lqe/c;I)V

    .line 62
    .line 63
    .line 64
    move/from16 v16, v2

    .line 65
    .line 66
    new-instance v2, Lme/a;

    .line 67
    .line 68
    invoke-direct {v2, v0}, Lme/a;-><init>(Lqe/c;)V

    .line 69
    .line 70
    .line 71
    move/from16 v17, v4

    .line 72
    .line 73
    new-instance v4, Lqe/b;

    .line 74
    .line 75
    move/from16 v18, v6

    .line 76
    .line 77
    const/16 v6, 0x8

    .line 78
    .line 79
    invoke-direct {v4, v0, v6}, Lqe/b;-><init>(Lqe/c;I)V

    .line 80
    .line 81
    .line 82
    move/from16 v19, v6

    .line 83
    .line 84
    const/16 v6, 0xa

    .line 85
    .line 86
    new-array v6, v6, [Ljava/util/function/Function;

    .line 87
    .line 88
    aput-object v1, v6, p1

    .line 89
    .line 90
    aput-object v3, v6, v17

    .line 91
    .line 92
    aput-object v5, v6, v18

    .line 93
    .line 94
    aput-object v7, v6, v8

    .line 95
    .line 96
    aput-object v9, v6, v10

    .line 97
    .line 98
    aput-object v11, v6, v12

    .line 99
    .line 100
    aput-object v13, v6, v14

    .line 101
    .line 102
    aput-object v15, v6, v16

    .line 103
    .line 104
    aput-object v2, v6, v19

    .line 105
    .line 106
    const/16 v1, 0x9

    .line 107
    .line 108
    aput-object v4, v6, v1

    .line 109
    .line 110
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    iput-object v1, v0, Lqe/c;->i:Ljava/util/List;

    .line 115
    .line 116
    return-void
.end method

.method public final g(Lud/r;)V
    .locals 2

    .line 1
    iget-boolean v0, p1, Lud/r;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    invoke-static {p1}, Lqe/c;->k(Lud/r;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    :try_start_0
    iget-object v0, p0, Lqe/c;->i:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/util/function/Function;

    .line 29
    .line 30
    invoke-interface {v1, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-static {p1}, Lqe/c;->k(Lud/r;)Z

    .line 43
    .line 44
    .line 45
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catch_0
    move-exception v0

    .line 50
    const-string v1, "Types fix failed"

    .line 51
    .line 52
    invoke-static {p1, v1, v0}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    return-void
.end method

.method public final i(Lud/r;Lqd/s;)Z
    .locals 3

    .line 1
    iget-object v0, p2, Lqd/s;->l:Lp4/t;

    .line 2
    .line 3
    iget-object v0, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lqe/c;->o(Ljava/util/LinkedHashSet;)Ljava/util/Optional;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v0}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lqd/j;

    .line 23
    .line 24
    iget-object v1, p0, Lqe/c;->h:Lqe/x;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget-object v2, Lqe/a0;->b:Lqe/a0;

    .line 30
    .line 31
    invoke-virtual {v1, p1, p2, v0, v2}, Lqe/x;->c(Lud/r;Lqd/s;Lqd/j;Lqe/a0;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const/4 p2, 0x1

    .line 36
    if-ne p1, p2, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v0, 0x3

    .line 40
    if-ne p1, v0, :cond_2

    .line 41
    .line 42
    return p2

    .line 43
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 44
    return p1
.end method

.method public final o(Ljava/util/LinkedHashSet;)Ljava/util/Optional;
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lme/a;

    .line 6
    .line 7
    const/16 v1, 0x9

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lme/a;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, La7/b;

    .line 17
    .line 18
    const/16 v1, 0xb

    .line 19
    .line 20
    invoke-direct {v0, v1}, La7/b;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v0, p0, Lqe/c;->h:Lqe/x;

    .line 28
    .line 29
    iget-object v0, v0, Lqe/x;->c:Lqe/k;

    .line 30
    .line 31
    iget-object v0, v0, Lqe/k;->b:Lc9/a0;

    .line 32
    .line 33
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->max(Ljava/util/Comparator;)Ljava/util/Optional;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method

.method public final p(Lud/r;)Z
    .locals 12

    .line 1
    iget-object v0, p1, Lud/r;->D:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_f

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lqd/s;

    .line 20
    .line 21
    invoke-virtual {v3}, Lqd/s;->i()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    iget-object v5, v3, Lqd/s;->l:Lp4/t;

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    if-eqz v4, :cond_2

    .line 29
    .line 30
    :cond_1
    :goto_1
    move v3, v1

    .line 31
    goto/16 :goto_8

    .line 32
    .line 33
    :cond_2
    iget-object v4, v5, Lp4/t;->h:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, Lqd/j;

    .line 36
    .line 37
    invoke-virtual {v4}, Lqd/j;->w()Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_3

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    :try_start_0
    invoke-virtual {p0, p1, v3}, Lqe/c;->i(Lud/r;Lqd/s;)Z

    .line 45
    .line 46
    .line 47
    move-result v7
    :try_end_0
    .catch Laf/f; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    goto :goto_2

    .line 49
    :catch_0
    move-exception v7

    .line 50
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    const-string v9, "Failed to calculate best type for var: "

    .line 55
    .line 56
    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    invoke-virtual {p1, v8, v7}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    move v7, v1

    .line 64
    :goto_2
    if-eqz v7, :cond_4

    .line 65
    .line 66
    :goto_3
    move v3, v6

    .line 67
    goto/16 :goto_8

    .line 68
    .line 69
    :cond_4
    invoke-static {v4, v3}, Lqe/c;->n(Lqd/j;Lqd/s;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    const/4 v8, 0x3

    .line 78
    if-eqz v7, :cond_6

    .line 79
    .line 80
    :cond_5
    move v4, v1

    .line 81
    goto :goto_4

    .line 82
    :cond_6
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_5

    .line 91
    .line 92
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    check-cast v7, Lqd/j;

    .line 97
    .line 98
    iget-object v9, p0, Lqe/c;->h:Lqe/x;

    .line 99
    .line 100
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    sget-object v10, Lqe/a0;->b:Lqe/a0;

    .line 104
    .line 105
    invoke-virtual {v9, p1, v3, v7, v10}, Lqe/x;->c(Lud/r;Lqd/s;Lqd/j;Lqe/a0;)I

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    if-ne v7, v8, :cond_7

    .line 110
    .line 111
    move v4, v6

    .line 112
    :goto_4
    if-eqz v4, :cond_8

    .line 113
    .line 114
    :goto_5
    goto :goto_3

    .line 115
    :cond_8
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 116
    .line 117
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 118
    .line 119
    .line 120
    iget-object v5, v5, Lp4/t;->i:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v5, Ljava/util/LinkedHashSet;

    .line 123
    .line 124
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    :cond_9
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    if-eqz v7, :cond_a

    .line 133
    .line 134
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    check-cast v7, Lqe/d;

    .line 139
    .line 140
    invoke-interface {v7}, Lqe/d;->getType()Lqd/j;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-virtual {v7}, Lqd/j;->w()Z

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    if-eqz v9, :cond_9

    .line 149
    .line 150
    invoke-virtual {v7}, Lqd/j;->v()Z

    .line 151
    .line 152
    .line 153
    move-result v9

    .line 154
    if-eqz v9, :cond_9

    .line 155
    .line 156
    invoke-interface {v4, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_a
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-eqz v5, :cond_c

    .line 165
    .line 166
    :cond_b
    move v3, v1

    .line 167
    goto :goto_7

    .line 168
    :cond_c
    iget-object v5, p1, Lud/r;->l:Lud/e;

    .line 169
    .line 170
    iget-object v5, v5, Lud/e;->k:Lud/u;

    .line 171
    .line 172
    iget-object v5, v5, Lud/u;->s:Led/c;

    .line 173
    .line 174
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    :cond_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v7

    .line 182
    if-eqz v7, :cond_b

    .line 183
    .line 184
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    check-cast v7, Lqd/j;

    .line 189
    .line 190
    invoke-virtual {v7}, Lqd/j;->l()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    invoke-virtual {v5, v7}, Led/c;->d(Ljava/lang/String;)Ljava/util/Set;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    :cond_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    if-eqz v9, :cond_d

    .line 207
    .line 208
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    check-cast v9, Ljava/lang/String;

    .line 213
    .line 214
    invoke-static {v9}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    iget-object v10, p0, Lqe/c;->h:Lqe/x;

    .line 219
    .line 220
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    sget-object v11, Lqe/a0;->c:Lqe/a0;

    .line 224
    .line 225
    invoke-virtual {v10, p1, v3, v9, v11}, Lqe/x;->c(Lud/r;Lqd/s;Lqd/j;Lqe/a0;)I

    .line 226
    .line 227
    .line 228
    move-result v9

    .line 229
    if-ne v9, v8, :cond_e

    .line 230
    .line 231
    move v3, v6

    .line 232
    :goto_7
    if-eqz v3, :cond_1

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :goto_8
    if-eqz v3, :cond_0

    .line 236
    .line 237
    move v2, v6

    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :catch_1
    move-exception p1

    .line 241
    throw p1

    .line 242
    :cond_f
    return v2
.end method
