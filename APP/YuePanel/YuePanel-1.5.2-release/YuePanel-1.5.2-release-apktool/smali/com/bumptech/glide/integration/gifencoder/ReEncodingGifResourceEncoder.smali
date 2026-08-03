.class public Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/ResourceEncoder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/ResourceEncoder<",
        "Lcom/bumptech/glide/load/resource/gif/GifDrawable;",
        ">;"
    }
.end annotation


# static fields
.field public static final ENCODE_TRANSFORMATION:Lcom/bumptech/glide/load/Option;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/Option<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final FACTORY:Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;

.field private static final KEY_ENCODE_TRANSFORMATION:Ljava/lang/String; = "com.bumptech.glide.load.resource.gif.GifResourceEncoder.EncodeTransformation"

.field private static final TAG:Ljava/lang/String; = "GifEncoder"


# instance fields
.field private final bitmapPool:Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;

.field private final context:Landroid/content/Context;

.field private final factory:Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;

.field private final provider:Lcom/bumptech/glide/gifdecoder/GifDecoder$BitmapProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v1, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$1;

    invoke-direct {v1}, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$1;-><init>()V

    const-string v2, "com.bumptech.glide.load.resource.gif.GifResourceEncoder.EncodeTransformation"

    invoke-static {v2, v0, v1}, Lcom/bumptech/glide/load/Option;->disk(Ljava/lang/String;Ljava/lang/Object;Lcom/bumptech/glide/load/Option$CacheKeyUpdater;)Lcom/bumptech/glide/load/Option;

    move-result-object v0

    sput-object v0, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->ENCODE_TRANSFORMATION:Lcom/bumptech/glide/load/Option;

    new-instance v0, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;

    invoke-direct {v0}, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;-><init>()V

    sput-object v0, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->FACTORY:Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->FACTORY:Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;

    invoke-direct {p0, p1, p2, v0}, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;-><init>(Landroid/content/Context;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;)V
    .locals 0
    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->context:Landroid/content/Context;

    .line 4
    iput-object p2, p0, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->bitmapPool:Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;

    .line 5
    new-instance p1, Lcom/bumptech/glide/load/resource/gif/GifBitmapProvider;

    invoke-direct {p1, p2}, Lcom/bumptech/glide/load/resource/gif/GifBitmapProvider;-><init>(Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)V

    iput-object p1, p0, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->provider:Lcom/bumptech/glide/gifdecoder/GifDecoder$BitmapProvider;

    .line 6
    iput-object p3, p0, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->factory:Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;

    return-void
.end method

