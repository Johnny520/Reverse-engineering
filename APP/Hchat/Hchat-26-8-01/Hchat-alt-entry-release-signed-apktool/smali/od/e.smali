.class public final Lod/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lod/e;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lod/e;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lod/e;->b:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lod/e;->a:Lod/e;

    .line 7
    .line 8
    iput-object p3, p0, Lod/e;->c:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public static declared-synchronized a(Lud/u;Ljava/lang/String;)Lod/e;
    .locals 4

    .line 1
    const-class v0, Lod/e;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lud/u;->e:Lbe/k;

    .line 5
    .line 6
    iget-object v1, v1, Lbe/k;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lod/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :cond_0
    const/16 v1, 0x2e

    .line 21
    .line 22
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, -0x1

    .line 27
    if-ne v1, v2, :cond_1

    .line 28
    .line 29
    new-instance v1, Lod/e;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-direct {v1, p1, v2, p1}, Lod/e;-><init>(Ljava/lang/String;Lod/e;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 v2, 0x0

    .line 39
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {p0, v2}, Lod/e;->a(Lud/u;Ljava/lang/String;)Lod/e;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    new-instance v3, Lod/e;

    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-direct {v3, p1, v2, v1}, Lod/e;-><init>(Ljava/lang/String;Lod/e;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    move-object v1, v3

    .line 59
    :goto_0
    iget-object p0, p0, Lud/u;->e:Lbe/k;

    .line 60
    .line 61
    iget-object p0, p0, Lbe/k;->e:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Ljava/util/HashMap;

    .line 64
    .line 65
    iget-object p1, v1, Lod/e;->b:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    monitor-exit v0

    .line 71
    return-object v1

    .line 72
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    throw p0
.end method

.method public static declared-synchronized b(Lud/u;Lod/e;Ljava/lang/String;)Lod/e;
    .locals 3

    .line 1
    const-class v0, Lod/e;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    move-object v1, p2

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    iget-object v1, p1, Lod/e;->b:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, "."

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :goto_0
    iget-object v2, p0, Lud/u;->e:Lbe/k;

    .line 31
    .line 32
    iget-object v2, v2, Lbe/k;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lod/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    monitor-exit v0

    .line 45
    return-object v2

    .line 46
    :cond_1
    :try_start_1
    new-instance v2, Lod/e;

    .line 47
    .line 48
    invoke-direct {v2, v1, p1, p2}, Lod/e;-><init>(Ljava/lang/String;Lod/e;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Lud/u;->e:Lbe/k;

    .line 52
    .line 53
    iget-object p0, p0, Lbe/k;->e:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-virtual {p0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-object v2

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lod/e;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, Lod/e;

    .line 12
    .line 13
    iget-object p1, p1, Lod/e;->b:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v0, p0, Lod/e;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lod/e;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/e;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
