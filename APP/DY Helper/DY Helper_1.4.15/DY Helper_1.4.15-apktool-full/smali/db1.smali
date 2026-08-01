.class public final Ldb1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:I

.field public final β:I

.field public final γ:La80;

.field public final δ:Ljava/lang/Object;

.field public final ε:Ljava/util/LinkedHashMap;

.field public final ζ:Ljava/util/LinkedHashSet;

.field public η:Lrc1;

.field public θ:I

.field public ι:I

.field public κ:I

.field public λ:I

.field public μ:I

.field public ν:I

.field public ξ:I

.field public ο:I

.field public π:I

.field public ρ:I

.field public σ:I

.field public τ:I

.field public υ:I


# direct methods
.method public constructor <init>(Lrc1;IILjava/util/LinkedHashMap;)V
    .locals 2

    .line 1
    new-instance v0, Lf71;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lf71;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput p2, p0, Ldb1;->α:I

    .line 12
    .line 13
    iput p3, p0, Ldb1;->β:I

    .line 14
    .line 15
    iput-object v0, p0, Ldb1;->γ:La80;

    .line 16
    .line 17
    new-instance p2, Ljava/lang/Object;

    .line 18
    .line 19
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Ldb1;->δ:Ljava/lang/Object;

    .line 23
    .line 24
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    check-cast p3, Ljava/lang/Iterable;

    .line 34
    .line 35
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result p4

    .line 43
    if-eqz p4, :cond_1

    .line 44
    .line 45
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p4

    .line 49
    check-cast p4, Ljava/util/Map$Entry;

    .line 50
    .line 51
    invoke-interface {p4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {p4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    check-cast p4, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p4

    .line 65
    if-gez p4, :cond_0

    .line 66
    .line 67
    const/4 p4, 0x0

    .line 68
    :cond_0
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object p4

    .line 72
    invoke-interface {p2, v0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    iput-object p2, p0, Ldb1;->ε:Ljava/util/LinkedHashMap;

    .line 77
    .line 78
    new-instance p2, Ljava/util/LinkedHashSet;

    .line 79
    .line 80
    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object p2, p0, Ldb1;->ζ:Ljava/util/LinkedHashSet;

    .line 84
    .line 85
    iput-object p1, p0, Ldb1;->η:Lrc1;

    .line 86
    .line 87
    return-void
.end method


# virtual methods
.method public final α(Lod;Z)Lcb1;
    .locals 5

    .line 1
    iget-object v0, p0, Ldb1;->δ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    new-instance p0, Lpm;

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_5

    .line 26
    :cond_1
    iget v1, p0, Ldb1;->ι:I

    .line 27
    .line 28
    sub-int/2addr v1, v4

    .line 29
    if-gez v1, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    move v2, v1

    .line 33
    :goto_0
    iput v2, p0, Ldb1;->ι:I

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_3
    iget v1, p0, Ldb1;->θ:I

    .line 37
    .line 38
    sub-int/2addr v1, v4

    .line 39
    if-gez v1, :cond_4

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_4
    move v2, v1

    .line 43
    :goto_1
    iput v2, p0, Ldb1;->θ:I

    .line 44
    .line 45
    :goto_2
    iget v1, p0, Ldb1;->σ:I

    .line 46
    .line 47
    add-int/2addr v1, v4

    .line 48
    iput v1, p0, Ldb1;->σ:I

    .line 49
    .line 50
    if-eqz p2, :cond_8

    .line 51
    .line 52
    iget p2, p0, Ldb1;->τ:I

    .line 53
    .line 54
    add-int/2addr p2, v4

    .line 55
    iput p2, p0, Ldb1;->τ:I

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-eqz p2, :cond_7

    .line 62
    .line 63
    if-eq p2, v4, :cond_6

    .line 64
    .line 65
    if-ne p2, v3, :cond_5

    .line 66
    .line 67
    iget p2, p0, Ldb1;->ξ:I

    .line 68
    .line 69
    add-int/2addr p2, v4

    .line 70
    iput p2, p0, Ldb1;->ξ:I

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_5
    new-instance p0, Lpm;

    .line 74
    .line 75
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 76
    .line 77
    .line 78
    throw p0

    .line 79
    :cond_6
    iget p2, p0, Ldb1;->ν:I

    .line 80
    .line 81
    add-int/2addr p2, v4

    .line 82
    iput p2, p0, Ldb1;->ν:I

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_7
    iget p2, p0, Ldb1;->μ:I

    .line 86
    .line 87
    add-int/2addr p2, v4

    .line 88
    iput p2, p0, Ldb1;->μ:I

    .line 89
    .line 90
    :goto_3
    sget-object p2, Lod;->η:Lod;

    .line 91
    .line 92
    if-eq p1, p2, :cond_9

    .line 93
    .line 94
    iget-object p2, p0, Ldb1;->γ:La80;

    .line 95
    .line 96
    invoke-interface {p2, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Lrc1;

    .line 101
    .line 102
    iput-object p1, p0, Ldb1;->η:Lrc1;

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_8
    iget p1, p0, Ldb1;->π:I

    .line 106
    .line 107
    add-int/2addr p1, v4

    .line 108
    iput p1, p0, Ldb1;->π:I

    .line 109
    .line 110
    iget p1, p0, Ldb1;->υ:I

    .line 111
    .line 112
    add-int/2addr p1, v4

    .line 113
    iput p1, p0, Ldb1;->υ:I

    .line 114
    .line 115
    :cond_9
    :goto_4
    invoke-virtual {p0}, Ldb1;->η()Lcb1;

    .line 116
    .line 117
    .line 118
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    monitor-exit v0

    .line 120
    return-object p0

    .line 121
    :goto_5
    monitor-exit v0

    .line 122
    throw p0
.end method

.method public final β()Lrc1;
    .locals 5

    .line 1
    iget-object v0, p0, Ldb1;->δ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Lrc1;

    .line 5
    .line 6
    iget-object v2, p0, Ldb1;->η:Lrc1;

    .line 7
    .line 8
    iget v3, v2, Lrc1;->α:I

    .line 9
    .line 10
    iget v4, p0, Ldb1;->θ:I

    .line 11
    .line 12
    add-int/2addr v3, v4

    .line 13
    iget v2, v2, Lrc1;->β:I

    .line 14
    .line 15
    iget p0, p0, Ldb1;->ι:I

    .line 16
    .line 17
    add-int/2addr v2, p0

    .line 18
    invoke-direct {v1, v3, v2}, Lrc1;-><init>(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-object v1

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    monitor-exit v0

    .line 25
    throw p0
.end method

.method public final γ(JLod;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldb1;->δ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance p2, Ll91;

    .line 9
    .line 10
    invoke-direct {p2, p1, p3}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Ldb1;->ε:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    if-gez p4, :cond_0

    .line 16
    .line 17
    const/4 p4, 0x0

    .line 18
    :cond_0
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Ldb1;->ζ:Ljava/util/LinkedHashSet;

    .line 26
    .line 27
    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ldb1;->η()Lcb1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    monitor-exit v0

    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    monitor-exit v0

    .line 37
    throw p0
.end method

.method public final δ(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldb1;->δ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Ldb1;->κ:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x1

    .line 7
    .line 8
    iput v1, p0, Ldb1;->κ:I

    .line 9
    .line 10
    iget v1, p0, Ldb1;->λ:I

    .line 11
    .line 12
    if-gez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    :cond_0
    add-int/2addr v1, p1

    .line 16
    iput v1, p0, Ldb1;->λ:I

    .line 17
    .line 18
    invoke-virtual {p0}, Ldb1;->η()Lcb1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    monitor-exit v0

    .line 25
    throw p0
.end method

.method public final ε()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldb1;->δ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Ldb1;->π:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x1

    .line 7
    .line 8
    iput v1, p0, Ldb1;->π:I

    .line 9
    .line 10
    invoke-virtual {p0}, Ldb1;->η()Lcb1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    monitor-exit v0

    .line 17
    throw p0
.end method

.method public final ζ()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldb1;->δ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Ldb1;->ι:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, -0x1

    .line 7
    .line 8
    if-gez v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :cond_0
    iput v1, p0, Ldb1;->ι:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    monitor-exit v0

    .line 17
    throw p0
.end method

.method public final η()Lcb1;
    .locals 14

    .line 1
    new-instance v0, Lcb1;

    .line 2
    .line 3
    iget v1, p0, Ldb1;->κ:I

    .line 4
    .line 5
    iget v2, p0, Ldb1;->λ:I

    .line 6
    .line 7
    iget v3, p0, Ldb1;->μ:I

    .line 8
    .line 9
    iget v4, p0, Ldb1;->ν:I

    .line 10
    .line 11
    iget v5, p0, Ldb1;->ξ:I

    .line 12
    .line 13
    iget v6, p0, Ldb1;->ο:I

    .line 14
    .line 15
    iget v7, p0, Ldb1;->π:I

    .line 16
    .line 17
    iget v8, p0, Ldb1;->ρ:I

    .line 18
    .line 19
    iget v9, p0, Ldb1;->σ:I

    .line 20
    .line 21
    iget-object v10, p0, Ldb1;->ε:Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 24
    .line 25
    .line 26
    move-result-object v10

    .line 27
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast v10, Ljava/lang/Iterable;

    .line 31
    .line 32
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v10

    .line 36
    const/4 v11, 0x0

    .line 37
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v12

    .line 41
    if-eqz v12, :cond_0

    .line 42
    .line 43
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v12

    .line 47
    check-cast v12, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v12

    .line 53
    add-int/2addr v11, v12

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget v10, p0, Ldb1;->σ:I

    .line 56
    .line 57
    if-ge v11, v10, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move v10, v11

    .line 61
    :goto_1
    iget v11, p0, Ldb1;->τ:I

    .line 62
    .line 63
    iget v12, p0, Ldb1;->υ:I

    .line 64
    .line 65
    iget-object v13, p0, Ldb1;->η:Lrc1;

    .line 66
    .line 67
    invoke-direct/range {v0 .. v13}, Lcb1;-><init>(IIIIIIIIIIIILrc1;)V

    .line 68
    .line 69
    .line 70
    return-object v0
.end method

.method public final θ(Lod;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Ldb1;->δ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz p1, :cond_3

    .line 11
    .line 12
    if-eq p1, v2, :cond_1

    .line 13
    .line 14
    const/4 p0, 0x2

    .line 15
    if-ne p1, p0, :cond_0

    .line 16
    .line 17
    :goto_0
    move v1, v2

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance p0, Lpm;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw p0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_2

    .line 27
    :cond_1
    iget p1, p0, Ldb1;->β:I

    .line 28
    .line 29
    if-lez p1, :cond_2

    .line 30
    .line 31
    iget-object v3, p0, Ldb1;->η:Lrc1;

    .line 32
    .line 33
    iget v3, v3, Lrc1;->β:I

    .line 34
    .line 35
    iget v4, p0, Ldb1;->ι:I

    .line 36
    .line 37
    add-int/2addr v3, v4

    .line 38
    if-lt v3, p1, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    iget p1, p0, Ldb1;->ι:I

    .line 42
    .line 43
    add-int/2addr p1, v2

    .line 44
    iput p1, p0, Ldb1;->ι:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    iget p1, p0, Ldb1;->α:I

    .line 48
    .line 49
    if-lez p1, :cond_4

    .line 50
    .line 51
    iget-object v3, p0, Ldb1;->η:Lrc1;

    .line 52
    .line 53
    iget v3, v3, Lrc1;->α:I

    .line 54
    .line 55
    iget v4, p0, Ldb1;->θ:I

    .line 56
    .line 57
    add-int/2addr v3, v4

    .line 58
    if-lt v3, p1, :cond_4

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    iget p1, p0, Ldb1;->θ:I

    .line 62
    .line 63
    add-int/2addr p1, v2

    .line 64
    iput p1, p0, Ldb1;->θ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :goto_1
    monitor-exit v0

    .line 68
    return v1

    .line 69
    :goto_2
    monitor-exit v0

    .line 70
    throw p0
.end method
