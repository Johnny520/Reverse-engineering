.class public final Lyyds/ᛵᲁᲀᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛵᛳ;


# instance fields
.field public final ᛱᲈᲁ:J

.field public final ᛲᛴᛳᛲ:Lyyds/ᛷᛶᲇᲁ;

.field public volatile ᛶᛷᛲᲁ:Z

.field public final ᲀᛲᛳᲀ:Lyyds/ᛴᲈᲁᛴ;

.field public final ᲇᲇᲇᛱ:Ljava/lang/ThreadLocal;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛴᲈᲁᛴ;


# direct methods
.method public constructor <init>(Lyyds/ᲀᲈᛶᲈ;)V
    .locals 3

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    new-instance v0, Lyyds/ᛷᛶᲇᲁ;

    .line 68
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object v0, p0, Lyyds/ᛵᲁᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛶᲇᲁ;

    .line 70
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lyyds/ᛵᲁᲀᲈ;->ᲇᲇᲇᛱ:Ljava/lang/ThreadLocal;

    .line 71
    sget-object v0, Lyyds/ᛴᛵᛱᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛵᲈᲁ;

    const/16 v0, 0x1e

    sget-object v1, Lyyds/ᛲᛸᲈᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛸᲈᛴ;

    invoke-static {v0, v1}, Lyyds/ᛶᛶᲁᲇ;->ᛳᛸᛴᛶ(ILyyds/ᛲᛸᲈᛴ;)J

    move-result-wide v0

    iput-wide v0, p0, Lyyds/ᛵᲁᲀᲈ;->ᛱᲈᲁ:J

    .line 72
    new-instance v0, Lyyds/ᛴᲈᲁᛴ;

    .line 73
    new-instance v1, Lyyds/ᛵᲇᛵᲇ;

    const/4 v2, 0x4

    invoke-direct {v1, v2, p1}, Lyyds/ᛵᲇᛵᲇ;-><init>(ILjava/lang/Object;)V

    const/4 p1, 0x1

    .line 74
    invoke-direct {v0, p1, v1}, Lyyds/ᛴᲈᲁᛴ;-><init>(ILyyds/ᲁᛶᲁᲀ;)V

    .line 75
    iput-object v0, p0, Lyyds/ᛵᲁᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᲁᛴ;

    .line 76
    iput-object v0, p0, Lyyds/ᛵᲁᲀᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲈᲁᛴ;

    return-void
.end method

