.class public final Lyyds/ᛱᛴᛳᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛷᛲᲈᛱ:Ljava/util/logging/Logger;

.field public static final ᛷᛵᲇᲀ:Lyyds/ᛱᛴᛳᛱ;


# instance fields
.field public final ᛱᲈᲁ:Ljava/util/ArrayList;

.field public final ᛲᛳᛶᲁ:Ljava/util/ArrayList;

.field public ᛲᛴᛳᛲ:J

.field public final ᛲᲈᲁ:Lyyds/ᲀᛵᲁᛴ;

.field public final ᛵᛸᛸᛷ:Ljava/util/logging/Logger;

.field public ᛶᛷᛲᲁ:I

.field public final ᛷᲈᲈᲁ:Lyyds/ᛴᛶᛳᛸ;

.field public ᲀᛲᛳᲀ:I

.field public ᲇᲇᲇᛱ:I

.field public ᲇᲈᛵᛷ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-class v0, Lyyds/ᛱᛴᛳᛱ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lyyds/ᛱᛴᛳᛱ;->ᛷᛲᲈᛱ:Ljava/util/logging/Logger;

    .line 12
    .line 13
    new-instance v0, Lyyds/ᛱᛴᛳᛱ;

    .line 14
    .line 15
    new-instance v1, Lyyds/ᲀᛵᲁᛴ;

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v3, Lyyds/ᛴᛲᛲᲇ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 23
    .line 24
    const-string v4, " TaskRunner"

    .line 25
    .line 26
    invoke-static {v2, v3, v4}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛵᲇᲀ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    new-instance v3, Lyyds/ᛸᛴᛸᛸ;

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    invoke-direct {v3, v2, v4}, Lyyds/ᛸᛴᛸᛸ;-><init>(Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v1, v3}, Lyyds/ᲀᛵᲁᛴ;-><init>(Lyyds/ᛸᛴᛸᛸ;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v1}, Lyyds/ᛱᛴᛳᛱ;-><init>(Lyyds/ᲀᛵᲁᛴ;)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lyyds/ᛱᛴᛳᛱ;->ᛷᛵᲇᲀ:Lyyds/ᛱᛴᛳᛱ;

    .line 43
    .line 44
    return-void
.end method

