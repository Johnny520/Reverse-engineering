.class public abstract Ld7/l;
.super Lo7/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk7/d;
.implements Ljava/lang/Iterable;


# instance fields
.field public final m:Lr7/b;

.field public final n:Lo7/b;

.field public final o:Lo7/g;


# direct methods
.method public constructor <init>(Z)V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Lo7/e;-><init>(I)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Lr7/h;

    .line 9
    .line 10
    invoke-direct {p1, v0}, Lr7/h;-><init>(Z)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Lr7/f;

    .line 15
    .line 16
    invoke-direct {p1, v0}, Lr7/f;-><init>(Z)V

    .line 17
    .line 18
    .line 19
    :goto_0
    iput-object p1, p0, Ld7/l;->m:Lr7/b;

    .line 20
    .line 21
    new-instance v1, Lo7/b;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, v2}, Lo7/b;-><init>(Lk7/f;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Ld7/l;->n:Lo7/b;

    .line 28
    .line 29
    new-instance v2, Lo7/g;

    .line 30
    .line 31
    invoke-direct {v2}, Lk7/a;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v2, p0, Ld7/l;->o:Lo7/g;

    .line 35
    .line 36
    invoke-virtual {p0, v0, p1}, Lo7/e;->P(ILk7/a;)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    invoke-virtual {p0, p1, v1}, Lo7/e;->P(ILk7/a;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x2

    .line 44
    invoke-virtual {p0, p1, v2}, Lo7/e;->P(ILk7/a;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lq7/b;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Ld7/l;->m:Lr7/b;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 11
    .line 12
    .line 13
    instance-of v1, v0, Lr7/h;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast v0, Lr7/h;

    .line 18
    .line 19
    iget-wide v0, v0, Lr7/h;->n:J

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    check-cast v0, Lr7/f;

    .line 23
    .line 24
    iget v0, v0, Lr7/f;->n:I

    .line 25
    .line 26
    int-to-long v0, v0

    .line 27
    :goto_0
    long-to-int v0, v0

    .line 28
    if-gtz v0, :cond_2

    .line 29
    .line 30
    :goto_1
    return-void

    .line 31
    :cond_2
    invoke-virtual {p1, v0}, Lq7/b;->a(I)Lq7/b;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v2, p0, Ld7/l;->o:Lo7/g;

    .line 36
    .line 37
    invoke-virtual {v2}, Lo7/g;->p()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    add-int/lit8 v3, v3, 0x4

    .line 42
    .line 43
    :cond_3
    invoke-virtual {v1}, Lq7/b;->available()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-le v4, v3, :cond_4

    .line 48
    .line 49
    iget v4, v1, Lq7/b;->k:I

    .line 50
    .line 51
    invoke-interface {p0}, Lk7/d;->n()Lk7/a;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    iget-object v6, p0, Ld7/l;->n:Lo7/b;

    .line 56
    .line 57
    invoke-virtual {v6, v5}, Lo7/b;->M(Lk7/a;)Z

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v1}, Lk7/a;->G(Lq7/b;)V

    .line 61
    .line 62
    .line 63
    iget v5, v1, Lq7/b;->k:I

    .line 64
    .line 65
    if-ne v4, v5, :cond_3

    .line 66
    .line 67
    :cond_4
    invoke-virtual {v2, v1}, Lk7/a;->G(Lq7/b;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lq7/b;->c(I)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public N()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lk7/c;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ld7/l;->m:Lr7/b;

    .line 6
    .line 7
    invoke-virtual {v1}, Lr7/b;->p()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    sub-int/2addr v0, v2

    .line 12
    int-to-long v2, v0

    .line 13
    instance-of v0, v1, Lr7/h;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    check-cast v1, Lr7/h;

    .line 18
    .line 19
    invoke-virtual {v1, v2, v3}, Lr7/h;->N(J)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    check-cast v1, Lr7/f;

    .line 24
    .line 25
    long-to-int v0, v2

    .line 26
    invoke-virtual {v1, v0}, Lr7/f;->k(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Ld7/l;->n:Lo7/b;

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
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "size="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ld7/l;->m:Lr7/b;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", count="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Ld7/l;->n:Lo7/b;

    .line 19
    .line 20
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 21
    .line 22
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method
