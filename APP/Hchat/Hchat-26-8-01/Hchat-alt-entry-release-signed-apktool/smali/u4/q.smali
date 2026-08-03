.class public final Lu4/q;
.super Lz4/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final h:[Lu4/o;

.field public i:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lu4/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lu4/q;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    :goto_0
    invoke-direct {p0, v1}, Lz4/j;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    new-array p1, p1, [Lu4/o;

    .line 11
    .line 12
    iput-object p1, p0, Lu4/q;->h:[Lu4/o;

    .line 13
    .line 14
    iput v0, p0, Lu4/q;->i:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    instance-of v0, p1, Lu4/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    check-cast p1, Lu4/q;

    .line 8
    .line 9
    iget-object v0, p1, Lu4/q;->h:[Lu4/o;

    .line 10
    .line 11
    iget-object v2, p0, Lu4/q;->h:[Lu4/o;

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    array-length v4, v0

    .line 15
    if-ne v3, v4, :cond_5

    .line 16
    .line 17
    invoke-virtual {p0}, Lu4/q;->size()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual {p1}, Lu4/q;->size()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eq v4, p1, :cond_1

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    move p1, v1

    .line 29
    :goto_0
    if-ge p1, v3, :cond_4

    .line 30
    .line 31
    aget-object v4, v2, p1

    .line 32
    .line 33
    aget-object v5, v0, p1

    .line 34
    .line 35
    if-ne v4, v5, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    if-eqz v4, :cond_5

    .line 39
    .line 40
    invoke-virtual {v4, v5}, Lu4/o;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-nez v4, :cond_3

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    :cond_5
    :goto_2
    return v1
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Lu4/q;->h:[Lu4/o;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    move v4, v3

    .line 7
    :goto_0
    if-ge v3, v1, :cond_1

    .line 8
    .line 9
    aget-object v5, v0, v3

    .line 10
    .line 11
    if-nez v5, :cond_0

    .line 12
    .line 13
    move v5, v2

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {v5}, Lu4/o;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    :goto_1
    mul-int/lit8 v4, v4, 0x1f

    .line 20
    .line 21
    add-int/2addr v4, v5

    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return v4
.end method

.method public final l(I)Lu4/o;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lu4/q;->h:[Lu4/o;

    .line 2
    .line 3
    aget-object p1, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :catch_0
    const-string p1, "bogus reg"

    .line 7
    .line 8
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1
.end method

.method public final m(Lu4/o;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lu4/q;->h:[Lu4/o;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz4/j;->j()V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    iput v1, p0, Lu4/q;->i:I

    .line 10
    .line 11
    :try_start_0
    iget v1, p1, Lu4/o;->g:I

    .line 12
    .line 13
    aput-object p1, v0, v1

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x2

    .line 17
    if-lez v1, :cond_0

    .line 18
    .line 19
    add-int/lit8 v4, v1, -0x1

    .line 20
    .line 21
    aget-object v5, v0, v4

    .line 22
    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    invoke-virtual {v5}, Lu4/o;->j()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-ne v5, v3, :cond_0

    .line 30
    .line 31
    aput-object v2, v0, v4

    .line 32
    .line 33
    :cond_0
    invoke-virtual {p1}, Lu4/o;->j()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-ne p1, v3, :cond_1

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    aput-object v2, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    :cond_1
    return-void

    .line 44
    :catch_0
    const-string p1, "spec.getReg() out of range"

    .line 45
    .line 46
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    const-string p1, "spec == null"

    .line 51
    .line 52
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final n(Lu4/o;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lu4/q;->h:[Lu4/o;

    .line 2
    .line 3
    iget p1, p1, Lu4/o;->g:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    aput-object v1, v0, p1

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lu4/q;->i:I
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    const-string p1, "bogus reg"

    .line 13
    .line 14
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final size()I
    .locals 5

    .line 1
    iget v0, p0, Lu4/q;->i:I

    .line 2
    .line 3
    if-gez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lu4/q;->h:[Lu4/o;

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    aget-object v4, v0, v2

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iput v3, p0, Lu4/q;->i:I

    .line 22
    .line 23
    return v3

    .line 24
    :cond_2
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lu4/q;->h:[Lu4/o;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    mul-int/lit8 v3, v1, 0x19

    .line 7
    .line 8
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/16 v3, 0x7b

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    if-ge v3, v1, :cond_2

    .line 19
    .line 20
    aget-object v5, v0, v3

    .line 21
    .line 22
    if-eqz v5, :cond_1

    .line 23
    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    const-string v6, ", "

    .line 27
    .line 28
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const/4 v4, 0x1

    .line 33
    :goto_1
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const/16 v0, 0x7d

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0
.end method
