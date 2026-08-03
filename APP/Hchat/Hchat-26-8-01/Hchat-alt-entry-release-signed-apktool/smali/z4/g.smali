.class public final Lz4/g;
.super Lz4/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final k:Lz4/g;


# instance fields
.field public h:[I

.field public i:I

.field public j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lz4/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lz4/g;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lz4/g;->k:Lz4/g;

    .line 8
    .line 9
    iput-boolean v1, v0, Lz4/j;->g:Z

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lz4/j;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    :try_start_0
    new-array p1, p1, [I

    .line 6
    .line 7
    iput-object p1, p0, Lz4/g;->h:[I
    :try_end_0
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput p1, p0, Lz4/g;->i:I

    .line 11
    .line 12
    iput-boolean v0, p0, Lz4/g;->j:Z

    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    const-string p1, "size < 0"

    .line 16
    .line 17
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    throw p1
.end method

.method public static o(I)Lz4/g;
    .locals 2

    .line 1
    new-instance v0, Lz4/g;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lz4/g;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lz4/g;->l(I)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    iput-boolean p0, v0, Lz4/j;->g:Z

    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lz4/g;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lz4/g;

    .line 12
    .line 13
    iget-boolean v1, p0, Lz4/g;->j:Z

    .line 14
    .line 15
    iget-boolean v3, p1, Lz4/g;->j:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lz4/g;->i:I

    .line 21
    .line 22
    iget v3, p1, Lz4/g;->i:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    move v1, v2

    .line 28
    :goto_0
    iget v3, p0, Lz4/g;->i:I

    .line 29
    .line 30
    if-ge v1, v3, :cond_5

    .line 31
    .line 32
    iget-object v3, p0, Lz4/g;->h:[I

    .line 33
    .line 34
    aget v3, v3, v1

    .line 35
    .line 36
    iget-object v4, p1, Lz4/g;->h:[I

    .line 37
    .line 38
    aget v4, v4, v1

    .line 39
    .line 40
    if-eq v3, v4, :cond_4

    .line 41
    .line 42
    return v2

    .line 43
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget v2, p0, Lz4/g;->i:I

    .line 4
    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    mul-int/lit8 v1, v1, 0x1f

    .line 8
    .line 9
    iget-object v2, p0, Lz4/g;->h:[I

    .line 10
    .line 11
    aget v2, v2, v0

    .line 12
    .line 13
    add-int/2addr v1, v2

    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return v1
.end method

.method public final l(I)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lz4/j;->j()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lz4/g;->i:I

    .line 5
    .line 6
    iget-object v1, p0, Lz4/g;->h:[I

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    const/4 v3, 0x0

    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    mul-int/lit8 v2, v0, 0x3

    .line 13
    .line 14
    div-int/lit8 v2, v2, 0x2

    .line 15
    .line 16
    add-int/lit8 v2, v2, 0xa

    .line 17
    .line 18
    new-array v2, v2, [I

    .line 19
    .line 20
    invoke-static {v1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    .line 22
    .line 23
    iput-object v2, p0, Lz4/g;->h:[I

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lz4/g;->h:[I

    .line 26
    .line 27
    iget v1, p0, Lz4/g;->i:I

    .line 28
    .line 29
    add-int/lit8 v2, v1, 0x1

    .line 30
    .line 31
    iput v2, p0, Lz4/g;->i:I

    .line 32
    .line 33
    aput p1, v0, v1

    .line 34
    .line 35
    iget-boolean v4, p0, Lz4/g;->j:Z

    .line 36
    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    if-le v2, v4, :cond_2

    .line 41
    .line 42
    add-int/lit8 v1, v1, -0x1

    .line 43
    .line 44
    aget v0, v0, v1

    .line 45
    .line 46
    if-lt p1, v0, :cond_1

    .line 47
    .line 48
    move v3, v4

    .line 49
    :cond_1
    iput-boolean v3, p0, Lz4/g;->j:Z

    .line 50
    .line 51
    :cond_2
    return-void
.end method

.method public final m(I)I
    .locals 5

    .line 1
    iget v0, p0, Lz4/g;->i:I

    .line 2
    .line 3
    iget-boolean v1, p0, Lz4/g;->j:Z

    .line 4
    .line 5
    if-nez v1, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Lz4/g;->h:[I

    .line 11
    .line 12
    aget v2, v2, v1

    .line 13
    .line 14
    if-ne v2, p1, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    neg-int p1, v0

    .line 21
    return p1

    .line 22
    :cond_2
    const/4 v1, -0x1

    .line 23
    move v2, v0

    .line 24
    :goto_1
    add-int/lit8 v3, v1, 0x1

    .line 25
    .line 26
    if-le v2, v3, :cond_4

    .line 27
    .line 28
    sub-int v3, v2, v1

    .line 29
    .line 30
    shr-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    add-int/2addr v3, v1

    .line 33
    iget-object v4, p0, Lz4/g;->h:[I

    .line 34
    .line 35
    aget v4, v4, v3

    .line 36
    .line 37
    if-gt p1, v4, :cond_3

    .line 38
    .line 39
    move v2, v3

    .line 40
    goto :goto_1

    .line 41
    :cond_3
    move v1, v3

    .line 42
    goto :goto_1

    .line 43
    :cond_4
    if-eq v2, v0, :cond_6

    .line 44
    .line 45
    iget-object v0, p0, Lz4/g;->h:[I

    .line 46
    .line 47
    aget v0, v0, v2

    .line 48
    .line 49
    if-ne p1, v0, :cond_5

    .line 50
    .line 51
    return v2

    .line 52
    :cond_5
    neg-int p1, v2

    .line 53
    :goto_2
    add-int/lit8 p1, p1, -0x1

    .line 54
    .line 55
    return p1

    .line 56
    :cond_6
    neg-int p1, v0

    .line 57
    goto :goto_2
.end method

.method public final n(I)I
    .locals 1

    .line 1
    iget v0, p0, Lz4/g;->i:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Lz4/g;->h:[I

    .line 6
    .line 7
    aget p1, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    return p1

    .line 10
    :catch_0
    const-string p1, "n < 0"

    .line 11
    .line 12
    invoke-static {p1}, Lokio/a;->i(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :goto_0
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_0
    const-string p1, "n >= size()"

    .line 18
    .line 19
    invoke-static {p1}, Lokio/a;->i(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0
.end method

.method public final p()Lz4/g;
    .locals 4

    .line 1
    iget v0, p0, Lz4/g;->i:I

    .line 2
    .line 3
    new-instance v1, Lz4/g;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lz4/g;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v0, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, Lz4/g;->h:[I

    .line 12
    .line 13
    aget v3, v3, v2

    .line 14
    .line 15
    invoke-virtual {v1, v3}, Lz4/g;->l(I)V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-object v1
.end method

.method public final q(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lz4/j;->j()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lz4/g;->i:I

    .line 5
    .line 6
    if-ge p1, v0, :cond_1

    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Lz4/g;->h:[I

    .line 9
    .line 10
    aput p2, v0, p1

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    iput-boolean p2, p0, Lz4/g;->j:Z
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    return-void

    .line 16
    :catch_0
    if-ltz p1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p1, "n < 0"

    .line 20
    .line 21
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    const-string p1, "n >= size()"

    .line 26
    .line 27
    invoke-static {p1}, Lokio/a;->i(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final r(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lz4/g;->i:I

    .line 4
    .line 5
    if-gt p1, v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lz4/j;->j()V

    .line 8
    .line 9
    .line 10
    iput p1, p0, Lz4/g;->i:I

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p1, "newSize > size"

    .line 14
    .line 15
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    const-string p1, "newSize < 0"

    .line 20
    .line 21
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final s()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lz4/j;->j()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lz4/g;->j:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lz4/g;->h:[I

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iget v2, p0, Lz4/g;->i:I

    .line 12
    .line 13
    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->sort([III)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lz4/g;->j:Z

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget v1, p0, Lz4/g;->i:I

    .line 4
    .line 5
    mul-int/lit8 v1, v1, 0x5

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0xa

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x7b

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    iget v2, p0, Lz4/g;->i:I

    .line 19
    .line 20
    if-ge v1, v2, :cond_1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const-string v2, ", "

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v2, p0, Lz4/g;->h:[I

    .line 30
    .line 31
    aget v2, v2, v1

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/16 v1, 0x7d

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0
.end method
