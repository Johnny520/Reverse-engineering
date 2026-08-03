.class public abstract Lr4/l0;
.super Lr4/a0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final g:I

.field public h:I

.field public i:Lr4/k0;

.field public j:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-lez p1, :cond_1

    .line 5
    .line 6
    add-int/lit8 v0, p1, -0x1

    .line 7
    .line 8
    and-int/2addr v0, p1

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    if-lt p2, v0, :cond_0

    .line 13
    .line 14
    iput p1, p0, Lr4/l0;->g:I

    .line 15
    .line 16
    iput p2, p0, Lr4/l0;->h:I

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-object p1, p0, Lr4/l0;->i:Lr4/k0;

    .line 20
    .line 21
    iput v0, p0, Lr4/l0;->j:I

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p1, "writeSize < -1"

    .line 25
    .line 26
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    throw p1

    .line 31
    :cond_1
    const-string p1, "invalid alignment"

    .line 32
    .line 33
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    throw p1
.end method


# virtual methods
.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Lr4/l0;->h:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    const-string v0, "writeSize is unknown"

    .line 7
    .line 8
    invoke-static {v0}, Lj8/o;->w(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, Lr4/l0;

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    invoke-virtual {p0}, Lr4/a0;->b()Lr4/b0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Lr4/a0;->b()Lr4/b0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_1
    invoke-virtual {p0, p1}, Lr4/l0;->e(Lr4/l0;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
.end method

.method public final d(Lr4/p;Lz4/d;)V
    .locals 3

    .line 1
    iget v0, p0, Lr4/l0;->g:I

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lz4/d;->a(I)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget v0, p0, Lr4/l0;->h:I

    .line 7
    .line 8
    if-ltz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lr4/l0;->f()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v1, p2, Lz4/d;->c:I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    if-ne v1, v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Lr4/l0;->m(Lr4/p;Lz4/d;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    :try_start_1
    new-instance p1, Lf4/a;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, "expected cursor "

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, "; actual value: "

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget p2, p2, Lz4/d;->c:I

    .line 40
    .line 41
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-direct {p1, p2, v0}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :catch_0
    move-exception p1

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 56
    .line 57
    const-string p2, "writeSize is unknown"

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 63
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v0, "...while writing "

    .line 66
    .line 67
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-static {p2, p1}, Lf4/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lf4/a;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    throw p1
.end method

.method public e(Lr4/l0;)I
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "unsupported"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    check-cast p1, Lr4/l0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lr4/a0;->b()Lr4/b0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p1}, Lr4/a0;->b()Lr4/b0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    .line 18
    return v3

    .line 19
    :cond_1
    invoke-virtual {p0, p1}, Lr4/l0;->e(Lr4/l0;)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_2

    .line 24
    .line 25
    return v0

    .line 26
    :cond_2
    return v3
.end method

.method public final f()I
    .locals 2

    .line 1
    iget v0, p0, Lr4/l0;->j:I

    .line 2
    .line 3
    if-ltz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Lr4/l0;->i:Lr4/k0;

    .line 6
    .line 7
    if-ltz v0, :cond_1

    .line 8
    .line 9
    iget v1, v1, Lr4/o0;->d:I

    .line 10
    .line 11
    if-ltz v1, :cond_0

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    return v1

    .line 15
    :cond_0
    const-string v0, "fileOffset not yet set"

    .line 16
    .line 17
    invoke-static {v0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    const/4 v0, 0x0

    .line 21
    return v0

    .line 22
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const-string v0, "relative < 0"

    .line 26
    .line 27
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const-string v0, "offset not yet known"

    .line 32
    .line 33
    invoke-static {v0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0
.end method

.method public final g()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lr4/l0;->f()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/16 v1, 0x5d

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method

.method public final i(Lr4/k0;I)I
    .locals 1

    .line 1
    if-ltz p2, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lr4/l0;->i:Lr4/k0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lr4/l0;->g:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    add-int/2addr p2, v0

    .line 12
    not-int v0, v0

    .line 13
    and-int/2addr p2, v0

    .line 14
    iput-object p1, p0, Lr4/l0;->i:Lr4/k0;

    .line 15
    .line 16
    iput p2, p0, Lr4/l0;->j:I

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Lr4/l0;->j(Lr4/k0;I)V

    .line 19
    .line 20
    .line 21
    return p2

    .line 22
    :cond_0
    const-string p1, "already written"

    .line 23
    .line 24
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    const/4 p1, 0x0

    .line 28
    return p1

    .line 29
    :cond_1
    const-string p1, "offset < 0"

    .line 30
    .line 31
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0
.end method

.method public j(Lr4/k0;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final k(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lr4/l0;->h:I

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lr4/l0;->h:I

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p1, "writeSize already set"

    .line 11
    .line 12
    invoke-static {p1}, Lj8/o;->w(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    const-string p1, "writeSize < 0"

    .line 17
    .line 18
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public abstract l()Ljava/lang/String;
.end method

.method public abstract m(Lr4/p;Lz4/d;)V
.end method
