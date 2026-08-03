.class public final LVD;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lsw;


# static fields
.field public static final d:Lut;

.field public static final e:Lut;

.field public static final f:Lhw;

.field public static final g:Ljava/util/List;


# instance fields
.field public final a:Lhw;

.field public final b:LN5;

.field public final c:Lhw;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-wide/16 v0, -0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lq6;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lq6;-><init>(I)V

    new-instance v2, Lut;

    const-string v3, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame"

    invoke-direct {v2, v3, v0, v1}, Lut;-><init>(Ljava/lang/String;Ljava/lang/Object;Ltt;)V

    sput-object v2, LVD;->d:Lut;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lq6;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lq6;-><init>(I)V

    new-instance v2, Lut;

    const-string v3, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption"

    invoke-direct {v2, v3, v0, v1}, Lut;-><init>(Ljava/lang/String;Ljava/lang/Object;Ltt;)V

    sput-object v2, LVD;->e:Lut;

    new-instance v0, Lhw;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lhw;-><init>(I)V

    sput-object v0, LVD;->f:Lhw;

    const-string v0, "TP1A"

    const-string v1, "TD1A.220804.031"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LVD;->g:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(LN5;Lhw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVD;->b:LN5;

    iput-object p2, p0, LVD;->a:Lhw;

    sget-object p1, LVD;->f:Lhw;

    iput-object p1, p0, LVD;->c:Lhw;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILvt;)Lpw;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p4

    sget-object v2, LVD;->d:Lut;

    invoke-virtual {v0, v2}, Lvt;->c(Lut;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    const-wide/16 v2, 0x0

    cmp-long v2, v4, v2

    if-gez v2, :cond_1

    const-wide/16 v2, -0x1

    cmp-long v2, v4, v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    sget-object v2, LVD;->e:Lut;

    invoke-virtual {v0, v2}, Lvt;->c(Lut;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_2

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_2
    sget-object v3, Lre;->g:Lut;

    invoke-virtual {v0, v3}, Lvt;->c(Lut;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lre;

    if-nez v0, :cond_3

    sget-object v0, Lre;->f:Lre;

    :cond_3
    move-object v9, v0

    iget-object v0, v1, LVD;->c:Lhw;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v3}, Landroid/media/MediaMetadataRetriever;-><init>()V

    const/16 v16, 0x1

    const-wide/16 v6, 0x1

    const/16 v17, 0x0

    const/16 v8, 0x1d

    :try_start_0
    iget-object v0, v1, LVD;->a:Lhw;

    iget v0, v0, Lhw;->a:I

    packed-switch v0, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, Landroid/os/ParcelFileDescriptor;

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;)V

    goto :goto_1

    :pswitch_0
    move-object/from16 v0, p1

    check-cast v0, Ljava/nio/ByteBuffer;

    new-instance v10, LUD;

    invoke-direct {v10, v0}, LUD;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v3, v10}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V

    goto :goto_1

    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v11

    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v12

    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object v10, v3

    :try_start_1
    invoke-virtual/range {v10 .. v15}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;JJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object v3, v10

    :goto_1
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object/from16 v2, p1

    move-wide v10, v6

    move v12, v8

    move/from16 v7, p2

    move/from16 v8, p3

    move v6, v0

    :try_start_3
    invoke-virtual/range {v1 .. v9}, LVD;->c(Ljava/lang/Object;Landroid/media/MediaMetadataRetriever;JIIILre;)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v12, :cond_9

    instance-of v2, v3, Ljava/lang/AutoCloseable;

    if-eqz v2, :cond_4

    check-cast v3, Ljava/lang/AutoCloseable;

    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    goto :goto_3

    :cond_4
    instance-of v2, v3, Ljava/util/concurrent/ExecutorService;

    if-eqz v2, :cond_8

    check-cast v3, Ljava/util/concurrent/ExecutorService;

    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    move-result-object v2

    if-ne v3, v2, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    move-result v2

    if-nez v2, :cond_a

    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    :cond_6
    :goto_2
    if-nez v2, :cond_7

    :try_start_4
    sget-object v4, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v3, v10, v11, v4}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v2
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_2

    :catch_0
    if-nez v17, :cond_6

    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    move/from16 v17, v16

    goto :goto_2

    :cond_7
    if-eqz v17, :cond_a

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    goto :goto_3

    :cond_8
    invoke-virtual {v3}, Landroid/media/MediaMetadataRetriever;->release()V

    goto :goto_3

    :cond_9
    invoke-virtual {v3}, Landroid/media/MediaMetadataRetriever;->release()V

    :cond_a
    :goto_3
    iget-object v2, v1, LVD;->b:LN5;

    invoke-static {v2, v0}, LO5;->c(LN5;Landroid/graphics/Bitmap;)LO5;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_4

    :catchall_1
    move-exception v0

    move-wide v10, v6

    move v12, v8

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object v3, v10

    move v12, v8

    move-wide v10, v6

    :goto_4
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v12, :cond_f

    instance-of v2, v3, Ljava/lang/AutoCloseable;

    if-nez v2, :cond_e

    instance-of v2, v3, Ljava/util/concurrent/ExecutorService;

    if-eqz v2, :cond_d

    check-cast v3, Ljava/util/concurrent/ExecutorService;

    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    move-result-object v2

    if-eq v3, v2, :cond_10

    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    move-result v2

    if-nez v2, :cond_10

    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    :cond_b
    :goto_5
    if-nez v2, :cond_c

    :try_start_5
    sget-object v4, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v3, v10, v11, v4}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v2
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_5

    :catch_1
    if-nez v17, :cond_b

    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    move/from16 v17, v16

    goto :goto_5

    :cond_c
    if-eqz v17, :cond_10

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    goto :goto_6

    :cond_d
    invoke-virtual {v3}, Landroid/media/MediaMetadataRetriever;->release()V

    goto :goto_6

    :cond_e
    check-cast v3, Ljava/lang/AutoCloseable;

    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    goto :goto_6

    :cond_f
    invoke-virtual {v3}, Landroid/media/MediaMetadataRetriever;->release()V

    :cond_10
    :goto_6
    throw v0

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;Lvt;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final c(Ljava/lang/Object;Landroid/media/MediaMetadataRetriever;JIIILre;)Landroid/graphics/Bitmap;
    .locals 14

    move-object/from16 v0, p2

    move/from16 v1, p6

    move/from16 v2, p7

    move-object/from16 v3, p8

    sget-object v4, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const/4 v6, 0x0

    if-eqz v4, :cond_3

    const-string v5, ".+_cheets|cheets_.+"

    invoke-virtual {v4, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0xc

    :try_start_0
    invoke-virtual {v0, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "video/webm"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_3

    :cond_0
    new-instance v7, Landroid/media/MediaExtractor;

    invoke-direct {v7}, Landroid/media/MediaExtractor;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v4, p0, LVD;->a:Lhw;

    iget v4, v4, Lhw;->a:I

    packed-switch v4, :pswitch_data_0

    check-cast p1, Landroid/os/ParcelFileDescriptor;

    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object p1

    invoke-virtual {v7, p1}, Landroid/media/MediaExtractor;->setDataSource(Ljava/io/FileDescriptor;)V

    goto :goto_0

    :pswitch_0
    check-cast p1, Ljava/nio/ByteBuffer;

    new-instance v4, LUD;

    invoke-direct {v4, p1}, LUD;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v7, v4}, Landroid/media/MediaExtractor;->setDataSource(Landroid/media/MediaDataSource;)V

    goto :goto_0

    :pswitch_1
    check-cast p1, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v8

    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v9

    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v11

    invoke-virtual/range {v7 .. v12}, Landroid/media/MediaExtractor;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    :goto_0
    invoke-virtual {v7}, Landroid/media/MediaExtractor;->getTrackCount()I

    move-result p1

    const/4 v4, 0x0

    :goto_1
    if-ge v4, p1, :cond_2

    invoke-virtual {v7, v4}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    move-result-object v5

    const-string v8, "mime"

    invoke-virtual {v5, v8}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v8, "video/x-vnd.on2.vp8"

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v5, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Landroid/media/MediaExtractor;->release()V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot decode VP8 video on CrOS."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_2
    invoke-virtual {v7}, Landroid/media/MediaExtractor;->release()V

    goto :goto_3

    :catchall_0
    move-object v7, v6

    :catchall_1
    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    :goto_3
    const/16 p1, 0x18

    const/high16 v4, -0x80000000

    if-eq v1, v4, :cond_6

    if-eq v2, v4, :cond_6

    sget-object v4, Lre;->e:Lre;

    if-eq v3, v4, :cond_6

    const/16 v4, 0x12

    :try_start_2
    invoke-virtual {v0, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x13

    invoke-virtual {v0, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v0, p1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    const/16 v8, 0x5a

    if-eq v7, v8, :cond_4

    const/16 v8, 0x10e

    if-ne v7, v8, :cond_5

    :cond_4
    move v13, v5

    move v5, v4

    move v4, v13

    :cond_5
    invoke-virtual {v3, v4, v5, v1, v2}, Lre;->b(IIII)F

    move-result v1

    int-to-float v2, v4

    mul-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v4

    int-to-float v2, v5

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v5

    move-wide/from16 v1, p3

    move/from16 v3, p5

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaMetadataRetriever;->getScaledFrameAtTime(JIII)Landroid/graphics/Bitmap;

    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    :cond_6
    if-nez v6, :cond_7

    invoke-virtual/range {p2 .. p5}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    move-result-object v6

    :cond_7
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "Pixel"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/16 v2, 0x21

    if-eqz v1, :cond_9

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ne v1, v2, :cond_9

    sget-object v1, LVD;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, Landroid/os/Build;->ID:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    if-lt v1, v3, :cond_b

    if-ge v1, v2, :cond_b

    :goto_4
    const/16 v1, 0x24

    :try_start_3
    invoke-virtual {v0, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x23

    invoke-virtual {v0, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x7

    const/4 v4, 0x6

    if-eq v1, v3, :cond_a

    if-ne v1, v4, :cond_b

    :cond_a
    if-ne v2, v4, :cond_b

    invoke-virtual {v0, p1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0

    const/16 v0, 0xb4

    if-ne p1, v0, :cond_b

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v1

    const/high16 v1, 0x43340000    # 180.0f

    invoke-virtual {p1, v1, v0, v2}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 p7, p1

    move/from16 p5, v0

    move/from16 p6, v1

    move/from16 p8, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move-object/from16 p2, v6

    invoke-static/range {p2 .. p8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v6

    :catch_0
    :cond_b
    if-eqz v6, :cond_c

    return-object v6

    :cond_c
    new-instance p1, LFa;

    const-string v0, "MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
