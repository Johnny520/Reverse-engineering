.class public final Lyyds/ᛶᲁᲀᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲈᛱᛸᛴ;


# static fields
.field public static final ᛷᛲᲈᛱ:Landroid/graphics/Bitmap$Config;


# instance fields
.field public ᛱᲈᲁ:I

.field public ᛲᛳᛶᲁ:I

.field public final ᛲᛴᛳᛲ:J

.field public ᛶᛷᛲᲁ:I

.field public ᛷᲈᲈᲁ:I

.field public final ᲀᛲᛳᲀ:Lyyds/ᲀᲇᛴᛴ;

.field public ᲇᲇᲇᛱ:J

.field public final ᲇᲈᛵᛷ:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    sput-object v0, Lyyds/ᛶᲁᲀᛴ;->ᛷᛲᲈᛱ:Landroid/graphics/Bitmap$Config;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(J)V
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᲀᲇᛴᛴ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᲀᲇᛴᛴ;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-static {}, Landroid/graphics/Bitmap$Config;->values()[Landroid/graphics/Bitmap$Config;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    sget-object v2, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-wide p1, p0, Lyyds/ᛶᲁᲀᛴ;->ᛲᛴᛳᛲ:J

    .line 36
    .line 37
    iput-object v0, p0, Lyyds/ᛶᲁᲀᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲇᛴᛴ;

    .line 38
    .line 39
    iput-object v1, p0, Lyyds/ᛶᲁᲀᛴ;->ᲇᲈᛵᛷ:Ljava/util/Set;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final declared-synchronized ᛱᲈᲁ(Landroid/graphics/Bitmap;)V
    .locals 8

    .line 1
    const-string v0, "Reject bitmap from pool, bitmap: "

    .line 2
    .line 3
    const-string v1, "Put bitmap in pool="

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    if-eqz p1, :cond_6

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_5

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isMutable()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x2

    .line 19
    if-eqz v2, :cond_3

    .line 20
    .line 21
    invoke-static {p1}, Lyyds/ᛱᛷᲈᛲ;->ᲇᲇᲇᛱ(Landroid/graphics/Bitmap;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    int-to-long v4, v2

    .line 26
    iget-wide v6, p0, Lyyds/ᛶᲁᲀᛴ;->ᛲᛴᛳᛲ:J

    .line 27
    .line 28
    cmp-long v2, v4, v6

    .line 29
    .line 30
    if-gtz v2, :cond_3

    .line 31
    .line 32
    iget-object v2, p0, Lyyds/ᛶᲁᲀᛴ;->ᲇᲈᛵᛷ:Ljava/util/Set;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-static {p1}, Lyyds/ᛱᛷᲈᛲ;->ᲇᲇᲇᛱ(Landroid/graphics/Bitmap;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-object v2, p0, Lyyds/ᛶᲁᲀᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲇᛴᛴ;

    .line 50
    .line 51
    invoke-virtual {v2, p1}, Lyyds/ᲀᲇᛴᛴ;->ᛲᛴᛳᛲ(Landroid/graphics/Bitmap;)V

    .line 52
    .line 53
    .line 54
    iget v2, p0, Lyyds/ᛶᲁᲀᛴ;->ᛲᛳᛶᲁ:I

    .line 55
    .line 56
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    iput v2, p0, Lyyds/ᛶᲁᲀᛴ;->ᛲᛳᛶᲁ:I

    .line 59
    .line 60
    iget-wide v4, p0, Lyyds/ᛶᲁᲀᛴ;->ᲇᲇᲇᛱ:J

    .line 61
    .line 62
    int-to-long v6, v0

    .line 63
    add-long/2addr v4, v6

    .line 64
    iput-wide v4, p0, Lyyds/ᛶᲁᲀᛴ;->ᲇᲇᲇᛱ:J

    .line 65
    .line 66
    const-string v0, "LruBitmapPool"

    .line 67
    .line 68
    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    const-string v0, "LruBitmapPool"

    .line 75
    .line 76
    invoke-static {p1}, Lyyds/ᛱᛷᲈᛲ;->ᲇᲇᲇᛱ(Landroid/graphics/Bitmap;)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {v2, p1}, Lyyds/ᲀᲇᛴᛴ;->ᲀᛲᛳᲀ(ILandroid/graphics/Bitmap$Config;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :catchall_0
    move-exception p1

    .line 97
    goto :goto_2

    .line 98
    :cond_1
    :goto_0
    const-string p1, "LruBitmapPool"

    .line 99
    .line 100
    invoke-static {p1, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_2

    .line 105
    .line 106
    invoke-virtual {p0}, Lyyds/ᛶᲁᲀᛴ;->ᛲᲈᲁ()V

    .line 107
    .line 108
    .line 109
    :cond_2
    iget-wide v0, p0, Lyyds/ᛶᲁᲀᛴ;->ᛲᛴᛳᛲ:J

    .line 110
    .line 111
    invoke-virtual {p0, v0, v1}, Lyyds/ᛶᲁᲀᛴ;->ᲀᛲᛳᲀ(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    .line 114
    monitor-exit p0

    .line 115
    return-void

    .line 116
    :cond_3
    :goto_1
    :try_start_1
    const-string v1, "LruBitmapPool"

    .line 117
    .line 118
    invoke-static {v1, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_4

    .line 123
    .line 124
    const-string v1, "LruBitmapPool"

    .line 125
    .line 126
    new-instance v2, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-static {p1}, Lyyds/ᛱᛷᲈᛲ;->ᲇᲇᲇᛱ(Landroid/graphics/Bitmap;)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-static {v0, v3}, Lyyds/ᲀᲇᛴᛴ;->ᲀᛲᛳᲀ(ILandroid/graphics/Bitmap$Config;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v0, ", is mutable: "

    .line 147
    .line 148
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isMutable()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string v0, ", is allowed config: "

    .line 159
    .line 160
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    iget-object v0, p0, Lyyds/ᛶᲁᲀᛴ;->ᲇᲈᛵᛷ:Ljava/util/Set;

    .line 164
    .line 165
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    :cond_4
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 184
    .line 185
    .line 186
    monitor-exit p0

    .line 187
    return-void

    .line 188
    :cond_5
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 189
    .line 190
    const-string v0, "Cannot pool recycled bitmap"

    .line 191
    .line 192
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p1

    .line 196
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 197
    .line 198
    const-string v0, "Bitmap must not be null"

    .line 199
    .line 200
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw p1

    .line 204
    :goto_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 205
    throw p1
.end method

.method public final ᛲᛳᛶᲁ(I)V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    const-string v1, "LruBitmapPool"

    .line 3
    .line 4
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "trimMemory, level="

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    const/16 v0, 0x28

    .line 28
    .line 29
    if-ge p1, v0, :cond_4

    .line 30
    .line 31
    const/16 v0, 0x14

    .line 32
    .line 33
    if-lt p1, v0, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    if-ge p1, v0, :cond_3

    .line 37
    .line 38
    const/16 v0, 0xf

    .line 39
    .line 40
    if-ne p1, v0, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-void

    .line 44
    :cond_3
    :goto_0
    iget-wide v0, p0, Lyyds/ᛶᲁᲀᛴ;->ᛲᛴᛳᛲ:J

    .line 45
    .line 46
    const-wide/16 v2, 0x2

    .line 47
    .line 48
    div-long/2addr v0, v2

    .line 49
    invoke-virtual {p0, v0, v1}, Lyyds/ᛶᲁᲀᛴ;->ᲀᛲᛳᲀ(J)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lyyds/ᛶᲁᲀᛴ;->ᛷᛵᲇᲀ()V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final ᛲᲈᲁ()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Hits="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lyyds/ᛶᲁᲀᛴ;->ᛶᛷᛲᲁ:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", misses="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lyyds/ᛶᲁᲀᛴ;->ᛱᲈᲁ:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", puts="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v1, p0, Lyyds/ᛶᲁᲀᛴ;->ᛲᛳᛶᲁ:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", evictions="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v1, p0, Lyyds/ᛶᲁᲀᛴ;->ᛷᲈᲈᲁ:I

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", currentSize="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-wide v1, p0, Lyyds/ᛶᲁᲀᛴ;->ᲇᲇᲇᛱ:J

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", maxSize="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-wide v1, p0, Lyyds/ᛶᲁᲀᛴ;->ᛲᛴᛳᛲ:J

    .line 59
    .line 60
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, "\nStrategy="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, Lyyds/ᛶᲁᲀᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲇᛴᛴ;

    .line 69
    .line 70
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const-string v0, "LruBitmapPool"

    .line 78
    .line 79
    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final declared-synchronized ᛵᛸᛸᛷ(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    const-string v0, "Get bitmap="

    .line 2
    .line 3
    const-string v1, "Missing bitmap="

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    .line 7
    .line 8
    if-eq p3, v2, :cond_5

    .line 9
    .line 10
    iget-object v2, p0, Lyyds/ᛶᲁᲀᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲇᛴᛴ;

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    move-object v3, p3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v3, Lyyds/ᛶᲁᲀᛴ;->ᛷᛲᲈᛱ:Landroid/graphics/Bitmap$Config;

    .line 17
    .line 18
    :goto_0
    invoke-virtual {v2, p1, p2, v3}, Lyyds/ᲀᲇᛴᛴ;->ᛵᛸᛸᛷ(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x1

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    const-string v4, "LruBitmapPool"

    .line 26
    .line 27
    const/4 v5, 0x3

    .line 28
    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    const-string v4, "LruBitmapPool"

    .line 35
    .line 36
    mul-int v5, p1, p2

    .line 37
    .line 38
    invoke-static {p3}, Lyyds/ᛱᛷᲈᛲ;->ᛶᛷᛲᲁ(Landroid/graphics/Bitmap$Config;)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    mul-int/2addr v6, v5

    .line 43
    invoke-static {v6, p3}, Lyyds/ᲀᲇᛴᛴ;->ᲀᛲᛳᲀ(ILandroid/graphics/Bitmap$Config;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_3

    .line 57
    :cond_1
    :goto_1
    iget v1, p0, Lyyds/ᛶᲁᲀᛴ;->ᛱᲈᲁ:I

    .line 58
    .line 59
    add-int/2addr v1, v3

    .line 60
    iput v1, p0, Lyyds/ᛶᲁᲀᛴ;->ᛱᲈᲁ:I

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    iget v1, p0, Lyyds/ᛶᲁᲀᛴ;->ᛶᛷᛲᲁ:I

    .line 64
    .line 65
    add-int/2addr v1, v3

    .line 66
    iput v1, p0, Lyyds/ᛶᲁᲀᛴ;->ᛶᛷᛲᲁ:I

    .line 67
    .line 68
    iget-wide v4, p0, Lyyds/ᛶᲁᲀᛴ;->ᲇᲇᲇᛱ:J

    .line 69
    .line 70
    invoke-static {v2}, Lyyds/ᛱᛷᲈᛲ;->ᲇᲇᲇᛱ(Landroid/graphics/Bitmap;)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    int-to-long v6, v1

    .line 75
    sub-long/2addr v4, v6

    .line 76
    iput-wide v4, p0, Lyyds/ᛶᲁᲀᛴ;->ᲇᲇᲇᛱ:J

    .line 77
    .line 78
    invoke-virtual {v2, v3}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v3}, Landroid/graphics/Bitmap;->setPremultiplied(Z)V

    .line 82
    .line 83
    .line 84
    :goto_2
    const-string v1, "LruBitmapPool"

    .line 85
    .line 86
    const/4 v3, 0x2

    .line 87
    invoke-static {v1, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    const-string v1, "LruBitmapPool"

    .line 94
    .line 95
    mul-int/2addr p1, p2

    .line 96
    invoke-static {p3}, Lyyds/ᛱᛷᲈᛲ;->ᛶᛷᛲᲁ(Landroid/graphics/Bitmap$Config;)I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    mul-int/2addr p2, p1

    .line 101
    invoke-static {p2, p3}, Lyyds/ᲀᲇᛴᛴ;->ᲀᛲᛳᲀ(ILandroid/graphics/Bitmap$Config;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-static {v1, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    :cond_3
    const-string p1, "LruBitmapPool"

    .line 113
    .line 114
    invoke-static {p1, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_4

    .line 119
    .line 120
    invoke-virtual {p0}, Lyyds/ᛶᲁᲀᛴ;->ᛲᲈᲁ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    .line 122
    .line 123
    :cond_4
    monitor-exit p0

    .line 124
    return-object v2

    .line 125
    :cond_5
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 126
    .line 127
    new-instance p2, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string v0, "Cannot create a mutable Bitmap with config: "

    .line 130
    .line 131
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string p3, ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions"

    .line 138
    .line 139
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p1

    .line 150
    :goto_3
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 151
    throw p1
.end method

.method public final ᛶᛷᛲᲁ(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lyyds/ᛶᲁᲀᛴ;->ᛵᛸᛸᛷ(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    if-eqz p3, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    sget-object p3, Lyyds/ᛶᲁᲀᛴ;->ᛷᛲᲈᛱ:Landroid/graphics/Bitmap$Config;

    .line 16
    .line 17
    :goto_0
    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final ᛷᛵᲇᲀ()V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    const-string v1, "LruBitmapPool"

    .line 3
    .line 4
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "clearMemory"

    .line 11
    .line 12
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    :cond_0
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    invoke-virtual {p0, v0, v1}, Lyyds/ᛶᲁᲀᛴ;->ᲀᛲᛳᲀ(J)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final declared-synchronized ᲀᛲᛳᲀ(J)V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :goto_0
    :try_start_0
    iget-wide v0, p0, Lyyds/ᛶᲁᲀᛴ;->ᲇᲇᲇᛱ:J

    .line 3
    .line 4
    cmp-long v0, v0, p1

    .line 5
    .line 6
    if-lez v0, :cond_5

    .line 7
    .line 8
    iget-object v0, p0, Lyyds/ᛶᲁᲀᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲇᛴᛴ;

    .line 9
    .line 10
    iget-object v1, v0, Lyyds/ᲀᲇᛴᛴ;->ᛵᛸᛸᛷ:Lyyds/ᲀᲈᛶᲈ;

    .line 11
    .line 12
    invoke-virtual {v1}, Lyyds/ᲀᲈᛶᲈ;->ᲀᛴᲁᲈ()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroid/graphics/Bitmap;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-static {v1}, Lyyds/ᛱᛷᲈᛲ;->ᲇᲇᲇᛱ(Landroid/graphics/Bitmap;)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0, v2, v1}, Lyyds/ᲀᲇᛴᛴ;->ᛲᲈᲁ(Ljava/lang/Integer;Landroid/graphics/Bitmap;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    if-nez v1, :cond_2

    .line 32
    .line 33
    const-string p1, "LruBitmapPool"

    .line 34
    .line 35
    const/4 p2, 0x5

    .line 36
    invoke-static {p1, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    const-string p1, "LruBitmapPool"

    .line 43
    .line 44
    const-string p2, "Size mismatch, resetting"

    .line 45
    .line 46
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lyyds/ᛶᲁᲀᛴ;->ᛲᲈᲁ()V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    :goto_1
    const-wide/16 p1, 0x0

    .line 56
    .line 57
    iput-wide p1, p0, Lyyds/ᛶᲁᲀᛴ;->ᲇᲇᲇᛱ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    monitor-exit p0

    .line 60
    return-void

    .line 61
    :cond_2
    :try_start_1
    iget-wide v2, p0, Lyyds/ᛶᲁᲀᛴ;->ᲇᲇᲇᛱ:J

    .line 62
    .line 63
    invoke-static {v1}, Lyyds/ᛱᛷᲈᛲ;->ᲇᲇᲇᛱ(Landroid/graphics/Bitmap;)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    int-to-long v4, v0

    .line 68
    sub-long/2addr v2, v4

    .line 69
    iput-wide v2, p0, Lyyds/ᛶᲁᲀᛴ;->ᲇᲇᲇᛱ:J

    .line 70
    .line 71
    iget v0, p0, Lyyds/ᛶᲁᲀᛴ;->ᛷᲈᲈᲁ:I

    .line 72
    .line 73
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    iput v0, p0, Lyyds/ᛶᲁᲀᛴ;->ᛷᲈᲈᲁ:I

    .line 76
    .line 77
    const-string v0, "LruBitmapPool"

    .line 78
    .line 79
    const/4 v2, 0x3

    .line 80
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    const-string v0, "LruBitmapPool"

    .line 87
    .line 88
    new-instance v2, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v3, "Evicting bitmap="

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-static {v1}, Lyyds/ᛱᛷᲈᛲ;->ᲇᲇᲇᛱ(Landroid/graphics/Bitmap;)I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-static {v3, v4}, Lyyds/ᲀᲇᛴᛴ;->ᲀᛲᛳᲀ(ILandroid/graphics/Bitmap$Config;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    :cond_3
    const-string v0, "LruBitmapPool"

    .line 121
    .line 122
    const/4 v2, 0x2

    .line 123
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    invoke-virtual {p0}, Lyyds/ᛶᲁᲀᛴ;->ᛲᲈᲁ()V

    .line 130
    .line 131
    .line 132
    :cond_4
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :cond_5
    monitor-exit p0

    .line 138
    return-void

    .line 139
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 140
    throw p1
.end method

.method public final ᲇᲇᲇᛱ(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lyyds/ᛶᲁᲀᛴ;->ᛵᛸᛸᛷ(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_1

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object p3, Lyyds/ᛶᲁᲀᛴ;->ᛷᛲᲈᛱ:Landroid/graphics/Bitmap$Config;

    .line 11
    .line 12
    :goto_0
    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_1
    return-object p0
.end method