.method public constructor <init>(Lyyds/ᲀᲈᛶᲈ;Ljava/lang/String;I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛷᛶᲇᲁ;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛵᲁᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛶᲇᲁ;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lyyds/ᛵᲁᲀᲈ;->ᲇᲇᲇᛱ:Ljava/lang/ThreadLocal;

    .line 17
    .line 18
    sget-object v0, Lyyds/ᛴᛵᛱᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛵᲈᲁ;

    .line 19
    .line 20
    const/16 v0, 0x1e

    .line 21
    .line 22
    sget-object v1, Lyyds/ᛲᛸᲈᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛸᲈᛴ;

    .line 23
    .line 24
    invoke-static {v0, v1}, Lyyds/ᛶᛶᲁᲇ;->ᛳᛸᛴᛶ(ILyyds/ᛲᛸᲈᛴ;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    iput-wide v0, p0, Lyyds/ᛵᲁᲀᲈ;->ᛱᲈᲁ:J

    .line 29
    .line 30
    if-lez p3, :cond_0

    .line 31
    .line 32
    new-instance v0, Lyyds/ᛴᲈᲁᛴ;

    .line 33
    .line 34
    new-instance v1, Lyyds/ᛳᲈᛵᲁ;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-direct {v1, p1, p2, v2}, Lyyds/ᛳᲈᛵᲁ;-><init>(Lyyds/ᲀᲈᛶᲈ;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, p3, v1}, Lyyds/ᛴᲈᲁᛴ;-><init>(ILyyds/ᲁᛶᲁᲀ;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lyyds/ᛵᲁᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᲁᛴ;

    .line 44
    .line 45
    new-instance p3, Lyyds/ᛴᲈᲁᛴ;

    .line 46
    .line 47
    new-instance v0, Lyyds/ᛳᲈᛵᲁ;

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    invoke-direct {v0, p1, p2, v1}, Lyyds/ᛳᲈᛵᲁ;-><init>(Lyyds/ᲀᲈᛶᲈ;Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p3, v1, v0}, Lyyds/ᛴᲈᲁᛴ;-><init>(ILyyds/ᲁᛶᲁᲀ;)V

    .line 54
    .line 55
    .line 56
    iput-object p3, p0, Lyyds/ᛵᲁᲀᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲈᲁᛴ;

    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    const-string p0, "Maximum number of readers must be greater than 0"

    .line 60
    .line 61
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    throw p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛵᲁᲀᲈ;->ᛶᛷᛲᲁ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lyyds/ᛵᲁᲀᲈ;->ᛶᛷᛲᲁ:Z

    .line 7
    .line 8
    iget-object v0, p0, Lyyds/ᛵᲁᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᲁᛴ;

    .line 9
    .line 10
    invoke-virtual {v0}, Lyyds/ᛴᲈᲁᛴ;->ᲀᛲᛳᲀ()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lyyds/ᛵᲁᲀᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲈᲁᛴ;

    .line 14
    .line 15
    invoke-virtual {p0}, Lyyds/ᛴᲈᲁᛴ;->ᲀᛲᛳᲀ()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final ᛲᛶᛱᲈ(ZLyyds/ᛲᲇᲁᛴ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    instance-of v4, v3, Lyyds/ᲁᲈᛸᲈ;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Lyyds/ᲁᲈᛸᲈ;

    .line 15
    .line 16
    iget v5, v4, Lyyds/ᲁᲈᛸᲈ;->ᛳᲁᲁᲇ:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lyyds/ᲁᲈᛸᲈ;->ᛳᲁᲁᲇ:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lyyds/ᲁᲈᛸᲈ;

    .line 29
    .line 30
    invoke-direct {v4, v0, v3}, Lyyds/ᲁᲈᛸᲈ;-><init>(Lyyds/ᛵᲁᲀᲈ;Lyyds/ᛶᛴᲀᛲ;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, Lyyds/ᲁᲈᛸᲈ;->ᛲᛲᲈᲈ:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v5, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 36
    .line 37
    iget v6, v4, Lyyds/ᲁᲈᛸᲈ;->ᛳᲁᲁᲇ:I

    .line 38
    .line 39
    const-string v7, "ROLLBACK TRANSACTION"

    .line 40
    .line 41
    const/4 v8, 0x4

    .line 42
    const/4 v9, 0x3

    .line 43
    const/4 v10, 0x2

    .line 44
    const/4 v11, 0x1

    .line 45
    const/4 v12, 0x0

    .line 46
    if-eqz v6, :cond_5

    .line 47
    .line 48
    if-eq v6, v11, :cond_4

    .line 49
    .line 50
    if-eq v6, v10, :cond_3

    .line 51
    .line 52
    if-eq v6, v9, :cond_2

    .line 53
    .line 54
    if-ne v6, v8, :cond_1

    .line 55
    .line 56
    iget-object v0, v4, Lyyds/ᲁᲈᛸᲈ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v1, v0

    .line 59
    check-cast v1, Lyyds/ᛱᛷᛸᲈ;

    .line 60
    .line 61
    iget-object v0, v4, Lyyds/ᲁᲈᛸᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v2, v0

    .line 64
    check-cast v2, Lyyds/ᛴᲈᲁᛴ;

    .line 65
    .line 66
    :try_start_0
    invoke-static {v3}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    goto/16 :goto_8

    .line 70
    .line 71
    :catchall_0
    move-exception v0

    .line 72
    move-object v6, v1

    .line 73
    move-object v1, v0

    .line 74
    goto/16 :goto_9

    .line 75
    .line 76
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object v12

    .line 82
    :cond_2
    iget-boolean v1, v4, Lyyds/ᲁᲈᛸᲈ;->ᲇᲇᲇᛱ:Z

    .line 83
    .line 84
    iget-object v2, v4, Lyyds/ᲁᲈᛸᲈ;->ᛷᛵᲇᲀ:Lyyds/ᛷᛶᲇᲁ;

    .line 85
    .line 86
    iget-object v6, v4, Lyyds/ᲁᲈᛸᲈ;->ᛷᛲᲈᛱ:Lyyds/ᛱᛷᛸᲈ;

    .line 87
    .line 88
    iget-object v9, v4, Lyyds/ᲁᲈᛸᲈ;->ᛷᲈᲈᲁ:Lyyds/ᲁᛴᛲ;

    .line 89
    .line 90
    iget-object v10, v4, Lyyds/ᲁᲈᛸᲈ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛷᛸᲈ;

    .line 91
    .line 92
    iget-object v13, v4, Lyyds/ᲁᲈᛸᲈ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v13, Lyyds/ᛴᲈᲁᛴ;

    .line 95
    .line 96
    iget-object v14, v4, Lyyds/ᲁᲈᛸᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v14, Lyyds/ᛲᲇᲁᛴ;

    .line 99
    .line 100
    :try_start_1
    invoke-static {v3}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    .line 102
    .line 103
    move-object/from16 v16, v9

    .line 104
    .line 105
    move-object v9, v6

    .line 106
    move-object v6, v10

    .line 107
    move-object/from16 v10, v16

    .line 108
    .line 109
    goto/16 :goto_5

    .line 110
    .line 111
    :catchall_1
    move-exception v0

    .line 112
    move-object v1, v0

    .line 113
    move-object v6, v10

    .line 114
    :goto_1
    move-object v2, v13

    .line 115
    goto/16 :goto_9

    .line 116
    .line 117
    :cond_3
    invoke-static {v3}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return-object v3

    .line 121
    :cond_4
    invoke-static {v3}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    return-object v3

    .line 125
    :cond_5
    invoke-static {v3}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iget-boolean v3, v0, Lyyds/ᛵᲁᲀᲈ;->ᛶᛷᛲᲁ:Z

    .line 129
    .line 130
    if-nez v3, :cond_17

    .line 131
    .line 132
    iget-object v3, v0, Lyyds/ᛵᲁᲀᲈ;->ᲇᲇᲇᛱ:Ljava/lang/ThreadLocal;

    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    check-cast v3, Lyyds/ᛶᲇᲈᛱ;

    .line 139
    .line 140
    if-nez v3, :cond_7

    .line 141
    .line 142
    iget-object v3, v4, Lyyds/ᛶᛴᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛴᛲ;

    .line 143
    .line 144
    iget-object v6, v0, Lyyds/ᛵᲁᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛶᲇᲁ;

    .line 145
    .line 146
    invoke-interface {v3, v6}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    check-cast v3, Lyyds/ᲀᛳᲇᛶ;

    .line 151
    .line 152
    if-eqz v3, :cond_6

    .line 153
    .line 154
    iget-object v3, v3, Lyyds/ᲀᛳᲇᛶ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲇᲈᛱ;

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_6
    move-object v3, v12

    .line 158
    :cond_7
    :goto_2
    if-eqz v3, :cond_d

    .line 159
    .line 160
    if-nez v1, :cond_9

    .line 161
    .line 162
    iget-boolean v1, v3, Lyyds/ᛶᲇᲈᛱ;->ᲀᛲᛳᲀ:Z

    .line 163
    .line 164
    if-nez v1, :cond_8

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_8
    const-string v0, "Cannot upgrade connection from reader to writer"

    .line 168
    .line 169
    invoke-static {v11, v0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v12

    .line 173
    :cond_9
    :goto_3
    iget-object v1, v4, Lyyds/ᛶᛴᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛴᛲ;

    .line 174
    .line 175
    iget-object v6, v0, Lyyds/ᛵᲁᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛶᲇᲁ;

    .line 176
    .line 177
    invoke-interface {v1, v6}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    if-nez v1, :cond_b

    .line 182
    .line 183
    new-instance v1, Lyyds/ᲀᛳᲇᛶ;

    .line 184
    .line 185
    iget-object v6, v0, Lyyds/ᛵᲁᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛶᲇᲁ;

    .line 186
    .line 187
    invoke-direct {v1, v6, v3}, Lyyds/ᲀᛳᲇᛶ;-><init>(Lyyds/ᲁᛸᛲᲁ;Lyyds/ᛶᲇᲈᛱ;)V

    .line 188
    .line 189
    .line 190
    iget-object v0, v0, Lyyds/ᛵᲁᲀᲈ;->ᲇᲇᲇᛱ:Ljava/lang/ThreadLocal;

    .line 191
    .line 192
    new-instance v6, Lyyds/ᛸᛷᛶᲁ;

    .line 193
    .line 194
    invoke-direct {v6, v3, v0}, Lyyds/ᛸᛷᛶᲁ;-><init>(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v1, v6}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛲᲈᲈ(Lyyds/ᲁᛴᛲ;Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    new-instance v1, Lyyds/ᛱᲁᛴᛴ;

    .line 202
    .line 203
    invoke-direct {v1, v2, v3, v12, v9}, Lyyds/ᛱᲁᛴᛴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 204
    .line 205
    .line 206
    iput v11, v4, Lyyds/ᲁᲈᛸᲈ;->ᛳᲁᲁᲇ:I

    .line 207
    .line 208
    invoke-static {v0, v1, v4}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    if-ne v0, v5, :cond_a

    .line 213
    .line 214
    goto/16 :goto_7

    .line 215
    .line 216
    :cond_a
    return-object v0

    .line 217
    :cond_b
    iput v10, v4, Lyyds/ᲁᲈᛸᲈ;->ᛳᲁᲁᲇ:I

    .line 218
    .line 219
    invoke-interface {v2, v3, v4}, Lyyds/ᛲᲇᲁᛴ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    if-ne v0, v5, :cond_c

    .line 224
    .line 225
    goto/16 :goto_7

    .line 226
    .line 227
    :cond_c
    return-object v0

    .line 228
    :cond_d
    if-eqz v1, :cond_e

    .line 229
    .line 230
    iget-object v3, v0, Lyyds/ᛵᲁᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᲁᛴ;

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_e
    iget-object v3, v0, Lyyds/ᛵᲁᲀᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲈᲁᛴ;

    .line 234
    .line 235
    :goto_4
    new-instance v6, Lyyds/ᛱᛷᛸᲈ;

    .line 236
    .line 237
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 238
    .line 239
    .line 240
    :try_start_2
    iget-object v10, v4, Lyyds/ᛶᛴᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛴᛲ;

    .line 241
    .line 242
    iget-object v13, v0, Lyyds/ᛵᲁᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛶᲇᲁ;

    .line 243
    .line 244
    iget-wide v14, v0, Lyyds/ᛵᲁᲀᲈ;->ᛱᲈᲁ:J

    .line 245
    .line 246
    new-instance v11, Lyyds/ᛸᛲᛴᲇ;

    .line 247
    .line 248
    invoke-direct {v11, v0, v1}, Lyyds/ᛸᛲᛴᲇ;-><init>(Lyyds/ᛵᲁᲀᲈ;Z)V

    .line 249
    .line 250
    .line 251
    iput-object v2, v4, Lyyds/ᲁᲈᛸᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 252
    .line 253
    iput-object v3, v4, Lyyds/ᲁᲈᛸᲈ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 254
    .line 255
    iput-object v6, v4, Lyyds/ᲁᲈᛸᲈ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛷᛸᲈ;

    .line 256
    .line 257
    iput-object v10, v4, Lyyds/ᲁᲈᛸᲈ;->ᛷᲈᲈᲁ:Lyyds/ᲁᛴᛲ;

    .line 258
    .line 259
    iput-object v6, v4, Lyyds/ᲁᲈᛸᲈ;->ᛷᛲᲈᛱ:Lyyds/ᛱᛷᛸᲈ;

    .line 260
    .line 261
    iput-object v13, v4, Lyyds/ᲁᲈᛸᲈ;->ᛷᛵᲇᲀ:Lyyds/ᛷᛶᲇᲁ;

    .line 262
    .line 263
    iput-boolean v1, v4, Lyyds/ᲁᲈᛸᲈ;->ᲇᲇᲇᛱ:Z

    .line 264
    .line 265
    iput v9, v4, Lyyds/ᲁᲈᛸᲈ;->ᛳᲁᲁᲇ:I

    .line 266
    .line 267
    invoke-virtual {v3, v14, v15, v11, v4}, Lyyds/ᛴᲈᲁᛴ;->ᛵᛸᛸᛷ(JLyyds/ᛸᛲᛴᲇ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 271
    if-ne v9, v5, :cond_f

    .line 272
    .line 273
    goto :goto_7

    .line 274
    :cond_f
    move-object v14, v2

    .line 275
    move-object v2, v13

    .line 276
    move-object v13, v3

    .line 277
    move-object v3, v9

    .line 278
    move-object v9, v6

    .line 279
    :goto_5
    :try_start_3
    check-cast v3, Lyyds/ᲁᛲᲁᛷ;

    .line 280
    .line 281
    iput-object v10, v3, Lyyds/ᲁᛲᲁᛷ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛴᛲ;

    .line 282
    .line 283
    new-instance v10, Ljava/lang/Throwable;

    .line 284
    .line 285
    invoke-direct {v10}, Ljava/lang/Throwable;-><init>()V

    .line 286
    .line 287
    .line 288
    iput-object v10, v3, Lyyds/ᲁᛲᲁᛷ;->ᲇᲇᲇᛱ:Ljava/lang/Throwable;

    .line 289
    .line 290
    iget-object v10, v0, Lyyds/ᛵᲁᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᲁᛴ;

    .line 291
    .line 292
    iget-object v11, v0, Lyyds/ᛵᲁᲀᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲈᲁᛴ;

    .line 293
    .line 294
    if-eq v10, v11, :cond_10

    .line 295
    .line 296
    if-eqz v1, :cond_10

    .line 297
    .line 298
    const/4 v1, 0x1

    .line 299
    goto :goto_6

    .line 300
    :cond_10
    const/4 v1, 0x0

    .line 301
    :goto_6
    new-instance v10, Lyyds/ᛶᲇᲈᛱ;

    .line 302
    .line 303
    invoke-direct {v10, v2, v3, v1}, Lyyds/ᛶᲇᲈᛱ;-><init>(Lyyds/ᛷᛶᲇᲁ;Lyyds/ᲁᛲᲁᛷ;Z)V

    .line 304
    .line 305
    .line 306
    iput-object v10, v9, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 307
    .line 308
    iget-object v1, v6, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 309
    .line 310
    if-eqz v1, :cond_14

    .line 311
    .line 312
    check-cast v1, Lyyds/ᛶᲇᲈᛱ;

    .line 313
    .line 314
    new-instance v2, Lyyds/ᲀᛳᲇᛶ;

    .line 315
    .line 316
    iget-object v3, v0, Lyyds/ᛵᲁᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛶᲇᲁ;

    .line 317
    .line 318
    invoke-direct {v2, v3, v1}, Lyyds/ᲀᛳᲇᛶ;-><init>(Lyyds/ᲁᛸᛲᲁ;Lyyds/ᛶᲇᲈᛱ;)V

    .line 319
    .line 320
    .line 321
    iget-object v0, v0, Lyyds/ᛵᲁᲀᲈ;->ᲇᲇᲇᛱ:Ljava/lang/ThreadLocal;

    .line 322
    .line 323
    new-instance v3, Lyyds/ᛸᛷᛶᲁ;

    .line 324
    .line 325
    invoke-direct {v3, v1, v0}, Lyyds/ᛸᛷᛶᲁ;-><init>(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V

    .line 326
    .line 327
    .line 328
    invoke-static {v2, v3}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛲᲈᲈ(Lyyds/ᲁᛴᛲ;Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    new-instance v1, Lyyds/ᛱᲁᛴᛴ;

    .line 333
    .line 334
    invoke-direct {v1, v14, v6, v12, v8}, Lyyds/ᛱᲁᛴᛴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 335
    .line 336
    .line 337
    iput-object v13, v4, Lyyds/ᲁᲈᛸᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 338
    .line 339
    iput-object v6, v4, Lyyds/ᲁᲈᛸᲈ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 340
    .line 341
    iput-object v12, v4, Lyyds/ᲁᲈᛸᲈ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛷᛸᲈ;

    .line 342
    .line 343
    iput-object v12, v4, Lyyds/ᲁᲈᛸᲈ;->ᛷᲈᲈᲁ:Lyyds/ᲁᛴᛲ;

    .line 344
    .line 345
    iput-object v12, v4, Lyyds/ᲁᲈᛸᲈ;->ᛷᛲᲈᛱ:Lyyds/ᛱᛷᛸᲈ;

    .line 346
    .line 347
    iput-object v12, v4, Lyyds/ᲁᲈᛸᲈ;->ᛷᛵᲇᲀ:Lyyds/ᛷᛶᲇᲁ;

    .line 348
    .line 349
    iput v8, v4, Lyyds/ᲁᲈᛸᲈ;->ᛳᲁᲁᲇ:I

    .line 350
    .line 351
    invoke-static {v0, v1, v4}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 355
    if-ne v3, v5, :cond_11

    .line 356
    .line 357
    :goto_7
    return-object v5

    .line 358
    :cond_11
    move-object v1, v6

    .line 359
    move-object v2, v13

    .line 360
    :goto_8
    iget-object v0, v1, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v0, Lyyds/ᛶᲇᲈᛱ;

    .line 363
    .line 364
    if-eqz v0, :cond_13

    .line 365
    .line 366
    iget-boolean v1, v0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 367
    .line 368
    if-nez v1, :cond_12

    .line 369
    .line 370
    const/4 v1, 0x1

    .line 371
    iput-boolean v1, v0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 372
    .line 373
    iget-object v1, v0, Lyyds/ᛶᲇᲈᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᲁᛷ;

    .line 374
    .line 375
    iget-object v1, v1, Lyyds/ᲁᛲᲁᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛵᛷ;

    .line 376
    .line 377
    invoke-interface {v1}, Lyyds/ᛱᛵᛷ;->ᛶᛳᛶᛵ()Z

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    if-eqz v1, :cond_12

    .line 382
    .line 383
    iget-object v1, v0, Lyyds/ᛶᲇᲈᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᲁᛷ;

    .line 384
    .line 385
    invoke-static {v1, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    :cond_12
    iget-object v0, v0, Lyyds/ᛶᲇᲈᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᲁᛷ;

    .line 389
    .line 390
    iput-object v12, v0, Lyyds/ᲁᛲᲁᛷ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛴᛲ;

    .line 391
    .line 392
    iput-object v12, v0, Lyyds/ᲁᛲᲁᛷ;->ᲇᲇᲇᛱ:Ljava/lang/Throwable;

    .line 393
    .line 394
    invoke-virtual {v2, v0}, Lyyds/ᛴᲈᲁᛴ;->ᛲᛴᛳᛲ(Lyyds/ᲁᛲᲁᛷ;)V

    .line 395
    .line 396
    .line 397
    :cond_13
    return-object v3

    .line 398
    :catchall_2
    move-exception v0

    .line 399
    move-object v1, v0

    .line 400
    goto/16 :goto_1

    .line 401
    .line 402
    :cond_14
    :try_start_4
    const-string v0, "Required value was null."

    .line 403
    .line 404
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 405
    .line 406
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 410
    :catchall_3
    move-exception v0

    .line 411
    move-object v1, v0

    .line 412
    move-object v2, v3

    .line 413
    :goto_9
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 414
    :catchall_4
    move-exception v0

    .line 415
    move-object v3, v0

    .line 416
    :try_start_6
    iget-object v0, v6, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v0, Lyyds/ᛶᲇᲈᛱ;

    .line 419
    .line 420
    if-eqz v0, :cond_16

    .line 421
    .line 422
    iget-boolean v4, v0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 423
    .line 424
    if-nez v4, :cond_15

    .line 425
    .line 426
    const/4 v4, 0x1

    .line 427
    iput-boolean v4, v0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 428
    .line 429
    iget-object v4, v0, Lyyds/ᛶᲇᲈᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᲁᛷ;

    .line 430
    .line 431
    iget-object v4, v4, Lyyds/ᲁᛲᲁᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛵᛷ;

    .line 432
    .line 433
    invoke-interface {v4}, Lyyds/ᛱᛵᛷ;->ᛶᛳᛶᛵ()Z

    .line 434
    .line 435
    .line 436
    move-result v4

    .line 437
    if-eqz v4, :cond_15

    .line 438
    .line 439
    iget-object v4, v0, Lyyds/ᛶᲇᲈᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᲁᛷ;

    .line 440
    .line 441
    invoke-static {v4, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    :cond_15
    iget-object v0, v0, Lyyds/ᛶᲇᲈᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᲁᛷ;

    .line 445
    .line 446
    iput-object v12, v0, Lyyds/ᲁᛲᲁᛷ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛴᛲ;

    .line 447
    .line 448
    iput-object v12, v0, Lyyds/ᲁᛲᲁᛷ;->ᲇᲇᲇᛱ:Ljava/lang/Throwable;

    .line 449
    .line 450
    invoke-virtual {v2, v0}, Lyyds/ᛴᲈᲁᛴ;->ᛲᛴᛳᛲ(Lyyds/ᲁᛲᲁᛷ;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 451
    .line 452
    .line 453
    goto :goto_a

    .line 454
    :catchall_5
    move-exception v0

    .line 455
    invoke-static {v1, v0}, Lyyds/ᛷᛶᛷᛵ;->ᛲᲈᲁ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 456
    .line 457
    .line 458
    :cond_16
    :goto_a
    throw v3

    .line 459
    :cond_17
    const/16 v0, 0x15

    .line 460
    .line 461
    const-string v1, "Connection pool is closed"

    .line 462
    .line 463
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 464
    .line 465
    .line 466
    throw v12
.end method
