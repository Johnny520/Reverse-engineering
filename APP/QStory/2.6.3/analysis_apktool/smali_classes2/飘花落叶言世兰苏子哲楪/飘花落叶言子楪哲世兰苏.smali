.class public final synthetic L飘花落叶言世兰苏子哲楪/飘花落叶言子楪哲世兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:I

.field public final synthetic 飘花落叶言子楪哲兰苏世:I

.field public final synthetic 飘花落叶言子楪哲苏兰世:L飘花落叶言世兰苏子哲楪/飘花落叶言子楪哲苏世兰;


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世兰苏子哲楪/飘花落叶言子楪哲苏世兰;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰苏子哲楪/飘花落叶言子楪哲苏世兰;

    .line 5
    .line 6
    iput p2, p0, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 7
    .line 8
    iput p3, p0, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰苏子哲楪/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    iget v1, p0, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    iget p0, p0, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:I

    .line 6
    .line 7
    :try_start_0
    iget-object v2, v0, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲楪兰苏:L飘花落叶言世兰苏子哲楪/飘花落叶言子楪兰哲苏世;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-virtual {v2, v1, p0, v3}, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏哲兰世(IIZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception p0

    .line 15
    sget-object v1, Lokhttp3/internal/http2/ErrorCode;->PROTOCOL_ERROR:Lokhttp3/internal/http2/ErrorCode;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v1, p0}, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 21
    .line 22
    return-object p0
.end method
