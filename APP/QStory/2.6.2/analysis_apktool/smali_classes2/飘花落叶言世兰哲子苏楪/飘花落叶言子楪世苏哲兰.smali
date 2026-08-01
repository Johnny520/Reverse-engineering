.class public final L飘花落叶言世兰哲子苏楪/飘花落叶言子楪世苏哲兰;
.super Ljava/net/ProxySelector;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲子苏楪/飘花落叶言子楪世苏哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言世兰哲子苏楪/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/net/ProxySelector;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世兰哲子苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲子苏楪/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final select(Ljava/net/URI;)Ljava/util/List;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 4
    .line 5
    invoke-static {p0}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "uri must not be null"

    .line 11
    .line 12
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method
