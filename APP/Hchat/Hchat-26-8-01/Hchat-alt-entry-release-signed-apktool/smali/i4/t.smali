.class public final Li4/t;
.super Li4/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final h:Li4/u;

.field public final i:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 83
    :goto_0
    invoke-direct {p0, v0}, Lz4/j;-><init>(Z)V

    .line 84
    new-instance v0, Li4/u;

    invoke-direct {v0, p1}, Li4/u;-><init>(I)V

    iput-object v0, p0, Li4/t;->h:Li4/u;

    .line 85
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Li4/t;->i:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Li4/t;)V
    .locals 5

    .line 1
    iget-object v0, p1, Li4/t;->h:Li4/u;

    .line 2
    .line 3
    iget-object v0, v0, Li4/u;->h:[Lw4/d;

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v2

    .line 12
    :goto_0
    invoke-direct {p0, v1}, Lz4/j;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Li4/u;

    .line 16
    .line 17
    array-length v3, v0

    .line 18
    invoke-direct {v1, v3}, Li4/u;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iget-object v3, v1, Li4/u;->h:[Lw4/d;

    .line 22
    .line 23
    array-length v4, v0

    .line 24
    invoke-static {v0, v2, v3, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Li4/t;->h:Li4/u;

    .line 28
    .line 29
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    iget-object v1, p1, Li4/t;->i:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Li4/t;->i:Ljava/util/ArrayList;

    .line 41
    .line 42
    iget-object v0, p1, Li4/t;->i:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    :goto_1
    if-ge v2, v0, :cond_2

    .line 49
    .line 50
    iget-object v1, p1, Li4/t;->i:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Li4/s;

    .line 57
    .line 58
    iget-object v3, p0, Li4/t;->i:Ljava/util/ArrayList;

    .line 59
    .line 60
    if-nez v1, :cond_1

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_1
    invoke-virtual {v1}, Li4/s;->m()Li4/s;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    return-void
.end method

.method public constructor <init>(Li4/u;Ljava/util/ArrayList;)V
    .locals 1

    .line 78
    iget-object v0, p1, Li4/u;->h:[Lw4/d;

    .line 79
    array-length v0, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 80
    :goto_0
    invoke-direct {p0, v0}, Lz4/j;-><init>(Z)V

    .line 81
    iput-object p1, p0, Li4/t;->h:Li4/u;

    .line 82
    iput-object p2, p0, Li4/t;->i:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "(locals array set; primary)\n"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Li4/t;->h:Li4/u;

    .line 9
    .line 10
    invoke-virtual {v1}, Li4/u;->a()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0xa

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Li4/t;->i:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x0

    .line 29
    :goto_0
    if-ge v4, v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Li4/s;

    .line 36
    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    new-instance v6, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v7, "(locals array set: primary for caller "

    .line 42
    .line 43
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v4}, La/a;->X0(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v7, ")\n"

    .line 54
    .line 55
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5}, Li4/s;->o()Li4/u;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {v5}, Li4/u;->a()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0
.end method

.method public final i()V
    .locals 3

    .line 1
    iget-object v0, p0, Li4/t;->h:Li4/u;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lz4/j;->g:Z

    .line 5
    .line 6
    iget-object v0, p0, Li4/t;->i:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Li4/s;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, Lz4/j;->i()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iput-boolean v1, p0, Lz4/j;->g:Z

    .line 31
    .line 32
    return-void
.end method

.method public final l(Li4/b0;)V
    .locals 6

    .line 1
    const-string v0, "(locals array set; primary)"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lf4/a;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li4/t;->h:Li4/u;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Li4/u;->l(Li4/b0;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Li4/t;->i:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Li4/s;

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    new-instance v4, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v5, "(locals array set: primary for caller "

    .line 31
    .line 32
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v2}, La/a;->X0(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const/16 v5, 0x29

    .line 43
    .line 44
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {p1, v4}, Lf4/a;->a(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Li4/s;->o()Li4/u;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3, p1}, Li4/u;->l(Li4/b0;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return-void
.end method

.method public final m()Li4/s;
    .locals 1

    .line 1
    new-instance v0, Li4/t;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Li4/t;-><init>(Li4/t;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final n(I)Lw4/d;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/t;->h:Li4/u;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li4/u;->n(I)Lw4/d;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final o()Li4/u;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/t;->h:Li4/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p(Lw4/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li4/t;->h:Li4/u;

    .line 2
    .line 3
    iget-object v1, v0, Li4/u;->h:[Lw4/d;

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lz4/j;->j()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Li4/u;->p(Lw4/c;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Li4/t;->i:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Li4/s;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Li4/s;->p(Lw4/c;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    :goto_1
    return-void
.end method

.method public final q(Li4/s;)Li4/s;
    .locals 2

    .line 1
    :try_start_0
    instance-of v0, p1, Li4/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Li4/t;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Li4/t;->v(Li4/t;)Li4/t;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    move-object v0, p1

    .line 16
    check-cast v0, Li4/u;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Li4/t;->u(Li4/u;)Li4/t;

    .line 19
    .line 20
    .line 21
    move-result-object p1
    :try_end_0
    .catch Li4/b0; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :goto_0
    invoke-virtual {p1}, Li4/t;->i()V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    :goto_1
    const-string v1, "underlay locals:"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lf4/a;->a(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Li4/t;->l(Li4/b0;)V

    .line 32
    .line 33
    .line 34
    const-string v1, "overlay locals:"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lf4/a;->a(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Li4/s;->l(Li4/b0;)V

    .line 40
    .line 41
    .line 42
    throw v0
.end method

.method public final r(Li4/s;I)Li4/t;
    .locals 9

    .line 1
    iget-object v0, p0, Li4/t;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-lt p2, v1, :cond_0

    .line 9
    .line 10
    move-object v1, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Li4/s;

    .line 17
    .line 18
    :goto_0
    invoke-virtual {p1}, Li4/s;->o()Li4/u;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget-object v4, p0, Li4/t;->h:Li4/u;

    .line 23
    .line 24
    invoke-virtual {v4, v3}, Li4/u;->u(Li4/u;)Li4/u;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-ne v1, p1, :cond_1

    .line 29
    .line 30
    move-object p1, v1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    if-nez v1, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-virtual {v1, p1}, Li4/s;->q(Li4/s;)Li4/s;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    :goto_1
    if-ne p1, v1, :cond_3

    .line 40
    .line 41
    if-ne v3, v4, :cond_3

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/lit8 v3, p2, 0x1

    .line 49
    .line 50
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    new-instance v4, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    move-object v6, v2

    .line 61
    :goto_2
    if-ge v5, v3, :cond_8

    .line 62
    .line 63
    if-ne v5, p2, :cond_4

    .line 64
    .line 65
    move-object v7, p1

    .line 66
    goto :goto_3

    .line 67
    :cond_4
    if-ge v5, v1, :cond_5

    .line 68
    .line 69
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    check-cast v7, Li4/s;

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    move-object v7, v2

    .line 77
    :goto_3
    if-eqz v7, :cond_7

    .line 78
    .line 79
    if-nez v6, :cond_6

    .line 80
    .line 81
    invoke-virtual {v7}, Li4/s;->o()Li4/u;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    goto :goto_4

    .line 86
    :cond_6
    invoke-virtual {v7}, Li4/s;->o()Li4/u;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-virtual {v6, v8}, Li4/u;->u(Li4/u;)Li4/u;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    :cond_7
    :goto_4
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    add-int/lit8 v5, v5, 0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_8
    new-instance p1, Li4/t;

    .line 101
    .line 102
    invoke-direct {p1, v6, v4}, Li4/t;-><init>(Li4/u;Ljava/util/ArrayList;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Li4/t;->i()V

    .line 106
    .line 107
    .line 108
    return-object p1
.end method

.method public final s(ILw4/d;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lz4/j;->j()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li4/t;->h:Li4/u;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Li4/u;->s(ILw4/d;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Li4/t;->i:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Li4/s;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1, p1, p2}, Li4/s;->s(ILw4/d;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-void
.end method

.method public final t(Lu4/o;)V
    .locals 1

    .line 1
    iget v0, p1, Lu4/o;->g:I

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Li4/t;->s(ILw4/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final u(Li4/u;)Li4/t;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li4/t;->h:Li4/u;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Li4/u;->u(Li4/u;)Li4/u;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v3, p0, Li4/t;->i:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/4 v5, 0x0

    .line 26
    move v6, v5

    .line 27
    move v7, v6

    .line 28
    :goto_0
    if-ge v6, v4, :cond_3

    .line 29
    .line 30
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    check-cast v8, Li4/s;

    .line 35
    .line 36
    if-eqz v8, :cond_0

    .line 37
    .line 38
    :try_start_0
    invoke-virtual {v8, p1}, Li4/s;->q(Li4/s;)Li4/s;

    .line 39
    .line 40
    .line 41
    move-result-object v9
    :try_end_0
    .catch Li4/b0; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    goto :goto_1

    .line 43
    :catch_0
    move-exception v9

    .line 44
    invoke-static {v6}, La/a;->X0(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v10

    .line 48
    const-string v11, "Merging one locals against caller block "

    .line 49
    .line 50
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    invoke-virtual {v9, v10}, Lf4/a;->a(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    const/4 v9, 0x0

    .line 58
    :goto_1
    if-nez v7, :cond_2

    .line 59
    .line 60
    if-eq v8, v9, :cond_1

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_1
    move v7, v5

    .line 64
    goto :goto_3

    .line 65
    :cond_2
    :goto_2
    const/4 v7, 0x1

    .line 66
    :goto_3
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    add-int/lit8 v6, v6, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    if-ne v0, v1, :cond_4

    .line 73
    .line 74
    if-nez v7, :cond_4

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_4
    new-instance p1, Li4/t;

    .line 78
    .line 79
    invoke-direct {p1, v1, v2}, Li4/t;-><init>(Li4/u;Ljava/util/ArrayList;)V

    .line 80
    .line 81
    .line 82
    return-object p1
.end method

.method public final v(Li4/t;)Li4/t;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Li4/t;->h:Li4/u;

    .line 6
    .line 7
    iget-object v3, v1, Li4/t;->h:Li4/u;

    .line 8
    .line 9
    invoke-virtual {v3, v2}, Li4/u;->u(Li4/u;)Li4/u;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v4, v1, Li4/t;->i:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    iget-object v6, v0, Li4/t;->i:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    new-instance v9, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v9, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    const/4 v11, 0x0

    .line 35
    const/4 v12, 0x0

    .line 36
    :goto_0
    if-ge v11, v8, :cond_7

    .line 37
    .line 38
    const/4 v13, 0x0

    .line 39
    if-ge v11, v5, :cond_0

    .line 40
    .line 41
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Li4/s;

    .line 46
    .line 47
    move-object v14, v0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    move-object v14, v13

    .line 50
    :goto_1
    if-ge v11, v7, :cond_1

    .line 51
    .line 52
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Li4/s;

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    move-object v0, v13

    .line 60
    :goto_2
    if-ne v14, v0, :cond_2

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_2
    if-nez v14, :cond_3

    .line 64
    .line 65
    move-object v13, v0

    .line 66
    goto :goto_4

    .line 67
    :cond_3
    if-nez v0, :cond_4

    .line 68
    .line 69
    :goto_3
    move-object v13, v14

    .line 70
    goto :goto_4

    .line 71
    :cond_4
    :try_start_0
    invoke-virtual {v14, v0}, Li4/s;->q(Li4/s;)Li4/s;

    .line 72
    .line 73
    .line 74
    move-result-object v13
    :try_end_0
    .catch Li4/b0; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    goto :goto_4

    .line 76
    :catch_0
    move-exception v0

    .line 77
    invoke-static {v11}, La/a;->X0(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v15

    .line 81
    const-string v10, "Merging locals set for caller block "

    .line 82
    .line 83
    invoke-virtual {v10, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    invoke-virtual {v0, v10}, Lf4/a;->a(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :goto_4
    if-nez v12, :cond_6

    .line 91
    .line 92
    if-eq v14, v13, :cond_5

    .line 93
    .line 94
    goto :goto_5

    .line 95
    :cond_5
    const/4 v12, 0x0

    .line 96
    goto :goto_6

    .line 97
    :cond_6
    :goto_5
    const/4 v0, 0x1

    .line 98
    move v12, v0

    .line 99
    :goto_6
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    add-int/lit8 v11, v11, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_7
    if-ne v3, v2, :cond_8

    .line 106
    .line 107
    if-nez v12, :cond_8

    .line 108
    .line 109
    return-object v1

    .line 110
    :cond_8
    new-instance v0, Li4/t;

    .line 111
    .line 112
    invoke-direct {v0, v2, v9}, Li4/t;-><init>(Li4/u;Ljava/util/ArrayList;)V

    .line 113
    .line 114
    .line 115
    return-object v0
.end method
