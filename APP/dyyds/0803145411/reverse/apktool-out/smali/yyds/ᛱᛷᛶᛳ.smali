.class public final Lyyds/ᛱᛷᛶᛳ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᛱᲈᲁ:Ljava/lang/String;

.field public final synthetic ᛲᛳᛶᲁ:Ljava/lang/String;

.field public final synthetic ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛱᛱ;

.field public final synthetic ᛷᲈᲈᲁ:J


# direct methods
.method public constructor <init>(Lyyds/ᛱᛵᛱᛱ;Ljava/lang/String;Ljava/lang/String;JLyyds/ᛲᛱᛶᛸ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛱᛷᛶᛳ;->ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛱᛷᛶᛳ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᛱᛷᛶᛳ;->ᛲᛳᛶᲁ:Ljava/lang/String;

    .line 6
    .line 7
    iput-wide p4, p0, Lyyds/ᛱᛷᛶᛳ;->ᛷᲈᲈᲁ:J

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᛱᛷᛶᛳ;->ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 10
    .line 11
    iget-object v1, v0, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lyyds/ᲁᛲᛲᛶ;

    .line 14
    .line 15
    iget-object v1, v1, Lyyds/ᲁᛲᛲᛶ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/16 v1, 0x2f

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lyyds/ᛱᛷᛶᛳ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lyyds/ᛱᛷᛶᛳ;->ᛲᛳᛶᲁ:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-static {p1, v1}, Lyyds/ᛱᛵᛱᛱ;->ᛵᛶᛲᲀ(Ljava/lang/String;Z)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    sget-object v2, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 48
    .line 49
    const-wide v3, -0x20f17e68a836eL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v2, v3}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lyyds/ᛱᛵᛱᛱ;->ᛳᛸᛴᛶ()Lyyds/ᛳᛱᲇ;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 73
    .line 74
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    const/4 v4, 0x2

    .line 79
    mul-int/2addr v3, v4

    .line 80
    new-array v3, v3, [Ljava/lang/String;

    .line 81
    .line 82
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_0

    .line 95
    .line 96
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    check-cast v5, Ljava/util/Map$Entry;

    .line 101
    .line 102
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    check-cast v6, Ljava/lang/String;

    .line 107
    .line 108
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    check-cast v5, Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v6}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-static {v5}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-static {v6}, Lyyds/ᛴᛲᛴᛲ;->ᛷᛲᲈᛱ(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v5, v6}, Lyyds/ᛴᛲᛴᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    aput-object v6, v3, v1

    .line 137
    .line 138
    add-int/lit8 v6, v1, 0x1

    .line 139
    .line 140
    aput-object v5, v3, v6

    .line 141
    .line 142
    add-int/2addr v1, v4

    .line 143
    goto :goto_0

    .line 144
    :cond_0
    new-instance v1, Lyyds/ᛷᲀᲇᲈ;

    .line 145
    .line 146
    invoke-direct {v1}, Lyyds/ᛷᲀᲇᲈ;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, p1}, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const-string p1, "GET"

    .line 153
    .line 154
    const/4 v2, 0x0

    .line 155
    invoke-virtual {v1, p1, v2}, Lyyds/ᛷᲀᲇᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;Lyyds/ᛳᛸᲀᛵ;)V

    .line 156
    .line 157
    .line 158
    new-instance p1, Lyyds/ᲀᲈᛷᛷ;

    .line 159
    .line 160
    invoke-direct {p1, v4}, Lyyds/ᲀᲈᛷᛷ;-><init>(I)V

    .line 161
    .line 162
    .line 163
    iget-object v2, p1, Lyyds/ᲀᲈᛷᛷ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-static {v2, v3}, Lyyds/ᛶᲁᛶᲁ;->ᛵᲀᲈᛴ(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    iput-object p1, v1, Lyyds/ᛷᲀᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 169
    .line 170
    new-instance p1, Lyyds/ᲀᲁᲁ;

    .line 171
    .line 172
    invoke-direct {p1, v1}, Lyyds/ᲀᲁᲁ;-><init>(Lyyds/ᛷᲀᲇᲈ;)V

    .line 173
    .line 174
    .line 175
    iget-object v0, v0, Lyyds/ᛳᛱᲇ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛷ;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    new-instance v1, Lyyds/ᲈᲀᛱᛷ;

    .line 181
    .line 182
    invoke-direct {v1, v0, p1}, Lyyds/ᲈᲀᛱᛷ;-><init>(Lyyds/ᛶᛲᛷ;Lyyds/ᲀᲁᲁ;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, Lyyds/ᲈᲀᛱᛷ;->ᲇᲈᛵᛷ()Lyyds/ᛴᛴᛷᲁ;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-static {p1}, Lyyds/ᛷᛸ;->ᛲᛲᲈᲈ(Lyyds/ᛴᛴᛷᲁ;)V

    .line 190
    .line 191
    .line 192
    iget-object p1, p1, Lyyds/ᛴᛴᛷᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛲᛶᲀ;

    .line 193
    .line 194
    invoke-virtual {p1}, Lyyds/ᛲᛶᲀ;->ᛲᲈᲁ()Ljava/io/InputStream;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    iget-wide v0, p0, Lyyds/ᛱᛷᛶᛳ;->ᛷᲈᲈᲁ:J

    .line 199
    .line 200
    :try_start_0
    new-instance p0, Ljava/io/InputStreamReader;

    .line 201
    .line 202
    new-instance v2, Lyyds/ᲈᛷᛷᛷ;

    .line 203
    .line 204
    invoke-direct {v2, p1, v0, v1}, Lyyds/ᲈᛷᛷᛷ;-><init>(Ljava/io/InputStream;J)V

    .line 205
    .line 206
    .line 207
    sget-object v0, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 208
    .line 209
    invoke-direct {p0, v2, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 210
    .line 211
    .line 212
    invoke-static {p0}, Lyyds/ᛳᛴᲁᲇ;->ᛷᲈᲈᲁ(Ljava/io/Reader;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 217
    .line 218
    .line 219
    return-object p0

    .line 220
    :catchall_0
    move-exception p0

    .line 221
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 222
    :catchall_1
    move-exception v0

    .line 223
    invoke-static {p1, p0}, Lyyds/ᛶᛶᲁᲇ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    throw v0
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 7

    .line 1
    new-instance v0, Lyyds/ᛱᛷᛶᛳ;

    .line 2
    .line 3
    iget-object v3, p0, Lyyds/ᛱᛷᛶᛳ;->ᛲᛳᛶᲁ:Ljava/lang/String;

    .line 4
    .line 5
    iget-wide v4, p0, Lyyds/ᛱᛷᛶᛳ;->ᛷᲈᲈᲁ:J

    .line 6
    .line 7
    iget-object v1, p0, Lyyds/ᛱᛷᛶᛳ;->ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 8
    .line 9
    iget-object v2, p0, Lyyds/ᛱᛷᛶᛳ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 10
    .line 11
    move-object v6, p2

    .line 12
    invoke-direct/range {v0 .. v6}, Lyyds/ᛱᛷᛶᛳ;-><init>(Lyyds/ᛱᛵᛱᛱ;Ljava/lang/String;Ljava/lang/String;JLyyds/ᛲᛱᛶᛸ;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lyyds/ᛴᲈᛳᲀ;

    .line 2
    .line 3
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lyyds/ᛱᛷᛶᛳ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lyyds/ᛱᛷᛶᛳ;

    .line 10
    .line 11
    sget-object p1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lyyds/ᛱᛷᛶᛳ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
