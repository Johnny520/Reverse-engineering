.class public final Lxhss/ᛵᲈᛴᲁ;
.super Lxhss/ᛲᛱᛶᛴ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Z

.field public final synthetic ᛳᲁᲇᛸ:Z

.field public final synthetic ᛷᛴᛷᛱ:Lxhss/ᛱᛳᲈᛷ;

.field public volatile ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᛴ;

.field public final synthetic ᲇᛴᲇᛵ:Lxhss/ᲈᛲᛶᛴ;

.field public final synthetic ᲇᛶᛴᲀ:Lxhss/ᛱᛷᲈᛱ;


# direct methods
.method public constructor <init>(Lxhss/ᛱᛷᲈᛱ;ZZLxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛵᲈᛴᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛱᛷᲈᛱ;

    .line 5
    .line 6
    iput-boolean p2, p0, Lxhss/ᛵᲈᛴᲁ;->ᛱᛱᛲᲇ:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lxhss/ᛵᲈᛴᲁ;->ᛳᲁᲇᛸ:Z

    .line 9
    .line 10
    iput-object p4, p0, Lxhss/ᛵᲈᛴᲁ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛲᛶᛴ;

    .line 11
    .line 12
    iput-object p5, p0, Lxhss/ᛵᲈᛴᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛱᛳᲈᛷ;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-boolean v0, p0, Lxhss/ᛵᲈᛴᲁ;->ᛱᛱᛲᲇ:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛸᛴᛸᛲ()V

    .line 7
    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    iget-object v0, p0, Lxhss/ᛵᲈᛴᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᛴ;

    .line 11
    .line 12
    if-nez v0, :cond_b

    .line 13
    .line 14
    iget-object v0, p0, Lxhss/ᛵᲈᛴᲁ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛲᛶᛴ;

    .line 15
    .line 16
    iget-object v2, p0, Lxhss/ᛵᲈᛴᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛱᛷᲈᛱ;

    .line 17
    .line 18
    iget-object v3, p0, Lxhss/ᛵᲈᛴᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛱᛳᲈᛷ;

    .line 19
    .line 20
    iget-object v4, v0, Lxhss/ᲈᛲᛶᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛱᲁᲈᛷ;

    .line 21
    .line 22
    sget-object v5, Lxhss/ᛱᲁᲈᛷ;->ᲇᛴᲇᛵ:Lxhss/ᛸᛵᛷᛴ;

    .line 23
    .line 24
    const/4 v6, 0x1

    .line 25
    if-ne v2, v5, :cond_1

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v5, v3, Lxhss/ᛱᛳᲈᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 32
    .line 33
    iget-object v7, v4, Lxhss/ᛱᲁᲈᛷ;->ᛳᲁᲇᛸ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    invoke-virtual {v7, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    check-cast v7, Lxhss/ᛴᛲᲀᛵ;

    .line 40
    .line 41
    if-eqz v7, :cond_2

    .line 42
    .line 43
    if-ne v7, v2, :cond_6

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const-class v7, Lxhss/ᛸᛱᲀᛷ;

    .line 47
    .line 48
    invoke-virtual {v5, v7}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    check-cast v7, Lxhss/ᛸᛱᲀᛷ;

    .line 53
    .line 54
    if-nez v7, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-interface {v7}, Lxhss/ᛸᛱᲀᛷ;->value()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    const-class v8, Lxhss/ᛴᛲᲀᛵ;

    .line 62
    .line 63
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    if-nez v8, :cond_4

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    iget-object v8, v4, Lxhss/ᛱᲁᲈᛷ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛱᛲᲀ;

    .line 71
    .line 72
    new-instance v9, Lxhss/ᛱᛳᲈᛷ;

    .line 73
    .line 74
    invoke-direct {v9, v7}, Lxhss/ᛱᛳᲈᛷ;-><init>(Ljava/lang/reflect/Type;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v8, v9, v6}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᲈᛶ(Lxhss/ᛱᛳᲈᛷ;Z)Lxhss/ᲁᲀᛶᛲ;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-interface {v7}, Lxhss/ᲁᲀᛶᛲ;->ᛳᲁᲇᛸ()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    check-cast v7, Lxhss/ᛴᛲᲀᛵ;

    .line 86
    .line 87
    iget-object v8, v4, Lxhss/ᛱᲁᲈᛷ;->ᛳᲁᲇᛸ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 88
    .line 89
    invoke-virtual {v8, v5, v7}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Lxhss/ᛴᛲᲀᛵ;

    .line 94
    .line 95
    if-eqz v5, :cond_5

    .line 96
    .line 97
    move-object v7, v5

    .line 98
    :cond_5
    if-ne v7, v2, :cond_6

    .line 99
    .line 100
    :goto_0
    move-object v2, v4

    .line 101
    :cond_6
    :goto_1
    iget-object v4, v0, Lxhss/ᲈᛲᛶᛴ;->ᛷᛴᛷᛱ:Ljava/util/List;

    .line 102
    .line 103
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    const/4 v5, 0x0

    .line 108
    :cond_7
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-eqz v7, :cond_9

    .line 113
    .line 114
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    check-cast v7, Lxhss/ᛴᛲᲀᛵ;

    .line 119
    .line 120
    if-nez v5, :cond_8

    .line 121
    .line 122
    if-ne v7, v2, :cond_7

    .line 123
    .line 124
    move v5, v6

    .line 125
    goto :goto_2

    .line 126
    :cond_8
    invoke-interface {v7, v0, v3}, Lxhss/ᛴᛲᲀᛵ;->ᛷᛵᛵᲈ(Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    if-eqz v7, :cond_7

    .line 131
    .line 132
    move-object v0, v7

    .line 133
    goto :goto_3

    .line 134
    :cond_9
    if-nez v5, :cond_a

    .line 135
    .line 136
    invoke-virtual {v0, v3}, Lxhss/ᲈᛲᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    :goto_3
    iput-object v0, p0, Lxhss/ᛵᲈᛴᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᛴ;

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_a
    const-string p0, "GSON cannot serialize or deserialize "

    .line 144
    .line 145
    invoke-static {v3, p0}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛶᛴᲈ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-object v1

    .line 149
    :cond_b
    :goto_4
    invoke-virtual {v0, p1}, Lxhss/ᛲᛱᛶᛴ;->ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lxhss/ᛵᲈᛴᲁ;->ᛳᲁᲇᛸ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᛳᲈᲈᛲ()Lxhss/ᛸᲈᲈᛶ;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lxhss/ᛵᲈᛴᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᛴ;

    .line 10
    .line 11
    if-nez v0, :cond_b

    .line 12
    .line 13
    iget-object v0, p0, Lxhss/ᛵᲈᛴᲁ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛲᛶᛴ;

    .line 14
    .line 15
    iget-object v1, p0, Lxhss/ᛵᲈᛴᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛱᛷᲈᛱ;

    .line 16
    .line 17
    iget-object v2, p0, Lxhss/ᛵᲈᛴᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛱᛳᲈᛷ;

    .line 18
    .line 19
    iget-object v3, v0, Lxhss/ᲈᛲᛶᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛱᲁᲈᛷ;

    .line 20
    .line 21
    sget-object v4, Lxhss/ᛱᲁᲈᛷ;->ᲇᛴᲇᛵ:Lxhss/ᛸᛵᛷᛴ;

    .line 22
    .line 23
    const/4 v5, 0x1

    .line 24
    if-ne v1, v4, :cond_1

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v4, v2, Lxhss/ᛱᛳᲈᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 31
    .line 32
    iget-object v6, v3, Lxhss/ᛱᲁᲈᛷ;->ᛳᲁᲇᛸ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    invoke-virtual {v6, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    check-cast v6, Lxhss/ᛴᛲᲀᛵ;

    .line 39
    .line 40
    if-eqz v6, :cond_2

    .line 41
    .line 42
    if-ne v6, v1, :cond_6

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const-class v6, Lxhss/ᛸᛱᲀᛷ;

    .line 46
    .line 47
    invoke-virtual {v4, v6}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    check-cast v6, Lxhss/ᛸᛱᲀᛷ;

    .line 52
    .line 53
    if-nez v6, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-interface {v6}, Lxhss/ᛸᛱᲀᛷ;->value()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    const-class v7, Lxhss/ᛴᛲᲀᛵ;

    .line 61
    .line 62
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-nez v7, :cond_4

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_4
    iget-object v7, v3, Lxhss/ᛱᲁᲈᛷ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛱᛲᲀ;

    .line 70
    .line 71
    new-instance v8, Lxhss/ᛱᛳᲈᛷ;

    .line 72
    .line 73
    invoke-direct {v8, v6}, Lxhss/ᛱᛳᲈᛷ;-><init>(Ljava/lang/reflect/Type;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v7, v8, v5}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᲈᛶ(Lxhss/ᛱᛳᲈᛷ;Z)Lxhss/ᲁᲀᛶᛲ;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-interface {v6}, Lxhss/ᲁᲀᛶᛲ;->ᛳᲁᲇᛸ()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    check-cast v6, Lxhss/ᛴᛲᲀᛵ;

    .line 85
    .line 86
    iget-object v7, v3, Lxhss/ᛱᲁᲈᛷ;->ᛳᲁᲇᛸ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 87
    .line 88
    invoke-virtual {v7, v4, v6}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    check-cast v4, Lxhss/ᛴᛲᲀᛵ;

    .line 93
    .line 94
    if-eqz v4, :cond_5

    .line 95
    .line 96
    move-object v6, v4

    .line 97
    :cond_5
    if-ne v6, v1, :cond_6

    .line 98
    .line 99
    :goto_0
    move-object v1, v3

    .line 100
    :cond_6
    :goto_1
    iget-object v3, v0, Lxhss/ᲈᛲᛶᛴ;->ᛷᛴᛷᛱ:Ljava/util/List;

    .line 101
    .line 102
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    const/4 v4, 0x0

    .line 107
    :cond_7
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-eqz v6, :cond_9

    .line 112
    .line 113
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    check-cast v6, Lxhss/ᛴᛲᲀᛵ;

    .line 118
    .line 119
    if-nez v4, :cond_8

    .line 120
    .line 121
    if-ne v6, v1, :cond_7

    .line 122
    .line 123
    move v4, v5

    .line 124
    goto :goto_2

    .line 125
    :cond_8
    invoke-interface {v6, v0, v2}, Lxhss/ᛴᛲᲀᛵ;->ᛷᛵᛵᲈ(Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    if-eqz v6, :cond_7

    .line 130
    .line 131
    move-object v0, v6

    .line 132
    goto :goto_3

    .line 133
    :cond_9
    if-nez v4, :cond_a

    .line 134
    .line 135
    invoke-virtual {v0, v2}, Lxhss/ᲈᛲᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    :goto_3
    iput-object v0, p0, Lxhss/ᛵᲈᛴᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᛴ;

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_a
    const-string p0, "GSON cannot serialize or deserialize "

    .line 143
    .line 144
    invoke-static {v2, p0}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛶᛴᲈ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_b
    :goto_4
    invoke-virtual {v0, p1, p2}, Lxhss/ᛲᛱᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    return-void
.end method
