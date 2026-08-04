.class public final Lyyds/ᛷᛲᛴᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:Ljava/lang/Object;

.field public ᛲᛴᛳᛲ:Ljava/util/List;

.field public ᛲᲈᲁ:Z

.field public ᛵᛸᛸᛷ:Z

.field public ᛶᛷᛲᲁ:Ljava/lang/Object;

.field public ᲀᛲᛳᲀ:Ljava/lang/Object;

.field public ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public static ᛲᛴᛳᛲ(Lyyds/ᛱᛵᛷ;)V
    .locals 5

    .line 1
    const-string v0, "PRAGMA busy_timeout"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lyyds/ᛱᛵᛷ;->ᲀᛲᛱᛱ(Ljava/lang/String;)Lyyds/ᛵᲇᛱᛸ;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-interface {v0}, Lyyds/ᛵᲇᛱᛸ;->ᛵᲀᛵᛸ()Z

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-interface {v0, v1}, Lyyds/ᛵᲇᛱᛸ;->getLong(I)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {v0, v3}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    const-wide/16 v3, 0xbb8

    .line 20
    .line 21
    cmp-long v0, v1, v3

    .line 22
    .line 23
    if-gez v0, :cond_0

    .line 24
    .line 25
    const-string v0, "PRAGMA busy_timeout = 3000"

    .line 26
    .line 27
    invoke-static {p0, v0}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    :catchall_1
    move-exception v1

    .line 34
    invoke-static {v0, p0}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method


