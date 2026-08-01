.class public final Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰世苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲苏兰;


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Ljava/io/InputStream;Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世兰哲苏;)I
    .locals 0

    .line 1
    new-instance p0, L飘花落叶言子哲兰楪世苏/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-direct {p0, p1}, L飘花落叶言子哲兰楪世苏/飘花落叶言子楪苏世哲兰;-><init>(Ljava/io/InputStream;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "Orientation"

    .line 7
    .line 8
    invoke-virtual {p0, p1}, L飘花落叶言子哲兰楪世苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)L飘花落叶言子哲兰楪世苏/飘花落叶言子楪世哲苏兰;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    :try_start_0
    iget-object p0, p0, L飘花落叶言子哲兰楪世苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:Ljava/nio/ByteOrder;

    .line 16
    .line 17
    invoke-virtual {p1, p0}, L飘花落叶言子哲兰楪世苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/nio/ByteOrder;)I

    .line 18
    .line 19
    .line 20
    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    goto :goto_1

    .line 22
    :catch_0
    :goto_0
    const/4 p0, 0x1

    .line 23
    :goto_1
    if-nez p0, :cond_1

    .line 24
    .line 25
    const/4 p0, -0x1

    .line 26
    :cond_1
    return p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(Ljava/io/InputStream;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 0

    .line 1
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/io/InputStream;Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世兰哲苏;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/nio/ByteBuffer;Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世兰哲苏;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/nio/ByteBuffer;Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世兰哲苏;)I
    .locals 1

    .line 1
    sget-object v0, L飘花落叶言楪世兰苏哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    new-instance v0, L飘花落叶言楪世兰苏哲子/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    invoke-direct {v0, p1}, L飘花落叶言楪世兰苏哲子/飘花落叶言子楪世苏哲兰;-><init>(Ljava/nio/ByteBuffer;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0, p2}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏(Ljava/io/InputStream;Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世兰哲苏;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 0

    .line 1
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 2
    .line 3
    return-object p0
.end method
