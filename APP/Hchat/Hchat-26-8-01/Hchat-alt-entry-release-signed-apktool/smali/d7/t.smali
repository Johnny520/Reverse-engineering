.class public abstract Ld7/t;
.super Ld7/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final m:Lc7/g;

.field public final n:I


# direct methods
.method public constructor <init>(ILc7/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lr7/b;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ld7/t;->n:I

    .line 5
    .line 6
    iput-object p2, p0, Ld7/t;->m:Lc7/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final S(Ljava/io/InputStream;)I
    .locals 5

    .line 1
    iget v0, p0, Ld7/t;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Lr7/b;->M(IZ)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lr7/b;->k:[B

    .line 8
    .line 9
    array-length v2, v0

    .line 10
    invoke-virtual {p1, v0, v1, v2}, Ljava/io/InputStream;->read([BII)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v3, p0, Ld7/t;->m:Lc7/g;

    .line 15
    .line 16
    if-eq v0, v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v0, v1}, Lr7/b;->M(IZ)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ld7/t;->T()Lc7/g;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-ne v2, v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Lr7/b;->p()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v4, 0x4

    .line 32
    if-ge v2, v4, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object v2, p0, Lr7/b;->k:[B

    .line 36
    .line 37
    invoke-static {v2, v1, v1}, Lk7/a;->D([BII)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ld7/t;->T()Lc7/g;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eq v1, v3, :cond_2

    .line 45
    .line 46
    return v0

    .line 47
    :cond_2
    invoke-virtual {p0, p1}, Ld7/t;->V(Ljava/io/InputStream;)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    add-int/2addr p1, v0

    .line 52
    return p1
.end method

.method public final T()Lc7/g;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lr7/b;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lr7/b;->k:[B

    .line 12
    .line 13
    invoke-static {v0, v2}, Lk7/a;->s([BI)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    :goto_0
    sget-object v1, Lc7/g;->n:[Lc7/g;

    .line 18
    .line 19
    array-length v3, v1

    .line 20
    :goto_1
    if-ge v2, v3, :cond_2

    .line 21
    .line 22
    aget-object v4, v1, v2

    .line 23
    .line 24
    iget v5, v4, Lc7/g;->g:I

    .line 25
    .line 26
    if-ne v0, v5, :cond_1

    .line 27
    .line 28
    return-object v4

    .line 29
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const/4 v0, 0x0

    .line 33
    return-object v0
.end method

.method public final U()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ld7/t;->T()Lc7/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ld7/t;->m:Lc7/g;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public V(Ljava/io/InputStream;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method
