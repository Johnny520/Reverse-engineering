.class public final Lyyds/ᛳᲁᛷᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛴᛲᲈᲁ;


# static fields
.field public static final ᛲᛴᛳᛲ:Lyyds/ᛲᛵᲈ;


# instance fields
.field public final ᛲᲈᲁ:Landroid/content/Context;

.field public final ᛵᛸᛸᛷ:Ljava/util/ArrayList;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛲᛵᲈ;

.field public final ᲇᲈᛵᛷ:Lyyds/ᲀᲈᛶᲈ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛲᛵᲈ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛲᛵᲈ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᛳᲁᛷᛵ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛵᲈ;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Lyyds/ᲈᛱᛸᛴ;Lyyds/ᲁᛶᲇᛱ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lyyds/ᛳᲁᛷᛵ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lyyds/ᛳᲁᛷᛵ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance p1, Lyyds/ᲀᲈᛶᲈ;

    .line 13
    .line 14
    const/16 p2, 0x19

    .line 15
    .line 16
    invoke-direct {p1, p3, p2, p4}, Lyyds/ᲀᲈᛶᲈ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lyyds/ᛳᲁᛷᛵ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲈᛶᲈ;

    .line 20
    .line 21
    sget-object p1, Lyyds/ᛳᲁᛷᛵ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛵᲈ;

    .line 22
    .line 23
    iput-object p1, p0, Lyyds/ᛳᲁᛷᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛵᲈ;

    .line 24
    .line 25
    return-void
.end method

