.class public final Lc7/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/lang/Iterable;


# instance fields
.field public final g:Ljava/lang/Object;

.field public final h:Ljava/util/LinkedHashMap;

.field public i:[Lc7/e;


# direct methods
.method public constructor <init>(Ljava/util/LinkedHashMap;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lc7/f;->g:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, Lc7/f;->h:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v0, 0x0

    .line 22
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lc7/e;

    .line 33
    .line 34
    instance-of v2, v1, Li7/c;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    move-object v0, v1

    .line 39
    check-cast v0, Li7/c;

    .line 40
    .line 41
    iget-object v1, v1, Lc7/e;->a:Ljava/lang/String;

    .line 42
    .line 43
    const-string v2, "META-INF/"

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_0

    .line 50
    .line 51
    :cond_1
    if-nez v0, :cond_2

    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    iget-object p1, v0, Li7/b;->f:Lc7/b;

    .line 55
    .line 56
    invoke-virtual {p1}, Lc7/b;->a()Ld7/d;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget v1, v0, Ld7/g;->p:I

    .line 61
    .line 62
    const/4 v2, 0x4

    .line 63
    add-int/2addr v1, v2

    .line 64
    invoke-virtual {v0, v1}, Ld7/s;->N(I)J

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lc7/b;->a()Ld7/d;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0, v2}, Ld7/s;->O(I)I

    .line 72
    .line 73
    .line 74
    iget-object v0, p1, Lc7/b;->a:Ld7/m;

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Ld7/s;->O(I)I

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lc7/b;->a()Ld7/d;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const/4 v0, 0x6

    .line 84
    invoke-virtual {p1, v0}, Ld7/s;->O(I)I

    .line 85
    .line 86
    .line 87
    return-void
.end method


# virtual methods
.method public final a(Lc7/d;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc7/f;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Lc7/e;->a()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v2, p0, Lc7/f;->h:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v1, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput-object p1, p0, Lc7/f;->i:[Lc7/e;

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p1
.end method

.method public final b(Ljava/lang/String;)Lc7/e;
    .locals 2

    .line 1
    iget-object v0, p0, Lc7/f;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lc7/f;->h:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lc7/e;

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-object p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1
.end method

.method public final c()[Lc7/e;
    .locals 5

    .line 1
    iget-object v0, p0, Lc7/f;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lc7/f;->i:[Lc7/e;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-object v1

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v1, p0, Lc7/f;->h:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    new-array v2, v2, [Lc7/e;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v3, 0x0

    .line 29
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Lc7/e;

    .line 40
    .line 41
    aput-object v4, v2, v3

    .line 42
    .line 43
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iput-object v2, p0, Lc7/f;->i:[Lc7/e;

    .line 47
    .line 48
    monitor-exit v0

    .line 49
    return-object v2

    .line 50
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    throw v1
.end method

.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lc7/e;

    .line 2
    .line 3
    check-cast p2, Lc7/e;

    .line 4
    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_1
    if-nez p2, :cond_2

    .line 14
    .line 15
    const/4 p1, -0x1

    .line 16
    return p1

    .line 17
    :cond_2
    iget p1, p1, Lc7/e;->d:I

    .line 18
    .line 19
    iget p2, p2, Lc7/e;->d:I

    .line 20
    .line 21
    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lc7/f;->c()[Lc7/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    array-length v1, v0

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_2

    .line 12
    .line 13
    aget-object v3, v0, v2

    .line 14
    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    new-instance v1, Lz7/d;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    array-length v3, v0

    .line 21
    invoke-direct {v1, v0, v3, v2}, Lz7/d;-><init>([Ljava/lang/Object;ILjava/util/function/Predicate;)V

    .line 22
    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    :goto_1
    sget-object v0, Lz7/h;->g:Lz7/h;

    .line 29
    .line 30
    return-object v0
.end method
