.class public final Lxa0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final f:Lmv1;

.field public static final g:Lmv1;

.field public static final h:Lmv1;

.field public static final i:Lmv1;

.field public static final j:Leb;

.field public static final k:Ljava/util/ArrayDeque;


# instance fields
.field public final a:Lzk;

.field public final b:Landroid/util/DisplayMetrics;

.field public final c:Ltd1;

.field public final d:Ljava/util/ArrayList;

.field public final e:Lds0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat"

    .line 2
    .line 3
    sget-object v1, Ls40;->j:Ls40;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lmv1;->a(Ljava/lang/String;Ljava/lang/Object;)Lmv1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lxa0;->f:Lmv1;

    .line 10
    .line 11
    new-instance v0, Lmv1;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    sget-object v2, Lmv1;->e:Li51;

    .line 15
    .line 16
    const-string v3, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace"

    .line 17
    .line 18
    invoke-direct {v0, v3, v1, v2}, Lmv1;-><init>(Ljava/lang/String;Ljava/lang/Object;Llv1;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lxa0;->g:Lmv1;

    .line 22
    .line 23
    sget-object v0, Lva0;->b:Lva0;

    .line 24
    .line 25
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 26
    .line 27
    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize"

    .line 28
    .line 29
    invoke-static {v1, v0}, Lmv1;->a(Ljava/lang/String;Ljava/lang/Object;)Lmv1;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sput-object v1, Lxa0;->h:Lmv1;

    .line 34
    .line 35
    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode"

    .line 36
    .line 37
    invoke-static {v1, v0}, Lmv1;->a(Ljava/lang/String;Ljava/lang/Object;)Lmv1;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lxa0;->i:Lmv1;

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
    new-instance v0, Leb;

    .line 64
    .line 65
    const/16 v1, 0x11

    .line 66
    .line 67
    invoke-direct {v0, v1}, Leb;-><init>(I)V

    .line 68
    .line 69
    .line 70
    sput-object v0, Lxa0;->j:Leb;

    .line 71
    .line 72
    sget-object v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->JPEG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 73
    .line 74
    sget-object v1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 75
    .line 76
    sget-object v2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 77
    .line 78
    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 83
    .line 84
    .line 85
    sget-object v0, Lb93;->a:[C

    .line 86
    .line 87
    new-instance v0, Ljava/util/ArrayDeque;

    .line 88
    .line 89
    const/4 v1, 0x0

    .line 90
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 91
    .line 92
    .line 93
    sput-object v0, Lxa0;->k:Ljava/util/ArrayDeque;

    .line 94
    .line 95
    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Landroid/util/DisplayMetrics;Lzk;Ltd1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lds0;->a()Lds0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lxa0;->e:Lds0;

    .line 9
    .line 10
    iput-object p1, p0, Lxa0;->d:Ljava/util/ArrayList;

    .line 11
    .line 12
    const-string p1, "Argument must not be null"

    .line 13
    .line 14
    invoke-static {p1, p2}, Lfg1;->q(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lxa0;->b:Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    invoke-static {p1, p3}, Lfg1;->q(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object p3, p0, Lxa0;->a:Lzk;

    .line 23
    .line 24
    invoke-static {p1, p4}, Lfg1;->q(Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object p4, p0, Lxa0;->c:Ltd1;

    .line 28
    .line 29
    return-void
.end method

.method public static c(Lb5;Landroid/graphics/BitmapFactory$Options;Lwa0;Lzk;)Landroid/graphics/Bitmap;
    .locals 9

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
    invoke-interface {p2}, Lwa0;->p()V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lb5;->h:I

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_0
    iget-object v1, p0, Lb5;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ln4;

    .line 19
    .line 20
    iget-object v1, v1, Ln4;->i:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lr62;

    .line 23
    .line 24
    monitor-enter v1

    .line 25
    :try_start_0
    iget-object v2, v1, Lr62;->h:[B

    .line 26
    .line 27
    array-length v2, v2

    .line 28
    iput v2, v1, Lr62;->j:I
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
    sget-object v4, Lp33;->d:Ljava/util/concurrent/locks/Lock;

    .line 42
    .line 43
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 44
    .line 45
    .line 46
    :try_start_2
    invoke-virtual {p0, p1}, Lb5;->o(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

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
    new-instance v5, Ljava/io/IOException;

    .line 56
    .line 57
    const-string v6, "Exception decoding bitmap, outWidth: "

    .line 58
    .line 59
    const-string v7, ", outHeight: "

    .line 60
    .line 61
    const-string v8, ", outMimeType: "

    .line 62
    .line 63
    invoke-static {v6, v1, v2, v7, v8}, Lhk1;->k(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v2, ", inBitmap: "

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v2, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 76
    .line 77
    invoke-static {v2}, Lxa0;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-direct {v5, v1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    const/4 v1, 0x3

    .line 92
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_1

    .line 97
    .line 98
    const-string v1, "Failed to decode with inBitmap, trying again without Bitmap re-use"

    .line 99
    .line 100
    invoke-static {v0, v1, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 101
    .line 102
    .line 103
    :cond_1
    iget-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 104
    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    :try_start_4
    invoke-interface {p3, v0}, Lzk;->h(Landroid/graphics/Bitmap;)V

    .line 108
    .line 109
    .line 110
    const/4 v0, 0x0

    .line 111
    iput-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 112
    .line 113
    invoke-static {p0, p1, p2, p3}, Lxa0;->c(Lb5;Landroid/graphics/BitmapFactory$Options;Lwa0;Lzk;)Landroid/graphics/Bitmap;

    .line 114
    .line 115
    .line 116
    move-result-object p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 117
    sget-object p1, Lp33;->d:Ljava/util/concurrent/locks/Lock;

    .line 118
    .line 119
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 120
    .line 121
    .line 122
    return-object p0

    .line 123
    :catch_1
    :try_start_5
    throw v5

    .line 124
    :cond_2
    throw v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 125
    :catchall_1
    move-exception p0

    .line 126
    sget-object p1, Lp33;->d:Ljava/util/concurrent/locks/Lock;

    .line 127
    .line 128
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 129
    .line 130
    .line 131
    throw p0

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static d(Landroid/graphics/Bitmap;)Ljava/lang/String;
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

.method public static e(Landroid/graphics/BitmapFactory$Options;)V
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


# virtual methods
.method public final a(Lb5;IILov1;Lwa0;)Lal;
    .locals 14

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    iget-object v2, p0, Lxa0;->c:Ltd1;

    .line 4
    .line 5
    const/high16 v3, 0x10000

    .line 6
    .line 7
    const-class v4, [B

    .line 8
    .line 9
    invoke-virtual {v2, v3, v4}, Ltd1;->c(ILjava/lang/Class;)Ljava/lang/Object;

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
    const-class v2, Lxa0;

    .line 17
    .line 18
    monitor-enter v2

    .line 19
    :try_start_0
    sget-object v13, Lxa0;->k:Ljava/util/ArrayDeque;

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
    invoke-static {v3}, Lxa0;->e(Landroid/graphics/BitmapFactory$Options;)V
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
    sget-object v2, Lxa0;->f:Lmv1;

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Lov1;->c(Lmv1;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    move-object v5, v2

    .line 53
    check-cast v5, Ls40;

    .line 54
    .line 55
    sget-object v2, Lxa0;->g:Lmv1;

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Lov1;->c(Lmv1;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    move-object v6, v2

    .line 62
    check-cast v6, Ln22;

    .line 63
    .line 64
    sget-object v2, Lva0;->g:Lmv1;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Lov1;->c(Lmv1;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    move-object v4, v2

    .line 71
    check-cast v4, Lva0;

    .line 72
    .line 73
    sget-object v2, Lxa0;->h:Lmv1;

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Lov1;->c(Lmv1;)Ljava/lang/Object;

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
    sget-object v2, Lxa0;->i:Lmv1;

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Lov1;->c(Lmv1;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    if-eqz v7, :cond_1

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Lov1;->c(Lmv1;)Ljava/lang/Object;

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
    invoke-virtual/range {v1 .. v11}, Lxa0;->b(Lb5;Landroid/graphics/BitmapFactory$Options;Lva0;Ls40;Ln22;ZIIZLwa0;)Landroid/graphics/Bitmap;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iget-object v2, p0, Lxa0;->a:Lzk;

    .line 123
    .line 124
    invoke-static {v2, v0}, Lal;->c(Lzk;Landroid/graphics/Bitmap;)Lal;

    .line 125
    .line 126
    .line 127
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 128
    invoke-static {v3}, Lxa0;->e(Landroid/graphics/BitmapFactory$Options;)V

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
    iget-object v1, p0, Lxa0;->c:Ltd1;

    .line 137
    .line 138
    invoke-virtual {v1, v12}, Ltd1;->g(Ljava/lang/Object;)V

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
    invoke-static {v3}, Lxa0;->e(Landroid/graphics/BitmapFactory$Options;)V

    .line 147
    .line 148
    .line 149
    sget-object v4, Lxa0;->k:Ljava/util/ArrayDeque;

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
    iget-object v1, p0, Lxa0;->c:Ltd1;

    .line 157
    .line 158
    invoke-virtual {v1, v12}, Ltd1;->g(Ljava/lang/Object;)V

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

.method public final b(Lb5;Landroid/graphics/BitmapFactory$Options;Lva0;Ls40;Ln22;ZIIZLwa0;)Landroid/graphics/Bitmap;
    .locals 43

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move/from16 v7, p7

    .line 10
    .line 11
    move/from16 v8, p8

    .line 12
    .line 13
    move-object/from16 v9, p10

    .line 14
    .line 15
    sget v0, Ltc1;->b:I

    .line 16
    .line 17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 18
    .line 19
    .line 20
    move-result-wide v10

    .line 21
    const/4 v12, 0x1

    .line 22
    iput-boolean v12, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 23
    .line 24
    iget-object v13, v1, Lxa0;->a:Lzk;

    .line 25
    .line 26
    invoke-static {v2, v3, v9, v13}, Lxa0;->c(Lb5;Landroid/graphics/BitmapFactory$Options;Lwa0;Lzk;)Landroid/graphics/Bitmap;

    .line 27
    .line 28
    .line 29
    const/4 v14, 0x0

    .line 30
    iput-boolean v14, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 31
    .line 32
    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 33
    .line 34
    iget v15, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 35
    .line 36
    filled-new-array {v0, v15}, [I

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    aget v15, v0, v14

    .line 41
    .line 42
    move/from16 v16, v12

    .line 43
    .line 44
    aget v12, v0, v16

    .line 45
    .line 46
    iget-object v14, v3, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 47
    .line 48
    const/4 v0, -0x1

    .line 49
    if-eq v15, v0, :cond_1

    .line 50
    .line 51
    if-ne v12, v0, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move/from16 v18, p6

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    :goto_0
    const/16 v18, 0x0

    .line 58
    .line 59
    :goto_1
    iget v0, v2, Lb5;->h:I

    .line 60
    .line 61
    const/16 v20, 0x0

    .line 62
    .line 63
    packed-switch v0, :pswitch_data_0

    .line 64
    .line 65
    .line 66
    iget-object v0, v2, Lb5;->j:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Ljava/util/List;

    .line 69
    .line 70
    move-wide/from16 v21, v10

    .line 71
    .line 72
    iget-object v10, v2, Lb5;->k:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v10, Lcom/bumptech/glide/load/data/a;

    .line 75
    .line 76
    iget-object v11, v2, Lb5;->i:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v11, Ltd1;

    .line 79
    .line 80
    move-object/from16 p6, v10

    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    move-object/from16 v23, v14

    .line 87
    .line 88
    const/4 v14, 0x0

    .line 89
    :goto_2
    if-ge v14, v10, :cond_4

    .line 90
    .line 91
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v24

    .line 95
    move-object/from16 v25, v0

    .line 96
    .line 97
    move-object/from16 v0, v24

    .line 98
    .line 99
    check-cast v0, Lkx0;

    .line 100
    .line 101
    move/from16 v24, v10

    .line 102
    .line 103
    :try_start_0
    new-instance v10, Lr62;

    .line 104
    .line 105
    move/from16 v26, v14

    .line 106
    .line 107
    new-instance v14, Ljava/io/FileInputStream;

    .line 108
    .line 109
    invoke-virtual/range {p6 .. p6}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    .line 110
    .line 111
    .line 112
    move-result-object v27

    .line 113
    invoke-virtual/range {v27 .. v27}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    invoke-direct {v14, v6}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 118
    .line 119
    .line 120
    invoke-direct {v10, v14, v11}, Lr62;-><init>(Ljava/io/InputStream;Ltd1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 121
    .line 122
    .line 123
    :try_start_1
    invoke-interface {v0, v10, v11}, Lkx0;->b(Ljava/io/InputStream;Ltd1;)I

    .line 124
    .line 125
    .line 126
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    invoke-virtual {v10}, Lr62;->c()V

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {p6 .. p6}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    .line 131
    .line 132
    .line 133
    const/4 v6, -0x1

    .line 134
    if-eq v0, v6, :cond_2

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_2
    add-int/lit8 v14, v26, 0x1

    .line 138
    .line 139
    move/from16 v10, v24

    .line 140
    .line 141
    move-object/from16 v0, v25

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :catchall_0
    move-exception v0

    .line 145
    move-object/from16 v20, v10

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :catchall_1
    move-exception v0

    .line 149
    :goto_3
    if-eqz v20, :cond_3

    .line 150
    .line 151
    invoke-virtual/range {v20 .. v20}, Lr62;->c()V

    .line 152
    .line 153
    .line 154
    :cond_3
    invoke-virtual/range {p6 .. p6}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    .line 155
    .line 156
    .line 157
    throw v0

    .line 158
    :cond_4
    const/4 v0, -0x1

    .line 159
    :goto_4
    move v6, v0

    .line 160
    goto/16 :goto_7

    .line 161
    .line 162
    :pswitch_0
    move-wide/from16 v21, v10

    .line 163
    .line 164
    move-object/from16 v23, v14

    .line 165
    .line 166
    iget-object v0, v2, Lb5;->k:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Ljava/util/List;

    .line 169
    .line 170
    iget-object v6, v2, Lb5;->i:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v6, Ln4;

    .line 173
    .line 174
    iget-object v6, v6, Ln4;->i:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v6, Lr62;

    .line 177
    .line 178
    invoke-virtual {v6}, Lr62;->reset()V

    .line 179
    .line 180
    .line 181
    iget-object v10, v2, Lb5;->j:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v10, Ltd1;

    .line 184
    .line 185
    invoke-static {v0, v6, v10}, Lse;->E(Ljava/util/List;Ljava/io/InputStream;Ltd1;)I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    goto :goto_4

    .line 190
    :pswitch_1
    move-wide/from16 v21, v10

    .line 191
    .line 192
    move-object/from16 v23, v14

    .line 193
    .line 194
    iget-object v0, v2, Lb5;->j:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v0, Ljava/util/List;

    .line 197
    .line 198
    iget-object v6, v2, Lb5;->i:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 201
    .line 202
    invoke-static {v6}, Llo;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    iget-object v10, v2, Lb5;->k:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v10, Ltd1;

    .line 209
    .line 210
    if-nez v6, :cond_6

    .line 211
    .line 212
    :cond_5
    const/4 v10, -0x1

    .line 213
    goto :goto_6

    .line 214
    :cond_6
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    const/4 v14, 0x0

    .line 219
    :goto_5
    if-ge v14, v11, :cond_5

    .line 220
    .line 221
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v24

    .line 225
    move-object/from16 p6, v0

    .line 226
    .line 227
    move-object/from16 v0, v24

    .line 228
    .line 229
    check-cast v0, Lkx0;

    .line 230
    .line 231
    :try_start_2
    invoke-interface {v0, v6, v10}, Lkx0;->d(Ljava/nio/ByteBuffer;Ltd1;)I

    .line 232
    .line 233
    .line 234
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 235
    move-object/from16 v24, v10

    .line 236
    .line 237
    const/4 v10, 0x0

    .line 238
    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 239
    .line 240
    .line 241
    move-result-object v17

    .line 242
    check-cast v17, Ljava/nio/ByteBuffer;

    .line 243
    .line 244
    const/4 v10, -0x1

    .line 245
    if-eq v0, v10, :cond_7

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_7
    add-int/lit8 v14, v14, 0x1

    .line 249
    .line 250
    move-object/from16 v0, p6

    .line 251
    .line 252
    move-object/from16 v10, v24

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :catchall_2
    move-exception v0

    .line 256
    const/4 v10, 0x0

    .line 257
    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 262
    .line 263
    throw v0

    .line 264
    :goto_6
    move v0, v10

    .line 265
    goto :goto_4

    .line 266
    :goto_7
    const/16 v0, 0x5a

    .line 267
    .line 268
    packed-switch v6, :pswitch_data_1

    .line 269
    .line 270
    .line 271
    const/4 v11, 0x0

    .line 272
    goto :goto_8

    .line 273
    :pswitch_2
    const/16 v11, 0x10e

    .line 274
    .line 275
    goto :goto_8

    .line 276
    :pswitch_3
    move v11, v0

    .line 277
    goto :goto_8

    .line 278
    :pswitch_4
    const/16 v11, 0xb4

    .line 279
    .line 280
    :goto_8
    packed-switch v6, :pswitch_data_2

    .line 281
    .line 282
    .line 283
    const/4 v14, 0x0

    .line 284
    goto :goto_9

    .line 285
    :pswitch_5
    move/from16 v14, v16

    .line 286
    .line 287
    :goto_9
    const/high16 v10, -0x80000000

    .line 288
    .line 289
    if-ne v7, v10, :cond_a

    .line 290
    .line 291
    if-eq v11, v0, :cond_9

    .line 292
    .line 293
    const/16 v0, 0x10e

    .line 294
    .line 295
    if-ne v11, v0, :cond_8

    .line 296
    .line 297
    goto :goto_a

    .line 298
    :cond_8
    move/from16 v24, v6

    .line 299
    .line 300
    move v6, v15

    .line 301
    goto :goto_b

    .line 302
    :cond_9
    const/16 v0, 0x10e

    .line 303
    .line 304
    :goto_a
    move/from16 v24, v6

    .line 305
    .line 306
    move v6, v12

    .line 307
    goto :goto_b

    .line 308
    :cond_a
    const/16 v0, 0x10e

    .line 309
    .line 310
    move/from16 v24, v6

    .line 311
    .line 312
    move v6, v7

    .line 313
    :goto_b
    if-ne v8, v10, :cond_d

    .line 314
    .line 315
    const/16 v10, 0x5a

    .line 316
    .line 317
    if-eq v11, v10, :cond_c

    .line 318
    .line 319
    if-ne v11, v0, :cond_b

    .line 320
    .line 321
    goto :goto_c

    .line 322
    :cond_b
    move v10, v12

    .line 323
    goto :goto_d

    .line 324
    :cond_c
    :goto_c
    move v10, v15

    .line 325
    goto :goto_d

    .line 326
    :cond_d
    move v10, v8

    .line 327
    :goto_d
    invoke-virtual {v2}, Lb5;->s()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    const-string v8, ", target density: "

    .line 332
    .line 333
    const-string v7, ", density: "

    .line 334
    .line 335
    const/high16 v27, 0x3f800000    # 1.0f

    .line 336
    .line 337
    const-string v5, "x"

    .line 338
    .line 339
    move/from16 v28, v14

    .line 340
    .line 341
    const-string v14, "Downsampler"

    .line 342
    .line 343
    const-string v1, "]"

    .line 344
    .line 345
    if-lez v15, :cond_21

    .line 346
    .line 347
    if-gtz v12, :cond_e

    .line 348
    .line 349
    move-object v9, v8

    .line 350
    move-object v8, v1

    .line 351
    move-object v1, v9

    .line 352
    :goto_e
    move v11, v12

    .line 353
    const/4 v9, 0x3

    .line 354
    goto/16 :goto_1b

    .line 355
    .line 356
    :cond_e
    move-object/from16 v19, v1

    .line 357
    .line 358
    const/16 v1, 0x5a

    .line 359
    .line 360
    if-eq v11, v1, :cond_10

    .line 361
    .line 362
    const/16 v1, 0x10e

    .line 363
    .line 364
    if-ne v11, v1, :cond_f

    .line 365
    .line 366
    goto :goto_10

    .line 367
    :cond_f
    move-object/from16 p6, v7

    .line 368
    .line 369
    move v7, v12

    .line 370
    move v1, v15

    .line 371
    :goto_f
    move-object/from16 v29, v8

    .line 372
    .line 373
    goto :goto_11

    .line 374
    :cond_10
    :goto_10
    move-object/from16 p6, v7

    .line 375
    .line 376
    move v1, v12

    .line 377
    move v7, v15

    .line 378
    goto :goto_f

    .line 379
    :goto_11
    invoke-virtual {v4, v1, v7, v6, v10}, Lva0;->b(IIII)F

    .line 380
    .line 381
    .line 382
    move-result v8

    .line 383
    const/16 v30, 0x0

    .line 384
    .line 385
    cmpg-float v30, v8, v30

    .line 386
    .line 387
    if-lez v30, :cond_20

    .line 388
    .line 389
    move/from16 v30, v8

    .line 390
    .line 391
    invoke-virtual {v4, v1, v7, v6, v10}, Lva0;->a(IIII)I

    .line 392
    .line 393
    .line 394
    move-result v8

    .line 395
    if-eqz v8, :cond_1f

    .line 396
    .line 397
    move/from16 v31, v11

    .line 398
    .line 399
    int-to-float v11, v1

    .line 400
    move/from16 v32, v1

    .line 401
    .line 402
    mul-float v1, v30, v11

    .line 403
    .line 404
    move/from16 v19, v11

    .line 405
    .line 406
    move/from16 v33, v12

    .line 407
    .line 408
    float-to-double v11, v1

    .line 409
    const-wide/high16 v34, 0x3fe0000000000000L    # 0.5

    .line 410
    .line 411
    add-double v11, v11, v34

    .line 412
    .line 413
    double-to-int v1, v11

    .line 414
    int-to-float v11, v7

    .line 415
    mul-float v12, v30, v11

    .line 416
    .line 417
    move/from16 v36, v11

    .line 418
    .line 419
    float-to-double v11, v12

    .line 420
    add-double v11, v11, v34

    .line 421
    .line 422
    double-to-int v11, v11

    .line 423
    div-int v1, v32, v1

    .line 424
    .line 425
    div-int v11, v7, v11

    .line 426
    .line 427
    move/from16 v12, v16

    .line 428
    .line 429
    if-ne v8, v12, :cond_11

    .line 430
    .line 431
    invoke-static {v1, v11}, Ljava/lang/Math;->max(II)I

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    goto :goto_12

    .line 436
    :cond_11
    invoke-static {v1, v11}, Ljava/lang/Math;->min(II)I

    .line 437
    .line 438
    .line 439
    move-result v1

    .line 440
    :goto_12
    invoke-static {v1}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    invoke-static {v12, v1}, Ljava/lang/Math;->max(II)I

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    if-ne v8, v12, :cond_12

    .line 449
    .line 450
    int-to-float v8, v1

    .line 451
    div-float v11, v27, v30

    .line 452
    .line 453
    cmpg-float v8, v8, v11

    .line 454
    .line 455
    if-gez v8, :cond_12

    .line 456
    .line 457
    shl-int/lit8 v1, v1, 0x1

    .line 458
    .line 459
    :cond_12
    iput v1, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 460
    .line 461
    sget-object v8, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->JPEG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 462
    .line 463
    if-ne v0, v8, :cond_13

    .line 464
    .line 465
    const/16 v0, 0x8

    .line 466
    .line 467
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 468
    .line 469
    .line 470
    move-result v0

    .line 471
    int-to-float v0, v0

    .line 472
    div-float v11, v19, v0

    .line 473
    .line 474
    float-to-double v7, v11

    .line 475
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 476
    .line 477
    .line 478
    move-result-wide v7

    .line 479
    double-to-int v7, v7

    .line 480
    div-float v11, v36, v0

    .line 481
    .line 482
    float-to-double v11, v11

    .line 483
    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    .line 484
    .line 485
    .line 486
    move-result-wide v11

    .line 487
    double-to-int v0, v11

    .line 488
    div-int/lit8 v8, v1, 0x8

    .line 489
    .line 490
    if-lez v8, :cond_19

    .line 491
    .line 492
    div-int/2addr v7, v8

    .line 493
    div-int/2addr v0, v8

    .line 494
    goto :goto_15

    .line 495
    :cond_13
    sget-object v8, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 496
    .line 497
    if-eq v0, v8, :cond_18

    .line 498
    .line 499
    sget-object v8, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 500
    .line 501
    if-ne v0, v8, :cond_14

    .line 502
    .line 503
    goto :goto_14

    .line 504
    :cond_14
    invoke-virtual {v0}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->isWebp()Z

    .line 505
    .line 506
    .line 507
    move-result v0

    .line 508
    if-eqz v0, :cond_15

    .line 509
    .line 510
    int-to-float v0, v1

    .line 511
    div-float v11, v19, v0

    .line 512
    .line 513
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    .line 514
    .line 515
    .line 516
    move-result v7

    .line 517
    div-float v11, v36, v0

    .line 518
    .line 519
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    .line 520
    .line 521
    .line 522
    move-result v0

    .line 523
    goto :goto_15

    .line 524
    :cond_15
    rem-int v0, v32, v1

    .line 525
    .line 526
    if-nez v0, :cond_16

    .line 527
    .line 528
    rem-int v0, v7, v1

    .line 529
    .line 530
    if-eqz v0, :cond_17

    .line 531
    .line 532
    :cond_16
    const/4 v12, 0x1

    .line 533
    goto :goto_13

    .line 534
    :cond_17
    div-int v0, v32, v1

    .line 535
    .line 536
    div-int/2addr v7, v1

    .line 537
    move/from16 v42, v7

    .line 538
    .line 539
    move v7, v0

    .line 540
    move/from16 v0, v42

    .line 541
    .line 542
    goto :goto_15

    .line 543
    :goto_13
    iput-boolean v12, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 544
    .line 545
    invoke-static {v2, v3, v9, v13}, Lxa0;->c(Lb5;Landroid/graphics/BitmapFactory$Options;Lwa0;Lzk;)Landroid/graphics/Bitmap;

    .line 546
    .line 547
    .line 548
    const/4 v7, 0x0

    .line 549
    iput-boolean v7, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 550
    .line 551
    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 552
    .line 553
    iget v8, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 554
    .line 555
    filled-new-array {v0, v8}, [I

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    aget v8, v0, v7

    .line 560
    .line 561
    aget v0, v0, v12

    .line 562
    .line 563
    move v7, v8

    .line 564
    goto :goto_15

    .line 565
    :cond_18
    :goto_14
    int-to-float v0, v1

    .line 566
    div-float v11, v19, v0

    .line 567
    .line 568
    float-to-double v7, v11

    .line 569
    invoke-static {v7, v8}, Ljava/lang/Math;->floor(D)D

    .line 570
    .line 571
    .line 572
    move-result-wide v7

    .line 573
    double-to-int v7, v7

    .line 574
    div-float v11, v36, v0

    .line 575
    .line 576
    float-to-double v11, v11

    .line 577
    invoke-static {v11, v12}, Ljava/lang/Math;->floor(D)D

    .line 578
    .line 579
    .line 580
    move-result-wide v11

    .line 581
    double-to-int v0, v11

    .line 582
    :cond_19
    :goto_15
    invoke-virtual {v4, v7, v0, v6, v10}, Lva0;->b(IIII)F

    .line 583
    .line 584
    .line 585
    move-result v8

    .line 586
    float-to-double v11, v8

    .line 587
    const-wide/high16 v36, 0x3ff0000000000000L    # 1.0

    .line 588
    .line 589
    cmpg-double v8, v11, v36

    .line 590
    .line 591
    if-gtz v8, :cond_1a

    .line 592
    .line 593
    move-wide/from16 v38, v11

    .line 594
    .line 595
    goto :goto_16

    .line 596
    :cond_1a
    div-double v38, v36, v11

    .line 597
    .line 598
    :goto_16
    const-wide v40, 0x41dfffffffc00000L    # 2.147483647E9

    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    mul-double v38, v38, v40

    .line 604
    .line 605
    move/from16 v19, v8

    .line 606
    .line 607
    invoke-static/range {v38 .. v39}, Ljava/lang/Math;->round(D)J

    .line 608
    .line 609
    .line 610
    move-result-wide v8

    .line 611
    long-to-int v8, v8

    .line 612
    move-wide/from16 v38, v11

    .line 613
    .line 614
    int-to-double v11, v8

    .line 615
    mul-double v11, v11, v38

    .line 616
    .line 617
    add-double v11, v11, v34

    .line 618
    .line 619
    double-to-int v9, v11

    .line 620
    int-to-float v11, v9

    .line 621
    int-to-float v8, v8

    .line 622
    div-float/2addr v11, v8

    .line 623
    float-to-double v11, v11

    .line 624
    div-double v11, v38, v11

    .line 625
    .line 626
    int-to-double v8, v9

    .line 627
    mul-double/2addr v11, v8

    .line 628
    add-double v11, v11, v34

    .line 629
    .line 630
    double-to-int v8, v11

    .line 631
    iput v8, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 632
    .line 633
    if-gtz v19, :cond_1b

    .line 634
    .line 635
    move-wide/from16 v36, v38

    .line 636
    .line 637
    goto :goto_17

    .line 638
    :cond_1b
    div-double v36, v36, v38

    .line 639
    .line 640
    :goto_17
    mul-double v36, v36, v40

    .line 641
    .line 642
    invoke-static/range {v36 .. v37}, Ljava/lang/Math;->round(D)J

    .line 643
    .line 644
    .line 645
    move-result-wide v8

    .line 646
    long-to-int v8, v8

    .line 647
    iput v8, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 648
    .line 649
    iget v9, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 650
    .line 651
    if-lez v9, :cond_1c

    .line 652
    .line 653
    if-lez v8, :cond_1c

    .line 654
    .line 655
    if-eq v9, v8, :cond_1c

    .line 656
    .line 657
    const/4 v12, 0x1

    .line 658
    iput-boolean v12, v3, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 659
    .line 660
    :goto_18
    const/4 v8, 0x2

    .line 661
    goto :goto_19

    .line 662
    :cond_1c
    const/4 v8, 0x0

    .line 663
    iput v8, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 664
    .line 665
    iput v8, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 666
    .line 667
    goto :goto_18

    .line 668
    :goto_19
    invoke-static {v14, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 669
    .line 670
    .line 671
    move-result v9

    .line 672
    if-eqz v9, :cond_1e

    .line 673
    .line 674
    const-string v8, "Calculate scaling, source: ["

    .line 675
    .line 676
    const-string v9, "], degreesToRotate: "

    .line 677
    .line 678
    move/from16 v11, v33

    .line 679
    .line 680
    invoke-static {v8, v15, v11, v5, v9}, Lhk1;->k(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 681
    .line 682
    .line 683
    move-result-object v8

    .line 684
    move/from16 v9, v31

    .line 685
    .line 686
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    const-string v9, ", target: ["

    .line 690
    .line 691
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 692
    .line 693
    .line 694
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 695
    .line 696
    .line 697
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 701
    .line 702
    .line 703
    const-string v9, "], power of two scaled: ["

    .line 704
    .line 705
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 706
    .line 707
    .line 708
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 715
    .line 716
    .line 717
    const-string v0, "], exact scale factor: "

    .line 718
    .line 719
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 720
    .line 721
    .line 722
    move/from16 v0, v30

    .line 723
    .line 724
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 725
    .line 726
    .line 727
    const-string v0, ", power of 2 sample size: "

    .line 728
    .line 729
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 733
    .line 734
    .line 735
    const-string v0, ", adjusted scale factor: "

    .line 736
    .line 737
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 738
    .line 739
    .line 740
    move-wide/from16 v0, v38

    .line 741
    .line 742
    invoke-virtual {v8, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 743
    .line 744
    .line 745
    move-object/from16 v1, v29

    .line 746
    .line 747
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 748
    .line 749
    .line 750
    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 751
    .line 752
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 753
    .line 754
    .line 755
    move-object/from16 v7, p6

    .line 756
    .line 757
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 758
    .line 759
    .line 760
    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 761
    .line 762
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    invoke-static {v14, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 770
    .line 771
    .line 772
    :cond_1d
    :goto_1a
    move-object/from16 v8, p0

    .line 773
    .line 774
    goto/16 :goto_1c

    .line 775
    .line 776
    :cond_1e
    move-object/from16 v7, p6

    .line 777
    .line 778
    move-object/from16 v1, v29

    .line 779
    .line 780
    move/from16 v11, v33

    .line 781
    .line 782
    goto :goto_1a

    .line 783
    :cond_1f
    const-string v0, "Cannot round with null rounding"

    .line 784
    .line 785
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    return-object v20

    .line 789
    :cond_20
    move v0, v8

    .line 790
    move v11, v12

    .line 791
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 792
    .line 793
    new-instance v2, Ljava/lang/StringBuilder;

    .line 794
    .line 795
    const-string v3, "Cannot scale with factor: "

    .line 796
    .line 797
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 801
    .line 802
    .line 803
    const-string v0, " from: "

    .line 804
    .line 805
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 809
    .line 810
    .line 811
    const-string v0, ", source: ["

    .line 812
    .line 813
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 814
    .line 815
    .line 816
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 817
    .line 818
    .line 819
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 820
    .line 821
    .line 822
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 823
    .line 824
    .line 825
    const-string v0, "], target: ["

    .line 826
    .line 827
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 828
    .line 829
    .line 830
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 831
    .line 832
    .line 833
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 834
    .line 835
    .line 836
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 837
    .line 838
    .line 839
    move-object/from16 v8, v19

    .line 840
    .line 841
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 842
    .line 843
    .line 844
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 849
    .line 850
    .line 851
    throw v1

    .line 852
    :cond_21
    move-object v11, v8

    .line 853
    move-object v8, v1

    .line 854
    move-object v1, v11

    .line 855
    goto/16 :goto_e

    .line 856
    .line 857
    :goto_1b
    invoke-static {v14, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 858
    .line 859
    .line 860
    move-result v12

    .line 861
    if-eqz v12, :cond_1d

    .line 862
    .line 863
    new-instance v9, Ljava/lang/StringBuilder;

    .line 864
    .line 865
    const-string v12, "Unable to determine dimensions for: "

    .line 866
    .line 867
    invoke-direct {v9, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 871
    .line 872
    .line 873
    const-string v0, " with target ["

    .line 874
    .line 875
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 876
    .line 877
    .line 878
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 879
    .line 880
    .line 881
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 882
    .line 883
    .line 884
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 885
    .line 886
    .line 887
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    invoke-static {v14, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 895
    .line 896
    .line 897
    goto :goto_1a

    .line 898
    :goto_1c
    iget-object v0, v8, Lxa0;->e:Lds0;

    .line 899
    .line 900
    move/from16 v9, v18

    .line 901
    .line 902
    move/from16 v12, v28

    .line 903
    .line 904
    invoke-virtual {v0, v6, v10, v9, v12}, Lds0;->c(IIZZ)Z

    .line 905
    .line 906
    .line 907
    move-result v0

    .line 908
    if-eqz v0, :cond_22

    .line 909
    .line 910
    sget-object v9, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    .line 911
    .line 912
    iput-object v9, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 913
    .line 914
    const/4 v9, 0x0

    .line 915
    iput-boolean v9, v3, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 916
    .line 917
    goto :goto_1d

    .line 918
    :cond_22
    const/4 v9, 0x0

    .line 919
    :goto_1d
    if-eqz v0, :cond_24

    .line 920
    .line 921
    :cond_23
    const/4 v12, 0x1

    .line 922
    goto :goto_20

    .line 923
    :cond_24
    sget-object v0, Ls40;->h:Ls40;

    .line 924
    .line 925
    move-object/from16 v12, p4

    .line 926
    .line 927
    if-eq v12, v0, :cond_27

    .line 928
    .line 929
    :try_start_3
    invoke-virtual {v2}, Lb5;->s()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    invoke-virtual {v0}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->hasAlpha()Z

    .line 934
    .line 935
    .line 936
    move-result v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 937
    goto :goto_1e

    .line 938
    :catch_0
    move-exception v0

    .line 939
    const/4 v9, 0x3

    .line 940
    invoke-static {v14, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 941
    .line 942
    .line 943
    move-result v18

    .line 944
    if-eqz v18, :cond_25

    .line 945
    .line 946
    new-instance v9, Ljava/lang/StringBuilder;

    .line 947
    .line 948
    const-string v4, "Cannot determine whether the image has alpha or not from header, format "

    .line 949
    .line 950
    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 954
    .line 955
    .line 956
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v4

    .line 960
    invoke-static {v14, v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 961
    .line 962
    .line 963
    :cond_25
    const/4 v0, 0x0

    .line 964
    :goto_1e
    if-eqz v0, :cond_26

    .line 965
    .line 966
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 967
    .line 968
    goto :goto_1f

    .line 969
    :cond_26
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 970
    .line 971
    :goto_1f
    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 972
    .line 973
    sget-object v4, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 974
    .line 975
    if-ne v0, v4, :cond_23

    .line 976
    .line 977
    const/4 v12, 0x1

    .line 978
    iput-boolean v12, v3, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 979
    .line 980
    goto :goto_20

    .line 981
    :cond_27
    const/4 v12, 0x1

    .line 982
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 983
    .line 984
    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 985
    .line 986
    :goto_20
    if-ltz v15, :cond_28

    .line 987
    .line 988
    if-ltz v11, :cond_28

    .line 989
    .line 990
    if-eqz p9, :cond_28

    .line 991
    .line 992
    move v9, v10

    .line 993
    move-object v10, v13

    .line 994
    goto/16 :goto_23

    .line 995
    .line 996
    :cond_28
    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 997
    .line 998
    if-lez v0, :cond_29

    .line 999
    .line 1000
    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1001
    .line 1002
    if-lez v4, :cond_29

    .line 1003
    .line 1004
    if-eq v0, v4, :cond_29

    .line 1005
    .line 1006
    move v10, v12

    .line 1007
    goto :goto_21

    .line 1008
    :cond_29
    const/4 v10, 0x0

    .line 1009
    :goto_21
    if-eqz v10, :cond_2a

    .line 1010
    .line 1011
    int-to-float v0, v0

    .line 1012
    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1013
    .line 1014
    int-to-float v4, v4

    .line 1015
    div-float/2addr v0, v4

    .line 1016
    goto :goto_22

    .line 1017
    :cond_2a
    move/from16 v0, v27

    .line 1018
    .line 1019
    :goto_22
    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1020
    .line 1021
    int-to-float v6, v15

    .line 1022
    int-to-float v9, v4

    .line 1023
    div-float/2addr v6, v9

    .line 1024
    move-object v10, v13

    .line 1025
    float-to-double v12, v6

    .line 1026
    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    .line 1027
    .line 1028
    .line 1029
    move-result-wide v12

    .line 1030
    double-to-int v6, v12

    .line 1031
    int-to-float v12, v11

    .line 1032
    div-float/2addr v12, v9

    .line 1033
    float-to-double v12, v12

    .line 1034
    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    .line 1035
    .line 1036
    .line 1037
    move-result-wide v12

    .line 1038
    double-to-int v9, v12

    .line 1039
    int-to-float v6, v6

    .line 1040
    mul-float/2addr v6, v0

    .line 1041
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 1042
    .line 1043
    .line 1044
    move-result v6

    .line 1045
    int-to-float v9, v9

    .line 1046
    mul-float/2addr v9, v0

    .line 1047
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 1048
    .line 1049
    .line 1050
    move-result v9

    .line 1051
    const/4 v12, 0x2

    .line 1052
    invoke-static {v14, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1053
    .line 1054
    .line 1055
    move-result v13

    .line 1056
    if-eqz v13, :cond_2b

    .line 1057
    .line 1058
    const-string v12, "Calculated target ["

    .line 1059
    .line 1060
    const-string v13, "] for source ["

    .line 1061
    .line 1062
    invoke-static {v12, v6, v9, v5, v13}, Lhk1;->k(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v12

    .line 1066
    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1070
    .line 1071
    .line 1072
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1073
    .line 1074
    .line 1075
    const-string v13, "], sampleSize: "

    .line 1076
    .line 1077
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1081
    .line 1082
    .line 1083
    const-string v4, ", targetDensity: "

    .line 1084
    .line 1085
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1086
    .line 1087
    .line 1088
    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 1089
    .line 1090
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1094
    .line 1095
    .line 1096
    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1097
    .line 1098
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1099
    .line 1100
    .line 1101
    const-string v4, ", density multiplier: "

    .line 1102
    .line 1103
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v0

    .line 1113
    invoke-static {v14, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1114
    .line 1115
    .line 1116
    :cond_2b
    :goto_23
    if-lez v6, :cond_2e

    .line 1117
    .line 1118
    if-lez v9, :cond_2e

    .line 1119
    .line 1120
    iget-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 1121
    .line 1122
    sget-object v4, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    .line 1123
    .line 1124
    if-ne v0, v4, :cond_2c

    .line 1125
    .line 1126
    goto :goto_25

    .line 1127
    :cond_2c
    iget-object v4, v3, Landroid/graphics/BitmapFactory$Options;->outConfig:Landroid/graphics/Bitmap$Config;

    .line 1128
    .line 1129
    if-nez v4, :cond_2d

    .line 1130
    .line 1131
    goto :goto_24

    .line 1132
    :cond_2d
    move-object v0, v4

    .line 1133
    :goto_24
    invoke-interface {v10, v6, v9, v0}, Lzk;->e(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v0

    .line 1137
    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 1138
    .line 1139
    :cond_2e
    :goto_25
    if-eqz p5, :cond_31

    .line 1140
    .line 1141
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1142
    .line 1143
    const/16 v4, 0x1c

    .line 1144
    .line 1145
    if-lt v0, v4, :cond_32

    .line 1146
    .line 1147
    sget-object v0, Ln22;->h:Ln22;

    .line 1148
    .line 1149
    move-object/from16 v6, p5

    .line 1150
    .line 1151
    if-ne v6, v0, :cond_2f

    .line 1152
    .line 1153
    iget-object v0, v3, Landroid/graphics/BitmapFactory$Options;->outColorSpace:Landroid/graphics/ColorSpace;

    .line 1154
    .line 1155
    if-eqz v0, :cond_2f

    .line 1156
    .line 1157
    invoke-virtual {v0}, Landroid/graphics/ColorSpace;->isWideGamut()Z

    .line 1158
    .line 1159
    .line 1160
    move-result v0

    .line 1161
    if-eqz v0, :cond_2f

    .line 1162
    .line 1163
    const/4 v12, 0x1

    .line 1164
    goto :goto_26

    .line 1165
    :cond_2f
    const/4 v12, 0x0

    .line 1166
    :goto_26
    if-eqz v12, :cond_30

    .line 1167
    .line 1168
    sget-object v0, Landroid/graphics/ColorSpace$Named;->DISPLAY_P3:Landroid/graphics/ColorSpace$Named;

    .line 1169
    .line 1170
    goto :goto_27

    .line 1171
    :cond_30
    sget-object v0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    .line 1172
    .line 1173
    :goto_27
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v0

    .line 1177
    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredColorSpace:Landroid/graphics/ColorSpace;

    .line 1178
    .line 1179
    :cond_31
    :goto_28
    move-object/from16 v9, p10

    .line 1180
    .line 1181
    goto :goto_29

    .line 1182
    :cond_32
    sget-object v0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    .line 1183
    .line 1184
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v0

    .line 1188
    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredColorSpace:Landroid/graphics/ColorSpace;

    .line 1189
    .line 1190
    goto :goto_28

    .line 1191
    :goto_29
    invoke-static {v2, v3, v9, v10}, Lxa0;->c(Lb5;Landroid/graphics/BitmapFactory$Options;Lwa0;Lzk;)Landroid/graphics/Bitmap;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v0

    .line 1195
    invoke-interface {v9, v10, v0}, Lwa0;->g(Lzk;Landroid/graphics/Bitmap;)V

    .line 1196
    .line 1197
    .line 1198
    if-eqz v0, :cond_33

    .line 1199
    .line 1200
    if-lez v15, :cond_33

    .line 1201
    .line 1202
    if-lez v11, :cond_33

    .line 1203
    .line 1204
    const-string v2, "GlideMemoryTracking"

    .line 1205
    .line 1206
    const/4 v9, 0x3

    .line 1207
    invoke-static {v2, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1208
    .line 1209
    .line 1210
    move-result v2

    .line 1211
    if-eqz v2, :cond_33

    .line 1212
    .line 1213
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v2

    .line 1217
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v2

    .line 1221
    invoke-static {v14, v2, v0, v15, v11}, Lb93;->j(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;II)V

    .line 1222
    .line 1223
    .line 1224
    :cond_33
    const/4 v12, 0x2

    .line 1225
    invoke-static {v14, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1226
    .line 1227
    .line 1228
    move-result v2

    .line 1229
    if-eqz v2, :cond_34

    .line 1230
    .line 1231
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1232
    .line 1233
    const-string v4, "Decoded "

    .line 1234
    .line 1235
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1236
    .line 1237
    .line 1238
    invoke-static {v0}, Lxa0;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v4

    .line 1242
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1243
    .line 1244
    .line 1245
    const-string v4, " from ["

    .line 1246
    .line 1247
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1248
    .line 1249
    .line 1250
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1254
    .line 1255
    .line 1256
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1257
    .line 1258
    .line 1259
    const-string v4, "] "

    .line 1260
    .line 1261
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1262
    .line 1263
    .line 1264
    move-object/from16 v4, v23

    .line 1265
    .line 1266
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1267
    .line 1268
    .line 1269
    const-string v4, " with inBitmap "

    .line 1270
    .line 1271
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1272
    .line 1273
    .line 1274
    iget-object v4, v3, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 1275
    .line 1276
    invoke-static {v4}, Lxa0;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v4

    .line 1280
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1281
    .line 1282
    .line 1283
    const-string v4, " for ["

    .line 1284
    .line 1285
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1286
    .line 1287
    .line 1288
    move/from16 v4, p7

    .line 1289
    .line 1290
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1291
    .line 1292
    .line 1293
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1294
    .line 1295
    .line 1296
    move/from16 v4, p8

    .line 1297
    .line 1298
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1299
    .line 1300
    .line 1301
    const-string v4, "], sample size: "

    .line 1302
    .line 1303
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1304
    .line 1305
    .line 1306
    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1307
    .line 1308
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1312
    .line 1313
    .line 1314
    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1315
    .line 1316
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1320
    .line 1321
    .line 1322
    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 1323
    .line 1324
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1325
    .line 1326
    .line 1327
    const-string v1, ", thread: "

    .line 1328
    .line 1329
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1330
    .line 1331
    .line 1332
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v1

    .line 1336
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v1

    .line 1340
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1341
    .line 1342
    .line 1343
    const-string v1, ", duration: "

    .line 1344
    .line 1345
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1346
    .line 1347
    .line 1348
    invoke-static/range {v21 .. v22}, Ltc1;->a(J)D

    .line 1349
    .line 1350
    .line 1351
    move-result-wide v3

    .line 1352
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v1

    .line 1359
    invoke-static {v14, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1360
    .line 1361
    .line 1362
    :cond_34
    if-eqz v0, :cond_36

    .line 1363
    .line 1364
    iget-object v1, v8, Lxa0;->b:Landroid/util/DisplayMetrics;

    .line 1365
    .line 1366
    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 1367
    .line 1368
    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 1369
    .line 1370
    .line 1371
    packed-switch v24, :pswitch_data_3

    .line 1372
    .line 1373
    .line 1374
    move-object v1, v0

    .line 1375
    goto :goto_2b

    .line 1376
    :pswitch_6
    new-instance v1, Landroid/graphics/Matrix;

    .line 1377
    .line 1378
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 1379
    .line 1380
    .line 1381
    const/high16 v2, 0x43340000    # 180.0f

    .line 1382
    .line 1383
    const/high16 v3, 0x42b40000    # 90.0f

    .line 1384
    .line 1385
    const/high16 v4, -0x3d4c0000    # -90.0f

    .line 1386
    .line 1387
    const/high16 v5, -0x40800000    # -1.0f

    .line 1388
    .line 1389
    packed-switch v24, :pswitch_data_4

    .line 1390
    .line 1391
    .line 1392
    goto :goto_2a

    .line 1393
    :pswitch_7
    invoke-virtual {v1, v4}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1394
    .line 1395
    .line 1396
    goto :goto_2a

    .line 1397
    :pswitch_8
    invoke-virtual {v1, v4}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1398
    .line 1399
    .line 1400
    move/from16 v4, v27

    .line 1401
    .line 1402
    invoke-virtual {v1, v5, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1403
    .line 1404
    .line 1405
    goto :goto_2a

    .line 1406
    :pswitch_9
    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1407
    .line 1408
    .line 1409
    goto :goto_2a

    .line 1410
    :pswitch_a
    move/from16 v4, v27

    .line 1411
    .line 1412
    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1413
    .line 1414
    .line 1415
    invoke-virtual {v1, v5, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1416
    .line 1417
    .line 1418
    goto :goto_2a

    .line 1419
    :pswitch_b
    move/from16 v4, v27

    .line 1420
    .line 1421
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1422
    .line 1423
    .line 1424
    invoke-virtual {v1, v5, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1425
    .line 1426
    .line 1427
    goto :goto_2a

    .line 1428
    :pswitch_c
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1429
    .line 1430
    .line 1431
    goto :goto_2a

    .line 1432
    :pswitch_d
    move/from16 v4, v27

    .line 1433
    .line 1434
    invoke-virtual {v1, v5, v4}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 1435
    .line 1436
    .line 1437
    :goto_2a
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1438
    .line 1439
    .line 1440
    move-result v2

    .line 1441
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1442
    .line 1443
    .line 1444
    move-result v3

    .line 1445
    const/4 v4, 0x1

    .line 1446
    const/4 v5, 0x0

    .line 1447
    const/4 v6, 0x0

    .line 1448
    move-object/from16 p0, v0

    .line 1449
    .line 1450
    move-object/from16 p5, v1

    .line 1451
    .line 1452
    move/from16 p3, v2

    .line 1453
    .line 1454
    move/from16 p4, v3

    .line 1455
    .line 1456
    move/from16 p6, v4

    .line 1457
    .line 1458
    move/from16 p1, v5

    .line 1459
    .line 1460
    move/from16 p2, v6

    .line 1461
    .line 1462
    invoke-static/range {p0 .. p6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v0

    .line 1466
    move-object/from16 v1, p0

    .line 1467
    .line 1468
    :goto_2b
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1469
    .line 1470
    .line 1471
    move-result v2

    .line 1472
    if-nez v2, :cond_35

    .line 1473
    .line 1474
    invoke-interface {v10, v1}, Lzk;->h(Landroid/graphics/Bitmap;)V

    .line 1475
    .line 1476
    .line 1477
    :cond_35
    move-object/from16 v20, v0

    .line 1478
    .line 1479
    :cond_36
    return-object v20

    .line 1480
    nop

    :pswitch_data_0
    .packed-switch 0xe
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
