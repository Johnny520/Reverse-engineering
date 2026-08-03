.class public Ll7/l;
.super Ll7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ll7/b;
.implements Ljava/lang/Iterable;


# instance fields
.field public final o:Lu7/b;

.field public final p:Lj7/b;

.field public final q:Lz7/c;

.field public r:La7/c;

.field public s:Ll7/e;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    new-instance v0, Lp7/j;

    .line 2
    .line 3
    invoke-direct {v0}, Lp7/j;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {p0, v0, v1}, Ll7/a;-><init>(Lp7/a;I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lu7/b;

    .line 11
    .line 12
    new-instance v2, Lokio/a;

    .line 13
    .line 14
    const/16 v3, 0x12

    .line 15
    .line 16
    invoke-direct {v2, v3}, Lokio/a;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-direct {v1, v4, v4, v2, v3}, Lu7/b;-><init>(ZZLokio/a;I)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Ll7/l;->o:Lu7/b;

    .line 25
    .line 26
    new-instance v2, Lj7/b;

    .line 27
    .line 28
    iget-object v0, v0, Lp7/j;->r:Lr7/f;

    .line 29
    .line 30
    invoke-direct {v2, v0}, Lj7/b;-><init>(Lr7/f;)V

    .line 31
    .line 32
    .line 33
    iput-object v2, p0, Ll7/l;->p:Lj7/b;

    .line 34
    .line 35
    new-instance v0, Lz7/c;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-direct {v0, v3}, Lz7/c;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Ll7/l;->q:Lz7/c;

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Lo7/d;->P(Lk7/a;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v2}, Lo7/d;->P(Lk7/a;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lq7/b;->available()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iput-boolean v1, p0, Lk7/a;->i:Z

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Ll7/a;->m:Lp7/a;

    .line 12
    .line 13
    check-cast v0, Lp7/j;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lp7/a;->Q()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x3

    .line 23
    if-ne v2, v3, :cond_6

    .line 24
    .line 25
    invoke-static {p1}, Lp7/b;->T(Lq7/b;)Lp7/b;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v2, p0, Ll7/l;->p:Lj7/b;

    .line 30
    .line 31
    invoke-virtual {v2}, Lo7/b;->N()V

    .line 32
    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    :goto_0
    iget-object v4, p0, Ll7/l;->o:Lu7/b;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    invoke-virtual {p1}, Lq7/b;->b()Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_4

    .line 44
    .line 45
    invoke-virtual {v0}, Lp7/a;->Q()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v5, 0x2

    .line 50
    if-ne v0, v5, :cond_1

    .line 51
    .line 52
    if-nez v3, :cond_3

    .line 53
    .line 54
    invoke-virtual {v4, p1}, Lk7/a;->G(Lq7/b;)V

    .line 55
    .line 56
    .line 57
    move v3, v1

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    const/16 v4, 0xc

    .line 60
    .line 61
    if-ne v0, v4, :cond_2

    .line 62
    .line 63
    invoke-virtual {v2}, Lo7/b;->P()Lk7/a;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Ll7/f;

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    new-instance v0, Ll7/j;

    .line 74
    .line 75
    const/4 v4, 0x1

    .line 76
    invoke-direct {v0, v4}, Ll7/j;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 83
    .line 84
    .line 85
    :cond_3
    :goto_1
    invoke-static {p1}, Lp7/b;->T(Lq7/b;)Lp7/b;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    goto :goto_0

    .line 90
    :cond_4
    invoke-virtual {p1}, Lq7/b;->close()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v4}, Ll7/l;->Y(Lu7/b;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Ll7/l;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_5

    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Ll7/f;

    .line 111
    .line 112
    iget-object v1, v0, Ll7/f;->p:Lu7/b;

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ll7/f;->Z(Lu7/b;)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_5
    return-void

    .line 119
    :cond_6
    const-string p1, "Not resource table: "

    .line 120
    .line 121
    invoke-static {v0, p1}, Lj8/o;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public final M()V
    .locals 2

    .line 1
    new-instance v0, Lce/n;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lce/n;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ll7/l;->p:Lj7/b;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lo7/b;->removeIf(Ljava/util/function/Predicate;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final S()V
    .locals 2

    .line 1
    iget-object v0, p0, Ll7/l;->p:Lj7/b;

    .line 2
    .line 3
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Ll7/a;->m:Lp7/a;

    .line 10
    .line 11
    check-cast v1, Lp7/j;

    .line 12
    .line 13
    iget-object v1, v1, Lp7/j;->r:Lr7/f;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lr7/f;->k(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final U(Ll7/l;)Z
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_3

    .line 5
    .line 6
    :cond_0
    iget-object v1, p1, Ll7/l;->p:Lj7/b;

    .line 7
    .line 8
    if-ne p1, p0, :cond_1

    .line 9
    .line 10
    goto/16 :goto_4

    .line 11
    .line 12
    :cond_1
    iget-object v2, p0, Ll7/l;->p:Lj7/b;

    .line 13
    .line 14
    iget-object v3, v2, Lo7/b;->k:Lz7/c;

    .line 15
    .line 16
    invoke-virtual {v3}, Lz7/c;->size()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    iget-object v4, v1, Lo7/b;->k:Lz7/c;

    .line 21
    .line 22
    invoke-virtual {v4}, Lz7/c;->size()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eq v3, v4, :cond_2

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    move v4, v0

    .line 30
    :goto_0
    if-ge v4, v3, :cond_8

    .line 31
    .line 32
    invoke-virtual {v2, v4}, Lo7/b;->Q(I)Lk7/a;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, Ll7/f;

    .line 37
    .line 38
    invoke-virtual {v1, v4}, Lo7/b;->Q(I)Lk7/a;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    check-cast v6, Ll7/f;

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    if-ne v6, v5, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    if-eqz v6, :cond_5

    .line 51
    .line 52
    invoke-virtual {v5}, Ll7/f;->U()I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    invoke-virtual {v6}, Ll7/f;->U()I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-ne v7, v8, :cond_5

    .line 61
    .line 62
    invoke-virtual {v5}, Ll7/f;->V()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v6}, Ll7/f;->V()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-nez v7, :cond_4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    iget-object v7, v5, Ll7/f;->o:Lu7/d;

    .line 78
    .line 79
    invoke-virtual {v7}, Lu7/c;->size()I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    iget-object v8, v6, Ll7/f;->o:Lu7/d;

    .line 84
    .line 85
    invoke-virtual {v8}, Lu7/c;->size()I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-ne v7, v8, :cond_5

    .line 90
    .line 91
    iget-object v5, v5, Ll7/f;->p:Lu7/b;

    .line 92
    .line 93
    invoke-virtual {v5}, Lu7/c;->size()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    iget-object v6, v6, Ll7/f;->p:Lu7/b;

    .line 98
    .line 99
    invoke-virtual {v6}, Lu7/c;->size()I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-ne v5, v6, :cond_5

    .line 104
    .line 105
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    :goto_2
    iget-object v1, p0, Ll7/l;->q:Lz7/c;

    .line 109
    .line 110
    invoke-virtual {v1}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_7

    .line 119
    .line 120
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    check-cast v2, Ll7/l;

    .line 125
    .line 126
    invoke-virtual {v2, p1}, Ll7/l;->U(Ll7/l;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_6

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_7
    :goto_3
    return v0

    .line 134
    :cond_8
    :goto_4
    const/4 p1, 0x1

    .line 135
    return p1
.end method

.method public final V(Ll7/f;)Lz7/f;
    .locals 4

    .line 1
    new-instance v0, Lz7/f;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ll7/l;->W(Ll7/f;)Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v1, Ll7/d;

    .line 8
    .line 9
    iget-object v2, p0, Ll7/l;->q:Lz7/c;

    .line 10
    .line 11
    iget v3, v2, Lz7/c;->i:I

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    sget-object v2, Lz7/h;->g:Lz7/h;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v2}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :goto_0
    const/4 v3, 0x2

    .line 23
    invoke-direct {v1, v2, v3}, Ll7/d;-><init>(Ljava/util/Iterator;I)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p1, v1}, Lz7/f;-><init>(Ljava/util/Iterator;Ljava/util/Iterator;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public final W(Ll7/f;)Ljava/util/Iterator;
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ll7/l;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_1
    new-instance v1, Lz7/f;

    .line 12
    .line 13
    invoke-static {p1}, Lz7/q;->a(Ljava/lang/Object;)Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lz7/j;

    .line 18
    .line 19
    invoke-direct {v3, v0, p1}, Lz7/j;-><init>(Ljava/util/Iterator;Ll7/f;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v2, v3}, Lz7/f;-><init>(Ljava/util/Iterator;Ljava/util/Iterator;)V

    .line 23
    .line 24
    .line 25
    return-object v1
.end method

.method public final X(Ll7/f;I)Lt7/b;
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Ll7/l;->V(Ll7/f;)Lz7/f;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :cond_1
    invoke-virtual {v0}, Lz7/f;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0}, Lz7/f;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ll7/f;

    .line 19
    .line 20
    invoke-virtual {v1, p2}, Ll7/f;->W(I)Lt7/b;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_2
    invoke-virtual {p0, p2}, Ll7/l;->a0(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_5

    .line 32
    .line 33
    if-ne v0, p2, :cond_3

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    invoke-virtual {p0, p1}, Ll7/l;->V(Ll7/f;)Lz7/f;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :cond_4
    invoke-virtual {p1}, Lz7/f;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_5

    .line 45
    .line 46
    invoke-virtual {p1}, Lz7/f;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, Ll7/f;

    .line 51
    .line 52
    invoke-virtual {p2, v0}, Ll7/f;->W(I)Lt7/b;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    if-eqz p2, :cond_4

    .line 57
    .line 58
    return-object p2

    .line 59
    :cond_5
    :goto_0
    const/4 p1, 0x0

    .line 60
    return-object p1
.end method

.method public final Y(Lu7/b;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ll7/l;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ll7/f;

    .line 16
    .line 17
    iget-object v1, v1, Ll7/f;->q:Lo7/f;

    .line 18
    .line 19
    iget-object v1, v1, Lo7/f;->m:Lj7/d;

    .line 20
    .line 21
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 22
    .line 23
    invoke-virtual {v1}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lo7/j;

    .line 38
    .line 39
    invoke-virtual {v2}, Lo7/j;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Ll7/m;

    .line 54
    .line 55
    iget-object v3, v3, Ll7/m;->o:Ls7/b;

    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    invoke-virtual {v3, v4}, Ls7/b;->n0(Z)Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Lv7/d;

    .line 73
    .line 74
    iget-object v4, v4, Lv7/d;->k:Lv7/g0;

    .line 75
    .line 76
    invoke-virtual {v4, p1}, Lv7/g0;->L(Lu7/b;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    return-void
.end method

.method public final Z()Ll7/f;
    .locals 2

    .line 1
    iget-object v0, p0, Ll7/l;->p:Lj7/b;

    .line 2
    .line 3
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, v1}, Lj7/b;->k0(Lz7/c;I)Ll7/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public final a0(I)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ll7/l;->V(Ll7/f;)Lz7/f;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    :cond_0
    invoke-virtual {v1}, Lz7/f;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v1}, Lz7/f;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Ll7/f;

    .line 17
    .line 18
    invoke-virtual {v2, p1}, Ll7/f;->a0(I)Lv7/f0;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    move-object v0, v2

    .line 25
    :cond_1
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const/4 p1, 0x4

    .line 28
    invoke-virtual {v0, p1}, Lr7/c;->O(I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1

    .line 33
    :cond_2
    const/4 p1, 0x0

    .line 34
    return p1
.end method

.method public final g()Lu7/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ll7/l;->o:Lu7/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Ll7/l;->p:Lj7/b;

    .line 2
    .line 3
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final r()[B
    .locals 2

    .line 1
    new-instance v0, Lx7/b;

    .line 2
    .line 3
    iget-object v1, p0, Ll7/a;->m:Lp7/a;

    .line 4
    .line 5
    check-cast v1, Lp7/j;

    .line 6
    .line 7
    iget-object v1, v1, Lp7/a;->o:Lr7/f;

    .line 8
    .line 9
    iget v1, v1, Lr7/f;->n:I

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lx7/b;-><init>(I)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-virtual {p0, v0}, Lk7/a;->K(Ljava/io/ByteArrayOutputStream;)I

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lx7/b;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    :catch_0
    invoke-virtual {v0}, Lx7/b;->toByteArray()[B

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ": packages = "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Ll7/l;->p:Lj7/b;

    .line 23
    .line 24
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 25
    .line 26
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", size = "

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Ll7/a;->m:Lp7/a;

    .line 39
    .line 40
    check-cast v1, Lp7/j;

    .line 41
    .line 42
    iget-object v1, v1, Lp7/a;->o:Lr7/f;

    .line 43
    .line 44
    iget v1, v1, Lr7/f;->n:I

    .line 45
    .line 46
    const-string v2, " bytes"

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Lj8/b;->j(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0
.end method
