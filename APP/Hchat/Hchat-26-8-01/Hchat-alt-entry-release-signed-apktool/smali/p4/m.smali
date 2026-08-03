.class public final Lp4/m;
.super Lp4/l;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public f:[Lp4/z;


# direct methods
.method public constructor <init>(Lu4/t;Lu4/p;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lp4/l;-><init>(Lu4/t;Lu4/p;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p2, Lz4/e;->h:[Ljava/lang/Object;

    .line 5
    .line 6
    array-length p1, p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Lp4/m;->f:[Lp4/z;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p1, "registers.size() == 0"

    .line 14
    .line 15
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final b()I
    .locals 5

    .line 1
    invoke-virtual {p0}, Lp4/m;->m()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lp4/m;->f:[Lp4/z;

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v4, v0, v2

    .line 12
    .line 13
    invoke-virtual {v4}, Lp4/l;->b()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    add-int/2addr v3, v4

    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return v3
.end method

.method public final g()Ljava/lang/String;
    .locals 9

    .line 1
    iget-object v0, p0, Lp4/h;->d:Lu4/p;

    .line 2
    .line 3
    iget-object v1, v0, Lz4/e;->h:[Ljava/lang/Object;

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const/16 v3, 0x64

    .line 9
    .line 10
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v3

    .line 15
    :goto_0
    if-ge v3, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    check-cast v5, Lu4/o;

    .line 22
    .line 23
    sget-object v6, Lu4/t;->d:Lu4/t;

    .line 24
    .line 25
    iget-object v7, v5, Lu4/o;->h:Lw4/d;

    .line 26
    .line 27
    invoke-interface {v7}, Lw4/d;->getType()Lw4/c;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    const/4 v8, 0x0

    .line 32
    invoke-static {v4, v7, v8}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    invoke-static {v6, v7, v5}, Lp4/h;->h(Lu4/t;Lu4/o;Lu4/o;)Lp4/z;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    const/16 v7, 0xa

    .line 43
    .line 44
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-virtual {v6}, Lp4/l;->g()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Lu4/o;->j()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    add-int/2addr v4, v5

    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    return-object v0
.end method

.method public final k(Lu4/p;)Lp4/h;
    .locals 2

    .line 1
    new-instance v0, Lp4/m;

    .line 2
    .line 3
    iget-object v1, p0, Lp4/h;->c:Lu4/t;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lp4/m;-><init>(Lu4/t;Lu4/p;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final l(Lz4/d;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lp4/m;->m()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lp4/m;->f:[Lp4/z;

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    aget-object v3, v0, v2

    .line 11
    .line 12
    invoke-virtual {v3, p1}, Lp4/l;->l(Lz4/d;)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void
.end method

.method public final m()V
    .locals 9

    .line 1
    iget-object v0, p0, Lp4/m;->f:[Lp4/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, p0, Lp4/h;->d:Lu4/p;

    .line 7
    .line 8
    iget-object v1, v0, Lz4/e;->h:[Ljava/lang/Object;

    .line 9
    .line 10
    array-length v1, v1

    .line 11
    new-array v2, v1, [Lp4/z;

    .line 12
    .line 13
    iput-object v2, p0, Lp4/m;->f:[Lp4/z;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :goto_0
    if-ge v2, v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Lu4/o;

    .line 24
    .line 25
    iget-object v5, p0, Lp4/m;->f:[Lp4/z;

    .line 26
    .line 27
    sget-object v6, Lu4/t;->d:Lu4/t;

    .line 28
    .line 29
    iget-object v7, v4, Lu4/o;->h:Lw4/d;

    .line 30
    .line 31
    invoke-interface {v7}, Lw4/d;->getType()Lw4/c;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    const/4 v8, 0x0

    .line 36
    invoke-static {v3, v7, v8}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    invoke-static {v6, v7, v4}, Lp4/h;->h(Lu4/t;Lu4/o;Lu4/o;)Lp4/z;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    aput-object v6, v5, v2

    .line 45
    .line 46
    invoke-virtual {v4}, Lu4/o;->j()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    add-int/2addr v3, v4

    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    :goto_1
    return-void
.end method
