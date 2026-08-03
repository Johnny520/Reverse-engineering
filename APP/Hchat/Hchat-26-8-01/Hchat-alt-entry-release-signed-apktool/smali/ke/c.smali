.class public final Lke/c;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lke/d;


# static fields
.field public static final h:Lke/g;

.field public static final i:Lke/g;

.field public static final j:La2/a;


# instance fields
.field public final synthetic g:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lke/g;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lke/g;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lke/c;->h:Lke/g;

    .line 8
    .line 9
    new-instance v0, Lke/g;

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    invoke-direct {v0, v1}, Lke/g;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lke/c;->i:Lke/g;

    .line 16
    .line 17
    new-instance v0, La2/a;

    .line 18
    .line 19
    const/16 v1, 0x1a

    .line 20
    .line 21
    invoke-direct {v0, v1}, La2/a;-><init>(I)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lke/c;->j:La2/a;

    .line 25
    .line 26
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lke/c;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static i(Lud/r;Lqd/s;)Ljava/util/IdentityHashMap;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 2
    .line 3
    iget-object v1, p1, Lqd/s;->j:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    sub-int/2addr v1, v2

    .line 11
    invoke-direct {v0, v1}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p1, Lqd/s;->j:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lqd/r;

    .line 31
    .line 32
    iget-object v1, v1, Lqd/l;->j:Lud/p;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    iget-object v3, v1, Lud/p;->k:Lpd/k;

    .line 37
    .line 38
    sget-object v4, Lpd/k;->O:Lpd/k;

    .line 39
    .line 40
    if-ne v3, v4, :cond_0

    .line 41
    .line 42
    move-object v3, v1

    .line 43
    check-cast v3, Lpd/n;

    .line 44
    .line 45
    iget-object v4, v3, Lpd/n;->p:Lod/d;

    .line 46
    .line 47
    iget-object v4, v4, Lod/d;->l:Ljava/lang/String;

    .line 48
    .line 49
    const-string v5, "java.lang.String.equals(Ljava/lang/Object;)Z"

    .line 50
    .line 51
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_0

    .line 56
    .line 57
    invoke-virtual {v3, v2}, Lud/p;->S(I)Lqd/l;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iget-object v4, p0, Lud/r;->l:Lud/e;

    .line 62
    .line 63
    iget-object v4, v4, Lud/e;->k:Lud/u;

    .line 64
    .line 65
    invoke-static {v4, v3}, Lxe/m;->e(Lud/u;Lqd/l;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    instance-of v4, v3, Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v4, :cond_0

    .line 72
    .line 73
    check-cast v3, Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0, v1, v3}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    return-object v0
.end method

