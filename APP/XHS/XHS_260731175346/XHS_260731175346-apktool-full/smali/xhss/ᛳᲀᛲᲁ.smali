.class public final Lxhss/ᛳᲀᛲᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛷᛶᛷᛲ;


# static fields
.field public static final ᛸᛴᛶᛳ:Ljava/util/List;

.field public static final ᲀᲇᛳᲁ:Ljava/util/List;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᲁᲈᲀᲈ;

.field public final ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

.field public final ᛷᛴᛷᛱ:Lxhss/ᲈᛲᛵᛴ;

.field public final ᛷᛵᛵᲈ:Lxhss/ᲈᲁᛲᲇ;

.field public volatile ᲇᛴᲇᛵ:Lxhss/ᛸᛳᛴ;

.field public volatile ᲇᛶᛴᲀ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const-string v10, ":scheme"

    .line 2
    .line 3
    const-string v11, ":authority"

    .line 4
    .line 5
    const-string v0, "connection"

    .line 6
    .line 7
    const-string v1, "host"

    .line 8
    .line 9
    const-string v2, "keep-alive"

    .line 10
    .line 11
    const-string v3, "proxy-connection"

    .line 12
    .line 13
    const-string v4, "te"

    .line 14
    .line 15
    const-string v5, "transfer-encoding"

    .line 16
    .line 17
    const-string v6, "encoding"

    .line 18
    .line 19
    const-string v7, "upgrade"

    .line 20
    .line 21
    const-string v8, ":method"

    .line 22
    .line 23
    const-string v9, ":path"

    .line 24
    .line 25
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lxhss/ᛶᛴᲀᛲ;->ᛸᛷᲈᲈ([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lxhss/ᛳᲀᛲᲁ;->ᲀᲇᛳᲁ:Ljava/util/List;

    .line 34
    .line 35
    const-string v7, "encoding"

    .line 36
    .line 37
    const-string v8, "upgrade"

    .line 38
    .line 39
    const-string v1, "connection"

    .line 40
    .line 41
    const-string v2, "host"

    .line 42
    .line 43
    const-string v3, "keep-alive"

    .line 44
    .line 45
    const-string v4, "proxy-connection"

    .line 46
    .line 47
    const-string v5, "te"

    .line 48
    .line 49
    const-string v6, "transfer-encoding"

    .line 50
    .line 51
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lxhss/ᛶᛴᲀᛲ;->ᛸᛷᲈᲈ([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lxhss/ᛳᲀᛲᲁ;->ᛸᛴᛶᛳ:Ljava/util/List;

    .line 60
    .line 61
    return-void
.end method

.method public constructor <init>(Lxhss/ᛵᛸᛷᛲ;Lxhss/ᲈᲁᛲᲇ;Lxhss/ᲁᲈᲀᲈ;Lxhss/ᲁᛲᛵ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lxhss/ᛳᲀᛲᲁ;->ᛷᛵᛵᲈ:Lxhss/ᲈᲁᛲᲇ;

    .line 5
    .line 6
    iput-object p3, p0, Lxhss/ᛳᲀᛲᲁ;->ᛱᛱᛲᲇ:Lxhss/ᲁᲈᲀᲈ;

    .line 7
    .line 8
    iput-object p4, p0, Lxhss/ᛳᲀᛲᲁ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 9
    .line 10
    iget-object p1, p1, Lxhss/ᛵᛸᛷᛲ;->ᛸᛲᛷᛱ:Ljava/util/List;

    .line 11
    .line 12
    sget-object p2, Lxhss/ᲈᛲᛵᛴ;->ᲀᲇᛳᲁ:Lxhss/ᲈᛲᛵᛴ;

    .line 13
    .line 14
    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object p2, Lxhss/ᲈᛲᛵᛴ;->ᲇᛶᛴᲀ:Lxhss/ᲈᛲᛵᛴ;

    .line 22
    .line 23
    :goto_0
    iput-object p2, p0, Lxhss/ᛳᲀᛲᲁ;->ᛷᛴᛷᛱ:Lxhss/ᲈᛲᛵᛴ;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lxhss/ᛳᲀᛲᲁ;->ᲇᛶᛴᲀ:Z

    .line 3
    .line 4
    iget-object p0, p0, Lxhss/ᛳᲀᛲᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛸᛳᛴ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/16 v0, 0x9

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lxhss/ᛸᛳᛴ;->ᲀᲇᛳᲁ(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final ᛱᛱᛲᲇ()Z
    .locals 4

    .line 1
    iget-object p0, p0, Lxhss/ᛳᲀᛲᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛸᛳᛴ;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v1, p0, Lxhss/ᛸᛳᛴ;->ᛸᛲᲀᛵ:Lxhss/ᛱᲀᲇᛳ;

    .line 8
    .line 9
    iget-boolean v2, v1, Lxhss/ᛱᲀᲇᛳ;->ᛳᲁᲇᛸ:Z

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-object v1, v1, Lxhss/ᛱᲀᲇᛳ;->ᛷᛴᛷᛱ:Lxhss/ᛴᛲᛴᛶ;

    .line 15
    .line 16
    invoke-virtual {v1}, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ()Z

    .line 17
    .line 18
    .line 19
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    move v1, v3

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    move v1, v0

    .line 27
    :goto_0
    monitor-exit p0

    .line 28
    if-ne v1, v3, :cond_1

    .line 29
    .line 30
    return v3

    .line 31
    :goto_1
    monitor-exit p0

    .line 32
    throw v0

    .line 33
    :cond_1
    return v0
.end method

.method public final ᛳᲁᲇᛸ()Lxhss/ᛳᛵᛲᲁ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᲀᛲᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛸᛳᛴ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛷᛴᛷᛱ(Lxhss/ᲀᛶᛷᲁ;)J
    .locals 0

    .line 1
    invoke-static {p1}, Lxhss/ᲇᲈᲀᛵ;->ᛷᛵᛵᲈ(Lxhss/ᲀᛶᛷᲁ;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-wide/16 p0, 0x0

    .line 8
    .line 9
    return-wide p0

    .line 10
    :cond_0
    invoke-static {p1}, Lxhss/ᛶᛴᲀᛲ;->ᛷᛴᛷᛱ(Lxhss/ᲀᛶᛷᲁ;)J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0
.end method

.method public final ᛷᛵᛵᲈ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᲀᛲᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛸᛳᛴ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛸᛳᛴ;->ᛸᛷᲈᲈ:Lxhss/ᲀᛲᲀᲁ;

    .line 4
    .line 5
    invoke-virtual {p0}, Lxhss/ᲀᛲᲀᲁ;->close()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ᛸᛴᛶᛳ()Lxhss/ᛳᛵᛴ;
    .locals 10

    .line 1
    iget-object v0, p0, Lxhss/ᛳᲀᛲᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛸᛳᛴ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_c

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :cond_0
    :goto_0
    :try_start_0
    iget-object v2, v0, Lxhss/ᛸᛳᛴ;->ᲀᲇᛳᲁ:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    if-eqz v2, :cond_5

    .line 16
    .line 17
    invoke-virtual {v0}, Lxhss/ᛸᛳᛴ;->ᛸᛴᛶᛳ()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_5

    .line 22
    .line 23
    iget-object v2, v0, Lxhss/ᛸᛳᛴ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v2, v0, Lxhss/ᛸᛳᛴ;->ᛸᛷᲈᲈ:Lxhss/ᲀᛲᲀᲁ;

    .line 29
    .line 30
    iget-boolean v5, v2, Lxhss/ᲀᛲᲀᲁ;->ᲇᛴᲇᛵ:Z

    .line 31
    .line 32
    if-nez v5, :cond_2

    .line 33
    .line 34
    iget-boolean v2, v2, Lxhss/ᲀᛲᲀᲁ;->ᛱᛱᛲᲇ:Z

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v3, v4

    .line 40
    :cond_2
    :goto_1
    if-eqz v3, :cond_3

    .line 41
    .line 42
    iget-object v2, v0, Lxhss/ᛸᛳᛴ;->ᲈᛳᲀ:Lxhss/ᛵᛴᲇ;

    .line 43
    .line 44
    invoke-virtual {v2}, Lxhss/ᲈᲀᲇᛶ;->ᛸᛴᛶᛳ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto/16 :goto_7

    .line 50
    .line 51
    :cond_3
    :goto_2
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 52
    .line 53
    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    :try_start_2
    iget-object v2, v0, Lxhss/ᛸᛳᛴ;->ᲈᛳᲀ:Lxhss/ᛵᛴᲇ;

    .line 57
    .line 58
    invoke-virtual {v2}, Lxhss/ᛵᛴᲇ;->ᲈᛳᲀ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_1
    move-exception p0

    .line 63
    goto :goto_3

    .line 64
    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 69
    .line 70
    .line 71
    new-instance p0, Ljava/io/InterruptedIOException;

    .line 72
    .line 73
    invoke-direct {p0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 74
    .line 75
    .line 76
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 77
    :goto_3
    if-eqz v3, :cond_4

    .line 78
    .line 79
    :try_start_4
    iget-object v1, v0, Lxhss/ᛸᛳᛴ;->ᲈᛳᲀ:Lxhss/ᛵᛴᲇ;

    .line 80
    .line 81
    invoke-virtual {v1}, Lxhss/ᛵᛴᲇ;->ᲈᛳᲀ()V

    .line 82
    .line 83
    .line 84
    :cond_4
    throw p0

    .line 85
    :cond_5
    iget-object v2, v0, Lxhss/ᛸᛳᛴ;->ᲀᲇᛳᲁ:Ljava/util/ArrayDeque;

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_a

    .line 92
    .line 93
    iget-object v2, v0, Lxhss/ᛸᛳᛴ;->ᲀᲇᛳᲁ:Ljava/util/ArrayDeque;

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Lxhss/ᲁᛸᛱᛵ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 100
    .line 101
    monitor-exit v0

    .line 102
    iget-object p0, p0, Lxhss/ᛳᲀᛲᲁ;->ᛷᛴᛷᛱ:Lxhss/ᲈᛲᛵᛴ;

    .line 103
    .line 104
    new-instance v0, Ljava/util/ArrayList;

    .line 105
    .line 106
    const/16 v5, 0x14

    .line 107
    .line 108
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Lxhss/ᲁᛸᛱᛵ;->size()I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    move v6, v4

    .line 116
    :goto_4
    if-ge v6, v5, :cond_8

    .line 117
    .line 118
    invoke-static {v2, v6}, Lxhss/ᛷᛸᲀᲀ;->ᛷᲁᲁ(Lxhss/ᲁᛸᛱᛵ;I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-static {v2, v6}, Lxhss/ᛷᛸᲀᲀ;->ᲇᛸᛳᲁ(Lxhss/ᲁᛸᛱᛵ;I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    const-string v9, ":status"

    .line 127
    .line 128
    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    if-eqz v9, :cond_6

    .line 133
    .line 134
    const-string v1, "HTTP/1.1 "

    .line 135
    .line 136
    invoke-virtual {v1, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-static {v1}, Lxhss/ᲁᛵᛸᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;)Lxhss/ᛵᛶᛳ;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    goto :goto_5

    .line 145
    :cond_6
    sget-object v9, Lxhss/ᛳᲀᛲᲁ;->ᛸᛴᛶᛳ:Ljava/util/List;

    .line 146
    .line 147
    invoke-interface {v9, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    if-nez v9, :cond_7

    .line 152
    .line 153
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    invoke-static {v8}, Lxhss/ᛲᛱᛲᲀ;->ᛵᛳᛸᲇ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    :cond_7
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_8
    if-eqz v1, :cond_9

    .line 171
    .line 172
    new-instance v2, Lxhss/ᛳᛵᛴ;

    .line 173
    .line 174
    invoke-direct {v2}, Lxhss/ᛳᛵᛴ;-><init>()V

    .line 175
    .line 176
    .line 177
    iput-object p0, v2, Lxhss/ᛳᛵᛴ;->ᛱᛱᛲᲇ:Lxhss/ᲈᛲᛵᛴ;

    .line 178
    .line 179
    iget p0, v1, Lxhss/ᛵᛶᛳ;->ᛱᛱᛲᲇ:I

    .line 180
    .line 181
    iput p0, v2, Lxhss/ᛳᛵᛴ;->ᛳᲁᲇᛸ:I

    .line 182
    .line 183
    iget-object p0, v1, Lxhss/ᛵᛶᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p0, Ljava/lang/String;

    .line 186
    .line 187
    iput-object p0, v2, Lxhss/ᛳᛵᛴ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 188
    .line 189
    new-array p0, v4, [Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    check-cast p0, [Ljava/lang/String;

    .line 196
    .line 197
    new-instance v0, Lxhss/ᛴᲈᛱᲁ;

    .line 198
    .line 199
    invoke-direct {v0, v3}, Lxhss/ᛴᲈᛱᲁ;-><init>(I)V

    .line 200
    .line 201
    .line 202
    iget-object v1, v0, Lxhss/ᛴᲈᛱᲁ;->ᛷᛵᛵᲈ:Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-interface {v1, p0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 209
    .line 210
    .line 211
    iput-object v0, v2, Lxhss/ᛳᛵᛴ;->ᲇᛶᛴᲀ:Lxhss/ᛴᲈᛱᲁ;

    .line 212
    .line 213
    return-object v2

    .line 214
    :cond_9
    new-instance p0, Ljava/net/ProtocolException;

    .line 215
    .line 216
    const-string v0, "Expected \':status\' header not present"

    .line 217
    .line 218
    invoke-direct {p0, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw p0

    .line 222
    :cond_a
    :try_start_5
    iget-object p0, v0, Lxhss/ᛸᛳᛴ;->ᲇᛸᛳᲁ:Ljava/io/IOException;

    .line 223
    .line 224
    if-eqz p0, :cond_b

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_b
    new-instance p0, Lxhss/ᛱᲁᛲᛱ;

    .line 228
    .line 229
    invoke-virtual {v0}, Lxhss/ᛸᛳᛴ;->ᛸᛴᛶᛳ()I

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    invoke-direct {p0, v1}, Lxhss/ᛱᲁᛲᛱ;-><init>(I)V

    .line 234
    .line 235
    .line 236
    :goto_6
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 237
    :goto_7
    monitor-exit v0

    .line 238
    throw p0

    .line 239
    :cond_c
    const-string p0, "stream wasn\'t created"

    .line 240
    .line 241
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    return-object v1
.end method

.method public final ᲀᲇᛳᲁ(Lxhss/ᛴᛴᛴᛵ;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lxhss/ᛳᲀᛲᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛸᛳᛴ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p1, Lxhss/ᛴᛴᛴᛵ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lxhss/ᲁᛸᛱᛵ;

    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0}, Lxhss/ᲁᛸᛱᛵ;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/lit8 v2, v2, 0x4

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lxhss/ᛱᛵᲀᛱ;

    .line 22
    .line 23
    sget-object v3, Lxhss/ᛱᛵᲀᛱ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛶᲈᲈ;

    .line 24
    .line 25
    iget-object v4, p1, Lxhss/ᛴᛴᛴᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct {v2, v3, v4}, Lxhss/ᛱᛵᲀᛱ;-><init>(Lxhss/ᛳᛶᲈᲈ;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    new-instance v2, Lxhss/ᛱᛵᲀᛱ;

    .line 36
    .line 37
    sget-object v3, Lxhss/ᛱᛵᲀᛱ;->ᲀᲇᛳᲁ:Lxhss/ᛳᛶᲈᲈ;

    .line 38
    .line 39
    iget-object p1, p1, Lxhss/ᛴᛴᛴᛵ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lxhss/ᛷᛶᲁᛵ;

    .line 42
    .line 43
    invoke-virtual {p1}, Lxhss/ᛷᛶᲁᛵ;->ᛱᛱᛲᲇ()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {p1}, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    if-eqz v5, :cond_1

    .line 52
    .line 53
    new-instance v6, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/16 v4, 0x3f

    .line 59
    .line 60
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    :cond_1
    invoke-direct {v2, v3, v4}, Lxhss/ᛱᛵᲀᛱ;-><init>(Lxhss/ᛳᛶᲈᲈ;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    const-string v2, "Host"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Lxhss/ᲁᛸᛱᛵ;->ᛷᛵᛵᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-eqz v2, :cond_2

    .line 83
    .line 84
    new-instance v3, Lxhss/ᛱᛵᲀᛱ;

    .line 85
    .line 86
    sget-object v4, Lxhss/ᛱᛵᲀᛱ;->ᛸᛲᲀᛵ:Lxhss/ᛳᛶᲈᲈ;

    .line 87
    .line 88
    invoke-direct {v3, v4, v2}, Lxhss/ᛱᛵᲀᛱ;-><init>(Lxhss/ᛳᛶᲈᲈ;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    :cond_2
    new-instance v2, Lxhss/ᛱᛵᲀᛱ;

    .line 95
    .line 96
    sget-object v3, Lxhss/ᛱᛵᲀᛱ;->ᛸᛴᛶᛳ:Lxhss/ᛳᛶᲈᲈ;

    .line 97
    .line 98
    iget-object p1, p1, Lxhss/ᛷᛶᲁᛵ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 99
    .line 100
    invoke-direct {v2, v3, p1}, Lxhss/ᛱᛵᲀᛱ;-><init>(Lxhss/ᛳᛶᲈᲈ;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Lxhss/ᲁᛸᛱᛵ;->size()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    const/4 v2, 0x0

    .line 111
    :goto_0
    if-ge v2, p1, :cond_5

    .line 112
    .line 113
    invoke-static {v0, v2}, Lxhss/ᛷᛸᲀᲀ;->ᛷᲁᲁ(Lxhss/ᲁᛸᛱᛵ;I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 118
    .line 119
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    sget-object v4, Lxhss/ᛳᲀᛲᲁ;->ᲀᲇᛳᲁ:Ljava/util/List;

    .line 124
    .line 125
    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-eqz v4, :cond_3

    .line 130
    .line 131
    const-string v4, "te"

    .line 132
    .line 133
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_4

    .line 138
    .line 139
    invoke-static {v0, v2}, Lxhss/ᛷᛸᲀᲀ;->ᲇᛸᛳᲁ(Lxhss/ᲁᛸᛱᛵ;I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    const-string v5, "trailers"

    .line 144
    .line 145
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-eqz v4, :cond_4

    .line 150
    .line 151
    :cond_3
    new-instance v4, Lxhss/ᛱᛵᲀᛱ;

    .line 152
    .line 153
    invoke-static {v0, v2}, Lxhss/ᛷᛸᲀᲀ;->ᲇᛸᛳᲁ(Lxhss/ᲁᛸᛱᛵ;I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-direct {v4, v3, v5}, Lxhss/ᛱᛵᲀᛱ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_5
    iget-object v5, p0, Lxhss/ᛳᲀᛲᲁ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 167
    .line 168
    iget-object p1, v5, Lxhss/ᲁᛲᛵ;->ᲀᛷᲁᲀ:Lxhss/ᲀᛱᛶᛳ;

    .line 169
    .line 170
    monitor-enter p1

    .line 171
    :try_start_0
    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 172
    :try_start_1
    iget v0, v5, Lxhss/ᲁᛲᛵ;->ᲇᛶᛴᲀ:I

    .line 173
    .line 174
    const v2, 0x3fffffff    # 1.9999999f

    .line 175
    .line 176
    .line 177
    if-le v0, v2, :cond_6

    .line 178
    .line 179
    const/16 v0, 0x8

    .line 180
    .line 181
    invoke-virtual {v5, v0}, Lxhss/ᲁᛲᛵ;->ᲀᲇᛳᲁ(I)V

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :catchall_0
    move-exception v0

    .line 186
    move-object p0, v0

    .line 187
    goto :goto_2

    .line 188
    :cond_6
    :goto_1
    iget-boolean v0, v5, Lxhss/ᲁᛲᛵ;->ᲀᲇᛳᲁ:Z

    .line 189
    .line 190
    if-nez v0, :cond_9

    .line 191
    .line 192
    iget v4, v5, Lxhss/ᲁᛲᛵ;->ᲇᛶᛴᲀ:I

    .line 193
    .line 194
    add-int/lit8 v0, v4, 0x2

    .line 195
    .line 196
    iput v0, v5, Lxhss/ᲁᛲᛵ;->ᲇᛶᛴᲀ:I

    .line 197
    .line 198
    new-instance v3, Lxhss/ᛸᛳᛴ;

    .line 199
    .line 200
    const/4 v8, 0x0

    .line 201
    const/4 v6, 0x1

    .line 202
    const/4 v7, 0x0

    .line 203
    invoke-direct/range {v3 .. v8}, Lxhss/ᛸᛳᛴ;-><init>(ILxhss/ᲁᛲᛵ;ZZLxhss/ᲁᛸᛱᛵ;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3}, Lxhss/ᛸᛳᛴ;->ᛸᛷᲈᲈ()Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_7

    .line 211
    .line 212
    iget-object v0, v5, Lxhss/ᲁᛲᛵ;->ᛳᲁᲇᛸ:Ljava/util/LinkedHashMap;

    .line 213
    .line 214
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 219
    .line 220
    .line 221
    :cond_7
    :try_start_2
    monitor-exit v5

    .line 222
    iget-object v0, v5, Lxhss/ᲁᛲᛵ;->ᲀᛷᲁᲀ:Lxhss/ᲀᛱᛶᛳ;

    .line 223
    .line 224
    invoke-virtual {v0, v6, v4, v1}, Lxhss/ᲀᛱᛶᛳ;->ᛸᛲᲀᛵ(ZILjava/util/ArrayList;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 225
    .line 226
    .line 227
    monitor-exit p1

    .line 228
    iget-object p1, v5, Lxhss/ᲁᛲᛵ;->ᲀᛷᲁᲀ:Lxhss/ᲀᛱᛶᛳ;

    .line 229
    .line 230
    invoke-virtual {p1}, Lxhss/ᲀᛱᛶᛳ;->flush()V

    .line 231
    .line 232
    .line 233
    iput-object v3, p0, Lxhss/ᛳᲀᛲᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛸᛳᛴ;

    .line 234
    .line 235
    iget-boolean p1, p0, Lxhss/ᛳᲀᛲᲁ;->ᲇᛶᛴᲀ:Z

    .line 236
    .line 237
    iget-object v0, p0, Lxhss/ᛳᲀᛲᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛸᛳᛴ;

    .line 238
    .line 239
    if-nez p1, :cond_8

    .line 240
    .line 241
    iget-object p1, v0, Lxhss/ᛸᛳᛴ;->ᲈᛳᲀ:Lxhss/ᛵᛴᲇ;

    .line 242
    .line 243
    iget-object v0, p0, Lxhss/ᛳᲀᛲᲁ;->ᛱᛱᛲᲇ:Lxhss/ᲁᲈᲀᲈ;

    .line 244
    .line 245
    iget v0, v0, Lxhss/ᲁᲈᲀᲈ;->ᲀᲇᛳᲁ:I

    .line 246
    .line 247
    int-to-long v0, v0

    .line 248
    invoke-virtual {p1, v0, v1}, Lxhss/ᛲᲁᲈᛲ;->ᲀᲇᛳᲁ(J)Lxhss/ᛲᲁᲈᛲ;

    .line 249
    .line 250
    .line 251
    iget-object p1, p0, Lxhss/ᛳᲀᛲᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛸᛳᛴ;

    .line 252
    .line 253
    iget-object p1, p1, Lxhss/ᛸᛳᛴ;->ᛷᲁᲁ:Lxhss/ᛵᛴᲇ;

    .line 254
    .line 255
    iget-object p0, p0, Lxhss/ᛳᲀᛲᲁ;->ᛱᛱᛲᲇ:Lxhss/ᲁᲈᲀᲈ;

    .line 256
    .line 257
    iget p0, p0, Lxhss/ᲁᲈᲀᲈ;->ᛸᛴᛶᛳ:I

    .line 258
    .line 259
    int-to-long v0, p0

    .line 260
    invoke-virtual {p1, v0, v1}, Lxhss/ᛲᲁᲈᛲ;->ᲀᲇᛳᲁ(J)Lxhss/ᛲᲁᲈᛲ;

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :cond_8
    const/16 p0, 0x9

    .line 265
    .line 266
    invoke-virtual {v0, p0}, Lxhss/ᛸᛳᛴ;->ᲀᲇᛳᲁ(I)V

    .line 267
    .line 268
    .line 269
    const-string p0, "Canceled"

    .line 270
    .line 271
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :catchall_1
    move-exception v0

    .line 276
    move-object p0, v0

    .line 277
    goto :goto_3

    .line 278
    :cond_9
    :try_start_3
    new-instance p0, Lxhss/ᲇᛷᛴᛴ;

    .line 279
    .line 280
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 281
    .line 282
    .line 283
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 284
    :goto_2
    :try_start_4
    monitor-exit v5

    .line 285
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 286
    :goto_3
    monitor-exit p1

    .line 287
    throw p0
.end method

.method public final ᲇᛴᲇᛵ()Lxhss/ᲀᲀᲁᛱ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᲀᛲᲁ;->ᛷᛵᛵᲈ:Lxhss/ᲈᲁᛲᲇ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᛶᛴᲀ(Lxhss/ᲀᛶᛷᲁ;)Lxhss/ᲇᲁᲀᲇ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᲀᛲᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛸᛳᛴ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛸᛳᛴ;->ᛸᛲᲀᛵ:Lxhss/ᛱᲀᲇᛳ;

    .line 4
    .line 5
    return-object p0
.end method
