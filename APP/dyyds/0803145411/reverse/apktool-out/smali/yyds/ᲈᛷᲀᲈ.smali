.class public final Lyyds/ᲈᛷᲀᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛱᲈᲁ:Lyyds/ᲀᲇᲇᛲ;

.field public static final ᛲᛳᛶᲁ:Lyyds/ᲀᲇᲇᛲ;

.field public static final ᛶᛷᛲᲁ:Lyyds/ᲀᲇᲇᛲ;

.field public static final ᛷᛲᲈᛱ:Ljava/util/ArrayDeque;

.field public static final ᛷᲈᲈᲁ:Lyyds/ᛷᛶᲇᲁ;

.field public static final ᲇᲇᲇᛱ:Lyyds/ᲀᲇᲇᛲ;


# instance fields
.field public final ᛲᛴᛳᛲ:Lyyds/ᛲᲀᛳ;

.field public final ᛲᲈᲁ:Lyyds/ᲈᛱᛸᛴ;

.field public final ᛵᛸᛸᛷ:Landroid/util/DisplayMetrics;

.field public final ᲀᛲᛳᲀ:Lyyds/ᲁᛶᲇᛱ;

.field public final ᲇᲈᛵᛷ:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat"

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛸᲇᛵᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛸᲇᛵᲁ;

    .line 4
    .line 5
    invoke-static {v1, v0}, Lyyds/ᲀᲇᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)Lyyds/ᲀᲇᲇᛲ;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lyyds/ᲈᛷᲀᲈ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲇᲇᛲ;

    .line 10
    .line 11
    new-instance v0, Lyyds/ᲀᲇᲇᛲ;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    sget-object v2, Lyyds/ᲀᲇᲇᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛲᛷᛸ;

    .line 15
    .line 16
    const-string v3, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace"

    .line 17
    .line 18
    invoke-direct {v0, v3, v1, v2}, Lyyds/ᲀᲇᲇᛲ;-><init>(Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛱᛵᲇᲈ;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lyyds/ᲈᛷᲀᲈ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲇᲇᛲ;

    .line 22
    .line 23
    sget-object v0, Lyyds/ᛶᛱᛸᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛶᛱᛸᛳ;

    .line 24
    .line 25
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 26
    .line 27
    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lyyds/ᲀᲇᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)Lyyds/ᲀᲇᲇᛲ;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sput-object v1, Lyyds/ᲈᛷᲀᲈ;->ᛱᲈᲁ:Lyyds/ᲀᲇᲇᛲ;

    .line 34
    .line 35
    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode"

    .line 36
    .line 37
    invoke-static {v0, v1}, Lyyds/ᲀᲇᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)Lyyds/ᲀᲇᲇᛲ;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lyyds/ᲈᛷᲀᲈ;->ᛲᛳᛶᲁ:Lyyds/ᲀᲇᲇᛲ;

    .line 42
    .line 43
    new-instance v0, Ljava/util/HashSet;

    .line 44
    .line 45
    const-string v1, "image/vnd.wap.wbmp"

    .line 46
    .line 47
    const-string v2, "image/x-ico"

    .line 48
    .line 49
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 61
    .line 62
    .line 63
    new-instance v0, Lyyds/ᛷᛶᲇᲁ;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 66
    .line 67
    .line 68
    sput-object v0, Lyyds/ᲈᛷᲀᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛷᛶᲇᲁ;

    .line 69
    .line 70
    sget-object v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->JPEG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 71
    .line 72
    sget-object v1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 73
    .line 74
    sget-object v2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 75
    .line 76
    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 81
    .line 82
    .line 83
    new-instance v0, Ljava/util/ArrayDeque;

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 87
    .line 88
    .line 89
    sput-object v0, Lyyds/ᲈᛷᲀᲈ;->ᛷᛲᲈᛱ:Ljava/util/ArrayDeque;

    .line 90
    .line 91
    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Landroid/util/DisplayMetrics;Lyyds/ᲈᛱᛸᛴ;Lyyds/ᲁᛶᲇᛱ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lyyds/ᛲᲀᛳ;->ᛲᲈᲁ()Lyyds/ᛲᲀᛳ;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lyyds/ᲈᛷᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛲᲀᛳ;

    .line 9
    .line 10
    iput-object p1, p0, Lyyds/ᲈᛷᲀᲈ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 11
    .line 12
    const-string p1, "Argument must not be null"

    .line 13
    .line 14
    invoke-static {p2, p1}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lyyds/ᲈᛷᲀᲈ;->ᛵᛸᛸᛷ:Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    invoke-static {p3, p1}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object p3, p0, Lyyds/ᲈᛷᲀᲈ;->ᛲᲈᲁ:Lyyds/ᲈᛱᛸᛴ;

    .line 23
    .line 24
    invoke-static {p4, p1}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iput-object p4, p0, Lyyds/ᲈᛷᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛶᲇᛱ;

    .line 28
    .line 29
    return-void
.end method

