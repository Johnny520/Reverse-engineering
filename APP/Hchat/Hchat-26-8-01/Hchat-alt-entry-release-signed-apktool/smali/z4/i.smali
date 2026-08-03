.class public abstract Lz4/i;
.super Lz4/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final i:Lz4/g;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lz4/e;-><init>(I)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz4/g;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lz4/g;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lz4/i;->i:Lz4/g;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final o()I
    .locals 3

    .line 1
    iget-object v0, p0, Lz4/i;->i:Lz4/g;

    .line 2
    .line 3
    iget v1, v0, Lz4/g;->i:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, -0x1

    .line 6
    .line 7
    :goto_0
    if-ltz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lz4/g;->n(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-gez v2, :cond_0

    .line 14
    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lz4/g;->r(I)V

    .line 21
    .line 22
    .line 23
    return v1
.end method

.method public final p(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lz4/i;->i:Lz4/g;

    .line 2
    .line 3
    iget v1, v0, Lz4/g;->i:I

    .line 4
    .line 5
    if-lt p1, v1, :cond_0

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {v0, p1}, Lz4/g;->n(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final q(ILz4/h;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lz4/e;->h:[Ljava/lang/Object;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    check-cast v0, Lz4/h;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    iget-object v2, p0, Lz4/i;->i:Lz4/g;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Lz4/h;->a()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {v2, v0, v1}, Lz4/g;->q(II)V

    .line 20
    .line 21
    .line 22
    :cond_0
    if-eqz p2, :cond_2

    .line 23
    .line 24
    invoke-interface {p2}, Lz4/h;->a()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    iget v0, v2, Lz4/g;->i:I

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    :goto_0
    sub-int v4, p2, v0

    .line 32
    .line 33
    if-gt v3, v4, :cond_1

    .line 34
    .line 35
    invoke-virtual {v2, v1}, Lz4/g;->l(I)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v2, p2, p1}, Lz4/g;->q(II)V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-void
.end method
