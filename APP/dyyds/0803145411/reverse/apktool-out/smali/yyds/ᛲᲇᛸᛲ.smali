.class public final Lyyds/ᛲᲇᛸᛲ;
.super Lyyds/ᛴᛲᛲᛷ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛱᛳᛶᛳ:Z

.field public ᛲᛳᛴᛸ:Lyyds/ᛲᲇᛸᛲ;

.field public ᛲᛶᛱᲈ:Lyyds/ᛷᛵᛸᲇ;

.field public final ᛳᛸᛴᛶ:Landroid/content/Context;

.field public ᛵᲀᛵᛸ:Ljava/util/ArrayList;

.field public final ᛵᲀᲈᛴ:Lyyds/ᲇᲈᲁᛷ;

.field public final ᛶᛸᲀᲁ:Ljava/lang/Class;

.field public final ᛶᲈᛴᲈ:Lyyds/ᲁᛷᛲ;

.field public ᛷᛸᲇᛶ:Lyyds/ᛲᲇᛸᛲ;

.field public ᛸᛸᛷᛱ:Z

.field public ᲀᛲᛱᛱ:Z

.field public ᲈᲀᛲᲀ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛶᛱᛳᲁ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛴᛲᛲᛷ;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lyyds/ᲁᲁᲇᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᲁᲇᛷ;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛴᛳᛲ(Lyyds/ᲁᲁᲇᛷ;)Lyyds/ᛴᛲᛲᛷ;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lyyds/ᛶᛱᛳᲁ;

    .line 13
    .line 14
    invoke-virtual {v0}, Lyyds/ᛴᛲᛲᛷ;->ᛷᛵᲇᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lyyds/ᛶᛱᛳᲁ;

    .line 19
    .line 20
    invoke-virtual {v0}, Lyyds/ᛴᛲᛲᛷ;->ᲇᛱᛲ()Lyyds/ᛴᛲᛲᛷ;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lyyds/ᛶᛱᛳᲁ;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/ᛲᲈᲁ;Lyyds/ᲁᛷᛲ;Ljava/lang/Class;Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lyyds/ᛴᛲᛲᛷ;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛱᛳᛶᛳ:Z

    .line 6
    .line 7
    iput-object p2, p0, Lyyds/ᛲᲇᛸᛲ;->ᛶᲈᛴᲈ:Lyyds/ᲁᛷᛲ;

    .line 8
    .line 9
    iput-object p3, p0, Lyyds/ᛲᲇᛸᛲ;->ᛶᛸᲀᲁ:Ljava/lang/Class;

    .line 10
    .line 11
    iput-object p4, p0, Lyyds/ᛲᲇᛸᛲ;->ᛳᛸᛴᛶ:Landroid/content/Context;

    .line 12
    .line 13
    iget-object p4, p2, Lyyds/ᲁᛷᛲ;->ᲀᛲᛳᲀ:Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 14
    .line 15
    iget-object p4, p4, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᛴᛳᛲ:Lyyds/ᲇᲈᲁᛷ;

    .line 16
    .line 17
    iget-object p4, p4, Lyyds/ᲇᲈᲁᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛲᲇᲀ;

    .line 18
    .line 19
    invoke-virtual {p4, p3}, Lyyds/ᛴᲈᛲᛷ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lyyds/ᛷᛵᛸᲇ;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p4}, Lyyds/ᛷᛲᲇᲀ;->entrySet()Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object p4

    .line 31
    check-cast p4, Lyyds/ᛳᛷᛱᛱ;

    .line 32
    .line 33
    invoke-virtual {p4}, Lyyds/ᛳᛷᛱᛱ;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p4

    .line 37
    :cond_0
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ljava/util/Map$Entry;

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ljava/lang/Class;

    .line 54
    .line 55
    invoke-virtual {v2, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_0

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lyyds/ᛷᛵᛸᲇ;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    if-nez v0, :cond_2

    .line 69
    .line 70
    sget-object v0, Lyyds/ᲇᲈᲁᛷ;->ᛲᛳᛶᲁ:Lyyds/ᛷᛵᛸᲇ;

    .line 71
    .line 72
    :cond_2
    iput-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ:Lyyds/ᛷᛵᛸᲇ;

    .line 73
    .line 74
    iget-object p1, p1, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᛴᛳᛲ:Lyyds/ᲇᲈᲁᛷ;

    .line 75
    .line 76
    iput-object p1, p0, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᲈᛴ:Lyyds/ᲇᲈᲁᛷ;

    .line 77
    .line 78
    iget-object p1, p2, Lyyds/ᲁᛷᛲ;->ᛷᛲᲈᛱ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result p3

    .line 88
    if-eqz p3, :cond_3

    .line 89
    .line 90
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    check-cast p3, Lyyds/ᛳᛶᛳᛳ;

    .line 95
    .line 96
    invoke-virtual {p0, p3}, Lyyds/ᛲᲇᛸᛲ;->ᛶᲈᛴᲈ(Lyyds/ᛳᛶᛳᛳ;)Lyyds/ᛲᲇᛸᛲ;

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    monitor-enter p2

    .line 101
    :try_start_0
    iget-object p1, p2, Lyyds/ᲁᛷᛲ;->ᛷᛵᲇᲀ:Lyyds/ᛶᛱᛳᲁ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    .line 103
    monitor-exit p2

    .line 104
    invoke-virtual {p0, p1}, Lyyds/ᛲᲇᛸᛲ;->ᛶᛸᲀᲁ(Lyyds/ᛴᛲᛲᛷ;)Lyyds/ᛲᲇᛸᛲ;

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :catchall_0
    move-exception p0

    .line 109
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    throw p0
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ()Lyyds/ᛲᲇᛸᛲ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lyyds/ᛲᲇᛸᛲ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛲᲇᛸᛲ;

    .line 6
    .line 7
    invoke-super {p0, p1}, Lyyds/ᛴᛲᛲᛷ;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛶᛸᲀᲁ:Ljava/lang/Class;

    .line 14
    .line 15
    iget-object v1, p1, Lyyds/ᛲᲇᛸᛲ;->ᛶᛸᲀᲁ:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ:Lyyds/ᛷᛵᛸᲇ;

    .line 24
    .line 25
    iget-object v1, p1, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ:Lyyds/ᛷᛵᛸᲇ;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lyyds/ᛷᛵᛸᲇ;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᲈᲀᛲᲀ:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v1, p1, Lyyds/ᛲᲇᛸᛲ;->ᲈᲀᛲᲀ:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    iget-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᛵᛸ:Ljava/util/ArrayList;

    .line 44
    .line 45
    iget-object v1, p1, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᛵᛸ:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    iget-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛲᛳᛴᛸ:Lyyds/ᛲᲇᛸᛲ;

    .line 54
    .line 55
    iget-object v1, p1, Lyyds/ᛲᲇᛸᛲ;->ᛲᛳᛴᛸ:Lyyds/ᛲᲇᛸᛲ;

    .line 56
    .line 57
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    iget-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛲᲇᛸᛲ;

    .line 64
    .line 65
    iget-object v1, p1, Lyyds/ᛲᲇᛸᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛲᲇᛸᛲ;

    .line 66
    .line 67
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    iget-boolean v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛱᛳᛶᛳ:Z

    .line 74
    .line 75
    iget-boolean v1, p1, Lyyds/ᛲᲇᛸᛲ;->ᛱᛳᛶᛳ:Z

    .line 76
    .line 77
    if-ne v0, v1, :cond_0

    .line 78
    .line 79
    iget-boolean p0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛸᛸᛷᛱ:Z

    .line 80
    .line 81
    iget-boolean p1, p1, Lyyds/ᛲᲇᛸᛲ;->ᛸᛸᛷᛱ:Z

    .line 82
    .line 83
    if-ne p0, p1, :cond_0

    .line 84
    .line 85
    const/4 p0, 0x1

    .line 86
    return p0

    .line 87
    :cond_0
    const/4 p0, 0x0

    .line 88
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    invoke-super {p0}, Lyyds/ᛴᛲᛲᛷ;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lyyds/ᛲᲇᛸᛲ;->ᛶᛸᲀᲁ:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ:Lyyds/ᛷᛵᛸᲇ;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lyyds/ᛲᲇᛸᛲ;->ᲈᲀᛲᲀ:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v0, v1}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v1, p0, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᛵᛸ:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-static {v0, v1}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v1, p0, Lyyds/ᛲᲇᛸᛲ;->ᛲᛳᛴᛸ:Lyyds/ᛲᲇᛸᛲ;

    .line 30
    .line 31
    invoke-static {v0, v1}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v1, p0, Lyyds/ᛲᲇᛸᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛲᲇᛸᛲ;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-static {v0, v1}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v1, p0, Lyyds/ᛲᲇᛸᛲ;->ᛱᛳᛶᛳ:Z

    .line 47
    .line 48
    invoke-static {v1, v0}, Lyyds/ᛱᛷᲈᛲ;->ᛷᲈᲈᲁ(II)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean p0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛸᛸᛷᛱ:Z

    .line 53
    .line 54
    invoke-static {p0, v0}, Lyyds/ᛱᛷᲈᛲ;->ᛷᲈᲈᲁ(II)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    return p0