.method public constructor <init>(Lyyds/ᲀᛵᲁᛴ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛱᛴᛳᛱ;->ᛲᲈᲁ:Lyyds/ᲀᛵᲁᛴ;

    .line 5
    .line 6
    sget-object p1, Lyyds/ᛱᛴᛳᛱ;->ᛷᛲᲈᛱ:Ljava/util/logging/Logger;

    .line 7
    .line 8
    iput-object p1, p0, Lyyds/ᛱᛴᛳᛱ;->ᛵᛸᛸᛷ:Ljava/util/logging/Logger;

    .line 9
    .line 10
    const/16 p1, 0x2710

    .line 11
    .line 12
    iput p1, p0, Lyyds/ᛱᛴᛳᛱ;->ᲀᛲᛳᲀ:I

    .line 13
    .line 14
    new-instance p1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lyyds/ᛱᛴᛳᛱ;->ᛱᲈᲁ:Ljava/util/ArrayList;

    .line 20
    .line 21
    new-instance p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lyyds/ᛱᛴᛳᛱ;->ᛲᛳᛶᲁ:Ljava/util/ArrayList;

    .line 27
    .line 28
    new-instance p1, Lyyds/ᛴᛶᛳᛸ;

    .line 29
    .line 30
    const/16 v0, 0x10

    .line 31
    .line 32
    invoke-direct {p1, v0, p0}, Lyyds/ᛴᛶᛳᛸ;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lyyds/ᛱᛴᛳᛱ;->ᛷᲈᲈᲁ:Lyyds/ᛴᛶᛳᛸ;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ()V
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 2
    .line 3
    iget v0, p0, Lyyds/ᛱᛴᛳᛱ;->ᲇᲇᲇᛱ:I

    .line 4
    .line 5
    iget v1, p0, Lyyds/ᛱᛴᛳᛱ;->ᛶᛷᛲᲁ:I

    .line 6
    .line 7
    if-le v0, v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iput v0, p0, Lyyds/ᛱᛴᛳᛱ;->ᲇᲇᲇᛱ:I

    .line 13
    .line 14
    iget-object v0, p0, Lyyds/ᛱᛴᛳᛱ;->ᛲᲈᲁ:Lyyds/ᲀᛵᲁᛴ;

    .line 15
    .line 16
    iget-object v0, v0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᛱᛴᛳᛱ;->ᛷᲈᲈᲁ:Lyyds/ᛴᛶᛳᛸ;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final ᛲᲈᲁ(Lyyds/ᛳᲀᛵᛸ;JZ)V
    .locals 4

    .line 1
    sget-object v0, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 2
    .line 3
    iget-object v0, p1, Lyyds/ᛳᲀᛵᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛷᛱᛳ;

    .line 4
    .line 5
    iget-object v1, v0, Lyyds/ᛱᛷᛱᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛸ;

    .line 6
    .line 7
    if-ne v1, p1, :cond_2

    .line 8
    .line 9
    iget-boolean v1, v0, Lyyds/ᛱᛷᛱᛳ;->ᲇᲇᲇᛱ:Z

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iput-boolean v2, v0, Lyyds/ᛱᛷᛱᛳ;->ᲇᲇᲇᛱ:Z

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iput-object v2, v0, Lyyds/ᛱᛷᛱᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛸ;

    .line 16
    .line 17
    iget-object v2, p0, Lyyds/ᛱᛴᛳᛱ;->ᛱᲈᲁ:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    const-wide/16 v2, -0x1

    .line 23
    .line 24
    cmp-long v2, p2, v2

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    iget-boolean v1, v0, Lyyds/ᛱᛷᛱᛳ;->ᲀᛲᛳᲀ:Z

    .line 31
    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-virtual {v0, p1, p2, p3, v1}, Lyyds/ᛱᛷᛱᛳ;->ᲇᲈᛵᛷ(Lyyds/ᛳᲀᛵᛸ;JZ)Z

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object p1, v0, Lyyds/ᛱᛷᛱᛳ;->ᛲᛴᛳᛲ:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    iget-object p1, p0, Lyyds/ᛱᛴᛳᛱ;->ᛲᛳᛶᲁ:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    if-nez p4, :cond_1

    .line 52
    .line 53
    invoke-virtual {p0}, Lyyds/ᛱᛴᛳᛱ;->ᛲᛴᛳᛲ()V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-void

    .line 57
    :cond_2
    const-string p0, "Check failed."

    .line 58
    .line 59
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final ᛵᛸᛸᛷ()Lyyds/ᛳᲀᛵᛸ;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 4
    .line 5
    :goto_0
    iget-object v0, v1, Lyyds/ᛱᛴᛳᛱ;->ᛲᛳᛶᲁ:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-wide v6, 0x7fffffffffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    move-object v8, v3

    .line 30
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v9

    .line 34
    const/4 v10, 0x1

    .line 35
    const-wide/16 v11, 0x0

    .line 36
    .line 37
    const/4 v13, 0x0

    .line 38
    if-eqz v9, :cond_3

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    check-cast v9, Lyyds/ᛱᛷᛱᛳ;

    .line 45
    .line 46
    iget-object v9, v9, Lyyds/ᛱᛷᛱᛳ;->ᛲᛴᛳᛲ:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    check-cast v9, Lyyds/ᛳᲀᛵᛸ;

    .line 53
    .line 54
    iget-wide v14, v9, Lyyds/ᛳᲀᛵᛸ;->ᲇᲈᛵᛷ:J

    .line 55
    .line 56
    sub-long/2addr v14, v4

    .line 57
    invoke-static {v11, v12, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide v14

    .line 61
    cmp-long v16, v14, v11

    .line 62
    .line 63
    if-lez v16, :cond_1

    .line 64
    .line 65
    invoke-static {v14, v15, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 66
    .line 67
    .line 68
    move-result-wide v6

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    if-eqz v8, :cond_2

    .line 71
    .line 72
    move v2, v10

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    move-object v8, v9

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    move v2, v13

    .line 77
    :goto_2
    iget-object v9, v1, Lyyds/ᛱᛴᛳᛱ;->ᛱᲈᲁ:Ljava/util/ArrayList;

    .line 78
    .line 79
    if-eqz v8, :cond_6

    .line 80
    .line 81
    sget-object v3, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 82
    .line 83
    const-wide/16 v3, -0x1

    .line 84
    .line 85
    iput-wide v3, v8, Lyyds/ᛳᲀᛵᛸ;->ᲇᲈᛵᛷ:J

    .line 86
    .line 87
    iget-object v3, v8, Lyyds/ᛳᲀᛵᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛷᛱᛳ;

    .line 88
    .line 89
    iget-object v4, v3, Lyyds/ᛱᛷᛱᛳ;->ᛲᛴᛳᛲ:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    iput-object v8, v3, Lyyds/ᛱᛷᛱᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛸ;

    .line 98
    .line 99
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    if-nez v2, :cond_4

    .line 103
    .line 104
    iget-boolean v2, v1, Lyyds/ᛱᛴᛳᛱ;->ᲇᲈᛵᛷ:Z

    .line 105
    .line 106
    if-nez v2, :cond_5

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_5

    .line 113
    .line 114
    :cond_4
    invoke-virtual {v1}, Lyyds/ᛱᛴᛳᛱ;->ᛲᛴᛳᛲ()V

    .line 115
    .line 116
    .line 117
    :cond_5
    return-object v8

    .line 118
    :cond_6
    iget-boolean v2, v1, Lyyds/ᛱᛴᛳᛱ;->ᲇᲈᛵᛷ:Z

    .line 119
    .line 120
    if-eqz v2, :cond_8

    .line 121
    .line 122
    iget-wide v8, v1, Lyyds/ᛱᛴᛳᛱ;->ᛲᛴᛳᛲ:J

    .line 123
    .line 124
    sub-long/2addr v8, v4

    .line 125
    cmp-long v0, v6, v8

    .line 126
    .line 127
    if-gez v0, :cond_7

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 130
    .line 131
    .line 132
    :cond_7
    :goto_3
    return-object v3

    .line 133
    :cond_8
    iput-boolean v10, v1, Lyyds/ᛱᛴᛳᛱ;->ᲇᲈᛵᛷ:Z

    .line 134
    .line 135
    add-long/2addr v4, v6

    .line 136
    iput-wide v4, v1, Lyyds/ᛱᛴᛳᛱ;->ᛲᛴᛳᛲ:J

    .line 137
    .line 138
    :try_start_0
    sget-object v2, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 139
    .line 140
    cmp-long v2, v6, v11

    .line 141
    .line 142
    if-lez v2, :cond_a

    .line 143
    .line 144
    const-wide/32 v3, 0xf4240

    .line 145
    .line 146
    .line 147
    div-long v14, v6, v3

    .line 148
    .line 149
    mul-long/2addr v3, v14

    .line 150
    sub-long/2addr v6, v3

    .line 151
    cmp-long v3, v14, v11

    .line 152
    .line 153
    if-gtz v3, :cond_9

    .line 154
    .line 155
    if-lez v2, :cond_a

    .line 156
    .line 157
    :cond_9
    long-to-int v2, v6

    .line 158
    invoke-virtual {v1, v14, v15, v2}, Ljava/lang/Object;->wait(JI)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :catchall_0
    move-exception v0

    .line 163
    goto :goto_7

    .line 164
    :cond_a
    :goto_4
    iput-boolean v13, v1, Lyyds/ᛱᛴᛳᛱ;->ᲇᲈᛵᛷ:Z

    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :catch_0
    :try_start_1
    sget-object v2, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 169
    .line 170
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    sub-int/2addr v2, v10

    .line 175
    :goto_5
    const/4 v3, -0x1

    .line 176
    if-ge v3, v2, :cond_b

    .line 177
    .line 178
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Lyyds/ᛱᛷᛱᛳ;

    .line 183
    .line 184
    invoke-virtual {v3}, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ()Z

    .line 185
    .line 186
    .line 187
    add-int/lit8 v2, v2, -0x1

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_b
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    sub-int/2addr v2, v10

    .line 195
    :goto_6
    if-ge v3, v2, :cond_a

    .line 196
    .line 197
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    check-cast v4, Lyyds/ᛱᛷᛱᛳ;

    .line 202
    .line 203
    invoke-virtual {v4}, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ()Z

    .line 204
    .line 205
    .line 206
    iget-object v4, v4, Lyyds/ᛱᛷᛱᛳ;->ᛲᛴᛳᛲ:Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    if-eqz v4, :cond_c

    .line 213
    .line 214
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 215
    .line 216
    .line 217
    :cond_c
    add-int/lit8 v2, v2, -0x1

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :goto_7
    iput-boolean v13, v1, Lyyds/ᛱᛴᛳᛱ;->ᲇᲈᛵᛷ:Z

    .line 221
    .line 222
    throw v0
.end method

.method public final ᲀᛲᛳᲀ(Lyyds/ᛱᛷᛱᛳ;)V
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 2
    .line 3
    iget-object v0, p1, Lyyds/ᛱᛷᛱᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛸ;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p1, Lyyds/ᛱᛷᛱᛳ;->ᛲᛴᛳᛲ:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lyyds/ᛱᛴᛳᛱ;->ᛲᛳᛶᲁ:Ljava/util/ArrayList;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    iget-boolean p1, p0, Lyyds/ᛱᛴᛳᛱ;->ᲇᲈᛵᛷ:Z

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    invoke-virtual {p0}, Lyyds/ᛱᛴᛳᛱ;->ᛲᛴᛳᛲ()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final ᲇᲈᛵᛷ()Lyyds/ᛱᛷᛱᛳ;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lyyds/ᛱᛴᛳᛱ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x1

    .line 5
    .line 6
    iput v1, p0, Lyyds/ᛱᛴᛳᛱ;->ᲀᛲᛳᲀ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    new-instance v1, Lyyds/ᛱᛷᛱᛳ;

    .line 10
    .line 11
    const-string v2, "Q"

    .line 12
    .line 13
    invoke-static {v0, v2}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {v1, p0, v0}, Lyyds/ᛱᛷᛱᛳ;-><init>(Lyyds/ᛱᛴᛳᛱ;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    monitor-exit p0

    .line 23
    throw v0
.end method
