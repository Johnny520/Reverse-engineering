.class public final Lo7/j;
.super Lk7/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/lang/Comparable;


# instance fields
.field public final k:[Lk7/a;

.field public final l:Ll7/j;

.field public final m:Lj7/e;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    new-instance v0, Ll7/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ll7/j;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Lj7/e;

    .line 8
    .line 9
    invoke-direct {v2}, Lk7/b;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lk7/a;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lo7/j;->l:Ll7/j;

    .line 16
    .line 17
    iput-object v2, p0, Lo7/j;->m:Lj7/e;

    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    new-array v3, v3, [Lk7/a;

    .line 21
    .line 22
    aput-object v0, v3, v1

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    aput-object v2, v3, v4

    .line 26
    .line 27
    iput-object v3, p0, Lo7/j;->k:[Lk7/a;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lk7/a;->H(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v4}, Lk7/a;->H(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p0}, Lk7/a;->J(Lk7/a;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, p0}, Lk7/a;->J(Lk7/a;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lp7/b;->T(Lq7/b;)Lp7/b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {v0}, Lp7/a;->Q()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/16 v2, 0xd

    .line 16
    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lo7/j;->m:Lj7/e;

    .line 20
    .line 21
    invoke-virtual {v0}, Lo7/b;->P()Lk7/a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ll7/m;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    const/16 v2, 0xe

    .line 32
    .line 33
    if-ne v1, v2, :cond_2

    .line 34
    .line 35
    iget-object v0, p0, Lo7/j;->l:Ll7/j;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    invoke-virtual {v0}, Lp7/a;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v0, ", Should be: "

    .line 46
    .line 47
    invoke-static {v2}, Lj8/b;->u(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v2, "Unexpected block: "

    .line 52
    .line 53
    invoke-static {v2, p1, v0, v1}, Lokio/a;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final L()[Lk7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/j;->k:[Lk7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final N()V
    .locals 0

    .line 1
    return-void
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lo7/j;

    .line 2
    .line 3
    iget-object v0, p0, Lo7/j;->l:Ll7/j;

    .line 4
    .line 5
    iget-object v0, v0, Ll7/a;->m:Lp7/a;

    .line 6
    .line 7
    check-cast v0, Lp7/g;

    .line 8
    .line 9
    iget-object v0, v0, Lp7/g;->r:Lr7/c;

    .line 10
    .line 11
    invoke-virtual {v0}, Lr7/c;->get()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object p1, p1, Lo7/j;->l:Ll7/j;

    .line 16
    .line 17
    iget-object p1, p1, Ll7/a;->m:Lp7/a;

    .line 18
    .line 19
    check-cast p1, Lp7/g;

    .line 20
    .line 21
    iget-object p1, p1, Lp7/g;->r:Lr7/c;

    .line 22
    .line 23
    invoke-virtual {p1}, Lr7/c;->get()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method public final isEmpty()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lo7/j;->m:Lj7/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Lk7/b;->j0(Z)Ljava/util/Iterator;

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
    move-result v2

    .line 15
    const/4 v3, 0x1

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
    check-cast v2, Ll7/m;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    iget-object v2, v2, Ll7/m;->o:Ls7/b;

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ls7/b;->n0(Z)Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    return v1

    .line 39
    :cond_1
    return v3
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/j;->m:Lj7/e;

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

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lo7/j;->l:Ll7/j;

    .line 7
    .line 8
    invoke-virtual {v1}, Ll7/j;->V()B

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-static {v2}, Ly7/a;->n(B)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, " ("

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-class v2, Ll7/f;

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ll7/f;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    iget-object v2, v2, Ll7/f;->o:Lu7/d;

    .line 35
    .line 36
    iget-object v1, v1, Ll7/a;->m:Lp7/a;

    .line 37
    .line 38
    check-cast v1, Lp7/g;

    .line 39
    .line 40
    iget-object v1, v1, Lp7/g;->r:Lr7/c;

    .line 41
    .line 42
    invoke-virtual {v1}, Lr7/c;->get()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-virtual {v2, v1}, Lu7/d;->c0(I)Lr7/y;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 v1, 0x0

    .line 52
    :goto_0
    if-eqz v1, :cond_1

    .line 53
    .line 54
    iget-object v1, v1, Lr7/r;->m:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const-string v1, "null"

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    :goto_1
    const-string v1, ") config count="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lo7/j;->m:Lj7/e;

    .line 71
    .line 72
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 73
    .line 74
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0
.end method
