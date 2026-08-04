.class public final Lyyds/ᛳᲀᛸᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛷᛵᲇᲀ:[Ljava/lang/String;


# instance fields
.field public final ᛱᲈᲁ:Lyyds/ᛶᛳᛷᲇ;

.field public final ᛲᛳᛶᲁ:Lyyds/ᲀᛵᲁᛴ;

.field public final ᛲᛴᛳᛲ:Lyyds/ᲈᛳᲀᲈ;

.field public final ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase_Impl;

.field public final ᛵᛸᛸᛷ:Ljava/util/LinkedHashMap;

.field public final ᛶᛷᛲᲁ:[Ljava/lang/String;

.field public ᛷᛲᲈᛱ:Lyyds/ᲁᛶᲁᲀ;

.field public final ᛷᲈᲈᲁ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ᲀᛲᛳᲀ:Ljava/util/LinkedHashMap;

.field public final ᲇᲇᲇᛱ:Ljava/util/LinkedHashMap;

.field public final ᲇᲈᛵᛷ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "UPDATE"

    .line 2
    .line 3
    const-string v1, "DELETE"

    .line 4
    .line 5
    const-string v2, "INSERT"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lyyds/ᛳᲀᛸᛸ;->ᛷᛵᲇᲀ:[Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public native constructor <init>(Lcom/ss/android/ugc/awemes/WardDatabase_Impl;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;ZLyyds/ᲈᛳᲀᲈ;)V
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(Lyyds/ᲈᛶᛷᲀ;ILyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, Lyyds/ᛵᲁᛷᛲ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lyyds/ᛵᲁᛷᛲ;

    .line 7
    .line 8
    iget v1, v0, Lyyds/ᛵᲁᛷᛲ;->ᛲᛲᲈᲈ:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lyyds/ᛵᲁᛷᛲ;->ᛲᛲᲈᲈ:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lyyds/ᛵᲁᛷᛲ;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lyyds/ᛵᲁᛷᛲ;-><init>(Lyyds/ᛳᲀᛸᛸ;Lyyds/ᛶᛴᲀᛲ;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lyyds/ᛵᲁᛷᛲ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lyyds/ᛵᲁᛷᛲ;->ᛲᛲᲈᲈ:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget p0, v0, Lyyds/ᛵᲁᛷᛲ;->ᛷᲈᲈᲁ:I

    .line 35
    .line 36
    iget p1, v0, Lyyds/ᛵᲁᛷᛲ;->ᛲᛳᛶᲁ:I

    .line 37
    .line 38
    iget-object p2, v0, Lyyds/ᛵᲁᛷᛲ;->ᛱᲈᲁ:[Ljava/lang/String;

    .line 39
    .line 40
    iget-object v1, v0, Lyyds/ᛵᲁᛷᛲ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v3, v0, Lyyds/ᛵᲁᛷᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲁᲇᛸᲁ;

    .line 43
    .line 44
    invoke-static {p3}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object p3, p2

    .line 48
    move-object p2, v3

    .line 49
    goto :goto_2

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    invoke-static {p3}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, Lyyds/ᛳᲀᛸᛸ;->ᛶᛷᛲᲁ:[Ljava/lang/String;

    .line 61
    .line 62
    aget-object p0, p0, p2

    .line 63
    .line 64
    sget-object p2, Lyyds/ᛳᲀᛸᛸ;->ᛷᛵᲇᲀ:[Ljava/lang/String;

    .line 65
    .line 66
    const/4 p3, 0x0

    .line 67
    const/4 v1, 0x3

    .line 68
    move v6, v1

    .line 69
    move-object v1, p0

    .line 70
    move p0, v6

    .line 71
    move-object v6, p2

    .line 72
    move-object p2, p1

    .line 73
    move p1, p3

    .line 74
    move-object p3, v6

    .line 75
    :goto_1
    if-ge p1, p0, :cond_4

    .line 76
    .line 77
    aget-object v3, p3, p1

    .line 78
    .line 79
    new-instance v4, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v5, "room_table_modification_trigger_"

    .line 82
    .line 83
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const/16 v5, 0x5f

    .line 90
    .line 91
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    new-instance v4, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v5, "DROP TRIGGER IF EXISTS `"

    .line 104
    .line 105
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const/16 v3, 0x60

    .line 112
    .line 113
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    iput-object p2, v0, Lyyds/ᛵᲁᛷᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲁᲇᛸᲁ;

    .line 121
    .line 122
    iput-object v1, v0, Lyyds/ᛵᲁᛷᛲ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 123
    .line 124
    iput-object p3, v0, Lyyds/ᛵᲁᛷᛲ;->ᛱᲈᲁ:[Ljava/lang/String;

    .line 125
    .line 126
    iput p1, v0, Lyyds/ᛵᲁᛷᛲ;->ᛲᛳᛶᲁ:I

    .line 127
    .line 128
    iput p0, v0, Lyyds/ᛵᲁᛷᛲ;->ᛷᲈᲈᲁ:I

    .line 129
    .line 130
    iput v2, v0, Lyyds/ᛵᲁᛷᛲ;->ᛲᛲᲈᲈ:I

    .line 131
    .line 132
    invoke-static {p2, v3, v0}, Lyyds/ᛷᛶᛷᛵ;->ᛲᛴᛳᛲ(Lyyds/ᲁᲇᛸᲁ;Ljava/lang/String;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    sget-object v4, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 137
    .line 138
    if-ne v3, v4, :cond_3

    .line 139
    .line 140
    return-object v4

    .line 141
    :cond_3
    :goto_2
    add-int/2addr p1, v2

    .line 142
    goto :goto_1

    .line 143
    :cond_4
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 144
    .line 145
    return-object p0
.end method

.method public final ᛲᲈᲁ(Lyyds/ᲁᲇᛸᲁ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lyyds/ᛱᲈᛶᛸ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lyyds/ᛱᲈᛶᛸ;

    .line 7
    .line 8
    iget v1, v0, Lyyds/ᛱᲈᛶᛸ;->ᛲᛳᛶᲁ:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lyyds/ᛱᲈᛶᛸ;->ᛲᛳᛶᲁ:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lyyds/ᛱᲈᛶᛸ;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lyyds/ᛱᲈᛶᛸ;-><init>(Lyyds/ᛳᲀᛸᛸ;Lyyds/ᛶᛴᲀᛲ;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lyyds/ᛱᲈᛶᛸ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 26
    .line 27
    iget p2, v0, Lyyds/ᛱᲈᛶᛸ;->ᛲᛳᛶᲁ:I

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    const/4 v2, 0x1

    .line 31
    sget-object v3, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 32
    .line 33
    if-eqz p2, :cond_3

    .line 34
    .line 35
    if-eq p2, v2, :cond_2

    .line 36
    .line 37
    if-ne p2, v1, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lyyds/ᛱᲈᛶᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ljava/util/Set;

    .line 42
    .line 43
    invoke-static {p0}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    iget-object p1, v0, Lyyds/ᛱᲈᛶᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Lyyds/ᲁᲇᛸᲁ;

    .line 57
    .line 58
    invoke-static {p0}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {p0}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance p0, Lyyds/ᛸᛸᛸᛶ;

    .line 66
    .line 67
    const/4 p2, 0x5

    .line 68
    invoke-direct {p0, p2}, Lyyds/ᛸᛸᛸᛶ;-><init>(I)V

    .line 69
    .line 70
    .line 71
    iput-object p1, v0, Lyyds/ᛱᲈᛶᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 72
    .line 73
    iput v2, v0, Lyyds/ᛱᲈᛶᛸ;->ᛲᛳᛶᲁ:I

    .line 74
    .line 75
    const-string p2, "SELECT * FROM room_table_modification_log WHERE invalidated = 1"

    .line 76
    .line 77
    invoke-interface {p1, p2, p0, v0}, Lyyds/ᲁᲇᛸᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;Lyyds/ᛷᛴᲈᲀ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-ne p0, v3, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    :goto_1
    check-cast p0, Ljava/util/Set;

    .line 85
    .line 86
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-nez p2, :cond_5

    .line 91
    .line 92
    iput-object p0, v0, Lyyds/ᛱᲈᛶᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 93
    .line 94
    iput v1, v0, Lyyds/ᛱᲈᛶᛸ;->ᛲᛳᛶᲁ:I

    .line 95
    .line 96
    const-string p2, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"

    .line 97
    .line 98
    invoke-static {p1, p2, v0}, Lyyds/ᛷᛶᛷᛵ;->ᛲᛴᛳᛲ(Lyyds/ᲁᲇᛸᲁ;Ljava/lang/String;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-ne p1, v3, :cond_5

    .line 103
    .line 104
    :goto_2
    return-object v3

    .line 105
    :cond_5
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lyyds/ᛷᲁᛳᛷ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lyyds/ᛷᲁᛳᛷ;

    .line 7
    .line 8
    iget v1, v0, Lyyds/ᛷᲁᛳᛷ;->ᛲᛳᛶᲁ:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lyyds/ᛷᲁᛳᛷ;->ᛲᛳᛶᲁ:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lyyds/ᛷᲁᛳᛷ;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lyyds/ᛷᲁᛳᛷ;-><init>(Lyyds/ᛳᲀᛸᛸ;Lyyds/ᛶᛴᲀᛲ;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lyyds/ᛷᲁᛳᛷ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lyyds/ᛷᲁᛳᛷ;->ᛲᛳᛶᲁ:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, Lyyds/ᛷᲁᛳᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛶᲈ;

    .line 36
    .line 37
    :try_start_0
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_2
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lyyds/ᛳᲀᛸᛸ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase_Impl;

    .line 53
    .line 54
    iget-object v1, p1, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛶᛷᛲᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 55
    .line 56
    invoke-virtual {v1}, Lyyds/ᲀᲈᛶᲈ;->ᛵᛸᛸᛷ()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    sget-object v5, Lyyds/ᛶᲁᛲᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲁᛲᛶ;

    .line 61
    .line 62
    if-eqz v4, :cond_7

    .line 63
    .line 64
    :try_start_1
    iget-object v4, p0, Lyyds/ᛳᲀᛸᛸ;->ᛷᲈᲈᲁ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    invoke-virtual {v4, v3, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 68
    .line 69
    .line 70
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 71
    if-nez v4, :cond_3

    .line 72
    .line 73
    invoke-virtual {v1}, Lyyds/ᲀᲈᛶᲈ;->ᛱᛸᲁᲇ()V

    .line 74
    .line 75
    .line 76
    return-object v5

    .line 77
    :cond_3
    :try_start_2
    iget-object v4, p0, Lyyds/ᛳᲀᛸᛸ;->ᛷᛲᲈᛱ:Lyyds/ᲁᛶᲁᲀ;

    .line 78
    .line 79
    invoke-interface {v4}, Lyyds/ᲁᛶᲁᲀ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    check-cast v4, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 89
    if-nez v4, :cond_4

    .line 90
    .line 91
    invoke-virtual {v1}, Lyyds/ᲀᲈᛶᲈ;->ᛱᛸᲁᲇ()V

    .line 92
    .line 93
    .line 94
    return-object v5

    .line 95
    :cond_4
    :try_start_3
    new-instance v4, Lyyds/ᲈᲀᛱᛴ;

    .line 96
    .line 97
    invoke-direct {v4, p0, v2, v3}, Lyyds/ᲈᲀᛱᛴ;-><init>(Lyyds/ᛳᲀᛸᛸ;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 98
    .line 99
    .line 100
    iput-object v1, v0, Lyyds/ᛷᲁᛳᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛶᲈ;

    .line 101
    .line 102
    iput v3, v0, Lyyds/ᛷᲁᛳᛷ;->ᛲᛳᛶᲁ:I

    .line 103
    .line 104
    invoke-virtual {p1, v6, v4, v0}, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛲᛲᲈᲈ(ZLyyds/ᛲᲇᲁᛴ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 108
    sget-object v0, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 109
    .line 110
    if-ne p1, v0, :cond_5

    .line 111
    .line 112
    return-object v0

    .line 113
    :cond_5
    move-object v0, v1

    .line 114
    :goto_1
    :try_start_4
    check-cast p1, Ljava/util/Set;

    .line 115
    .line 116
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_6

    .line 121
    .line 122
    iget-object v1, p0, Lyyds/ᛳᲀᛸᛸ;->ᛲᛳᛶᲁ:Lyyds/ᲀᛵᲁᛴ;

    .line 123
    .line 124
    invoke-virtual {v1, p1}, Lyyds/ᲀᛵᲁᛴ;->ᛳᛸᛴᛶ(Ljava/util/Set;)V

    .line 125
    .line 126
    .line 127
    iget-object p0, p0, Lyyds/ᛳᲀᛸᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛳᲀᲈ;

    .line 128
    .line 129
    invoke-virtual {p0, p1}, Lyyds/ᲈᛳᲀᲈ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 130
    .line 131
    .line 132
    :cond_6
    invoke-virtual {v0}, Lyyds/ᲀᲈᛶᲈ;->ᛱᛸᲁᲇ()V

    .line 133
    .line 134
    .line 135
    return-object p1

    .line 136
    :catchall_1
    move-exception p0

    .line 137
    move-object v0, v1

    .line 138
    :goto_2
    invoke-virtual {v0}, Lyyds/ᲀᲈᛶᲈ;->ᛱᛸᲁᲇ()V

    .line 139
    .line 140
    .line 141
    throw p0

    .line 142
    :cond_7
    return-object v5
.end method

.method public final ᲀᛲᛳᲀ(Lyyds/ᲁᛶᲁᲀ;Lyyds/ᲁᛶᲁᲀ;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lyyds/ᛳᲀᛸᛸ;->ᛷᲈᲈᲁ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p1}, Lyyds/ᲁᛶᲁᲀ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lyyds/ᛳᲀᛸᛸ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase_Impl;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛲᲈᲁ:Lyyds/ᲇᛵᲁᛳ;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    move-object p1, v0

    .line 22
    :cond_0
    new-instance v1, Lyyds/ᛵᛶᛸᲀ;

    .line 23
    .line 24
    sget-object v2, Lyyds/ᛵᛶᛸᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛵᲈᲁ;

    .line 25
    .line 26
    invoke-direct {v1, v2}, Lyyds/ᛸᛴᛵᛶ;-><init>(Lyyds/ᲁᛸᛲᲁ;)V

    .line 27
    .line 28
    .line 29
    new-instance v2, Lyyds/ᛱᲁᛴᛴ;

    .line 30
    .line 31
    const/16 v3, 0xd

    .line 32
    .line 33
    invoke-direct {v2, p0, p2, v0, v3}, Lyyds/ᛱᲁᛴᛴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x2

    .line 37
    invoke-static {p1, v1, v2, p0}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public final ᲇᲇᲇᛱ(Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lyyds/ᛷᛴᛲᲇ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lyyds/ᛷᛴᛲᲇ;

    .line 7
    .line 8
    iget v1, v0, Lyyds/ᛷᛴᛲᲇ;->ᛲᛳᛶᲁ:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lyyds/ᛷᛴᛲᲇ;->ᛲᛳᛶᲁ:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lyyds/ᛷᛴᛲᲇ;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lyyds/ᛷᛴᛲᲇ;-><init>(Lyyds/ᛳᲀᛸᛸ;Lyyds/ᛶᛴᲀᛲ;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lyyds/ᛷᛴᛲᲇ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lyyds/ᛷᛴᛲᲇ;->ᛲᛳᛶᲁ:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget-object p0, v0, Lyyds/ᛷᛴᛲᲇ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛶᲈ;

    .line 36
    .line 37
    :try_start_0
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_2
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lyyds/ᛳᲀᛸᛸ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase_Impl;

    .line 53
    .line 54
    iget-object v1, p1, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛶᛷᛲᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 55
    .line 56
    invoke-virtual {v1}, Lyyds/ᲀᲈᛶᲈ;->ᛵᛸᛸᛷ()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_4

    .line 61
    .line 62
    :try_start_1
    new-instance v4, Lyyds/ᛷᲁᛸᛶ;

    .line 63
    .line 64
    invoke-direct {v4, p0, v2}, Lyyds/ᛷᲁᛸᛶ;-><init>(Lyyds/ᛳᲀᛸᛸ;Lyyds/ᛲᛱᛶᛸ;)V

    .line 65
    .line 66
    .line 67
    iput-object v1, v0, Lyyds/ᛷᛴᛲᲇ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛶᲈ;

    .line 68
    .line 69
    iput v3, v0, Lyyds/ᛷᛴᛲᲇ;->ᛲᛳᛶᲁ:I

    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    invoke-virtual {p1, p0, v4, v0}, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛲᛲᲈᲈ(ZLyyds/ᛲᲇᲁᛴ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    sget-object p1, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 77
    .line 78
    if-ne p0, p1, :cond_3

    .line 79
    .line 80
    return-object p1

    .line 81
    :cond_3
    move-object p0, v1

    .line 82
    :goto_1
    invoke-virtual {p0}, Lyyds/ᲀᲈᛶᲈ;->ᛱᛸᲁᲇ()V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :catchall_1
    move-exception p1

    .line 87
    move-object p0, v1

    .line 88
    :goto_2
    invoke-virtual {p0}, Lyyds/ᲀᲈᛶᲈ;->ᛱᛸᲁᲇ()V

    .line 89
    .line 90
    .line 91
    throw p1

    .line 92
    :cond_4
    :goto_3
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 93
    .line 94
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᲈᛶᛷᲀ;ILyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, Lyyds/ᛳᛷᲀ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lyyds/ᛳᛷᲀ;

    .line 7
    .line 8
    iget v1, v0, Lyyds/ᛳᛷᲀ;->ᛱᛳᲇ:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lyyds/ᛳᛷᲀ;->ᛱᛳᲇ:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lyyds/ᛳᛷᲀ;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lyyds/ᛳᛷᲀ;-><init>(Lyyds/ᛳᲀᛸᛸ;Lyyds/ᛶᛴᲀᛲ;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lyyds/ᛳᛷᲀ;->ᛷᛵᲇᲀ:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lyyds/ᛳᛷᲀ;->ᛱᛳᲇ:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget p1, v0, Lyyds/ᛳᛷᲀ;->ᛷᛲᲈᛱ:I

    .line 40
    .line 41
    iget p2, v0, Lyyds/ᛳᛷᲀ;->ᛷᲈᲈᲁ:I

    .line 42
    .line 43
    iget v1, v0, Lyyds/ᛳᛷᲀ;->ᛲᛳᛶᲁ:I

    .line 44
    .line 45
    iget-object v5, v0, Lyyds/ᛳᛷᲀ;->ᛱᲈᲁ:[Ljava/lang/String;

    .line 46
    .line 47
    iget-object v6, v0, Lyyds/ᛳᛷᲀ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v7, v0, Lyyds/ᛳᛷᲀ;->ᲇᲇᲇᛱ:Lyyds/ᲁᲇᛸᲁ;

    .line 50
    .line 51
    invoke-static {p3}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    return-object p0

    .line 63
    :cond_2
    iget p2, v0, Lyyds/ᛳᛷᲀ;->ᛲᛳᛶᲁ:I

    .line 64
    .line 65
    iget-object p1, v0, Lyyds/ᛳᛷᲀ;->ᲇᲇᲇᛱ:Lyyds/ᲁᲇᛸᲁ;

    .line 66
    .line 67
    invoke-static {p3}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-static {p3}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    new-instance p3, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v1, "INSERT OR IGNORE INTO room_table_modification_log VALUES("

    .line 77
    .line 78
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", 0)"

    .line 85
    .line 86
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    iput-object p1, v0, Lyyds/ᛳᛷᲀ;->ᲇᲇᲇᛱ:Lyyds/ᲁᲇᛸᲁ;

    .line 94
    .line 95
    iput p2, v0, Lyyds/ᛳᛷᲀ;->ᛲᛳᛶᲁ:I

    .line 96
    .line 97
    iput v3, v0, Lyyds/ᛳᛷᲀ;->ᛱᛳᲇ:I

    .line 98
    .line 99
    invoke-static {p1, p3, v0}, Lyyds/ᛷᛶᛷᛵ;->ᛲᛴᛳᛲ(Lyyds/ᲁᲇᛸᲁ;Ljava/lang/String;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    if-ne p3, v4, :cond_4

    .line 104
    .line 105
    goto/16 :goto_4

    .line 106
    .line 107
    :cond_4
    :goto_1
    iget-object p3, p0, Lyyds/ᛳᲀᛸᛸ;->ᛶᛷᛲᲁ:[Ljava/lang/String;

    .line 108
    .line 109
    aget-object p3, p3, p2

    .line 110
    .line 111
    sget-object v1, Lyyds/ᛳᲀᛸᛸ;->ᛷᛵᲇᲀ:[Ljava/lang/String;

    .line 112
    .line 113
    const/4 v5, 0x0

    .line 114
    const/4 v6, 0x3

    .line 115
    move-object v7, v1

    .line 116
    move v1, p2

    .line 117
    move p2, v5

    .line 118
    move-object v5, v7

    .line 119
    move-object v7, p1

    .line 120
    move p1, v6

    .line 121
    move-object v6, p3

    .line 122
    :goto_2
    if-ge p2, p1, :cond_7

    .line 123
    .line 124
    aget-object p3, v5, p2

    .line 125
    .line 126
    iget-boolean v8, p0, Lyyds/ᛳᲀᛸᛸ;->ᲇᲈᛵᛷ:Z

    .line 127
    .line 128
    if-eqz v8, :cond_5

    .line 129
    .line 130
    const-string v8, "TEMP"

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_5
    const-string v8, ""

    .line 134
    .line 135
    :goto_3
    new-instance v9, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v10, "room_table_modification_trigger_"

    .line 138
    .line 139
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const/16 v10, 0x5f

    .line 146
    .line 147
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v9, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    new-instance v10, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    const-string v11, "CREATE "

    .line 160
    .line 161
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string v8, " TRIGGER IF NOT EXISTS `"

    .line 168
    .line 169
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v8, "` AFTER "

    .line 176
    .line 177
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v10, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string p3, " ON `"

    .line 184
    .line 185
    invoke-virtual {v10, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string p3, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = "

    .line 192
    .line 193
    invoke-virtual {v10, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const-string p3, " AND invalidated = 0; END"

    .line 200
    .line 201
    invoke-virtual {v10, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p3

    .line 208
    iput-object v7, v0, Lyyds/ᛳᛷᲀ;->ᲇᲇᲇᛱ:Lyyds/ᲁᲇᛸᲁ;

    .line 209
    .line 210
    iput-object v6, v0, Lyyds/ᛳᛷᲀ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 211
    .line 212
    iput-object v5, v0, Lyyds/ᛳᛷᲀ;->ᛱᲈᲁ:[Ljava/lang/String;

    .line 213
    .line 214
    iput v1, v0, Lyyds/ᛳᛷᲀ;->ᛲᛳᛶᲁ:I

    .line 215
    .line 216
    iput p2, v0, Lyyds/ᛳᛷᲀ;->ᛷᲈᲈᲁ:I

    .line 217
    .line 218
    iput p1, v0, Lyyds/ᛳᛷᲀ;->ᛷᛲᲈᛱ:I

    .line 219
    .line 220
    iput v2, v0, Lyyds/ᛳᛷᲀ;->ᛱᛳᲇ:I

    .line 221
    .line 222
    invoke-static {v7, p3, v0}, Lyyds/ᛷᛶᛷᛵ;->ᛲᛴᛳᛲ(Lyyds/ᲁᲇᛸᲁ;Ljava/lang/String;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p3

    .line 226
    if-ne p3, v4, :cond_6

    .line 227
    .line 228
    :goto_4
    return-object v4

    .line 229
    :cond_6
    :goto_5
    add-int/2addr p2, v3

    .line 230
    goto :goto_2

    .line 231
    :cond_7
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 232
    .line 233
    return-object p0
.end method
