.class public final Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;
.super Ljava/util/zip/ZipEntry;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子世楪苏兰哲:J

.field public 飘花落叶言子世楪苏哲兰:Z

.field public 飘花落叶言子楪兰世哲苏:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;

.field public 飘花落叶言子楪兰世苏哲:[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

.field public 飘花落叶言子楪兰哲世苏:J

.field public 飘花落叶言子楪兰哲苏世:J

.field public 飘花落叶言子楪兰苏世哲:Ljava/lang/String;

.field public 飘花落叶言子楪兰苏哲世:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏哲世兰;

.field public 飘花落叶言子楪哲兰世苏:J

.field public 飘花落叶言子楪哲兰苏世:I

.field public 飘花落叶言子楪哲苏兰世:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Ljava/util/zip/ZipEntry;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰()[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v0, p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏哲世兰([Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    if-eqz p1, :cond_7

    .line 6
    .line 7
    const-class v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_1
    check-cast p1, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;

    .line 18
    .line 19
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_2
    invoke-virtual {p0}, Ljava/util/zip/ZipEntry;->getComment()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getComment()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, ""

    .line 44
    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    move-object v0, v2

    .line 48
    :cond_3
    if-nez v1, :cond_4

    .line 49
    .line 50
    move-object v1, v2

    .line 51
    :cond_4
    invoke-virtual {p0}, Ljava/util/zip/ZipEntry;->getLastModifiedTime()Ljava/nio/file/attribute/FileTime;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getLastModifiedTime()Ljava/nio/file/attribute/FileTime;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_7

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/util/zip/ZipEntry;->getLastAccessTime()Ljava/nio/file/attribute/FileTime;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getLastAccessTime()Ljava/nio/file/attribute/FileTime;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_7

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/util/zip/ZipEntry;->getCreationTime()Ljava/nio/file/attribute/FileTime;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getCreationTime()Ljava/nio/file/attribute/FileTime;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_7

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_7

    .line 98
    .line 99
    iget v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰苏世:I

    .line 100
    .line 101
    iget v1, p1, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰苏世:I

    .line 102
    .line 103
    if-ne v0, v1, :cond_7

    .line 104
    .line 105
    iget v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 106
    .line 107
    iget v1, p1, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 108
    .line 109
    if-ne v0, v1, :cond_7

    .line 110
    .line 111
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰世苏:J

    .line 112
    .line 113
    iget-wide v2, p1, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰世苏:J

    .line 114
    .line 115
    cmp-long v0, v0, v2

    .line 116
    .line 117
    if-nez v0, :cond_7

    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/util/zip/ZipEntry;->getCrc()J

    .line 120
    .line 121
    .line 122
    move-result-wide v0

    .line 123
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getCrc()J

    .line 124
    .line 125
    .line 126
    move-result-wide v2

    .line 127
    cmp-long v0, v0, v2

    .line 128
    .line 129
    if-nez v0, :cond_7

    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/util/zip/ZipEntry;->getCompressedSize()J

    .line 132
    .line 133
    .line 134
    move-result-wide v0

    .line 135
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getCompressedSize()J

    .line 136
    .line 137
    .line 138
    move-result-wide v2

    .line 139
    cmp-long v0, v0, v2

    .line 140
    .line 141
    if-nez v0, :cond_7

    .line 142
    .line 143
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲()[B

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {p1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲()[B

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_7

    .line 156
    .line 157
    invoke-virtual {p0}, Ljava/util/zip/ZipEntry;->getExtra()[B

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sget-object v1, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 162
    .line 163
    if-eqz v0, :cond_5

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_5
    move-object v0, v1

    .line 167
    :goto_0
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getExtra()[B

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    if-eqz v2, :cond_6

    .line 172
    .line 173
    move-object v1, v2

    .line 174
    :cond_6
    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_7

    .line 179
    .line 180
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰哲世苏:J

    .line 181
    .line 182
    iget-wide v2, p1, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰哲世苏:J

    .line 183
    .line 184
    cmp-long v0, v0, v2

    .line 185
    .line 186
    if-nez v0, :cond_7

    .line 187
    .line 188
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰哲苏世:J

    .line 189
    .line 190
    iget-wide v2, p1, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰哲苏世:J

    .line 191
    .line 192
    cmp-long v0, v0, v2

    .line 193
    .line 194
    if-nez v0, :cond_7

    .line 195
    .line 196
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰苏哲世:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏哲世兰;

    .line 197
    .line 198
    iget-object p1, p1, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰苏哲世:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏哲世兰;

    .line 199
    .line 200
    invoke-virtual {p0, p1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏哲世兰;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    if-eqz p0, :cond_7

    .line 205
    .line 206
    :goto_1
    const/4 p0, 0x1

    .line 207
    return p0

    .line 208
    :cond_7
    :goto_2
    const/4 p0, 0x0

    .line 209
    return p0
.end method

.method public final getMethod()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    return p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    return-object v0
.end method

.method public final getSize()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰世苏:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getTime()J
    .locals 4

    .line 1
    iget-boolean v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪苏哲兰:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/zip/ZipEntry;->getLastModifiedTime()Ljava/nio/file/attribute/FileTime;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/nio/file/attribute/FileTime;->toMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0

    .line 14
    :cond_0
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪苏兰哲:J

    .line 15
    .line 16
    const-wide/16 v2, -0x1

    .line 17
    .line 18
    cmp-long v2, v0, v2

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    return-wide v0

    .line 23
    :cond_1
    invoke-super {p0}, Ljava/util/zip/ZipEntry;->getTime()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    return-wide v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final isDirectory()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "/"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final setCreationTime(Ljava/nio/file/attribute/FileTime;)Ljava/util/zip/ZipEntry;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/util/zip/ZipEntry;->setCreationTime(Ljava/nio/file/attribute/FileTime;)Ljava/util/zip/ZipEntry;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰哲世()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public final setExtra([B)V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;->BEST_EFFORT:Lorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲([BLorg/apache/commons/compress/archivers/zip/ZipArchiveEntry$ExtraFieldParsingMode;)[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰哲苏([Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;)V
    :try_end_0
    .catch Ljava/util/zip/ZipException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, " - "

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "Error parsing extra fields for entry: "

    .line 23
    .line 24
    invoke-static {v2, p0, v0, v1, p1}, Lcom/esotericsoftware/kryo/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final setLastAccessTime(Ljava/nio/file/attribute/FileTime;)Ljava/util/zip/ZipEntry;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/util/zip/ZipEntry;->setLastAccessTime(Ljava/nio/file/attribute/FileTime;)Ljava/util/zip/ZipEntry;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰哲世()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public final setLastModifiedTime(Ljava/nio/file/attribute/FileTime;)Ljava/util/zip/ZipEntry;
    .locals 2

    .line 1
    invoke-super {p0, p1}, Ljava/util/zip/ZipEntry;->setLastModifiedTime(Ljava/nio/file/attribute/FileTime;)Ljava/util/zip/ZipEntry;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/nio/file/attribute/FileTime;->toMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iput-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪苏兰哲:J

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪苏哲兰:Z

    .line 12
    .line 13
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰哲世()V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public final setMethod(I)V
    .locals 0

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "ZIP compression method cannot be negative: "

    .line 7
    .line 8
    invoke-static {p1, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setSize(J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iput-wide p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰世苏:J

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p0, "Invalid entry size"

    .line 11
    .line 12
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setTime(J)V
    .locals 6

    .line 1
    const-wide v0, 0x3abd8960000L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-gtz v0, :cond_2

    .line 9
    .line 10
    sget-wide v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:J

    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-static {p1, p2}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v0, v1}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->getYear()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const-wide/32 v2, 0x210000

    .line 33
    .line 34
    .line 35
    const/16 v4, 0x7bc

    .line 36
    .line 37
    if-ge v1, v4, :cond_0

    .line 38
    .line 39
    move-wide v0, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->getYear()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    sub-int/2addr v1, v4

    .line 46
    shl-int/lit8 v1, v1, 0x19

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->getMonthValue()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    shl-int/lit8 v4, v4, 0x15

    .line 53
    .line 54
    or-int/2addr v1, v4

    .line 55
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    shl-int/lit8 v4, v4, 0x10

    .line 60
    .line 61
    or-int/2addr v1, v4

    .line 62
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->getHour()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    shl-int/lit8 v4, v4, 0xb

    .line 67
    .line 68
    or-int/2addr v1, v4

    .line 69
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->getMinute()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    shl-int/lit8 v4, v4, 0x5

    .line 74
    .line 75
    or-int/2addr v1, v4

    .line 76
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->getSecond()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    shr-int/lit8 v0, v0, 0x1

    .line 81
    .line 82
    or-int/2addr v0, v1

    .line 83
    int-to-long v0, v0

    .line 84
    const-wide v4, 0xffffffffL

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    and-long/2addr v0, v4

    .line 90
    :goto_0
    cmp-long v0, v0, v2

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    :cond_1
    invoke-super {p0, p1, p2}, Ljava/util/zip/ZipEntry;->setTime(J)V

    .line 95
    .line 96
    .line 97
    iput-wide p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪苏兰哲:J

    .line 98
    .line 99
    const/4 p1, 0x0

    .line 100
    iput-boolean p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪苏哲兰:Z

    .line 101
    .line 102
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰哲世()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_2
    sget v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 107
    .line 108
    :cond_3
    invoke-static {p1, p2}, Ljava/nio/file/attribute/FileTime;->fromMillis(J)Ljava/nio/file/attribute/FileTime;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p0, p1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->setLastModifiedTime(Ljava/nio/file/attribute/FileTime;)Ljava/util/zip/ZipEntry;

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏([Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世苏哲:[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏哲世兰([Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    array-length v0, p1

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    if-ge v2, v0, :cond_3

    .line 13
    .line 14
    aget-object v3, p1, v2

    .line 15
    .line 16
    instance-of v4, v3, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;

    .line 17
    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    iget-object v4, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    invoke-interface {v3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getHeaderId()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {p0, v4}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲苏兰(Lorg/apache/commons/compress/archivers/zip/ZipShort;)Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    :goto_1
    if-nez v4, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0, v3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲兰苏(Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;)V

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    invoke-interface {v3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getLocalFileDataData()[B

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    :try_start_0
    array-length v5, v3

    .line 42
    invoke-interface {v4, v3, v1, v5}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->parseFromLocalFileData([BII)V
    :try_end_0
    .catch Ljava/util/zip/ZipException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :catch_0
    new-instance v5, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;

    .line 47
    .line 48
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-interface {v4}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getHeaderId()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    iput-object v6, v5, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 56
    .line 57
    invoke-static {v3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰([B)[B

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iput-object v3, v5, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:[B

    .line 62
    .line 63
    invoke-interface {v4}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getCentralDirectoryData()[B

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰([B)[B

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    iput-object v3, v5, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:[B

    .line 72
    .line 73
    invoke-interface {v4}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getHeaderId()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {p0, v3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰苏哲(Lorg/apache/commons/compress/archivers/zip/ZipShort;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v5}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲兰苏(Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;)V

    .line 81
    .line 82
    .line 83
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏世兰哲()V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲(Lorg/apache/commons/compress/archivers/zip/ZipShort;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世苏哲:[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世苏哲:[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    if-ge v3, v2, :cond_2

    .line 16
    .line 17
    aget-object v4, v1, v3

    .line 18
    .line 19
    invoke-interface {v4}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getHeaderId()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-virtual {p1, v5}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-nez v5, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-object p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世苏哲:[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 36
    .line 37
    array-length p1, p1

    .line 38
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-ne p1, v1, :cond_3

    .line 43
    .line 44
    :goto_1
    return-void

    .line 45
    :cond_3
    sget-object p1, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, [Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 52
    .line 53
    iput-object p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世苏哲:[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 54
    .line 55
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;)V
    .locals 3

    .line 1
    instance-of v0, p1, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;

    .line 6
    .line 7
    iput-object p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世苏哲:[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    new-array v0, v1, [Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    aput-object p1, v0, v1

    .line 19
    .line 20
    iput-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世苏哲:[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-interface {p1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getHeaderId()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0, v0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲苏兰(Lorg/apache/commons/compress/archivers/zip/ZipShort;)Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-interface {p1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getHeaderId()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0, v0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰苏哲(Lorg/apache/commons/compress/archivers/zip/ZipShort;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世苏哲:[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 41
    .line 42
    array-length v2, v0

    .line 43
    add-int/2addr v2, v1

    .line 44
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, [Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 49
    .line 50
    array-length v2, v0

    .line 51
    sub-int/2addr v2, v1

    .line 52
    aput-object p1, v0, v2

    .line 53
    .line 54
    iput-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世苏哲:[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 55
    .line 56
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(Lorg/apache/commons/compress/archivers/zip/ZipShort;)Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;
    .locals 4

    .line 1
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世苏哲:[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    array-length v0, p0

    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    if-ge v1, v0, :cond_1

    .line 8
    .line 9
    aget-object v2, p0, v1

    .line 10
    .line 11
    invoke-interface {v2}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getHeaderId()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {p1, v3}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    return-object v2

    .line 22
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()[B
    .locals 11

    .line 1
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰()[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    add-int/lit8 v3, v0, -0x1

    .line 13
    .line 14
    aget-object v3, p0, v3

    .line 15
    .line 16
    instance-of v3, v3, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    move v3, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v3, v2

    .line 23
    :goto_0
    if-eqz v3, :cond_1

    .line 24
    .line 25
    add-int/lit8 v4, v0, -0x1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v4, v0

    .line 29
    :goto_1
    mul-int/lit8 v5, v4, 0x4

    .line 30
    .line 31
    array-length v6, p0

    .line 32
    move v7, v2

    .line 33
    :goto_2
    if-ge v7, v6, :cond_2

    .line 34
    .line 35
    aget-object v8, p0, v7

    .line 36
    .line 37
    invoke-interface {v8}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getCentralDirectoryLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-virtual {v8}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue()I

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    add-int/2addr v5, v8

    .line 46
    add-int/lit8 v7, v7, 0x1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    new-array v5, v5, [B

    .line 50
    .line 51
    move v6, v2

    .line 52
    move v7, v6

    .line 53
    :goto_3
    if-ge v6, v4, :cond_4

    .line 54
    .line 55
    aget-object v8, p0, v6

    .line 56
    .line 57
    invoke-interface {v8}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getHeaderId()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-virtual {v8}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getBytes()[B

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    const/4 v9, 0x2

    .line 66
    invoke-static {v8, v2, v5, v7, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 67
    .line 68
    .line 69
    aget-object v8, p0, v6

    .line 70
    .line 71
    invoke-interface {v8}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getCentralDirectoryLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-virtual {v8}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getBytes()[B

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    add-int/lit8 v10, v7, 0x2

    .line 80
    .line 81
    invoke-static {v8, v2, v5, v10, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v7, v7, 0x4

    .line 85
    .line 86
    aget-object v8, p0, v6

    .line 87
    .line 88
    invoke-interface {v8}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getCentralDirectoryData()[B

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    if-eqz v8, :cond_3

    .line 93
    .line 94
    array-length v9, v8

    .line 95
    invoke-static {v8, v2, v5, v7, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 96
    .line 97
    .line 98
    array-length v8, v8

    .line 99
    add-int/2addr v7, v8

    .line 100
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_4
    if-eqz v3, :cond_5

    .line 104
    .line 105
    sub-int/2addr v0, v1

    .line 106
    aget-object p0, p0, v0

    .line 107
    .line 108
    invoke-interface {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getCentralDirectoryData()[B

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    if-eqz p0, :cond_5

    .line 113
    .line 114
    array-length v0, p0

    .line 115
    invoke-static {p0, v2, v5, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 116
    .line 117
    .line 118
    :cond_5
    return-object v5
.end method

.method public final 飘花落叶言子楪世苏哲兰()[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世苏哲:[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    sget-object p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-array p0, v2, [Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    aput-object v1, p0, v0

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    if-eqz v1, :cond_2

    .line 20
    .line 21
    array-length v1, v0

    .line 22
    add-int/2addr v1, v2

    .line 23
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, [Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 28
    .line 29
    iget-object v1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世苏哲:[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 30
    .line 31
    array-length v1, v1

    .line 32
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;

    .line 33
    .line 34
    aput-object p0, v0, v1

    .line 35
    .line 36
    :cond_2
    return-object v0
.end method

.method public final 飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰苏世:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "/"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/16 v0, 0x5c

    .line 16
    .line 17
    const/16 v1, 0x2f

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_0
    iput-object p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 24
    .line 25
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰()[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    if-lez v1, :cond_0

    .line 11
    .line 12
    add-int/lit8 v4, v1, -0x1

    .line 13
    .line 14
    aget-object v4, v0, v4

    .line 15
    .line 16
    instance-of v4, v4, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    move v4, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v4, v3

    .line 23
    :goto_0
    if-eqz v4, :cond_1

    .line 24
    .line 25
    add-int/lit8 v5, v1, -0x1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v5, v1

    .line 29
    :goto_1
    mul-int/lit8 v6, v5, 0x4

    .line 30
    .line 31
    array-length v7, v0

    .line 32
    move v8, v3

    .line 33
    :goto_2
    if-ge v8, v7, :cond_2

    .line 34
    .line 35
    aget-object v9, v0, v8

    .line 36
    .line 37
    invoke-interface {v9}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getLocalFileDataLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    invoke-virtual {v9}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue()I

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    add-int/2addr v6, v9

    .line 46
    add-int/lit8 v8, v8, 0x1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    new-array v6, v6, [B

    .line 50
    .line 51
    move v7, v3

    .line 52
    move v8, v7

    .line 53
    :goto_3
    if-ge v7, v5, :cond_4

    .line 54
    .line 55
    aget-object v9, v0, v7

    .line 56
    .line 57
    invoke-interface {v9}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getHeaderId()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-virtual {v9}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getBytes()[B

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    const/4 v10, 0x2

    .line 66
    invoke-static {v9, v3, v6, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 67
    .line 68
    .line 69
    aget-object v9, v0, v7

    .line 70
    .line 71
    invoke-interface {v9}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getLocalFileDataLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    invoke-virtual {v9}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getBytes()[B

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    add-int/lit8 v11, v8, 0x2

    .line 80
    .line 81
    invoke-static {v9, v3, v6, v11, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v8, v8, 0x4

    .line 85
    .line 86
    aget-object v9, v0, v7

    .line 87
    .line 88
    invoke-interface {v9}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getLocalFileDataData()[B

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    if-eqz v9, :cond_3

    .line 93
    .line 94
    array-length v10, v9

    .line 95
    invoke-static {v9, v3, v6, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 96
    .line 97
    .line 98
    array-length v9, v9

    .line 99
    add-int/2addr v8, v9

    .line 100
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_4
    if-eqz v4, :cond_5

    .line 104
    .line 105
    sub-int/2addr v1, v2

    .line 106
    aget-object v0, v0, v1

    .line 107
    .line 108
    invoke-interface {v0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;->getLocalFileDataData()[B

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    if-eqz v0, :cond_5

    .line 113
    .line 114
    array-length v1, v0

    .line 115
    invoke-static {v0, v3, v6, v8, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 116
    .line 117
    .line 118
    :cond_5
    invoke-super {p0, v6}, Ljava/util/zip/ZipEntry;->setExtra([B)V

    .line 119
    .line 120
    .line 121
    sget-object v0, Lorg/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp;->HEADER_ID:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 122
    .line 123
    invoke-virtual {p0, v0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲苏兰(Lorg/apache/commons/compress/archivers/zip/ZipShort;)Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    instance-of v1, v0, Lorg/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp;

    .line 128
    .line 129
    if-eqz v1, :cond_8

    .line 130
    .line 131
    check-cast v0, Lorg/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp;

    .line 132
    .line 133
    invoke-virtual {v0}, Lorg/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp;->isBit0_modifyTimePresent()Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_6

    .line 138
    .line 139
    invoke-virtual {v0}, Lorg/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp;->getModifyFileTime()Ljava/nio/file/attribute/FileTime;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    if-eqz v1, :cond_6

    .line 144
    .line 145
    invoke-super {p0, v1}, Ljava/util/zip/ZipEntry;->setLastModifiedTime(Ljava/nio/file/attribute/FileTime;)Ljava/util/zip/ZipEntry;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/nio/file/attribute/FileTime;->toMillis()J

    .line 149
    .line 150
    .line 151
    move-result-wide v3

    .line 152
    iput-wide v3, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪苏兰哲:J

    .line 153
    .line 154
    iput-boolean v2, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪苏哲兰:Z

    .line 155
    .line 156
    :cond_6
    invoke-virtual {v0}, Lorg/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp;->isBit1_accessTimePresent()Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_7

    .line 161
    .line 162
    invoke-virtual {v0}, Lorg/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp;->getAccessFileTime()Ljava/nio/file/attribute/FileTime;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    if-eqz v1, :cond_7

    .line 167
    .line 168
    invoke-super {p0, v1}, Ljava/util/zip/ZipEntry;->setLastAccessTime(Ljava/nio/file/attribute/FileTime;)Ljava/util/zip/ZipEntry;

    .line 169
    .line 170
    .line 171
    :cond_7
    invoke-virtual {v0}, Lorg/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp;->isBit2_createTimePresent()Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eqz v1, :cond_8

    .line 176
    .line 177
    invoke-virtual {v0}, Lorg/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp;->getCreateFileTime()Ljava/nio/file/attribute/FileTime;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    if-eqz v0, :cond_8

    .line 182
    .line 183
    invoke-super {p0, v0}, Ljava/util/zip/ZipEntry;->setCreationTime(Ljava/nio/file/attribute/FileTime;)Ljava/util/zip/ZipEntry;

    .line 184
    .line 185
    .line 186
    :cond_8
    sget-object v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰世苏哲:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 187
    .line 188
    invoke-virtual {p0, v0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲苏兰(Lorg/apache/commons/compress/archivers/zip/ZipShort;)Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    instance-of v1, v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;

    .line 193
    .line 194
    if-eqz v1, :cond_b

    .line 195
    .line 196
    check-cast v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;

    .line 197
    .line 198
    iget-object v1, v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 199
    .line 200
    invoke-static {v1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲(Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;)Ljava/nio/file/attribute/FileTime;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    if-eqz v1, :cond_9

    .line 205
    .line 206
    invoke-super {p0, v1}, Ljava/util/zip/ZipEntry;->setLastModifiedTime(Ljava/nio/file/attribute/FileTime;)Ljava/util/zip/ZipEntry;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Ljava/nio/file/attribute/FileTime;->toMillis()J

    .line 210
    .line 211
    .line 212
    move-result-wide v3

    .line 213
    iput-wide v3, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪苏兰哲:J

    .line 214
    .line 215
    iput-boolean v2, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪苏哲兰:Z

    .line 216
    .line 217
    :cond_9
    iget-object v1, v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 218
    .line 219
    invoke-static {v1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲(Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;)Ljava/nio/file/attribute/FileTime;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    if-eqz v1, :cond_a

    .line 224
    .line 225
    invoke-super {p0, v1}, Ljava/util/zip/ZipEntry;->setLastAccessTime(Ljava/nio/file/attribute/FileTime;)Ljava/util/zip/ZipEntry;

    .line 226
    .line 227
    .line 228
    :cond_a
    iget-object v0, v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰苏世:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 229
    .line 230
    invoke-static {v0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲(Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;)Ljava/nio/file/attribute/FileTime;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    if-eqz v0, :cond_b

    .line 235
    .line 236
    invoke-super {p0, v0}, Ljava/util/zip/ZipEntry;->setCreationTime(Ljava/nio/file/attribute/FileTime;)Ljava/util/zip/ZipEntry;

    .line 237
    .line 238
    .line 239
    :cond_b
    return-void
.end method

.method public final 飘花落叶言子楪苏兰哲世()V
    .locals 13

    .line 1
    sget-object v0, Lorg/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp;->HEADER_ID:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲苏兰(Lorg/apache/commons/compress/archivers/zip/ZipShort;)Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰苏哲(Lorg/apache/commons/compress/archivers/zip/ZipShort;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    sget-object v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰世苏哲:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲苏兰(Lorg/apache/commons/compress/archivers/zip/ZipShort;)Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰苏哲(Lorg/apache/commons/compress/archivers/zip/ZipShort;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {p0}, Ljava/util/zip/ZipEntry;->getLastAccessTime()Ljava/nio/file/attribute/FileTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/zip/ZipEntry;->getCreationTime()Ljava/nio/file/attribute/FileTime;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    iget-boolean v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪苏哲兰:Z

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    :goto_0
    const/4 v0, 0x1

    .line 40
    :goto_1
    if-eqz v0, :cond_e

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/util/zip/ZipEntry;->getLastModifiedTime()Ljava/nio/file/attribute/FileTime;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p0}, Ljava/util/zip/ZipEntry;->getLastAccessTime()Ljava/nio/file/attribute/FileTime;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {p0}, Ljava/util/zip/ZipEntry;->getCreationTime()Ljava/nio/file/attribute/FileTime;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    sget-object v3, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/math/MathContext;

    .line 55
    .line 56
    const-wide/16 v3, 0x0

    .line 57
    .line 58
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 59
    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    invoke-virtual {v0, v5}, Ljava/nio/file/attribute/FileTime;->to(Ljava/util/concurrent/TimeUnit;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    goto :goto_2

    .line 67
    :cond_4
    move-wide v6, v3

    .line 68
    :goto_2
    const-wide/32 v8, -0x80000000

    .line 69
    .line 70
    .line 71
    cmp-long v10, v8, v6

    .line 72
    .line 73
    if-gtz v10, :cond_a

    .line 74
    .line 75
    const-wide/32 v10, 0x7fffffff

    .line 76
    .line 77
    .line 78
    cmp-long v6, v6, v10

    .line 79
    .line 80
    if-gtz v6, :cond_a

    .line 81
    .line 82
    if-eqz v1, :cond_5

    .line 83
    .line 84
    invoke-virtual {v1, v5}, Ljava/nio/file/attribute/FileTime;->to(Ljava/util/concurrent/TimeUnit;)J

    .line 85
    .line 86
    .line 87
    move-result-wide v6

    .line 88
    goto :goto_3

    .line 89
    :cond_5
    move-wide v6, v3

    .line 90
    :goto_3
    cmp-long v12, v8, v6

    .line 91
    .line 92
    if-gtz v12, :cond_a

    .line 93
    .line 94
    cmp-long v6, v6, v10

    .line 95
    .line 96
    if-gtz v6, :cond_a

    .line 97
    .line 98
    if-eqz v2, :cond_6

    .line 99
    .line 100
    invoke-virtual {v2, v5}, Ljava/nio/file/attribute/FileTime;->to(Ljava/util/concurrent/TimeUnit;)J

    .line 101
    .line 102
    .line 103
    move-result-wide v3

    .line 104
    :cond_6
    cmp-long v5, v8, v3

    .line 105
    .line 106
    if-gtz v5, :cond_a

    .line 107
    .line 108
    cmp-long v3, v3, v10

    .line 109
    .line 110
    if-gtz v3, :cond_a

    .line 111
    .line 112
    new-instance v3, Lorg/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp;

    .line 113
    .line 114
    invoke-direct {v3}, Lorg/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp;-><init>()V

    .line 115
    .line 116
    .line 117
    if-eqz v0, :cond_7

    .line 118
    .line 119
    invoke-virtual {v3, v0}, Lorg/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp;->setModifyFileTime(Ljava/nio/file/attribute/FileTime;)V

    .line 120
    .line 121
    .line 122
    :cond_7
    if-eqz v1, :cond_8

    .line 123
    .line 124
    invoke-virtual {v3, v1}, Lorg/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp;->setAccessFileTime(Ljava/nio/file/attribute/FileTime;)V

    .line 125
    .line 126
    .line 127
    :cond_8
    if-eqz v2, :cond_9

    .line 128
    .line 129
    invoke-virtual {v3, v2}, Lorg/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp;->setCreateFileTime(Ljava/nio/file/attribute/FileTime;)V

    .line 130
    .line 131
    .line 132
    :cond_9
    invoke-virtual {p0, v3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲兰苏(Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;)V

    .line 133
    .line 134
    .line 135
    :cond_a
    new-instance v3, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;

    .line 136
    .line 137
    invoke-direct {v3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;-><init>()V

    .line 138
    .line 139
    .line 140
    if-eqz v0, :cond_b

    .line 141
    .line 142
    invoke-static {v0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰(Ljava/nio/file/attribute/FileTime;)Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iput-object v0, v3, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 147
    .line 148
    :cond_b
    if-eqz v1, :cond_c

    .line 149
    .line 150
    invoke-static {v1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰(Ljava/nio/file/attribute/FileTime;)Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iput-object v0, v3, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 155
    .line 156
    :cond_c
    if-eqz v2, :cond_d

    .line 157
    .line 158
    invoke-static {v2}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰(Ljava/nio/file/attribute/FileTime;)Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iput-object v0, v3, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰苏世:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 163
    .line 164
    :cond_d
    invoke-virtual {p0, v3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲兰苏(Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;)V

    .line 165
    .line 166
    .line 167
    :cond_e
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏世兰哲()V

    .line 168
    .line 169
    .line 170
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰([Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;

    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    array-length v1, p1

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_1

    .line 14
    .line 15
    aget-object v3, p1, v2

    .line 16
    .line 17
    instance-of v4, v3, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    check-cast v3, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;

    .line 22
    .line 23
    iput-object v3, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世哲苏:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    sget-object p1, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, [Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 39
    .line 40
    iput-object p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世苏哲:[Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;

    .line 41
    .line 42
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏世兰哲()V

    .line 43
    .line 44
    .line 45
    return-void
.end method
