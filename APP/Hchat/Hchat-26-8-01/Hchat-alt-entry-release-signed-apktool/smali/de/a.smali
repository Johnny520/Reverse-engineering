.class public final Lde/a;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lde/a;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static i(Lud/r;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lud/r;->D:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Lce/d;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    invoke-direct {v1, p0, v2}, Lce/d;-><init>(Lud/r;I)V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lud/r;->Z()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_2

    .line 19
    .line 20
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object v1, p0, Lud/r;->C:Lud/a;

    .line 23
    .line 24
    iget-object v1, v1, Lud/a;->m:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lud/r;->C:Lud/a;

    .line 34
    .line 35
    iget-object v1, v1, Lud/a;->m:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const/4 v2, 0x0

    .line 42
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lud/a;

    .line 53
    .line 54
    invoke-static {v3}, La/a;->c0(Lud/h;)Lud/p;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    sget-object v4, Lmd/a;->o:Lmd/a;

    .line 61
    .line 62
    iget-object v5, v3, Lmd/e;->g:Lmd/f;

    .line 63
    .line 64
    invoke-virtual {v5, v4}, Lmd/f;->a(Lmd/a;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_2

    .line 69
    .line 70
    move-object v2, v3

    .line 71
    goto :goto_0

    .line 72
    :cond_2
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    if-eqz v2, :cond_5

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_5

    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lud/p;

    .line 93
    .line 94
    const/4 v3, 0x0

    .line 95
    invoke-virtual {v2, v3}, Lud/p;->S(I)Lqd/l;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v1, v3}, Lud/p;->S(I)Lqd/l;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    instance-of v5, v4, Lqd/r;

    .line 107
    .line 108
    if-eqz v5, :cond_4

    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    instance-of v5, v3, Lqd/r;

    .line 114
    .line 115
    if-eqz v5, :cond_4

    .line 116
    .line 117
    check-cast v4, Lqd/r;

    .line 118
    .line 119
    check-cast v3, Lqd/r;

    .line 120
    .line 121
    iget-object v3, v3, Lqd/r;->m:Lqd/s;

    .line 122
    .line 123
    invoke-virtual {v4}, Lqd/r;->I()Lqd/j;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-virtual {v4}, Lqd/r;->getName()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-static {p0, v3, v5, v4}, Lde/a;->j(Lud/r;Lqd/s;Lqd/j;Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    :cond_4
    iget v3, v2, Lnd/r;->i:I

    .line 135
    .line 136
    iput v3, v1, Lnd/r;->i:I

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_5
    :goto_2
    iget-object v0, p0, Lud/r;->D:Ljava/util/List;

    .line 140
    .line 141
    new-instance v1, Lce/d;

    .line 142
    .line 143
    const/4 v2, 0x4

    .line 144
    invoke-direct {v1, p0, v2}, Lce/d;-><init>(Lud/r;I)V

    .line 145
    .line 146
    .line 147
    invoke-interface {v0, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public static j(Lud/r;Lqd/s;Lqd/j;Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lud/r;->l:Lud/e;

    .line 2
    .line 3
    iget-object v0, v0, Lud/e;->k:Lud/u;

    .line 4
    .line 5
    iget-object v0, v0, Lud/u;->g:Lqe/x;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v1, Lqe/a0;->e:Lqe/a0;

    .line 11
    .line 12
    invoke-virtual {v0, p0, p1, p2, v1}, Lqe/x;->c(Lud/r;Lqd/s;Lqd/j;Lqe/a0;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    const/4 p2, 0x1

    .line 17
    if-ne p0, p2, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_0
    invoke-static {p3}, Lkd/d;->c(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_3

    .line 26
    .line 27
    if-eqz p3, :cond_2

    .line 28
    .line 29
    iget-object p0, p1, Lqd/s;->m:Lqd/k;

    .line 30
    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    iput-object p3, p0, Lqd/k;->a:Ljava/lang/String;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string p1, "CodeVar not initialized for name set in SSAVar: "

    .line 41
    .line 42
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return p0

    .line 51
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    :cond_3
    :goto_0
    return p2
.end method

.method public static k(Lud/r;)V
    .locals 8

    .line 1
    sget-object v0, Loc/c;->j:Loc/c;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lpc/i;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    :try_start_0
    iget-object v1, v0, Lpc/i;->g:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iget-object v3, p0, Lud/r;->k:Lod/d;

    .line 21
    .line 22
    iget-object v3, v3, Lod/d;->i:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eq v2, v3, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    invoke-virtual {p0}, Lud/r;->S()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/4 v3, 0x0

    .line 40
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Lqd/r;

    .line 51
    .line 52
    add-int/lit8 v5, v3, 0x1

    .line 53
    .line 54
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Lpc/h;

    .line 59
    .line 60
    iget-object v6, v3, Lpc/h;->b:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v6}, Lkd/d;->c(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_2

    .line 67
    .line 68
    iget-object v4, v4, Lqd/r;->m:Lqd/s;

    .line 69
    .line 70
    invoke-virtual {v4}, Lqd/s;->b()Lqd/k;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    iput-object v6, v4, Lqd/k;->a:Ljava/lang/String;

    .line 75
    .line 76
    iget v3, v3, Lpc/h;->a:I

    .line 77
    .line 78
    const/16 v6, 0x10

    .line 79
    .line 80
    invoke-static {v3, v6}, Lr9/e0;->G(II)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_2

    .line 85
    .line 86
    const/4 v3, 0x1

    .line 87
    iput-boolean v3, v4, Lqd/k;->d:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catch_0
    move-exception v1

    .line 91
    goto :goto_3

    .line 92
    :cond_2
    :goto_1
    move v3, v5

    .line 93
    goto :goto_0

    .line 94
    :cond_3
    :goto_2
    return-void

    .line 95
    :goto_3
    iget-object v0, v0, Lpc/i;->g:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const-string v2, "Failed to process method parameters attribute: "

    .line 102
    .line 103
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {p0, v0, v1}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method


# virtual methods
.method public final g(Lud/r;)V
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Lmd/b;->m:Lmd/b;

    .line 2
    .line 3
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->b(Loc/a;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lde/a;->i(Lud/r;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lmd/e;->E(Loc/a;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    invoke-static {p1}, Lde/a;->k(Lud/r;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :goto_1
    const-string v1, "Failed to apply debug info"

    .line 25
    .line 26
    invoke-virtual {p1, v1, v0}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
