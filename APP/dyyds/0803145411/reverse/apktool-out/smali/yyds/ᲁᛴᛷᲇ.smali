.class public final Lyyds/ᲁᛴᛷᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲀᲇᲇᛵ;


# static fields
.field public static final ᛱᲈᲁ:Ljava/util/List;

.field public static final ᛶᛷᛲᲁ:Ljava/util/List;


# instance fields
.field public final ᛲᛴᛳᛲ:Lyyds/ᛴᲀᲁᛲ;

.field public final ᛲᲈᲁ:Lyyds/ᲈᛸᲀᛸ;

.field public final ᛵᛸᛸᛷ:Lyyds/ᲇᲁᲁᲈ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛴᲀᛷᛷ;

.field public volatile ᲇᲇᲇᛱ:Z

.field public volatile ᲇᲈᛵᛷ:Lyyds/ᲇᲀᲁᛵ;


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
    invoke-static {v0}, Lyyds/ᛴᛲᛲᲇ;->ᛷᛲᲈᛱ([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lyyds/ᲁᛴᛷᲇ;->ᛶᛷᛲᲁ:Ljava/util/List;

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
    invoke-static {v0}, Lyyds/ᛴᛲᛲᲇ;->ᛷᛲᲈᛱ([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lyyds/ᲁᛴᛷᲇ;->ᛱᲈᲁ:Ljava/util/List;

    .line 60
    .line 61
    return-void
.end method

.method public constructor <init>(Lyyds/ᛶᛲᛷ;Lyyds/ᲈᛸᲀᛸ;Lyyds/ᲇᲁᲁᲈ;Lyyds/ᛴᲀᛷᛷ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lyyds/ᲁᛴᛷᲇ;->ᛲᲈᲁ:Lyyds/ᲈᛸᲀᛸ;

    .line 5
    .line 6
    iput-object p3, p0, Lyyds/ᲁᛴᛷᲇ;->ᛵᛸᛸᛷ:Lyyds/ᲇᲁᲁᲈ;

    .line 7
    .line 8
    iput-object p4, p0, Lyyds/ᲁᛴᛷᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲀᛷᛷ;

    .line 9
    .line 10
    iget-object p1, p1, Lyyds/ᛶᛲᛷ;->ᛵᛶᛲᲀ:Ljava/util/List;

    .line 11
    .line 12
    sget-object p2, Lyyds/ᛴᲀᲁᛲ;->ᛱᲈᲁ:Lyyds/ᛴᲀᲁᛲ;

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
    sget-object p2, Lyyds/ᛴᲀᲁᛲ;->ᛶᛷᛲᲁ:Lyyds/ᛴᲀᲁᛲ;

    .line 22
    .line 23
    :goto_0
    iput-object p2, p0, Lyyds/ᲁᛴᛷᲇ;->ᛲᛴᛳᛲ:Lyyds/ᛴᲀᲁᛲ;

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
    iput-boolean v0, p0, Lyyds/ᲁᛴᛷᲇ;->ᲇᲇᲇᛱ:Z

    .line 3
    .line 4
    iget-object p0, p0, Lyyds/ᲁᛴᛷᲇ;->ᲇᲈᛵᛷ:Lyyds/ᲇᲀᲁᛵ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/16 v0, 0x9

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lyyds/ᲇᲀᲁᛵ;->ᲇᲇᲇᛱ(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final ᛱᲈᲁ(Lyyds/ᛴᛴᛷᲁ;)J
    .locals 0

    .line 1
    invoke-static {p1}, Lyyds/ᲁᛲᲈᲁ;->ᛲᲈᲁ(Lyyds/ᛴᛴᛷᲁ;)Z

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
    invoke-static {p1}, Lyyds/ᛴᛲᛲᲇ;->ᛲᛴᛳᛲ(Lyyds/ᛴᛴᛷᲁ;)J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0
.end method

.method public final ᛲᛳᛶᲁ(Lyyds/ᛴᛴᛷᲁ;)Lyyds/ᛷᛷᛳᛷ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲁᛴᛷᲇ;->ᲇᲈᛵᛷ:Lyyds/ᲇᲀᲁᛵ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲇᲀᲁᛵ;->ᛷᲈᲈᲁ:Lyyds/ᛳᲇᛴᛱ;

    .line 4
    .line 5
    return-object p0
.end method

.method public final ᛲᛴᛳᛲ()Lyyds/ᲁᛸᛶᲁ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲁᛴᛷᲇ;->ᲇᲈᛵᛷ:Lyyds/ᲇᲀᲁᛵ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛲᲈᲁ(Lyyds/ᲀᲁᲁ;)V
    .locals 14

    .line 1
    iget-object v0, p0, Lyyds/ᲁᛴᛷᲇ;->ᲇᲈᛵᛷ:Lyyds/ᲇᲀᲁᛵ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p1, Lyyds/ᲀᲁᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛳᛸᲀᛵ;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move v0, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move v0, v1

    .line 15
    :goto_0
    iget-object v3, p1, Lyyds/ᲀᲁᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛸᛱᛴ;

    .line 16
    .line 17
    new-instance v4, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v3}, Lyyds/ᛷᛸᛱᛴ;->size()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    add-int/lit8 v5, v5, 0x4

    .line 24
    .line 25
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    new-instance v5, Lyyds/ᛸᛸᛸᛵ;

    .line 29
    .line 30
    sget-object v6, Lyyds/ᛸᛸᛸᛵ;->ᲇᲇᲇᛱ:Lyyds/ᲇᲁᲀᲁ;

    .line 31
    .line 32
    iget-object v7, p1, Lyyds/ᲀᲁᲁ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 33
    .line 34
    invoke-direct {v5, v6, v7}, Lyyds/ᛸᛸᛸᛵ;-><init>(Lyyds/ᲇᲁᲀᲁ;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    new-instance v5, Lyyds/ᛸᛸᛸᛵ;

    .line 41
    .line 42
    sget-object v6, Lyyds/ᛸᛸᛸᛵ;->ᛶᛷᛲᲁ:Lyyds/ᲇᲁᲀᲁ;

    .line 43
    .line 44
    iget-object p1, p1, Lyyds/ᲀᲁᲁ;->ᛲᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 45
    .line 46
    invoke-virtual {p1}, Lyyds/ᛱᛲᲀᛶ;->ᛵᛸᛸᛷ()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-virtual {p1}, Lyyds/ᛱᛲᲀᛶ;->ᲇᲈᛵᛷ()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    if-eqz v8, :cond_2

    .line 55
    .line 56
    new-instance v9, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/16 v7, 0x3f

    .line 62
    .line 63
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    :cond_2
    invoke-direct {v5, v6, v7}, Lyyds/ᛸᛸᛸᛵ;-><init>(Lyyds/ᲇᲁᲀᲁ;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    const-string v5, "Host"

    .line 80
    .line 81
    invoke-virtual {v3, v5}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    if-eqz v5, :cond_3

    .line 86
    .line 87
    new-instance v6, Lyyds/ᛸᛸᛸᛵ;

    .line 88
    .line 89
    sget-object v7, Lyyds/ᛸᛸᛸᛵ;->ᛲᛳᛶᲁ:Lyyds/ᲇᲁᲀᲁ;

    .line 90
    .line 91
    invoke-direct {v6, v7, v5}, Lyyds/ᛸᛸᛸᛵ;-><init>(Lyyds/ᲇᲁᲀᲁ;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :cond_3
    new-instance v5, Lyyds/ᛸᛸᛸᛵ;

    .line 98
    .line 99
    sget-object v6, Lyyds/ᛸᛸᛸᛵ;->ᛱᲈᲁ:Lyyds/ᲇᲁᲀᲁ;

    .line 100
    .line 101
    iget-object p1, p1, Lyyds/ᛱᛲᲀᛶ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 102
    .line 103
    invoke-direct {v5, v6, p1}, Lyyds/ᛸᛸᛸᛵ;-><init>(Lyyds/ᲇᲁᲀᲁ;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3}, Lyyds/ᛷᛸᛱᛴ;->size()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    move v5, v1

    .line 114
    :goto_1
    if-ge v5, p1, :cond_6

    .line 115
    .line 116
    invoke-static {v3, v5}, Lyyds/ᛴᛲᛴᛲ;->ᲀᛲᛳᲀ(Lyyds/ᛷᛸᛱᛴ;I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 121
    .line 122
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    sget-object v7, Lyyds/ᲁᛴᛷᲇ;->ᛶᛷᛲᲁ:Ljava/util/List;

    .line 127
    .line 128
    invoke-interface {v7, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    if-eqz v7, :cond_4

    .line 133
    .line 134
    const-string v7, "te"

    .line 135
    .line 136
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    if-eqz v7, :cond_5

    .line 141
    .line 142
    invoke-static {v3, v5}, Lyyds/ᛴᛲᛴᛲ;->ᛲᛴᛳᛲ(Lyyds/ᛷᛸᛱᛴ;I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    const-string v8, "trailers"

    .line 147
    .line 148
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    if-eqz v7, :cond_5

    .line 153
    .line 154
    :cond_4
    new-instance v7, Lyyds/ᛸᛸᛸᛵ;

    .line 155
    .line 156
    invoke-static {v3, v5}, Lyyds/ᛴᛲᛴᛲ;->ᛲᛴᛳᛲ(Lyyds/ᛷᛸᛱᛴ;I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    invoke-direct {v7, v6, v8}, Lyyds/ᛸᛸᛸᛵ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_6
    iget-object v8, p0, Lyyds/ᲁᛴᛷᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲀᛷᛷ;

    .line 170
    .line 171
    xor-int/lit8 v9, v0, 0x1

    .line 172
    .line 173
    iget-object p1, v8, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 174
    .line 175
    monitor-enter p1

    .line 176
    :try_start_0
    monitor-enter v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 177
    :try_start_1
    iget v3, v8, Lyyds/ᛴᲀᛷᛷ;->ᛶᛷᛲᲁ:I

    .line 178
    .line 179
    const v5, 0x3fffffff    # 1.9999999f

    .line 180
    .line 181
    .line 182
    if-le v3, v5, :cond_7

    .line 183
    .line 184
    const/16 v3, 0x8

    .line 185
    .line 186
    invoke-virtual {v8, v3}, Lyyds/ᛴᲀᛷᛷ;->ᛷᲈᲈᲁ(I)V

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :catchall_0
    move-exception v0

    .line 191
    move-object p0, v0

    .line 192
    goto/16 :goto_3

    .line 193
    .line 194
    :cond_7
    :goto_2
    iget-boolean v3, v8, Lyyds/ᛴᲀᛷᛷ;->ᛱᲈᲁ:Z

    .line 195
    .line 196
    if-nez v3, :cond_d

    .line 197
    .line 198
    iget v7, v8, Lyyds/ᛴᲀᛷᛷ;->ᛶᛷᛲᲁ:I

    .line 199
    .line 200
    add-int/lit8 v3, v7, 0x2

    .line 201
    .line 202
    iput v3, v8, Lyyds/ᛴᲀᛷᛷ;->ᛶᛷᛲᲁ:I

    .line 203
    .line 204
    new-instance v6, Lyyds/ᲇᲀᲁᛵ;

    .line 205
    .line 206
    const/4 v11, 0x0

    .line 207
    const/4 v10, 0x0

    .line 208
    invoke-direct/range {v6 .. v11}, Lyyds/ᲇᲀᲁᛵ;-><init>(ILyyds/ᛴᲀᛷᛷ;ZZLyyds/ᛷᛸᛱᛴ;)V

    .line 209
    .line 210
    .line 211
    if-eqz v0, :cond_8

    .line 212
    .line 213
    iget-wide v10, v8, Lyyds/ᛴᲀᛷᛷ;->ᛶᛸᲀᲁ:J

    .line 214
    .line 215
    iget-wide v12, v8, Lyyds/ᛴᲀᛷᛷ;->ᛵᲀᲈᛴ:J

    .line 216
    .line 217
    cmp-long v0, v10, v12

    .line 218
    .line 219
    if-gez v0, :cond_8

    .line 220
    .line 221
    iget-wide v10, v6, Lyyds/ᲇᲀᲁᛵ;->ᲇᲇᲇᛱ:J

    .line 222
    .line 223
    iget-wide v12, v6, Lyyds/ᲇᲀᲁᛵ;->ᛶᛷᛲᲁ:J

    .line 224
    .line 225
    cmp-long v0, v10, v12

    .line 226
    .line 227
    if-ltz v0, :cond_9

    .line 228
    .line 229
    :cond_8
    move v1, v2

    .line 230
    :cond_9
    invoke-virtual {v6}, Lyyds/ᲇᲀᲁᛵ;->ᛲᛳᛶᲁ()Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_a

    .line 235
    .line 236
    iget-object v0, v8, Lyyds/ᛴᲀᛷᛷ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 237
    .line 238
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-interface {v0, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 243
    .line 244
    .line 245
    :cond_a
    :try_start_2
    monitor-exit v8

    .line 246
    iget-object v0, v8, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 247
    .line 248
    invoke-virtual {v0, v9, v7, v4}, Lyyds/ᛲᛱᛷᲀ;->ᛳᲁᲁᲇ(ZILjava/util/ArrayList;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 249
    .line 250
    .line 251
    monitor-exit p1

    .line 252
    if-eqz v1, :cond_b

    .line 253
    .line 254
    iget-object p1, v8, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 255
    .line 256
    invoke-virtual {p1}, Lyyds/ᛲᛱᛷᲀ;->flush()V

    .line 257
    .line 258
    .line 259
    :cond_b
    iput-object v6, p0, Lyyds/ᲁᛴᛷᲇ;->ᲇᲈᛵᛷ:Lyyds/ᲇᲀᲁᛵ;

    .line 260
    .line 261
    iget-boolean p1, p0, Lyyds/ᲁᛴᛷᲇ;->ᲇᲇᲇᛱ:Z

    .line 262
    .line 263
    iget-object v0, p0, Lyyds/ᲁᛴᛷᲇ;->ᲇᲈᛵᛷ:Lyyds/ᲇᲀᲁᛵ;

    .line 264
    .line 265
    if-nez p1, :cond_c

    .line 266
    .line 267
    iget-object p1, v0, Lyyds/ᲇᲀᲁᛵ;->ᛷᛵᲇᲀ:Lyyds/ᛷᲁᛸᛲ;

    .line 268
    .line 269
    iget-object v0, p0, Lyyds/ᲁᛴᛷᲇ;->ᛵᛸᛸᛷ:Lyyds/ᲇᲁᲁᲈ;

    .line 270
    .line 271
    iget v0, v0, Lyyds/ᲇᲁᲁᲈ;->ᛶᛷᛲᲁ:I

    .line 272
    .line 273
    int-to-long v0, v0

    .line 274
    invoke-virtual {p1, v0, v1}, Lyyds/ᲈᲁᛴᛲ;->ᛶᛷᛲᲁ(J)Lyyds/ᲈᲁᛴᛲ;

    .line 275
    .line 276
    .line 277
    iget-object p1, p0, Lyyds/ᲁᛴᛷᲇ;->ᲇᲈᛵᛷ:Lyyds/ᲇᲀᲁᛵ;

    .line 278
    .line 279
    iget-object p1, p1, Lyyds/ᲇᲀᲁᛵ;->ᛲᛲᲈᲈ:Lyyds/ᛷᲁᛸᛲ;

    .line 280
    .line 281
    iget-object p0, p0, Lyyds/ᲁᛴᛷᲇ;->ᛵᛸᛸᛷ:Lyyds/ᲇᲁᲁᲈ;

    .line 282
    .line 283
    iget p0, p0, Lyyds/ᲇᲁᲁᲈ;->ᛱᲈᲁ:I

    .line 284
    .line 285
    int-to-long v0, p0

    .line 286
    invoke-virtual {p1, v0, v1}, Lyyds/ᲈᲁᛴᛲ;->ᛶᛷᛲᲁ(J)Lyyds/ᲈᲁᛴᛲ;

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :cond_c
    const/16 p0, 0x9

    .line 291
    .line 292
    invoke-virtual {v0, p0}, Lyyds/ᲇᲀᲁᛵ;->ᲇᲇᲇᛱ(I)V

    .line 293
    .line 294
    .line 295
    const-string p0, "Canceled"

    .line 296
    .line 297
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    return-void

    .line 301
    :catchall_1
    move-exception v0

    .line 302
    move-object p0, v0

    .line 303
    goto :goto_4

    .line 304
    :cond_d
    :try_start_3
    new-instance p0, Lyyds/ᛷᛲᛷᲀ;

    .line 305
    .line 306
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 307
    .line 308
    .line 309
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 310
    :goto_3
    :try_start_4
    monitor-exit v8

    .line 311
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 312
    :goto_4
    monitor-exit p1

    .line 313
    throw p0
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲁᛴᛷᲇ;->ᲇᲈᛵᛷ:Lyyds/ᲇᲀᲁᛵ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲇᲀᲁᛵ;->ᛷᛲᲈᛱ:Lyyds/ᛸᲀᛲᛸ;

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛸᲀᛲᛸ;->close()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ᛶᛷᛲᲁ(Lyyds/ᲀᲁᲁ;J)Lyyds/ᲀᛳᲇᲁ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲁᛴᛷᲇ;->ᲇᲈᛵᛷ:Lyyds/ᲇᲀᲁᛵ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲇᲀᲁᛵ;->ᛷᛲᲈᛱ:Lyyds/ᛸᲀᛲᛸ;

    .line 4
    .line 5
    return-object p0
.end method

.method public final ᛷᲈᲈᲁ(Z)Lyyds/ᲁᛸᛶᛲ;
    .locals 10

    .line 1
    iget-object v0, p0, Lyyds/ᲁᛴᛷᲇ;->ᲇᲈᛵᛷ:Lyyds/ᲇᲀᲁᛵ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_f

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :cond_0
    :goto_0
    :try_start_0
    iget-object v2, v0, Lyyds/ᲇᲀᲁᛵ;->ᛱᲈᲁ:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_7

    .line 15
    .line 16
    invoke-virtual {v0}, Lyyds/ᲇᲀᲁᛵ;->ᛶᛷᛲᲁ()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_7

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    if-nez p1, :cond_3

    .line 24
    .line 25
    iget-object v4, v0, Lyyds/ᲇᲀᲁᛵ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v4, v0, Lyyds/ᲇᲀᲁᛵ;->ᛷᛲᲈᛱ:Lyyds/ᛸᲀᛲᛸ;

    .line 31
    .line 32
    iget-boolean v5, v4, Lyyds/ᛸᲀᛲᛸ;->ᛲᛴᛳᛲ:Z

    .line 33
    .line 34
    if-nez v5, :cond_2

    .line 35
    .line 36
    iget-boolean v4, v4, Lyyds/ᛸᲀᛲᛸ;->ᲀᛲᛳᲀ:Z

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v4, v3

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    :goto_1
    move v4, v2

    .line 44
    :goto_2
    if-eqz v4, :cond_4

    .line 45
    .line 46
    :cond_3
    move v3, v2

    .line 47
    :cond_4
    if-eqz v3, :cond_5

    .line 48
    .line 49
    iget-object v2, v0, Lyyds/ᲇᲀᲁᛵ;->ᛷᛵᲇᲀ:Lyyds/ᛷᲁᛸᛲ;

    .line 50
    .line 51
    invoke-virtual {v2}, Lyyds/ᛲᛳᛶᲈ;->ᛱᲈᲁ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_3

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto/16 :goto_8

    .line 57
    .line 58
    :cond_5
    :goto_3
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    .line 60
    .line 61
    if-eqz v3, :cond_0

    .line 62
    .line 63
    :try_start_2
    iget-object v2, v0, Lyyds/ᲇᲀᲁᛵ;->ᛷᛵᲇᲀ:Lyyds/ᛷᲁᛸᛲ;

    .line 64
    .line 65
    invoke-virtual {v2}, Lyyds/ᛷᲁᛸᛲ;->ᛷᛲᲈᛱ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_1
    move-exception p0

    .line 70
    goto :goto_4

    .line 71
    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 76
    .line 77
    .line 78
    new-instance p0, Ljava/io/InterruptedIOException;

    .line 79
    .line 80
    invoke-direct {p0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 81
    .line 82
    .line 83
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 84
    :goto_4
    if-eqz v3, :cond_6

    .line 85
    .line 86
    :try_start_4
    iget-object p1, v0, Lyyds/ᲇᲀᲁᛵ;->ᛷᛵᲇᲀ:Lyyds/ᛷᲁᛸᛲ;

    .line 87
    .line 88
    invoke-virtual {p1}, Lyyds/ᛷᲁᛸᛲ;->ᛷᛲᲈᛱ()V

    .line 89
    .line 90
    .line 91
    :cond_6
    throw p0

    .line 92
    :cond_7
    iget-object v2, v0, Lyyds/ᲇᲀᲁᛵ;->ᛱᲈᲁ:Ljava/util/ArrayDeque;

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_d

    .line 99
    .line 100
    iget-object v2, v0, Lyyds/ᲇᲀᲁᛵ;->ᛱᲈᲁ:Ljava/util/ArrayDeque;

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Lyyds/ᛷᛸᛱᛴ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 107
    .line 108
    monitor-exit v0

    .line 109
    iget-object p0, p0, Lyyds/ᲁᛴᛷᲇ;->ᛲᛴᛳᛲ:Lyyds/ᛴᲀᲁᛲ;

    .line 110
    .line 111
    new-instance v0, Ljava/util/ArrayList;

    .line 112
    .line 113
    const/16 v4, 0x14

    .line 114
    .line 115
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Lyyds/ᛷᛸᛱᛴ;->size()I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    move-object v6, v1

    .line 123
    move v5, v3

    .line 124
    :goto_5
    if-ge v5, v4, :cond_a

    .line 125
    .line 126
    invoke-static {v2, v5}, Lyyds/ᛴᛲᛴᛲ;->ᲀᛲᛳᲀ(Lyyds/ᛷᛸᛱᛴ;I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    invoke-static {v2, v5}, Lyyds/ᛴᛲᛴᛲ;->ᛲᛴᛳᛲ(Lyyds/ᛷᛸᛱᛴ;I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    const-string v9, ":status"

    .line 135
    .line 136
    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    if-eqz v9, :cond_8

    .line 141
    .line 142
    const-string v6, "HTTP/1.1 "

    .line 143
    .line 144
    invoke-virtual {v6, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-static {v6}, Lyyds/ᛴᛸᛲ;->ᛷᲈᲈᲁ(Ljava/lang/String;)Lyyds/ᛷᛸᛱᲈ;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    goto :goto_6

    .line 153
    :cond_8
    sget-object v9, Lyyds/ᲁᛴᛷᲇ;->ᛱᲈᲁ:Ljava/util/List;

    .line 154
    .line 155
    invoke-interface {v9, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    if-nez v9, :cond_9

    .line 160
    .line 161
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    invoke-static {v8}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    :cond_9
    :goto_6
    add-int/lit8 v5, v5, 0x1

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_a
    if-eqz v6, :cond_c

    .line 179
    .line 180
    new-instance v2, Lyyds/ᲁᛸᛶᛲ;

    .line 181
    .line 182
    invoke-direct {v2}, Lyyds/ᲁᛸᛶᛲ;-><init>()V

    .line 183
    .line 184
    .line 185
    iput-object p0, v2, Lyyds/ᲁᛸᛶᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛴᲀᲁᛲ;

    .line 186
    .line 187
    iget p0, v6, Lyyds/ᛷᛸᛱᲈ;->ᛵᛸᛸᛷ:I

    .line 188
    .line 189
    iput p0, v2, Lyyds/ᲁᛸᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 190
    .line 191
    iget-object p0, v6, Lyyds/ᛷᛸᛱᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p0, Ljava/lang/String;

    .line 194
    .line 195
    iput-object p0, v2, Lyyds/ᲁᛸᛶᛲ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 196
    .line 197
    new-array p0, v3, [Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    check-cast p0, [Ljava/lang/String;

    .line 204
    .line 205
    new-instance v0, Lyyds/ᲀᲈᛷᛷ;

    .line 206
    .line 207
    const/4 v3, 0x2

    .line 208
    invoke-direct {v0, v3}, Lyyds/ᲀᲈᛷᛷ;-><init>(I)V

    .line 209
    .line 210
    .line 211
    iget-object v3, v0, Lyyds/ᲀᲈᛷᛷ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-static {v3, p0}, Lyyds/ᛶᲁᛶᲁ;->ᛵᲀᲈᛴ(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    iput-object v0, v2, Lyyds/ᲁᛸᛶᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛷᛷ;

    .line 217
    .line 218
    if-eqz p1, :cond_b

    .line 219
    .line 220
    iget p0, v2, Lyyds/ᲁᛸᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 221
    .line 222
    const/16 p1, 0x64

    .line 223
    .line 224
    if-ne p0, p1, :cond_b

    .line 225
    .line 226
    return-object v1

    .line 227
    :cond_b
    return-object v2

    .line 228
    :cond_c
    new-instance p0, Ljava/net/ProtocolException;

    .line 229
    .line 230
    const-string p1, "Expected \':status\' header not present"

    .line 231
    .line 232
    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw p0

    .line 236
    :cond_d
    :try_start_5
    iget-object p0, v0, Lyyds/ᲇᲀᲁᛵ;->ᛳᲁᲁᲇ:Ljava/io/IOException;

    .line 237
    .line 238
    if-eqz p0, :cond_e

    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_e
    new-instance p0, Lyyds/ᲈᛱᲈᲈ;

    .line 242
    .line 243
    invoke-virtual {v0}, Lyyds/ᲇᲀᲁᛵ;->ᛶᛷᛲᲁ()I

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    invoke-direct {p0, p1}, Lyyds/ᲈᛱᲈᲈ;-><init>(I)V

    .line 248
    .line 249
    .line 250
    :goto_7
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 251
    :goto_8
    monitor-exit v0

    .line 252
    throw p0

    .line 253
    :cond_f
    const-string p0, "stream wasn\'t created"

    .line 254
    .line 255
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    return-object v1
.end method

.method public final ᲀᛲᛳᲀ()Z
    .locals 4

    .line 1
    iget-object p0, p0, Lyyds/ᲁᛴᛷᲇ;->ᲇᲈᛵᛷ:Lyyds/ᲇᲀᲁᛵ;

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
    iget-object v1, p0, Lyyds/ᲇᲀᲁᛵ;->ᛷᲈᲈᲁ:Lyyds/ᛳᲇᛴᛱ;

    .line 8
    .line 9
    iget-boolean v2, v1, Lyyds/ᛳᲇᛴᛱ;->ᲇᲈᛵᛷ:Z

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-object v1, v1, Lyyds/ᛳᲇᛴᛱ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛲᲈᛲ;

    .line 15
    .line 16
    invoke-virtual {v1}, Lyyds/ᛷᛲᲈᛲ;->ᛲᲈᲁ()Z

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

.method public final ᲇᲇᲇᛱ()Lyyds/ᛷᛷᲈᛸ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲁᛴᛷᲇ;->ᛲᲈᲁ:Lyyds/ᲈᛸᲀᛸ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲁᛴᛷᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲀᛷᛷ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛴᲀᛷᛷ;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
