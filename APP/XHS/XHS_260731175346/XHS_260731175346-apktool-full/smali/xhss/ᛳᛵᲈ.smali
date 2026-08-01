.class public final Lxhss/ᛳᛵᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᛸᲁᛶ;
.implements Lxhss/ᲀᲀᲁᛱ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᲈᛲᲀᛵ;

.field public ᛳᛶᛷᲀ:Lxhss/ᛷᛱᛳᲁ;

.field public final ᛳᲁᲇᛸ:I

.field public volatile ᛳᲈᲈᛲ:Z

.field public ᛴᲈᛱᛴ:Lxhss/ᲈᛲᛵᛴ;

.field public ᛶᲇᲈᛸ:Ljava/net/Socket;

.field public final ᛷᛴᛷᛱ:I

.field public final ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛴᛳ;

.field public final ᛷᲁᲁ:Lxhss/ᛴᛴᛴᛵ;

.field public ᛸᛲᛷᛱ:Lxhss/ᛵᛲᛸᛲ;

.field public final ᛸᛲᲀᛵ:Lxhss/ᲁᛴᛶᛸ;

.field public final ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

.field public ᛸᛶᛴᲈ:Ljava/net/Socket;

.field public final ᛸᛶᲈᛶ:I

.field public final ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

.field public final ᲀᲇᛳᲁ:Z

.field public ᲁᛲᛴᛴ:Lxhss/ᲈᲁᛲᲇ;

.field public final ᲇᛴᲇᛵ:I

.field public final ᲇᛶᛴᲀ:I

.field public final ᲇᛸᛳᲁ:Z

.field public final ᲈᛳᲀ:Ljava/util/List;