# virtual methods
.method public ᛱᲈᲁ(IIIILyyds/ᛴᲀᲈᛲ;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛲᛷᛲᲇ;

    .line 4
    .line 5
    iput p1, v0, Lyyds/ᛲᛷᛲᲇ;->ᛲᲈᲁ:I

    .line 6
    .line 7
    iput p3, v0, Lyyds/ᛲᛷᛲᲇ;->ᛵᛸᛸᛷ:I

    .line 8
    .line 9
    iput p2, v0, Lyyds/ᛲᛷᛲᲇ;->ᲀᛲᛳᲀ:I

    .line 10
    .line 11
    iput p4, v0, Lyyds/ᛲᛷᛲᲇ;->ᲇᲈᛵᛷ:I

    .line 12
    .line 13
    iget-object p0, p0, Lyyds/ᛷᛲᛴᛸ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lyyds/ᲈᛱᲁᲇ;

    .line 16
    .line 17
    invoke-virtual {p0, p5, v0}, Lyyds/ᲈᛱᲁᲇ;->ᛵᛸᛸᛷ(Lyyds/ᛴᲀᲈᛲ;Lyyds/ᛲᛷᛲᲇ;)V

    .line 18
    .line 19
    .line 20
    iget p0, v0, Lyyds/ᛲᛷᛲᲇ;->ᛲᛴᛳᛲ:I

    .line 21
    .line 22
    invoke-virtual {p5, p0}, Lyyds/ᛴᲀᲈᛲ;->ᛱᛸᲁᲇ(I)V

    .line 23
    .line 24
    .line 25
    iget p0, v0, Lyyds/ᛲᛷᛲᲇ;->ᲇᲇᲇᛱ:I

    .line 26
    .line 27
    invoke-virtual {p5, p0}, Lyyds/ᛴᲀᲈᛲ;->ᛷᲇᛲᛱ(I)V

    .line 28
    .line 29
    .line 30
    iget-boolean p0, v0, Lyyds/ᛲᛷᛲᲇ;->ᛱᲈᲁ:Z

    .line 31
    .line 32
    iput-boolean p0, p5, Lyyds/ᛴᲀᲈᛲ;->ᲀᛲᛱᛱ:Z

    .line 33
    .line 34
    iget p0, v0, Lyyds/ᛲᛷᛲᲇ;->ᛶᛷᛲᲁ:I

    .line 35
    .line 36
    iput p0, p5, Lyyds/ᛴᲀᲈᛲ;->ᲇᲇᲈᲀ:I

    .line 37
    .line 38
    if-lez p0, :cond_0

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 p0, 0x0

    .line 43
    :goto_0
    iput-boolean p0, p5, Lyyds/ᛴᲀᲈᛲ;->ᲀᛲᛱᛱ:Z

    .line 44
    .line 45
    return-void
.end method

.method public ᛲᛲᲈᲈ(Lyyds/ᛱᛵᛷ;)V
    .locals 2

    .line 1
    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᛷᛲᛴᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lyyds/ᛲᛵᲀᛳ;

    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᛲᛵᲀᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljava/lang/String;

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, "\')"

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p1, p0}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public ᛲᛳᛶᲁ()V
    .locals 15

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛲᛴᛸ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛴᛵᛷᛴ;

    .line 4
    .line 5
    iget-object v0, v0, Lyyds/ᛴᛵᛷᛴ;->ᛱᛵᲈᛸ:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_b

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    move-object v7, v1

    .line 22
    check-cast v7, Lyyds/ᛴᲀᲈᛲ;

    .line 23
    .line 24
    iget-boolean v1, v7, Lyyds/ᛴᲀᲈᛲ;->ᛲᲈᲁ:Z

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v1, v7, Lyyds/ᛴᲀᲈᛲ;->ᲈᛲᛳᛶ:[I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    aget v8, v1, v2

    .line 33
    .line 34
    const/4 v9, 0x1

    .line 35
    aget v1, v1, v9

    .line 36
    .line 37
    iget v3, v7, Lyyds/ᛴᲀᲈᛲ;->ᛵᛶᛲᲀ:I

    .line 38
    .line 39
    iget v4, v7, Lyyds/ᛴᲀᲈᛲ;->ᲀᛲᛲᲇ:I

    .line 40
    .line 41
    const/4 v10, 0x3

    .line 42
    const/4 v5, 0x2

    .line 43
    if-eq v8, v5, :cond_2

    .line 44
    .line 45
    if-ne v8, v10, :cond_1

    .line 46
    .line 47
    if-ne v3, v9, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v3, v2

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    :goto_1
    move v3, v9

    .line 53
    :goto_2
    if-eq v1, v5, :cond_3

    .line 54
    .line 55
    if-ne v1, v10, :cond_4

    .line 56
    .line 57
    if-ne v4, v9, :cond_4

    .line 58
    .line 59
    :cond_3
    move v2, v9

    .line 60
    :cond_4
    iget-object v4, v7, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 61
    .line 62
    iget-object v4, v4, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 63
    .line 64
    iget-boolean v6, v4, Lyyds/ᛶᛸᲈᲈ;->ᛷᲈᲈᲁ:Z

    .line 65
    .line 66
    iget-object v11, v7, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 67
    .line 68
    iget-object v11, v11, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 69
    .line 70
    iget-boolean v12, v11, Lyyds/ᛶᛸᲈᲈ;->ᛷᲈᲈᲁ:Z

    .line 71
    .line 72
    move v13, v3

    .line 73
    const/4 v3, 0x1

    .line 74
    if-eqz v6, :cond_5

    .line 75
    .line 76
    if-eqz v12, :cond_5

    .line 77
    .line 78
    iget v4, v4, Lyyds/ᛶᛸᲈᲈ;->ᛶᛷᛲᲁ:I

    .line 79
    .line 80
    iget v6, v11, Lyyds/ᛶᛸᲈᲈ;->ᛶᛷᛲᲁ:I

    .line 81
    .line 82
    move v5, v3

    .line 83
    move-object v2, p0

    .line 84
    invoke-virtual/range {v2 .. v7}, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ(IIIILyyds/ᛴᲀᲈᛲ;)V

    .line 85
    .line 86
    .line 87
    iput-boolean v9, v7, Lyyds/ᛴᲀᲈᛲ;->ᛲᲈᲁ:Z

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_5
    if-eqz v6, :cond_7

    .line 91
    .line 92
    if-eqz v2, :cond_7

    .line 93
    .line 94
    iget v4, v4, Lyyds/ᛶᛸᲈᲈ;->ᛶᛷᛲᲁ:I

    .line 95
    .line 96
    iget v6, v11, Lyyds/ᛶᛸᲈᲈ;->ᛶᛷᛲᲁ:I

    .line 97
    .line 98
    move-object v2, p0

    .line 99
    invoke-virtual/range {v2 .. v7}, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ(IIIILyyds/ᛴᲀᲈᛲ;)V

    .line 100
    .line 101
    .line 102
    iget-object p0, v7, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 103
    .line 104
    if-ne v1, v10, :cond_6

    .line 105
    .line 106
    iget-object p0, p0, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 107
    .line 108
    invoke-virtual {v7}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    iput v1, p0, Lyyds/ᛱᛵᲈᲈ;->ᛲᛲᲈᲈ:I

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_6
    iget-object p0, p0, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 116
    .line 117
    invoke-virtual {v7}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-virtual {p0, v1}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 122
    .line 123
    .line 124
    iput-boolean v9, v7, Lyyds/ᛴᲀᲈᛲ;->ᛲᲈᲁ:Z

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_7
    move-object v2, p0

    .line 128
    if-eqz v12, :cond_9

    .line 129
    .line 130
    if-eqz v13, :cond_9

    .line 131
    .line 132
    iget v4, v4, Lyyds/ᛶᛸᲈᲈ;->ᛶᛷᛲᲁ:I

    .line 133
    .line 134
    iget v6, v11, Lyyds/ᛶᛸᲈᲈ;->ᛶᛷᛲᲁ:I

    .line 135
    .line 136
    move v14, v5

    .line 137
    move v5, v3

    .line 138
    move v3, v14

    .line 139
    invoke-virtual/range {v2 .. v7}, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ(IIIILyyds/ᛴᲀᲈᛲ;)V

    .line 140
    .line 141
    .line 142
    iget-object p0, v7, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 143
    .line 144
    if-ne v8, v10, :cond_8

    .line 145
    .line 146
    iget-object p0, p0, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 147
    .line 148
    invoke-virtual {v7}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    iput v1, p0, Lyyds/ᛱᛵᲈᲈ;->ᛲᛲᲈᲈ:I

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_8
    iget-object p0, p0, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 156
    .line 157
    invoke-virtual {v7}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    invoke-virtual {p0, v1}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 162
    .line 163
    .line 164
    iput-boolean v9, v7, Lyyds/ᛴᲀᲈᛲ;->ᛲᲈᲁ:Z

    .line 165
    .line 166
    :cond_9
    :goto_3
    iget-boolean p0, v7, Lyyds/ᛴᲀᲈᛲ;->ᛲᲈᲁ:Z

    .line 167
    .line 168
    if-eqz p0, :cond_a

    .line 169
    .line 170
    iget-object p0, v7, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 171
    .line 172
    iget-object p0, p0, Lyyds/ᛵᲇᛴᛷ;->ᛷᛵᲇᲀ:Lyyds/ᛳᛱᛴᛱ;

    .line 173
    .line 174
    if-eqz p0, :cond_a

    .line 175
    .line 176
    iget v1, v7, Lyyds/ᛴᲀᲈᛲ;->ᲇᲇᲈᲀ:I

    .line 177
    .line 178
    invoke-virtual {p0, v1}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 179
    .line 180
    .line 181
    :cond_a
    move-object p0, v2

    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_b
    return-void
.end method

.method public ᛲᲈᲁ(Lyyds/ᛶᛸᲈᲈ;ILjava/util/ArrayList;Lyyds/ᛲᛴᛳᲈ;)V
    .locals 6

    .line 1
    iget-object p1, p1, Lyyds/ᛶᛸᲈᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲀᲁᛱ;

    .line 2
    .line 3
    iget-object v0, p1, Lyyds/ᛶᲀᲁᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛴᛳᲈ;

    .line 4
    .line 5
    iget-object v1, p1, Lyyds/ᛶᲀᲁᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛶᛸᲈᲈ;

    .line 6
    .line 7
    iget-object v2, p1, Lyyds/ᛶᲀᲁᛱ;->ᛱᲈᲁ:Lyyds/ᛶᛸᲈᲈ;

    .line 8
    .line 9
    if-nez v0, :cond_a

    .line 10
    .line 11
    iget-object v0, p0, Lyyds/ᛷᛲᛴᛸ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lyyds/ᛴᛵᛷᛴ;

    .line 14
    .line 15
    iget-object v3, v0, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 16
    .line 17
    if-eq p1, v3, :cond_a

    .line 18
    .line 19
    iget-object v0, v0, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 20
    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :cond_0
    if-nez p4, :cond_1

    .line 26
    .line 27
    new-instance p4, Lyyds/ᛲᛴᛳᲈ;

    .line 28
    .line 29
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-object v0, p4, Lyyds/ᛲᛴᛳᲈ;->ᛲᲈᲁ:Lyyds/ᛶᲀᲁᛱ;

    .line 34
    .line 35
    new-instance v0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p4, Lyyds/ᛲᛴᛳᲈ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 41
    .line 42
    iput-object p1, p4, Lyyds/ᛲᛴᛳᲈ;->ᛲᲈᲁ:Lyyds/ᛶᲀᲁᛱ;

    .line 43
    .line 44
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_1
    iput-object p4, p1, Lyyds/ᛶᲀᲁᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛴᛳᲈ;

    .line 48
    .line 49
    iget-object v0, p4, Lyyds/ᛲᛴᛳᲈ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    iget-object v0, v2, Lyyds/ᛶᛸᲈᲈ;->ᛷᛲᲈᛱ:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Lyyds/ᲁᛸᲀᛴ;

    .line 71
    .line 72
    instance-of v4, v3, Lyyds/ᛶᛸᲈᲈ;

    .line 73
    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    check-cast v3, Lyyds/ᛶᛸᲈᲈ;

    .line 77
    .line 78
    invoke-virtual {p0, v3, p2, p3, p4}, Lyyds/ᛷᛲᛴᛸ;->ᛲᲈᲁ(Lyyds/ᛶᛸᲈᲈ;ILjava/util/ArrayList;Lyyds/ᛲᛴᛳᲈ;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    iget-object v0, v1, Lyyds/ᛶᛸᲈᲈ;->ᛷᛲᲈᛱ:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_5

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    check-cast v3, Lyyds/ᲁᛸᲀᛴ;

    .line 99
    .line 100
    instance-of v4, v3, Lyyds/ᛶᛸᲈᲈ;

    .line 101
    .line 102
    if-eqz v4, :cond_4

    .line 103
    .line 104
    check-cast v3, Lyyds/ᛶᛸᲈᲈ;

    .line 105
    .line 106
    invoke-virtual {p0, v3, p2, p3, p4}, Lyyds/ᛷᛲᛴᛸ;->ᛲᲈᲁ(Lyyds/ᛶᛸᲈᲈ;ILjava/util/ArrayList;Lyyds/ᛲᛴᛳᲈ;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    const/4 v0, 0x1

    .line 111
    if-ne p2, v0, :cond_7

    .line 112
    .line 113
    instance-of v3, p1, Lyyds/ᛵᲇᛴᛷ;

    .line 114
    .line 115
    if-eqz v3, :cond_7

    .line 116
    .line 117
    move-object v3, p1

    .line 118
    check-cast v3, Lyyds/ᛵᲇᛴᛷ;

    .line 119
    .line 120
    iget-object v3, v3, Lyyds/ᛵᲇᛴᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛶᛸᲈᲈ;

    .line 121
    .line 122
    iget-object v3, v3, Lyyds/ᛶᛸᲈᲈ;->ᛷᛲᲈᛱ:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    :cond_6
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-eqz v4, :cond_7

    .line 133
    .line 134
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    check-cast v4, Lyyds/ᲁᛸᲀᛴ;

    .line 139
    .line 140
    instance-of v5, v4, Lyyds/ᛶᛸᲈᲈ;

    .line 141
    .line 142
    if-eqz v5, :cond_6

    .line 143
    .line 144
    check-cast v4, Lyyds/ᛶᛸᲈᲈ;

    .line 145
    .line 146
    invoke-virtual {p0, v4, p2, p3, p4}, Lyyds/ᛷᛲᛴᛸ;->ᛲᲈᲁ(Lyyds/ᛶᛸᲈᲈ;ILjava/util/ArrayList;Lyyds/ᛲᛴᛳᲈ;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_7
    iget-object v2, v2, Lyyds/ᛶᛸᲈᲈ;->ᛷᛵᲇᲀ:Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_8

    .line 161
    .line 162
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, Lyyds/ᛶᛸᲈᲈ;

    .line 167
    .line 168
    invoke-virtual {p0, v3, p2, p3, p4}, Lyyds/ᛷᛲᛴᛸ;->ᛲᲈᲁ(Lyyds/ᛶᛸᲈᲈ;ILjava/util/ArrayList;Lyyds/ᛲᛴᛳᲈ;)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_8
    iget-object v1, v1, Lyyds/ᛶᛸᲈᲈ;->ᛷᛵᲇᲀ:Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-eqz v2, :cond_9

    .line 183
    .line 184
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    check-cast v2, Lyyds/ᛶᛸᲈᲈ;

    .line 189
    .line 190
    invoke-virtual {p0, v2, p2, p3, p4}, Lyyds/ᛷᛲᛴᛸ;->ᛲᲈᲁ(Lyyds/ᛶᛸᲈᲈ;ILjava/util/ArrayList;Lyyds/ᛲᛴᛳᲈ;)V

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_9
    if-ne p2, v0, :cond_a

    .line 195
    .line 196
    instance-of v0, p1, Lyyds/ᛵᲇᛴᛷ;

    .line 197
    .line 198
    if-eqz v0, :cond_a

    .line 199
    .line 200
    check-cast p1, Lyyds/ᛵᲇᛴᛷ;

    .line 201
    .line 202
    iget-object p1, p1, Lyyds/ᛵᲇᛴᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛶᛸᲈᲈ;

    .line 203
    .line 204
    iget-object p1, p1, Lyyds/ᛶᛸᲈᲈ;->ᛷᛵᲇᲀ:Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_a

    .line 215
    .line 216
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, Lyyds/ᛶᛸᲈᲈ;

    .line 221
    .line 222
    invoke-virtual {p0, v0, p2, p3, p4}, Lyyds/ᛷᛲᛴᛸ;->ᛲᲈᲁ(Lyyds/ᛶᛸᲈᲈ;ILjava/util/ArrayList;Lyyds/ᛲᛴᛳᲈ;)V

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_a
    :goto_6
    return-void
.end method

.method public ᛵᛸᛸᛷ(Lyyds/ᛴᛵᛷᛴ;)V
    .locals 24

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, v0, Lyyds/ᛴᛵᛷᛴ;->ᛱᛵᲈᛸ:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, v0, Lyyds/ᛴᲀᲈᛲ;->ᲈᛲᛳᛶ:[I

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_2b

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    move-object v9, v3

    .line 22
    check-cast v9, Lyyds/ᛴᲀᲈᛲ;

    .line 23
    .line 24
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᲈᛲᛳᛶ:[I

    .line 25
    .line 26
    iget-object v4, v9, Lyyds/ᛴᲀᲈᛲ;->ᛷᛴᛴᲁ:[Lyyds/ᲀᲈᲁᛲ;

    .line 27
    .line 28
    iget-object v5, v9, Lyyds/ᛴᲀᲈᛲ;->ᛱᛸᲁᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 29
    .line 30
    iget-object v6, v9, Lyyds/ᛴᲀᲈᛲ;->ᲈᛷᲈᛶ:Lyyds/ᲀᲈᲁᛲ;

    .line 31
    .line 32
    iget-object v7, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᛱᲁᛳ:Lyyds/ᲀᲈᲁᛲ;

    .line 33
    .line 34
    iget-object v8, v9, Lyyds/ᛴᲀᲈᛲ;->ᛷᲇᛲᛱ:Lyyds/ᲀᲈᲁᛲ;

    .line 35
    .line 36
    const/4 v10, 0x0

    .line 37
    aget v11, v3, v10

    .line 38
    .line 39
    const/4 v12, 0x1

    .line 40
    aget v3, v3, v12

    .line 41
    .line 42
    iget v13, v9, Lyyds/ᛴᲀᲈᛲ;->ᲈᛳ:I

    .line 43
    .line 44
    const/16 v14, 0x8

    .line 45
    .line 46
    if-ne v13, v14, :cond_1

    .line 47
    .line 48
    iput-boolean v12, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᲈᲁ:Z

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iget v13, v9, Lyyds/ᛴᲀᲈᛲ;->ᛵᲀᲈᛴ:F

    .line 52
    .line 53
    const/high16 v14, 0x3f800000    # 1.0f

    .line 54
    .line 55
    cmpg-float v15, v13, v14

    .line 56
    .line 57
    move/from16 v16, v10

    .line 58
    .line 59
    const/4 v10, 0x3

    .line 60
    move/from16 v17, v14

    .line 61
    .line 62
    const/4 v14, 0x2

    .line 63
    if-gez v15, :cond_2

    .line 64
    .line 65
    if-ne v11, v10, :cond_2

    .line 66
    .line 67
    iput v14, v9, Lyyds/ᛴᲀᲈᛲ;->ᛵᛶᛲᲀ:I

    .line 68
    .line 69
    :cond_2
    iget v15, v9, Lyyds/ᛴᲀᲈᛲ;->ᛵᲀᛵᛸ:F

    .line 70
    .line 71
    cmpg-float v18, v15, v17

    .line 72
    .line 73
    if-gez v18, :cond_3

    .line 74
    .line 75
    if-ne v3, v10, :cond_3

    .line 76
    .line 77
    iput v14, v9, Lyyds/ᛴᲀᲈᛲ;->ᲀᛲᛲᲇ:I

    .line 78
    .line 79
    :cond_3
    iget v14, v9, Lyyds/ᛴᲀᲈᛲ;->ᛴᛸᛴᛸ:F

    .line 80
    .line 81
    const/16 v19, 0x0

    .line 82
    .line 83
    cmpl-float v14, v14, v19

    .line 84
    .line 85
    const/4 v12, 0x2

    .line 86
    if-lez v14, :cond_9

    .line 87
    .line 88
    const/4 v14, 0x1

    .line 89
    if-ne v11, v10, :cond_5

    .line 90
    .line 91
    if-eq v3, v12, :cond_4

    .line 92
    .line 93
    if-ne v3, v14, :cond_5

    .line 94
    .line 95
    :cond_4
    iput v10, v9, Lyyds/ᛴᲀᲈᛲ;->ᛵᛶᛲᲀ:I

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    if-ne v3, v10, :cond_7

    .line 99
    .line 100
    if-eq v11, v12, :cond_6

    .line 101
    .line 102
    if-ne v11, v14, :cond_7

    .line 103
    .line 104
    :cond_6
    iput v10, v9, Lyyds/ᛴᲀᲈᛲ;->ᲀᛲᛲᲇ:I

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_7
    if-ne v11, v10, :cond_9

    .line 108
    .line 109
    if-ne v3, v10, :cond_9

    .line 110
    .line 111
    iget v14, v9, Lyyds/ᛴᲀᲈᛲ;->ᛵᛶᛲᲀ:I

    .line 112
    .line 113
    if-nez v14, :cond_8

    .line 114
    .line 115
    iput v10, v9, Lyyds/ᛴᲀᲈᛲ;->ᛵᛶᛲᲀ:I

    .line 116
    .line 117
    :cond_8
    iget v14, v9, Lyyds/ᛴᲀᲈᛲ;->ᲀᛲᛲᲇ:I

    .line 118
    .line 119
    if-nez v14, :cond_9

    .line 120
    .line 121
    iput v10, v9, Lyyds/ᛴᲀᲈᛲ;->ᲀᛲᛲᲇ:I

    .line 122
    .line 123
    :cond_9
    :goto_1
    if-ne v11, v10, :cond_b

    .line 124
    .line 125
    iget v14, v9, Lyyds/ᛴᲀᲈᛲ;->ᛵᛶᛲᲀ:I

    .line 126
    .line 127
    const/4 v12, 0x1

    .line 128
    if-ne v14, v12, :cond_b

    .line 129
    .line 130
    iget-object v12, v8, Lyyds/ᲀᲈᲁᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᲁᛲ;

    .line 131
    .line 132
    if-eqz v12, :cond_a

    .line 133
    .line 134
    iget-object v12, v7, Lyyds/ᲀᲈᲁᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᲁᛲ;

    .line 135
    .line 136
    if-nez v12, :cond_b

    .line 137
    .line 138
    :cond_a
    const/4 v11, 0x2

    .line 139
    :cond_b
    if-ne v3, v10, :cond_d

    .line 140
    .line 141
    iget v12, v9, Lyyds/ᛴᲀᲈᛲ;->ᲀᛲᛲᲇ:I

    .line 142
    .line 143
    const/4 v14, 0x1

    .line 144
    if-ne v12, v14, :cond_d

    .line 145
    .line 146
    iget-object v12, v6, Lyyds/ᲀᲈᲁᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᲁᛲ;

    .line 147
    .line 148
    if-eqz v12, :cond_c

    .line 149
    .line 150
    iget-object v12, v5, Lyyds/ᲀᲈᲁᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᲁᛲ;

    .line 151
    .line 152
    if-nez v12, :cond_d

    .line 153
    .line 154
    :cond_c
    const/4 v3, 0x2

    .line 155
    :cond_d
    iget-object v12, v9, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 156
    .line 157
    iput v11, v12, Lyyds/ᛶᲀᲁᛱ;->ᲇᲈᛵᛷ:I

    .line 158
    .line 159
    iget v14, v9, Lyyds/ᛴᲀᲈᛲ;->ᛵᛶᛲᲀ:I

    .line 160
    .line 161
    iput v14, v12, Lyyds/ᛶᲀᲁᛱ;->ᛲᲈᲁ:I

    .line 162
    .line 163
    iget-object v12, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 164
    .line 165
    iput v3, v12, Lyyds/ᛶᲀᲁᛱ;->ᲇᲈᛵᛷ:I

    .line 166
    .line 167
    iget v10, v9, Lyyds/ᛴᲀᲈᛲ;->ᲀᛲᛲᲇ:I

    .line 168
    .line 169
    iput v10, v12, Lyyds/ᛶᲀᲁᛱ;->ᛲᲈᲁ:I

    .line 170
    .line 171
    const/4 v12, 0x4

    .line 172
    if-eq v11, v12, :cond_e

    .line 173
    .line 174
    const/4 v12, 0x1

    .line 175
    if-eq v11, v12, :cond_e

    .line 176
    .line 177
    const/4 v12, 0x2

    .line 178
    if-ne v11, v12, :cond_10

    .line 179
    .line 180
    :cond_e
    const/4 v12, 0x4

    .line 181
    if-eq v3, v12, :cond_f

    .line 182
    .line 183
    const/4 v12, 0x1

    .line 184
    if-eq v3, v12, :cond_28

    .line 185
    .line 186
    const/4 v12, 0x2

    .line 187
    if-ne v3, v12, :cond_10

    .line 188
    .line 189
    :cond_f
    const/16 v20, 0x1

    .line 190
    .line 191
    goto/16 :goto_c

    .line 192
    .line 193
    :cond_10
    const/high16 v21, 0x3f000000    # 0.5f

    .line 194
    .line 195
    const/4 v5, 0x3

    .line 196
    if-ne v11, v5, :cond_1a

    .line 197
    .line 198
    if-eq v3, v12, :cond_12

    .line 199
    .line 200
    const/4 v7, 0x1

    .line 201
    if-ne v3, v7, :cond_11

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_11
    move/from16 v23, v7

    .line 205
    .line 206
    move v7, v3

    .line 207
    move v3, v5

    .line 208
    move/from16 v5, v23

    .line 209
    .line 210
    goto/16 :goto_5

    .line 211
    .line 212
    :cond_12
    :goto_2
    if-ne v14, v5, :cond_14

    .line 213
    .line 214
    if-ne v3, v12, :cond_13

    .line 215
    .line 216
    const/4 v6, 0x0

    .line 217
    const/4 v8, 0x0

    .line 218
    move v7, v12

    .line 219
    move-object/from16 v4, p0

    .line 220
    .line 221
    move v5, v12

    .line 222
    invoke-virtual/range {v4 .. v9}, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ(IIIILyyds/ᛴᲀᲈᛲ;)V

    .line 223
    .line 224
    .line 225
    :cond_13
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    int-to-float v3, v8

    .line 230
    iget v4, v9, Lyyds/ᛴᲀᲈᛲ;->ᛴᛸᛴᛸ:F

    .line 231
    .line 232
    mul-float/2addr v3, v4

    .line 233
    add-float v3, v3, v21

    .line 234
    .line 235
    float-to-int v6, v3

    .line 236
    const/16 v20, 0x1

    .line 237
    .line 238
    move/from16 v7, v20

    .line 239
    .line 240
    move-object/from16 v4, p0

    .line 241
    .line 242
    move/from16 v5, v20

    .line 243
    .line 244
    invoke-virtual/range {v4 .. v9}, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ(IIIILyyds/ᛴᲀᲈᛲ;)V

    .line 245
    .line 246
    .line 247
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 248
    .line 249
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 250
    .line 251
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    invoke-virtual {v3, v4}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 256
    .line 257
    .line 258
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 259
    .line 260
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 261
    .line 262
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    invoke-virtual {v3, v4}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 267
    .line 268
    .line 269
    const/4 v12, 0x1

    .line 270
    iput-boolean v12, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᲈᲁ:Z

    .line 271
    .line 272
    goto/16 :goto_0

    .line 273
    .line 274
    :cond_14
    move v7, v12

    .line 275
    const/4 v5, 0x1

    .line 276
    const/4 v12, 0x1

    .line 277
    if-ne v14, v12, :cond_15

    .line 278
    .line 279
    const/4 v6, 0x0

    .line 280
    const/4 v8, 0x0

    .line 281
    move-object/from16 v4, p0

    .line 282
    .line 283
    move v5, v7

    .line 284
    move v7, v3

    .line 285
    invoke-virtual/range {v4 .. v9}, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ(IIIILyyds/ᛴᲀᲈᛲ;)V

    .line 286
    .line 287
    .line 288
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 289
    .line 290
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 291
    .line 292
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    iput v4, v3, Lyyds/ᛱᛵᲈᲈ;->ᛲᛲᲈᲈ:I

    .line 297
    .line 298
    goto/16 :goto_0

    .line 299
    .line 300
    :cond_15
    move v12, v7

    .line 301
    move v7, v3

    .line 302
    const/4 v3, 0x2

    .line 303
    if-ne v14, v3, :cond_18

    .line 304
    .line 305
    aget v3, v2, v16

    .line 306
    .line 307
    if-eq v3, v5, :cond_17

    .line 308
    .line 309
    const/4 v6, 0x4

    .line 310
    if-ne v3, v6, :cond_16

    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_16
    :goto_3
    const/4 v3, 0x3

    .line 314
    goto :goto_5

    .line 315
    :cond_17
    :goto_4
    invoke-virtual {v0}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    int-to-float v3, v3

    .line 320
    mul-float/2addr v13, v3

    .line 321
    add-float v13, v13, v21

    .line 322
    .line 323
    float-to-int v6, v13

    .line 324
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    move-object/from16 v4, p0

    .line 329
    .line 330
    invoke-virtual/range {v4 .. v9}, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ(IIIILyyds/ᛴᲀᲈᛲ;)V

    .line 331
    .line 332
    .line 333
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 334
    .line 335
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 336
    .line 337
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    invoke-virtual {v3, v4}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 342
    .line 343
    .line 344
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 345
    .line 346
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 347
    .line 348
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    invoke-virtual {v3, v4}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 353
    .line 354
    .line 355
    const/4 v3, 0x1

    .line 356
    iput-boolean v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᲈᲁ:Z

    .line 357
    .line 358
    goto/16 :goto_0

    .line 359
    .line 360
    :cond_18
    const/4 v3, 0x1

    .line 361
    aget-object v6, v4, v16

    .line 362
    .line 363
    iget-object v6, v6, Lyyds/ᲀᲈᲁᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᲁᛲ;

    .line 364
    .line 365
    if-eqz v6, :cond_19

    .line 366
    .line 367
    aget-object v6, v4, v3

    .line 368
    .line 369
    iget-object v3, v6, Lyyds/ᲀᲈᲁᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᲁᛲ;

    .line 370
    .line 371
    if-nez v3, :cond_16

    .line 372
    .line 373
    :cond_19
    const/4 v6, 0x0

    .line 374
    const/4 v8, 0x0

    .line 375
    move-object/from16 v4, p0

    .line 376
    .line 377
    move v5, v12

    .line 378
    invoke-virtual/range {v4 .. v9}, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ(IIIILyyds/ᛴᲀᲈᛲ;)V

    .line 379
    .line 380
    .line 381
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 382
    .line 383
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 384
    .line 385
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    invoke-virtual {v3, v4}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 390
    .line 391
    .line 392
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 393
    .line 394
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 395
    .line 396
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    invoke-virtual {v3, v4}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 401
    .line 402
    .line 403
    const/4 v12, 0x1

    .line 404
    iput-boolean v12, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᲈᲁ:Z

    .line 405
    .line 406
    goto/16 :goto_0

    .line 407
    .line 408
    :cond_1a
    move v7, v3

    .line 409
    const/4 v5, 0x1

    .line 410
    goto :goto_3

    .line 411
    :goto_5
    if-ne v7, v3, :cond_25

    .line 412
    .line 413
    if-eq v11, v12, :cond_1c

    .line 414
    .line 415
    if-ne v11, v5, :cond_1b

    .line 416
    .line 417
    goto :goto_7

    .line 418
    :cond_1b
    move v4, v3

    .line 419
    move v3, v7

    .line 420
    move v7, v12

    .line 421
    :goto_6
    const/4 v12, 0x1

    .line 422
    goto/16 :goto_a

    .line 423
    .line 424
    :cond_1c
    :goto_7
    if-ne v10, v3, :cond_1f

    .line 425
    .line 426
    if-ne v11, v12, :cond_1d

    .line 427
    .line 428
    const/4 v6, 0x0

    .line 429
    const/4 v8, 0x0

    .line 430
    move v7, v12

    .line 431
    move-object/from16 v4, p0

    .line 432
    .line 433
    move/from16 v20, v5

    .line 434
    .line 435
    move v5, v12

    .line 436
    invoke-virtual/range {v4 .. v9}, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ(IIIILyyds/ᛴᲀᲈᛲ;)V

    .line 437
    .line 438
    .line 439
    goto :goto_8

    .line 440
    :cond_1d
    move/from16 v20, v5

    .line 441
    .line 442
    :goto_8
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 443
    .line 444
    .line 445
    move-result v6

    .line 446
    iget v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᛴᛸᛴᛸ:F

    .line 447
    .line 448
    iget v4, v9, Lyyds/ᛴᲀᲈᛲ;->ᛵᲈᲇᛵ:I

    .line 449
    .line 450
    const/4 v5, -0x1

    .line 451
    if-ne v4, v5, :cond_1e

    .line 452
    .line 453
    div-float v3, v17, v3

    .line 454
    .line 455
    :cond_1e
    int-to-float v4, v6

    .line 456
    mul-float/2addr v4, v3

    .line 457
    add-float v4, v4, v21

    .line 458
    .line 459
    float-to-int v8, v4

    .line 460
    move/from16 v7, v20

    .line 461
    .line 462
    move-object/from16 v4, p0

    .line 463
    .line 464
    move/from16 v5, v20

    .line 465
    .line 466
    invoke-virtual/range {v4 .. v9}, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ(IIIILyyds/ᛴᲀᲈᛲ;)V

    .line 467
    .line 468
    .line 469
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 470
    .line 471
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 472
    .line 473
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 474
    .line 475
    .line 476
    move-result v4

    .line 477
    invoke-virtual {v3, v4}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 478
    .line 479
    .line 480
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 481
    .line 482
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 483
    .line 484
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 485
    .line 486
    .line 487
    move-result v4

    .line 488
    invoke-virtual {v3, v4}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 489
    .line 490
    .line 491
    const/4 v12, 0x1

    .line 492
    iput-boolean v12, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᲈᲁ:Z

    .line 493
    .line 494
    goto/16 :goto_0

    .line 495
    .line 496
    :cond_1f
    move v3, v7

    .line 497
    move v7, v12

    .line 498
    const/4 v12, 0x1

    .line 499
    if-ne v10, v12, :cond_20

    .line 500
    .line 501
    const/4 v6, 0x0

    .line 502
    const/4 v8, 0x0

    .line 503
    move-object/from16 v4, p0

    .line 504
    .line 505
    move v5, v11

    .line 506
    invoke-virtual/range {v4 .. v9}, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ(IIIILyyds/ᛴᲀᲈᛲ;)V

    .line 507
    .line 508
    .line 509
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 510
    .line 511
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 512
    .line 513
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 514
    .line 515
    .line 516
    move-result v4

    .line 517
    iput v4, v3, Lyyds/ᛱᛵᲈᲈ;->ᛲᛲᲈᲈ:I

    .line 518
    .line 519
    goto/16 :goto_0

    .line 520
    .line 521
    :cond_20
    const/4 v6, 0x2

    .line 522
    if-ne v10, v6, :cond_23

    .line 523
    .line 524
    aget v4, v2, v12

    .line 525
    .line 526
    if-eq v4, v5, :cond_22

    .line 527
    .line 528
    const/4 v6, 0x4

    .line 529
    if-ne v4, v6, :cond_21

    .line 530
    .line 531
    goto :goto_9

    .line 532
    :cond_21
    const/4 v4, 0x3

    .line 533
    goto :goto_6

    .line 534
    :cond_22
    :goto_9
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 535
    .line 536
    .line 537
    move-result v6

    .line 538
    invoke-virtual {v0}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 539
    .line 540
    .line 541
    move-result v3

    .line 542
    int-to-float v3, v3

    .line 543
    mul-float/2addr v15, v3

    .line 544
    add-float v15, v15, v21

    .line 545
    .line 546
    float-to-int v8, v15

    .line 547
    move-object/from16 v4, p0

    .line 548
    .line 549
    move v7, v5

    .line 550
    move v5, v11

    .line 551
    invoke-virtual/range {v4 .. v9}, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ(IIIILyyds/ᛴᲀᲈᛲ;)V

    .line 552
    .line 553
    .line 554
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 555
    .line 556
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 557
    .line 558
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 559
    .line 560
    .line 561
    move-result v4

    .line 562
    invoke-virtual {v3, v4}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 563
    .line 564
    .line 565
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 566
    .line 567
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 568
    .line 569
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 570
    .line 571
    .line 572
    move-result v4

    .line 573
    invoke-virtual {v3, v4}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 574
    .line 575
    .line 576
    const/4 v12, 0x1

    .line 577
    iput-boolean v12, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᲈᲁ:Z

    .line 578
    .line 579
    goto/16 :goto_0

    .line 580
    .line 581
    :cond_23
    move/from16 v18, v6

    .line 582
    .line 583
    aget-object v6, v4, v18

    .line 584
    .line 585
    iget-object v6, v6, Lyyds/ᲀᲈᲁᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᲁᛲ;

    .line 586
    .line 587
    if-eqz v6, :cond_24

    .line 588
    .line 589
    const/16 v22, 0x3

    .line 590
    .line 591
    aget-object v4, v4, v22

    .line 592
    .line 593
    iget-object v4, v4, Lyyds/ᲀᲈᲁᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᲁᛲ;

    .line 594
    .line 595
    if-nez v4, :cond_21

    .line 596
    .line 597
    :cond_24
    const/4 v6, 0x0

    .line 598
    const/4 v8, 0x0

    .line 599
    move-object/from16 v4, p0

    .line 600
    .line 601
    move v5, v7

    .line 602
    move v7, v3

    .line 603
    invoke-virtual/range {v4 .. v9}, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ(IIIILyyds/ᛴᲀᲈᛲ;)V

    .line 604
    .line 605
    .line 606
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 607
    .line 608
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 609
    .line 610
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 611
    .line 612
    .line 613
    move-result v4

    .line 614
    invoke-virtual {v3, v4}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 615
    .line 616
    .line 617
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 618
    .line 619
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 620
    .line 621
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 622
    .line 623
    .line 624
    move-result v4

    .line 625
    invoke-virtual {v3, v4}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 626
    .line 627
    .line 628
    const/4 v12, 0x1

    .line 629
    iput-boolean v12, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᲈᲁ:Z

    .line 630
    .line 631
    goto/16 :goto_0

    .line 632
    .line 633
    :cond_25
    move v3, v7

    .line 634
    move v7, v12

    .line 635
    const/4 v12, 0x1

    .line 636
    const/4 v4, 0x3

    .line 637
    :goto_a
    if-ne v11, v4, :cond_0

    .line 638
    .line 639
    if-ne v3, v4, :cond_0

    .line 640
    .line 641
    if-eq v14, v12, :cond_27

    .line 642
    .line 643
    if-ne v10, v12, :cond_26

    .line 644
    .line 645
    goto :goto_b

    .line 646
    :cond_26
    const/4 v3, 0x2

    .line 647
    if-ne v10, v3, :cond_0

    .line 648
    .line 649
    if-ne v14, v3, :cond_0

    .line 650
    .line 651
    aget v3, v2, v16

    .line 652
    .line 653
    if-ne v3, v5, :cond_0

    .line 654
    .line 655
    aget v3, v2, v12

    .line 656
    .line 657
    if-ne v3, v5, :cond_0

    .line 658
    .line 659
    invoke-virtual {v0}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 660
    .line 661
    .line 662
    move-result v3

    .line 663
    int-to-float v3, v3

    .line 664
    mul-float/2addr v13, v3

    .line 665
    add-float v13, v13, v21

    .line 666
    .line 667
    float-to-int v6, v13

    .line 668
    invoke-virtual {v0}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 669
    .line 670
    .line 671
    move-result v3

    .line 672
    int-to-float v3, v3

    .line 673
    mul-float/2addr v15, v3

    .line 674
    add-float v15, v15, v21

    .line 675
    .line 676
    float-to-int v8, v15

    .line 677
    move v7, v5

    .line 678
    move-object/from16 v4, p0

    .line 679
    .line 680
    invoke-virtual/range {v4 .. v9}, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ(IIIILyyds/ᛴᲀᲈᛲ;)V

    .line 681
    .line 682
    .line 683
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 684
    .line 685
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 686
    .line 687
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 688
    .line 689
    .line 690
    move-result v4

    .line 691
    invoke-virtual {v3, v4}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 692
    .line 693
    .line 694
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 695
    .line 696
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 697
    .line 698
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 699
    .line 700
    .line 701
    move-result v4

    .line 702
    invoke-virtual {v3, v4}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 703
    .line 704
    .line 705
    const/4 v12, 0x1

    .line 706
    iput-boolean v12, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᲈᲁ:Z

    .line 707
    .line 708
    goto/16 :goto_0

    .line 709
    .line 710
    :cond_27
    :goto_b
    const/4 v6, 0x0

    .line 711
    const/4 v8, 0x0

    .line 712
    move v5, v7

    .line 713
    move-object/from16 v4, p0

    .line 714
    .line 715
    invoke-virtual/range {v4 .. v9}, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ(IIIILyyds/ᛴᲀᲈᛲ;)V

    .line 716
    .line 717
    .line 718
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 719
    .line 720
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 721
    .line 722
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 723
    .line 724
    .line 725
    move-result v4

    .line 726
    iput v4, v3, Lyyds/ᛱᛵᲈᲈ;->ᛲᛲᲈᲈ:I

    .line 727
    .line 728
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 729
    .line 730
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 731
    .line 732
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 733
    .line 734
    .line 735
    move-result v4

    .line 736
    iput v4, v3, Lyyds/ᛱᛵᲈᲈ;->ᛲᛲᲈᲈ:I

    .line 737
    .line 738
    goto/16 :goto_0

    .line 739
    .line 740
    :cond_28
    move/from16 v20, v12

    .line 741
    .line 742
    :goto_c
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 743
    .line 744
    .line 745
    move-result v4

    .line 746
    const/4 v12, 0x4

    .line 747
    if-ne v11, v12, :cond_29

    .line 748
    .line 749
    invoke-virtual {v0}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 750
    .line 751
    .line 752
    move-result v4

    .line 753
    iget v8, v8, Lyyds/ᲀᲈᲁᛲ;->ᛶᛷᛲᲁ:I

    .line 754
    .line 755
    sub-int/2addr v4, v8

    .line 756
    iget v7, v7, Lyyds/ᲀᲈᲁᛲ;->ᛶᛷᛲᲁ:I

    .line 757
    .line 758
    sub-int/2addr v4, v7

    .line 759
    move/from16 v11, v20

    .line 760
    .line 761
    :cond_29
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 762
    .line 763
    .line 764
    move-result v7

    .line 765
    if-ne v3, v12, :cond_2a

    .line 766
    .line 767
    invoke-virtual {v0}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 768
    .line 769
    .line 770
    move-result v3

    .line 771
    iget v6, v6, Lyyds/ᲀᲈᲁᛲ;->ᛶᛷᛲᲁ:I

    .line 772
    .line 773
    sub-int/2addr v3, v6

    .line 774
    iget v5, v5, Lyyds/ᲀᲈᲁᛲ;->ᛶᛷᛲᲁ:I

    .line 775
    .line 776
    sub-int v7, v3, v5

    .line 777
    .line 778
    move v8, v7

    .line 779
    move/from16 v7, v20

    .line 780
    .line 781
    :goto_d
    move v6, v4

    .line 782
    move v5, v11

    .line 783
    move-object/from16 v4, p0

    .line 784
    .line 785
    goto :goto_e

    .line 786
    :cond_2a
    move v8, v7

    .line 787
    move v7, v3

    .line 788
    goto :goto_d

    .line 789
    :goto_e
    invoke-virtual/range {v4 .. v9}, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ(IIIILyyds/ᛴᲀᲈᛲ;)V

    .line 790
    .line 791
    .line 792
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 793
    .line 794
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 795
    .line 796
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛳᲁᲁᲇ()I

    .line 797
    .line 798
    .line 799
    move-result v4

    .line 800
    invoke-virtual {v3, v4}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 801
    .line 802
    .line 803
    iget-object v3, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 804
    .line 805
    iget-object v3, v3, Lyyds/ᛶᲀᲁᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲈ;

    .line 806
    .line 807
    invoke-virtual {v9}, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛶᲁ()I

    .line 808
    .line 809
    .line 810
    move-result v4

    .line 811
    invoke-virtual {v3, v4}, Lyyds/ᛱᛵᲈᲈ;->ᲇᲈᛵᛷ(I)V

    .line 812
    .line 813
    .line 814
    const/4 v12, 0x1

    .line 815
    iput-boolean v12, v9, Lyyds/ᛴᲀᲈᛲ;->ᛲᲈᲁ:Z

    .line 816
    .line 817
    goto/16 :goto_0

    .line 818
    .line 819
    :cond_2b
    return-void
.end method

.method public ᛶᛷᛲᲁ(Lyyds/ᛶᲀᲁᛱ;ILjava/util/ArrayList;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lyyds/ᛶᲀᲁᛱ;->ᛱᲈᲁ:Lyyds/ᛶᛸᲈᲈ;

    .line 2
    .line 3
    iget-object v1, p1, Lyyds/ᛶᲀᲁᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛶᛸᲈᲈ;

    .line 4
    .line 5
    iget-object v0, v0, Lyyds/ᛶᛸᲈᲈ;->ᛷᛲᲈᛱ:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lyyds/ᲁᛸᲀᛴ;

    .line 23
    .line 24
    instance-of v4, v2, Lyyds/ᛶᛸᲈᲈ;

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    check-cast v2, Lyyds/ᛶᛸᲈᲈ;

    .line 29
    .line 30
    invoke-virtual {p0, v2, p2, p3, v3}, Lyyds/ᛷᛲᛴᛸ;->ᛲᲈᲁ(Lyyds/ᛶᛸᲈᲈ;ILjava/util/ArrayList;Lyyds/ᛲᛴᛳᲈ;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    instance-of v4, v2, Lyyds/ᛶᲀᲁᛱ;

    .line 35
    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    check-cast v2, Lyyds/ᛶᲀᲁᛱ;

    .line 39
    .line 40
    iget-object v2, v2, Lyyds/ᛶᲀᲁᛱ;->ᛱᲈᲁ:Lyyds/ᛶᛸᲈᲈ;

    .line 41
    .line 42
    invoke-virtual {p0, v2, p2, p3, v3}, Lyyds/ᛷᛲᛴᛸ;->ᛲᲈᲁ(Lyyds/ᛶᛸᲈᲈ;ILjava/util/ArrayList;Lyyds/ᛲᛴᛳᲈ;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-object v0, v1, Lyyds/ᛶᛸᲈᲈ;->ᛷᛲᲈᛱ:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lyyds/ᲁᛸᲀᛴ;

    .line 63
    .line 64
    instance-of v2, v1, Lyyds/ᛶᛸᲈᲈ;

    .line 65
    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    check-cast v1, Lyyds/ᛶᛸᲈᲈ;

    .line 69
    .line 70
    invoke-virtual {p0, v1, p2, p3, v3}, Lyyds/ᛷᛲᛴᛸ;->ᛲᲈᲁ(Lyyds/ᛶᛸᲈᲈ;ILjava/util/ArrayList;Lyyds/ᛲᛴᛳᲈ;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    instance-of v2, v1, Lyyds/ᛶᲀᲁᛱ;

    .line 75
    .line 76
    if-eqz v2, :cond_3

    .line 77
    .line 78
    check-cast v1, Lyyds/ᛶᲀᲁᛱ;

    .line 79
    .line 80
    iget-object v1, v1, Lyyds/ᛶᲀᲁᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛶᛸᲈᲈ;

    .line 81
    .line 82
    invoke-virtual {p0, v1, p2, p3, v3}, Lyyds/ᛷᛲᛴᛸ;->ᛲᲈᲁ(Lyyds/ᛶᛸᲈᲈ;ILjava/util/ArrayList;Lyyds/ᛲᛴᛳᲈ;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    const/4 v0, 0x1

    .line 87
    if-ne p2, v0, :cond_7

    .line 88
    .line 89
    check-cast p1, Lyyds/ᛵᲇᛴᛷ;

    .line 90
    .line 91
    iget-object p1, p1, Lyyds/ᛵᲇᛴᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛶᛸᲈᲈ;

    .line 92
    .line 93
    iget-object p1, p1, Lyyds/ᛶᛸᲈᲈ;->ᛷᛲᲈᛱ:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_7

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Lyyds/ᲁᛸᲀᛴ;

    .line 110
    .line 111
    instance-of v1, v0, Lyyds/ᛶᛸᲈᲈ;

    .line 112
    .line 113
    if-eqz v1, :cond_6

    .line 114
    .line 115
    check-cast v0, Lyyds/ᛶᛸᲈᲈ;

    .line 116
    .line 117
    invoke-virtual {p0, v0, p2, p3, v3}, Lyyds/ᛷᛲᛴᛸ;->ᛲᲈᲁ(Lyyds/ᛶᛸᲈᲈ;ILjava/util/ArrayList;Lyyds/ᛲᛴᛳᲈ;)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_7
    return-void
.end method

.method public ᛷᛲᲈᛱ(Lyyds/ᛱᛵᛷ;II)V
    .locals 6

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛲᛴᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛲᛵᲀᛳ;

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᛷᛲᛴᛸ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lyyds/ᛳᛲᲈᛲ;

    .line 8
    .line 9
    iget-object v2, v1, Lyyds/ᛳᛲᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛵᛱᲇ;

    .line 10
    .line 11
    invoke-static {v2, p2, p3}, Lyyds/ᛷᛴᲇᛲ;->ᲇᲇᲇᛱ(Lyyds/ᲁᛵᛱᲇ;II)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_3

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lyyds/ᛲᛵᲀᛳ;->ᛶᲈᛴᲈ(Lyyds/ᛱᛵᛷ;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    if-eqz p3, :cond_1

    .line 29
    .line 30
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    check-cast p3, Lyyds/ᛵᛱᲁᲁ;

    .line 35
    .line 36
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    instance-of v1, p1, Lyyds/ᛷᛳᲇᛲ;

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    move-object v1, p1

    .line 44
    check-cast v1, Lyyds/ᛷᛳᲇᛲ;

    .line 45
    .line 46
    iget-object v1, v1, Lyyds/ᛷᛳᲇᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛴᲀᛷ;

    .line 47
    .line 48
    iget p3, p3, Lyyds/ᛵᛱᲁᲁ;->ᲀᛲᛳᲀ:I

    .line 49
    .line 50
    packed-switch p3, :pswitch_data_0

    .line 51
    .line 52
    .line 53
    const-wide v2, -0x5c568e68a836eL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    const-wide v2, -0x5c56be68a836eL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    invoke-virtual {v1, p3}, Lyyds/ᛳᛴᲀᛷ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-wide v2, -0x5c5a4e68a836eL

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    invoke-virtual {v1, p3}, Lyyds/ᛳᛴᲀᛷ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-wide v2, -0x5c5dae68a836eL

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    invoke-virtual {v1, p3}, Lyyds/ᛳᛴᲀᛷ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :pswitch_0
    const-wide v2, -0x10dbe68a836eL

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    const-wide v2, -0x10dee68a836eL

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    invoke-virtual {v1, p3}, Lyyds/ᛳᛴᲀᛷ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :pswitch_1
    const-wide v2, -0x60c22e68a836eL

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    const-wide v2, -0x60c25e68a836eL

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p3

    .line 136
    invoke-virtual {v1, p3}, Lyyds/ᛳᛴᲀᛷ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const-wide v2, -0x60c64e68a836eL

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p3

    .line 148
    invoke-virtual {v1, p3}, Lyyds/ᛳᛴᲀᛷ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_0
    new-instance p0, Lyyds/ᛴᛵᲈᛷ;

    .line 153
    .line 154
    const-string p1, "Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function."

    .line 155
    .line 156
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p0

    .line 160
    :cond_1
    invoke-virtual {v0, p1}, Lyyds/ᛲᛵᲀᛳ;->ᛶᛸᲀᲁ(Lyyds/ᛱᛵᛷ;)Lyyds/ᛷᛶᛳᛸ;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    iget-boolean p3, p2, Lyyds/ᛷᛶᛳᛸ;->ᛲᲈᲁ:Z

    .line 165
    .line 166
    if-eqz p3, :cond_2

    .line 167
    .line 168
    invoke-virtual {v0}, Lyyds/ᛲᛵᲀᛳ;->ᛳᛸᛴᛶ()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, p1}, Lyyds/ᛷᛲᛴᛸ;->ᛲᛲᲈᲈ(Lyyds/ᛱᛵᛷ;)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 176
    .line 177
    iget-object p1, p2, Lyyds/ᛷᛶᛳᛸ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast p1, Ljava/lang/String;

    .line 180
    .line 181
    new-instance p2, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    const-string p3, "Migration didn\'t properly handle: "

    .line 184
    .line 185
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw p0

    .line 203
    :cond_3
    const/4 v2, 0x1

    .line 204
    const/4 v3, 0x0

    .line 205
    if-le p2, p3, :cond_4

    .line 206
    .line 207
    iget-boolean v4, v1, Lyyds/ᛳᛲᲈᛲ;->ᛷᛵᲇᲀ:Z

    .line 208
    .line 209
    if-eqz v4, :cond_4

    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_4
    iget-object v4, v1, Lyyds/ᛳᛲᲈᛲ;->ᛲᛲᲈᲈ:Ljava/util/Set;

    .line 213
    .line 214
    iget-boolean v5, v1, Lyyds/ᛳᛲᲈᛲ;->ᛷᛲᲈᛱ:Z

    .line 215
    .line 216
    if-eqz v5, :cond_6

    .line 217
    .line 218
    if-eqz v4, :cond_5

    .line 219
    .line 220
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    if-nez v4, :cond_6

    .line 229
    .line 230
    :cond_5
    move v4, v2

    .line 231
    goto :goto_2

    .line 232
    :cond_6
    :goto_1
    move v4, v3

    .line 233
    :goto_2
    if-nez v4, :cond_e

    .line 234
    .line 235
    iget-boolean p2, v1, Lyyds/ᛳᛲᲈᛲ;->ᲇᛱᛲ:Z

    .line 236
    .line 237
    if-eqz p2, :cond_b

    .line 238
    .line 239
    const-string p2, "SELECT name, type FROM sqlite_master WHERE type = \'table\' OR type = \'view\'"

    .line 240
    .line 241
    invoke-interface {p1, p2}, Lyyds/ᛱᛵᛷ;->ᲀᛲᛱᛱ(Ljava/lang/String;)Lyyds/ᛵᲇᛱᛸ;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    :try_start_0
    invoke-static {}, Lyyds/ᛷᛸ;->ᛲᛴᛳᛲ()Lyyds/ᲈᛱᛱᛴ;

    .line 246
    .line 247
    .line 248
    move-result-object p3

    .line 249
    :cond_7
    :goto_3
    invoke-interface {p2}, Lyyds/ᛵᲇᛱᛸ;->ᛵᲀᛵᛸ()Z

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    if-eqz v1, :cond_9

    .line 254
    .line 255
    invoke-interface {p2, v3}, Lyyds/ᛵᲇᛱᛸ;->ᛱᲈᲁ(I)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    const-string v4, "sqlite_"

    .line 260
    .line 261
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    if-nez v4, :cond_7

    .line 266
    .line 267
    const-string v4, "android_metadata"

    .line 268
    .line 269
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    if-eqz v4, :cond_8

    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_8
    invoke-interface {p2, v2}, Lyyds/ᛵᲇᛱᛸ;->ᛱᲈᲁ(I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    const-string v5, "view"

    .line 281
    .line 282
    invoke-static {v4, v5}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    new-instance v5, Lkotlin/Pair;

    .line 291
    .line 292
    invoke-direct {v5, v1, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p3, v5}, Lyyds/ᲈᛱᛱᛴ;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    goto :goto_3

    .line 299
    :catchall_0
    move-exception p0

    .line 300
    goto :goto_5

    .line 301
    :cond_9
    invoke-static {p3}, Lyyds/ᛷᛸ;->ᲇᲈᛵᛷ(Lyyds/ᲈᛱᛱᛴ;)Lyyds/ᲈᛱᛱᛴ;

    .line 302
    .line 303
    .line 304
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 305
    const/4 v1, 0x0

    .line 306
    invoke-static {p2, v1}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p3, v3}, Lyyds/ᲈᛱᛱᛴ;->listIterator(I)Ljava/util/ListIterator;

    .line 310
    .line 311
    .line 312
    move-result-object p2

    .line 313
    :goto_4
    move-object p3, p2

    .line 314
    check-cast p3, Lyyds/ᛲᛶᛳᲀ;

    .line 315
    .line 316
    invoke-virtual {p3}, Lyyds/ᛲᛶᛳᲀ;->hasNext()Z

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    if-eqz v1, :cond_c

    .line 321
    .line 322
    invoke-virtual {p3}, Lyyds/ᛲᛶᛳᲀ;->next()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object p3

    .line 326
    check-cast p3, Lkotlin/Pair;

    .line 327
    .line 328
    invoke-virtual {p3}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    check-cast v1, Ljava/lang/String;

    .line 333
    .line 334
    invoke-virtual {p3}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object p3

    .line 338
    check-cast p3, Ljava/lang/Boolean;

    .line 339
    .line 340
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 341
    .line 342
    .line 343
    move-result p3

    .line 344
    const/16 v2, 0x60

    .line 345
    .line 346
    if-eqz p3, :cond_a

    .line 347
    .line 348
    new-instance p3, Ljava/lang/StringBuilder;

    .line 349
    .line 350
    const-string v3, "DROP VIEW IF EXISTS `"

    .line 351
    .line 352
    invoke-direct {p3, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object p3

    .line 365
    invoke-static {p1, p3}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    goto :goto_4

    .line 369
    :cond_a
    new-instance p3, Ljava/lang/StringBuilder;

    .line 370
    .line 371
    const-string v3, "DROP TABLE IF EXISTS `"

    .line 372
    .line 373
    invoke-direct {p3, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object p3

    .line 386
    invoke-static {p1, p3}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    goto :goto_4

    .line 390
    :goto_5
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 391
    :catchall_1
    move-exception p1

    .line 392
    invoke-static {p2, p0}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 393
    .line 394
    .line 395
    throw p1

    .line 396
    :cond_b
    invoke-virtual {v0, p1}, Lyyds/ᛲᛵᲀᛳ;->ᲀᛲᛳᲀ(Lyyds/ᛱᛵᛷ;)V

    .line 397
    .line 398
    .line 399
    :cond_c
    iget-object p0, p0, Lyyds/ᛷᛲᛴᛸ;->ᛲᛴᛳᛲ:Ljava/util/List;

    .line 400
    .line 401
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 402
    .line 403
    .line 404
    move-result-object p0

    .line 405
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 406
    .line 407
    .line 408
    move-result p2

    .line 409
    if-eqz p2, :cond_d

    .line 410
    .line 411
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object p2

    .line 415
    check-cast p2, Lyyds/ᛱᛴᲇᛵ;

    .line 416
    .line 417
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    goto :goto_6

    .line 421
    :cond_d
    invoke-virtual {v0, p1}, Lyyds/ᛲᛵᲀᛳ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;)V

    .line 422
    .line 423
    .line 424
    return-void

    .line 425
    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 426
    .line 427
    new-instance p1, Ljava/lang/StringBuilder;

    .line 428
    .line 429
    const-string v0, "A migration from "

    .line 430
    .line 431
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    const-string p2, " to "

    .line 438
    .line 439
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    const-string p2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions."

    .line 446
    .line 447
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object p1

    .line 458
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    throw p0

    .line 462
    nop

    .line 463
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ᛷᛵᲇᲀ(Lyyds/ᛱᛵᛷ;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛲᛴᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛲᛵᲀᛳ;

    .line 4
    .line 5
    iget-object v1, v0, Lyyds/ᛲᛵᲀᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    const-string v2, "Pre-packaged database has an invalid schema: "

    .line 10
    .line 11
    const-string v3, "SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name = \'room_master_table\'"

    .line 12
    .line 13
    invoke-interface {p1, v3}, Lyyds/ᛱᛵᛷ;->ᲀᛲᛱᛱ(Ljava/lang/String;)Lyyds/ᛵᲇᛱᛸ;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    :try_start_0
    invoke-interface {v3}, Lyyds/ᛵᲇᛱᛸ;->ᛵᲀᛵᛸ()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/4 v5, 0x1

    .line 22
    const/4 v6, 0x0

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    invoke-interface {v3, v6}, Lyyds/ᛵᲇᛱᛸ;->getLong(I)J

    .line 26
    .line 27
    .line 28
    move-result-wide v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    const-wide/16 v9, 0x0

    .line 30
    .line 31
    cmp-long v4, v7, v9

    .line 32
    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    move v4, v5

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    goto/16 :goto_7

    .line 39
    .line 40
    :cond_0
    move v4, v6

    .line 41
    :goto_0
    const/4 v7, 0x0

    .line 42
    invoke-static {v3, v7}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    const-string v2, "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"

    .line 48
    .line 49
    invoke-interface {p1, v2}, Lyyds/ᛱᛵᛷ;->ᲀᛲᛱᛱ(Ljava/lang/String;)Lyyds/ᛵᲇᛱᛸ;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    :try_start_1
    invoke-interface {v2}, Lyyds/ᛵᲇᛱᛸ;->ᛵᲀᛵᛸ()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    invoke-interface {v2, v6}, Lyyds/ᛵᲇᛱᛸ;->ᛱᲈᲁ(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    goto :goto_1

    .line 64
    :catchall_1
    move-exception p0

    .line 65
    goto :goto_2

    .line 66
    :cond_1
    move-object v3, v7

    .line 67
    :goto_1
    invoke-static {v2, v7}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_6

    .line 75
    .line 76
    iget-object v2, v0, Lyyds/ᛲᛵᲀᛳ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_2

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    new-instance p1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v0, "Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "

    .line 92
    .line 93
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v0, ", found: "

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p0

    .line 119
    :goto_2
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 120
    :catchall_2
    move-exception p1

    .line 121
    invoke-static {v2, p0}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    throw p1

    .line 125
    :cond_3
    const-string v1, "BEGIN EXCLUSIVE TRANSACTION"

    .line 126
    .line 127
    invoke-static {p1, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :try_start_3
    invoke-virtual {v0, p1}, Lyyds/ᛲᛵᲀᛳ;->ᛶᛸᲀᲁ(Lyyds/ᛱᛵᛷ;)Lyyds/ᛷᛶᛳᛸ;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    iget-boolean v3, v1, Lyyds/ᛷᛶᛳᛸ;->ᛲᲈᲁ:Z

    .line 135
    .line 136
    if-eqz v3, :cond_4

    .line 137
    .line 138
    invoke-virtual {v0}, Lyyds/ᛲᛵᲀᛳ;->ᛳᛸᛴᛶ()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, p1}, Lyyds/ᛷᛲᛴᛸ;->ᛲᛲᲈᲈ(Lyyds/ᛱᛵᛷ;)V

    .line 142
    .line 143
    .line 144
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :catchall_3
    move-exception v1

    .line 148
    goto :goto_3

    .line 149
    :cond_4
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 150
    .line 151
    new-instance v4, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    iget-object v1, v1, Lyyds/ᛷᛶᛳᛸ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v1, Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-direct {v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 175
    :goto_3
    new-instance v2, Lyyds/ᲈᛵᛵᛴ;

    .line 176
    .line 177
    invoke-direct {v2, v1}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    move-object v1, v2

    .line 181
    :goto_4
    instance-of v2, v1, Lyyds/ᲈᛵᛵᛴ;

    .line 182
    .line 183
    if-nez v2, :cond_5

    .line 184
    .line 185
    move-object v2, v1

    .line 186
    check-cast v2, Lyyds/ᲈᲀᛸᲀ;

    .line 187
    .line 188
    const-string v2, "END TRANSACTION"

    .line 189
    .line 190
    invoke-static {p1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    :cond_5
    invoke-static {v1}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    if-nez v1, :cond_9

    .line 198
    .line 199
    :cond_6
    :goto_5
    invoke-virtual {v0, p1}, Lyyds/ᛲᛵᲀᛳ;->ᲀᛲᛲᲇ(Lyyds/ᛱᛵᛷ;)V

    .line 200
    .line 201
    .line 202
    iget-object v0, p0, Lyyds/ᛷᛲᛴᛸ;->ᛲᛴᛳᛲ:Ljava/util/List;

    .line 203
    .line 204
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    :cond_7
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-eqz v1, :cond_8

    .line 213
    .line 214
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    check-cast v1, Lyyds/ᛱᛴᲇᛵ;

    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    instance-of v2, p1, Lyyds/ᛷᛳᲇᛲ;

    .line 224
    .line 225
    if-eqz v2, :cond_7

    .line 226
    .line 227
    move-object v2, p1

    .line 228
    check-cast v2, Lyyds/ᛷᛳᲇᛲ;

    .line 229
    .line 230
    iget-object v2, v2, Lyyds/ᛷᛳᲇᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛴᲀᛷ;

    .line 231
    .line 232
    iget-object v1, v1, Lyyds/ᛱᛴᲇᛵ;->ᛲᲈᲁ:Lyyds/ᲈᛷᲈᛶ;

    .line 233
    .line 234
    invoke-virtual {v1, v2}, Lyyds/ᲈᛷᲈᛶ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_8
    iput-boolean v5, p0, Lyyds/ᛷᛲᛴᛸ;->ᛲᲈᲁ:Z

    .line 239
    .line 240
    return-void

    .line 241
    :cond_9
    const-string p0, "ROLLBACK TRANSACTION"

    .line 242
    .line 243
    invoke-static {p1, p0}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw v1

    .line 247
    :goto_7
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 248
    :catchall_4
    move-exception p1

    .line 249
    invoke-static {v3, p0}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 250
    .line 251
    .line 252
    throw p1
.end method

.method public ᛷᲈᲈᲁ(Lyyds/ᛱᛵᛷ;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛲᛴᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛲᛵᲀᛳ;

    .line 4
    .line 5
    const-string v1, "SELECT count(*) FROM sqlite_master WHERE name != \'android_metadata\'"

    .line 6
    .line 7
    invoke-interface {p1, v1}, Lyyds/ᛱᛵᛷ;->ᲀᛲᛱᛱ(Ljava/lang/String;)Lyyds/ᛵᲇᛱᛸ;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :try_start_0
    invoke-interface {v1}, Lyyds/ᛵᲇᛱᛸ;->ᛵᲀᛵᛸ()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v1, v3}, Lyyds/ᛵᲇᛱᛸ;->getLong(I)J

    .line 19
    .line 20
    .line 21
    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    const-wide/16 v6, 0x0

    .line 23
    .line 24
    cmp-long v2, v4, v6

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_3

    .line 32
    :cond_0
    :goto_0
    const/4 v2, 0x0

    .line 33
    invoke-static {v1, v2}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lyyds/ᛲᛵᲀᛳ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;)V

    .line 37
    .line 38
    .line 39
    if-nez v3, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Lyyds/ᛲᛵᲀᛳ;->ᛶᛸᲀᲁ(Lyyds/ᛱᛵᛷ;)Lyyds/ᛷᛶᛳᛸ;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-boolean v2, v1, Lyyds/ᛷᛶᛳᛸ;->ᛲᲈᲁ:Z

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    iget-object p1, v1, Lyyds/ᛷᛶᛳᛸ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Ljava/lang/String;

    .line 55
    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v1, "Pre-packaged database has an invalid schema: "

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p0

    .line 78
    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Lyyds/ᛷᛲᛴᛸ;->ᛲᛲᲈᲈ(Lyyds/ᛱᛵᛷ;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lyyds/ᛲᛵᲀᛳ;->ᛵᛶᛲᲀ()V

    .line 82
    .line 83
    .line 84
    iget-object p0, p0, Lyyds/ᛷᛲᛴᛸ;->ᛲᛴᛳᛲ:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_3

    .line 95
    .line 96
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Lyyds/ᛱᛴᲇᛵ;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    return-void

    .line 107
    :goto_3
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    :catchall_1
    move-exception p1

    .line 109
    invoke-static {v1, p0}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    throw p1
.end method

.method public ᲀᛲᛳᲀ()V
    .locals 10

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛲᛴᛸ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛴᛵᛷᛴ;

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᛷᛲᛴᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v2, p0, Lyyds/ᛷᛲᛴᛸ;->ᛲᛴᛳᛲ:Ljava/util/List;

    .line 10
    .line 11
    check-cast v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, Lyyds/ᛷᛲᛴᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lyyds/ᛴᛵᛷᛴ;

    .line 19
    .line 20
    iget-object v4, v3, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 21
    .line 22
    invoke-virtual {v4}, Lyyds/ᛸᛸᛱᛸ;->ᲇᲇᲇᛱ()V

    .line 23
    .line 24
    .line 25
    iget-object v4, v3, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 26
    .line 27
    invoke-virtual {v4}, Lyyds/ᛵᲇᛴᛷ;->ᲇᲇᲇᛱ()V

    .line 28
    .line 29
    .line 30
    iget-object v4, v3, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 31
    .line 32
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    iget-object v4, v3, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 36
    .line 37
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    iget-object v4, v3, Lyyds/ᛴᛵᛷᛴ;->ᛱᛵᲈᛸ:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const/4 v5, 0x0

    .line 47
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    const/4 v7, 0x1

    .line 52
    const/4 v8, 0x0

    .line 53
    if-eqz v6, :cond_8

    .line 54
    .line 55
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    check-cast v6, Lyyds/ᛴᲀᲈᛲ;

    .line 60
    .line 61
    instance-of v9, v6, Lyyds/ᲀᲀᲁᛳ;

    .line 62
    .line 63
    if-eqz v9, :cond_1

    .line 64
    .line 65
    new-instance v7, Lyyds/ᲁᛷᛴᛳ;

    .line 66
    .line 67
    invoke-direct {v7, v6}, Lyyds/ᛶᲀᲁᛱ;-><init>(Lyyds/ᛴᲀᲈᛲ;)V

    .line 68
    .line 69
    .line 70
    iget-object v8, v6, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 71
    .line 72
    invoke-virtual {v8}, Lyyds/ᛸᛸᛱᛸ;->ᲇᲇᲇᛱ()V

    .line 73
    .line 74
    .line 75
    iget-object v8, v6, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 76
    .line 77
    invoke-virtual {v8}, Lyyds/ᛵᲇᛴᛷ;->ᲇᲇᲇᛱ()V

    .line 78
    .line 79
    .line 80
    check-cast v6, Lyyds/ᲀᲀᲁᛳ;

    .line 81
    .line 82
    iget v6, v6, Lyyds/ᲀᲀᲁᛳ;->ᲁᲀᛱᛴ:I

    .line 83
    .line 84
    iput v6, v7, Lyyds/ᛶᲀᲁᛱ;->ᲇᲇᲇᛱ:I

    .line 85
    .line 86
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {v6}, Lyyds/ᛴᲀᲈᛲ;->ᛶᛸᲀᲁ()Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_4

    .line 95
    .line 96
    iget-object v9, v6, Lyyds/ᛴᲀᲈᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛳᛵᛶ;

    .line 97
    .line 98
    if-nez v9, :cond_2

    .line 99
    .line 100
    new-instance v9, Lyyds/ᛳᛳᛵᛶ;

    .line 101
    .line 102
    invoke-direct {v9, v6, v8}, Lyyds/ᛳᛳᛵᛶ;-><init>(Lyyds/ᛴᲀᲈᛲ;I)V

    .line 103
    .line 104
    .line 105
    iput-object v9, v6, Lyyds/ᛴᲀᲈᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛳᛵᛶ;

    .line 106
    .line 107
    :cond_2
    if-nez v5, :cond_3

    .line 108
    .line 109
    new-instance v5, Ljava/util/HashSet;

    .line 110
    .line 111
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 112
    .line 113
    .line 114
    :cond_3
    iget-object v8, v6, Lyyds/ᛴᲀᲈᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛳᛵᛶ;

    .line 115
    .line 116
    invoke-virtual {v5, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    iget-object v8, v6, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 121
    .line 122
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    :goto_1
    invoke-virtual {v6}, Lyyds/ᛴᲀᲈᛲ;->ᛵᲀᲈᛴ()Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-eqz v8, :cond_7

    .line 130
    .line 131
    iget-object v8, v6, Lyyds/ᛴᲀᲈᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛳᛵᛶ;

    .line 132
    .line 133
    if-nez v8, :cond_5

    .line 134
    .line 135
    new-instance v8, Lyyds/ᛳᛳᛵᛶ;

    .line 136
    .line 137
    invoke-direct {v8, v6, v7}, Lyyds/ᛳᛳᛵᛶ;-><init>(Lyyds/ᛴᲀᲈᛲ;I)V

    .line 138
    .line 139
    .line 140
    iput-object v8, v6, Lyyds/ᛴᲀᲈᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛳᛵᛶ;

    .line 141
    .line 142
    :cond_5
    if-nez v5, :cond_6

    .line 143
    .line 144
    new-instance v5, Ljava/util/HashSet;

    .line 145
    .line 146
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 147
    .line 148
    .line 149
    :cond_6
    iget-object v7, v6, Lyyds/ᛴᲀᲈᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛳᛵᛶ;

    .line 150
    .line 151
    invoke-virtual {v5, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_7
    iget-object v7, v6, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 156
    .line 157
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    :goto_2
    instance-of v7, v6, Lyyds/ᛲᛸᛱᲀ;

    .line 161
    .line 162
    if-eqz v7, :cond_0

    .line 163
    .line 164
    new-instance v7, Lyyds/ᲈᲁᲈᲈ;

    .line 165
    .line 166
    invoke-direct {v7, v6}, Lyyds/ᛶᲀᲁᛱ;-><init>(Lyyds/ᛴᲀᲈᛲ;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_8
    if-eqz v5, :cond_9

    .line 174
    .line 175
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 176
    .line 177
    .line 178
    :cond_9
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-eqz v5, :cond_a

    .line 187
    .line 188
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    check-cast v5, Lyyds/ᛶᲀᲁᛱ;

    .line 193
    .line 194
    invoke-virtual {v5}, Lyyds/ᛶᲀᲁᛱ;->ᲇᲇᲇᛱ()V

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-eqz v4, :cond_c

    .line 207
    .line 208
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    check-cast v4, Lyyds/ᛶᲀᲁᛱ;

    .line 213
    .line 214
    iget-object v5, v4, Lyyds/ᛶᲀᲁᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛴᲀᲈᛲ;

    .line 215
    .line 216
    if-ne v5, v3, :cond_b

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_b
    invoke-virtual {v4}, Lyyds/ᛶᲀᲁᛱ;->ᲇᲈᛵᛷ()V

    .line 220
    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 224
    .line 225
    .line 226
    iget-object v2, v0, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 227
    .line 228
    invoke-virtual {p0, v2, v8, v1}, Lyyds/ᛷᛲᛴᛸ;->ᛶᛷᛲᲁ(Lyyds/ᛶᲀᲁᛱ;ILjava/util/ArrayList;)V

    .line 229
    .line 230
    .line 231
    iget-object v0, v0, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 232
    .line 233
    invoke-virtual {p0, v0, v7, v1}, Lyyds/ᛷᛲᛴᛸ;->ᛶᛷᛲᲁ(Lyyds/ᛶᲀᲁᛱ;ILjava/util/ArrayList;)V

    .line 234
    .line 235
    .line 236
    iput-boolean v8, p0, Lyyds/ᛷᛲᛴᛸ;->ᛲᲈᲁ:Z

    .line 237
    .line 238
    return-void
.end method

.method public ᲇᲇᲇᛱ(Lyyds/ᛱᛵᛷ;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛲᛴᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛲᛵᲀᛳ;

    .line 4
    .line 5
    iget v0, v0, Lyyds/ᛲᛵᲀᛳ;->ᛲᲈᲁ:I

    .line 6
    .line 7
    const-string v1, "PRAGMA user_version = "

    .line 8
    .line 9
    invoke-static {p1}, Lyyds/ᛷᛲᛴᛸ;->ᛲᛴᛳᛲ(Lyyds/ᛱᛵᛷ;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lyyds/ᛷᛲᛴᛸ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lyyds/ᛳᛲᲈᛲ;

    .line 15
    .line 16
    iget v3, v2, Lyyds/ᛳᛲᲈᛲ;->ᛶᛷᛲᲁ:I

    .line 17
    .line 18
    const/4 v4, 0x3

    .line 19
    if-ne v3, v4, :cond_0

    .line 20
    .line 21
    const-string v3, "PRAGMA journal_mode = WAL"

    .line 22
    .line 23
    invoke-static {p1, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v3, "PRAGMA journal_mode = TRUNCATE"

    .line 28
    .line 29
    invoke-static {p1, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget v2, v2, Lyyds/ᛳᛲᲈᛲ;->ᛶᛷᛲᲁ:I

    .line 33
    .line 34
    if-ne v2, v4, :cond_1

    .line 35
    .line 36
    const-string v2, "PRAGMA synchronous = NORMAL"

    .line 37
    .line 38
    invoke-static {p1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string v2, "PRAGMA synchronous = FULL"

    .line 43
    .line 44
    invoke-static {p1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :goto_1
    const-string v2, "PRAGMA user_version"

    .line 48
    .line 49
    invoke-interface {p1, v2}, Lyyds/ᛱᛵᛷ;->ᲀᛲᛱᛱ(Ljava/lang/String;)Lyyds/ᛵᲇᛱᛸ;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    :try_start_0
    invoke-interface {v2}, Lyyds/ᛵᲇᛱᛸ;->ᛵᲀᛵᛸ()Z

    .line 54
    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-interface {v2, v3}, Lyyds/ᛵᲇᛱᛸ;->getLong(I)J

    .line 58
    .line 59
    .line 60
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 61
    long-to-int v3, v3

    .line 62
    const/4 v4, 0x0

    .line 63
    invoke-static {v2, v4}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    if-eq v3, v0, :cond_5

    .line 67
    .line 68
    const-string v2, "BEGIN EXCLUSIVE TRANSACTION"

    .line 69
    .line 70
    invoke-static {p1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    if-nez v3, :cond_2

    .line 74
    .line 75
    :try_start_1
    invoke-virtual {p0, p1}, Lyyds/ᛷᛲᛴᛸ;->ᛷᲈᲈᲁ(Lyyds/ᛱᛵᛷ;)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    goto :goto_3

    .line 81
    :cond_2
    invoke-virtual {p0, p1, v3, v0}, Lyyds/ᛷᛲᛴᛸ;->ᛷᛲᲈᛱ(Lyyds/ᛱᛵᛷ;II)V

    .line 82
    .line 83
    .line 84
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {p1, v0}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    sget-object v0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :goto_3
    new-instance v1, Lyyds/ᲈᛵᛵᛴ;

    .line 103
    .line 104
    invoke-direct {v1, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    move-object v0, v1

    .line 108
    :goto_4
    instance-of v1, v0, Lyyds/ᲈᛵᛵᛴ;

    .line 109
    .line 110
    if-nez v1, :cond_3

    .line 111
    .line 112
    move-object v1, v0

    .line 113
    check-cast v1, Lyyds/ᲈᲀᛸᲀ;

    .line 114
    .line 115
    const-string v1, "END TRANSACTION"

    .line 116
    .line 117
    invoke-static {p1, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_3
    invoke-static {v0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-nez v0, :cond_4

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_4
    const-string p0, "ROLLBACK TRANSACTION"

    .line 128
    .line 129
    invoke-static {p1, p0}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :cond_5
    :goto_5
    invoke-virtual {p0, p1}, Lyyds/ᛷᛲᛴᛸ;->ᛷᛵᲇᲀ(Lyyds/ᛱᛵᛷ;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :catchall_1
    move-exception p0

    .line 138
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 139
    :catchall_2
    move-exception p1

    .line 140
    invoke-static {v2, p0}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    throw p1
.end method

.method public ᲇᲈᛵᛷ(Lyyds/ᛴᛵᛷᛴ;I)I
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget-object v1, v1, Lyyds/ᛷᛲᛴᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    move-wide v7, v4

    .line 19
    :goto_0
    if-ge v6, v3, :cond_d

    .line 20
    .line 21
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v9

    .line 25
    check-cast v9, Lyyds/ᛲᛴᛳᲈ;

    .line 26
    .line 27
    iget-object v9, v9, Lyyds/ᛲᛴᛳᲈ;->ᛲᲈᲁ:Lyyds/ᛶᲀᲁᛱ;

    .line 28
    .line 29
    instance-of v10, v9, Lyyds/ᛳᛳᛵᛶ;

    .line 30
    .line 31
    if-eqz v10, :cond_0

    .line 32
    .line 33
    move-object v10, v9

    .line 34
    check-cast v10, Lyyds/ᛳᛳᛵᛶ;

    .line 35
    .line 36
    iget v10, v10, Lyyds/ᛶᲀᲁᛱ;->ᲇᲇᲇᛱ:I

    .line 37
    .line 38
    if-eq v10, v2, :cond_2

    .line 39
    .line 40
    :goto_1
    move-object/from16 p0, v1

    .line 41
    .line 42
    move-wide v0, v4

    .line 43
    move/from16 v16, v6

    .line 44
    .line 45
    goto/16 :goto_8

    .line 46
    .line 47
    :cond_0
    if-nez v2, :cond_1

    .line 48
    .line 49
    instance-of v10, v9, Lyyds/ᛸᛸᛱᛸ;

    .line 50
    .line 51
    if-nez v10, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    instance-of v10, v9, Lyyds/ᛵᲇᛴᛷ;

    .line 55
    .line 56
    if-nez v10, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    if-nez v2, :cond_3

    .line 60
    .line 61
    iget-object v10, v0, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 62
    .line 63
    :goto_2
    iget-object v10, v10, Lyyds/ᛶᲀᲁᛱ;->ᛱᲈᲁ:Lyyds/ᛶᛸᲈᲈ;

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    iget-object v10, v0, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :goto_3
    if-nez v2, :cond_4

    .line 70
    .line 71
    iget-object v11, v0, Lyyds/ᛴᲀᲈᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛸᛱᛸ;

    .line 72
    .line 73
    :goto_4
    iget-object v11, v11, Lyyds/ᛶᲀᲁᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛶᛸᲈᲈ;

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_4
    iget-object v11, v0, Lyyds/ᛴᲀᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲇᛴᛷ;

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :goto_5
    iget-object v12, v9, Lyyds/ᛶᲀᲁᛱ;->ᛱᲈᲁ:Lyyds/ᛶᛸᲈᲈ;

    .line 80
    .line 81
    iget-object v13, v9, Lyyds/ᛶᲀᲁᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛶᛸᲈᲈ;

    .line 82
    .line 83
    iget-object v14, v12, Lyyds/ᛶᛸᲈᲈ;->ᛷᛵᲇᲀ:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    iget-object v14, v13, Lyyds/ᛶᛸᲈᲈ;->ᛷᛵᲇᲀ:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    invoke-virtual {v9}, Lyyds/ᛶᲀᲁᛱ;->ᛷᲈᲈᲁ()J

    .line 96
    .line 97
    .line 98
    move-result-wide v14

    .line 99
    if-eqz v10, :cond_a

    .line 100
    .line 101
    if-eqz v11, :cond_a

    .line 102
    .line 103
    invoke-static {v12, v4, v5}, Lyyds/ᛲᛴᛳᲈ;->ᛵᛸᛸᛷ(Lyyds/ᛶᛸᲈᲈ;J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v10

    .line 107
    move-object/from16 p0, v1

    .line 108
    .line 109
    invoke-static {v13, v4, v5}, Lyyds/ᛲᛴᛳᲈ;->ᛲᲈᲁ(Lyyds/ᛶᛸᲈᲈ;J)J

    .line 110
    .line 111
    .line 112
    move-result-wide v0

    .line 113
    sub-long/2addr v10, v14

    .line 114
    iget v4, v13, Lyyds/ᛶᛸᲈᲈ;->ᲇᲇᲇᛱ:I

    .line 115
    .line 116
    neg-int v5, v4

    .line 117
    move/from16 v16, v6

    .line 118
    .line 119
    int-to-long v5, v5

    .line 120
    cmp-long v5, v10, v5

    .line 121
    .line 122
    if-ltz v5, :cond_5

    .line 123
    .line 124
    int-to-long v4, v4

    .line 125
    add-long/2addr v10, v4

    .line 126
    :cond_5
    neg-long v0, v0

    .line 127
    sub-long/2addr v0, v14

    .line 128
    iget v4, v12, Lyyds/ᛶᛸᲈᲈ;->ᲇᲇᲇᛱ:I

    .line 129
    .line 130
    int-to-long v4, v4

    .line 131
    sub-long/2addr v0, v4

    .line 132
    cmp-long v6, v0, v4

    .line 133
    .line 134
    if-ltz v6, :cond_6

    .line 135
    .line 136
    sub-long/2addr v0, v4

    .line 137
    :cond_6
    iget-object v4, v9, Lyyds/ᛶᲀᲁᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛴᲀᲈᛲ;

    .line 138
    .line 139
    if-nez v2, :cond_7

    .line 140
    .line 141
    iget v4, v4, Lyyds/ᛴᲀᲈᛲ;->ᛲᛳᛵᛱ:F

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_7
    const/4 v5, 0x1

    .line 145
    if-ne v2, v5, :cond_8

    .line 146
    .line 147
    iget v4, v4, Lyyds/ᛴᲀᲈᛲ;->ᛴᛸᲁᛵ:F

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_8
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    const/high16 v4, -0x40800000    # -1.0f

    .line 154
    .line 155
    :goto_6
    const/4 v5, 0x0

    .line 156
    cmpl-float v5, v4, v5

    .line 157
    .line 158
    const/high16 v6, 0x3f800000    # 1.0f

    .line 159
    .line 160
    if-lez v5, :cond_9

    .line 161
    .line 162
    long-to-float v0, v0

    .line 163
    div-float/2addr v0, v4

    .line 164
    long-to-float v1, v10

    .line 165
    sub-float v5, v6, v4

    .line 166
    .line 167
    div-float/2addr v1, v5

    .line 168
    add-float/2addr v1, v0

    .line 169
    float-to-long v0, v1

    .line 170
    goto :goto_7

    .line 171
    :cond_9
    const-wide/16 v0, 0x0

    .line 172
    .line 173
    :goto_7
    long-to-float v0, v0

    .line 174
    mul-float v1, v0, v4

    .line 175
    .line 176
    const/high16 v5, 0x3f000000    # 0.5f

    .line 177
    .line 178
    add-float/2addr v1, v5

    .line 179
    float-to-long v9, v1

    .line 180
    sub-float/2addr v6, v4

    .line 181
    mul-float/2addr v6, v0

    .line 182
    add-float/2addr v6, v5

    .line 183
    float-to-long v0, v6

    .line 184
    add-long/2addr v9, v14

    .line 185
    add-long/2addr v9, v0

    .line 186
    iget v0, v12, Lyyds/ᛶᛸᲈᲈ;->ᲇᲇᲇᛱ:I

    .line 187
    .line 188
    int-to-long v0, v0

    .line 189
    add-long/2addr v0, v9

    .line 190
    iget v4, v13, Lyyds/ᛶᛸᲈᲈ;->ᲇᲇᲇᛱ:I

    .line 191
    .line 192
    int-to-long v4, v4

    .line 193
    sub-long/2addr v0, v4

    .line 194
    goto :goto_8

    .line 195
    :cond_a
    move-object/from16 p0, v1

    .line 196
    .line 197
    move/from16 v16, v6

    .line 198
    .line 199
    if-eqz v10, :cond_b

    .line 200
    .line 201
    iget v0, v12, Lyyds/ᛶᛸᲈᲈ;->ᲇᲇᲇᛱ:I

    .line 202
    .line 203
    int-to-long v0, v0

    .line 204
    invoke-static {v12, v0, v1}, Lyyds/ᛲᛴᛳᲈ;->ᛵᛸᛸᛷ(Lyyds/ᛶᛸᲈᲈ;J)J

    .line 205
    .line 206
    .line 207
    move-result-wide v0

    .line 208
    iget v4, v12, Lyyds/ᛶᛸᲈᲈ;->ᲇᲇᲇᛱ:I

    .line 209
    .line 210
    int-to-long v4, v4

    .line 211
    add-long/2addr v4, v14

    .line 212
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 213
    .line 214
    .line 215
    move-result-wide v0

    .line 216
    goto :goto_8

    .line 217
    :cond_b
    if-eqz v11, :cond_c

    .line 218
    .line 219
    iget v0, v13, Lyyds/ᛶᛸᲈᲈ;->ᲇᲇᲇᛱ:I

    .line 220
    .line 221
    int-to-long v0, v0

    .line 222
    invoke-static {v13, v0, v1}, Lyyds/ᛲᛴᛳᲈ;->ᛲᲈᲁ(Lyyds/ᛶᛸᲈᲈ;J)J

    .line 223
    .line 224
    .line 225
    move-result-wide v0

    .line 226
    iget v4, v13, Lyyds/ᛶᛸᲈᲈ;->ᲇᲇᲇᛱ:I

    .line 227
    .line 228
    neg-int v4, v4

    .line 229
    int-to-long v4, v4

    .line 230
    add-long/2addr v4, v14

    .line 231
    neg-long v0, v0

    .line 232
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 233
    .line 234
    .line 235
    move-result-wide v0

    .line 236
    goto :goto_8

    .line 237
    :cond_c
    iget v0, v12, Lyyds/ᛶᛸᲈᲈ;->ᲇᲇᲇᛱ:I

    .line 238
    .line 239
    int-to-long v0, v0

    .line 240
    invoke-virtual {v9}, Lyyds/ᛶᲀᲁᛱ;->ᛷᲈᲈᲁ()J

    .line 241
    .line 242
    .line 243
    move-result-wide v4

    .line 244
    add-long/2addr v4, v0

    .line 245
    iget v0, v13, Lyyds/ᛶᛸᲈᲈ;->ᲇᲇᲇᛱ:I

    .line 246
    .line 247
    int-to-long v0, v0

    .line 248
    sub-long v0, v4, v0

    .line 249
    .line 250
    :goto_8
    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 251
    .line 252
    .line 253
    move-result-wide v7

    .line 254
    add-int/lit8 v6, v16, 0x1

    .line 255
    .line 256
    move-object/from16 v1, p0

    .line 257
    .line 258
    move-object/from16 v0, p1

    .line 259
    .line 260
    const-wide/16 v4, 0x0

    .line 261
    .line 262
    goto/16 :goto_0

    .line 263
    .line 264
    :cond_d
    long-to-int v0, v7

    .line 265
    return v0
.end method
