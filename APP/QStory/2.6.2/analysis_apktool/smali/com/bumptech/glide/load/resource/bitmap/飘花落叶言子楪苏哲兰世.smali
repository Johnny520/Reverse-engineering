.class public final Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏兰世哲;
.implements L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世兰哲苏;
.implements Lcom/bumptech/glide/load/data/飘花落叶言子楪世兰哲苏;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/16 p1, 0x8

    .line 10
    .line 11
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x4

    .line 22
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;I)V
    .locals 0

    iput p2, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:I

    packed-switch p2, :pswitch_data_0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 31
    sget-object p0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    return-void

    .line 32
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public skip(J)J
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-long v0, v0

    .line 8
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    long-to-int p1, p1

    .line 13
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    add-int/2addr p2, p1

    .line 18
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 19
    .line 20
    .line 21
    int-to-long p0, p1

    .line 22
    return-wide p0
.end method

.method public 飘花落叶言子楪世哲苏兰()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public 飘花落叶言子楪世苏兰哲()V
    .locals 0

    .line 1
    return-void
.end method

.method public 飘花落叶言子楪世苏哲兰([BLjava/lang/Object;Ljava/security/MessageDigest;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p2, Ljava/lang/Integer;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p3, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p3, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 38
    .line 39
    .line 40
    monitor-exit v0

    .line 41
    :goto_0
    return-void

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p0

    .line 45
    :pswitch_0
    check-cast p2, Ljava/lang/Long;

    .line 46
    .line 47
    invoke-virtual {p3, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    monitor-enter p1

    .line 53
    :try_start_1
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    invoke-virtual {p0, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p3, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 73
    .line 74
    .line 75
    monitor-exit p1

    .line 76
    return-void

    .line 77
    :catchall_1
    move-exception p0

    .line 78
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    throw p0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子楪哲兰世苏()S
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    and-int/lit16 p0, p0, 0xff

    .line 15
    .line 16
    int-to-short p0, p0

    .line 17
    return p0

    .line 18
    :cond_0
    new-instance p0, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException;

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public 飘花落叶言子楪哲苏兰世([BI)I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    const/4 p0, -0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, p1, v0, p2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    return p2
.end method

.method public 飘花落叶言子楪苏世哲兰()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏()S

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shl-int/lit8 v0, v0, 0x8

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏()S

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    or-int/2addr p0, v0

    .line 12
    return p0
.end method
