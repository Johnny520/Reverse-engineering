.class public final Lle/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lud/r;

.field public final b:Li4/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lle/a;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lud/r;Li4/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lle/a;->a:Lud/r;

    .line 5
    .line 6
    iput-object p2, p0, Lle/a;->b:Li4/y;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Lhb/r;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lhb/r;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lze/c;

    .line 4
    .line 5
    iget-object v1, p0, Lhb/r;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/Set;

    .line 8
    .line 9
    iget-object v0, v0, Lze/c;->h:Ljava/util/BitSet;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x1

    .line 16
    sget-object v3, Lmd/a;->z:Lmd/a;

    .line 17
    .line 18
    if-le v0, v2, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lhb/r;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lze/c;

    .line 23
    .line 24
    invoke-virtual {v0}, Lze/c;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    :goto_0
    move-object v2, v0

    .line 29
    check-cast v2, Lze/b;

    .line 30
    .line 31
    invoke-virtual {v2}, Lze/b;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2}, Lze/b;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lud/a;

    .line 42
    .line 43
    invoke-virtual {p0}, Lhb/r;->j()Lud/a;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    if-eq v2, v4, :cond_0

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Lmd/e;->w(Lmd/a;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_2

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Lud/a;

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Lmd/e;->w(Lmd/a;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 80
    .line 81
    .line 82
    :cond_3
    iget-object p0, p0, Lhb/r;->h:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p0, Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Lud/p;

    .line 101
    .line 102
    sget-object v1, Lmd/a;->O:Lmd/a;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Lmd/e;->w(Lmd/a;)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    return-void
.end method

.method public static b(Lud/r;Lud/a;)Lud/a;
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p1, Lud/a;->r:Ljava/util/BitSet;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/a;->q(Lud/r;Ljava/util/BitSet;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lud/a;

    .line 25
    .line 26
    sget-object v2, Lmd/b;->E:Lmd/b;

    .line 27
    .line 28
    iget-object v1, v1, Lmd/e;->g:Lmd/f;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lae/c;

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    iget-object v1, v1, Lae/c;->g:Lae/f;

    .line 40
    .line 41
    iget-object v2, v1, Lae/f;->g:Lae/h;

    .line 42
    .line 43
    iget-object v2, v2, Lae/h;->m:Lud/a;

    .line 44
    .line 45
    iget-object v3, p1, Lud/a;->p:Ljava/util/BitSet;

    .line 46
    .line 47
    iget v2, v2, Lud/a;->j:I

    .line 48
    .line 49
    invoke-virtual {v3, v2}, Ljava/util/BitSet;->get(I)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    invoke-static {v1, p0}, La/a;->k0(Lae/f;Lud/r;)Lud/a;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 61
    return-object p0
.end method

.method public static c(Lud/a;Lud/a;Ljava/util/Set;Lud/r;)Lud/a;
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    invoke-static {p0, p1}, La/a;->p0(Lud/a;Lud/a;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_1
    invoke-static {p0, p1}, La/a;->n0(Lud/a;Lud/a;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    sget-object p3, Lmd/a;->u:Lmd/a;

    .line 21
    .line 22
    invoke-virtual {p0, p3}, Lmd/e;->w(Lmd/a;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_2
    invoke-static {p3, p0, p1}, La/a;->h0(Lud/r;Lud/a;Lud/a;)Lud/a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    new-instance v1, Lae/g;

    .line 39
    .line 40
    const/16 v2, 0xa

    .line 41
    .line 42
    invoke-direct {v1, p2, v2}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    invoke-static {p3, p0, v0, v1}, La/a;->c1(Lud/r;Lud/a;Lud/a;Ljava/util/function/Consumer;)V

    .line 46
    .line 47
    .line 48
    new-instance p0, Lae/g;

    .line 49
    .line 50
    const/16 v1, 0xa

    .line 51
    .line 52
    invoke-direct {p0, p2, v1}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    invoke-static {p3, p1, v0, p0}, La/a;->c1(Lud/r;Lud/a;Lud/a;Ljava/util/function/Consumer;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p2, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_3
    invoke-static {p0}, La/a;->K(Lud/a;)Lud/a;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    invoke-static {p1}, La/a;->K(Lud/a;)Lud/a;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p3, v0}, Lud/a;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_5

    .line 75
    .line 76
    invoke-static {p3, v0}, La/a;->p0(Lud/a;Lud/a;)Z

    .line 77
    .line 78
    .line 79
    move-result p3

    .line 80
    if-eqz p3, :cond_4

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    const-string p0, "Unexpected merge pattern"

    .line 84
    .line 85
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const/4 p0, 0x0

    .line 89
    return-object p0

    .line 90
    :cond_5
    :goto_0
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    :goto_1
    invoke-static {p0}, La/a;->e0(Lud/a;)Lud/a;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    if-nez p0, :cond_7

    .line 101
    .line 102
    :goto_2
    invoke-static {p1}, La/a;->e0(Lud/a;)Lud/a;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-nez p1, :cond_6

    .line 107
    .line 108
    return-object v0

    .line 109
    :cond_6
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_7
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_1
.end method

.method public static d(Lhb/r;Lud/a;)Lhb/r;
    .locals 3

    .line 1
    iget-object v0, p1, Lud/a;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lhb/r;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lze/c;

    .line 14
    .line 15
    iget-object v1, p1, Lud/a;->m:Ljava/util/List;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lud/a;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Lze/c;->b(Lud/a;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return-object p0

    .line 44
    :cond_2
    :goto_0
    invoke-static {p0, p1}, Lle/a;->e(Lhb/r;Lud/a;)Lhb/r;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public static e(Lhb/r;Lud/a;)Lhb/r;
    .locals 11

    .line 1
    iget-object v0, p0, Lhb/r;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lud/r;

    .line 4
    .line 5
    if-eqz p1, :cond_c

    .line 6
    .line 7
    sget-object v1, Lmd/b;->z:Lmd/b;

    .line 8
    .line 9
    iget-object v2, p1, Lmd/e;->g:Lmd/f;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Lmd/f;->b(Loc/a;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_c

    .line 16
    .line 17
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 18
    .line 19
    sget-object v2, Lmd/a;->z:Lmd/a;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    invoke-static {p1}, La/a;->c0(Lud/h;)Lud/p;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    iget-object v1, v1, Lud/p;->k:Lpd/k;

    .line 36
    .line 37
    sget-object v3, Lpd/k;->v:Lpd/k;

    .line 38
    .line 39
    if-ne v1, v3, :cond_1

    .line 40
    .line 41
    invoke-static {v0, p1}, Lle/a;->g(Lud/r;Lud/a;)Lhb/r;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_1
    iget-object v1, p1, Lud/a;->n:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/4 v4, 0x1

    .line 53
    if-eq v3, v4, :cond_2

    .line 54
    .line 55
    goto/16 :goto_3

    .line 56
    .line 57
    :cond_2
    const/4 v3, 0x0

    .line 58
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lud/a;

    .line 63
    .line 64
    iget-object v5, v1, Lud/a;->m:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-ne v5, v4, :cond_c

    .line 71
    .line 72
    iget-object v5, v1, Lmd/e;->g:Lmd/f;

    .line 73
    .line 74
    invoke-virtual {v5, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    goto/16 :goto_3

    .line 81
    .line 82
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    iget-object v5, p1, Lud/a;->l:Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_4

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    move v6, v4

    .line 101
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-eqz v7, :cond_9

    .line 106
    .line 107
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    check-cast v7, Lud/p;

    .line 112
    .line 113
    iget-object v8, v7, Lud/p;->l:Lqd/r;

    .line 114
    .line 115
    if-nez v8, :cond_5

    .line 116
    .line 117
    :goto_1
    move v4, v3

    .line 118
    goto :goto_2

    .line 119
    :cond_5
    iget-object v8, v8, Lqd/r;->m:Lqd/s;

    .line 120
    .line 121
    iget-object v8, v8, Lqd/s;->j:Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    if-nez v9, :cond_6

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_6
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    check-cast v8, Lqd/l;

    .line 135
    .line 136
    iget-object v8, v8, Lqd/l;->j:Lud/p;

    .line 137
    .line 138
    invoke-static {p1, v8}, La/a;->s(Lud/a;Lud/p;)Z

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    if-nez v10, :cond_7

    .line 143
    .line 144
    invoke-static {v1, v8}, La/a;->s(Lud/a;Lud/p;)Z

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    if-nez v8, :cond_7

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_7
    if-le v9, v4, :cond_8

    .line 152
    .line 153
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_8
    move v6, v3

    .line 158
    goto :goto_0

    .line 159
    :cond_9
    move v4, v6

    .line 160
    :goto_2
    if-nez v4, :cond_a

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_a
    invoke-static {v0, v1}, Lle/a;->g(Lud/r;Lud/a;)Lhb/r;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    if-nez p1, :cond_b

    .line 168
    .line 169
    invoke-static {p0, v1}, Lle/a;->e(Lhb/r;Lud/a;)Lhb/r;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    return-object p0

    .line 174
    :cond_b
    iget-object p0, p1, Lhb/r;->h:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p0, Ljava/util/List;

    .line 177
    .line 178
    invoke-interface {p0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 179
    .line 180
    .line 181
    return-object p1

    .line 182
    :cond_c
    :goto_3
    const/4 p0, 0x0

    .line 183
    return-object p0
.end method

.method public static f(Lhb/r;Lud/a;)Z
    .locals 8

    .line 1
    sget-object v0, Lmd/a;->k:Lmd/a;

    .line 2
    .line 3
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sget-object v1, Lmd/a;->l:Lmd/a;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-object v0, p1, Lud/a;->m:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ne v0, v3, :cond_2

    .line 22
    .line 23
    iget-object v0, p1, Lud/a;->m:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lud/a;

    .line 30
    .line 31
    iget-object v4, v0, Lmd/e;->g:Lmd/f;

    .line 32
    .line 33
    invoke-virtual {v4, v1}, Lmd/f;->a(Lmd/a;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    iget-object v4, p1, Lmd/e;->g:Lmd/f;

    .line 40
    .line 41
    sget-object v5, Lmd/b;->z:Lmd/b;

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    iget-object v0, v0, Lmd/e;->g:Lmd/f;

    .line 48
    .line 49
    invoke-virtual {v0, v5}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_2

    .line 62
    .line 63
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Lnd/t;

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_0

    .line 78
    .line 79
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    check-cast v7, Lnd/t;

    .line 84
    .line 85
    if-ne v5, v7, :cond_1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    iget-object v0, p0, Lhb/r;->i:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Lud/a;

    .line 91
    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    if-ne p1, v0, :cond_3

    .line 95
    .line 96
    :goto_0
    return v3

    .line 97
    :cond_3
    return v2

    .line 98
    :cond_4
    iget-object p1, p1, Lud/a;->m:Ljava/util/List;

    .line 99
    .line 100
    iget-object p0, p0, Lhb/r;->d:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p0, Lze/c;

    .line 103
    .line 104
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    :cond_5
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_7

    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Lud/a;

    .line 119
    .line 120
    iget-object v4, v0, Lmd/e;->g:Lmd/f;

    .line 121
    .line 122
    invoke-virtual {v4, v1}, Lmd/f;->a(Lmd/a;)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-eqz v4, :cond_6

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_6
    invoke-static {v0}, La/a;->O0(Lud/a;)Lud/a;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {p0, v0}, Lze/c;->b(Lud/a;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-nez v0, :cond_5

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    move v2, v3

    .line 141
    :goto_2
    xor-int/lit8 p0, v2, 0x1

    .line 142
    .line 143
    return p0
.end method

.method public static g(Lud/r;Lud/a;)Lhb/r;
    .locals 4

    .line 1
    invoke-static {p1}, La/a;->c0(Lud/h;)Lud/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, v0, Lud/p;->k:Lpd/k;

    .line 8
    .line 9
    sget-object v2, Lpd/k;->v:Lpd/k;

    .line 10
    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    check-cast v0, Lpd/i;

    .line 15
    .line 16
    new-instance v1, Lyd/b;

    .line 17
    .line 18
    new-instance v2, Lxe/e;

    .line 19
    .line 20
    invoke-direct {v2, v0}, Lxe/e;-><init>(Lpd/i;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v2}, Lyd/b;-><init>(Lxe/e;)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lhb/r;

    .line 27
    .line 28
    iget-object v3, v0, Lpd/i;->q:Lud/a;

    .line 29
    .line 30
    iget-object v0, v0, Lpd/i;->r:Lud/a;

    .line 31
    .line 32
    invoke-direct {v2, p0, v1, v3, v0}, Lhb/r;-><init>(Lud/r;Lyd/b;Lud/a;Lud/a;)V

    .line 33
    .line 34
    .line 35
    iget-object p0, v2, Lhb/r;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Lze/c;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lze/c;->a(Lud/a;)V

    .line 40
    .line 41
    .line 42
    return-object v2

    .line 43
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 44
    return-object p0
.end method

.method public static h(Lhb/r;)Lhb/r;
    .locals 11

    .line 1
    iget-object v0, p0, Lhb/r;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lud/a;

    .line 4
    .line 5
    iget-object v1, p0, Lhb/r;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lud/a;

    .line 8
    .line 9
    iget-object v2, p0, Lhb/r;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lud/a;

    .line 12
    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_7

    .line 16
    .line 17
    :cond_0
    invoke-static {v0}, La/a;->r0(Lud/a;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_1d

    .line 22
    .line 23
    invoke-static {v2}, La/a;->r0(Lud/a;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    goto/16 :goto_7

    .line 30
    .line 31
    :cond_1
    invoke-static {p0, v0}, Lle/a;->d(Lhb/r;Lud/a;)Lhb/r;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x1

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    move v6, v5

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static {p0, v2}, Lle/a;->d(Lhb/r;Lud/a;)Lhb/r;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-eqz v3, :cond_1d

    .line 46
    .line 47
    move v6, v4

    .line 48
    :goto_0
    iget-object v7, v3, Lhb/r;->h:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v7, Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-nez v7, :cond_4

    .line 57
    .line 58
    iget-object v8, p0, Lhb/r;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v8, Lze/c;

    .line 61
    .line 62
    invoke-virtual {v8}, Lze/c;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    :cond_3
    move-object v9, v8

    .line 67
    check-cast v9, Lze/b;

    .line 68
    .line 69
    invoke-virtual {v9}, Lze/b;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    if-eqz v10, :cond_4

    .line 74
    .line 75
    invoke-virtual {v9}, Lze/b;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    check-cast v9, Lud/a;

    .line 80
    .line 81
    sget-object v10, Lmd/a;->k:Lmd/a;

    .line 82
    .line 83
    iget-object v9, v9, Lmd/e;->g:Lmd/f;

    .line 84
    .line 85
    invoke-virtual {v9, v10}, Lmd/f;->a(Lmd/a;)Z

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    if-eqz v9, :cond_3

    .line 90
    .line 91
    goto/16 :goto_3

    .line 92
    .line 93
    :cond_4
    iget-object v8, v3, Lhb/r;->e:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v8, Lud/a;

    .line 96
    .line 97
    invoke-static {v2, v8}, La/a;->o0(Lud/a;Lud/a;)Z

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-nez v8, :cond_5

    .line 102
    .line 103
    iget-object v8, v3, Lhb/r;->f:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v8, Lud/a;

    .line 106
    .line 107
    invoke-static {v1, v8}, La/a;->o0(Lud/a;Lud/a;)Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    if-eqz v8, :cond_6

    .line 112
    .line 113
    :cond_5
    invoke-static {v3}, Lhb/r;->l(Lhb/r;)Lhb/r;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    :cond_6
    iget-object v8, v3, Lhb/r;->e:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v8, Lud/a;

    .line 120
    .line 121
    invoke-static {v0, v8}, La/a;->o0(Lud/a;Lud/a;)Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    iget-object v9, v3, Lhb/r;->f:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v9, Lud/a;

    .line 128
    .line 129
    invoke-static {v2, v9}, La/a;->o0(Lud/a;Lud/a;)Z

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    if-nez v8, :cond_14

    .line 134
    .line 135
    if-nez v9, :cond_14

    .line 136
    .line 137
    iget-object v4, v0, Lud/a;->o:Ljava/util/List;

    .line 138
    .line 139
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-ne v4, v5, :cond_7

    .line 144
    .line 145
    iget-object v4, v0, Lud/a;->o:Ljava/util/List;

    .line 146
    .line 147
    invoke-interface {v4, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_7

    .line 152
    .line 153
    goto/16 :goto_7

    .line 154
    .line 155
    :cond_7
    iget-object v4, v2, Lud/a;->o:Ljava/util/List;

    .line 156
    .line 157
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    if-ne v4, v5, :cond_8

    .line 162
    .line 163
    iget-object v4, v2, Lud/a;->o:Ljava/util/List;

    .line 164
    .line 165
    invoke-interface {v4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-eqz v4, :cond_8

    .line 170
    .line 171
    goto/16 :goto_7

    .line 172
    .line 173
    :cond_8
    if-eqz v6, :cond_9

    .line 174
    .line 175
    move-object v4, v2

    .line 176
    goto :goto_1

    .line 177
    :cond_9
    move-object v4, v0

    .line 178
    :goto_1
    invoke-static {v4}, La/a;->K(Lud/a;)Lud/a;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-virtual {v3}, Lhb/r;->j()Lud/a;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-static {v5, v4}, La/a;->s0(Lud/a;Lud/a;)Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-nez v4, :cond_f

    .line 191
    .line 192
    invoke-static {p0, v0}, Lle/a;->d(Lhb/r;Lud/a;)Lhb/r;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-static {p0, v2}, Lle/a;->d(Lhb/r;Lud/a;)Lhb/r;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    if-eqz v0, :cond_1d

    .line 201
    .line 202
    if-nez v1, :cond_a

    .line 203
    .line 204
    goto/16 :goto_7

    .line 205
    .line 206
    :cond_a
    invoke-virtual {v0}, Lhb/r;->j()Lud/a;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    iget-object v2, v2, Lud/a;->r:Ljava/util/BitSet;

    .line 211
    .line 212
    invoke-virtual {v1}, Lhb/r;->j()Lud/a;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    iget-object v3, v3, Lud/a;->r:Ljava/util/BitSet;

    .line 217
    .line 218
    invoke-virtual {v2, v3}, Ljava/util/BitSet;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-nez v2, :cond_b

    .line 223
    .line 224
    goto/16 :goto_7

    .line 225
    .line 226
    :cond_b
    invoke-static {v0}, Lle/a;->h(Lhb/r;)Lhb/r;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    if-eqz v2, :cond_c

    .line 231
    .line 232
    move-object v0, v2

    .line 233
    :cond_c
    iget-object v2, v0, Lhb/r;->f:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v2, Lud/a;

    .line 236
    .line 237
    invoke-static {v1}, Lle/a;->h(Lhb/r;)Lhb/r;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    if-eqz v3, :cond_d

    .line 242
    .line 243
    move-object v1, v3

    .line 244
    :cond_d
    iget-object v3, v1, Lhb/r;->f:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v3, Lud/a;

    .line 247
    .line 248
    iget-object v4, v0, Lhb/r;->e:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v4, Lud/a;

    .line 251
    .line 252
    iget-object v5, v1, Lhb/r;->e:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v5, Lud/a;

    .line 255
    .line 256
    if-ne v4, v5, :cond_e

    .line 257
    .line 258
    if-ne v2, v3, :cond_e

    .line 259
    .line 260
    invoke-static {p0, v0, v1}, Lle/a;->i(Lhb/r;Lhb/r;Lhb/r;)Lhb/r;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    return-object p0

    .line 265
    :cond_e
    if-ne v4, v3, :cond_1d

    .line 266
    .line 267
    if-ne v2, v5, :cond_1d

    .line 268
    .line 269
    invoke-static {v1}, Lhb/r;->l(Lhb/r;)Lhb/r;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-static {p0, v0, v1}, Lle/a;->i(Lhb/r;Lhb/r;Lhb/r;)Lhb/r;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    return-object p0

    .line 278
    :cond_f
    invoke-static {v3}, Lle/a;->h(Lhb/r;)Lhb/r;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    if-eqz v3, :cond_13

    .line 283
    .line 284
    iget-object v4, v3, Lhb/r;->e:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v4, Lud/a;

    .line 287
    .line 288
    invoke-static {v2, v4}, La/a;->o0(Lud/a;Lud/a;)Z

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    if-nez v4, :cond_10

    .line 293
    .line 294
    iget-object v4, v3, Lhb/r;->f:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v4, Lud/a;

    .line 297
    .line 298
    invoke-static {v1, v4}, La/a;->o0(Lud/a;Lud/a;)Z

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-eqz v1, :cond_11

    .line 303
    .line 304
    :cond_10
    invoke-static {v3}, Lhb/r;->l(Lhb/r;)Lhb/r;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    move-object v3, v1

    .line 309
    :cond_11
    if-eqz v6, :cond_12

    .line 310
    .line 311
    iget-object v1, v3, Lhb/r;->f:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v1, Lud/a;

    .line 314
    .line 315
    invoke-static {v2, v1}, La/a;->o0(Lud/a;Lud/a;)Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    goto :goto_2

    .line 320
    :cond_12
    iget-object v1, v3, Lhb/r;->e:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v1, Lud/a;

    .line 323
    .line 324
    invoke-static {v0, v1}, La/a;->o0(Lud/a;Lud/a;)Z

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    :goto_2
    if-nez v1, :cond_18

    .line 329
    .line 330
    :cond_13
    :goto_3
    return-object p0

    .line 331
    :cond_14
    if-nez v7, :cond_18

    .line 332
    .line 333
    if-eqz v8, :cond_15

    .line 334
    .line 335
    if-eqz v6, :cond_16

    .line 336
    .line 337
    :cond_15
    if-eqz v9, :cond_17

    .line 338
    .line 339
    if-eqz v6, :cond_17

    .line 340
    .line 341
    :cond_16
    move v4, v5

    .line 342
    :cond_17
    if-nez v4, :cond_18

    .line 343
    .line 344
    iget-object v0, p0, Lhb/r;->h:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v0, Ljava/util/List;

    .line 347
    .line 348
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 349
    .line 350
    .line 351
    return-object p0

    .line 352
    :cond_18
    iget-object v1, v3, Lhb/r;->f:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v1, Lud/a;

    .line 355
    .line 356
    iget-object v4, v3, Lhb/r;->e:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v4, Lud/a;

    .line 359
    .line 360
    iget-object v5, p0, Lhb/r;->b:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v5, Lud/r;

    .line 363
    .line 364
    iget-object v7, p0, Lhb/r;->g:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v7, Ljava/util/Set;

    .line 367
    .line 368
    if-eqz v6, :cond_19

    .line 369
    .line 370
    invoke-static {v2, v1, v7, v5}, Lle/a;->c(Lud/a;Lud/a;Ljava/util/Set;Lud/r;)Lud/a;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    goto :goto_4

    .line 375
    :cond_19
    invoke-static {v0, v4, v7, v5}, Lle/a;->c(Lud/a;Lud/a;Ljava/util/Set;Lud/r;)Lud/a;

    .line 376
    .line 377
    .line 378
    move-result-object v4

    .line 379
    :goto_4
    if-eqz v6, :cond_1a

    .line 380
    .line 381
    const/4 v0, 0x4

    .line 382
    goto :goto_5

    .line 383
    :cond_1a
    const/4 v0, 0x5

    .line 384
    :goto_5
    iget-object v2, p0, Lhb/r;->c:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v2, Lyd/b;

    .line 387
    .line 388
    iget-object v6, v3, Lhb/r;->c:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v6, Lyd/b;

    .line 391
    .line 392
    iget v7, v2, Lyd/b;->i:I

    .line 393
    .line 394
    if-ne v7, v0, :cond_1b

    .line 395
    .line 396
    new-instance v0, Lyd/b;

    .line 397
    .line 398
    invoke-direct {v0, v2}, Lyd/b;-><init>(Lyd/b;)V

    .line 399
    .line 400
    .line 401
    iget-object v2, v0, Lyd/b;->j:Ljava/util/List;

    .line 402
    .line 403
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    goto :goto_6

    .line 407
    :cond_1b
    new-instance v7, Lyd/b;

    .line 408
    .line 409
    filled-new-array {v2, v6}, [Lyd/b;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    invoke-direct {v7, v0, v2}, Lyd/b;-><init>(ILjava/util/List;)V

    .line 418
    .line 419
    .line 420
    move-object v0, v7

    .line 421
    :goto_6
    new-instance v2, Lhb/r;

    .line 422
    .line 423
    invoke-direct {v2, v5, v0, v4, v1}, Lhb/r;-><init>(Lud/r;Lyd/b;Lud/a;Lud/a;)V

    .line 424
    .line 425
    .line 426
    filled-new-array {p0, v3}, [Lhb/r;

    .line 427
    .line 428
    .line 429
    move-result-object p0

    .line 430
    invoke-virtual {v2, p0}, Lhb/r;->m([Lhb/r;)V

    .line 431
    .line 432
    .line 433
    invoke-static {v2}, Lle/a;->h(Lhb/r;)Lhb/r;

    .line 434
    .line 435
    .line 436
    move-result-object p0

    .line 437
    if-eqz p0, :cond_1c

    .line 438
    .line 439
    return-object p0

    .line 440
    :cond_1c
    return-object v2

    .line 441
    :cond_1d
    :goto_7
    const/4 p0, 0x0

    .line 442
    return-object p0
.end method

.method public static i(Lhb/r;Lhb/r;Lhb/r;)Lhb/r;
    .locals 5

    .line 1
    iget-object v0, p0, Lhb/r;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyd/b;

    .line 4
    .line 5
    iget-object v1, p1, Lhb/r;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lyd/b;

    .line 8
    .line 9
    iget-object v2, p2, Lhb/r;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lyd/b;

    .line 12
    .line 13
    new-instance v3, Lyd/b;

    .line 14
    .line 15
    filled-new-array {v0, v1, v2}, [Lyd/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x2

    .line 24
    invoke-direct {v3, v1, v0}, Lyd/b;-><init>(ILjava/util/List;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lhb/r;

    .line 28
    .line 29
    iget-object v1, p0, Lhb/r;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lud/r;

    .line 32
    .line 33
    iget-object v2, p1, Lhb/r;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Lud/a;

    .line 36
    .line 37
    iget-object v4, p1, Lhb/r;->f:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v4, Lud/a;

    .line 40
    .line 41
    invoke-direct {v0, v1, v3, v2, v4}, Lhb/r;-><init>(Lud/r;Lyd/b;Lud/a;Lud/a;)V

    .line 42
    .line 43
    .line 44
    filled-new-array {p0, p1, p2}, [Lhb/r;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {v0, p0}, Lhb/r;->m([Lhb/r;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Lle/a;->a(Lhb/r;)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method public static j(Lud/r;Lud/a;Lhb/r;)Lhb/r;
    .locals 5

    .line 1
    iget-object v0, p2, Lhb/r;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lud/a;

    .line 4
    .line 5
    iget-object v1, p2, Lhb/r;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lud/a;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    new-instance p0, Lhb/r;

    .line 17
    .line 18
    invoke-direct {p0, p2, v3}, Lhb/r;-><init>(Lhb/r;Lud/a;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lhb/r;->i:Ljava/lang/Object;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    iget-object v2, v0, Lmd/e;->g:Lmd/f;

    .line 25
    .line 26
    sget-object v4, Lmd/a;->n:Lmd/a;

    .line 27
    .line 28
    invoke-virtual {v2, v4}, Lmd/f;->a(Lmd/a;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    iget-object v2, v1, Lmd/e;->g:Lmd/f;

    .line 35
    .line 36
    invoke-virtual {v2, v4}, Lmd/f;->a(Lmd/a;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    iput-object v3, p2, Lhb/r;->i:Ljava/lang/Object;

    .line 43
    .line 44
    return-object p2

    .line 45
    :cond_1
    invoke-static {p0, v0, v1}, La/a;->h0(Lud/r;Lud/a;Lud/a;)Lud/a;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iput-object v2, p2, Lhb/r;->i:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-static {p2, v0}, Lle/a;->f(Lhb/r;Lud/a;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-static {p2, v1}, Lle/a;->f(Lhb/r;Lud/a;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    return-object v3

    .line 64
    :cond_2
    if-eqz v4, :cond_3

    .line 65
    .line 66
    new-instance v2, Lhb/r;

    .line 67
    .line 68
    invoke-direct {v2, p2, v0}, Lhb/r;-><init>(Lhb/r;Lud/a;)V

    .line 69
    .line 70
    .line 71
    iput-object v1, v2, Lhb/r;->i:Ljava/lang/Object;

    .line 72
    .line 73
    :goto_0
    move-object p2, v2

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    if-eqz v2, :cond_4

    .line 76
    .line 77
    invoke-static {p2}, Lhb/r;->l(Lhb/r;)Lhb/r;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    new-instance v2, Lhb/r;

    .line 82
    .line 83
    invoke-direct {v2, p2, v1}, Lhb/r;-><init>(Lhb/r;Lud/a;)V

    .line 84
    .line 85
    .line 86
    iput-object v0, v2, Lhb/r;->i:Ljava/lang/Object;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    :goto_1
    iget-object v0, p2, Lhb/r;->i:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Lud/a;

    .line 92
    .line 93
    if-nez v0, :cond_7

    .line 94
    .line 95
    iget-object v0, p2, Lhb/r;->e:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Lud/a;

    .line 98
    .line 99
    invoke-static {p0, v0}, Lle/a;->b(Lud/r;Lud/a;)Lud/a;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iget-object v1, p2, Lhb/r;->f:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v1, Lud/a;

    .line 106
    .line 107
    invoke-static {p0, v1}, Lle/a;->b(Lud/r;Lud/a;)Lud/a;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    if-nez v0, :cond_5

    .line 112
    .line 113
    if-eqz p0, :cond_5

    .line 114
    .line 115
    iput-object p0, p2, Lhb/r;->i:Ljava/lang/Object;

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_5
    if-eqz v0, :cond_6

    .line 119
    .line 120
    if-nez p0, :cond_6

    .line 121
    .line 122
    iput-object v0, p2, Lhb/r;->i:Ljava/lang/Object;

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_6
    if-eqz v0, :cond_7

    .line 126
    .line 127
    if-ne v0, p0, :cond_7

    .line 128
    .line 129
    iput-object v0, p2, Lhb/r;->i:Ljava/lang/Object;

    .line 130
    .line 131
    :cond_7
    :goto_2
    iget-object p0, p2, Lhb/r;->i:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p0, Lud/a;

    .line 134
    .line 135
    if-nez p0, :cond_8

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_8
    iget-object v0, p1, Lud/a;->o:Ljava/util/List;

    .line 139
    .line 140
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_9

    .line 145
    .line 146
    :goto_3
    const/4 p0, 0x0

    .line 147
    goto :goto_4

    .line 148
    :cond_9
    iget-object p1, p1, Lud/a;->n:Ljava/util/List;

    .line 149
    .line 150
    invoke-interface {p1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    :goto_4
    if-eqz p0, :cond_a

    .line 155
    .line 156
    iput-object v3, p2, Lhb/r;->i:Ljava/lang/Object;

    .line 157
    .line 158
    :cond_a
    return-object p2
.end method
