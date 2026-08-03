.class public final LGg;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ldl;


# virtual methods
.method public final a(Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 0

    sget-object p1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p1
.end method

.method public final b(Ljava/io/InputStream;Lzp;)I
    .locals 0

    new-instance p2, LFg;

    invoke-direct {p2, p1}, LFg;-><init>(Ljava/io/InputStream;)V

    const-string p1, "Orientation"

    invoke-virtual {p2, p1}, LFg;->c(Ljava/lang/String;)LBg;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object p2, p2, LFg;->f:Ljava/nio/ByteOrder;

    invoke-virtual {p1, p2}, LBg;->e(Ljava/nio/ByteOrder;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-nez p1, :cond_1

    const/4 p1, -0x1

    :cond_1
    return p1
.end method

.method public final c(Ljava/nio/ByteBuffer;Lzp;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final d(Ljava/nio/ByteBuffer;Lzp;)I
    .locals 1

    sget-object v0, Lt6;->a:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Lr6;

    invoke-direct {v0, p1}, Lr6;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {p0, v0, p2}, LGg;->b(Ljava/io/InputStream;Lzp;)I

    move-result p1

    return p1
.end method

.method public final e(Ljava/io/InputStream;Lzp;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final f(Ljava/io/InputStream;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 0

    sget-object p1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p1
.end method
