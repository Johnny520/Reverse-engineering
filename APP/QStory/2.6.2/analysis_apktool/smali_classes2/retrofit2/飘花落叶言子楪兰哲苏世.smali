.class public final Lretrofit2/飘花落叶言子楪兰哲苏世;
.super L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏兰世哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lretrofit2/飘花落叶言子世楪苏哲兰;


# direct methods
.method public constructor <init>(Lretrofit2/飘花落叶言子世楪苏哲兰;L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏世兰哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lretrofit2/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Lretrofit2/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    invoke-direct {p0, p2}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏兰世哲;-><init>(L飘花落叶言世兰哲苏楪子/飘花落叶言子楪兰哲苏世;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏哲世(L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;J)J
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪兰哲苏世;

    .line 5
    .line 6
    const-wide/16 v0, 0x2000

    .line 7
    .line 8
    invoke-interface {p2, p1, v0, v1}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰苏哲世(L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-wide p0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    iget-object p0, p0, Lretrofit2/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Lretrofit2/飘花落叶言子世楪苏哲兰;

    .line 15
    .line 16
    iput-object p1, p0, Lretrofit2/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪兰世哲苏:Ljava/io/IOException;

    .line 17
    .line 18
    throw p1
.end method
