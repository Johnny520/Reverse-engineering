.class public final Lyyds/ᛶᲇᲈᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲈᛶᛷᲀ;
.implements Lyyds/ᛸᛸᲈᛳ;


# instance fields
.field public volatile ᛲᛴᛳᛲ:Z

.field public final ᛲᲈᲁ:Lyyds/ᛷᛶᲇᲁ;

.field public final ᛵᛸᛸᛷ:Lyyds/ᲁᛲᲁᛷ;

.field public final ᲀᛲᛳᲀ:Z

.field public final ᲇᲈᛵᛷ:Lyyds/ᛱᲁᛳᛵ;


# direct methods
.method public constructor <init>(Lyyds/ᛷᛶᲇᲁ;Lyyds/ᲁᛲᲁᛷ;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛶᲇᲈᛱ;->ᛲᲈᲁ:Lyyds/ᛷᛶᲇᲁ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛶᲇᲈᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᲁᛷ;

    .line 7
    .line 8
    iput-boolean p3, p0, Lyyds/ᛶᲇᲈᛱ;->ᲀᛲᛳᲀ:Z

    .line 9
    .line 10
    new-instance p1, Lyyds/ᛱᲁᛳᛵ;

    .line 11
    .line 12
    invoke-direct {p1}, Lyyds/ᛱᲁᛳᛵ;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lyyds/ᛶᲇᲈᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛱᲁᛳᛵ;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(Lyyds/ᲀᲀᛲᛷ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lyyds/ᛶᲇᲈᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛱᲁᛳᛵ;

    .line 2
    .line 3
    const-string v1, "SAVEPOINT \'"

    .line 4
    .line 5
    instance-of v2, p2, Lyyds/ᛳᛸᛲᛱ;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, p2

    .line 10
    check-cast v2, Lyyds/ᛳᛸᛲᛱ;

    .line 11
    .line 12
    iget v3, v2, Lyyds/ᛳᛸᛲᛱ;->ᛷᲈᲈᲁ:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lyyds/ᛳᛸᛲᛱ;->ᛷᲈᲈᲁ:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lyyds/ᛳᛸᛲᛱ;

    .line 25
    .line 26
    invoke-direct {v2, p0, p2}, Lyyds/ᛳᛸᛲᛱ;-><init>(Lyyds/ᛶᲇᲈᛱ;Lyyds/ᛶᛴᲀᛲ;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p2, v2, Lyyds/ᛳᛸᛲᛱ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Lyyds/ᛳᛸᛲᛱ;->ᛷᲈᲈᲁ:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    iget-object p0, p0, Lyyds/ᛶᲇᲈᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᲁᛷ;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    if-ne v3, v4, :cond_1

    .line 40
    .line 41
    iget-object p1, v2, Lyyds/ᛳᛸᛲᛱ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛲᲁᛷ;

    .line 42
    .line 43
    iget-object v2, v2, Lyyds/ᛳᛸᛲᛱ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲀᛲᛷ;

    .line 44
    .line 45
    invoke-static {p2}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-object p2, p1

    .line 49
    move-object p1, v2

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v5

    .line 57
    :cond_2
    invoke-static {p2}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, v2, Lyyds/ᛳᛸᛲᛱ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲀᛲᛷ;

    .line 61
    .line 62
    iput-object p0, v2, Lyyds/ᛳᛸᛲᛱ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛲᲁᛷ;

    .line 63
    .line 64
    iput v4, v2, Lyyds/ᛳᛸᛲᛱ;->ᛷᲈᲈᲁ:I

    .line 65
    .line 66
    iget-object p2, p0, Lyyds/ᲁᛲᲁᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛵᛳᲈᛴ;

    .line 67
    .line 68
    invoke-interface {p2, v2}, Lyyds/ᛵᛳᲈᛴ;->ᲇᲇᲇᛱ(Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    sget-object v2, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 73
    .line 74
    if-ne p2, v2, :cond_3

    .line 75
    .line 76
    return-object v2

    .line 77
    :cond_3
    move-object p2, p0

    .line 78
    :goto_1
    :try_start_0
    iget v2, v0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 79
    .line 80
    invoke-virtual {v0}, Lyyds/ᛱᲁᛳᛵ;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_7

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_6

    .line 91
    .line 92
    if-eq p1, v4, :cond_5

    .line 93
    .line 94
    const/4 v1, 0x2

    .line 95
    if-ne p1, v1, :cond_4

    .line 96
    .line 97
    const-string p1, "BEGIN EXCLUSIVE TRANSACTION"

    .line 98
    .line 99
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :catchall_0
    move-exception p0

    .line 104
    goto :goto_3

    .line 105
    :cond_4
    new-instance p0, Lyyds/ᛸᛳᛵᛳ;

    .line 106
    .line 107
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 108
    .line 109
    .line 110
    throw p0

    .line 111
    :cond_5
    const-string p1, "BEGIN IMMEDIATE TRANSACTION"

    .line 112
    .line 113
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_6
    const-string p1, "BEGIN DEFERRED TRANSACTION"

    .line 118
    .line 119
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const/16 v1, 0x27

    .line 132
    .line 133
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :goto_2
    new-instance p0, Lyyds/ᛸᛶᲇᛲ;

    .line 144
    .line 145
    invoke-direct {p0, v2}, Lyyds/ᛸᛶᲇᛲ;-><init>(I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, p0}, Lyyds/ᛱᲁᛳᛵ;->addLast(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    invoke-interface {p2, v5}, Lyyds/ᛵᛳᲈᛴ;->ᛲᲈᲁ(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    return-object p0

    .line 157
    :goto_3
    invoke-interface {p2, v5}, Lyyds/ᛵᛳᲈᛴ;->ᛲᲈᲁ(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    throw p0
.end method

.method public final ᛲᲈᲁ(Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Boolean;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x15

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    check-cast p1, Lyyds/ᛶᛴᲀᛲ;

    .line 9
    .line 10
    iget-object p1, p1, Lyyds/ᛶᛴᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛴᛲ;

    .line 11
    .line 12
    iget-object v0, p0, Lyyds/ᛶᲇᲈᛱ;->ᛲᲈᲁ:Lyyds/ᛷᛶᲇᲁ;

    .line 13
    .line 14
    invoke-interface {p1, v0}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lyyds/ᲀᛳᲇᛶ;

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    iget-object p1, p1, Lyyds/ᲀᛳᲇᛶ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲇᲈᛱ;

    .line 23
    .line 24
    if-ne p1, p0, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, Lyyds/ᛶᲇᲈᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛱᲁᛳᛵ;

    .line 27
    .line 28
    invoke-virtual {p1}, Lyyds/ᛱᲁᛳᛵ;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iget-object p0, p0, Lyyds/ᛶᲇᲈᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᲁᛷ;

    .line 35
    .line 36
    iget-object p0, p0, Lyyds/ᲁᛲᲁᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛵᛷ;

    .line 37
    .line 38
    invoke-interface {p0}, Lyyds/ᛱᛵᛷ;->ᛶᛳᛶᛵ()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 p0, 0x0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 48
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_2
    const-string p0, "Attempted to use connection on a different coroutine"

    .line 54
    .line 55
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v1

    .line 59
    :cond_3
    const-string p0, "Connection is recycled"

    .line 60
    .line 61
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v1
.end method

.method public final ᛵᛸᛸᛷ()Lyyds/ᛱᛵᛷ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᲇᲈᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᲁᛷ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛶᛷᛲᲁ(Lyyds/ᲀᲀᛲᛷ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lyyds/ᲁᛳᛳᛸ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lyyds/ᲁᛳᛳᛸ;

    .line 7
    .line 8
    iget v1, v0, Lyyds/ᲁᛳᛳᛸ;->ᛷᛲᲈᛱ:I

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
    iput v1, v0, Lyyds/ᲁᛳᛳᛸ;->ᛷᛲᲈᛱ:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lyyds/ᲁᛳᛳᛸ;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lyyds/ᲁᛳᛳᛸ;-><init>(Lyyds/ᛶᲇᲈᛱ;Lyyds/ᛶᛴᲀᛲ;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lyyds/ᲁᛳᛳᛸ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lyyds/ᲁᛳᛳᛸ;->ᛷᛲᲈᛱ:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x5

    .line 32
    const/4 v5, 0x3

    .line 33
    const/4 v6, 0x2

    .line 34
    const/4 v7, 0x1

    .line 35
    sget-object v8, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 36
    .line 37
    if-eqz v1, :cond_5

    .line 38
    .line 39
    if-eq v1, v7, :cond_4

    .line 40
    .line 41
    if-eq v1, v6, :cond_3

    .line 42
    .line 43
    if-eq v1, v5, :cond_2

    .line 44
    .line 45
    const/4 p0, 0x4

    .line 46
    if-eq v1, p0, :cond_2

    .line 47
    .line 48
    if-eq v1, v4, :cond_1

    .line 49
    .line 50
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v2

    .line 56
    :cond_1
    iget-object p0, v0, Lyyds/ᲁᛳᛳᛸ;->ᛶᛷᛲᲁ:Ljava/lang/Throwable;

    .line 57
    .line 58
    iget-object p1, v0, Lyyds/ᲁᛳᛳᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Ljava/lang/Throwable;

    .line 61
    .line 62
    :try_start_0
    invoke-static {p3}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    goto/16 :goto_6

    .line 66
    .line 67
    :catch_0
    move-exception p2

    .line 68
    goto/16 :goto_5

    .line 69
    .line 70
    :cond_2
    iget-object p0, v0, Lyyds/ᲁᛳᛳᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 71
    .line 72
    invoke-static {p3}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_3
    iget p1, v0, Lyyds/ᲁᛳᛳᛸ;->ᛱᲈᲁ:I

    .line 77
    .line 78
    :try_start_1
    invoke-static {p3}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    goto :goto_3

    .line 84
    :cond_4
    iget-object p1, v0, Lyyds/ᲁᛳᛳᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 85
    .line 86
    move-object p2, p1

    .line 87
    check-cast p2, Lyyds/ᛲᲇᲁᛴ;

    .line 88
    .line 89
    invoke-static {p3}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_5
    invoke-static {p3}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    if-nez p1, :cond_6

    .line 97
    .line 98
    sget-object p1, Lyyds/ᲀᲀᛲᛷ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛲᛷ;

    .line 99
    .line 100
    :cond_6
    iput-object p2, v0, Lyyds/ᲁᛳᛳᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 101
    .line 102
    iput v7, v0, Lyyds/ᲁᛳᛳᛸ;->ᛷᛲᲈᛱ:I

    .line 103
    .line 104
    invoke-virtual {p0, p1, v0}, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ(Lyyds/ᲀᲀᛲᛷ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-ne p1, v8, :cond_7

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_7
    :goto_1
    :try_start_2
    new-instance p1, Lyyds/ᛱᲇᛶᛵ;

    .line 112
    .line 113
    invoke-direct {p1, v7, p0}, Lyyds/ᛱᲇᛶᛵ;-><init>(ILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iput-object v2, v0, Lyyds/ᲁᛳᛳᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 117
    .line 118
    iput v7, v0, Lyyds/ᲁᛳᛳᛸ;->ᛱᲈᲁ:I

    .line 119
    .line 120
    iput v6, v0, Lyyds/ᲁᛳᛳᛸ;->ᛷᛲᲈᛱ:I

    .line 121
    .line 122
    invoke-interface {p2, p1, v0}, Lyyds/ᛲᲇᲁᛴ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    if-ne p3, v8, :cond_8

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_8
    move p1, v7

    .line 130
    :goto_2
    if-eqz p1, :cond_9

    .line 131
    .line 132
    move v3, v7

    .line 133
    :cond_9
    iput-object p3, v0, Lyyds/ᲁᛳᛳᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 134
    .line 135
    iput v5, v0, Lyyds/ᲁᛳᛳᛸ;->ᛷᛲᲈᛱ:I

    .line 136
    .line 137
    invoke-virtual {p0, v3, v0}, Lyyds/ᛶᲇᲈᛱ;->ᲇᲇᲇᛱ(ZLyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    if-ne p0, v8, :cond_a

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_a
    return-object p3

    .line 145
    :goto_3
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 146
    :catchall_1
    move-exception p2

    .line 147
    :try_start_4
    iput-object p1, v0, Lyyds/ᲁᛳᛳᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object p2, v0, Lyyds/ᲁᛳᛳᛸ;->ᛶᛷᛲᲁ:Ljava/lang/Throwable;

    .line 150
    .line 151
    iput v4, v0, Lyyds/ᲁᛳᛳᛸ;->ᛷᛲᲈᛱ:I

    .line 152
    .line 153
    invoke-virtual {p0, v3, v0}, Lyyds/ᛶᲇᲈᛱ;->ᲇᲇᲇᛱ(ZLyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0
    :try_end_4
    .catch Landroid/database/SQLException; {:try_start_4 .. :try_end_4} :catch_1

    .line 157
    if-ne p0, v8, :cond_b

    .line 158
    .line 159
    :goto_4
    return-object v8

    .line 160
    :cond_b
    move-object p0, p2

    .line 161
    goto :goto_6

    .line 162
    :catch_1
    move-exception p0

    .line 163
    move-object v9, p2

    .line 164
    move-object p2, p0

    .line 165
    move-object p0, v9

    .line 166
    :goto_5
    if-eqz p1, :cond_c

    .line 167
    .line 168
    invoke-static {p1, p2}, Lyyds/ᛷᛶᛷᛵ;->ᛲᲈᲁ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    :goto_6
    throw p0

    .line 172
    :cond_c
    throw p2
.end method

.method public final ᲀᛲᛳᲀ(Ljava/lang/String;Lyyds/ᛷᛴᲈᲀ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lyyds/ᛸᲈᛴᲇ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lyyds/ᛸᲈᛴᲇ;

    .line 7
    .line 8
    iget v1, v0, Lyyds/ᛸᲈᛴᲇ;->ᛷᛲᲈᛱ:I

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
    iput v1, v0, Lyyds/ᛸᲈᛴᲇ;->ᛷᛲᲈᛱ:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lyyds/ᛸᲈᛴᲇ;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lyyds/ᛸᲈᛴᲇ;-><init>(Lyyds/ᛶᲇᲈᛱ;Lyyds/ᛶᛴᲀᛲ;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lyyds/ᛸᲈᛴᲇ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 28
    .line 29
    iget v2, v0, Lyyds/ᛸᲈᛴᲇ;->ᛷᛲᲈᛱ:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, Lyyds/ᛸᲈᛴᲇ;->ᛱᲈᲁ:Lyyds/ᲁᛲᲁᛷ;

    .line 38
    .line 39
    iget-object p2, v0, Lyyds/ᛸᲈᛴᲇ;->ᛶᛷᛲᲁ:Lyyds/ᛷᛴᲈᲀ;

    .line 40
    .line 41
    iget-object v0, v0, Lyyds/ᛸᲈᛴᲇ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p3}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move-object p3, p1

    .line 47
    move-object p1, v0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v4

    .line 55
    :cond_2
    invoke-static {p3}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-boolean p3, p0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 59
    .line 60
    const/16 v2, 0x15

    .line 61
    .line 62
    if-nez p3, :cond_5

    .line 63
    .line 64
    iget-object p3, v0, Lyyds/ᛶᛴᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛴᛲ;

    .line 65
    .line 66
    iget-object v5, p0, Lyyds/ᛶᲇᲈᛱ;->ᛲᲈᲁ:Lyyds/ᛷᛶᲇᲁ;

    .line 67
    .line 68
    invoke-interface {p3, v5}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    check-cast p3, Lyyds/ᲀᛳᲇᛶ;

    .line 73
    .line 74
    if-eqz p3, :cond_4

    .line 75
    .line 76
    iget-object p3, p3, Lyyds/ᲀᛳᲇᛶ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲇᲈᛱ;

    .line 77
    .line 78
    if-ne p3, p0, :cond_4

    .line 79
    .line 80
    iget-object p3, p0, Lyyds/ᛶᲇᲈᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᲁᛷ;

    .line 81
    .line 82
    iput-object p1, v0, Lyyds/ᛸᲈᛴᲇ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 83
    .line 84
    iput-object p2, v0, Lyyds/ᛸᲈᛴᲇ;->ᛶᛷᛲᲁ:Lyyds/ᛷᛴᲈᲀ;

    .line 85
    .line 86
    iput-object p3, v0, Lyyds/ᛸᲈᛴᲇ;->ᛱᲈᲁ:Lyyds/ᲁᛲᲁᛷ;

    .line 87
    .line 88
    iput v3, v0, Lyyds/ᛸᲈᛴᲇ;->ᛷᛲᲈᛱ:I

    .line 89
    .line 90
    iget-object v2, p3, Lyyds/ᲁᛲᲁᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛵᛳᲈᛴ;

    .line 91
    .line 92
    invoke-interface {v2, v0}, Lyyds/ᛵᛳᲈᛴ;->ᲇᲇᲇᛱ(Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-ne v0, v1, :cond_3

    .line 97
    .line 98
    return-object v1

    .line 99
    :cond_3
    :goto_1
    :try_start_0
    new-instance v0, Lyyds/ᛱᛱᲀᲈ;

    .line 100
    .line 101
    iget-object v1, p0, Lyyds/ᛶᲇᲈᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᲁᛷ;

    .line 102
    .line 103
    invoke-virtual {v1, p1}, Lyyds/ᲁᛲᲁᛷ;->ᲀᛲᛱᛱ(Ljava/lang/String;)Lyyds/ᛵᲇᛱᛸ;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-direct {v0, p0, p1}, Lyyds/ᛱᛱᲀᲈ;-><init>(Lyyds/ᛶᲇᲈᛱ;Lyyds/ᛵᲇᛱᛸ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    .line 110
    :try_start_1
    invoke-interface {p2, v0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 114
    :try_start_2
    invoke-static {v0, v4}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 115
    .line 116
    .line 117
    invoke-interface {p3, v4}, Lyyds/ᛵᛳᲈᛴ;->ᛲᲈᲁ(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return-object p0

    .line 121
    :catchall_0
    move-exception p0

    .line 122
    goto :goto_2

    .line 123
    :catchall_1
    move-exception p0

    .line 124
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 125
    :catchall_2
    move-exception p1

    .line 126
    :try_start_4
    invoke-static {v0, p0}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 130
    :goto_2
    invoke-interface {p3, v4}, Lyyds/ᛵᛳᲈᛴ;->ᛲᲈᲁ(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    throw p0

    .line 134
    :cond_4
    const-string p0, "Attempted to use connection on a different coroutine"

    .line 135
    .line 136
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v4

    .line 140
    :cond_5
    const-string p0, "Connection is recycled"

    .line 141
    .line 142
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v4
.end method

.method public final ᲇᲇᲇᛱ(ZLyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛶᲇᲈᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛱᲁᛳᛵ;

    .line 2
    .line 3
    const-string v1, "ROLLBACK TRANSACTION TO SAVEPOINT \'"

    .line 4
    .line 5
    const-string v2, "RELEASE SAVEPOINT \'"

    .line 6
    .line 7
    instance-of v3, p2, Lyyds/ᲀᛷᛷᲁ;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, p2

    .line 12
    check-cast v3, Lyyds/ᲀᛷᛷᲁ;

    .line 13
    .line 14
    iget v4, v3, Lyyds/ᲀᛷᛷᲁ;->ᛷᲈᲈᲁ:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lyyds/ᲀᛷᛷᲁ;->ᛷᲈᲈᲁ:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lyyds/ᲀᛷᛷᲁ;

    .line 27
    .line 28
    invoke-direct {v3, p0, p2}, Lyyds/ᲀᛷᛷᲁ;-><init>(Lyyds/ᛶᲇᲈᛱ;Lyyds/ᛶᛴᲀᛲ;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p2, v3, Lyyds/ᲀᛷᛷᲁ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 32
    .line 33
    iget v4, v3, Lyyds/ᲀᛷᛷᲁ;->ᛷᲈᲈᲁ:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    iget-object p0, p0, Lyyds/ᛶᲇᲈᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᲁᛷ;

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    if-ne v4, v5, :cond_1

    .line 42
    .line 43
    iget-boolean p1, v3, Lyyds/ᲀᛷᛷᲁ;->ᲇᲇᲇᛱ:Z

    .line 44
    .line 45
    iget-object v3, v3, Lyyds/ᲀᛷᛷᲁ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛲᲁᛷ;

    .line 46
    .line 47
    invoke-static {p2}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v6

    .line 57
    :cond_2
    invoke-static {p2}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput-object p0, v3, Lyyds/ᲀᛷᛷᲁ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛲᲁᛷ;

    .line 61
    .line 62
    iput-boolean p1, v3, Lyyds/ᲀᛷᛷᲁ;->ᲇᲇᲇᛱ:Z

    .line 63
    .line 64
    iput v5, v3, Lyyds/ᲀᛷᛷᲁ;->ᛷᲈᲈᲁ:I

    .line 65
    .line 66
    iget-object p2, p0, Lyyds/ᲁᛲᲁᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛵᛳᲈᛴ;

    .line 67
    .line 68
    invoke-interface {p2, v3}, Lyyds/ᛵᛳᲈᛴ;->ᲇᲇᲇᛱ(Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    sget-object v3, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 73
    .line 74
    if-ne p2, v3, :cond_3

    .line 75
    .line 76
    return-object v3

    .line 77
    :cond_3
    move-object v3, p0

    .line 78
    :goto_1
    :try_start_0
    invoke-virtual {v0}, Lyyds/ᛱᲁᛳᛵ;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-nez p2, :cond_8

    .line 83
    .line 84
    invoke-virtual {v0}, Lyyds/ᛱᲁᛳᛵ;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-nez p2, :cond_7

    .line 89
    .line 90
    invoke-static {v0}, Lyyds/ᲈᛸᲁᛶ;->ᛳᲁᲁᲇ(Ljava/util/List;)I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    invoke-virtual {v0, p2}, Lyyds/ᛱᲀᲈᛲ;->remove(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    check-cast p2, Lyyds/ᛸᛶᲇᛲ;

    .line 99
    .line 100
    const/16 v4, 0x27

    .line 101
    .line 102
    if-eqz p1, :cond_5

    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lyyds/ᛱᲁᛳᛵ;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_4

    .line 112
    .line 113
    const-string p1, "END TRANSACTION"

    .line 114
    .line 115
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :catchall_0
    move-exception p0

    .line 120
    goto :goto_3

    .line 121
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    iget p2, p2, Lyyds/ᛸᛶᲇᛲ;->ᛲᲈᲁ:I

    .line 127
    .line 128
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_5
    invoke-virtual {v0}, Lyyds/ᛱᲁᛳᛵ;->isEmpty()Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-eqz p1, :cond_6

    .line 147
    .line 148
    const-string p1, "ROLLBACK TRANSACTION"

    .line 149
    .line 150
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    iget p2, p2, Lyyds/ᛸᛶᲇᛲ;->ᛲᲈᲁ:I

    .line 160
    .line 161
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    :goto_2
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    .line 176
    invoke-interface {v3, v6}, Lyyds/ᛵᛳᲈᛴ;->ᛲᲈᲁ(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-object p0

    .line 180
    :cond_7
    :try_start_1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 181
    .line 182
    const-string p1, "List is empty."

    .line 183
    .line 184
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw p0

    .line 188
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 189
    .line 190
    const-string p1, "Not in a transaction"

    .line 191
    .line 192
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 196
    :goto_3
    invoke-interface {v3, v6}, Lyyds/ᛵᛳᲈᛴ;->ᛲᲈᲁ(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    throw p0
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᲀᲀᛲᛷ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛸᲀᛷᛱ;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x15

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p3, Lyyds/ᛶᛴᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛴᛲ;

    .line 9
    .line 10
    iget-object v3, p0, Lyyds/ᛶᲇᲈᛱ;->ᛲᲈᲁ:Lyyds/ᛷᛶᲇᲁ;

    .line 11
    .line 12
    invoke-interface {v0, v3}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lyyds/ᲀᛳᲇᛶ;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, v0, Lyyds/ᲀᛳᲇᛶ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲇᲈᛱ;

    .line 21
    .line 22
    if-ne v0, p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, p1, p2, p3}, Lyyds/ᛶᲇᲈᛱ;->ᛶᛷᛲᲁ(Lyyds/ᲀᲀᛲᛷ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    const-string p0, "Attempted to use connection on a different coroutine"

    .line 30
    .line 31
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v1

    .line 35
    :cond_1
    const-string p0, "Connection is recycled"

    .line 36
    .line 37
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1
.end method