# direct methods
.method public constructor <init>(Lxhss/ᛸᛱᛴᛳ;Lxhss/ᲈᛲᲀᛵ;IIIIZLxhss/ᛸᲇᲇᛶ;Lxhss/ᲁᛴᛶᛸ;Lxhss/ᛱᛷᲁᛶ;Ljava/util/List;Lxhss/ᛴᛴᛴᛵ;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛳᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛴᛳ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛳᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᲈᛲᲀᛵ;

    .line 7
    .line 8
    iput p3, p0, Lxhss/ᛳᛵᲈ;->ᛳᲁᲇᛸ:I

    .line 9
    .line 10
    iput p4, p0, Lxhss/ᛳᛵᲈ;->ᲇᛴᲇᛵ:I

    .line 11
    .line 12
    iput p5, p0, Lxhss/ᛳᛵᲈ;->ᛷᛴᛷᛱ:I

    .line 13
    .line 14
    iput p6, p0, Lxhss/ᛳᛵᲈ;->ᲇᛶᛴᲀ:I

    .line 15
    .line 16
    iput-boolean p7, p0, Lxhss/ᛳᛵᲈ;->ᲀᲇᛳᲁ:Z

    .line 17
    .line 18
    iput-object p8, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 19
    .line 20
    iput-object p9, p0, Lxhss/ᛳᛵᲈ;->ᛸᛲᲀᛵ:Lxhss/ᲁᛴᛶᛸ;

    .line 21
    .line 22
    iput-object p10, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 23
    .line 24
    iput-object p11, p0, Lxhss/ᛳᛵᲈ;->ᲈᛳᲀ:Ljava/util/List;

    .line 25
    .line 26
    iput-object p12, p0, Lxhss/ᛳᛵᲈ;->ᛷᲁᲁ:Lxhss/ᛴᛴᛴᛵ;

    .line 27
    .line 28
    iput p13, p0, Lxhss/ᛳᛵᲈ;->ᛸᛶᲈᛶ:I

    .line 29
    .line 30
    iput-boolean p14, p0, Lxhss/ᛳᛵᲈ;->ᲇᛸᛳᲁ:Z

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lxhss/ᛳᛵᲈ;->ᛳᲈᲈᛲ:Z

    .line 3
    .line 4
    iget-object p0, p0, Lxhss/ᛳᛵᲈ;->ᛶᲇᲈᛸ:Ljava/net/Socket;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, Lxhss/ᛶᛴᲀᛲ;->ᛳᲁᲇᛸ(Ljava/net/Socket;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final ᛱᛱᛲᲇ()Lxhss/ᛲᛷᛷᛵ;
    .locals 12

    .line 1
    iget-object v3, p0, Lxhss/ᛳᛵᲈ;->ᛶᲇᲈᛸ:Ljava/net/Socket;

    .line 2
    .line 3
    const/4 v8, 0x0

    .line 4
    if-eqz v3, :cond_12

    .line 5
    .line 6
    invoke-virtual {p0}, Lxhss/ᛳᛵᲈ;->ᲇᛴᲇᛵ()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_11

    .line 11
    .line 12
    iget-object v0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 13
    .line 14
    iget-object v0, v0, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 15
    .line 16
    iget-object v0, v0, Lxhss/ᛵᲈᛱᛳ;->ᛸᛷᲈᲈ:Ljava/util/List;

    .line 17
    .line 18
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 19
    .line 20
    iget-object v1, v1, Lxhss/ᛸᲇᲇᛶ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    const/4 v9, 0x0

    .line 26
    :try_start_0
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛷᲁᲁ:Lxhss/ᛴᛴᛴᛵ;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Lxhss/ᛳᛵᲈ;->ᲈᛳᲀ()Lxhss/ᛲᛷᛷᛵ;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v2, v1, Lxhss/ᛲᛷᛷᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Throwable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 39
    .line 40
    iget-object v0, v0, Lxhss/ᛸᲇᲇᛶ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛶᛴᲈ:Ljava/net/Socket;

    .line 46
    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    invoke-static {p0}, Lxhss/ᛶᛴᲀᛲ;->ᛳᲁᲇᛸ(Ljava/net/Socket;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-static {v3}, Lxhss/ᛶᛴᲀᛲ;->ᛳᲁᲇᛸ(Ljava/net/Socket;)V

    .line 53
    .line 54
    .line 55
    return-object v1

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :catch_0
    move-exception v0

    .line 60
    move-object v5, v8

    .line 61
    goto/16 :goto_3

    .line 62
    .line 63
    :cond_1
    :try_start_1
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 64
    .line 65
    iget-object v1, v1, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 66
    .line 67
    iget-object v2, v1, Lxhss/ᛵᲈᛱᛳ;->ᛳᲁᲇᛸ:Ljavax/net/ssl/SSLSocketFactory;

    .line 68
    .line 69
    const/4 v10, 0x1

    .line 70
    if-eqz v2, :cond_5

    .line 71
    .line 72
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛳᛶᛷᲀ:Lxhss/ᛷᛱᛳᲁ;

    .line 73
    .line 74
    if-nez v1, :cond_2

    .line 75
    .line 76
    move-object v1, v8

    .line 77
    :cond_2
    iget-object v1, v1, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, Lxhss/ᲁᛸᛵᛳ;

    .line 80
    .line 81
    iget-object v1, v1, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 82
    .line 83
    invoke-virtual {v1}, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_4

    .line 88
    .line 89
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛳᛶᛷᲀ:Lxhss/ᛷᛱᛳᲁ;

    .line 90
    .line 91
    if-nez v1, :cond_3

    .line 92
    .line 93
    move-object v1, v8

    .line 94
    :cond_3
    iget-object v1, v1, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Lxhss/ᛱᛸᛵᛱ;

    .line 97
    .line 98
    iget-object v1, v1, Lxhss/ᛱᛸᛵᛱ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 99
    .line 100
    invoke-virtual {v1}, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 107
    .line 108
    iget-object v1, v1, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 114
    .line 115
    iget-object v1, v1, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 116
    .line 117
    iget-object v2, v1, Lxhss/ᛵᲈᛱᛳ;->ᛳᲁᲇᛸ:Ljavax/net/ssl/SSLSocketFactory;

    .line 118
    .line 119
    iget-object v1, v1, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 120
    .line 121
    iget-object v4, v1, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 122
    .line 123
    iget v1, v1, Lxhss/ᛷᛶᲁᛵ;->ᛷᛴᛷᛱ:I

    .line 124
    .line 125
    invoke-virtual {v2, v3, v4, v1, v10}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    check-cast v1, Ljavax/net/ssl/SSLSocket;

    .line 130
    .line 131
    invoke-virtual {p0, v0, v1}, Lxhss/ᛳᛵᲈ;->ᛸᛶᲈᛶ(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lxhss/ᛳᛵᲈ;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    iget v4, v2, Lxhss/ᛳᛵᲈ;->ᛸᛶᲈᛶ:I

    .line 136
    .line 137
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, Lxhss/ᛶᛴᛴᛳ;

    .line 142
    .line 143
    invoke-virtual {v2, v0, v1}, Lxhss/ᛳᛵᲈ;->ᛷᲁᲁ(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lxhss/ᛳᛵᲈ;

    .line 144
    .line 145
    .line 146
    move-result-object v5
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 147
    :try_start_2
    iget-boolean v0, v2, Lxhss/ᛳᛵᲈ;->ᲇᛸᛳᲁ:Z

    .line 148
    .line 149
    invoke-virtual {v4, v1, v0}, Lxhss/ᛶᛴᛴᛳ;->ᛷᛵᛵᲈ(Ljavax/net/ssl/SSLSocket;Z)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, v1, v4}, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ(Ljavax/net/ssl/SSLSocket;Lxhss/ᛶᛴᛴᛳ;)V

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 156
    .line 157
    iget-object v0, v0, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 160
    .line 161
    .line 162
    move-object v11, v5

    .line 163
    goto :goto_1

    .line 164
    :catch_1
    move-exception v0

    .line 165
    goto :goto_3

    .line 166
    :cond_4
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    .line 167
    .line 168
    const-string v1, "TLS tunnel buffered too many bytes!"

    .line 169
    .line 170
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v0

    .line 174
    :cond_5
    iput-object v3, p0, Lxhss/ᛳᛵᲈ;->ᛸᛶᛴᲈ:Ljava/net/Socket;

    .line 175
    .line 176
    iget-object v0, v1, Lxhss/ᛵᲈᛱᛳ;->ᛸᛲᲀᛵ:Ljava/util/List;

    .line 177
    .line 178
    sget-object v1, Lxhss/ᲈᛲᛵᛴ;->ᲀᲇᛳᲁ:Lxhss/ᲈᛲᛵᛴ;

    .line 179
    .line 180
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_6

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_6
    sget-object v1, Lxhss/ᲈᛲᛵᛴ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛲᛵᛴ;

    .line 188
    .line 189
    :goto_0
    iput-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛴᲈᛱᛴ:Lxhss/ᲈᛲᛵᛴ;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 190
    .line 191
    move-object v11, v8

    .line 192
    :goto_1
    :try_start_4
    new-instance v0, Lxhss/ᲈᲁᛲᲇ;

    .line 193
    .line 194
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛴᛳ;

    .line 195
    .line 196
    iget-object v2, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 197
    .line 198
    iget-object v4, p0, Lxhss/ᛳᛵᲈ;->ᛸᛶᛴᲈ:Ljava/net/Socket;

    .line 199
    .line 200
    iget-object v5, p0, Lxhss/ᛳᛵᲈ;->ᛸᛲᛷᛱ:Lxhss/ᛵᛲᛸᛲ;

    .line 201
    .line 202
    iget-object v6, p0, Lxhss/ᛳᛵᲈ;->ᛴᲈᛱᛴ:Lxhss/ᲈᛲᛵᛴ;

    .line 203
    .line 204
    iget-object v7, p0, Lxhss/ᛳᛵᲈ;->ᛳᛶᛷᲀ:Lxhss/ᛷᛱᛳᲁ;

    .line 205
    .line 206
    if-nez v7, :cond_7

    .line 207
    .line 208
    move-object v7, v8

    .line 209
    :cond_7
    invoke-direct/range {v0 .. v7}, Lxhss/ᲈᲁᛲᲇ;-><init>(Lxhss/ᛸᛱᛴᛳ;Lxhss/ᛱᛷᲁᛶ;Ljava/net/Socket;Ljava/net/Socket;Lxhss/ᛵᛲᛸᛲ;Lxhss/ᲈᛲᛵᛴ;Lxhss/ᛷᛱᛳᲁ;)V

    .line 210
    .line 211
    .line 212
    iput-object v0, p0, Lxhss/ᛳᛵᲈ;->ᲁᛲᛴᛴ:Lxhss/ᲈᲁᛲᲇ;

    .line 213
    .line 214
    invoke-virtual {v0}, Lxhss/ᲈᲁᛲᲇ;->ᛸᛲᲀᛵ()V

    .line 215
    .line 216
    .line 217
    iget-object v0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 218
    .line 219
    iget-object v0, v0, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 220
    .line 221
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 222
    .line 223
    iget-object v1, v1, Lxhss/ᛱᛷᲁᛶ;->ᛳᲁᲇᛸ:Ljava/net/InetSocketAddress;

    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 226
    .line 227
    .line 228
    :try_start_5
    new-instance v0, Lxhss/ᛲᛷᛷᛵ;

    .line 229
    .line 230
    const/4 v1, 0x6

    .line 231
    invoke-direct {v0, p0, v8, v1}, Lxhss/ᛲᛷᛷᛵ;-><init>(Lxhss/ᛱᛸᲁᛶ;Ljava/lang/Throwable;I)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 232
    .line 233
    .line 234
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 235
    .line 236
    iget-object v1, v1, Lxhss/ᛸᲇᲇᛶ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 237
    .line 238
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    return-object v0

    .line 242
    :catchall_1
    move-exception v0

    .line 243
    move v9, v10

    .line 244
    goto :goto_5

    .line 245
    :catch_2
    move-exception v0

    .line 246
    move v9, v10

    .line 247
    :goto_2
    move-object v5, v11

    .line 248
    goto :goto_3

    .line 249
    :catch_3
    move-exception v0

    .line 250
    goto :goto_2

    .line 251
    :goto_3
    :try_start_6
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 252
    .line 253
    iget-object v1, v1, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 254
    .line 255
    iget-object v2, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 256
    .line 257
    iget-object v2, v2, Lxhss/ᛱᛷᲁᛶ;->ᛳᲁᲇᛸ:Ljava/net/InetSocketAddress;

    .line 258
    .line 259
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    iget-boolean v1, p0, Lxhss/ᛳᛵᲈ;->ᲀᲇᛳᲁ:Z

    .line 263
    .line 264
    if-eqz v1, :cond_c

    .line 265
    .line 266
    instance-of v1, v0, Ljava/net/ProtocolException;

    .line 267
    .line 268
    if-eqz v1, :cond_8

    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_8
    instance-of v1, v0, Ljava/io/InterruptedIOException;

    .line 272
    .line 273
    if-eqz v1, :cond_9

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_9
    instance-of v1, v0, Ljavax/net/ssl/SSLHandshakeException;

    .line 277
    .line 278
    if-eqz v1, :cond_a

    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    instance-of v1, v1, Ljava/security/cert/CertificateException;

    .line 285
    .line 286
    if-eqz v1, :cond_a

    .line 287
    .line 288
    goto :goto_4

    .line 289
    :cond_a
    instance-of v1, v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 290
    .line 291
    if-eqz v1, :cond_b

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_b
    instance-of v1, v0, Ljavax/net/ssl/SSLException;

    .line 295
    .line 296
    if-eqz v1, :cond_c

    .line 297
    .line 298
    move-object v8, v5

    .line 299
    :cond_c
    :goto_4
    new-instance v1, Lxhss/ᛲᛷᛷᛵ;

    .line 300
    .line 301
    invoke-direct {v1, p0, v8, v0}, Lxhss/ᛲᛷᛷᛵ;-><init>(Lxhss/ᛱᛸᲁᛶ;Lxhss/ᛳᛵᲈ;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 302
    .line 303
    .line 304
    iget-object v0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 305
    .line 306
    iget-object v0, v0, Lxhss/ᛸᲇᲇᛶ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 307
    .line 308
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    if-nez v9, :cond_e

    .line 312
    .line 313
    iget-object p0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛶᛴᲈ:Ljava/net/Socket;

    .line 314
    .line 315
    if-eqz p0, :cond_d

    .line 316
    .line 317
    invoke-static {p0}, Lxhss/ᛶᛴᲀᛲ;->ᛳᲁᲇᛸ(Ljava/net/Socket;)V

    .line 318
    .line 319
    .line 320
    :cond_d
    invoke-static {v3}, Lxhss/ᛶᛴᲀᛲ;->ᛳᲁᲇᛸ(Ljava/net/Socket;)V

    .line 321
    .line 322
    .line 323
    :cond_e
    return-object v1

    .line 324
    :goto_5
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 325
    .line 326
    iget-object v1, v1, Lxhss/ᛸᲇᲇᛶ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 327
    .line 328
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    if-nez v9, :cond_10

    .line 332
    .line 333
    iget-object p0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛶᛴᲈ:Ljava/net/Socket;

    .line 334
    .line 335
    if-eqz p0, :cond_f

    .line 336
    .line 337
    invoke-static {p0}, Lxhss/ᛶᛴᲀᛲ;->ᛳᲁᲇᛸ(Ljava/net/Socket;)V

    .line 338
    .line 339
    .line 340
    :cond_f
    invoke-static {v3}, Lxhss/ᛶᛴᲀᛲ;->ᛳᲁᲇᛸ(Ljava/net/Socket;)V

    .line 341
    .line 342
    .line 343
    :cond_10
    throw v0

    .line 344
    :cond_11
    const-string p0, "already connected"

    .line 345
    .line 346
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    return-object v8

    .line 350
    :cond_12
    const-string p0, "TCP not connected"

    .line 351
    .line 352
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    return-object v8
.end method

.method public final ᛳᲁᲇᛸ()Lxhss/ᲈᲁᛲᲇ;
    .locals 5

    .line 1
    iget-object v0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 2
    .line 3
    iget-object v0, v0, Lxhss/ᛸᲇᲇᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛸᛷᛲ;

    .line 4
    .line 5
    iget-object v0, v0, Lxhss/ᛵᛸᛷᛲ;->ᛱᛳᲁᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 6
    .line 7
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v2, v0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 13
    .line 14
    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    iget-object v0, p0, Lxhss/ᛳᛵᲈ;->ᲁᛲᛴᛴ:Lxhss/ᲈᲁᛲᲇ;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛸᛲᲀᛵ:Lxhss/ᲁᛴᛶᛸ;

    .line 24
    .line 25
    iget-object v2, p0, Lxhss/ᛳᛵᲈ;->ᲈᛳᲀ:Ljava/util/List;

    .line 26
    .line 27
    invoke-virtual {v1, p0, v2}, Lxhss/ᲁᛴᛶᛸ;->ᲇᛴᲇᛵ(Lxhss/ᛳᛵᲈ;Ljava/util/List;)Lxhss/ᛴᛸᲇᛵ;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    iget-object p0, v1, Lxhss/ᛴᛸᲇᛵ;->ᛷᛵᛵᲈ:Lxhss/ᲈᲁᛲᲇ;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    monitor-enter v0

    .line 37
    :try_start_1
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᲈᛲᲀᛵ;

    .line 38
    .line 39
    sget-object v2, Lxhss/ᛶᛴᲀᛲ;->ᛷᛵᛵᲈ:Ljava/util/TimeZone;

    .line 40
    .line 41
    iget-object v2, v1, Lxhss/ᲈᛲᲀᛵ;->ᲇᛴᲇᛵ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    iget-object v2, v1, Lxhss/ᲈᛲᲀᛵ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲀᲀᛷ;

    .line 47
    .line 48
    iget-object v1, v1, Lxhss/ᲈᛲᲀᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛷᲀᲁᲇ;

    .line 49
    .line 50
    const-wide/16 v3, 0x0

    .line 51
    .line 52
    invoke-virtual {v2, v1, v3, v4}, Lxhss/ᲇᲀᲀᛷ;->ᛳᲁᲇᛸ(Lxhss/ᛵᛳᲀᛲ;J)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Lxhss/ᛸᲇᲇᛶ;->ᛷᛵᛵᲈ(Lxhss/ᲈᲁᛲᲇ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    .line 60
    monitor-exit v0

    .line 61
    iget-object p0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 62
    .line 63
    iget-object p0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    monitor-exit v0

    .line 71
    throw p0

    .line 72
    :catchall_1
    move-exception p0

    .line 73
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 74
    throw p0
.end method

.method public final ᛷᛴᛷᛱ()Lxhss/ᛱᛷᲁᛶ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ()Lxhss/ᛱᛸᲁᛶ;
    .locals 15

    .line 1
    new-instance v0, Lxhss/ᛳᛵᲈ;

    .line 2
    .line 3
    iget v13, p0, Lxhss/ᛳᛵᲈ;->ᛸᛶᲈᛶ:I

    .line 4
    .line 5
    iget-boolean v14, p0, Lxhss/ᛳᛵᲈ;->ᲇᛸᛳᲁ:Z

    .line 6
    .line 7
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛴᛳ;

    .line 8
    .line 9
    iget-object v2, p0, Lxhss/ᛳᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᲈᛲᲀᛵ;

    .line 10
    .line 11
    iget v3, p0, Lxhss/ᛳᛵᲈ;->ᛳᲁᲇᛸ:I

    .line 12
    .line 13
    iget v4, p0, Lxhss/ᛳᛵᲈ;->ᲇᛴᲇᛵ:I

    .line 14
    .line 15
    iget v5, p0, Lxhss/ᛳᛵᲈ;->ᛷᛴᛷᛱ:I

    .line 16
    .line 17
    iget v6, p0, Lxhss/ᛳᛵᲈ;->ᲇᛶᛴᲀ:I

    .line 18
    .line 19
    iget-boolean v7, p0, Lxhss/ᛳᛵᲈ;->ᲀᲇᛳᲁ:Z

    .line 20
    .line 21
    iget-object v8, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 22
    .line 23
    iget-object v9, p0, Lxhss/ᛳᛵᲈ;->ᛸᛲᲀᛵ:Lxhss/ᲁᛴᛶᛸ;

    .line 24
    .line 25
    iget-object v10, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 26
    .line 27
    iget-object v11, p0, Lxhss/ᛳᛵᲈ;->ᲈᛳᲀ:Ljava/util/List;

    .line 28
    .line 29
    iget-object v12, p0, Lxhss/ᛳᛵᲈ;->ᛷᲁᲁ:Lxhss/ᛴᛴᛴᛵ;

    .line 30
    .line 31
    invoke-direct/range {v0 .. v14}, Lxhss/ᛳᛵᲈ;-><init>(Lxhss/ᛸᛱᛴᛳ;Lxhss/ᲈᛲᲀᛵ;IIIIZLxhss/ᛸᲇᲇᛶ;Lxhss/ᲁᛴᛶᛸ;Lxhss/ᛱᛷᲁᛶ;Ljava/util/List;Lxhss/ᛴᛴᛴᛵ;IZ)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public final ᛷᲁᲁ(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lxhss/ᛳᛵᲈ;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lxhss/ᛳᛵᲈ;->ᛸᛶᲈᛶ:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    :goto_0
    if-ge v2, v3, :cond_4

    .line 12
    .line 13
    move-object/from16 v4, p1

    .line 14
    .line 15
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    check-cast v5, Lxhss/ᛶᛴᛴᛳ;

    .line 20
    .line 21
    iget-boolean v6, v5, Lxhss/ᛶᛴᛴᛳ;->ᛷᛵᛵᲈ:Z

    .line 22
    .line 23
    if-nez v6, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v6, v5, Lxhss/ᛶᛴᛴᛳ;->ᲇᛴᲇᛵ:[Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v6, :cond_1

    .line 29
    .line 30
    invoke-virtual/range {p2 .. p2}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    sget-object v8, Lxhss/ᛸᛳᛷᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛸᛳᛷᛲ;

    .line 35
    .line 36
    invoke-static {v6, v7, v8}, Lxhss/ᛶᛸᛲ;->ᲇᛴᲇᛵ([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-nez v6, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v5, v5, Lxhss/ᛶᛴᛴᛳ;->ᛳᲁᲇᛸ:[Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    invoke-virtual/range {p2 .. p2}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    sget-object v7, Lxhss/ᛳᲁᲇᲀ;->ᛳᲁᲇᛸ:Lxhss/ᛸᛲᲇᲁ;

    .line 52
    .line 53
    invoke-static {v5, v6, v7}, Lxhss/ᛶᛸᛲ;->ᲇᛴᲇᛵ([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-nez v5, :cond_2

    .line 58
    .line 59
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const/4 v3, -0x1

    .line 63
    if-eq v1, v3, :cond_3

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    :goto_2
    move/from16 v18, v1

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    const/4 v1, 0x0

    .line 70
    goto :goto_2

    .line 71
    :goto_3
    new-instance v4, Lxhss/ᛳᛵᲈ;

    .line 72
    .line 73
    iget-object v14, v0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 74
    .line 75
    iget-object v15, v0, Lxhss/ᛳᛵᲈ;->ᲈᛳᲀ:Ljava/util/List;

    .line 76
    .line 77
    iget-object v5, v0, Lxhss/ᛳᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛴᛳ;

    .line 78
    .line 79
    iget-object v6, v0, Lxhss/ᛳᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᲈᛲᲀᛵ;

    .line 80
    .line 81
    iget v7, v0, Lxhss/ᛳᛵᲈ;->ᛳᲁᲇᛸ:I

    .line 82
    .line 83
    iget v8, v0, Lxhss/ᛳᛵᲈ;->ᲇᛴᲇᛵ:I

    .line 84
    .line 85
    iget v9, v0, Lxhss/ᛳᛵᲈ;->ᛷᛴᛷᛱ:I

    .line 86
    .line 87
    iget v10, v0, Lxhss/ᛳᛵᲈ;->ᲇᛶᛴᲀ:I

    .line 88
    .line 89
    iget-boolean v11, v0, Lxhss/ᛳᛵᲈ;->ᲀᲇᛳᲁ:Z

    .line 90
    .line 91
    iget-object v12, v0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 92
    .line 93
    iget-object v13, v0, Lxhss/ᛳᛵᲈ;->ᛸᛲᲀᛵ:Lxhss/ᲁᛴᛶᛸ;

    .line 94
    .line 95
    iget-object v0, v0, Lxhss/ᛳᛵᲈ;->ᛷᲁᲁ:Lxhss/ᛴᛴᛴᛵ;

    .line 96
    .line 97
    move-object/from16 v16, v0

    .line 98
    .line 99
    move/from16 v17, v2

    .line 100
    .line 101
    invoke-direct/range {v4 .. v18}, Lxhss/ᛳᛵᲈ;-><init>(Lxhss/ᛸᛱᛴᛳ;Lxhss/ᲈᛲᲀᛵ;IIIIZLxhss/ᛸᲇᲇᛶ;Lxhss/ᲁᛴᛶᛸ;Lxhss/ᛱᛷᲁᛶ;Ljava/util/List;Lxhss/ᛴᛴᛴᛵ;IZ)V

    .line 102
    .line 103
    .line 104
    return-object v4

    .line 105
    :cond_4
    const/4 v0, 0x0

    .line 106
    return-object v0
.end method

.method public final ᛸᛲᲀᛵ()V
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 2
    .line 3
    iget-object v0, v0, Lxhss/ᛱᛷᲁᛶ;->ᛱᛱᛲᲇ:Ljava/net/Proxy;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v1, Lxhss/ᛶᛳᛸᛵ;->ᛷᛵᛵᲈ:[I

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    aget v0, v1, v0

    .line 20
    .line 21
    :goto_0
    const/4 v1, 0x1

    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    new-instance v0, Ljava/net/Socket;

    .line 28
    .line 29
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 30
    .line 31
    iget-object v1, v1, Lxhss/ᛱᛷᲁᛶ;->ᛱᛱᛲᲇ:Ljava/net/Proxy;

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iget-object v0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 38
    .line 39
    iget-object v0, v0, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 40
    .line 41
    iget-object v0, v0, Lxhss/ᛵᲈᛱᛳ;->ᛱᛱᛲᲇ:Ljavax/net/SocketFactory;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :goto_1
    iput-object v0, p0, Lxhss/ᛳᛵᲈ;->ᛶᲇᲈᛸ:Ljava/net/Socket;

    .line 48
    .line 49
    iget-boolean v1, p0, Lxhss/ᛳᛵᲈ;->ᛳᲈᲈᛲ:Z

    .line 50
    .line 51
    if-nez v1, :cond_3

    .line 52
    .line 53
    iget v1, p0, Lxhss/ᛳᛵᲈ;->ᲇᛶᛴᲀ:I

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 56
    .line 57
    .line 58
    :try_start_0
    sget-object v1, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 59
    .line 60
    sget-object v1, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 61
    .line 62
    iget-object v2, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 63
    .line 64
    iget-object v2, v2, Lxhss/ᛱᛷᲁᛶ;->ᛳᲁᲇᛸ:Ljava/net/InetSocketAddress;

    .line 65
    .line 66
    iget v3, p0, Lxhss/ᛳᛵᲈ;->ᛷᛴᛷᛱ:I

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v2, v3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    .line 72
    .line 73
    .line 74
    :try_start_1
    new-instance v1, Lxhss/ᲇᛸᛶ;

    .line 75
    .line 76
    invoke-direct {v1, v0}, Lxhss/ᲇᛸᛶ;-><init>(Ljava/net/Socket;)V

    .line 77
    .line 78
    .line 79
    new-instance v0, Lxhss/ᛷᛱᛳᲁ;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lxhss/ᛷᛱᛳᲁ;-><init>(Lxhss/ᲇᛸᛶ;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, Lxhss/ᛳᛵᲈ;->ᛳᛶᛷᲀ:Lxhss/ᛷᛱᛳᲁ;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 85
    .line 86
    return-void

    .line 87
    :catch_0
    move-exception p0

    .line 88
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const-string v1, "throw with null exception"

    .line 93
    .line 94
    invoke-static {v0, v1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_2

    .line 99
    .line 100
    return-void

    .line 101
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 102
    .line 103
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    throw v0

    .line 107
    :catch_1
    move-exception v0

    .line 108
    new-instance v1, Ljava/net/ConnectException;

    .line 109
    .line 110
    new-instance v2, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v3, "Failed to connect to "

    .line 113
    .line 114
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-object p0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 118
    .line 119
    iget-object p0, p0, Lxhss/ᛱᛷᲁᛶ;->ᛳᲁᲇᛸ:Ljava/net/InetSocketAddress;

    .line 120
    .line 121
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-direct {v1, p0}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 132
    .line 133
    .line 134
    throw v1

    .line 135
    :cond_3
    const-string p0, "canceled"

    .line 136
    .line 137
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method public final ᛸᛴᛶᛳ()V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᛸᛶᲈᛶ(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lxhss/ᛳᛵᲈ;
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛶᲈᛶ:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Lxhss/ᛳᛵᲈ;->ᛷᲁᲁ(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lxhss/ᛳᛵᲈ;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_1
    new-instance v0, Ljava/net/UnknownServiceException;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "Unable to find acceptable protocols. isFallback="

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-boolean p0, p0, Lxhss/ᛳᛵᲈ;->ᲇᛸᛳᲁ:Z

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p0, ", modes="

    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string p1, ", supported protocols="

    .line 45
    .line 46
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-direct {v0, p0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v0
.end method

.method public final ᛸᛷᲈᲈ(Ljavax/net/ssl/SSLSocket;Lxhss/ᛶᛴᛴᛳ;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 2
    .line 3
    iget-object v0, v0, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 4
    .line 5
    :try_start_0
    iget-boolean v1, p2, Lxhss/ᛶᛴᛴᛳ;->ᛱᛱᛲᲇ:Z

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    sget-object v1, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 11
    .line 12
    sget-object v1, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 13
    .line 14
    iget-object v3, v0, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 15
    .line 16
    iget-object v3, v3, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v4, v0, Lxhss/ᛵᲈᛱᛳ;->ᛸᛲᲀᛵ:Ljava/util/List;

    .line 19
    .line 20
    iget-object v1, v1, Lxhss/ᛵᛳᛸᲇ;->ᛳᲁᲇᛸ:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    move-object v6, v5

    .line 37
    check-cast v6, Lxhss/ᲈᲀᛳᲇ;

    .line 38
    .line 39
    invoke-interface {v6, p1}, Lxhss/ᲈᲀᛳᲇ;->ᛷᛵᛵᲈ(Ljavax/net/ssl/SSLSocket;)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-object v5, v2

    .line 47
    :goto_0
    check-cast v5, Lxhss/ᲈᲀᛳᲇ;

    .line 48
    .line 49
    if-eqz v5, :cond_2

    .line 50
    .line 51
    invoke-interface {v5, p1, v3, v4}, Lxhss/ᲈᲀᛳᲇ;->ᲇᛴᲇᛵ(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_2
    :goto_1
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v1}, Lxhss/ᛱᛷᛵᛷ;->ᲀᲇᛳᲁ(Ljavax/net/ssl/SSLSession;)Lxhss/ᛵᛲᛸᛲ;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    iget-object v4, v0, Lxhss/ᛵᲈᛱᛳ;->ᲇᛴᲇᛵ:Ljavax/net/ssl/HostnameVerifier;

    .line 70
    .line 71
    iget-object v5, v0, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 72
    .line 73
    iget-object v5, v5, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 74
    .line 75
    invoke-interface {v4, v5, v1}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_4

    .line 80
    .line 81
    invoke-virtual {v3}, Lxhss/ᛵᛲᛸᛲ;->ᛷᛵᛵᲈ()Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-nez p2, :cond_3

    .line 90
    .line 91
    const/4 p2, 0x0

    .line 92
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, Ljava/security/cert/X509Certificate;

    .line 97
    .line 98
    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 99
    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string v2, "\n            |Hostname "

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget-object v0, v0, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 111
    .line 112
    iget-object v0, v0, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v0, " not verified:\n            |    certificate: "

    .line 118
    .line 119
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    sget-object v0, Lxhss/ᛲᛷᲀᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛷᲀᲇ;

    .line 123
    .line 124
    invoke-static {p0}, Lxhss/ᛷᛸᲀᲀ;->ᲀᛷᲁᲀ(Ljava/security/cert/X509Certificate;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v0, "\n            |    DN: "

    .line 132
    .line 133
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v0, "\n            |    subjectAltNames: "

    .line 148
    .line 149
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const/4 v0, 0x7

    .line 153
    invoke-static {p0, v0}, Lxhss/ᲈᛷᛴ;->ᛷᛵᛵᲈ(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    const/4 v2, 0x2

    .line 158
    invoke-static {p0, v2}, Lxhss/ᲈᛷᛴ;->ᛷᛵᛵᲈ(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-static {v0, p0}, Lxhss/ᛷᲇᛵᛳ;->ᛱᛱᛴᲀ(Ljava/util/List;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string p0, "\n            "

    .line 170
    .line 171
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-static {p0}, Lxhss/ᛳᛴᛶ;->ᛵᛲᲁᛶ(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-direct {p2, p0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw p2

    .line 186
    :cond_3
    new-instance p0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 187
    .line 188
    new-instance p2, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    const-string v1, "Hostname "

    .line 194
    .line 195
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    iget-object v0, v0, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 199
    .line 200
    iget-object v0, v0, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    const-string v0, " not verified (no certificates)"

    .line 206
    .line 207
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    invoke-direct {p0, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p0

    .line 218
    :cond_4
    iget-object v1, v0, Lxhss/ᛵᲈᛱᛳ;->ᛷᛴᛷᛱ:Lxhss/ᛲᛷᲀᲇ;

    .line 219
    .line 220
    new-instance v4, Lxhss/ᛵᛲᛸᛲ;

    .line 221
    .line 222
    iget-object v5, v3, Lxhss/ᛵᛲᛸᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛶᲈᛴ;

    .line 223
    .line 224
    iget-object v6, v3, Lxhss/ᛵᛲᛸᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛳᲁᲇᲀ;

    .line 225
    .line 226
    iget-object v7, v3, Lxhss/ᛵᛲᛸᛲ;->ᛳᲁᲇᛸ:Ljava/util/List;

    .line 227
    .line 228
    new-instance v8, Lxhss/ᛴᛵᲇᛵ;

    .line 229
    .line 230
    invoke-direct {v8, v1, v3, v0}, Lxhss/ᛴᛵᲇᛵ;-><init>(Lxhss/ᛲᛷᲀᲇ;Lxhss/ᛵᛲᛸᛲ;Lxhss/ᛵᲈᛱᛳ;)V

    .line 231
    .line 232
    .line 233
    invoke-direct {v4, v5, v6, v7, v8}, Lxhss/ᛵᛲᛸᛲ;-><init>(Lxhss/ᛶᲈᛴ;Lxhss/ᛳᲁᲇᲀ;Ljava/util/List;Lxhss/ᛱᛳᲇᛶ;)V

    .line 234
    .line 235
    .line 236
    iput-object v4, p0, Lxhss/ᛳᛵᲈ;->ᛸᛲᛷᛱ:Lxhss/ᛵᛲᛸᛲ;

    .line 237
    .line 238
    iget-object v0, v1, Lxhss/ᛲᛷᲀᲇ;->ᛷᛵᛵᲈ:Ljava/util/Set;

    .line 239
    .line 240
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    if-nez v1, :cond_9

    .line 249
    .line 250
    iget-boolean p2, p2, Lxhss/ᛶᛴᛴᛳ;->ᛱᛱᛲᲇ:Z

    .line 251
    .line 252
    if-eqz p2, :cond_7

    .line 253
    .line 254
    sget-object p2, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 255
    .line 256
    sget-object p2, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 257
    .line 258
    iget-object p2, p2, Lxhss/ᛵᛳᛸᲇ;->ᛳᲁᲇᛸ:Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-eqz v0, :cond_6

    .line 269
    .line 270
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    move-object v1, v0

    .line 275
    check-cast v1, Lxhss/ᲈᲀᛳᲇ;

    .line 276
    .line 277
    invoke-interface {v1, p1}, Lxhss/ᲈᲀᛳᲇ;->ᛷᛵᛵᲈ(Ljavax/net/ssl/SSLSocket;)Z

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    if-eqz v1, :cond_5

    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_6
    move-object v0, v2

    .line 285
    :goto_2
    check-cast v0, Lxhss/ᲈᲀᛳᲇ;

    .line 286
    .line 287
    if-eqz v0, :cond_7

    .line 288
    .line 289
    invoke-interface {v0, p1}, Lxhss/ᲈᲀᛳᲇ;->ᛱᛱᛲᲇ(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    :cond_7
    iput-object p1, p0, Lxhss/ᛳᛵᲈ;->ᛸᛶᛴᲈ:Ljava/net/Socket;

    .line 294
    .line 295
    new-instance p2, Lxhss/ᲇᛸᛶ;

    .line 296
    .line 297
    invoke-direct {p2, p1}, Lxhss/ᲇᛸᛶ;-><init>(Ljava/net/Socket;)V

    .line 298
    .line 299
    .line 300
    new-instance v0, Lxhss/ᛷᛱᛳᲁ;

    .line 301
    .line 302
    invoke-direct {v0, p2}, Lxhss/ᛷᛱᛳᲁ;-><init>(Lxhss/ᲇᛸᛶ;)V

    .line 303
    .line 304
    .line 305
    iput-object v0, p0, Lxhss/ᛳᛵᲈ;->ᛳᛶᛷᲀ:Lxhss/ᛷᛱᛳᲁ;

    .line 306
    .line 307
    if-eqz v2, :cond_8

    .line 308
    .line 309
    invoke-static {v2}, Lxhss/ᲁᛵᛸᛳ;->ᲇᛴᲇᛵ(Ljava/lang/String;)Lxhss/ᲈᛲᛵᛴ;

    .line 310
    .line 311
    .line 312
    move-result-object p2

    .line 313
    goto :goto_3

    .line 314
    :cond_8
    sget-object p2, Lxhss/ᲈᛲᛵᛴ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛲᛵᛴ;

    .line 315
    .line 316
    :goto_3
    iput-object p2, p0, Lxhss/ᛳᛵᲈ;->ᛴᲈᛱᛴ:Lxhss/ᲈᛲᛵᛴ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 317
    .line 318
    sget-object p0, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 319
    .line 320
    sget-object p0, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 321
    .line 322
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    :cond_9
    :try_start_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    invoke-static {p0}, Lxhss/ᛴᛸᛲᛳ;->ᲁᛲᛴᛴ(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 334
    :goto_4
    sget-object p2, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 335
    .line 336
    sget-object p2, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 337
    .line 338
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-static {p1}, Lxhss/ᛶᛴᲀᛲ;->ᛳᲁᲇᛸ(Ljava/net/Socket;)V

    .line 342
    .line 343
    .line 344
    throw p0
.end method

.method public final ᲀᲇᛳᲁ()Lxhss/ᛲᛷᛷᛵ;
    .locals 5

    .line 1
    iget-object v0, p0, Lxhss/ᛳᛵᲈ;->ᛶᲇᲈᛸ:Ljava/net/Socket;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 7
    .line 8
    iget-object v0, v0, Lxhss/ᛸᲇᲇᛶ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :try_start_0
    iget-object v2, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 15
    .line 16
    iget-object v2, v2, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 17
    .line 18
    iget-object v3, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 19
    .line 20
    iget-object v3, v3, Lxhss/ᛱᛷᲁᛶ;->ᛳᲁᲇᛸ:Ljava/net/InetSocketAddress;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lxhss/ᛳᛵᲈ;->ᛸᛲᲀᛵ()V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    new-instance v2, Lxhss/ᛲᛷᛷᛵ;

    .line 30
    .line 31
    const/4 v3, 0x6

    .line 32
    invoke-direct {v2, p0, v1, v3}, Lxhss/ᛲᛷᛷᛵ;-><init>(Lxhss/ᛱᛸᲁᛶ;Ljava/lang/Throwable;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 36
    .line 37
    iget-object v0, v0, Lxhss/ᛸᲇᲇᛶ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    return-object v2

    .line 43
    :catchall_0
    move-exception v1

    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception v1

    .line 46
    :try_start_1
    iget-object v2, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 47
    .line 48
    iget-object v3, v2, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 49
    .line 50
    iget-object v2, v2, Lxhss/ᛱᛷᲁᛶ;->ᛱᛱᛲᲇ:Ljava/net/Proxy;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 57
    .line 58
    if-eq v2, v3, :cond_0

    .line 59
    .line 60
    iget-object v2, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 61
    .line 62
    iget-object v2, v2, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 63
    .line 64
    iget-object v3, v2, Lxhss/ᛵᲈᛱᛳ;->ᲀᲇᛳᲁ:Ljava/net/ProxySelector;

    .line 65
    .line 66
    iget-object v2, v2, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 67
    .line 68
    invoke-virtual {v2}, Lxhss/ᛷᛶᲁᛵ;->ᛸᛴᛶᛳ()Ljava/net/URI;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget-object v4, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 73
    .line 74
    iget-object v4, v4, Lxhss/ᛱᛷᲁᛶ;->ᛱᛱᛲᲇ:Ljava/net/Proxy;

    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v3, v2, v4, v1}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 81
    .line 82
    .line 83
    :cond_0
    iget-object v2, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 84
    .line 85
    iget-object v2, v2, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 86
    .line 87
    iget-object v3, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 88
    .line 89
    iget-object v3, v3, Lxhss/ᛱᛷᲁᛶ;->ᛳᲁᲇᛸ:Ljava/net/InetSocketAddress;

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    new-instance v2, Lxhss/ᛲᛷᛷᛵ;

    .line 95
    .line 96
    const/4 v3, 0x2

    .line 97
    invoke-direct {v2, p0, v1, v3}, Lxhss/ᛲᛷᛷᛵ;-><init>(Lxhss/ᛱᛸᲁᛶ;Ljava/lang/Throwable;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 101
    .line 102
    iget-object v1, v1, Lxhss/ᛸᲇᲇᛶ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 103
    .line 104
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    if-nez v0, :cond_1

    .line 108
    .line 109
    iget-object p0, p0, Lxhss/ᛳᛵᲈ;->ᛶᲇᲈᛸ:Ljava/net/Socket;

    .line 110
    .line 111
    if-eqz p0, :cond_1

    .line 112
    .line 113
    invoke-static {p0}, Lxhss/ᛶᛴᲀᛲ;->ᛳᲁᲇᛸ(Ljava/net/Socket;)V

    .line 114
    .line 115
    .line 116
    :cond_1
    return-object v2

    .line 117
    :goto_0
    iget-object v2, p0, Lxhss/ᛳᛵᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᲇᲇᛶ;

    .line 118
    .line 119
    iget-object v2, v2, Lxhss/ᛸᲇᲇᛶ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 120
    .line 121
    invoke-virtual {v2, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    if-nez v0, :cond_2

    .line 125
    .line 126
    iget-object p0, p0, Lxhss/ᛳᛵᲈ;->ᛶᲇᲈᛸ:Ljava/net/Socket;

    .line 127
    .line 128
    if-eqz p0, :cond_2

    .line 129
    .line 130
    invoke-static {p0}, Lxhss/ᛶᛴᲀᛲ;->ᛳᲁᲇᛸ(Ljava/net/Socket;)V

    .line 131
    .line 132
    .line 133
    :cond_2
    throw v1

    .line 134
    :cond_3
    const-string p0, "TCP already connected"

    .line 135
    .line 136
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-object v1
.end method

.method public final ᲇᛴᲇᛵ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᛵᲈ;->ᛴᲈᛱᛴ:Lxhss/ᲈᛲᛵᛴ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final ᲇᛶᛴᲀ(Lxhss/ᛸᲇᲇᛶ;Ljava/io/IOException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᲈᛳᲀ()Lxhss/ᛲᛷᛷᛵ;
    .locals 9

    .line 1
    iget-object v0, p0, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 2
    .line 3
    iget-object v1, v0, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 4
    .line 5
    iget-object v1, v1, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v3, "CONNECT "

    .line 10
    .line 11
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-static {v1, v3}, Lxhss/ᛶᛴᲀᛲ;->ᛸᛴᛶᛳ(Lxhss/ᛷᛶᲁᛵ;Z)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, " HTTP/1.1"

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v2, Lxhss/ᛳᲇᲁᲈ;

    .line 32
    .line 33
    iget-object v3, p0, Lxhss/ᛳᛵᲈ;->ᛳᛶᛷᲀ:Lxhss/ᛷᛱᛳᲁ;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    if-nez v3, :cond_0

    .line 37
    .line 38
    move-object v3, v4

    .line 39
    :cond_0
    invoke-direct {v2, v4, p0, v3}, Lxhss/ᛳᲇᲁᲈ;-><init>(Lxhss/ᛵᛸᛷᛲ;Lxhss/ᲀᲀᲁᛱ;Lxhss/ᛷᛱᛳᲁ;)V

    .line 40
    .line 41
    .line 42
    iget-object v3, p0, Lxhss/ᛳᛵᲈ;->ᛳᛶᛷᲀ:Lxhss/ᛷᛱᛳᲁ;

    .line 43
    .line 44
    if-nez v3, :cond_1

    .line 45
    .line 46
    move-object v3, v4

    .line 47
    :cond_1
    iget-object v3, v3, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Lxhss/ᲁᛸᛵᛳ;

    .line 50
    .line 51
    iget-object v3, v3, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 52
    .line 53
    invoke-interface {v3}, Lxhss/ᲇᲁᲀᲇ;->ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget v5, p0, Lxhss/ᛳᛵᲈ;->ᛳᲁᲇᛸ:I

    .line 58
    .line 59
    int-to-long v5, v5

    .line 60
    invoke-virtual {v3, v5, v6}, Lxhss/ᛲᲁᲈᛲ;->ᲀᲇᛳᲁ(J)Lxhss/ᛲᲁᲈᛲ;

    .line 61
    .line 62
    .line 63
    iget-object v3, p0, Lxhss/ᛳᛵᲈ;->ᛳᛶᛷᲀ:Lxhss/ᛷᛱᛳᲁ;

    .line 64
    .line 65
    if-nez v3, :cond_2

    .line 66
    .line 67
    move-object v3, v4

    .line 68
    :cond_2
    iget-object v3, v3, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v3, Lxhss/ᛱᛸᛵᛱ;

    .line 71
    .line 72
    iget-object v3, v3, Lxhss/ᛱᛸᛵᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛱᲁᛷᲁ;

    .line 73
    .line 74
    invoke-interface {v3}, Lxhss/ᛱᲁᛷᲁ;->ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iget v5, p0, Lxhss/ᛳᛵᲈ;->ᲇᛴᲇᛵ:I

    .line 79
    .line 80
    int-to-long v5, v5

    .line 81
    invoke-virtual {v3, v5, v6}, Lxhss/ᛲᲁᲈᛲ;->ᲀᲇᛳᲁ(J)Lxhss/ᛲᲁᲈᛲ;

    .line 82
    .line 83
    .line 84
    iget-object v3, p0, Lxhss/ᛳᛵᲈ;->ᛷᲁᲁ:Lxhss/ᛴᛴᛴᛵ;

    .line 85
    .line 86
    iget-object v5, v3, Lxhss/ᛴᛴᛴᛵ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v5, Lxhss/ᲁᛸᛱᛵ;

    .line 89
    .line 90
    invoke-virtual {v2, v5, v1}, Lxhss/ᛳᲇᲁᲈ;->ᛸᛷᲈᲈ(Lxhss/ᲁᛸᛱᛵ;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Lxhss/ᛳᲇᲁᲈ;->ᛷᛵᛵᲈ()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Lxhss/ᛳᲇᲁᲈ;->ᛸᛴᛶᛳ()Lxhss/ᛳᛵᛴ;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iput-object v3, v1, Lxhss/ᛳᛵᛴ;->ᛷᛵᛵᲈ:Lxhss/ᛴᛴᛴᛵ;

    .line 101
    .line 102
    invoke-virtual {v1}, Lxhss/ᛳᛵᛴ;->ᛷᛵᛵᲈ()Lxhss/ᲀᛶᛷᲁ;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iget v3, v1, Lxhss/ᲀᛶᛷᲁ;->ᛷᛴᛷᛱ:I

    .line 107
    .line 108
    invoke-static {v1}, Lxhss/ᛶᛴᲀᛲ;->ᛷᛴᛷᛱ(Lxhss/ᲀᛶᛷᲁ;)J

    .line 109
    .line 110
    .line 111
    move-result-wide v5

    .line 112
    const-wide/16 v7, -0x1

    .line 113
    .line 114
    cmp-long v7, v5, v7

    .line 115
    .line 116
    if-nez v7, :cond_3

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    iget-object v1, v1, Lxhss/ᲀᛶᛷᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛴᛴᛵ;

    .line 120
    .line 121
    iget-object v1, v1, Lxhss/ᛴᛴᛴᛵ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, Lxhss/ᛷᛶᲁᛵ;

    .line 124
    .line 125
    invoke-virtual {v2, v1, v5, v6}, Lxhss/ᛳᲇᲁᲈ;->ᛸᛲᲀᛵ(Lxhss/ᛷᛶᲁᛵ;J)Lxhss/ᛱᛸᛵᲈ;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    const v2, 0x7fffffff

    .line 130
    .line 131
    .line 132
    invoke-static {v1, v2}, Lxhss/ᛶᛴᲀᛲ;->ᲇᛶᛴᲀ(Lxhss/ᲇᲁᲀᲇ;I)Z

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Lxhss/ᛱᛸᛵᲈ;->close()V

    .line 136
    .line 137
    .line 138
    :goto_0
    const/16 v1, 0xc8

    .line 139
    .line 140
    if-eq v3, v1, :cond_5

    .line 141
    .line 142
    const/16 p0, 0x197

    .line 143
    .line 144
    if-ne v3, p0, :cond_4

    .line 145
    .line 146
    iget-object p0, v0, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 147
    .line 148
    iget-object p0, p0, Lxhss/ᛵᲈᛱᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛴᲀᲁ;

    .line 149
    .line 150
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    const-string p0, "Failed to authenticate with proxy"

    .line 154
    .line 155
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-object v4

    .line 159
    :cond_4
    const-string p0, "Unexpected response code for CONNECT: "

    .line 160
    .line 161
    invoke-static {p0, v3}, Lxhss/ᛴᛸᛲᛳ;->ᛶᲇᲈᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    return-object v4

    .line 169
    :cond_5
    new-instance v0, Lxhss/ᛲᛷᛷᛵ;

    .line 170
    .line 171
    const/4 v1, 0x6

    .line 172
    invoke-direct {v0, p0, v4, v1}, Lxhss/ᛲᛷᛷᛵ;-><init>(Lxhss/ᛱᛸᲁᛶ;Ljava/lang/Throwable;I)V

    .line 173
    .line 174
    .line 175
    return-object v0
.end method