.method public static ᛲᛴᛳᛲ(Ljava/lang/IllegalArgumentException;IILjava/lang/String;Landroid/graphics/BitmapFactory$Options;)Ljava/io/IOException;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/IOException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Exception decoding bitmap, outWidth: "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p1, ", outHeight: "

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p1, ", outMimeType: "

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p1, ", inBitmap: "

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object p1, p4, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 35
    .line 36
    invoke-static {p1}, Lyyds/ᲈᛷᲀᲈ;->ᲇᲈᛵᛷ(Landroid/graphics/Bitmap;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v0, p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method

.method public static ᲀᛲᛳᲀ(Lyyds/ᛳᛷᲀᛴ;Landroid/graphics/BitmapFactory$Options;Lyyds/ᲈᛲᲈᛲ;Lyyds/ᲈᛱᛸᛴ;)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    const-string v0, "Downsampler"

    .line 2
    .line 3
    iget-boolean v1, p1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-interface {p2}, Lyyds/ᲈᛲᲈᛲ;->ᛲᛲᲈᲈ()V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lyyds/ᛳᛷᲀᛴ;->ᲀᛲᛳᲀ:I

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_0
    iget-object v1, p0, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lyyds/ᲀᛵᲁᛴ;

    .line 19
    .line 20
    iget-object v1, v1, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lyyds/ᛴᛴᛸᲈ;

    .line 23
    .line 24
    monitor-enter v1

    .line 25
    :try_start_0
    iget-object v2, v1, Lyyds/ᛴᛴᛸᲈ;->ᲀᛲᛳᲀ:[B

    .line 26
    .line 27
    array-length v2, v2

    .line 28
    iput v2, v1, Lyyds/ᛴᛴᛸᲈ;->ᛲᛴᛳᛲ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    monitor-exit v1

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw p0

    .line 35
    :cond_0
    :goto_0
    :pswitch_1
    iget v1, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 36
    .line 37
    iget v2, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 38
    .line 39
    iget-object v3, p1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 40
    .line 41
    sget-object v4, Lyyds/ᲈᛵᛷᛲ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/locks/Lock;

    .line 42
    .line 43
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 44
    .line 45
    .line 46
    :try_start_2
    invoke-virtual {p0, p1}, Lyyds/ᛳᛷᲀᛴ;->ᛳᲁᲁᲇ(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 47
    .line 48
    .line 49
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 50
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :catch_0
    move-exception v4

    .line 55
    :try_start_3
    invoke-static {v4, v1, v2, v3, p1}, Lyyds/ᲈᛷᲀᲈ;->ᛲᛴᛳᛲ(Ljava/lang/IllegalArgumentException;IILjava/lang/String;Landroid/graphics/BitmapFactory$Options;)Ljava/io/IOException;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const/4 v2, 0x3

    .line 60
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    const-string v2, "Failed to decode with inBitmap, trying again without Bitmap re-use"

    .line 67
    .line 68
    invoke-static {v0, v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    .line 70
    .line 71
    :cond_1
    iget-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 72
    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    :try_start_4
    invoke-interface {p3, v0}, Lyyds/ᲈᛱᛸᛴ;->ᛱᲈᲁ(Landroid/graphics/Bitmap;)V

    .line 76
    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    iput-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 80
    .line 81
    invoke-static {p0, p1, p2, p3}, Lyyds/ᲈᛷᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᛳᛷᲀᛴ;Landroid/graphics/BitmapFactory$Options;Lyyds/ᲈᛲᲈᛲ;Lyyds/ᲈᛱᛸᛴ;)Landroid/graphics/Bitmap;

    .line 82
    .line 83
    .line 84
    move-result-object p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 85
    sget-object p1, Lyyds/ᲈᛵᛷᛲ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/locks/Lock;

    .line 86
    .line 87
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 88
    .line 89
    .line 90
    return-object p0

    .line 91
    :catch_1
    :try_start_5
    throw v1

    .line 92
    :cond_2
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 93
    :catchall_1
    move-exception p0

    .line 94
    sget-object p1, Lyyds/ᲈᛵᛷᛲ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/locks/Lock;

    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 97
    .line 98
    .line 99
    throw p0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ᲇᲇᲇᛱ(Landroid/graphics/BitmapFactory$Options;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 6
    .line 7
    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    iput v2, p0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 11
    .line 12
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 13
    .line 14
    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 15
    .line 16
    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 17
    .line 18
    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 19
    .line 20
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inPreferredColorSpace:Landroid/graphics/ColorSpace;

    .line 21
    .line 22
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->outColorSpace:Landroid/graphics/ColorSpace;

    .line 23
    .line 24
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->outConfig:Landroid/graphics/Bitmap$Config;

    .line 25
    .line 26
    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 27
    .line 28
    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 29
    .line 30
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 31
    .line 32
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 33
    .line 34
    iput-boolean v2, p0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 35
    .line 36
    return-void
.end method

.method public static ᲇᲈᛵᛷ(Landroid/graphics/Bitmap;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, " ("

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ")"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "["

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v2, "x"

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v2, "] "

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method


# virtual methods
.method public final ᛲᲈᲁ(Lyyds/ᛳᛷᲀᛴ;IILyyds/ᛴᛳᲀᲈ;Lyyds/ᲈᛲᲈᛲ;)Lyyds/ᛳᛸᛵᲈ;
    .locals 14

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    iget-object v2, p0, Lyyds/ᲈᛷᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛶᲇᛱ;

    .line 4
    .line 5
    const/high16 v3, 0x10000

    .line 6
    .line 7
    const-class v4, [B

    .line 8
    .line 9
    invoke-virtual {v2, v4, v3}, Lyyds/ᲁᛶᲇᛱ;->ᲀᛲᛳᲀ(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    move-object v12, v2

    .line 14
    check-cast v12, [B

    .line 15
    .line 16
    const-class v2, Lyyds/ᲈᛷᲀᲈ;

    .line 17
    .line 18
    monitor-enter v2

    .line 19
    :try_start_0
    sget-object v13, Lyyds/ᲈᛷᲀᲈ;->ᛷᛲᲈᛱ:Ljava/util/ArrayDeque;

    .line 20
    .line 21
    monitor-enter v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    :try_start_1
    invoke-virtual {v13}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Landroid/graphics/BitmapFactory$Options;

    .line 27
    .line 28
    monitor-exit v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    :try_start_2
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    .line 32
    .line 33
    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-static {v3}, Lyyds/ᲈᛷᲀᲈ;->ᲇᲇᲇᛱ(Landroid/graphics/BitmapFactory$Options;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :cond_0
    :goto_0
    monitor-exit v2

    .line 44
    iput-object v12, v3, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    .line 45
    .line 46
    sget-object v2, Lyyds/ᲈᛷᲀᲈ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲇᲇᛲ;

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Lyyds/ᛴᛳᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᲀᲇᲇᛲ;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    move-object v5, v2

    .line 53
    check-cast v5, Lyyds/ᛸᲇᛵᲁ;

    .line 54
    .line 55
    sget-object v2, Lyyds/ᲈᛷᲀᲈ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲇᲇᛲ;

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Lyyds/ᛴᛳᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᲀᲇᲇᛲ;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    move-object v6, v2

    .line 62
    check-cast v6, Lyyds/ᛸᲇᛱᲁ;

    .line 63
    .line 64
    sget-object v2, Lyyds/ᛶᛱᛸᛳ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲇᲇᛲ;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Lyyds/ᛴᛳᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᲀᲇᲇᛲ;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    move-object v4, v2

    .line 71
    check-cast v4, Lyyds/ᛶᛱᛸᛳ;

    .line 72
    .line 73
    sget-object v2, Lyyds/ᲈᛷᲀᲈ;->ᛱᲈᲁ:Lyyds/ᲀᲇᲇᛲ;

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Lyyds/ᛴᛳᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᲀᲇᲇᛲ;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    sget-object v2, Lyyds/ᲈᛷᲀᲈ;->ᛲᛳᛶᲁ:Lyyds/ᲀᲇᲇᛲ;

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Lyyds/ᛴᛳᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᲀᲇᲇᛲ;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    if-eqz v7, :cond_1

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Lyyds/ᛴᛳᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᲀᲇᲇᛲ;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_1

    .line 104
    .line 105
    const/4 v0, 0x1

    .line 106
    :goto_1
    move-object v1, p0

    .line 107
    move-object v2, p1

    .line 108
    move/from16 v8, p2

    .line 109
    .line 110
    move/from16 v9, p3

    .line 111
    .line 112
    move-object/from16 v11, p5

    .line 113
    .line 114
    move v7, v0

    .line 115
    goto :goto_2

    .line 116
    :cond_1
    const/4 v0, 0x0

    .line 117
    goto :goto_1

    .line 118
    :goto_2
    :try_start_3
    invoke-virtual/range {v1 .. v11}, Lyyds/ᲈᛷᲀᲈ;->ᛵᛸᛸᛷ(Lyyds/ᛳᛷᲀᛴ;Landroid/graphics/BitmapFactory$Options;Lyyds/ᛶᛱᛸᛳ;Lyyds/ᛸᲇᛵᲁ;Lyyds/ᛸᲇᛱᲁ;ZIIZLyyds/ᲈᛲᲈᛲ;)Landroid/graphics/Bitmap;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iget-object v2, p0, Lyyds/ᲈᛷᲀᲈ;->ᛲᲈᲁ:Lyyds/ᲈᛱᛸᛴ;

    .line 123
    .line 124
    invoke-static {v0, v2}, Lyyds/ᛳᛸᛵᲈ;->ᲀᛲᛳᲀ(Landroid/graphics/Bitmap;Lyyds/ᲈᛱᛸᛴ;)Lyyds/ᛳᛸᛵᲈ;

    .line 125
    .line 126
    .line 127
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 128
    invoke-static {v3}, Lyyds/ᲈᛷᲀᲈ;->ᲇᲇᲇᛱ(Landroid/graphics/BitmapFactory$Options;)V

    .line 129
    .line 130
    .line 131
    monitor-enter v13

    .line 132
    :try_start_4
    invoke-virtual {v13, v3}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    monitor-exit v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 136
    iget-object v1, p0, Lyyds/ᲈᛷᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛶᲇᛱ;

    .line 137
    .line 138
    invoke-virtual {v1, v12}, Lyyds/ᲁᛶᲇᛱ;->ᛶᛷᛲᲁ(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return-object v0

    .line 142
    :catchall_1
    move-exception v0

    .line 143
    :try_start_5
    monitor-exit v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 144
    throw v0

    .line 145
    :catchall_2
    move-exception v0

    .line 146
    invoke-static {v3}, Lyyds/ᲈᛷᲀᲈ;->ᲇᲇᲇᛱ(Landroid/graphics/BitmapFactory$Options;)V

    .line 147
    .line 148
    .line 149
    sget-object v4, Lyyds/ᲈᛷᲀᲈ;->ᛷᛲᲈᛱ:Ljava/util/ArrayDeque;

    .line 150
    .line 151
    monitor-enter v4

    .line 152
    :try_start_6
    invoke-virtual {v4, v3}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 156
    iget-object v1, p0, Lyyds/ᲈᛷᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛶᲇᛱ;

    .line 157
    .line 158
    invoke-virtual {v1, v12}, Lyyds/ᲁᛶᲇᛱ;->ᛶᛷᛲᲁ(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    throw v0

    .line 162
    :catchall_3
    move-exception v0

    .line 163
    :try_start_7
    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 164
    throw v0

    .line 165
    :catchall_4
    move-exception v0

    .line 166
    :try_start_8
    monitor-exit v13
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 167
    :try_start_9
    throw v0

    .line 168
    :goto_3
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 169
    throw v0
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᛳᛷᲀᛴ;Landroid/graphics/BitmapFactory$Options;Lyyds/ᛶᛱᛸᛳ;Lyyds/ᛸᲇᛵᲁ;Lyyds/ᛸᲇᛱᲁ;ZIIZLyyds/ᲈᛲᲈᛲ;)Landroid/graphics/Bitmap;
    .locals 43

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p10

    .line 1
    sget v0, Lyyds/ᛶᛷᛷᲇ;->ᛵᛸᛸᛷ:I

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v10

    const/4 v12, 0x1

    .line 3
    iput-boolean v12, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 4
    iget-object v13, v1, Lyyds/ᲈᛷᲀᲈ;->ᛲᲈᲁ:Lyyds/ᲈᛱᛸᛴ;

    invoke-static {v2, v3, v9, v13}, Lyyds/ᲈᛷᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᛳᛷᲀᛴ;Landroid/graphics/BitmapFactory$Options;Lyyds/ᲈᛲᲈᛲ;Lyyds/ᲈᛱᛸᛴ;)Landroid/graphics/Bitmap;

    const/4 v14, 0x0

    .line 5
    iput-boolean v14, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 6
    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v15, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    filled-new-array {v0, v15}, [I

    move-result-object v0

    .line 7
    aget v15, v0, v14

    move/from16 v16, v12

    .line 8
    aget v12, v0, v16

    .line 9
    iget-object v14, v3, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    const/4 v0, -0x1

    if-eq v15, v0, :cond_1

    if-ne v12, v0, :cond_0

    goto :goto_0

    :cond_0
    move/from16 v18, p6

    goto :goto_1

    :cond_1
    :goto_0
    const/16 v18, 0x0

    .line 10
    :goto_1
    iget v0, v2, Lyyds/ᛳᛷᲀᛴ;->ᲀᛲᛳᲀ:I

    const/16 v20, 0x0

    packed-switch v0, :pswitch_data_0

    .line 11
    iget-object v0, v2, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    move-wide/from16 v21, v10

    iget-object v10, v2, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    check-cast v10, Lcom/bumptech/glide/load/data/ᛲᲈᲁ;

    iget-object v11, v2, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    check-cast v11, Lyyds/ᲁᛶᲇᛱ;

    move-object/from16 p6, v10

    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v10

    move-object/from16 v23, v14

    const/4 v14, 0x0

    :goto_2
    if-ge v14, v10, :cond_4

    .line 13
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v24

    move-object/from16 v25, v0

    move-object/from16 v0, v24

    check-cast v0, Lyyds/ᛴᛵᛲᛶ;

    move/from16 v24, v10

    .line 14
    :try_start_0
    new-instance v10, Lyyds/ᛴᛴᛸᲈ;

    move/from16 v26, v14

    new-instance v14, Ljava/io/FileInputStream;

    .line 15
    invoke-virtual/range {p6 .. p6}, Lcom/bumptech/glide/load/data/ᛲᲈᲁ;->ᛲᲈᲁ()Landroid/os/ParcelFileDescriptor;

    move-result-object v27

    invoke-virtual/range {v27 .. v27}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v6

    invoke-direct {v14, v6}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    invoke-direct {v10, v14, v11}, Lyyds/ᛴᛴᛸᲈ;-><init>(Ljava/io/InputStream;Lyyds/ᲁᛶᲇᛱ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    :try_start_1
    invoke-interface {v0, v10, v11}, Lyyds/ᛴᛵᛲᛶ;->ᛲᛴᛳᛲ(Ljava/io/InputStream;Lyyds/ᲁᛶᲇᛱ;)I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    invoke-virtual {v10}, Lyyds/ᛴᛴᛸᲈ;->ᲇᲇᲇᛱ()V

    .line 18
    invoke-virtual/range {p6 .. p6}, Lcom/bumptech/glide/load/data/ᛲᲈᲁ;->ᛲᲈᲁ()Landroid/os/ParcelFileDescriptor;

    const/4 v6, -0x1

    if-eq v0, v6, :cond_2

    goto :goto_4

    :cond_2
    add-int/lit8 v14, v26, 0x1

    move/from16 v10, v24

    move-object/from16 v0, v25

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object/from16 v20, v10

    goto :goto_3

    :catchall_1
    move-exception v0

    :goto_3
    if-eqz v20, :cond_3

    .line 19
    invoke-virtual/range {v20 .. v20}, Lyyds/ᛴᛴᛸᲈ;->ᲇᲇᲇᛱ()V

    .line 20
    :cond_3
    invoke-virtual/range {p6 .. p6}, Lcom/bumptech/glide/load/data/ᛲᲈᲁ;->ᛲᲈᲁ()Landroid/os/ParcelFileDescriptor;

    .line 21
    throw v0

    :cond_4
    const/4 v0, -0x1

    :goto_4
    move v6, v0

    goto/16 :goto_7

    :pswitch_0
    move-wide/from16 v21, v10

    move-object/from16 v23, v14

    .line 22
    iget-object v0, v2, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iget-object v6, v2, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    check-cast v6, Lyyds/ᲀᛵᲁᛴ;

    .line 23
    iget-object v6, v6, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    check-cast v6, Lyyds/ᛴᛴᛸᲈ;

    .line 24
    invoke-virtual {v6}, Lyyds/ᛴᛴᛸᲈ;->reset()V

    .line 25
    iget-object v10, v2, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    check-cast v10, Lyyds/ᲁᛶᲇᛱ;

    .line 26
    invoke-static {v0, v6, v10}, Lyyds/ᛸᛳᛷᛳ;->ᛲᛳᛶᲁ(Ljava/util/ArrayList;Ljava/io/InputStream;Lyyds/ᲁᛶᲇᛱ;)I

    move-result v0

    goto :goto_4

    :pswitch_1
    move-wide/from16 v21, v10

    move-object/from16 v23, v14

    .line 27
    iget-object v0, v2, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iget-object v6, v2, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    check-cast v6, Ljava/nio/ByteBuffer;

    .line 28
    invoke-static {v6}, Lyyds/ᛲᛱᲈᛵ;->ᲀᛲᛳᲀ(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v6

    iget-object v10, v2, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    check-cast v10, Lyyds/ᲁᛶᲇᛱ;

    if-nez v6, :cond_6

    :cond_5
    const/4 v10, -0x1

    goto :goto_6

    .line 29
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v11

    const/4 v14, 0x0

    :goto_5
    if-ge v14, v11, :cond_5

    .line 30
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v24

    move-object/from16 p6, v0

    move-object/from16 v0, v24

    check-cast v0, Lyyds/ᛴᛵᛲᛶ;

    .line 31
    :try_start_2
    invoke-interface {v0, v6, v10}, Lyyds/ᛴᛵᛲᛶ;->ᲇᲈᛵᛷ(Ljava/nio/ByteBuffer;Lyyds/ᲁᛶᲇᛱ;)I

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object/from16 v24, v10

    const/4 v10, 0x0

    .line 32
    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v17

    check-cast v17, Ljava/nio/ByteBuffer;

    const/4 v10, -0x1

    if-eq v0, v10, :cond_7

    goto :goto_4

    :cond_7
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p6

    move-object/from16 v10, v24

    goto :goto_5

    :catchall_2
    move-exception v0

    const/4 v10, 0x0

    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    .line 33
    throw v0

    :goto_6
    move v0, v10

    goto :goto_4

    :goto_7
    const/16 v0, 0x5a

    packed-switch v6, :pswitch_data_1

    const/4 v11, 0x0

    goto :goto_8

    :pswitch_2
    const/16 v11, 0x10e

    goto :goto_8

    :pswitch_3
    move v11, v0

    goto :goto_8

    :pswitch_4
    const/16 v11, 0xb4

    :goto_8
    packed-switch v6, :pswitch_data_2

    const/4 v14, 0x0

    goto :goto_9

    :pswitch_5
    move/from16 v14, v16

    :goto_9
    const/high16 v10, -0x80000000

    if-ne v7, v10, :cond_a

    if-eq v11, v0, :cond_9

    const/16 v0, 0x10e

    if-ne v11, v0, :cond_8

    goto :goto_a

    :cond_8
    move/from16 v24, v6

    move v6, v15

    goto :goto_b

    :cond_9
    const/16 v0, 0x10e

    :goto_a
    move/from16 v24, v6

    move v6, v12

    goto :goto_b

    :cond_a
    const/16 v0, 0x10e

    move/from16 v24, v6

    move v6, v7

    :goto_b
    if-ne v8, v10, :cond_d

    const/16 v10, 0x5a

    if-eq v11, v10, :cond_c

    if-ne v11, v0, :cond_b

    goto :goto_c

    :cond_b
    move v10, v12

    goto :goto_d

    :cond_c
    :goto_c
    move v10, v15

    goto :goto_d

    :cond_d
    move v10, v8

    .line 34
    :goto_d
    invoke-virtual {v2}, Lyyds/ᛳᛷᲀᛴ;->ᛲᛶᛱᲈ()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v0

    .line 35
    const-string v8, ", target density: "

    const-string v7, ", density: "

    const/high16 v27, 0x3f800000    # 1.0f

    const-string v5, "x"

    move/from16 v28, v14

    const-string v14, "Downsampler"

    const-string v1, "]"

    if-lez v15, :cond_e

    if-gtz v12, :cond_f

    :cond_e
    move-object v9, v8

    move-object v8, v1

    move-object v1, v9

    move v9, v12

    const/4 v11, 0x3

    goto/16 :goto_1a

    :cond_f
    move-object/from16 v19, v1

    const/16 v1, 0x5a

    if-eq v11, v1, :cond_11

    const/16 v1, 0x10e

    if-ne v11, v1, :cond_10

    goto :goto_f

    :cond_10
    move-object/from16 p6, v7

    move v7, v12

    move v1, v15

    :goto_e
    move-object/from16 v29, v8

    goto :goto_10

    :cond_11
    :goto_f
    move-object/from16 p6, v7

    move v1, v12

    move v7, v15

    goto :goto_e

    .line 36
    :goto_10
    invoke-virtual {v4, v1, v7, v6, v10}, Lyyds/ᛶᛱᛸᛳ;->ᛵᛸᛸᛷ(IIII)F

    move-result v8

    const/16 v30, 0x0

    cmpg-float v30, v8, v30

    if-lez v30, :cond_21

    move/from16 v30, v8

    .line 37
    invoke-virtual {v4, v1, v7, v6, v10}, Lyyds/ᛶᛱᛸᛳ;->ᛲᲈᲁ(IIII)I

    move-result v8

    if-eqz v8, :cond_20

    move/from16 v31, v11

    int-to-float v11, v1

    move/from16 v32, v1

    mul-float v1, v30, v11

    move/from16 v19, v11

    move/from16 v33, v12

    float-to-double v11, v1

    const-wide/high16 v34, 0x3fe0000000000000L    # 0.5

    add-double v11, v11, v34

    double-to-int v1, v11

    int-to-float v11, v7

    mul-float v12, v30, v11

    move/from16 v36, v11

    float-to-double v11, v12

    add-double v11, v11, v34

    double-to-int v11, v11

    .line 38
    div-int v1, v32, v1

    .line 39
    div-int v11, v7, v11

    move/from16 v12, v16

    if-ne v8, v12, :cond_12

    .line 40
    invoke-static {v1, v11}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_11

    .line 41
    :cond_12
    invoke-static {v1, v11}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 42
    :goto_11
    invoke-static {v1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v1

    invoke-static {v12, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v8, v12, :cond_13

    int-to-float v8, v1

    div-float v11, v27, v30

    cmpg-float v8, v8, v11

    if-gez v8, :cond_13

    shl-int/lit8 v1, v1, 0x1

    .line 43
    :cond_13
    iput v1, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 44
    sget-object v8, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->JPEG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne v0, v8, :cond_14

    const/16 v0, 0x8

    .line 45
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-float v0, v0

    div-float v11, v19, v0

    float-to-double v7, v11

    .line 46
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v7

    double-to-int v7, v7

    div-float v11, v36, v0

    float-to-double v11, v11

    .line 47
    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v11

    double-to-int v0, v11

    .line 48
    div-int/lit8 v8, v1, 0x8

    if-lez v8, :cond_1a

    .line 49
    div-int/2addr v7, v8

    .line 50
    div-int/2addr v0, v8

    goto :goto_14

    .line 51
    :cond_14
    sget-object v8, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-eq v0, v8, :cond_19

    sget-object v8, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne v0, v8, :cond_15

    goto :goto_13

    .line 52
    :cond_15
    invoke-virtual {v0}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->isWebp()Z

    move-result v0

    if-eqz v0, :cond_16

    int-to-float v0, v1

    div-float v11, v19, v0

    .line 53
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    move-result v7

    div-float v11, v36, v0

    .line 54
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    move-result v0

    goto :goto_14

    .line 55
    :cond_16
    rem-int v0, v32, v1

    if-nez v0, :cond_17

    rem-int v0, v7, v1

    if-eqz v0, :cond_18

    :cond_17
    const/4 v12, 0x1

    goto :goto_12

    .line 56
    :cond_18
    div-int v0, v32, v1

    .line 57
    div-int/2addr v7, v1

    move/from16 v42, v7

    move v7, v0

    move/from16 v0, v42

    goto :goto_14

    .line 58
    :goto_12
    iput-boolean v12, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 59
    invoke-static {v2, v3, v9, v13}, Lyyds/ᲈᛷᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᛳᛷᲀᛴ;Landroid/graphics/BitmapFactory$Options;Lyyds/ᲈᛲᲈᛲ;Lyyds/ᲈᛱᛸᛴ;)Landroid/graphics/Bitmap;

    const/4 v7, 0x0

    .line 60
    iput-boolean v7, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 61
    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v8, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    filled-new-array {v0, v8}, [I

    move-result-object v0

    .line 62
    aget v8, v0, v7

    .line 63
    aget v0, v0, v12

    move v7, v8

    goto :goto_14

    :cond_19
    :goto_13
    int-to-float v0, v1

    div-float v11, v19, v0

    float-to-double v7, v11

    .line 64
    invoke-static {v7, v8}, Ljava/lang/Math;->floor(D)D

    move-result-wide v7

    double-to-int v7, v7

    div-float v11, v36, v0

    float-to-double v11, v11

    .line 65
    invoke-static {v11, v12}, Ljava/lang/Math;->floor(D)D

    move-result-wide v11

    double-to-int v0, v11

    .line 66
    :cond_1a
    :goto_14
    invoke-virtual {v4, v7, v0, v6, v10}, Lyyds/ᛶᛱᛸᛳ;->ᛵᛸᛸᛷ(IIII)F

    move-result v8

    float-to-double v11, v8

    const-wide/high16 v36, 0x3ff0000000000000L    # 1.0

    cmpg-double v8, v11, v36

    if-gtz v8, :cond_1b

    move-wide/from16 v38, v11

    goto :goto_15

    :cond_1b
    div-double v38, v36, v11

    :goto_15
    const-wide v40, 0x41dfffffffc00000L    # 2.147483647E9

    mul-double v38, v38, v40

    move/from16 v19, v8

    .line 67
    invoke-static/range {v38 .. v39}, Ljava/lang/Math;->round(D)J

    move-result-wide v8

    long-to-int v8, v8

    move-wide/from16 v38, v11

    int-to-double v11, v8

    mul-double v11, v11, v38

    add-double v11, v11, v34

    double-to-int v9, v11

    int-to-float v11, v9

    int-to-float v8, v8

    div-float/2addr v11, v8

    float-to-double v11, v11

    div-double v11, v38, v11

    int-to-double v8, v9

    mul-double/2addr v11, v8

    add-double v11, v11, v34

    double-to-int v8, v11

    .line 68
    iput v8, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    if-gtz v19, :cond_1c

    move-wide/from16 v36, v38

    goto :goto_16

    :cond_1c
    div-double v36, v36, v38

    :goto_16
    mul-double v36, v36, v40

    .line 69
    invoke-static/range {v36 .. v37}, Ljava/lang/Math;->round(D)J

    move-result-wide v8

    long-to-int v8, v8

    .line 70
    iput v8, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 71
    iget v9, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    if-lez v9, :cond_1d

    if-lez v8, :cond_1d

    if-eq v9, v8, :cond_1d

    const/4 v12, 0x1

    .line 72
    iput-boolean v12, v3, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    :goto_17
    const/4 v8, 0x2

    goto :goto_18

    :cond_1d
    const/4 v8, 0x0

    .line 73
    iput v8, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    iput v8, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    goto :goto_17

    .line 74
    :goto_18
    invoke-static {v14, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_1f

    .line 75
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Calculate scaling, source: ["

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v9, v33

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, "], degreesToRotate: "

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v11, v31

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, ", target: ["

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, "], power of two scaled: ["

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "], exact scale factor: "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v0, v30

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", power of 2 sample size: "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", adjusted scale factor: "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v0, v38

    invoke-virtual {v8, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-object/from16 v1, v29

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v7, p6

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1e
    :goto_19
    move-object/from16 v8, p0

    goto/16 :goto_1b

    :cond_1f
    move-object/from16 v7, p6

    move-object/from16 v1, v29

    move/from16 v9, v33

    goto :goto_19

    .line 76
    :cond_20
    const-string v0, "Cannot round with null rounding"

    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    return-object v20

    :cond_21
    move v0, v8

    move v9, v12

    .line 77
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot scale with factor: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " from: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", source: ["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "], target: ["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v8, v19

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 78
    :goto_1a
    invoke-static {v14, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v12

    if-eqz v12, :cond_1e

    .line 79
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "Unable to determine dimensions for: "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " with target ["

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_19

    .line 80
    :goto_1b
    iget-object v0, v8, Lyyds/ᲈᛷᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛲᲀᛳ;

    move/from16 v11, v18

    move/from16 v12, v28

    .line 81
    invoke-virtual {v0, v6, v10, v11, v12}, Lyyds/ᛲᲀᛳ;->ᛵᛸᛸᛷ(IIZZ)Z

    move-result v0

    if-eqz v0, :cond_22

    .line 82
    sget-object v11, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    iput-object v11, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    const/4 v11, 0x0

    .line 83
    iput-boolean v11, v3, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    goto :goto_1c

    :cond_22
    const/4 v11, 0x0

    :goto_1c
    if-eqz v0, :cond_23

    goto :goto_1f

    .line 84
    :cond_23
    sget-object v0, Lyyds/ᛸᲇᛵᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲇᛵᲁ;

    move-object/from16 v12, p4

    if-eq v12, v0, :cond_26

    .line 85
    :try_start_3
    invoke-virtual {v2}, Lyyds/ᛳᛷᲀᛴ;->ᛲᛶᛱᲈ()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->hasAlpha()Z

    move-result v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1d

    :catch_0
    move-exception v0

    const/4 v11, 0x3

    .line 86
    invoke-static {v14, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v18

    if-eqz v18, :cond_24

    .line 87
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v4, "Cannot determine whether the image has alpha or not from header, format "

    invoke-direct {v11, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v14, v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_24
    const/4 v0, 0x0

    :goto_1d
    if-eqz v0, :cond_25

    .line 88
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_1e

    :cond_25
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    :goto_1e
    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 89
    sget-object v4, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    if-ne v0, v4, :cond_27

    const/4 v12, 0x1

    .line 90
    iput-boolean v12, v3, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    goto :goto_1f

    .line 91
    :cond_26
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    :cond_27
    :goto_1f
    if-ltz v15, :cond_28

    if-ltz v9, :cond_28

    if-eqz p9, :cond_28

    goto/16 :goto_21

    .line 92
    :cond_28
    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    if-lez v0, :cond_29

    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    if-lez v4, :cond_29

    if-eq v0, v4, :cond_29

    int-to-float v0, v0

    int-to-float v4, v4

    div-float/2addr v0, v4

    goto :goto_20

    :cond_29
    move/from16 v0, v27

    .line 93
    :goto_20
    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    int-to-float v6, v15

    int-to-float v10, v4

    div-float/2addr v6, v10

    float-to-double v11, v6

    .line 94
    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v11

    double-to-int v6, v11

    int-to-float v11, v9

    div-float/2addr v11, v10

    float-to-double v10, v11

    .line 95
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-int v10, v10

    int-to-float v6, v6

    mul-float/2addr v6, v0

    .line 96
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    int-to-float v10, v10

    mul-float/2addr v10, v0

    .line 97
    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    move-result v10

    const/4 v11, 0x2

    .line 98
    invoke-static {v14, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v12

    if-eqz v12, :cond_2a

    .line 99
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "Calculated target ["

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v12, "] for source ["

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v12, "], sampleSize: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", targetDensity: "

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", density multiplier: "

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2a
    :goto_21
    if-lez v6, :cond_2d

    if-lez v10, :cond_2d

    .line 100
    iget-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    sget-object v4, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-ne v0, v4, :cond_2b

    goto :goto_23

    .line 101
    :cond_2b
    iget-object v4, v3, Landroid/graphics/BitmapFactory$Options;->outConfig:Landroid/graphics/Bitmap$Config;

    if-nez v4, :cond_2c

    goto :goto_22

    :cond_2c
    move-object v0, v4

    .line 102
    :goto_22
    invoke-interface {v13, v6, v10, v0}, Lyyds/ᲈᛱᛸᛴ;->ᲇᲇᲇᛱ(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    :cond_2d
    :goto_23
    if-eqz p5, :cond_2f

    .line 103
    sget-object v0, Lyyds/ᛸᲇᛱᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲇᛱᲁ;

    move-object/from16 v6, p5

    if-ne v6, v0, :cond_2e

    iget-object v0, v3, Landroid/graphics/BitmapFactory$Options;->outColorSpace:Landroid/graphics/ColorSpace;

    if-eqz v0, :cond_2e

    .line 104
    invoke-virtual {v0}, Landroid/graphics/ColorSpace;->isWideGamut()Z

    move-result v0

    if-eqz v0, :cond_2e

    .line 105
    sget-object v0, Landroid/graphics/ColorSpace$Named;->DISPLAY_P3:Landroid/graphics/ColorSpace$Named;

    goto :goto_24

    :cond_2e
    sget-object v0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    :goto_24
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredColorSpace:Landroid/graphics/ColorSpace;

    :cond_2f
    move-object/from16 v4, p10

    .line 106
    invoke-static {v2, v3, v4, v13}, Lyyds/ᲈᛷᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᛳᛷᲀᛴ;Landroid/graphics/BitmapFactory$Options;Lyyds/ᲈᛲᲈᛲ;Lyyds/ᲈᛱᛸᛴ;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 107
    invoke-interface {v4, v0, v13}, Lyyds/ᲈᛲᲈᛲ;->ᲇᲇᲇᛱ(Landroid/graphics/Bitmap;Lyyds/ᲈᛱᛸᛴ;)V

    if-eqz v0, :cond_30

    if-lez v15, :cond_30

    if-lez v9, :cond_30

    .line 108
    const-string v2, "GlideMemoryTracking"

    const/4 v11, 0x3

    invoke-static {v2, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_30

    .line 109
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    .line 110
    invoke-static {v14, v2, v0, v15, v9}, Lyyds/ᛱᛷᲈᛲ;->ᛱᛳᲇ(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;II)V

    :cond_30
    const/4 v11, 0x2

    .line 111
    invoke-static {v14, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_31

    .line 112
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Decoded "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    invoke-static {v0}, Lyyds/ᲈᛷᲀᲈ;->ᲇᲈᛵᛷ(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " from ["

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "] "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v4, v23

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " with inBitmap "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    iget-object v4, v3, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    invoke-static {v4}, Lyyds/ᲈᛷᲀᲈ;->ᲇᲈᛵᛷ(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v4

    .line 115
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " for ["

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v4, p7

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v4, p8

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "], sample size: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", thread: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", duration: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    invoke-static/range {v21 .. v22}, Lyyds/ᛶᛷᛷᲇ;->ᛲᲈᲁ(J)D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 118
    invoke-static {v14, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_31
    if-eqz v0, :cond_33

    .line 119
    iget-object v1, v8, Lyyds/ᲈᛷᲀᲈ;->ᛵᛸᛸᛷ:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->setDensity(I)V

    packed-switch v24, :pswitch_data_3

    move-object v1, v0

    goto :goto_26

    .line 120
    :pswitch_6
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    const/high16 v2, 0x43340000    # 180.0f

    const/high16 v3, 0x42b40000    # 90.0f

    const/high16 v4, -0x3d4c0000    # -90.0f

    const/high16 v5, -0x40800000    # -1.0f

    packed-switch v24, :pswitch_data_4

    goto :goto_25

    .line 121
    :pswitch_7
    invoke-virtual {v1, v4}, Landroid/graphics/Matrix;->setRotate(F)V

    goto :goto_25

    .line 122
    :pswitch_8
    invoke-virtual {v1, v4}, Landroid/graphics/Matrix;->setRotate(F)V

    move/from16 v4, v27

    .line 123
    invoke-virtual {v1, v5, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_25

    .line 124
    :pswitch_9
    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->setRotate(F)V

    goto :goto_25

    :pswitch_a
    move/from16 v4, v27

    .line 125
    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 126
    invoke-virtual {v1, v5, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_25

    :pswitch_b
    move/from16 v4, v27

    .line 127
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 128
    invoke-virtual {v1, v5, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_25

    .line 129
    :pswitch_c
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    goto :goto_25

    :pswitch_d
    move/from16 v4, v27

    .line 130
    invoke-virtual {v1, v5, v4}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 131
    :goto_25
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    .line 132
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 p0, v0

    move-object/from16 p5, v1

    move/from16 p3, v2

    move/from16 p4, v3

    move/from16 p6, v4

    move/from16 p1, v5

    move/from16 p2, v6

    .line 133
    invoke-static/range {p0 .. p6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object/from16 v1, p0

    .line 134
    :goto_26
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_32

    .line 135
    invoke-interface {v13, v1}, Lyyds/ᲈᛱᛸᛴ;->ᛱᲈᲁ(Landroid/graphics/Bitmap;)V

    :cond_32
    move-object/from16 v20, v0

    :cond_33
    return-object v20

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x2
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch
.end method
