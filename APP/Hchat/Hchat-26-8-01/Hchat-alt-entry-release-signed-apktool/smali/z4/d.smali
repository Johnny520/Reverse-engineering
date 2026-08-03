.class public final Lz4/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Z

.field public b:[B

.field public c:I

.field public d:Z

.field public e:Ljava/util/ArrayList;

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x3e8

    .line 21
    new-array v0, v0, [B

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lz4/d;-><init>([BZ)V

    return-void
.end method

.method public constructor <init>([BZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Lz4/d;->a:Z

    .line 5
    .line 6
    iput-object p1, p0, Lz4/d;->b:[B

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lz4/d;->c:I

    .line 10
    .line 11
    iput-boolean p1, p0, Lz4/d;->d:Z

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    iput-object p2, p0, Lz4/d;->e:Ljava/util/ArrayList;

    .line 15
    .line 16
    iput p1, p0, Lz4/d;->f:I

    .line 17
    .line 18
    iput p1, p0, Lz4/d;->g:I

    .line 19
    .line 20
    return-void
.end method

.method public static g()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 2
    .line 3
    const-string v1, "attempt to write past the end"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .line 1
    add-int/lit8 v0, p1, -0x1

    .line 2
    .line 3
    if-ltz p1, :cond_2

    .line 4
    .line 5
    and-int/2addr p1, v0

    .line 6
    if-nez p1, :cond_2

    .line 7
    .line 8
    iget p1, p0, Lz4/d;->c:I

    .line 9
    .line 10
    add-int/2addr p1, v0

    .line 11
    not-int v0, v0

    .line 12
    and-int/2addr p1, v0

    .line 13
    iget-boolean v0, p0, Lz4/d;->a:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lz4/d;->f(I)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Lz4/d;->b:[B

    .line 22
    .line 23
    array-length v0, v0

    .line 24
    if-gt p1, v0, :cond_1

    .line 25
    .line 26
    :goto_0
    iget-object v0, p0, Lz4/d;->b:[B

    .line 27
    .line 28
    iget v1, p0, Lz4/d;->c:I

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-static {v0, v1, p1, v2}, Ljava/util/Arrays;->fill([BIIB)V

    .line 32
    .line 33
    .line 34
    iput p1, p0, Lz4/d;->c:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-static {}, Lz4/d;->g()V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    throw p1

    .line 42
    :cond_2
    const-string p1, "bogus alignment"

    .line 43
    .line 44
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final b(ILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lz4/d;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lz4/d;->e()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lz4/d;->e:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget-object v1, p0, Lz4/d;->e:Ljava/util/ArrayList;

    .line 20
    .line 21
    add-int/lit8 v0, v0, -0x1

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lz4/c;

    .line 28
    .line 29
    iget v0, v0, Lz4/c;->b:I

    .line 30
    .line 31
    :goto_0
    iget v1, p0, Lz4/d;->c:I

    .line 32
    .line 33
    if-gt v0, v1, :cond_2

    .line 34
    .line 35
    move v0, v1

    .line 36
    :cond_2
    iget-object v1, p0, Lz4/d;->e:Ljava/util/ArrayList;

    .line 37
    .line 38
    new-instance v2, Lz4/c;

    .line 39
    .line 40
    add-int/2addr p1, v0

    .line 41
    invoke-direct {v2, v0, p1, p2}, Lz4/c;-><init>(IILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lz4/d;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lz4/d;->e()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lz4/d;->e:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v1, Lz4/c;

    .line 12
    .line 13
    iget v2, p0, Lz4/d;->c:I

    .line 14
    .line 15
    const v3, 0x7fffffff

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3, p1}, Lz4/c;-><init>(IILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lz4/d;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lz4/d;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lz4/d;->e:Ljava/util/ArrayList;

    .line 13
    .line 14
    add-int/lit8 v0, v0, -0x1

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lz4/c;

    .line 21
    .line 22
    iget v1, p0, Lz4/d;->c:I

    .line 23
    .line 24
    iget v2, v0, Lz4/c;->b:I

    .line 25
    .line 26
    const v3, 0x7fffffff

    .line 27
    .line 28
    .line 29
    if-ne v2, v3, :cond_1

    .line 30
    .line 31
    iput v1, v0, Lz4/c;->b:I

    .line 32
    .line 33
    :cond_1
    :goto_0
    return-void
.end method

.method public final f(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lz4/d;->b:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-ge v1, p1, :cond_0

    .line 5
    .line 6
    mul-int/lit8 p1, p1, 0x2

    .line 7
    .line 8
    add-int/lit16 p1, p1, 0x3e8

    .line 9
    .line 10
    new-array p1, p1, [B

    .line 11
    .line 12
    iget v1, p0, Lz4/d;->c:I

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lz4/d;->b:[B

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final h()[B
    .locals 4

    .line 1
    iget v0, p0, Lz4/d;->c:I

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    iget-object v2, p0, Lz4/d;->b:[B

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 9
    .line 10
    .line 11
    return-object v1
.end method

.method public final i([B)V
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    iget v1, p0, Lz4/d;->c:I

    .line 3
    .line 4
    add-int v2, v1, v0

    .line 5
    .line 6
    or-int v3, v0, v2

    .line 7
    .line 8
    if-ltz v3, :cond_2

    .line 9
    .line 10
    array-length v3, p1

    .line 11
    if-gt v0, v3, :cond_2

    .line 12
    .line 13
    iget-boolean v3, p0, Lz4/d;->a:Z

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v2}, Lz4/d;->f(I)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v3, p0, Lz4/d;->b:[B

    .line 22
    .line 23
    array-length v3, v3

    .line 24
    if-gt v2, v3, :cond_1

    .line 25
    .line 26
    :goto_0
    iget-object v3, p0, Lz4/d;->b:[B

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-static {p1, v4, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    .line 31
    .line 32
    iput v2, p0, Lz4/d;->c:I

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    invoke-static {}, Lz4/d;->g()V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    throw p1

    .line 40
    :cond_2
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 41
    .line 42
    array-length p1, p1

    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v3, "bytes.length "

    .line 46
    .line 47
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p1, "; 0..!"

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0
.end method

.method public final j(I)V
    .locals 3

    .line 1
    iget v0, p0, Lz4/d;->c:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iget-boolean v2, p0, Lz4/d;->a:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lz4/d;->f(I)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v2, p0, Lz4/d;->b:[B

    .line 14
    .line 15
    array-length v2, v2

    .line 16
    if-gt v1, v2, :cond_1

    .line 17
    .line 18
    :goto_0
    iget-object v2, p0, Lz4/d;->b:[B

    .line 19
    .line 20
    int-to-byte p1, p1

    .line 21
    aput-byte p1, v2, v0

    .line 22
    .line 23
    iput v1, p0, Lz4/d;->c:I

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-static {}, Lz4/d;->g()V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    throw p1
.end method

.method public final k(I)V
    .locals 5

    .line 1
    iget v0, p0, Lz4/d;->c:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x4

    .line 4
    .line 5
    iget-boolean v2, p0, Lz4/d;->a:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lz4/d;->f(I)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v2, p0, Lz4/d;->b:[B

    .line 14
    .line 15
    array-length v2, v2

    .line 16
    if-gt v1, v2, :cond_1

    .line 17
    .line 18
    :goto_0
    iget-object v2, p0, Lz4/d;->b:[B

    .line 19
    .line 20
    int-to-byte v3, p1

    .line 21
    aput-byte v3, v2, v0

    .line 22
    .line 23
    add-int/lit8 v3, v0, 0x1

    .line 24
    .line 25
    shr-int/lit8 v4, p1, 0x8

    .line 26
    .line 27
    int-to-byte v4, v4

    .line 28
    aput-byte v4, v2, v3

    .line 29
    .line 30
    add-int/lit8 v3, v0, 0x2

    .line 31
    .line 32
    shr-int/lit8 v4, p1, 0x10

    .line 33
    .line 34
    int-to-byte v4, v4

    .line 35
    aput-byte v4, v2, v3

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x3

    .line 38
    .line 39
    shr-int/lit8 p1, p1, 0x18

    .line 40
    .line 41
    int-to-byte p1, p1

    .line 42
    aput-byte p1, v2, v0

    .line 43
    .line 44
    iput v1, p0, Lz4/d;->c:I

    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    invoke-static {}, Lz4/d;->g()V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    throw p1
.end method

.method public final l(I)V
    .locals 4

    .line 1
    iget v0, p0, Lz4/d;->c:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    iget-boolean v2, p0, Lz4/d;->a:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lz4/d;->f(I)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v2, p0, Lz4/d;->b:[B

    .line 14
    .line 15
    array-length v2, v2

    .line 16
    if-gt v1, v2, :cond_1

    .line 17
    .line 18
    :goto_0
    iget-object v2, p0, Lz4/d;->b:[B

    .line 19
    .line 20
    int-to-byte v3, p1

    .line 21
    aput-byte v3, v2, v0

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    shr-int/lit8 p1, p1, 0x8

    .line 26
    .line 27
    int-to-byte p1, p1

    .line 28
    aput-byte p1, v2, v0

    .line 29
    .line 30
    iput v1, p0, Lz4/d;->c:I

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    invoke-static {}, Lz4/d;->g()V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    throw p1
.end method

.method public final m(I)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lz4/d;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lz4/d;->c:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x5

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lz4/d;->f(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    shr-int/lit8 v0, p1, 0x7

    .line 13
    .line 14
    const/high16 v1, -0x80000000

    .line 15
    .line 16
    and-int/2addr v1, p1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    move v1, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v1, -0x1

    .line 23
    :goto_0
    const/4 v3, 0x1

    .line 24
    move v4, v0

    .line 25
    move v0, p1

    .line 26
    move p1, v4

    .line 27
    move v4, v3

    .line 28
    :goto_1
    if-eqz v4, :cond_5

    .line 29
    .line 30
    if-ne p1, v1, :cond_3

    .line 31
    .line 32
    and-int/lit8 v4, p1, 0x1

    .line 33
    .line 34
    shr-int/lit8 v5, v0, 0x6

    .line 35
    .line 36
    and-int/2addr v5, v3

    .line 37
    if-eq v4, v5, :cond_2

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move v4, v2

    .line 41
    goto :goto_3

    .line 42
    :cond_3
    :goto_2
    move v4, v3

    .line 43
    :goto_3
    and-int/lit8 v0, v0, 0x7f

    .line 44
    .line 45
    if-eqz v4, :cond_4

    .line 46
    .line 47
    const/16 v5, 0x80

    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_4
    move v5, v2

    .line 51
    :goto_4
    or-int/2addr v0, v5

    .line 52
    int-to-byte v0, v0

    .line 53
    invoke-virtual {p0, v0}, Lz4/d;->j(I)V

    .line 54
    .line 55
    .line 56
    shr-int/lit8 v0, p1, 0x7

    .line 57
    .line 58
    move v6, v0

    .line 59
    move v0, p1

    .line 60
    move p1, v6

    .line 61
    goto :goto_1

    .line 62
    :cond_5
    return-void
.end method

.method public final n(I)I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lz4/d;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lz4/d;->c:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x5

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lz4/d;->f(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lz4/d;->c:I

    .line 13
    .line 14
    :goto_0
    ushr-int/lit8 v1, p1, 0x7

    .line 15
    .line 16
    move v2, v1

    .line 17
    move v1, p1

    .line 18
    move p1, v2

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    and-int/lit8 v1, v1, 0x7f

    .line 22
    .line 23
    or-int/lit16 v1, v1, 0x80

    .line 24
    .line 25
    int-to-byte v1, v1

    .line 26
    invoke-virtual {p0, v1}, Lz4/d;->j(I)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    and-int/lit8 p1, v1, 0x7f

    .line 31
    .line 32
    int-to-byte p1, p1

    .line 33
    invoke-virtual {p0, p1}, Lz4/d;->j(I)V

    .line 34
    .line 35
    .line 36
    iget p1, p0, Lz4/d;->c:I

    .line 37
    .line 38
    sub-int/2addr p1, v0

    .line 39
    return p1
.end method

.method public final o(I)V
    .locals 3

    .line 1
    if-ltz p1, :cond_2

    .line 2
    .line 3
    iget v0, p0, Lz4/d;->c:I

    .line 4
    .line 5
    add-int/2addr v0, p1

    .line 6
    iget-boolean p1, p0, Lz4/d;->a:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lz4/d;->f(I)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p1, p0, Lz4/d;->b:[B

    .line 15
    .line 16
    array-length p1, p1

    .line 17
    if-gt v0, p1, :cond_1

    .line 18
    .line 19
    :goto_0
    iget-object p1, p0, Lz4/d;->b:[B

    .line 20
    .line 21
    iget v1, p0, Lz4/d;->c:I

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-static {p1, v1, v0, v2}, Ljava/util/Arrays;->fill([BIIB)V

    .line 25
    .line 26
    .line 27
    iput v0, p0, Lz4/d;->c:I

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-static {}, Lz4/d;->g()V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    throw p1

    .line 35
    :cond_2
    const-string p1, "count < 0"

    .line 36
    .line 37
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
