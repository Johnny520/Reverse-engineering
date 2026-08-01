.class public abstract Lxhss/ᲇᛷᛲᛱ;
.super Lxhss/ᛲᛲᛲᛲ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᲇᛴᲇᛵ:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-direct {p0, v0, v1, v2}, Lxhss/ᛲᛲᛲᛲ;-><init>(JZ)V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lxhss/ᲇᛷᛲᛱ;->ᲇᛴᲇᛵ:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lxhss/ᲇᛷᛲᛱ;->ᛱᛱᛲᲇ()Lxhss/ᛱᛴᛶᛴ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lxhss/ᛸᲇᲁᛱ;

    .line 6
    .line 7
    iget-object v1, v0, Lxhss/ᛸᲇᲁᛱ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛴᛳᛷ;

    .line 8
    .line 9
    iget-object v2, v1, Lxhss/ᛸᛴᛳᛷ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛵᛳᛵ;

    .line 10
    .line 11
    iget-object v0, v0, Lxhss/ᛸᲇᲁᛱ;->ᛸᛴᛶᛳ:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {v2, v0}, Lxhss/ᛶᲈᛴᛲ;->ᲁᛲᛴᛴ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v3, Lxhss/ᛶᲈᛴᛲ;->ᛷᛴᛷᛱ:Lxhss/ᛶᛲᛷᛵ;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    if-eq v0, v3, :cond_0

    .line 21
    .line 22
    invoke-static {v1, v2, v0}, Lxhss/ᛵᛶᲀᲇ;->ᲈᛳᲀ(Lxhss/ᛸᛴᛳᛷ;Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)Lxhss/ᲈᲇᛵ;

    .line 23
    .line 24
    .line 25
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto/16 :goto_6

    .line 29
    .line 30
    :cond_0
    move-object v3, v4

    .line 31
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Lxhss/ᲇᛷᛲᛱ;->ᛸᛲᲀᛵ()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {p0, v5}, Lxhss/ᲇᛷᛲᛱ;->ᛳᲁᲇᛸ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    if-nez v6, :cond_3

    .line 40
    .line 41
    iget v7, p0, Lxhss/ᲇᛷᛲᛱ;->ᲇᛴᲇᛵ:I

    .line 42
    .line 43
    const/4 v8, 0x1

    .line 44
    if-eq v7, v8, :cond_2

    .line 45
    .line 46
    const/4 v9, 0x2

    .line 47
    if-ne v7, v9, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const/4 v8, 0x0

    .line 51
    :cond_2
    :goto_1
    if-eqz v8, :cond_3

    .line 52
    .line 53
    sget-object v4, Lxhss/ᛳᛴᲀᲁ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᲀᲁ;

    .line 54
    .line 55
    invoke-interface {v2, v4}, Lxhss/ᛴᛵᛳᛵ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Lxhss/ᛸᛷᛳᲈ;

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :catchall_1
    move-exception v1

    .line 63
    goto :goto_5

    .line 64
    :cond_3
    :goto_2
    if-eqz v4, :cond_4

    .line 65
    .line 66
    invoke-virtual {v4}, Lxhss/ᛸᛷᛳᲈ;->ᛲᛴᲇᛲ()Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-nez v7, :cond_4

    .line 71
    .line 72
    invoke-virtual {v4}, Lxhss/ᛸᛷᛳᲈ;->ᛸᛲᛷᛱ()Ljava/util/concurrent/CancellationException;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {p0, v4}, Lxhss/ᲇᛷᛲᛱ;->ᛷᛵᛵᲈ(Ljava/util/concurrent/CancellationException;)V

    .line 77
    .line 78
    .line 79
    new-instance v5, Lxhss/ᲈᛳᛱᲇ;

    .line 80
    .line 81
    invoke-direct {v5, v4}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v5}, Lxhss/ᛷᛲᛳᛴ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    if-eqz v6, :cond_5

    .line 89
    .line 90
    new-instance v4, Lxhss/ᲈᛳᛱᲇ;

    .line 91
    .line 92
    invoke-direct {v4, v6}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v4}, Lxhss/ᛷᛲᛳᛴ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    invoke-virtual {p0, v5}, Lxhss/ᲇᛷᛲᛱ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v1, v4}, Lxhss/ᛷᛲᛳᛴ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    .line 105
    .line 106
    :goto_3
    if-eqz v3, :cond_7

    .line 107
    .line 108
    :try_start_2
    invoke-virtual {v3}, Lxhss/ᲈᲇᛵ;->ᛴᛷᛵᛴ()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_6

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_6
    return-void

    .line 116
    :cond_7
    :goto_4
    invoke-static {v2, v0}, Lxhss/ᛶᲈᛴᛲ;->ᛸᛲᛷᛱ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :goto_5
    if-eqz v3, :cond_8

    .line 121
    .line 122
    invoke-virtual {v3}, Lxhss/ᲈᲇᛵ;->ᛴᛷᛵᛴ()Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_9

    .line 127
    .line 128
    :cond_8
    invoke-static {v2, v0}, Lxhss/ᛶᲈᛴᛲ;->ᛸᛲᛷᛱ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_9
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 132
    :goto_6
    invoke-virtual {p0, v0}, Lxhss/ᲇᛷᛲᛱ;->ᲀᲇᛳᲁ(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public abstract ᛱᛱᛲᲇ()Lxhss/ᛱᛴᛶᛴ;
.end method

.method public ᛳᲁᲇᛸ(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 1

    .line 1
    instance-of p0, p1, Lxhss/ᛷᲁᲇᛷ;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lxhss/ᛷᲁᲇᛷ;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v0

    .line 10
    :goto_0
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p0, p1, Lxhss/ᛷᲁᲇᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Throwable;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    return-object v0
.end method

.method public ᛷᛵᛵᲈ(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract ᛸᛲᲀᛵ()Ljava/lang/Object;
.end method

.method public final ᲀᲇᛳᲁ(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᛲᛳᛱᲁ;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Fatal exception in coroutines machinery for "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v2, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lxhss/ᲇᛷᛲᛱ;->ᛱᛱᛲᲇ()Lxhss/ᛱᛴᛶᛴ;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {p0}, Lxhss/ᛱᛴᛶᛴ;->ᲇᛶᛴᲀ()Lxhss/ᛴᛵᛳᛵ;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0, v0}, Lxhss/ᲁᛵᛸᛳ;->ᛸᛷᲈᲈ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p1
.end method