.method private decodeHeaders(Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/gifdecoder/GifDecoder;
    .locals 3

    iget-object v0, p0, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->factory:Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;

    invoke-virtual {v0}, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;->buildParser()Lcom/bumptech/glide/gifdecoder/GifHeaderParser;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/gifdecoder/GifHeaderParser;->setData(Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/gifdecoder/GifHeaderParser;

    invoke-virtual {v0}, Lcom/bumptech/glide/gifdecoder/GifHeaderParser;->parseHeader()Lcom/bumptech/glide/gifdecoder/GifHeader;

    move-result-object v0

    iget-object v1, p0, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->factory:Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;

    iget-object v2, p0, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->provider:Lcom/bumptech/glide/gifdecoder/GifDecoder$BitmapProvider;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;->buildDecoder(Lcom/bumptech/glide/gifdecoder/GifDecoder$BitmapProvider;)Lcom/bumptech/glide/gifdecoder/GifDecoder;

    move-result-object v1

    invoke-interface {v1, v0, p1}, Lcom/bumptech/glide/gifdecoder/GifDecoder;->setData(Lcom/bumptech/glide/gifdecoder/GifHeader;Ljava/nio/ByteBuffer;)V

    invoke-interface {v1}, Lcom/bumptech/glide/gifdecoder/GifDecoder;->advance()V

    return-object v1
.end method

.method private encodeTransformedToFile(Lcom/bumptech/glide/load/resource/gif/GifDrawable;Ljava/io/File;)Z
    .locals 7

    const-string v0, "GifEncoder"

    invoke-static {}, Lcom/bumptech/glide/util/LogTime;->getLogTime()J

    move-result-wide v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :try_start_0
    new-instance v5, Ljava/io/BufferedOutputStream;

    new-instance v6, Ljava/io/FileOutputStream;

    invoke-direct {v6, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v5, v6}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-direct {p0, p1, v5}, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->encodeTransformedToStream(Lcom/bumptech/glide/load/resource/gif/GifDrawable;Ljava/io/OutputStream;)Z

    move-result v4

    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catchall_0
    move-exception p1

    move-object v3, v5

    goto :goto_2

    :catch_0
    move-exception p2

    move-object v3, v5

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p2

    :goto_0
    const/4 v5, 0x3

    :try_start_3
    invoke-static {v0, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "Failed to encode GIF"

    invoke-static {v0, v5, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_0
    if-eqz v3, :cond_1

    :try_start_4
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    :cond_1
    :goto_1
    const/4 p2, 0x2

    invoke-static {v0, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Re-encoded GIF with "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->getFrameCount()I

    move-result v3

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " frames and "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes in "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1, v2}, Lcom/bumptech/glide/util/LogTime;->getElapsedMillis(J)D

    move-result-wide v1

    invoke-virtual {p2, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p1, " ms"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return v4

    :goto_2
    if-eqz v3, :cond_3

    :try_start_5
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    :catch_3
    :cond_3
    throw p1
.end method

.method private encodeTransformedToStream(Lcom/bumptech/glide/load/resource/gif/GifDrawable;Ljava/io/OutputStream;)Z
    .locals 6

    invoke-virtual {p1}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->getFrameTransformation()Lcom/bumptech/glide/load/Transformation;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->decodeHeaders(Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/gifdecoder/GifDecoder;

    move-result-object v1

    iget-object v2, p0, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->factory:Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;

    invoke-virtual {v2}, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;->buildEncoder()Lcom/bumptech/glide/gifencoder/AnimatedGifEncoder;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/bumptech/glide/gifencoder/AnimatedGifEncoder;->start(Ljava/io/OutputStream;)Z

    move-result p2

    const/4 v3, 0x0

    if-nez p2, :cond_0

    return v3

    :cond_0
    move p2, v3

    :goto_0
    invoke-interface {v1}, Lcom/bumptech/glide/gifdecoder/GifDecoder;->getFrameCount()I

    move-result v4

    if-ge p2, v4, :cond_2

    invoke-interface {v1}, Lcom/bumptech/glide/gifdecoder/GifDecoder;->getNextFrame()Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-direct {p0, v4, v0, p1}, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->getTransformedFrame(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/Transformation;Lcom/bumptech/glide/load/resource/gif/GifDrawable;)Lcom/bumptech/glide/load/engine/Resource;

    move-result-object v4

    :try_start_0
    invoke-interface {v4}, Lcom/bumptech/glide/load/engine/Resource;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Bitmap;

    invoke-virtual {v2, v5}, Lcom/bumptech/glide/gifencoder/AnimatedGifEncoder;->addFrame(Landroid/graphics/Bitmap;)Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v5, :cond_1

    invoke-interface {v4}, Lcom/bumptech/glide/load/engine/Resource;->recycle()V

    return v3

    :cond_1
    :try_start_1
    invoke-interface {v1}, Lcom/bumptech/glide/gifdecoder/GifDecoder;->getCurrentFrameIndex()I

    move-result v5

    invoke-interface {v1, v5}, Lcom/bumptech/glide/gifdecoder/GifDecoder;->getDelay(I)I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/bumptech/glide/gifencoder/AnimatedGifEncoder;->setDelay(I)V

    invoke-interface {v1}, Lcom/bumptech/glide/gifdecoder/GifDecoder;->advance()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v4}, Lcom/bumptech/glide/load/engine/Resource;->recycle()V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-interface {v4}, Lcom/bumptech/glide/load/engine/Resource;->recycle()V

    throw p1

    :cond_2
    invoke-virtual {v2}, Lcom/bumptech/glide/gifencoder/AnimatedGifEncoder;->finish()Z

    move-result p1

    return p1
.end method

.method private getTransformedFrame(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/Transformation;Lcom/bumptech/glide/load/resource/gif/GifDrawable;)Lcom/bumptech/glide/load/engine/Resource;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lcom/bumptech/glide/load/Transformation<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/bumptech/glide/load/resource/gif/GifDrawable;",
            ")",
            "Lcom/bumptech/glide/load/engine/Resource<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->factory:Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;

    iget-object v1, p0, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->bitmapPool:Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;

    invoke-virtual {v0, p1, v1}, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;->buildFrameResource(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)Lcom/bumptech/glide/load/engine/Resource;

    move-result-object p1

    iget-object v0, p0, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->context:Landroid/content/Context;

    invoke-virtual {p3}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {p3}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->getIntrinsicHeight()I

    move-result p3

    invoke-interface {p2, v0, p1, v1, p3}, Lcom/bumptech/glide/load/Transformation;->transform(Landroid/content/Context;Lcom/bumptech/glide/load/engine/Resource;II)Lcom/bumptech/glide/load/engine/Resource;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    invoke-interface {p1}, Lcom/bumptech/glide/load/engine/Resource;->recycle()V

    :cond_0
    return-object p2
.end method

.method private writeDataDirect(Ljava/nio/ByteBuffer;Ljava/io/File;)Z
    .locals 1

    :try_start_0
    invoke-static {p1, p2}, Lcom/bumptech/glide/util/ByteBufferUtil;->toFile(Ljava/nio/ByteBuffer;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    const/4 p2, 0x5

    const-string v0, "GifEncoder"

    invoke-static {v0, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "Failed to write GIF data"

    invoke-static {v0, p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public encode(Lcom/bumptech/glide/load/engine/Resource;Ljava/io/File;Lcom/bumptech/glide/load/Options;)Z
    .locals 1
    .param p1    # Lcom/bumptech/glide/load/engine/Resource;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/io/File;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Lcom/bumptech/glide/load/Options;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/engine/Resource<",
            "Lcom/bumptech/glide/load/resource/gif/GifDrawable;",
            ">;",
            "Ljava/io/File;",
            "Lcom/bumptech/glide/load/Options;",
            ")Z"
        }
    .end annotation

    .line 2
    invoke-interface {p1}, Lcom/bumptech/glide/load/engine/Resource;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    .line 3
    invoke-virtual {p1}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->getFrameTransformation()Lcom/bumptech/glide/load/Transformation;

    move-result-object v0

    .line 4
    instance-of v0, v0, Lcom/bumptech/glide/load/resource/UnitTransformation;

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 5
    sget-object v0, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->ENCODE_TRANSFORMATION:Lcom/bumptech/glide/load/Option;

    invoke-virtual {p3, v0}, Lcom/bumptech/glide/load/Options;->get(Lcom/bumptech/glide/load/Option;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->encodeTransformedToFile(Lcom/bumptech/glide/load/resource/gif/GifDrawable;Ljava/io/File;)Z

    move-result p1

    return p1

    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->writeDataDirect(Ljava/nio/ByteBuffer;Ljava/io/File;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/io/File;Lcom/bumptech/glide/load/Options;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/io/File;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Lcom/bumptech/glide/load/Options;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    check-cast p1, Lcom/bumptech/glide/load/engine/Resource;

    invoke-virtual {p0, p1, p2, p3}, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->encode(Lcom/bumptech/glide/load/engine/Resource;Ljava/io/File;Lcom/bumptech/glide/load/Options;)Z

    move-result p1

    return p1
.end method

.method public getEncodeStrategy(Lcom/bumptech/glide/load/Options;)Lcom/bumptech/glide/load/EncodeStrategy;
    .locals 1
    .param p1    # Lcom/bumptech/glide/load/Options;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget-object v0, Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;->ENCODE_TRANSFORMATION:Lcom/bumptech/glide/load/Option;

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/load/Options;->get(Lcom/bumptech/glide/load/Option;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/bumptech/glide/load/EncodeStrategy;->TRANSFORMED:Lcom/bumptech/glide/load/EncodeStrategy;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/bumptech/glide/load/EncodeStrategy;->SOURCE:Lcom/bumptech/glide/load/EncodeStrategy;

    :goto_0
    return-object p1
.end method
