.class public final L飘花落叶言世兰哲子楪苏/飘花落叶言子楪世苏哲兰;
.super Ljava/net/ProxySelector;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲子楪苏/飘花落叶言子楪世苏哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言世兰哲子楪苏/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/net/ProxySelector;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世兰哲子楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲子楪苏/飘花落叶言子楪世苏哲兰;

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
    invoke-static {p0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏楪世兰哲(Ljava/lang/Object;)Ljava/util/List;

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
