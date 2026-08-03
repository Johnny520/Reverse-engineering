.class public final Lu4/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:I

.field public b:Lw4/d;

.field public c:Lu4/k;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Lu4/o;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Lu4/o;

    .line 8
    .line 9
    iget v0, p0, Lu4/n;->a:I

    .line 10
    .line 11
    iget-object v1, p0, Lu4/n;->b:Lw4/d;

    .line 12
    .line 13
    iget-object v2, p0, Lu4/n;->c:Lu4/k;

    .line 14
    .line 15
    sget-object v3, Lu4/o;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1, v2}, Lu4/o;->e(ILw4/d;Lu4/k;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lu4/n;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lu4/n;->b:Lw4/d;

    .line 4
    .line 5
    iget-object v2, p0, Lu4/n;->c:Lu4/k;

    .line 6
    .line 7
    sget-object v3, Lu4/o;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, Lu4/k;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v2, 0x0

    .line 17
    :goto_0
    mul-int/lit8 v2, v2, 0x1f

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/2addr v1, v2

    .line 24
    mul-int/lit8 v1, v1, 0x1f

    .line 25
    .line 26
    add-int/2addr v1, v0

    .line 27
    return v1
.end method
