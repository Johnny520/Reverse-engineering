.class public final Lyyds/ᲁᛶᲇᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:I

.field public final ᛲᲈᲁ:Lyyds/ᲀᲈᛶᲈ;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛵᛴᛶᛶ;

.field public final ᲀᛲᛳᲀ:Ljava/util/HashMap;

.field public ᲇᲇᲇᛱ:I

.field public final ᲇᲈᛵᛷ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᲀᲈᛶᲈ;

    .line 5
    .line 6
    const/16 v1, 0x1b

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lyyds/ᲀᲈᛶᲈ;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lyyds/ᲁᛶᲇᛱ;->ᛲᲈᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 12
    .line 13
    new-instance v0, Lyyds/ᛵᛴᛶᛶ;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, Lyyds/ᛵᛴᛶᛶ;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lyyds/ᲁᛶᲇᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛵᛴᛶᛶ;

    .line 20
    .line 21
    new-instance v0, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lyyds/ᲁᛶᲇᛱ;->ᲀᛲᛳᲀ:Ljava/util/HashMap;

    .line 27
    .line 28
    new-instance v0, Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lyyds/ᲁᛶᲇᛱ;->ᲇᲈᛵᛷ:Ljava/util/HashMap;

    .line 34
    .line 35
    iput p1, p0, Lyyds/ᲁᛶᲇᛱ;->ᛲᛴᛳᛲ:I

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(Lyyds/ᛲᛳᛳᲈ;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-virtual {p0, p2}, Lyyds/ᲁᛶᲇᛱ;->ᲇᲈᛵᛷ(Ljava/lang/Class;)Lyyds/ᲁᛱᛸᛴ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lyyds/ᲁᛶᲇᛱ;->ᛲᲈᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Lyyds/ᲀᲈᛶᲈ;->ᛷᛲᲈᛱ(Lyyds/ᛷᛲᛴᛳ;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget v2, p0, Lyyds/ᲁᛶᲇᛱ;->ᲇᲇᲇᛱ:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lyyds/ᲁᛱᛸᛴ;->ᛲᲈᲁ(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v0}, Lyyds/ᲁᛱᛸᛴ;->ᛵᛸᛸᛷ()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    mul-int/2addr v4, v3

    .line 24
    sub-int/2addr v2, v4

    .line 25
    iput v2, p0, Lyyds/ᲁᛶᲇᛱ;->ᲇᲇᲇᛱ:I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lyyds/ᲁᛱᛸᛴ;->ᛲᲈᲁ(Ljava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {p0, p2, v2}, Lyyds/ᲁᛶᲇᛱ;->ᛲᲈᲁ(Ljava/lang/Class;I)V

    .line 32
    .line 33
    .line 34
    :cond_0
    if-nez v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0}, Lyyds/ᲁᛱᛸᛴ;->ᲀᛲᛳᲀ()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const/4 p2, 0x2

    .line 41
    invoke-static {p0, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0}, Lyyds/ᲁᛱᛸᛴ;->ᲀᛲᛳᲀ()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    new-instance p2, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v1, "Allocated "

    .line 54
    .line 55
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget v1, p1, Lyyds/ᛲᛳᛳᲈ;->ᛵᛸᛸᛷ:I

    .line 59
    .line 60
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, " bytes"

    .line 64
    .line 65
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-static {p0, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    :cond_1
    iget p0, p1, Lyyds/ᛲᛳᛳᲈ;->ᛵᛸᛸᛷ:I

    .line 76
    .line 77
    iget p1, v0, Lyyds/ᲁᛱᛸᛴ;->ᛲᲈᲁ:I

    .line 78
    .line 79
    packed-switch p1, :pswitch_data_0

    .line 80
    .line 81
    .line 82
    new-array p0, p0, [I

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :pswitch_0
    new-array p0, p0, [B

    .line 86
    .line 87
    :goto_0
    return-object p0

    .line 88
    :cond_2
    return-object v1

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛲᲈᲁ(Ljava/lang/Class;I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᲁᛶᲇᛱ;->ᲇᲇᲇᛱ(Ljava/lang/Class;)Ljava/util/NavigableMap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    const/4 v1, 0x1

    .line 22
    if-ne p0, v1, :cond_0

    .line 23
    .line 24
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    sub-int/2addr p2, v1

    .line 41
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-interface {p1, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 50
    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v1, "Tried to decrement empty size, size: "

    .line 54
    .line 55
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p2, ", this: "

    .line 62
    .line 63
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-direct {p1, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1
.end method

.method public final ᛵᛸᛸᛷ(I)V
    .locals 5

    .line 1
    :cond_0
    :goto_0
    iget v0, p0, Lyyds/ᲁᛶᲇᛱ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    if-le v0, p1, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᲁᛶᲇᛱ;->ᛲᲈᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 6
    .line 7
    invoke-virtual {v0}, Lyyds/ᲀᲈᛶᲈ;->ᲀᛴᲁᲈ()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lyyds/ᛲᛳᲁ;->ᲀᛲᛳᲀ(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0, v1}, Lyyds/ᲁᛶᲇᛱ;->ᲇᲈᛵᛷ(Ljava/lang/Class;)Lyyds/ᲁᛱᛸᛴ;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget v2, p0, Lyyds/ᲁᛶᲇᛱ;->ᲇᲇᲇᛱ:I

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lyyds/ᲁᛱᛸᛴ;->ᛲᲈᲁ(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v1}, Lyyds/ᲁᛱᛸᛴ;->ᛵᛸᛸᛷ()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    mul-int/2addr v4, v3

    .line 33
    sub-int/2addr v2, v4

    .line 34
    iput v2, p0, Lyyds/ᲁᛶᲇᛱ;->ᲇᲇᲇᛱ:I

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Lyyds/ᲁᛱᛸᛴ;->ᛲᲈᲁ(Ljava/lang/Object;)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {p0, v3, v2}, Lyyds/ᲁᛶᲇᛱ;->ᛲᲈᲁ(Ljava/lang/Class;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Lyyds/ᲁᛱᛸᛴ;->ᲀᛲᛳᲀ()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const/4 v3, 0x2

    .line 52
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    invoke-virtual {v1}, Lyyds/ᲁᛱᛸᛴ;->ᲀᛲᛳᲀ()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    new-instance v3, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v4, "evicted: "

    .line 65
    .line 66
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v0}, Lyyds/ᲁᛱᛸᛴ;->ᛲᲈᲁ(Ljava/lang/Object;)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    return-void
.end method

.method public final declared-synchronized ᛶᛷᛲᲁ(Ljava/lang/Object;)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {p0, v0}, Lyyds/ᲁᛶᲇᛱ;->ᲇᲈᛵᛷ(Ljava/lang/Class;)Lyyds/ᲁᛱᛸᛴ;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1, p1}, Lyyds/ᲁᛱᛸᛴ;->ᛲᲈᲁ(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {v1}, Lyyds/ᲁᛱᛸᛴ;->ᛵᛸᛸᛷ()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    mul-int/2addr v1, v2

    .line 19
    iget v3, p0, Lyyds/ᲁᛶᲇᛱ;->ᛲᛴᛳᛲ:I

    .line 20
    .line 21
    div-int/lit8 v3, v3, 0x2

    .line 22
    .line 23
    if-gt v1, v3, :cond_2

    .line 24
    .line 25
    iget-object v3, p0, Lyyds/ᲁᛶᲇᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛵᛴᛶᛶ;

    .line 26
    .line 27
    iget-object v4, v3, Lyyds/ᛳᲇᛸᲁ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Ljava/util/ArrayDeque;

    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Lyyds/ᛷᛲᛴᛳ;

    .line 36
    .line 37
    if-nez v4, :cond_0

    .line 38
    .line 39
    invoke-virtual {v3}, Lyyds/ᛵᛴᛶᛶ;->ᛵᛸᛸᛷ()Lyyds/ᛷᛲᛴᛳ;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    :cond_0
    check-cast v4, Lyyds/ᛲᛳᛳᲈ;

    .line 44
    .line 45
    iput v2, v4, Lyyds/ᛲᛳᛳᲈ;->ᛵᛸᛸᛷ:I

    .line 46
    .line 47
    iput-object v0, v4, Lyyds/ᛲᛳᛳᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Class;

    .line 48
    .line 49
    iget-object v2, p0, Lyyds/ᲁᛶᲇᛱ;->ᛲᲈᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 50
    .line 51
    invoke-virtual {v2, v4, p1}, Lyyds/ᲀᲈᛶᲈ;->ᛷᛸᲇᛶ(Lyyds/ᛷᛲᛴᛳ;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lyyds/ᲁᛶᲇᛱ;->ᲇᲇᲇᛱ(Ljava/lang/Class;)Ljava/util/NavigableMap;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget v0, v4, Lyyds/ᛲᛳᛳᲈ;->ᛵᛸᛸᛷ:I

    .line 59
    .line 60
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Ljava/lang/Integer;

    .line 69
    .line 70
    iget v2, v4, Lyyds/ᛲᛳᛳᲈ;->ᛵᛸᛸᛷ:I

    .line 71
    .line 72
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const/4 v3, 0x1

    .line 77
    if-nez v0, :cond_1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    add-int/2addr v3, v0

    .line 85
    :goto_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-interface {p1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    iget p1, p0, Lyyds/ᲁᛶᲇᛱ;->ᲇᲇᲇᛱ:I

    .line 93
    .line 94
    add-int/2addr p1, v1

    .line 95
    iput p1, p0, Lyyds/ᲁᛶᲇᛱ;->ᲇᲇᲇᛱ:I

    .line 96
    .line 97
    iget p1, p0, Lyyds/ᲁᛶᲇᛱ;->ᛲᛴᛳᛲ:I

    .line 98
    .line 99
    invoke-virtual {p0, p1}, Lyyds/ᲁᛶᲇᛱ;->ᛵᛸᛸᛷ(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    .line 102
    monitor-exit p0

    .line 103
    return-void

    .line 104
    :catchall_0
    move-exception p1

    .line 105
    goto :goto_1

    .line 106
    :cond_2
    monitor-exit p0

    .line 107
    return-void

    .line 108
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    throw p1
.end method

.method public final declared-synchronized ᲀᛲᛳᲀ(Ljava/lang/Class;I)Ljava/lang/Object;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Lyyds/ᲁᛶᲇᛱ;->ᲇᲇᲇᛱ(Ljava/lang/Class;)Ljava/util/NavigableMap;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v0, v1}, Ljava/util/NavigableMap;->ceilingKey(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Integer;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget v1, p0, Lyyds/ᲁᛶᲇᛱ;->ᲇᲇᲇᛱ:I

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget v2, p0, Lyyds/ᲁᛶᲇᛱ;->ᛲᛴᛳᛲ:I

    .line 23
    .line 24
    div-int/2addr v2, v1

    .line 25
    const/4 v1, 0x2

    .line 26
    if-lt v2, v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    mul-int/lit8 v2, p2, 0x8

    .line 34
    .line 35
    if-gt v1, v2, :cond_2

    .line 36
    .line 37
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const/4 v1, 0x0

    .line 40
    :goto_1
    iget-object v2, p0, Lyyds/ᲁᛶᲇᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛵᛴᛶᛶ;

    .line 41
    .line 42
    if-eqz v1, :cond_4

    .line 43
    .line 44
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    iget-object v0, v2, Lyyds/ᛳᲇᛸᲁ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/util/ArrayDeque;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lyyds/ᛷᛲᛴᛳ;

    .line 57
    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    invoke-virtual {v2}, Lyyds/ᛵᛴᛶᛶ;->ᛵᛸᛸᛷ()Lyyds/ᛷᛲᛴᛳ;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :cond_3
    check-cast v0, Lyyds/ᛲᛳᛳᲈ;

    .line 65
    .line 66
    iput p2, v0, Lyyds/ᛲᛳᛳᲈ;->ᛵᛸᛸᛷ:I

    .line 67
    .line 68
    iput-object p1, v0, Lyyds/ᛲᛳᛳᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Class;

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    goto :goto_3

    .line 73
    :cond_4
    iget-object v0, v2, Lyyds/ᛳᲇᛸᲁ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Ljava/util/ArrayDeque;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lyyds/ᛷᛲᛴᛳ;

    .line 82
    .line 83
    if-nez v0, :cond_5

    .line 84
    .line 85
    invoke-virtual {v2}, Lyyds/ᛵᛴᛶᛶ;->ᛵᛸᛸᛷ()Lyyds/ᛷᛲᛴᛳ;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    :cond_5
    check-cast v0, Lyyds/ᛲᛳᛳᲈ;

    .line 90
    .line 91
    iput p2, v0, Lyyds/ᛲᛳᛳᲈ;->ᛵᛸᛸᛷ:I

    .line 92
    .line 93
    iput-object p1, v0, Lyyds/ᛲᛳᛳᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Class;

    .line 94
    .line 95
    :goto_2
    invoke-virtual {p0, v0, p1}, Lyyds/ᲁᛶᲇᛱ;->ᛲᛴᛳᛲ(Lyyds/ᛲᛳᛳᲈ;Ljava/lang/Class;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    monitor-exit p0

    .line 100
    return-object p1

    .line 101
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 102
    throw p1
.end method

.method public final ᲇᲇᲇᛱ(Ljava/lang/Class;)Ljava/util/NavigableMap;
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲁᛶᲇᛱ;->ᲀᛲᛳᲀ:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/NavigableMap;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/util/TreeMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public final ᲇᲈᛵᛷ(Ljava/lang/Class;)Lyyds/ᲁᛱᛸᛴ;
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᲁᛶᲇᛱ;->ᲇᲈᛵᛷ:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lyyds/ᲁᛱᛸᛴ;

    .line 8
    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    const-class v0, [I

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Lyyds/ᲁᛱᛸᛴ;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, v1}, Lyyds/ᲁᛱᛸᛴ;-><init>(I)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-class v0, [B

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    new-instance v0, Lyyds/ᲁᛱᛸᛴ;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {v0, v1}, Lyyds/ᲁᛱᛸᛴ;-><init>(I)V

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string p1, "No array pool found for: "

    .line 49
    .line 50
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0

    .line 59
    :cond_2
    return-object v0
.end method