.method public static ᲇᲈᛵᛷ(Lyyds/ᛱᛱᲈᲇ;II)I
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛱᛱᲈᲇ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    div-int/2addr v0, p2

    .line 4
    iget v1, p0, Lyyds/ᛱᛱᲈᲇ;->ᲇᲇᲇᛱ:I

    .line 5
    .line 6
    div-int/2addr v1, p1

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    :goto_0
    const/4 v1, 0x1

    .line 20
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x2

    .line 25
    const-string v3, "BufferGifDecoder"

    .line 26
    .line 27
    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    if-le v0, v1, :cond_1

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v2, "Downsampling GIF, sampleSize: "

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v2, ", target dimens: ["

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p1, "x"

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p2, "], actual dimens: ["

    .line 62
    .line 63
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget p2, p0, Lyyds/ᛱᛱᲈᲇ;->ᲇᲇᲇᛱ:I

    .line 67
    .line 68
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget p0, p0, Lyyds/ᛱᛱᲈᲇ;->ᛶᛷᛲᲁ:I

    .line 75
    .line 76
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string p0, "]"

    .line 80
    .line 81
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {v3, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    :cond_1
    return v0
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/Object;Lyyds/ᛴᛳᲀᲈ;)Z
    .locals 1

    .line 1
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    sget-object v0, Lyyds/ᛴᛶᛷᲀ;->ᛵᛸᛸᛷ:Lyyds/ᲀᲇᲇᛲ;

    .line 4
    .line 5
    invoke-virtual {p2, v0}, Lyyds/ᛴᛳᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᲀᲇᲇᛲ;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Lyyds/ᛳᲁᛷᛵ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {p0, p1}, Lyyds/ᛸᛳᛷᛳ;->ᛲᛲᲈᲈ(Ljava/util/ArrayList;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    sget-object p1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->GIF:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 24
    .line 25
    if-ne p0, p1, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public final ᛵᛸᛸᛷ(Ljava/lang/Object;IILyyds/ᛴᛳᲀᲈ;)Lyyds/ᲁᛱᛸᛵ;
    .locals 7

    .line 1
    move-object v2, p1

    .line 2
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    iget-object p1, p0, Lyyds/ᛳᲁᛷᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛵᲈ;

    .line 5
    .line 6
    monitor-enter p1

    .line 7
    :try_start_0
    iget-object v0, p1, Lyyds/ᛲᛵᲈ;->ᛲᲈᲁ:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lyyds/ᲀᛱᲀᲈ;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Lyyds/ᲀᛱᲀᲈ;

    .line 18
    .line 19
    invoke-direct {v0}, Lyyds/ᲀᛱᲀᲈ;-><init>()V

    .line 20
    .line 21
    .line 22
    :cond_0
    move-object v5, v0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object p0, v0

    .line 26
    goto :goto_1

    .line 27
    :goto_0
    const/4 v0, 0x0

    .line 28
    iput-object v0, v5, Lyyds/ᲀᛱᲀᲈ;->ᛵᛸᛸᛷ:Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    iget-object v0, v5, Lyyds/ᲀᛱᲀᲈ;->ᛲᲈᲁ:[B

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([BB)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lyyds/ᛱᛱᲈᲇ;

    .line 37
    .line 38
    invoke-direct {v0}, Lyyds/ᛱᛱᲈᲇ;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, v5, Lyyds/ᲀᛱᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛱᲈᲇ;

    .line 42
    .line 43
    iput v1, v5, Lyyds/ᲀᛱᲀᲈ;->ᲇᲈᛵᛷ:I

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, v5, Lyyds/ᲀᛱᲀᲈ;->ᛵᛸᛸᛷ:Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 52
    .line 53
    .line 54
    iget-object v0, v5, Lyyds/ᲀᛱᲀᲈ;->ᛵᛸᛸᛷ:Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    monitor-exit p1

    .line 62
    move-object v1, p0

    .line 63
    move v3, p2

    .line 64
    move v4, p3

    .line 65
    move-object v6, p4

    .line 66
    :try_start_1
    invoke-virtual/range {v1 .. v6}, Lyyds/ᛳᲁᛷᛵ;->ᲀᛲᛳᲀ(Ljava/nio/ByteBuffer;IILyyds/ᲀᛱᲀᲈ;Lyyds/ᛴᛳᲀᲈ;)Lyyds/ᛴᲈᲇᛸ;

    .line 67
    .line 68
    .line 69
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    iget-object p1, v1, Lyyds/ᛳᲁᛷᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛵᲈ;

    .line 71
    .line 72
    invoke-virtual {p1, v5}, Lyyds/ᛲᛵᲈ;->ᛲᲈᲁ(Lyyds/ᲀᛱᲀᲈ;)V

    .line 73
    .line 74
    .line 75
    return-object p0

    .line 76
    :catchall_1
    move-exception v0

    .line 77
    move-object p0, v0

    .line 78
    iget-object p1, v1, Lyyds/ᛳᲁᛷᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛵᲈ;

    .line 79
    .line 80
    invoke-virtual {p1, v5}, Lyyds/ᛲᛵᲈ;->ᛲᲈᲁ(Lyyds/ᲀᛱᲀᲈ;)V

    .line 81
    .line 82
    .line 83
    throw p0

    .line 84
    :goto_1
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    throw p0
.end method

.method public final ᲀᛲᛳᲀ(Ljava/nio/ByteBuffer;IILyyds/ᲀᛱᲀᲈ;Lyyds/ᛴᛳᲀᲈ;)Lyyds/ᛴᲈᲇᛸ;
    .locals 14

    .line 1
    const-string v1, "Decoded GIF from stream in "

    .line 2
    .line 3
    const-string v2, "BufferGifDecoder"

    .line 4
    .line 5
    sget v0, Lyyds/ᛶᛷᛷᲇ;->ᛵᛸᛸᛷ:I

    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    const/4 v5, 0x2

    .line 12
    :try_start_0
    invoke-virtual/range {p4 .. p4}, Lyyds/ᲀᛱᲀᲈ;->ᛵᛸᛸᛷ()Lyyds/ᛱᛱᲈᲇ;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v6, v0, Lyyds/ᛱᛱᲈᲇ;->ᲀᛲᛳᲀ:I

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    if-lez v6, :cond_4

    .line 20
    .line 21
    iget v6, v0, Lyyds/ᛱᛱᲈᲇ;->ᛵᛸᛸᛷ:I

    .line 22
    .line 23
    if-eqz v6, :cond_0

    .line 24
    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_0
    sget-object v6, Lyyds/ᛴᛶᛷᲀ;->ᛲᲈᲁ:Lyyds/ᲀᲇᲇᛲ;

    .line 28
    .line 29
    move-object/from16 v8, p5

    .line 30
    .line 31
    invoke-virtual {v8, v6}, Lyyds/ᛴᛳᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᲀᲇᲇᛲ;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    sget-object v8, Lyyds/ᛸᲇᛵᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛸᲇᛵᲁ;

    .line 36
    .line 37
    if-ne v6, v8, :cond_1

    .line 38
    .line 39
    sget-object v6, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 40
    .line 41
    :goto_0
    move/from16 v11, p2

    .line 42
    .line 43
    move/from16 v12, p3

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    move-object p0, v0

    .line 48
    goto/16 :goto_4

    .line 49
    .line 50
    :cond_1
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :goto_1
    invoke-static {v0, v11, v12}, Lyyds/ᛳᲁᛷᛵ;->ᲇᲈᛵᛷ(Lyyds/ᛱᛱᲈᲇ;II)I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    iget-object v9, p0, Lyyds/ᛳᲁᛷᛵ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲈᛶᲈ;

    .line 58
    .line 59
    new-instance v10, Lyyds/ᛷᛶᛵᛵ;

    .line 60
    .line 61
    invoke-direct {v10, v9, v0, p1, v8}, Lyyds/ᛷᛶᛵᛵ;-><init>(Lyyds/ᲀᲈᛶᲈ;Lyyds/ᛱᛱᲈᲇ;Ljava/nio/ByteBuffer;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v10, v6}, Lyyds/ᛷᛶᛵᛵ;->ᲀᛲᛳᲀ(Landroid/graphics/Bitmap$Config;)V

    .line 65
    .line 66
    .line 67
    iget v0, v10, Lyyds/ᛷᛶᛵᛵ;->ᛷᛲᲈᛱ:I

    .line 68
    .line 69
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    iget-object v6, v10, Lyyds/ᛷᛶᛵᛵ;->ᛷᛵᲇᲀ:Lyyds/ᛱᛱᲈᲇ;

    .line 72
    .line 73
    iget v6, v6, Lyyds/ᛱᛱᲈᲇ;->ᲀᛲᛳᲀ:I

    .line 74
    .line 75
    rem-int/2addr v0, v6

    .line 76
    iput v0, v10, Lyyds/ᛷᛶᛵᛵ;->ᛷᛲᲈᛱ:I

    .line 77
    .line 78
    invoke-virtual {v10}, Lyyds/ᛷᛶᛵᛵ;->ᛵᛸᛸᛷ()Landroid/graphics/Bitmap;

    .line 79
    .line 80
    .line 81
    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    if-nez v13, :cond_2

    .line 83
    .line 84
    invoke-static {v2, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-eqz p0, :cond_5

    .line 89
    .line 90
    new-instance p0, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :goto_2
    invoke-static {v3, v4}, Lyyds/ᛶᛷᛷᲇ;->ᛲᲈᲁ(J)D

    .line 96
    .line 97
    .line 98
    move-result-wide v0

    .line 99
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {v2, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    return-object v7

    .line 110
    :cond_2
    :try_start_1
    new-instance v0, Lyyds/ᲇᛱᛴᛲ;

    .line 111
    .line 112
    iget-object p0, p0, Lyyds/ᛳᲁᛷᛵ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 113
    .line 114
    new-instance v6, Lyyds/ᲇᛸᛲᛸ;

    .line 115
    .line 116
    new-instance v8, Lyyds/ᲇᛴᲈᛷ;

    .line 117
    .line 118
    invoke-static {p0}, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᲈᲁ(Landroid/content/Context;)Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    invoke-direct/range {v8 .. v13}, Lyyds/ᲇᛴᲈᛷ;-><init>(Lcom/bumptech/glide/ᛲᲈᲁ;Lyyds/ᛷᛶᛵᛵ;IILandroid/graphics/Bitmap;)V

    .line 123
    .line 124
    .line 125
    invoke-direct {v6, v8}, Lyyds/ᲇᛸᛲᛸ;-><init>(Lyyds/ᲇᛴᲈᛷ;)V

    .line 126
    .line 127
    .line 128
    invoke-direct {v0, v6}, Lyyds/ᲇᛱᛴᛲ;-><init>(Lyyds/ᲇᛸᛲᛸ;)V

    .line 129
    .line 130
    .line 131
    new-instance p0, Lyyds/ᛴᲈᲇᛸ;

    .line 132
    .line 133
    const/4 v6, 0x0

    .line 134
    invoke-direct {p0, v0, v6}, Lyyds/ᛴᲈᲇᛸ;-><init>(Landroid/graphics/drawable/Drawable;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 135
    .line 136
    .line 137
    invoke-static {v2, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_3

    .line 142
    .line 143
    new-instance v0, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v3, v4}, Lyyds/ᛶᛷᛷᲇ;->ᛲᲈᲁ(J)D

    .line 149
    .line 150
    .line 151
    move-result-wide v3

    .line 152
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    :cond_3
    return-object p0

    .line 163
    :cond_4
    :goto_3
    invoke-static {v2, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    if-eqz p0, :cond_5

    .line 168
    .line 169
    new-instance p0, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_5
    return-object v7

    .line 176
    :goto_4
    invoke-static {v2, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_6

    .line 181
    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v3, v4}, Lyyds/ᛶᛷᛷᲇ;->ᛲᲈᲁ(J)D

    .line 188
    .line 189
    .line 190
    move-result-wide v3

    .line 191
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 199
    .line 200
    .line 201
    :cond_6
    throw p0
.end method