.end method

.method public final ᛱᛳᛶᛳ(Ljava/lang/Object;)Lyyds/ᛲᲇᛸᛲ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ()Lyyds/ᛲᲇᛸᛲ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Lyyds/ᛲᲇᛸᛲ;->ᛱᛳᛶᛳ(Ljava/lang/Object;)Lyyds/ᛲᲇᛸᛲ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput-object p1, p0, Lyyds/ᛲᲇᛸᛲ;->ᲈᲀᛲᲀ:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lyyds/ᛲᲇᛸᛲ;->ᛸᛸᛷᛱ:Z

    .line 18
    .line 19
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ()V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public final ᛲᛳᛴᛸ(Lyyds/ᲁᛱᛶᛲ;Lyyds/ᛴᛲᛲᛷ;)V
    .locals 10

    .line 1
    invoke-static {p1}, Lyyds/ᛲᛳᲁ;->ᲀᛲᛳᲀ(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛸᛸᛷᛱ:Z

    .line 5
    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    new-instance v2, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v5, p0, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ:Lyyds/ᛷᛵᛸᲇ;

    .line 14
    .line 15
    iget-object v6, p2, Lyyds/ᛴᛲᛲᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲀᲈ;

    .line 16
    .line 17
    iget v7, p2, Lyyds/ᛴᛲᛲᛷ;->ᛷᲈᲈᲁ:I

    .line 18
    .line 19
    iget v8, p2, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ:I

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    move-object v1, p0

    .line 23
    move-object v3, p1

    .line 24
    move-object v9, p2

    .line 25
    invoke-virtual/range {v1 .. v9}, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᲈᛴ(Ljava/lang/Object;Lyyds/ᲁᛱᛶᛲ;Lyyds/ᛱᛵᲁᲀ;Lyyds/ᛷᛵᛸᲇ;Lyyds/ᛲᛲᲀᲈ;IILyyds/ᛴᛲᛲᛷ;)Lyyds/ᛸᛷᛷᛸ;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {v3}, Lyyds/ᲁᛱᛶᛲ;->ᛶᛷᛲᲁ()Lyyds/ᛸᛷᛷᛸ;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p0, p1}, Lyyds/ᛸᛷᛷᛸ;->ᛱᲈᲁ(Lyyds/ᛸᛷᛷᛸ;)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_2

    .line 38
    .line 39
    iget-boolean p2, v9, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ:Z

    .line 40
    .line 41
    if-nez p2, :cond_0

    .line 42
    .line 43
    invoke-interface {p1}, Lyyds/ᛸᛷᛷᛸ;->ᛲᛳᛶᲁ()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const-string p0, "Argument must not be null"

    .line 51
    .line 52
    invoke-static {p1, p0}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p1}, Lyyds/ᛸᛷᛷᛸ;->isRunning()Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_1

    .line 60
    .line 61
    invoke-interface {p1}, Lyyds/ᛸᛷᛷᛸ;->ᛶᛷᛲᲁ()V

    .line 62
    .line 63
    .line 64
    :cond_1
    return-void

    .line 65
    :cond_2
    :goto_0
    iget-object p1, v1, Lyyds/ᛲᲇᛸᛲ;->ᛶᲈᛴᲈ:Lyyds/ᲁᛷᛲ;

    .line 66
    .line 67
    invoke-virtual {p1, v3}, Lyyds/ᲁᛷᛲ;->ᛷᛵᲇᲀ(Lyyds/ᲁᛱᛶᛲ;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v3, p0}, Lyyds/ᲁᛱᛶᛲ;->ᛲᛳᛶᲁ(Lyyds/ᛸᛷᛷᛸ;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, v1, Lyyds/ᛲᲇᛸᛲ;->ᛶᲈᛴᲈ:Lyyds/ᲁᛷᛲ;

    .line 74
    .line 75
    monitor-enter p1

    .line 76
    :try_start_0
    iget-object p2, p1, Lyyds/ᲁᛷᛲ;->ᛱᲈᲁ:Lyyds/ᲈᛵᛱᛲ;

    .line 77
    .line 78
    iget-object p2, p2, Lyyds/ᲈᛵᛱᛲ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 79
    .line 80
    invoke-interface {p2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    iget-object p2, p1, Lyyds/ᲁᛷᛲ;->ᲇᲇᲇᛱ:Lyyds/ᛶᲁᛲᲈ;

    .line 84
    .line 85
    const-string v0, "RequestTracker"

    .line 86
    .line 87
    iget-object v1, p2, Lyyds/ᛶᲁᛲᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v1, Ljava/util/Set;

    .line 90
    .line 91
    invoke-interface {v1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    iget-boolean v1, p2, Lyyds/ᛶᲁᛲᲈ;->ᲇᲈᛵᛷ:Z

    .line 95
    .line 96
    if-nez v1, :cond_3

    .line 97
    .line 98
    invoke-interface {p0}, Lyyds/ᛸᛷᛷᛸ;->ᛶᛷᛲᲁ()V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    invoke-interface {p0}, Lyyds/ᛸᛷᛷᛸ;->clear()V

    .line 103
    .line 104
    .line 105
    const/4 v1, 0x2

    .line 106
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_4

    .line 111
    .line 112
    const-string v1, "Paused, delaying request"

    .line 113
    .line 114
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    :cond_4
    iget-object p2, p2, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p2, Ljava/util/HashSet;

    .line 120
    .line 121
    invoke-virtual {p2, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    .line 124
    :goto_1
    monitor-exit p1

    .line 125
    return-void

    .line 126
    :catchall_0
    move-exception v0

    .line 127
    move-object p0, v0

    .line 128
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    throw p0

    .line 130
    :cond_5
    const-string p0, "You must call #load() before calling #into()"

    .line 131
    .line 132
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public final ᛲᛶᛱᲈ()Lyyds/ᛲᲇᛸᛲ;
    .locals 2

    .line 1
    invoke-super {p0}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lyyds/ᛲᲇᛸᛲ;

    .line 6
    .line 7
    iget-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ:Lyyds/ᛷᛵᛸᲇ;

    .line 8
    .line 9
    invoke-virtual {v0}, Lyyds/ᛷᛵᛸᲇ;->ᛲᲈᲁ()Lyyds/ᛷᛵᛸᲇ;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ:Lyyds/ᛷᛵᛸᲇ;

    .line 14
    .line 15
    iget-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᛵᛸ:Ljava/util/ArrayList;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v1, p0, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᛵᛸ:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᛵᛸ:Ljava/util/ArrayList;

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛲᛳᛴᛸ:Lyyds/ᛲᲇᛸᛲ;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ()Lyyds/ᛲᲇᛸᛲ;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛲᛳᛴᛸ:Lyyds/ᛲᲇᛸᛲ;

    .line 37
    .line 38
    :cond_1
    iget-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛲᲇᛸᛲ;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ()Lyyds/ᛲᲇᛸᛲ;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛲᲇᛸᛲ;

    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public final bridge synthetic ᛲᲈᲁ(Lyyds/ᛴᛲᛲᛷ;)Lyyds/ᛴᛲᛲᛷ;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᛲᲇᛸᛲ;->ᛶᛸᲀᲁ(Lyyds/ᛴᛲᛲᛷ;)Lyyds/ᛲᲇᛸᛲ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final ᛵᲀᛵᛸ(Landroid/widget/ImageView;)V
    .locals 4

    .line 1
    invoke-static {}, Lyyds/ᛱᛷᲈᛲ;->ᛲᲈᲁ()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lyyds/ᛲᛳᲁ;->ᲀᛲᛳᲀ(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0x800

    .line 8
    .line 9
    iget v1, p0, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 10
    .line 11
    invoke-static {v1, v0}, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ(II)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    sget-object v0, Lyyds/ᲁᛶᛸᛶ;->ᛲᲈᲁ:[I

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    aget v0, v0, v2

    .line 35
    .line 36
    packed-switch v0, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_0
    invoke-virtual {p0}, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ()Lyyds/ᛲᲇᛸᛲ;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v2, Lyyds/ᛶᛱᛸᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛱᛸᛳ;

    .line 45
    .line 46
    new-instance v3, Lyyds/ᛸᛲᲇᛱ;

    .line 47
    .line 48
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2, v3}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ(Lyyds/ᛶᛱᛸᛳ;Lyyds/ᲀᲈᛷ;)Lyyds/ᛴᛲᛲᛷ;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-boolean v1, v0, Lyyds/ᛴᛲᛲᛷ;->ᛵᛶᛲᲀ:Z

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :pswitch_1
    invoke-virtual {p0}, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ()Lyyds/ᛲᲇᛸᛲ;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v2, Lyyds/ᛶᛱᛸᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛶᛱᛸᛳ;

    .line 63
    .line 64
    new-instance v3, Lyyds/ᛳᛳᛷᛷ;

    .line 65
    .line 66
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2, v3}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ(Lyyds/ᛶᛱᛸᛳ;Lyyds/ᲀᲈᛷ;)Lyyds/ᛴᛲᛲᛷ;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-boolean v1, v0, Lyyds/ᛴᛲᛲᛷ;->ᛵᛶᛲᲀ:Z

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :pswitch_2
    invoke-virtual {p0}, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ()Lyyds/ᛲᲇᛸᛲ;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sget-object v2, Lyyds/ᛶᛱᛸᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛱᛸᛳ;

    .line 81
    .line 82
    new-instance v3, Lyyds/ᛸᛲᲇᛱ;

    .line 83
    .line 84
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v2, v3}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ(Lyyds/ᛶᛱᛸᛳ;Lyyds/ᲀᲈᛷ;)Lyyds/ᛴᛲᛲᛷ;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-boolean v1, v0, Lyyds/ᛴᛲᛲᛷ;->ᛵᛶᛲᲀ:Z

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :pswitch_3
    invoke-virtual {p0}, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ()Lyyds/ᛲᲇᛸᛲ;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sget-object v2, Lyyds/ᛶᛱᛸᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛶᛱᛸᛳ;

    .line 99
    .line 100
    new-instance v3, Lyyds/ᛳᲀᛳᛳ;

    .line 101
    .line 102
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v2, v3}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ(Lyyds/ᛶᛱᛸᛳ;Lyyds/ᲀᲈᛷ;)Lyyds/ᛴᛲᛲᛷ;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    goto :goto_1

    .line 110
    :cond_0
    :goto_0
    move-object v0, p0

    .line 111
    :goto_1
    iget-object v2, p0, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᲈᛴ:Lyyds/ᲇᲈᲁᛷ;

    .line 112
    .line 113
    iget-object v2, v2, Lyyds/ᲇᲈᲁᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛵᲈᲁ;

    .line 114
    .line 115
    const-class v2, Landroid/graphics/Bitmap;

    .line 116
    .line 117
    iget-object v3, p0, Lyyds/ᛲᲇᛸᛲ;->ᛶᛸᲀᲁ:Ljava/lang/Class;

    .line 118
    .line 119
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_1

    .line 124
    .line 125
    new-instance v1, Lyyds/ᛵᛷᛷᛳ;

    .line 126
    .line 127
    const/4 v2, 0x0

    .line 128
    invoke-direct {v1, p1, v2}, Lyyds/ᛵᛷᛷᛳ;-><init>(Landroid/widget/ImageView;I)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_1
    const-class v2, Landroid/graphics/drawable/Drawable;

    .line 133
    .line 134
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-eqz v2, :cond_2

    .line 139
    .line 140
    new-instance v2, Lyyds/ᛵᛷᛷᛳ;

    .line 141
    .line 142
    invoke-direct {v2, p1, v1}, Lyyds/ᛵᛷᛷᛳ;-><init>(Landroid/widget/ImageView;I)V

    .line 143
    .line 144
    .line 145
    move-object v1, v2

    .line 146
    :goto_2
    invoke-virtual {p0, v1, v0}, Lyyds/ᛲᲇᛸᛲ;->ᛲᛳᛴᛸ(Lyyds/ᲁᛱᛶᛲ;Lyyds/ᛴᛲᛲᛷ;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_2
    const-string p0, "Unhandled class: "

    .line 151
    .line 152
    const-string p1, ", try .as*(Class).transcode(ResourceTranscoder)"

    .line 153
    .line 154
    invoke-static {v3, p0, p1}, Lyyds/ᛷᲈᲈᛶ;->ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛵᲀᲈᛴ(Ljava/lang/Object;Lyyds/ᲁᛱᛶᛲ;Lyyds/ᛱᛵᲁᲀ;Lyyds/ᛷᛵᛸᲇ;Lyyds/ᛲᛲᲀᲈ;IILyyds/ᛴᛲᛲᛷ;)Lyyds/ᛸᛷᛷᛸ;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move-object/from16 v7, p8

    .line 6
    .line 7
    iget-object v1, v0, Lyyds/ᛲᲇᛸᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛲᲇᛸᛲ;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lyyds/ᛴᛱᲀᛲ;

    .line 13
    .line 14
    move-object/from16 v3, p3

    .line 15
    .line 16
    invoke-direct {v1, v4, v3}, Lyyds/ᛴᛱᲀᛲ;-><init>(Ljava/lang/Object;Lyyds/ᛱᛵᲁᲀ;)V

    .line 17
    .line 18
    .line 19
    move-object v13, v1

    .line 20
    move-object v15, v13

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object/from16 v3, p3

    .line 23
    .line 24
    move-object v15, v2

    .line 25
    move-object v13, v3

    .line 26
    :goto_0
    iget-object v1, v0, Lyyds/ᛲᲇᛸᛲ;->ᛲᛳᛴᛸ:Lyyds/ᛲᲇᛸᛲ;

    .line 27
    .line 28
    if-eqz v1, :cond_8

    .line 29
    .line 30
    iget-boolean v3, v0, Lyyds/ᛲᲇᛸᛲ;->ᲀᛲᛱᛱ:Z

    .line 31
    .line 32
    if-nez v3, :cond_7

    .line 33
    .line 34
    iget-object v3, v1, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ:Lyyds/ᛷᛵᛸᲇ;

    .line 35
    .line 36
    iget-boolean v5, v1, Lyyds/ᛲᲇᛸᛲ;->ᛱᛳᛶᛳ:Z

    .line 37
    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    move-object/from16 v16, p4

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object/from16 v16, v3

    .line 44
    .line 45
    :goto_1
    const/16 v3, 0x8

    .line 46
    .line 47
    iget v1, v1, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ:I

    .line 48
    .line 49
    invoke-static {v1, v3}, Lyyds/ᛴᛲᛲᛷ;->ᛱᲈᲁ(II)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const/4 v3, 0x1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    iget-object v1, v0, Lyyds/ᛲᲇᛸᛲ;->ᛲᛳᛴᛸ:Lyyds/ᛲᲇᛸᛲ;

    .line 57
    .line 58
    iget-object v1, v1, Lyyds/ᛴᛲᛲᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲀᲈ;

    .line 59
    .line 60
    :goto_2
    move-object/from16 v17, v1

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_2
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Enum;->ordinal()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_5

    .line 68
    .line 69
    if-eq v1, v3, :cond_5

    .line 70
    .line 71
    const/4 v5, 0x2

    .line 72
    if-eq v1, v5, :cond_4

    .line 73
    .line 74
    const/4 v5, 0x3

    .line 75
    if-ne v1, v5, :cond_3

    .line 76
    .line 77
    sget-object v1, Lyyds/ᛲᛲᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲀᲈ;

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    const-string v1, "unknown priority: "

    .line 81
    .line 82
    iget-object v0, v0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲀᲈ;

    .line 83
    .line 84
    invoke-static {v0, v1}, Lyyds/ᛷᲈᲈᛶ;->ᛲᛴᛳᛲ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-object v2

    .line 88
    :cond_4
    sget-object v1, Lyyds/ᛲᛲᲀᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛲᛲᲀᲈ;

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_5
    sget-object v1, Lyyds/ᛲᛲᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛲᲀᲈ;

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :goto_3
    iget-object v1, v0, Lyyds/ᛲᲇᛸᛲ;->ᛲᛳᛴᛸ:Lyyds/ᛲᲇᛸᛲ;

    .line 95
    .line 96
    iget v2, v1, Lyyds/ᛴᛲᛲᛷ;->ᛷᲈᲈᲁ:I

    .line 97
    .line 98
    iget v1, v1, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ:I

    .line 99
    .line 100
    invoke-static/range {p6 .. p7}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛵᲇᲀ(II)Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_6

    .line 105
    .line 106
    iget-object v5, v0, Lyyds/ᛲᲇᛸᛲ;->ᛲᛳᛴᛸ:Lyyds/ᛲᲇᛸᛲ;

    .line 107
    .line 108
    iget v6, v5, Lyyds/ᛴᛲᛲᛷ;->ᛷᲈᲈᲁ:I

    .line 109
    .line 110
    iget v5, v5, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ:I

    .line 111
    .line 112
    invoke-static {v6, v5}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛵᲇᲀ(II)Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-nez v5, :cond_6

    .line 117
    .line 118
    iget v2, v7, Lyyds/ᛴᛲᛲᛷ;->ᛷᲈᲈᲁ:I

    .line 119
    .line 120
    iget v1, v7, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ:I

    .line 121
    .line 122
    :cond_6
    move/from16 v18, v1

    .line 123
    .line 124
    move/from16 v19, v2

    .line 125
    .line 126
    new-instance v1, Lyyds/ᛱᛲᛲᲇ;

    .line 127
    .line 128
    invoke-direct {v1, v4, v13}, Lyyds/ᛱᛲᛲᲇ;-><init>(Ljava/lang/Object;Lyyds/ᛱᛵᲁᲀ;)V

    .line 129
    .line 130
    .line 131
    iget-object v2, v0, Lyyds/ᛲᲇᛸᛲ;->ᛳᛸᛴᛶ:Landroid/content/Context;

    .line 132
    .line 133
    move v5, v3

    .line 134
    iget-object v3, v0, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᲈᛴ:Lyyds/ᲇᲈᲁᛷ;

    .line 135
    .line 136
    move v6, v5

    .line 137
    iget-object v5, v0, Lyyds/ᛲᲇᛸᛲ;->ᲈᲀᛲᲀ:Ljava/lang/Object;

    .line 138
    .line 139
    move v8, v6

    .line 140
    iget-object v6, v0, Lyyds/ᛲᲇᛸᛲ;->ᛶᛸᲀᲁ:Ljava/lang/Class;

    .line 141
    .line 142
    iget-object v12, v0, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᛵᛸ:Ljava/util/ArrayList;

    .line 143
    .line 144
    iget-object v14, v3, Lyyds/ᲇᲈᲁᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᛳᛳᛵ;

    .line 145
    .line 146
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-object v13, v1

    .line 150
    new-instance v1, Lyyds/ᛲᛷᛶᛸ;

    .line 151
    .line 152
    move-object/from16 v11, p2

    .line 153
    .line 154
    move-object/from16 v10, p5

    .line 155
    .line 156
    move/from16 v9, p7

    .line 157
    .line 158
    move-object/from16 p3, v15

    .line 159
    .line 160
    move v15, v8

    .line 161
    move/from16 v8, p6

    .line 162
    .line 163
    invoke-direct/range {v1 .. v14}, Lyyds/ᛲᛷᛶᛸ;-><init>(Landroid/content/Context;Lyyds/ᲇᲈᲁᛷ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Lyyds/ᛴᛲᛲᛷ;IILyyds/ᛲᛲᲀᲈ;Lyyds/ᲁᛱᛶᛲ;Ljava/util/ArrayList;Lyyds/ᛱᛵᲁᲀ;Lyyds/ᲈᛳᛳᛵ;)V

    .line 164
    .line 165
    .line 166
    move-object v10, v1

    .line 167
    iput-boolean v15, v0, Lyyds/ᛲᲇᛸᛲ;->ᲀᛲᛱᛱ:Z

    .line 168
    .line 169
    iget-object v1, v0, Lyyds/ᛲᲇᛸᛲ;->ᛲᛳᛴᛸ:Lyyds/ᛲᲇᛸᛲ;

    .line 170
    .line 171
    move-object v9, v1

    .line 172
    move-object/from16 v2, p1

    .line 173
    .line 174
    move-object/from16 v3, p2

    .line 175
    .line 176
    move-object v4, v13

    .line 177
    move-object/from16 v5, v16

    .line 178
    .line 179
    move-object/from16 v6, v17

    .line 180
    .line 181
    move/from16 v8, v18

    .line 182
    .line 183
    move/from16 v7, v19

    .line 184
    .line 185
    invoke-virtual/range {v1 .. v9}, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᲈᛴ(Ljava/lang/Object;Lyyds/ᲁᛱᛶᛲ;Lyyds/ᛱᛵᲁᲀ;Lyyds/ᛷᛵᛸᲇ;Lyyds/ᛲᛲᲀᲈ;IILyyds/ᛴᛲᛲᛷ;)Lyyds/ᛸᛷᛷᛸ;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    const/4 v2, 0x0

    .line 190
    iput-boolean v2, v0, Lyyds/ᛲᲇᛸᛲ;->ᲀᛲᛱᛱ:Z

    .line 191
    .line 192
    iput-object v10, v13, Lyyds/ᛱᛲᛲᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛷᛶᛸ;

    .line 193
    .line 194
    iput-object v1, v13, Lyyds/ᛱᛲᛲᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛷᛸ;

    .line 195
    .line 196
    move-object/from16 v7, p8

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_7
    const-string v0, "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"

    .line 200
    .line 201
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    return-object v2

    .line 205
    :cond_8
    move-object/from16 p3, v15

    .line 206
    .line 207
    iget-object v2, v0, Lyyds/ᛲᲇᛸᛲ;->ᛳᛸᛴᛶ:Landroid/content/Context;

    .line 208
    .line 209
    iget-object v3, v0, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᲈᛴ:Lyyds/ᲇᲈᲁᛷ;

    .line 210
    .line 211
    iget-object v5, v0, Lyyds/ᛲᲇᛸᛲ;->ᲈᲀᛲᲀ:Ljava/lang/Object;

    .line 212
    .line 213
    iget-object v6, v0, Lyyds/ᛲᲇᛸᛲ;->ᛶᛸᲀᲁ:Ljava/lang/Class;

    .line 214
    .line 215
    iget-object v12, v0, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᛵᛸ:Ljava/util/ArrayList;

    .line 216
    .line 217
    iget-object v14, v3, Lyyds/ᲇᲈᲁᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᛳᛳᛵ;

    .line 218
    .line 219
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    new-instance v1, Lyyds/ᛲᛷᛶᛸ;

    .line 223
    .line 224
    move-object/from16 v4, p1

    .line 225
    .line 226
    move-object/from16 v11, p2

    .line 227
    .line 228
    move-object/from16 v10, p5

    .line 229
    .line 230
    move/from16 v8, p6

    .line 231
    .line 232
    move/from16 v9, p7

    .line 233
    .line 234
    move-object/from16 v7, p8

    .line 235
    .line 236
    invoke-direct/range {v1 .. v14}, Lyyds/ᛲᛷᛶᛸ;-><init>(Landroid/content/Context;Lyyds/ᲇᲈᲁᛷ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Lyyds/ᛴᛲᛲᛷ;IILyyds/ᛲᛲᲀᲈ;Lyyds/ᲁᛱᛶᛲ;Ljava/util/ArrayList;Lyyds/ᛱᛵᲁᲀ;Lyyds/ᲈᛳᛳᛵ;)V

    .line 237
    .line 238
    .line 239
    move-object v13, v1

    .line 240
    :goto_4
    if-nez p3, :cond_9

    .line 241
    .line 242
    return-object v13

    .line 243
    :cond_9
    iget-object v1, v0, Lyyds/ᛲᲇᛸᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛲᲇᛸᛲ;

    .line 244
    .line 245
    iget v2, v1, Lyyds/ᛴᛲᛲᛷ;->ᛷᲈᲈᲁ:I

    .line 246
    .line 247
    iget v1, v1, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ:I

    .line 248
    .line 249
    invoke-static/range {p6 .. p7}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛵᲇᲀ(II)Z

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    if-eqz v3, :cond_a

    .line 254
    .line 255
    iget-object v3, v0, Lyyds/ᛲᲇᛸᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛲᲇᛸᛲ;

    .line 256
    .line 257
    iget v4, v3, Lyyds/ᛴᛲᛲᛷ;->ᛷᲈᲈᲁ:I

    .line 258
    .line 259
    iget v3, v3, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ:I

    .line 260
    .line 261
    invoke-static {v4, v3}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛵᲇᲀ(II)Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-nez v3, :cond_a

    .line 266
    .line 267
    iget v2, v7, Lyyds/ᛴᛲᛲᛷ;->ᛷᲈᲈᲁ:I

    .line 268
    .line 269
    iget v1, v7, Lyyds/ᛴᛲᛲᛷ;->ᛲᛳᛶᲁ:I

    .line 270
    .line 271
    :cond_a
    move v7, v1

    .line 272
    move v6, v2

    .line 273
    iget-object v0, v0, Lyyds/ᛲᲇᛸᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛲᲇᛸᛲ;

    .line 274
    .line 275
    iget-object v4, v0, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ:Lyyds/ᛷᛵᛸᲇ;

    .line 276
    .line 277
    iget-object v5, v0, Lyyds/ᛴᛲᛲᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲀᲈ;

    .line 278
    .line 279
    move-object v8, v0

    .line 280
    move-object/from16 v1, p1

    .line 281
    .line 282
    move-object/from16 v2, p2

    .line 283
    .line 284
    move-object/from16 v3, p3

    .line 285
    .line 286
    invoke-virtual/range {v0 .. v8}, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᲈᛴ(Ljava/lang/Object;Lyyds/ᲁᛱᛶᛲ;Lyyds/ᛱᛵᲁᲀ;Lyyds/ᛷᛵᛸᲇ;Lyyds/ᛲᛲᲀᲈ;IILyyds/ᛴᛲᛲᛷ;)Lyyds/ᛸᛷᛷᛸ;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    iput-object v13, v3, Lyyds/ᛴᛱᲀᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛷᛷᛸ;

    .line 291
    .line 292
    iput-object v0, v3, Lyyds/ᛴᛱᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛷᛸ;

    .line 293
    .line 294
    return-object v3
.end method

.method public final ᛶᛸᲀᲁ(Lyyds/ᛴᛲᛲᛷ;)Lyyds/ᛲᲇᛸᛲ;
    .locals 0

    .line 1
    invoke-static {p1}, Lyyds/ᛲᛳᲁ;->ᲀᛲᛳᲀ(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Lyyds/ᛴᛲᛲᛷ;->ᛲᲈᲁ(Lyyds/ᛴᛲᛲᛷ;)Lyyds/ᛴᛲᛲᛷ;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lyyds/ᛲᲇᛸᛲ;

    .line 9
    .line 10
    return-object p0
.end method

.method public final ᛶᲈᛴᲈ(Lyyds/ᛳᛶᛳᛳ;)Lyyds/ᛲᲇᛸᛲ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ()Lyyds/ᛲᲇᛸᛲ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Lyyds/ᛲᲇᛸᛲ;->ᛶᲈᛴᲈ(Lyyds/ᛳᛶᛳᛳ;)Lyyds/ᛲᲇᛸᛲ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    if-eqz p1, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᛵᛸ:Ljava/util/ArrayList;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᛵᛸ:Ljava/util/ArrayList;

    .line 26
    .line 27
    :cond_1
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    :cond_2
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ()V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method public final ᛷᛸᲇᛶ(Lyyds/ᛳᛶᛳᛳ;)Lyyds/ᛲᲇᛸᛲ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ()Lyyds/ᛲᲇᛸᛲ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Lyyds/ᛲᲇᛸᛲ;->ᛷᛸᲇᛶ(Lyyds/ᛳᛶᛳᛳ;)Lyyds/ᛲᲇᛸᛲ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᛵᛸ:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lyyds/ᛲᲇᛸᛲ;->ᛶᲈᛴᲈ(Lyyds/ᛳᛶᛳᛳ;)Lyyds/ᛲᲇᛸᛲ;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final bridge synthetic ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ()Lyyds/ᛲᲇᛸᛲ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final ᲈᲀᛲᲀ(Lyyds/ᛲᲇᛸᛲ;)Lyyds/ᛲᲇᛸᛲ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛲᲇᛸᛲ;->ᛲᛶᛱᲈ()Lyyds/ᛲᲇᛸᛲ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Lyyds/ᛲᲇᛸᛲ;->ᲈᲀᛲᲀ(Lyyds/ᛲᲇᛸᛲ;)Lyyds/ᛲᲇᛸᛲ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput-object p1, p0, Lyyds/ᛲᲇᛸᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛲᲇᛸᛲ;

    .line 15
    .line 16
    invoke-virtual {p0}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛲᲈᲈ()V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method
