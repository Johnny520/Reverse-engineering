.class public final synthetic L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:I

.field public final synthetic 飘花落叶言子楪哲兰苏世:J

.field public final synthetic 飘花落叶言子楪哲苏兰世:L飘花落叶言世兰苏楪子哲/飘花落叶言子楪哲苏世兰;


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世兰苏楪子哲/飘花落叶言子楪哲苏世兰;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰苏楪子哲/飘花落叶言子楪哲苏世兰;

    .line 5
    .line 6
    iput p2, p0, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:I

    .line 7
    .line 8
    iput-wide p3, p0, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰苏楪子哲/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    iget v1, p0, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    iget-wide v2, p0, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:J

    .line 6
    .line 7
    :try_start_0
    iget-object p0, v0, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲楪兰苏:L飘花落叶言世兰苏楪子哲/飘花落叶言子楪兰哲苏世;

    .line 8
    .line 9
    invoke-virtual {p0, v1, v2, v3}, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏兰哲世(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p0

    .line 14
    sget-object v1, Lokhttp3/internal/http2/ErrorCode;->PROTOCOL_ERROR:Lokhttp3/internal/http2/ErrorCode;

    .line 15
    .line 16
    invoke-virtual {v0, v1, v1, p0}, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 20
    .line 21
    return-object p0
.end method
