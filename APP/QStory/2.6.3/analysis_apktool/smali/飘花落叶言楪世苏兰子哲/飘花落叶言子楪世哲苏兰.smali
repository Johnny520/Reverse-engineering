.class public final L飘花落叶言楪世苏兰子哲/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言楪世苏兰子哲/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:L飘花落叶言楪世苏兰子哲/飘花落叶言子楪世哲苏兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪世苏兰子哲/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, L飘花落叶言楪世苏兰子哲/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪世苏兰子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪世苏兰子哲/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, L飘花落叶言楪世苏兰子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;L飘花落叶言楪子兰哲苏世/飘花落叶言子楪苏世兰哲;)Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;
    .locals 3

    .line 1
    iget p0, p0, L飘花落叶言楪世苏兰子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, L飘花落叶言楪世苏哲兰子/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    iget-object p0, p0, L飘花落叶言楪世苏哲兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言子兰世哲苏楪/飘花落叶言子楪世兰苏哲;

    .line 13
    .line 14
    iget-object p0, p0, L飘花落叶言子兰世哲苏楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, L飘花落叶言楪世苏哲兰子/飘花落叶言子楪苏世兰哲;

    .line 17
    .line 18
    iget-object p0, p0, L飘花落叶言楪世苏哲兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世哲兰苏;

    .line 19
    .line 20
    iget-object p0, p0, L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance p1, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪哲兰苏;

    .line 27
    .line 28
    sget-object p2, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReference;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/nio/Buffer;->isReadOnly()Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-nez p2, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    new-instance p2, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-direct {p2, v0, v1, v2}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;-><init>([BII)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/4 p2, 0x0

    .line 61
    :goto_0
    if-eqz p2, :cond_1

    .line 62
    .line 63
    iget v0, p2, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 64
    .line 65
    if-nez v0, :cond_1

    .line 66
    .line 67
    iget v0, p2, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 68
    .line 69
    iget-object p2, p2, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[B

    .line 70
    .line 71
    array-length p2, p2

    .line 72
    if-ne v0, p2, :cond_1

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    new-array p2, p2, [B

    .line 88
    .line 89
    const/4 v0, 0x0

    .line 90
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 97
    .line 98
    .line 99
    move-object p0, p2

    .line 100
    :goto_1
    invoke-direct {p1, p0}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪哲兰苏;-><init>([B)V

    .line 101
    .line 102
    .line 103
    :pswitch_0
    return-object p1

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
