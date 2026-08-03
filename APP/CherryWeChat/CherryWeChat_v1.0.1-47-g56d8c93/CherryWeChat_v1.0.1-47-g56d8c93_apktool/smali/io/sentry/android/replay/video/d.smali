.class public final Lio/sentry/android/replay/video/d;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lio/sentry/v2;

.field public final b:Lio/sentry/android/replay/video/a;

.field public final c:Ljava/lang/Object;

.field public final d:Landroid/media/MediaCodec;

.field public final e:Ljava/lang/Object;

.field public final f:Landroid/media/MediaCodec$BufferInfo;

.field public final g:Lio/sentry/android/replay/video/b;

.field public h:Landroid/view/Surface;


# direct methods
.method public constructor <init>(Lio/sentry/v2;Lio/sentry/android/replay/video/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->a:Lio/sentry/v2;

    iput-object p2, p0, Lio/sentry/android/replay/video/d;->b:Lio/sentry/android/replay/video/a;

    sget-object p1, Lio/sentry/android/replay/video/c;->b:Lio/sentry/android/replay/video/c;

    const/4 v0, 0x3

    invoke-static {v0, p1}, LDc;->n(ILUi;)LDn;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    invoke-interface {p1}, LDn;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "c2.android.avc.encoder"

    invoke-static {p1}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "video/avc"

    invoke-static {p1}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lio/sentry/android/replay/video/d;->d:Landroid/media/MediaCodec;

    new-instance p1, Lz9;

    const/4 v1, 0x6

    invoke-direct {p1, v1, p0}, Lz9;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, p1}, LDc;->n(ILUi;)LDn;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    new-instance p1, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {p1}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->f:Landroid/media/MediaCodec$BufferInfo;

    new-instance p1, Lio/sentry/android/replay/video/b;

    iget-object v0, p2, Lio/sentry/android/replay/video/a;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iget p2, p2, Lio/sentry/android/replay/video/a;->d:I

    int-to-float p2, p2

    invoke-direct {p1, v0, p2}, Lio/sentry/android/replay/video/b;-><init>(Ljava/lang/String;F)V

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->g:Lio/sentry/android/replay/video/b;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 12

    iget-object v0, p0, Lio/sentry/android/replay/video/d;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v1

    iget-boolean v1, v1, Lio/sentry/z2;->l:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v3, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[Encoder]: drainCodec("

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v5, 0x29

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v2, [Ljava/lang/Object;

    invoke-interface {v1, v3, v4, v5}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v1, p0, Lio/sentry/android/replay/video/d;->d:Landroid/media/MediaCodec;

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v3

    iget-boolean v3, v3, Lio/sentry/z2;->l:Z

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v5, "[Encoder]: sending EOS to encoder"

    new-array v6, v2, [Ljava/lang/Object;

    invoke-interface {v3, v4, v5, v6}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v1}, Landroid/media/MediaCodec;->signalEndOfInputStream()V

    :cond_2
    invoke-virtual {v1}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v3

    :cond_3
    :goto_0
    const-wide/32 v4, 0x186a0

    iget-object v6, p0, Lio/sentry/android/replay/video/d;->f:Landroid/media/MediaCodec$BufferInfo;

    invoke-virtual {v1, v6, v4, v5}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_5

    if-nez p1, :cond_4

    goto/16 :goto_2

    :cond_4
    invoke-virtual {v0}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v4

    iget-boolean v4, v4, Lio/sentry/z2;->l:Z

    if-eqz v4, :cond_3

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v4

    sget-object v5, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v6, "[Encoder]: no output available, spinning to await EOS"

    new-array v7, v2, [Ljava/lang/Object;

    invoke-interface {v4, v5, v6, v7}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    const/4 v5, -0x3

    if-ne v4, v5, :cond_6

    invoke-virtual {v1}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v3

    goto :goto_0

    :cond_6
    const/4 v5, -0x2

    iget-object v7, p0, Lio/sentry/android/replay/video/d;->g:Lio/sentry/android/replay/video/b;

    if-ne v4, v5, :cond_9

    iget-boolean v4, v7, Lio/sentry/android/replay/video/b;->c:Z

    if-nez v4, :cond_8

    invoke-virtual {v1}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v4

    invoke-virtual {v0}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v5

    iget-boolean v5, v5, Lio/sentry/z2;->l:Z

    if-eqz v5, :cond_7

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v5

    sget-object v6, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "[Encoder]: encoder output format changed: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-array v9, v2, [Ljava/lang/Object;

    invoke-interface {v5, v6, v8, v9}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_7
    iget-object v5, v7, Lio/sentry/android/replay/video/b;->b:Landroid/media/MediaMuxer;

    invoke-virtual {v5, v4}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    move-result v4

    iput v4, v7, Lio/sentry/android/replay/video/b;->d:I

    invoke-virtual {v5}, Landroid/media/MediaMuxer;->start()V

    const/4 v4, 0x1

    iput-boolean v4, v7, Lio/sentry/android/replay/video/b;->c:Z

    goto :goto_0

    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "format changed twice"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    if-gez v4, :cond_a

    invoke-virtual {v0}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v5

    iget-boolean v5, v5, Lio/sentry/z2;->l:Z

    if-eqz v5, :cond_3

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v5

    sget-object v6, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v7, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "

    invoke-static {v4, v7}, Lph;->i(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-array v7, v2, [Ljava/lang/Object;

    invoke-interface {v5, v6, v4, v7}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_a
    if-eqz v3, :cond_11

    aget-object v5, v3, v4

    if-eqz v5, :cond_11

    iget v8, v6, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v8, v8, 0x2

    if-eqz v8, :cond_c

    invoke-virtual {v0}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v8

    iget-boolean v8, v8, Lio/sentry/z2;->l:Z

    if-eqz v8, :cond_b

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v8

    sget-object v9, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v10, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG"

    new-array v11, v2, [Ljava/lang/Object;

    invoke-interface {v8, v9, v10, v11}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_b
    iput v2, v6, Landroid/media/MediaCodec$BufferInfo;->size:I

    :cond_c
    iget v8, v6, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-eqz v8, :cond_e

    iget-boolean v8, v7, Lio/sentry/android/replay/video/b;->c:Z

    if-eqz v8, :cond_d

    iget-wide v8, v7, Lio/sentry/android/replay/video/b;->a:J

    iget v10, v7, Lio/sentry/android/replay/video/b;->e:I

    add-int/lit8 v11, v10, 0x1

    iput v11, v7, Lio/sentry/android/replay/video/b;->e:I

    int-to-long v10, v10

    mul-long/2addr v8, v10

    iput-wide v8, v7, Lio/sentry/android/replay/video/b;->f:J

    iput-wide v8, v6, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-object v8, v7, Lio/sentry/android/replay/video/b;->b:Landroid/media/MediaMuxer;

    iget v7, v7, Lio/sentry/android/replay/video/b;->d:I

    invoke-virtual {v8, v7, v5, v6}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    invoke-virtual {v0}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v5

    iget-boolean v5, v5, Lio/sentry/z2;->l:Z

    if-eqz v5, :cond_e

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v5

    sget-object v7, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "[Encoder]: sent "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v9, v6, Landroid/media/MediaCodec$BufferInfo;->size:I

    const-string v10, " bytes to muxer"

    invoke-static {v8, v9, v10}, LEy;->g(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-array v9, v2, [Ljava/lang/Object;

    invoke-interface {v5, v7, v8, v9}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_d
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "muxer hasn\'t started"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    :goto_1
    invoke-virtual {v1, v4, v2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    iget v4, v6, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v4, v4, 0x4

    if-eqz v4, :cond_3

    invoke-virtual {v0}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v1

    iget-boolean v1, v1, Lio/sentry/z2;->l:Z

    if-eqz v1, :cond_10

    if-nez p1, :cond_f

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v1, "[Encoder]: reached end of stream unexpectedly"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_f
    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v1, "[Encoder]: end of stream reached"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_10
    :goto_2
    return-void

    :cond_11
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "encoderOutputBuffer "

    const-string v1, " was null"

    invoke-static {v4, v0, v1}, Lph;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Landroid/graphics/Bitmap;)V
    .locals 5

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v1, "xiaomi"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-nez v1, :cond_4

    const-string v1, "motorola"

    invoke-static {v0, v1, v2}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lio/sentry/android/replay/util/e;->SOC_MANUFACTURER:Lio/sentry/android/replay/util/e;

    invoke-static {v0}, Lio/sentry/android/replay/util/g;->a(Lio/sentry/android/replay/util/e;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const-string v2, "spreadtrum"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    :goto_0
    if-nez v1, :cond_4

    invoke-static {v0}, Lio/sentry/android/replay/util/g;->a(Lio/sentry/android/replay/util/e;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    const-string v1, "unisoc"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    :goto_1
    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lio/sentry/android/replay/video/d;->h:Landroid/view/Surface;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    move-result-object v0

    goto :goto_3

    :cond_3
    move-object v0, v4

    goto :goto_3

    :cond_4
    :goto_2
    iget-object v0, p0, Lio/sentry/android/replay/video/d;->h:Landroid/view/Surface;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v4}, Landroid/view/Surface;->lockCanvas(Landroid/graphics/Rect;)Landroid/graphics/Canvas;

    move-result-object v0

    :goto_3
    if-eqz v0, :cond_5

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, v1, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_5
    iget-object p1, p0, Lio/sentry/android/replay/video/d;->h:Landroid/view/Surface;

    if-eqz p1, :cond_6

    invoke-virtual {p1, v0}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    :cond_6
    invoke-virtual {p0, v3}, Lio/sentry/android/replay/video/d;->a(Z)V

    return-void
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/replay/video/d;->d:Landroid/media/MediaCodec;

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {p0, v1}, Lio/sentry/android/replay/video/d;->a(Z)V

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    iget-object v0, p0, Lio/sentry/android/replay/video/d;->h:Landroid/view/Surface;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lio/sentry/android/replay/video/d;->g:Lio/sentry/android/replay/video/b;

    iget-object v0, v0, Lio/sentry/android/replay/video/b;->b:Landroid/media/MediaMuxer;

    invoke-virtual {v0}, Landroid/media/MediaMuxer;->stop()V

    invoke-virtual {v0}, Landroid/media/MediaMuxer;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_1
    iget-object v1, p0, Lio/sentry/android/replay/video/d;->a:Lio/sentry/v2;

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v3, "Failed to properly release video encoder"

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
