.class public Ll7/f;
.super Ll7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ll7/g;
.implements Ljava/lang/Comparable;


# instance fields
.field public final o:Lu7/d;

.field public final p:Lu7/b;

.field public final q:Lo7/f;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    new-instance v0, Lp7/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lp7/f;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {p0, v0, v1}, Ll7/a;-><init>(Lp7/a;I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lu7/d;

    .line 11
    .line 12
    iget-object v0, v0, Lp7/f;->y:Lr7/f;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lu7/d;-><init>(Lr7/f;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Ll7/f;->o:Lu7/d;

    .line 18
    .line 19
    new-instance v0, Lu7/b;

    .line 20
    .line 21
    new-instance v2, Lokio/a;

    .line 22
    .line 23
    const/16 v3, 0x11

    .line 24
    .line 25
    invoke-direct {v2, v3}, Lokio/a;-><init>(I)V

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x1

    .line 30
    invoke-direct {v0, v4, v4, v2, v3}, Lu7/b;-><init>(ZZLokio/a;I)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Ll7/f;->p:Lu7/b;

    .line 34
    .line 35
    new-instance v2, Lo7/f;

    .line 36
    .line 37
    invoke-direct {v2}, Lo7/f;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v2, p0, Ll7/f;->q:Lo7/f;

    .line 41
    .line 42
    invoke-virtual {p0, v1}, Lo7/d;->P(Lk7/a;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v2}, Lo7/d;->P(Lk7/a;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 6

    .line 1
    iget-object v0, p0, Ll7/f;->q:Lo7/f;

    .line 2
    .line 3
    iget-object v0, v0, Lo7/f;->m:Lj7/d;

    .line 4
    .line 5
    iget-object v1, v0, Lo7/b;->k:Lz7/c;

    .line 6
    .line 7
    invoke-virtual {v1}, Lz7/c;->b()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lo7/j;

    .line 22
    .line 23
    iget-object v3, v2, Lo7/j;->m:Lj7/e;

    .line 24
    .line 25
    new-instance v4, Lce/n;

    .line 26
    .line 27
    const/16 v5, 0x8

    .line 28
    .line 29
    invoke-direct {v4, v5}, Lce/n;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v4}, Lo7/b;->removeIf(Ljava/util/function/Predicate;)Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Lo7/j;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Lo7/b;->a0(Lk7/a;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-void
.end method

.method public final R()V
    .locals 0

    .line 1
    return-void
.end method

.method public final S()V
    .locals 4

    .line 1
    new-instance v0, Lf6/b;

    .line 2
    .line 3
    iget-object v1, p0, Ll7/f;->o:Lu7/d;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lf6/b;-><init>(Lk7/a;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lk7/c;->z(Lf6/b;)V

    .line 9
    .line 10
    .line 11
    iget v0, v0, Lf6/b;->c:I

    .line 12
    .line 13
    iget-object v2, p0, Ll7/a;->m:Lp7/a;

    .line 14
    .line 15
    check-cast v2, Lp7/f;

    .line 16
    .line 17
    iget-object v3, v2, Lp7/f;->t:Lr7/f;

    .line 18
    .line 19
    invoke-virtual {v3, v0}, Lr7/f;->k(I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, v2, Lp7/f;->u:Lr7/f;

    .line 23
    .line 24
    invoke-virtual {v1}, Lu7/c;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Lr7/f;->k(I)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lf6/b;

    .line 32
    .line 33
    iget-object v1, p0, Ll7/f;->p:Lu7/b;

    .line 34
    .line 35
    invoke-direct {v0, v1}, Lf6/b;-><init>(Lk7/a;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lk7/c;->z(Lf6/b;)V

    .line 39
    .line 40
    .line 41
    iget v0, v0, Lf6/b;->c:I

    .line 42
    .line 43
    iget-object v3, v2, Lp7/f;->v:Lr7/f;

    .line 44
    .line 45
    invoke-virtual {v3, v0}, Lr7/f;->k(I)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v2, Lp7/f;->w:Lr7/f;

    .line 49
    .line 50
    invoke-virtual {v1}, Lu7/c;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {v0, v1}, Lr7/f;->k(I)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public U()I
    .locals 1

    .line 1
    iget-object v0, p0, Ll7/a;->m:Lp7/a;

    .line 2
    .line 3
    check-cast v0, Lp7/f;

    .line 4
    .line 5
    iget-object v0, v0, Lp7/f;->r:Lr7/f;

    .line 6
    .line 7
    iget v0, v0, Lr7/f;->n:I

    .line 8
    .line 9
    return v0
.end method

.method public V()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ll7/a;->m:Lp7/a;

    .line 2
    .line 3
    check-cast v0, Lp7/f;

    .line 4
    .line 5
    iget-object v0, v0, Lp7/f;->s:Lr7/d;

    .line 6
    .line 7
    iget-object v0, v0, Lr7/r;->m:Ljava/lang/String;

    .line 8
    .line 9
    return-object v0
.end method

.method public final W(I)Lt7/b;
    .locals 4

    .line 1
    shr-int/lit8 v0, p1, 0x18

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Ll7/f;->U()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const v3, 0xffff

    .line 14
    .line 15
    .line 16
    if-ne v0, v2, :cond_1

    .line 17
    .line 18
    shr-int/lit8 v0, p1, 0x10

    .line 19
    .line 20
    and-int/lit16 v0, v0, 0xff

    .line 21
    .line 22
    and-int v2, p1, v3

    .line 23
    .line 24
    invoke-virtual {p0, v0, v2}, Ll7/f;->X(II)Lt7/b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    invoke-virtual {p0, p1}, Ll7/f;->a0(I)Lv7/f0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_2
    const/4 v2, 0x4

    .line 39
    invoke-virtual {v0, v2}, Lr7/c;->O(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_5

    .line 44
    .line 45
    if-ne v0, p1, :cond_3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    shr-int/lit8 p1, v0, 0x18

    .line 49
    .line 50
    and-int/lit16 p1, p1, 0xff

    .line 51
    .line 52
    invoke-virtual {p0}, Ll7/f;->U()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eq p1, v2, :cond_4

    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_4
    shr-int/lit8 p1, v0, 0x10

    .line 60
    .line 61
    and-int/lit16 p1, p1, 0xff

    .line 62
    .line 63
    and-int/2addr v0, v3

    .line 64
    invoke-virtual {p0, p1, v0}, Ll7/f;->X(II)Lt7/b;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1

    .line 69
    :cond_5
    :goto_0
    return-object v1
.end method

.method public final X(II)Lt7/b;
    .locals 4

    .line 1
    iget-object v0, p0, Ll7/f;->q:Lo7/f;

    .line 2
    .line 3
    iget-object v0, v0, Lo7/f;->m:Lj7/d;

    .line 4
    .line 5
    int-to-byte p1, p1

    .line 6
    invoke-virtual {v0, p1}, Lj7/d;->k0(B)Lo7/j;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x0

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    int-to-short p2, p2

    .line 15
    iget-object p1, p1, Lo7/j;->m:Lj7/e;

    .line 16
    .line 17
    iget-object p1, p1, Lo7/b;->k:Lz7/c;

    .line 18
    .line 19
    invoke-virtual {p1}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    move-object v1, v0

    .line 24
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_4

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ll7/m;

    .line 35
    .line 36
    iget-object v2, v2, Ll7/m;->o:Ls7/b;

    .line 37
    .line 38
    invoke-virtual {v2, p2}, Ls7/b;->m0(I)Lv7/d;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {v2}, Lv7/d;->y()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_3

    .line 50
    .line 51
    move-object v1, v2

    .line 52
    goto :goto_1

    .line 53
    :cond_3
    if-nez v1, :cond_1

    .line 54
    .line 55
    move-object v1, v2

    .line 56
    goto :goto_0

    .line 57
    :cond_4
    :goto_1
    if-nez v1, :cond_5

    .line 58
    .line 59
    :goto_2
    return-object v0

    .line 60
    :cond_5
    new-instance p1, Lt7/b;

    .line 61
    .line 62
    invoke-virtual {v1}, Lv7/d;->M()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    invoke-direct {p1, p0, p2}, Lt7/b;-><init>(Ll7/f;I)V

    .line 67
    .line 68
    .line 69
    return-object p1
.end method

.method public Y()Ll7/l;
    .locals 2

    .line 1
    iget-object v0, p0, Lk7/a;->h:Lk7/a;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_1

    .line 4
    .line 5
    instance-of v1, v0, Ll7/l;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ll7/l;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, v0, Lk7/a;->h:Lk7/a;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    return-object v0
.end method

.method public final Z(Lu7/b;)V
    .locals 7

    .line 1
    iget-object v0, p0, Ll7/f;->q:Lo7/f;

    .line 2
    .line 3
    iget-object v0, v0, Lo7/f;->m:Lj7/d;

    .line 4
    .line 5
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 6
    .line 7
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_4

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lo7/j;

    .line 22
    .line 23
    invoke-virtual {v1}, Lo7/j;->iterator()Ljava/util/Iterator;

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
    check-cast v2, Ll7/m;

    .line 38
    .line 39
    iget-object v2, v2, Ll7/m;->o:Ls7/b;

    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    invoke-virtual {v2, v3}, Ls7/b;->n0(Z)Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Lv7/d;

    .line 57
    .line 58
    iget-object v3, v3, Lv7/d;->k:Lv7/g0;

    .line 59
    .line 60
    iget-object v3, v3, Lv7/g0;->k:Lv7/i0;

    .line 61
    .line 62
    invoke-virtual {v3}, Lv7/i0;->N()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-virtual {p1, v4}, Lu7/c;->V(I)Lr7/s;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Lr7/q;

    .line 71
    .line 72
    if-nez v4, :cond_2

    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    iput-object v4, v3, Lv7/i0;->m:Lv7/h0;

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    iget-object v5, v3, Lv7/i0;->m:Lv7/h0;

    .line 79
    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    invoke-virtual {v4, v5}, Lr7/s;->a0(Lr7/m;)V

    .line 83
    .line 84
    .line 85
    :cond_3
    new-instance v5, Lv7/h0;

    .line 86
    .line 87
    const/4 v6, 0x0

    .line 88
    invoke-direct {v5, v3, v6}, Lv7/h0;-><init>(Lr7/b;I)V

    .line 89
    .line 90
    .line 91
    iput-object v5, v3, Lv7/i0;->m:Lv7/h0;

    .line 92
    .line 93
    invoke-virtual {v4, v5}, Lr7/s;->P(Lr7/m;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    return-void
.end method

.method public a()Lu7/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ll7/f;->p:Lu7/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final a0(I)Lv7/f0;
    .locals 5

    .line 1
    iget-object v0, p0, Ll7/f;->q:Lo7/f;

    .line 2
    .line 3
    iget-object v0, v0, Lo7/f;->o:Ld7/b;

    .line 4
    .line 5
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_3

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ll7/k;

    .line 23
    .line 24
    iget-object v1, v1, Ll7/k;->o:Lj7/a;

    .line 25
    .line 26
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 27
    .line 28
    invoke-virtual {v1}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lv7/f0;

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    invoke-virtual {v3, v4}, Lr7/c;->O(I)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-ne p1, v4, :cond_1

    .line 50
    .line 51
    move-object v2, v3

    .line 52
    :cond_2
    if-eqz v2, :cond_0

    .line 53
    .line 54
    :cond_3
    return-object v2
.end method

.method public compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Ll7/f;

    .line 2
    .line 3
    invoke-virtual {p0}, Ll7/f;->U()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1}, Ll7/f;->U()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public final i()Ll7/f;
    .locals 0

    .line 1
    return-object p0
.end method

.method public isEmpty()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ll7/f;->U()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Ll7/f;->q:Lo7/f;

    .line 8
    .line 9
    iget-object v1, v0, Lo7/f;->m:Lj7/d;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-virtual {v1, v2}, Lk7/b;->j0(Z)Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lo7/j;

    .line 27
    .line 28
    invoke-virtual {v3}, Lo7/j;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v1, v0, Lo7/f;->n:Ll7/c;

    .line 36
    .line 37
    invoke-virtual {v1}, Ll7/c;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    iget-object v1, v0, Lo7/f;->o:Ld7/b;

    .line 48
    .line 49
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 50
    .line 51
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_2

    .line 56
    .line 57
    iget-object v1, v0, Lo7/f;->p:Ls7/e;

    .line 58
    .line 59
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 60
    .line 61
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_2

    .line 66
    .line 67
    iget-object v0, v0, Lo7/f;->r:Lo7/b;

    .line 68
    .line 69
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 70
    .line 71
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_2

    .line 76
    .line 77
    return v2

    .line 78
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 79
    return v0
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
    invoke-super {p0}, Ll7/a;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", id="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ll7/f;->U()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    int-to-byte v1, v1

    .line 23
    invoke-static {v1}, Ly7/a;->n(B)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", name="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ll7/f;->V()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Ll7/f;->q:Lo7/f;

    .line 43
    .line 44
    iget-object v1, v1, Lo7/f;->n:Ll7/c;

    .line 45
    .line 46
    iget-object v1, v1, Ll7/c;->p:Lo7/b;

    .line 47
    .line 48
    check-cast v1, Lj7/a;

    .line 49
    .line 50
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 51
    .line 52
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-lez v1, :cond_0

    .line 57
    .line 58
    const-string v2, ", libraries="

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0
.end method
