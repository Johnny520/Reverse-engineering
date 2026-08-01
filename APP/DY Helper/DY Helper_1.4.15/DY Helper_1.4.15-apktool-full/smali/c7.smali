.class public final Lc7;
.super Lfw1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/Map;


# instance fields
.field public θ:Lx6;

.field public ι:Lz6;

.field public κ:Lb7;


# virtual methods
.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lc7;->θ:Lx6;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lx6;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lx6;-><init>(Lc7;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lc7;->θ:Lx6;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lc7;->ι:Lz6;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lz6;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lz6;-><init>(Lc7;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lc7;->ι:Lz6;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 4

    .line 1
    iget v0, p0, Lfw1;->η:I

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/2addr v1, v0

    .line 8
    iget v0, p0, Lfw1;->η:I

    .line 9
    .line 10
    iget-object v2, p0, Lfw1;->ε:[I

    .line 11
    .line 12
    array-length v3, v2

    .line 13
    if-ge v3, v1, :cond_0

    .line 14
    .line 15
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iput-object v2, p0, Lfw1;->ε:[I

    .line 20
    .line 21
    iget-object v2, p0, Lfw1;->ζ:[Ljava/lang/Object;

    .line 22
    .line 23
    mul-int/lit8 v1, v1, 0x2

    .line 24
    .line 25
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, p0, Lfw1;->ζ:[Ljava/lang/Object;

    .line 30
    .line 31
    :cond_0
    iget v1, p0, Lfw1;->η:I

    .line 32
    .line 33
    if-ne v1, v0, :cond_2

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/util/Map$Entry;

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p0, v1, v0}, Lfw1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    return-void

    .line 68
    :cond_2
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 69
    .line 70
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 71
    .line 72
    .line 73
    throw p0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lc7;->κ:Lb7;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lb7;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lb7;-><init>(Lc7;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lc7;->κ:Lb7;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public final ι(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-super {p0, v0}, Lfw1;->containsKey(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p0, 0x1

    .line 24
    return p0
.end method

.method public final κ(Ljava/util/Collection;)Z
    .locals 2

    .line 1
    iget v0, p0, Lfw1;->η:I

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-super {p0, v1}, Lfw1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget p0, p0, Lfw1;->η:I

    .line 22
    .line 23
    if-eq v0, p0, :cond_1

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    return p0
.end method
