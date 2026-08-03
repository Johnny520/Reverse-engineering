.class Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder$Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۢۥ۟ۥ;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/integration/gifencoder/ReEncodingGifResourceEncoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Factory"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public buildDecoder(Lcom/bumptech/glide/gifdecoder/GifDecoder$BitmapProvider;)Lcom/bumptech/glide/gifdecoder/GifDecoder;
    .locals 1

    new-instance v0, Lcom/bumptech/glide/gifdecoder/StandardGifDecoder;

    invoke-direct {v0, p1}, Lcom/bumptech/glide/gifdecoder/StandardGifDecoder;-><init>(Lcom/bumptech/glide/gifdecoder/GifDecoder$BitmapProvider;)V

    return-object v0
.end method

.method public buildEncoder()Lcom/bumptech/glide/gifencoder/AnimatedGifEncoder;
    .locals 1

    new-instance v0, Lcom/bumptech/glide/gifencoder/AnimatedGifEncoder;

    invoke-direct {v0}, Lcom/bumptech/glide/gifencoder/AnimatedGifEncoder;-><init>()V

    return-object v0
.end method

.method public buildFrameResource(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)Lcom/bumptech/glide/load/engine/Resource;
    .locals 1
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;",
            ")",
            "Lcom/bumptech/glide/load/engine/Resource<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/BitmapResource;

    invoke-direct {v0, p1, p2}, Lcom/bumptech/glide/load/resource/bitmap/BitmapResource;-><init>(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)V

    return-object v0
.end method

.method public buildParser()Lcom/bumptech/glide/gifdecoder/GifHeaderParser;
    .locals 1

    new-instance v0, Lcom/bumptech/glide/gifdecoder/GifHeaderParser;

    invoke-direct {v0}, Lcom/bumptech/glide/gifdecoder/GifHeaderParser;-><init>()V

    return-object v0
.end method