.method public static j(Lud/p;)Lqd/r;
    .locals 2

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Lud/p;->k:Lpd/k;

    .line 4
    .line 5
    sget-object v1, Lpd/k;->O:Lpd/k;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    check-cast p0, Lpd/n;

    .line 11
    .line 12
    iget-object v0, p0, Lpd/n;->p:Lod/d;

    .line 13
    .line 14
    iget-object v0, v0, Lod/d;->l:Ljava/lang/String;

    .line 15
    .line 16
    const-string v1, "java.lang.String.hashCode()I"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p0}, Lpd/n;->k0()Lqd/l;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-eqz p0, :cond_3

    .line 30
    .line 31
    instance-of v0, p0, Lqd/r;

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    check-cast p0, Lqd/r;

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method public static k(Lqd/l;)Lqd/r;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Lqd/r;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Lqd/r;

    .line 9
    .line 10
    invoke-virtual {p0}, Lqd/r;->f0()Lud/p;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lke/c;->j(Lud/p;)Lqd/r;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    instance-of v0, p0, Lqd/m;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    check-cast p0, Lqd/m;

    .line 24
    .line 25
    iget-object p0, p0, Lqd/m;->l:Lud/p;

    .line 26
    .line 27
    invoke-static {p0}, Lke/c;->j(Lud/p;)Lqd/r;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public static l(Lyd/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyd/c;->n:Lud/j;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lyd/a;->k:Lyd/b;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lyd/b;->K(Lyd/b;)Lyd/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lyd/a;->k:Lyd/b;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lyd/c;->m:Lud/j;

    .line 16
    .line 17
    iget-object v1, p0, Lyd/c;->n:Lud/j;

    .line 18
    .line 19
    iput-object v1, p0, Lyd/c;->m:Lud/j;

    .line 20
    .line 21
    iput-object v0, p0, Lyd/c;->n:Lud/j;

    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public static m(Lud/j;)Z
    .locals 3

    .line 1
    instance-of v0, p0, Lyd/c;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    instance-of v0, p0, Lud/n;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Lud/n;

    .line 13
    .line 14
    invoke-interface {p0}, Lud/n;->u()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    instance-of p0, p0, Lyd/c;

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    return v1

    .line 33
    :cond_1
    return v2
.end method

.method public static n(Lud/r;Lud/j;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_4

    .line 5
    .line 6
    :cond_0
    move-object v1, p1

    .line 7
    check-cast v1, Lmd/e;

    .line 8
    .line 9
    iget-object v1, v1, Lmd/e;->g:Lmd/f;

    .line 10
    .line 11
    sget-object v2, Lmd/a;->n:Lmd/a;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x1

    .line 18
    if-nez v1, :cond_9

    .line 19
    .line 20
    instance-of v1, p1, Lud/a;

    .line 21
    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    move-object v1, p1

    .line 25
    check-cast v1, Lud/a;

    .line 26
    .line 27
    iget-object v3, p0, Lud/r;->C:Lud/a;

    .line 28
    .line 29
    if-ne v1, v3, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v1, v1, Lud/a;->n:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    :goto_0
    move v1, v2

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-ne v3, v2, :cond_3

    .line 47
    .line 48
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lud/a;

    .line 53
    .line 54
    iget-object v1, v1, Lud/a;->n:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    move v1, v0

    .line 62
    :goto_1
    if-eqz v1, :cond_4

    .line 63
    .line 64
    goto :goto_5

    .line 65
    :cond_4
    instance-of v1, p1, Lud/n;

    .line 66
    .line 67
    if-eqz v1, :cond_8

    .line 68
    .line 69
    check-cast p1, Lud/n;

    .line 70
    .line 71
    invoke-interface {p1}, Lud/n;->u()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-ne v1, v2, :cond_8

    .line 80
    .line 81
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Lud/j;

    .line 86
    .line 87
    instance-of v1, p1, Lud/a;

    .line 88
    .line 89
    if-eqz v1, :cond_7

    .line 90
    .line 91
    check-cast p1, Lud/a;

    .line 92
    .line 93
    iget-object p0, p0, Lud/r;->C:Lud/a;

    .line 94
    .line 95
    if-ne p1, p0, :cond_5

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    iget-object p0, p1, Lud/a;->n:Ljava/util/List;

    .line 99
    .line 100
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_6

    .line 105
    .line 106
    :goto_2
    move p0, v2

    .line 107
    goto :goto_3

    .line 108
    :cond_6
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-ne p1, v2, :cond_7

    .line 113
    .line 114
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, Lud/a;

    .line 119
    .line 120
    iget-object p0, p0, Lud/a;->n:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    goto :goto_3

    .line 127
    :cond_7
    move p0, v0

    .line 128
    :goto_3
    if-eqz p0, :cond_8

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_8
    :goto_4
    return v0

    .line 132
    :cond_9
    :goto_5
    return v2
.end method

.method public static o(Lhb/r;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lhb/r;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lud/r;

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lhb/r;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    new-instance v2, Lae/e;

    .line 10
    .line 11
    const/16 v3, 0x15

    .line 12
    .line 13
    invoke-direct {v2, v3}, Lae/e;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lhb/r;->h:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lxd/d;
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    sget-object v2, Lmd/a;->u:Lmd/a;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    :try_start_1
    iget-object v3, p0, Lhb/r;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Lxd/d;

    .line 30
    .line 31
    iget-object v3, v3, Lxd/a;->i:Lud/n;

    .line 32
    .line 33
    invoke-interface {v3}, Lud/n;->u()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-interface {v3, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    iget-object v1, v1, Lxd/d;->k:Lud/a;

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lmd/e;->w(Lmd/a;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catch_0
    move-exception p0

    .line 47
    goto :goto_3

    .line 48
    :catch_1
    move-exception p0

    .line 49
    goto :goto_3

    .line 50
    :cond_0
    :goto_0
    iget-object p0, p0, Lhb/r;->i:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lqd/r;

    .line 53
    .line 54
    if-eqz p0, :cond_4

    .line 55
    .line 56
    iget-object p0, p0, Lqd/r;->m:Lqd/s;

    .line 57
    .line 58
    invoke-virtual {p0}, Lqd/s;->b()Lqd/k;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iget-object p0, p0, Lqd/k;->c:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Lqd/s;

    .line 79
    .line 80
    iget-object v3, v1, Lqd/s;->i:Lqd/r;

    .line 81
    .line 82
    iget-object v3, v3, Lqd/l;->j:Lud/p;

    .line 83
    .line 84
    if-eqz v3, :cond_1

    .line 85
    .line 86
    invoke-virtual {v3, v2}, Lmd/e;->w(Lmd/a;)V

    .line 87
    .line 88
    .line 89
    :cond_1
    iget-object v3, v1, Lqd/s;->j:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    :cond_2
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_3

    .line 100
    .line 101
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    check-cast v4, Lqd/r;

    .line 106
    .line 107
    iget-object v4, v4, Lqd/l;->j:Lud/p;

    .line 108
    .line 109
    if-eqz v4, :cond_2

    .line 110
    .line 111
    invoke-virtual {v4, v2}, Lmd/e;->w(Lmd/a;)V

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_3
    iget-object v3, v0, Lud/r;->D:Ljava/util/List;

    .line 116
    .line 117
    invoke-interface {v3, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    invoke-static {v0}, Lxe/l;->f(Lud/r;)V
    :try_end_1
    .catch Ljava/lang/StackOverflowError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :goto_3
    const-string v1, "Failed to clean up code after switch over string restore"

    .line 126
    .line 127
    invoke-virtual {v0, v1, p0}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public static p(Lhb/r;)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lhb/r;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lud/r;

    .line 6
    .line 7
    iget-object v2, v0, Lhb/r;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lxd/d;

    .line 10
    .line 11
    iget-object v3, v2, Lxd/a;->i:Lud/n;

    .line 12
    .line 13
    invoke-interface {v3}, Lud/n;->u()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-interface {v3, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v4, -0x1

    .line 22
    const/4 v6, 0x1

    .line 23
    if-eq v2, v4, :cond_1

    .line 24
    .line 25
    add-int/2addr v2, v6

    .line 26
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-lt v2, v4, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lud/j;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 41
    :goto_1
    instance-of v3, v2, Lxd/d;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    if-nez v3, :cond_2

    .line 45
    .line 46
    goto/16 :goto_d

    .line 47
    .line 48
    :cond_2
    check-cast v2, Lxd/d;

    .line 49
    .line 50
    iget-object v3, v2, Lxd/d;->k:Lud/a;

    .line 51
    .line 52
    invoke-static {v3}, La/a;->c0(Lud/h;)Lud/p;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    iget-object v7, v3, Lud/p;->k:Lpd/k;

    .line 59
    .line 60
    sget-object v8, Lpd/k;->w:Lpd/k;

    .line 61
    .line 62
    if-ne v7, v8, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    const/4 v3, 0x0

    .line 66
    :goto_2
    if-eqz v3, :cond_19

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Lud/p;->S(I)Lqd/l;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    instance-of v7, v7, Lqd/r;

    .line 76
    .line 77
    if-nez v7, :cond_4

    .line 78
    .line 79
    goto/16 :goto_d

    .line 80
    .line 81
    :cond_4
    invoke-virtual {v3, v4}, Lud/p;->S(I)Lqd/l;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    check-cast v7, Lqd/r;

    .line 86
    .line 87
    iget-object v8, v0, Lhb/r;->f:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v8, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    move v10, v4

    .line 96
    :cond_5
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    if-eqz v11, :cond_a

    .line 101
    .line 102
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    check-cast v11, Lke/l;

    .line 107
    .line 108
    iget-object v12, v11, Lke/l;->b:Lud/j;

    .line 109
    .line 110
    if-eqz v12, :cond_6

    .line 111
    .line 112
    new-instance v13, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    new-instance v14, Lbe/m0;

    .line 118
    .line 119
    const/4 v15, 0x7

    .line 120
    invoke-direct {v14, v15, v13}, Lbe/m0;-><init>(ILjava/util/ArrayList;)V

    .line 121
    .line 122
    .line 123
    new-instance v15, Lke/a;

    .line 124
    .line 125
    const/4 v5, 0x2

    .line 126
    invoke-direct {v15, v14, v5}, Lke/a;-><init>(Ljava/lang/Object;I)V

    .line 127
    .line 128
    .line 129
    invoke-static {v1, v15, v12}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 130
    .line 131
    .line 132
    new-instance v5, Lce/n;

    .line 133
    .line 134
    const/16 v12, 0xe

    .line 135
    .line 136
    invoke-direct {v5, v12}, Lce/n;-><init>(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->removeIf(Ljava/util/function/Predicate;)Z

    .line 140
    .line 141
    .line 142
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-ne v5, v6, :cond_7

    .line 147
    .line 148
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    check-cast v5, Lud/p;

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_6
    iget-object v5, v11, Lke/l;->c:Lud/a;

    .line 156
    .line 157
    if-eqz v5, :cond_7

    .line 158
    .line 159
    invoke-virtual {v3, v4}, Lud/p;->S(I)Lqd/l;

    .line 160
    .line 161
    .line 162
    move-result-object v12

    .line 163
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    instance-of v13, v12, Lqd/r;

    .line 167
    .line 168
    if-eqz v13, :cond_7

    .line 169
    .line 170
    check-cast v12, Lqd/r;

    .line 171
    .line 172
    iget-object v12, v12, Lqd/r;->m:Lqd/s;

    .line 173
    .line 174
    iget-object v12, v12, Lqd/s;->i:Lqd/r;

    .line 175
    .line 176
    iget-object v12, v12, Lqd/l;->j:Lud/p;

    .line 177
    .line 178
    if-eqz v12, :cond_7

    .line 179
    .line 180
    iget-object v13, v12, Lud/p;->k:Lpd/k;

    .line 181
    .line 182
    sget-object v14, Lpd/k;->X:Lpd/k;

    .line 183
    .line 184
    if-ne v13, v14, :cond_7

    .line 185
    .line 186
    check-cast v12, Lpd/q;

    .line 187
    .line 188
    invoke-virtual {v12, v5}, Lpd/q;->k0(Lud/a;)Lqd/r;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    if-eqz v5, :cond_7

    .line 193
    .line 194
    invoke-virtual {v5}, Lqd/r;->f0()Lud/p;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    goto :goto_4

    .line 199
    :cond_7
    const/4 v5, 0x0

    .line 200
    :goto_4
    if-eqz v5, :cond_9

    .line 201
    .line 202
    iget-object v12, v5, Lud/p;->m:Ljava/util/List;

    .line 203
    .line 204
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    if-eq v12, v6, :cond_8

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_8
    iget-object v12, v1, Lud/r;->l:Lud/e;

    .line 212
    .line 213
    iget-object v12, v12, Lud/e;->k:Lud/u;

    .line 214
    .line 215
    invoke-virtual {v5, v4}, Lud/p;->S(I)Lqd/l;

    .line 216
    .line 217
    .line 218
    move-result-object v13

    .line 219
    invoke-static {v12, v13}, Lxe/m;->e(Lud/u;Lqd/l;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v12

    .line 223
    instance-of v13, v12, Lqd/n;

    .line 224
    .line 225
    if-eqz v13, :cond_9

    .line 226
    .line 227
    iget-object v5, v5, Lud/p;->l:Lqd/r;

    .line 228
    .line 229
    invoke-virtual {v7, v5}, Lqd/r;->g0(Lqd/r;)Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-eqz v5, :cond_9

    .line 234
    .line 235
    check-cast v12, Lqd/n;

    .line 236
    .line 237
    iget-wide v12, v12, Lqd/n;->l:J

    .line 238
    .line 239
    long-to-int v5, v12

    .line 240
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    goto :goto_6

    .line 245
    :cond_9
    :goto_5
    const/4 v5, 0x0

    .line 246
    :goto_6
    if-eqz v5, :cond_5

    .line 247
    .line 248
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    iput v5, v11, Lke/l;->d:I

    .line 253
    .line 254
    add-int/lit8 v10, v10, 0x1

    .line 255
    .line 256
    goto/16 :goto_3

    .line 257
    .line 258
    :cond_a
    if-nez v10, :cond_b

    .line 259
    .line 260
    return v6

    .line 261
    :cond_b
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-eq v10, v3, :cond_c

    .line 266
    .line 267
    goto/16 :goto_d

    .line 268
    .line 269
    :cond_c
    new-instance v3, Lae/a;

    .line 270
    .line 271
    const/16 v5, 0xb

    .line 272
    .line 273
    invoke-direct {v3, v5}, Lae/a;-><init>(I)V

    .line 274
    .line 275
    .line 276
    invoke-static {v3}, Ljava/util/Comparator;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 281
    .line 282
    .line 283
    new-instance v3, Ljava/util/HashMap;

    .line 284
    .line 285
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    invoke-direct {v3, v5}, Ljava/util/HashMap;-><init>(I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v8

    .line 300
    if-eqz v8, :cond_e

    .line 301
    .line 302
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    check-cast v8, Lke/l;

    .line 307
    .line 308
    iget v9, v8, Lke/l;->d:I

    .line 309
    .line 310
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 311
    .line 312
    .line 313
    move-result-object v9

    .line 314
    invoke-virtual {v3, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v9

    .line 318
    check-cast v9, Lke/l;

    .line 319
    .line 320
    if-eqz v9, :cond_d

    .line 321
    .line 322
    goto/16 :goto_d

    .line 323
    .line 324
    :cond_d
    iget-object v8, v8, Lke/l;->b:Lud/j;

    .line 325
    .line 326
    new-instance v9, Lae/g;

    .line 327
    .line 328
    const/16 v10, 0x9

    .line 329
    .line 330
    invoke-direct {v9, v0, v10}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 331
    .line 332
    .line 333
    new-instance v10, Lke/a;

    .line 334
    .line 335
    const/4 v11, 0x2

    .line 336
    invoke-direct {v10, v9, v11}, Lke/a;-><init>(Ljava/lang/Object;I)V

    .line 337
    .line 338
    .line 339
    invoke-static {v1, v10, v8}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 340
    .line 341
    .line 342
    goto :goto_7

    .line 343
    :cond_e
    new-instance v1, Ljava/util/ArrayList;

    .line 344
    .line 345
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 346
    .line 347
    .line 348
    iget-object v5, v2, Lxd/d;->l:Ljava/util/ArrayList;

    .line 349
    .line 350
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 355
    .line 356
    .line 357
    move-result v8

    .line 358
    if-eqz v8, :cond_18

    .line 359
    .line 360
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v8

    .line 364
    check-cast v8, Lxd/c;

    .line 365
    .line 366
    iget-object v9, v8, Lxd/c;->a:Ljava/util/List;

    .line 367
    .line 368
    iget-object v8, v8, Lxd/c;->b:Lud/j;

    .line 369
    .line 370
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 371
    .line 372
    .line 373
    move-result-object v9

    .line 374
    const/4 v10, 0x0

    .line 375
    :goto_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 376
    .line 377
    .line 378
    move-result v11

    .line 379
    if-eqz v11, :cond_17

    .line 380
    .line 381
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v11

    .line 385
    instance-of v12, v11, Ljava/lang/Integer;

    .line 386
    .line 387
    if-eqz v12, :cond_f

    .line 388
    .line 389
    move-object v12, v11

    .line 390
    check-cast v12, Ljava/lang/Integer;

    .line 391
    .line 392
    goto :goto_a

    .line 393
    :cond_f
    instance-of v12, v11, Lud/g;

    .line 394
    .line 395
    if-eqz v12, :cond_10

    .line 396
    .line 397
    move-object v12, v11

    .line 398
    check-cast v12, Lud/g;

    .line 399
    .line 400
    sget-object v13, Loc/c;->f:Loc/c;

    .line 401
    .line 402
    iget-object v12, v12, Lmd/e;->g:Lmd/f;

    .line 403
    .line 404
    invoke-virtual {v12, v13}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 405
    .line 406
    .line 407
    move-result-object v12

    .line 408
    check-cast v12, Lnc/a;

    .line 409
    .line 410
    if-eqz v12, :cond_10

    .line 411
    .line 412
    iget v13, v12, Lnc/a;->g:I

    .line 413
    .line 414
    const/4 v14, 0x6

    .line 415
    if-ne v13, v14, :cond_10

    .line 416
    .line 417
    iget-object v12, v12, Lnc/a;->h:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v12, Ljava/lang/Integer;

    .line 420
    .line 421
    goto :goto_a

    .line 422
    :cond_10
    const/4 v12, 0x0

    .line 423
    :goto_a
    if-eqz v12, :cond_13

    .line 424
    .line 425
    invoke-virtual {v3, v12}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v11

    .line 429
    check-cast v11, Lke/l;

    .line 430
    .line 431
    if-nez v11, :cond_11

    .line 432
    .line 433
    goto/16 :goto_d

    .line 434
    .line 435
    :cond_11
    iget-object v11, v11, Lke/l;->a:Ljava/util/ArrayList;

    .line 436
    .line 437
    if-nez v10, :cond_12

    .line 438
    .line 439
    new-instance v10, Ljava/util/ArrayList;

    .line 440
    .line 441
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 442
    .line 443
    .line 444
    new-instance v11, Lxd/c;

    .line 445
    .line 446
    invoke-direct {v11, v10, v8}, Lxd/c;-><init>(Ljava/util/List;Lud/j;)V

    .line 447
    .line 448
    .line 449
    move-object v10, v11

    .line 450
    goto :goto_9

    .line 451
    :cond_12
    iget-object v12, v10, Lxd/c;->a:Ljava/util/List;

    .line 452
    .line 453
    invoke-interface {v12, v11}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 454
    .line 455
    .line 456
    goto :goto_9

    .line 457
    :cond_13
    sget-object v12, Lxd/d;->m:Luf/d;

    .line 458
    .line 459
    if-ne v11, v12, :cond_19

    .line 460
    .line 461
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 462
    .line 463
    .line 464
    move-result-object v11

    .line 465
    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 466
    .line 467
    .line 468
    move-result-object v11

    .line 469
    :goto_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 470
    .line 471
    .line 472
    move-result v12

    .line 473
    if-eqz v12, :cond_15

    .line 474
    .line 475
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v12

    .line 479
    check-cast v12, Ljava/util/Map$Entry;

    .line 480
    .line 481
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v12

    .line 485
    check-cast v12, Lke/l;

    .line 486
    .line 487
    if-nez v10, :cond_14

    .line 488
    .line 489
    new-instance v10, Ljava/util/ArrayList;

    .line 490
    .line 491
    iget-object v12, v12, Lke/l;->a:Ljava/util/ArrayList;

    .line 492
    .line 493
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 494
    .line 495
    .line 496
    new-instance v12, Lxd/c;

    .line 497
    .line 498
    invoke-direct {v12, v10, v8}, Lxd/c;-><init>(Ljava/util/List;Lud/j;)V

    .line 499
    .line 500
    .line 501
    move-object v10, v12

    .line 502
    goto :goto_c

    .line 503
    :cond_14
    iget-object v13, v10, Lxd/c;->a:Ljava/util/List;

    .line 504
    .line 505
    iget-object v12, v12, Lke/l;->a:Ljava/util/ArrayList;

    .line 506
    .line 507
    invoke-interface {v13, v12}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 508
    .line 509
    .line 510
    :goto_c
    invoke-interface {v11}, Ljava/util/Iterator;->remove()V

    .line 511
    .line 512
    .line 513
    goto :goto_b

    .line 514
    :cond_15
    if-nez v10, :cond_16

    .line 515
    .line 516
    new-instance v10, Lxd/c;

    .line 517
    .line 518
    new-instance v11, Ljava/util/ArrayList;

    .line 519
    .line 520
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 521
    .line 522
    .line 523
    invoke-direct {v10, v11, v8}, Lxd/c;-><init>(Ljava/util/List;Lud/j;)V

    .line 524
    .line 525
    .line 526
    :cond_16
    iget-object v11, v10, Lxd/c;->a:Ljava/util/List;

    .line 527
    .line 528
    sget-object v12, Lxd/d;->m:Luf/d;

    .line 529
    .line 530
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    goto/16 :goto_9

    .line 534
    .line 535
    :cond_17
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    goto/16 :goto_8

    .line 539
    .line 540
    :cond_18
    iput-object v2, v0, Lhb/r;->h:Ljava/lang/Object;

    .line 541
    .line 542
    iput-object v7, v0, Lhb/r;->i:Ljava/lang/Object;

    .line 543
    .line 544
    iput-object v1, v0, Lhb/r;->g:Ljava/lang/Object;

    .line 545
    .line 546
    return v6

    .line 547
    :cond_19
    :goto_d
    return v4
.end method

.method public static q(Lud/r;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lud/r;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lud/r;->z:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, Lke/c;->h:Lke/g;

    .line 15
    .line 16
    iget-object v1, p0, Lud/r;->G:Lxd/b;

    .line 17
    .line 18
    invoke-static {p0, v0, v1}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    return-void
.end method

.method public static r(Lud/r;)V
    .locals 3

    .line 1
    sget-object v0, Lke/g;->l:Lke/g;

    .line 2
    .line 3
    iget-object v1, p0, Lud/r;->G:Lxd/b;

    .line 4
    .line 5
    invoke-static {p0, v0, v1}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lmd/a;->b0:Lmd/a;

    .line 9
    .line 10
    iget-object v2, p0, Lmd/e;->g:Lmd/f;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Lmd/f;->a(Lmd/a;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-static {p0}, Lbe/b;->Y(Lud/r;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-static {p0, v0}, Lx6/d;->i0(Lud/r;Lke/d;)V

    .line 22
    .line 23
    .line 24
    sget-object v0, Lke/c;->i:Lke/g;

    .line 25
    .line 26
    iget-object v1, p0, Lud/r;->G:Lxd/b;

    .line 27
    .line 28
    invoke-static {p0, v0, v1}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lke/c;->j:La2/a;

    .line 32
    .line 33
    invoke-static {p0, v0}, Lx6/d;->i0(Lud/r;Lke/d;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public c(Lud/r;Lud/n;)Z
    .locals 13

    .line 1
    instance-of v0, p2, Lxd/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_b

    .line 5
    .line 6
    check-cast p2, Lxd/d;

    .line 7
    .line 8
    iget-object v0, p2, Lxd/d;->k:Lud/a;

    .line 9
    .line 10
    const-string v2, "Failed to restore switch over string. Please report as a decompilation issue"

    .line 11
    .line 12
    :try_start_0
    iget-object v3, p2, Lxd/d;->l:Ljava/util/ArrayList;

    .line 13
    .line 14
    sget-object v4, Lpd/k;->w:Lpd/k;

    .line 15
    .line 16
    invoke-static {v0}, La/a;->c0(Lud/h;)Lud/p;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    iget-object v6, v5, Lud/p;->k:Lpd/k;

    .line 23
    .line 24
    if-ne v6, v4, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v5, 0x0

    .line 28
    :goto_0
    if-nez v5, :cond_1

    .line 29
    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_1
    invoke-virtual {v5, v1}, Lud/p;->S(I)Lqd/l;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-static {v4}, Lke/c;->k(Lqd/l;)Lqd/r;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    if-nez v4, :cond_2

    .line 41
    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    invoke-interface {v3}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    new-instance v8, Lce/n;

    .line 53
    .line 54
    const/16 v9, 0xd

    .line 55
    .line 56
    invoke-direct {v8, v9}, Lce/n;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v7, v8}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_3

    .line 64
    .line 65
    add-int/lit8 v7, v6, -0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    move v7, v6

    .line 69
    :goto_1
    iget-object v8, v4, Lqd/r;->m:Lqd/s;

    .line 70
    .line 71
    iget-object v9, v8, Lqd/s;->j:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    const/4 v10, 0x1

    .line 78
    sub-int/2addr v9, v10

    .line 79
    if-ge v9, v7, :cond_4

    .line 80
    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :cond_4
    invoke-static {p1, v8}, Lke/c;->i(Lud/r;Lqd/s;)Ljava/util/IdentityHashMap;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    invoke-virtual {v8}, Ljava/util/IdentityHashMap;->size()I

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    if-ge v9, v7, :cond_5

    .line 92
    .line 93
    goto/16 :goto_4

    .line 94
    .line 95
    :cond_5
    new-instance v7, Lhb/r;

    .line 96
    .line 97
    invoke-direct {v7, p1, p2}, Lhb/r;-><init>(Lud/r;Lxd/d;)V

    .line 98
    .line 99
    .line 100
    iput-object v8, v7, Lhb/r;->e:Ljava/lang/Object;

    .line 101
    .line 102
    new-instance v8, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v8, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 105
    .line 106
    .line 107
    iput-object v8, v7, Lhb/r;->f:Ljava/lang/Object;

    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-eqz v6, :cond_7

    .line 118
    .line 119
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    check-cast v6, Lxd/c;

    .line 124
    .line 125
    invoke-virtual {p0, v7, v6}, Lke/c;->s(Lhb/r;Lxd/c;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-nez v6, :cond_6

    .line 130
    .line 131
    invoke-virtual {p1, v2}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return v1

    .line 135
    :catch_0
    move-exception p2

    .line 136
    goto :goto_3

    .line 137
    :catch_1
    move-exception p2

    .line 138
    goto :goto_3

    .line 139
    :cond_7
    invoke-static {v7}, Lke/c;->p(Lhb/r;)Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-nez v3, :cond_8

    .line 144
    .line 145
    invoke-virtual {p1, v2}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return v1

    .line 149
    :cond_8
    iget-object v3, p2, Lxd/a;->i:Lud/n;

    .line 150
    .line 151
    new-instance v6, Lxd/d;

    .line 152
    .line 153
    invoke-direct {v6, v3, v0}, Lxd/d;-><init>(Lud/n;Lud/a;)V

    .line 154
    .line 155
    .line 156
    iget-object v0, v7, Lhb/r;->g:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    if-eqz v8, :cond_9

    .line 169
    .line 170
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    check-cast v8, Lxd/c;

    .line 175
    .line 176
    iget-object v9, v8, Lxd/c;->a:Ljava/util/List;

    .line 177
    .line 178
    invoke-static {v9}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    iget-object v8, v8, Lxd/c;->b:Lud/j;

    .line 183
    .line 184
    iget-object v11, v6, Lxd/d;->l:Ljava/util/ArrayList;

    .line 185
    .line 186
    new-instance v12, Lxd/c;

    .line 187
    .line 188
    invoke-direct {v12, v9, v8}, Lxd/c;-><init>(Ljava/util/List;Lud/j;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_9
    invoke-interface {v3, p2, v6}, Lud/n;->l(Lud/j;Lud/j;)Z

    .line 196
    .line 197
    .line 198
    move-result p2

    .line 199
    if-nez p2, :cond_a

    .line 200
    .line 201
    invoke-virtual {p1, v2}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    return v1

    .line 205
    :cond_a
    invoke-static {v7}, Lke/c;->o(Lhb/r;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v5, v1}, Lud/p;->S(I)Lqd/l;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    invoke-virtual {v4}, Lqd/r;->c0()Lqd/r;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-virtual {v5, p2, v0}, Lud/p;->b0(Lqd/l;Lqd/l;)Z
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 217
    .line 218
    .line 219
    return v10

    .line 220
    :goto_3
    invoke-virtual {p1, v2, p2}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    :cond_b
    :goto_4
    return v1
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lke/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0}, Lbe/a;->e()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_1
    const-string v0, "SwitchBreakVisitor"

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_2
    const-string v0, "RegionMakerVisitor"

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final g(Lud/r;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget v0, v1, Lke/c;->g:I

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    sget-object v4, Lnd/c;->g:Lnd/c;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v4}, Lnd/d;->b(Lud/r;Lnd/c;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {v2, v1}, Lx6/d;->i0(Lud/r;Lke/d;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    return-void

    .line 25
    :pswitch_0
    invoke-static {v2, v4}, Lnd/d;->b(Lud/r;Lnd/c;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    new-instance v0, Lha/p;

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    invoke-direct {v0, v4}, Lha/p;-><init>(I)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lke/a;

    .line 38
    .line 39
    invoke-direct {v4, v0, v5}, Lke/a;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, v2, Lud/r;->G:Lxd/b;

    .line 43
    .line 44
    invoke-static {v2, v4, v0}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Lha/p;

    .line 48
    .line 49
    invoke-direct {v0, v3}, Lha/p;-><init>(I)V

    .line 50
    .line 51
    .line 52
    new-instance v3, Lke/a;

    .line 53
    .line 54
    invoke-direct {v3, v0, v5}, Lke/a;-><init>(Ljava/lang/Object;I)V

    .line 55
    .line 56
    .line 57
    iget-object v0, v2, Lud/r;->G:Lxd/b;

    .line 58
    .line 59
    invoke-static {v2, v3, v0}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, v2, Lmd/e;->g:Lmd/f;

    .line 63
    .line 64
    sget-object v3, Lmd/a;->a0:Lmd/a;

    .line 65
    .line 66
    invoke-virtual {v0, v3}, Lmd/f;->a(Lmd/a;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    :try_start_0
    invoke-static {v2}, Lke/c;->r(Lud/r;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v3}, Lmd/e;->D(Lmd/a;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    invoke-virtual {v2, v3}, Lmd/e;->D(Lmd/a;)V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :cond_1
    :goto_1
    return-void

    .line 85
    :pswitch_1
    invoke-virtual {v2}, Lud/r;->Z()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    new-instance v0, Lke/j;

    .line 92
    .line 93
    invoke-direct {v0, v3}, Lf1/n0;-><init>(I)V

    .line 94
    .line 95
    .line 96
    iget-object v3, v2, Lud/r;->G:Lxd/b;

    .line 97
    .line 98
    invoke-static {v2, v0, v3}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    return-void

    .line 102
    :pswitch_2
    iget-boolean v0, v2, Lud/r;->p:Z

    .line 103
    .line 104
    if-nez v0, :cond_2e

    .line 105
    .line 106
    iget-object v0, v2, Lud/r;->z:Ljava/util/List;

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_3

    .line 113
    .line 114
    goto/16 :goto_16

    .line 115
    .line 116
    :cond_3
    new-instance v0, Li4/y;

    .line 117
    .line 118
    invoke-direct {v0, v2}, Li4/y;-><init>(Lud/r;)V

    .line 119
    .line 120
    .line 121
    iget-object v3, v0, Li4/y;->d:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v3, Lle/c;

    .line 124
    .line 125
    iget-object v4, v2, Lud/r;->B:Lud/a;

    .line 126
    .line 127
    invoke-virtual {v0, v4}, Li4/y;->b(Lud/a;)Lxd/b;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    iput-object v4, v2, Lud/r;->G:Lxd/b;

    .line 132
    .line 133
    iget-object v4, v2, Lud/r;->E:Ljava/util/List;

    .line 134
    .line 135
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    const/4 v6, 0x0

    .line 140
    sget-object v8, Lmd/b;->t:Lmd/b;

    .line 141
    .line 142
    if-nez v4, :cond_1f

    .line 143
    .line 144
    iget-object v4, v2, Lud/r;->E:Ljava/util/List;

    .line 145
    .line 146
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_4

    .line 151
    .line 152
    goto/16 :goto_f

    .line 153
    .line 154
    :cond_4
    iget-object v4, v2, Lmd/e;->g:Lmd/f;

    .line 155
    .line 156
    invoke-virtual {v4, v8}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v9

    .line 164
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    if-eqz v10, :cond_17

    .line 169
    .line 170
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v10

    .line 174
    check-cast v10, Lae/h;

    .line 175
    .line 176
    new-instance v11, Ljava/util/ArrayList;

    .line 177
    .line 178
    iget-object v10, v10, Lae/h;->h:Ljava/util/List;

    .line 179
    .line 180
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 181
    .line 182
    .line 183
    move-result v12

    .line 184
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 185
    .line 186
    .line 187
    new-instance v12, Ljava/util/HashSet;

    .line 188
    .line 189
    invoke-direct {v12}, Ljava/util/HashSet;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object v13

    .line 196
    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v14

    .line 200
    if-eqz v14, :cond_6

    .line 201
    .line 202
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v14

    .line 206
    check-cast v14, Lae/f;

    .line 207
    .line 208
    iget-object v15, v14, Lae/f;->c:Lud/a;

    .line 209
    .line 210
    if-eqz v15, :cond_5

    .line 211
    .line 212
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    invoke-static {v15}, La/a;->j0(Lud/a;)Lud/a;

    .line 216
    .line 217
    .line 218
    move-result-object v14

    .line 219
    invoke-virtual {v12, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_5
    invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v14

    .line 227
    const-string v15, "No exception handler block: "

    .line 228
    .line 229
    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v14

    .line 233
    invoke-virtual {v2, v14}, Lnd/b0;->I(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_6
    new-instance v13, Ljava/util/HashSet;

    .line 238
    .line 239
    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 243
    .line 244
    .line 245
    move-result-object v12

    .line 246
    :cond_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 247
    .line 248
    .line 249
    move-result v14

    .line 250
    sget-object v15, Lmd/a;->u:Lmd/a;

    .line 251
    .line 252
    if-eqz v14, :cond_b

    .line 253
    .line 254
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v14

    .line 258
    check-cast v14, Lud/a;

    .line 259
    .line 260
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v16

    .line 264
    :goto_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v17

    .line 268
    if-eqz v17, :cond_7

    .line 269
    .line 270
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v17

    .line 274
    move-object/from16 v5, v17

    .line 275
    .line 276
    check-cast v5, Lud/a;

    .line 277
    .line 278
    iget-object v7, v5, Lmd/e;->g:Lmd/f;

    .line 279
    .line 280
    invoke-virtual {v7, v15}, Lmd/f;->a(Lmd/a;)Z

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    if-eqz v7, :cond_8

    .line 285
    .line 286
    :goto_5
    const/4 v5, 0x1

    .line 287
    goto :goto_4

    .line 288
    :cond_8
    iget-object v7, v14, Lud/a;->n:Ljava/util/List;

    .line 289
    .line 290
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 291
    .line 292
    .line 293
    move-result v18

    .line 294
    if-eqz v18, :cond_9

    .line 295
    .line 296
    invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    const-string v7, "No successors for splitter: "

    .line 301
    .line 302
    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    invoke-virtual {v2, v5}, Lnd/b0;->I(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_9
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v7

    .line 314
    check-cast v7, Lud/a;

    .line 315
    .line 316
    invoke-static {v2, v7, v5}, La/a;->h0(Lud/r;Lud/a;Lud/a;)Lud/a;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    if-eqz v6, :cond_a

    .line 321
    .line 322
    if-eq v6, v7, :cond_a

    .line 323
    .line 324
    if-eq v6, v5, :cond_a

    .line 325
    .line 326
    invoke-virtual {v13, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    :cond_a
    const/4 v5, 0x1

    .line 330
    const/4 v6, 0x0

    .line 331
    goto :goto_4

    .line 332
    :cond_b
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 333
    .line 334
    .line 335
    move-result-object v5

    .line 336
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 337
    .line 338
    .line 339
    move-result v6

    .line 340
    if-eqz v6, :cond_16

    .line 341
    .line 342
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    check-cast v6, Lae/f;

    .line 347
    .line 348
    iget-object v7, v6, Lae/f;->c:Lud/a;

    .line 349
    .line 350
    if-nez v7, :cond_c

    .line 351
    .line 352
    goto :goto_6

    .line 353
    :cond_c
    iget-object v10, v3, Lle/c;->a:Ljava/util/ArrayDeque;

    .line 354
    .line 355
    invoke-virtual {v10}, Ljava/util/ArrayDeque;->clear()V

    .line 356
    .line 357
    .line 358
    new-instance v10, Lle/b;

    .line 359
    .line 360
    invoke-direct {v10}, Lle/b;-><init>()V

    .line 361
    .line 362
    .line 363
    iput-object v10, v3, Lle/c;->b:Lle/b;

    .line 364
    .line 365
    iget-boolean v10, v6, Lae/f;->h:Z

    .line 366
    .line 367
    if-eqz v10, :cond_d

    .line 368
    .line 369
    invoke-static {v7}, La/a;->j0(Lud/a;)Lud/a;

    .line 370
    .line 371
    .line 372
    move-result-object v10

    .line 373
    goto :goto_8

    .line 374
    :cond_d
    invoke-virtual {v13}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 375
    .line 376
    .line 377
    move-result-object v10

    .line 378
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 379
    .line 380
    .line 381
    move-result v11

    .line 382
    if-eqz v11, :cond_e

    .line 383
    .line 384
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v11

    .line 388
    check-cast v11, Lud/a;

    .line 389
    .line 390
    invoke-virtual {v3, v11}, Lle/c;->a(Lud/a;)V

    .line 391
    .line 392
    .line 393
    goto :goto_7

    .line 394
    :cond_e
    move-object v10, v7

    .line 395
    :goto_8
    iget-object v11, v10, Lmd/e;->g:Lmd/f;

    .line 396
    .line 397
    invoke-virtual {v11, v15}, Lmd/f;->a(Lmd/a;)Z

    .line 398
    .line 399
    .line 400
    move-result v11

    .line 401
    if-eqz v11, :cond_f

    .line 402
    .line 403
    goto :goto_6

    .line 404
    :cond_f
    new-instance v11, Ljava/util/ArrayList;

    .line 405
    .line 406
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 407
    .line 408
    .line 409
    invoke-static {v6, v2}, La/a;->k0(Lae/f;Lud/r;)Lud/a;

    .line 410
    .line 411
    .line 412
    move-result-object v12

    .line 413
    if-eqz v12, :cond_10

    .line 414
    .line 415
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    goto :goto_9

    .line 419
    :cond_10
    iget-object v10, v10, Lud/a;->r:Ljava/util/BitSet;

    .line 420
    .line 421
    invoke-static {v2, v10}, La/a;->q(Lud/r;Ljava/util/BitSet;)Ljava/util/List;

    .line 422
    .line 423
    .line 424
    move-result-object v10

    .line 425
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 426
    .line 427
    .line 428
    :goto_9
    invoke-virtual {v2, v7}, Lud/r;->U(Lud/a;)Lnd/t;

    .line 429
    .line 430
    .line 431
    move-result-object v10

    .line 432
    if-eqz v10, :cond_11

    .line 433
    .line 434
    const/4 v10, 0x1

    .line 435
    goto :goto_a

    .line 436
    :cond_11
    const/4 v10, 0x0

    .line 437
    :goto_a
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 438
    .line 439
    .line 440
    move-result-object v11

    .line 441
    :cond_12
    :goto_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 442
    .line 443
    .line 444
    move-result v12

    .line 445
    if-eqz v12, :cond_14

    .line 446
    .line 447
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v12

    .line 451
    check-cast v12, Lud/a;

    .line 452
    .line 453
    if-eqz v10, :cond_13

    .line 454
    .line 455
    invoke-static {v7, v12}, La/a;->s0(Lud/a;Lud/a;)Z

    .line 456
    .line 457
    .line 458
    move-result v14

    .line 459
    if-eqz v14, :cond_12

    .line 460
    .line 461
    :cond_13
    iget-object v14, v2, Lud/r;->G:Lxd/b;

    .line 462
    .line 463
    invoke-static {v12, v14}, Lf8/i;->Z(Lud/a;Lud/j;)Z

    .line 464
    .line 465
    .line 466
    move-result v14

    .line 467
    if-eqz v14, :cond_12

    .line 468
    .line 469
    invoke-virtual {v3, v12}, Lle/c;->a(Lud/a;)V

    .line 470
    .line 471
    .line 472
    goto :goto_b

    .line 473
    :cond_14
    invoke-virtual {v0, v7}, Li4/y;->b(Lud/a;)Lxd/b;

    .line 474
    .line 475
    .line 476
    move-result-object v10

    .line 477
    iput-object v10, v6, Lae/f;->e:Lxd/b;

    .line 478
    .line 479
    sget-object v10, Lmd/b;->E:Lmd/b;

    .line 480
    .line 481
    iget-object v11, v7, Lmd/e;->g:Lmd/f;

    .line 482
    .line 483
    invoke-virtual {v11, v10}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 484
    .line 485
    .line 486
    move-result-object v10

    .line 487
    check-cast v10, Lae/c;

    .line 488
    .line 489
    if-nez v10, :cond_15

    .line 490
    .line 491
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v6

    .line 495
    const-string v7, "Missing exception handler attribute for start block: "

    .line 496
    .line 497
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v6

    .line 501
    invoke-virtual {v2, v6}, Lnd/b0;->K(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    goto/16 :goto_6

    .line 505
    .line 506
    :cond_15
    iget-object v6, v6, Lae/f;->e:Lxd/b;

    .line 507
    .line 508
    invoke-virtual {v6, v10}, Lmd/e;->y(Loc/b;)V

    .line 509
    .line 510
    .line 511
    goto/16 :goto_6

    .line 512
    .line 513
    :cond_16
    const/4 v5, 0x1

    .line 514
    const/4 v6, 0x0

    .line 515
    goto/16 :goto_2

    .line 516
    .line 517
    :cond_17
    new-instance v5, Ljava/util/HashSet;

    .line 518
    .line 519
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 520
    .line 521
    .line 522
    iget-object v6, v2, Lud/r;->G:Lxd/b;

    .line 523
    .line 524
    invoke-static {v6, v5}, Lf8/i;->y(Lud/j;Ljava/util/HashSet;)V

    .line 525
    .line 526
    .line 527
    new-instance v6, Ljava/util/HashSet;

    .line 528
    .line 529
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 530
    .line 531
    .line 532
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 533
    .line 534
    .line 535
    move-result-object v4

    .line 536
    :cond_18
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 537
    .line 538
    .line 539
    move-result v7

    .line 540
    if-eqz v7, :cond_1b

    .line 541
    .line 542
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v7

    .line 546
    check-cast v7, Lae/h;

    .line 547
    .line 548
    iget-object v7, v7, Lae/h;->h:Ljava/util/List;

    .line 549
    .line 550
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 551
    .line 552
    .line 553
    move-result-object v7

    .line 554
    :cond_19
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 555
    .line 556
    .line 557
    move-result v9

    .line 558
    if-eqz v9, :cond_18

    .line 559
    .line 560
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v9

    .line 564
    check-cast v9, Lae/f;

    .line 565
    .line 566
    iget-object v9, v9, Lae/f;->e:Lxd/b;

    .line 567
    .line 568
    if-eqz v9, :cond_19

    .line 569
    .line 570
    invoke-static {v9}, Lf8/i;->D(Lud/j;)Lud/h;

    .line 571
    .line 572
    .line 573
    move-result-object v10

    .line 574
    instance-of v11, v10, Lud/a;

    .line 575
    .line 576
    if-eqz v11, :cond_1a

    .line 577
    .line 578
    check-cast v10, Lud/a;

    .line 579
    .line 580
    iget-object v10, v10, Lud/a;->n:Ljava/util/List;

    .line 581
    .line 582
    invoke-interface {v6, v10}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 583
    .line 584
    .line 585
    :cond_1a
    invoke-static {v9, v5}, Lf8/i;->y(Lud/j;Ljava/util/HashSet;)V

    .line 586
    .line 587
    .line 588
    goto :goto_c

    .line 589
    :cond_1b
    invoke-interface {v6, v5}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 590
    .line 591
    .line 592
    invoke-virtual {v6}, Ljava/util/HashSet;->isEmpty()Z

    .line 593
    .line 594
    .line 595
    move-result v4

    .line 596
    if-eqz v4, :cond_1c

    .line 597
    .line 598
    const/4 v4, 0x0

    .line 599
    goto :goto_e

    .line 600
    :cond_1c
    new-instance v4, Lxd/b;

    .line 601
    .line 602
    iget-object v5, v2, Lud/r;->G:Lxd/b;

    .line 603
    .line 604
    invoke-direct {v4, v5}, Lxd/b;-><init>(Lud/n;)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 608
    .line 609
    .line 610
    move-result-object v5

    .line 611
    :cond_1d
    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 612
    .line 613
    .line 614
    move-result v6

    .line 615
    if-eqz v6, :cond_1e

    .line 616
    .line 617
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v6

    .line 621
    check-cast v6, Lud/h;

    .line 622
    .line 623
    instance-of v7, v6, Lud/a;

    .line 624
    .line 625
    if-eqz v7, :cond_1d

    .line 626
    .line 627
    iget-object v7, v3, Lle/c;->a:Ljava/util/ArrayDeque;

    .line 628
    .line 629
    invoke-virtual {v7}, Ljava/util/ArrayDeque;->clear()V

    .line 630
    .line 631
    .line 632
    new-instance v7, Lle/b;

    .line 633
    .line 634
    invoke-direct {v7}, Lle/b;-><init>()V

    .line 635
    .line 636
    .line 637
    iput-object v7, v3, Lle/c;->b:Lle/b;

    .line 638
    .line 639
    invoke-virtual {v3, v4}, Lle/c;->c(Lxd/a;)V

    .line 640
    .line 641
    .line 642
    check-cast v6, Lud/a;

    .line 643
    .line 644
    invoke-virtual {v0, v6}, Li4/y;->b(Lud/a;)Lxd/b;

    .line 645
    .line 646
    .line 647
    move-result-object v6

    .line 648
    invoke-virtual {v4, v6}, Lxd/b;->H(Lud/j;)V

    .line 649
    .line 650
    .line 651
    goto :goto_d

    .line 652
    :cond_1e
    :goto_e
    if-eqz v4, :cond_1f

    .line 653
    .line 654
    iget-object v0, v2, Lud/r;->G:Lxd/b;

    .line 655
    .line 656
    invoke-virtual {v0, v4}, Lxd/b;->H(Lud/j;)V

    .line 657
    .line 658
    .line 659
    :cond_1f
    :goto_f
    iget-object v0, v2, Lud/r;->z:Ljava/util/List;

    .line 660
    .line 661
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    new-instance v3, Lcom/alibaba/fastjson2/writer/b;

    .line 666
    .line 667
    const/16 v4, 0x1a

    .line 668
    .line 669
    invoke-direct {v3, v4}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 670
    .line 671
    .line 672
    invoke-interface {v0, v3}, Ljava/util/stream/Stream;->flatMap(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    new-instance v3, Lce/n;

    .line 677
    .line 678
    const/16 v4, 0xb

    .line 679
    .line 680
    invoke-direct {v3, v4}, Lce/n;-><init>(I)V

    .line 681
    .line 682
    .line 683
    invoke-interface {v0, v3}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 684
    .line 685
    .line 686
    move-result v0

    .line 687
    if-eqz v0, :cond_20

    .line 688
    .line 689
    invoke-static {v2}, Lbe/b;->Y(Lud/r;)V

    .line 690
    .line 691
    .line 692
    :cond_20
    iget-boolean v0, v2, Lud/r;->p:Z

    .line 693
    .line 694
    if-nez v0, :cond_28

    .line 695
    .line 696
    iget-object v0, v2, Lud/r;->E:Ljava/util/List;

    .line 697
    .line 698
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 699
    .line 700
    .line 701
    move-result v0

    .line 702
    if-eqz v0, :cond_21

    .line 703
    .line 704
    goto/16 :goto_12

    .line 705
    .line 706
    :cond_21
    iget-object v0, v2, Lmd/e;->g:Lmd/f;

    .line 707
    .line 708
    invoke-virtual {v0, v8}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 713
    .line 714
    .line 715
    move-result v3

    .line 716
    const/4 v4, 0x5

    .line 717
    if-eqz v3, :cond_22

    .line 718
    .line 719
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 720
    .line 721
    goto :goto_10

    .line 722
    :cond_22
    new-instance v3, Ljava/util/ArrayList;

    .line 723
    .line 724
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 725
    .line 726
    .line 727
    new-instance v0, Lb8/c;

    .line 728
    .line 729
    invoke-direct {v0, v4}, Lb8/c;-><init>(I)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 733
    .line 734
    .line 735
    move-object v0, v3

    .line 736
    :goto_10
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 737
    .line 738
    .line 739
    move-result v3

    .line 740
    if-eqz v3, :cond_23

    .line 741
    .line 742
    goto :goto_12

    .line 743
    :cond_23
    new-instance v3, Lke/h;

    .line 744
    .line 745
    const/4 v5, 0x0

    .line 746
    invoke-direct {v3, v0, v5}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 747
    .line 748
    .line 749
    iget-object v0, v2, Lud/r;->z:Ljava/util/List;

    .line 750
    .line 751
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 752
    .line 753
    .line 754
    move-result v0

    .line 755
    mul-int/2addr v0, v4

    .line 756
    const/4 v4, 0x0

    .line 757
    :goto_11
    iget-object v5, v2, Lud/r;->G:Lxd/b;

    .line 758
    .line 759
    invoke-static {v2, v3, v5}, Lx6/d;->j0(Lud/r;Lke/d;Lud/j;)Z

    .line 760
    .line 761
    .line 762
    move-result v5

    .line 763
    if-nez v5, :cond_25

    .line 764
    .line 765
    iget-object v6, v2, Lud/r;->E:Ljava/util/List;

    .line 766
    .line 767
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 768
    .line 769
    .line 770
    move-result-object v6

    .line 771
    :cond_24
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 772
    .line 773
    .line 774
    move-result v7

    .line 775
    if-eqz v7, :cond_25

    .line 776
    .line 777
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    move-result-object v5

    .line 781
    check-cast v5, Lae/f;

    .line 782
    .line 783
    iget-object v5, v5, Lae/f;->e:Lxd/b;

    .line 784
    .line 785
    invoke-static {v2, v3, v5}, Lx6/d;->j0(Lud/r;Lke/d;Lud/j;)Z

    .line 786
    .line 787
    .line 788
    move-result v5

    .line 789
    if-eqz v5, :cond_24

    .line 790
    .line 791
    :cond_25
    add-int/lit8 v6, v4, 0x1

    .line 792
    .line 793
    if-gt v4, v0, :cond_27

    .line 794
    .line 795
    if-nez v5, :cond_26

    .line 796
    .line 797
    goto :goto_12

    .line 798
    :cond_26
    move v4, v6

    .line 799
    goto :goto_11

    .line 800
    :cond_27
    new-instance v3, Laf/g;

    .line 801
    .line 802
    const-class v4, Lke/h;

    .line 803
    .line 804
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v4

    .line 808
    iget-object v2, v2, Lud/r;->z:Ljava/util/List;

    .line 809
    .line 810
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 811
    .line 812
    .line 813
    move-result v2

    .line 814
    new-instance v5, Ljava/lang/StringBuilder;

    .line 815
    .line 816
    const-string v6, "Iterative traversal limit reached: limit: "

    .line 817
    .line 818
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 819
    .line 820
    .line 821
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 822
    .line 823
    .line 824
    const-string v0, ", visitor: "

    .line 825
    .line 826
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 827
    .line 828
    .line 829
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 830
    .line 831
    .line 832
    const-string v0, ", blocks count: "

    .line 833
    .line 834
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 835
    .line 836
    .line 837
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    throw v3

    .line 848
    :cond_28
    :goto_12
    sget-object v0, Lke/g;->k:Lke/g;

    .line 849
    .line 850
    iget-object v3, v2, Lud/r;->G:Lxd/b;

    .line 851
    .line 852
    invoke-static {v2, v0, v3}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 853
    .line 854
    .line 855
    invoke-static {v2}, Lke/c;->q(Lud/r;)V

    .line 856
    .line 857
    .line 858
    iget-object v0, v2, Lud/r;->m:Lb5/k;

    .line 859
    .line 860
    iget v0, v0, Lb5/k;->b:I

    .line 861
    .line 862
    const v3, 0x20020

    .line 863
    .line 864
    .line 865
    and-int/2addr v0, v3

    .line 866
    if-eqz v0, :cond_2e

    .line 867
    .line 868
    sget v0, Lle/f;->b:I

    .line 869
    .line 870
    iget-object v0, v2, Lud/r;->G:Lxd/b;

    .line 871
    .line 872
    iget-object v3, v0, Lxd/b;->k:Ljava/util/ArrayList;

    .line 873
    .line 874
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 875
    .line 876
    .line 877
    move-result v4

    .line 878
    if-nez v4, :cond_2e

    .line 879
    .line 880
    const/4 v5, 0x0

    .line 881
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v4

    .line 885
    instance-of v4, v4, Lxd/e;

    .line 886
    .line 887
    if-eqz v4, :cond_2e

    .line 888
    .line 889
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object v3

    .line 893
    check-cast v3, Lxd/e;

    .line 894
    .line 895
    iget-object v4, v3, Lxd/e;->k:Lud/p;

    .line 896
    .line 897
    invoke-virtual {v4, v5}, Lud/p;->S(I)Lqd/l;

    .line 898
    .line 899
    .line 900
    move-result-object v6

    .line 901
    iget-object v5, v2, Lud/r;->m:Lb5/k;

    .line 902
    .line 903
    invoke-virtual {v5}, Lb5/k;->h()Z

    .line 904
    .line 905
    .line 906
    move-result v5

    .line 907
    if-eqz v5, :cond_2b

    .line 908
    .line 909
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 910
    .line 911
    .line 912
    instance-of v5, v6, Lqd/m;

    .line 913
    .line 914
    if-eqz v5, :cond_2a

    .line 915
    .line 916
    invoke-virtual {v6}, Lqd/l;->K()Z

    .line 917
    .line 918
    .line 919
    move-result v7

    .line 920
    if-eqz v7, :cond_2a

    .line 921
    .line 922
    if-eqz v5, :cond_29

    .line 923
    .line 924
    move-object v5, v6

    .line 925
    check-cast v5, Lqd/m;

    .line 926
    .line 927
    iget-object v7, v5, Lqd/m;->l:Lud/p;

    .line 928
    .line 929
    goto :goto_13

    .line 930
    :cond_29
    const/4 v7, 0x0

    .line 931
    :goto_13
    iget-object v5, v7, Lud/p;->k:Lpd/k;

    .line 932
    .line 933
    sget-object v8, Lpd/k;->i:Lpd/k;

    .line 934
    .line 935
    if-ne v5, v8, :cond_2a

    .line 936
    .line 937
    check-cast v7, Lpd/c;

    .line 938
    .line 939
    iget-object v5, v7, Lpd/c;->o:Lqd/j;

    .line 940
    .line 941
    iget-object v7, v2, Lud/r;->l:Lud/e;

    .line 942
    .line 943
    invoke-virtual {v7}, Lud/e;->b0()Lqd/j;

    .line 944
    .line 945
    .line 946
    move-result-object v7

    .line 947
    invoke-virtual {v5, v7}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 948
    .line 949
    .line 950
    move-result v5

    .line 951
    if-eqz v5, :cond_2a

    .line 952
    .line 953
    goto :goto_14

    .line 954
    :cond_2a
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 955
    .line 956
    .line 957
    move-result-object v0

    .line 958
    const-string v3, "In static synchronized method top region not synchronized by class const: "

    .line 959
    .line 960
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 961
    .line 962
    .line 963
    move-result-object v0

    .line 964
    invoke-virtual {v2, v0}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 965
    .line 966
    .line 967
    goto :goto_16

    .line 968
    :cond_2b
    invoke-virtual {v6}, Lqd/l;->N()Z

    .line 969
    .line 970
    .line 971
    move-result v5

    .line 972
    if-eqz v5, :cond_2d

    .line 973
    .line 974
    :goto_14
    iget-object v0, v0, Lxd/b;->k:Ljava/util/ArrayList;

    .line 975
    .line 976
    iget-object v5, v3, Lxd/e;->m:Lxd/b;

    .line 977
    .line 978
    const/4 v6, 0x0

    .line 979
    invoke-virtual {v0, v6, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    invoke-static {v2, v4}, Lxe/l;->d(Lud/r;Lud/p;)V

    .line 983
    .line 984
    .line 985
    iget-object v0, v3, Lxd/e;->l:Ljava/util/ArrayList;

    .line 986
    .line 987
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 992
    .line 993
    .line 994
    move-result v3

    .line 995
    if-eqz v3, :cond_2c

    .line 996
    .line 997
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 998
    .line 999
    .line 1000
    move-result-object v3

    .line 1001
    check-cast v3, Lud/p;

    .line 1002
    .line 1003
    invoke-static {v2, v3}, Lxe/l;->d(Lud/r;Lud/p;)V

    .line 1004
    .line 1005
    .line 1006
    goto :goto_15

    .line 1007
    :cond_2c
    invoke-static {v2}, Lke/c;->q(Lud/r;)V

    .line 1008
    .line 1009
    .line 1010
    goto :goto_16

    .line 1011
    :cond_2d
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v0

    .line 1015
    const-string v3, "In synchronized method top region not synchronized by \'this\': "

    .line 1016
    .line 1017
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    invoke-virtual {v2, v0}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 1022
    .line 1023
    .line 1024
    :cond_2e
    :goto_16
    return-void

    .line 1025
    :pswitch_3
    iget-boolean v0, v2, Lud/r;->p:Z

    .line 1026
    .line 1027
    if-eqz v0, :cond_2f

    .line 1028
    .line 1029
    goto :goto_17

    .line 1030
    :cond_2f
    invoke-static {v2}, Lke/c;->r(Lud/r;)V

    .line 1031
    .line 1032
    .line 1033
    :goto_17
    return-void

    .line 1034
    :pswitch_4
    invoke-static {v2}, Lke/c;->q(Lud/r;)V

    .line 1035
    .line 1036
    .line 1037
    return-void

    .line 1038
    nop

    .line 1039
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public s(Lhb/r;Lxd/c;)Z
    .locals 5

    .line 1
    iget-object v0, p2, Lxd/c;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lxd/d;->m:Luf/d;

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    move v0, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v3

    .line 22
    :goto_0
    iget-object p2, p2, Lxd/c;->b:Lud/j;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    return v2

    .line 32
    :cond_1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    invoke-direct {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p1, Lhb/r;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lud/r;

    .line 40
    .line 41
    new-instance v3, Lce/a;

    .line 42
    .line 43
    invoke-direct {v3, p0, v0, p1}, Lce/a;-><init>(Lke/c;Ljava/util/concurrent/atomic/AtomicBoolean;Lhb/r;)V

    .line 44
    .line 45
    .line 46
    new-instance p1, Lke/a;

    .line 47
    .line 48
    const/4 v4, 0x4

    .line 49
    invoke-direct {p1, v3, v4}, Lke/a;-><init>(Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v1, p1, p2}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    xor-int/2addr p1, v2

    .line 60
    return p1
.end method
