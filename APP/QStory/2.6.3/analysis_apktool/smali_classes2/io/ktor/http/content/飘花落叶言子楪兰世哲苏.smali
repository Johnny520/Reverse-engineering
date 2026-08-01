.class public final Lio/ktor/http/content/飘花落叶言子楪兰世哲苏;
.super Lio/ktor/http/content/飘花落叶言子楪苏兰世哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/net/URI;


# direct methods
.method public constructor <init>(Ljava/net/URL;L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lio/ktor/http/content/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/net/URI;

    .line 18
    .line 19
    iput-object p2, p0, Lio/ktor/http/content/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲()L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/http/content/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/lang/Long;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰()Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;
    .locals 1

    .line 1
    iget-object p0, p0, Lio/ktor/http/content/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/net/URI;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/net/URI;->toURL()Ljava/net/URL;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v0, Lio/ktor/util/cio/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    invoke-static {p0, v0}, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲苏世(Ljava/io/InputStream;L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;)Lio/ktor/utils/io/jvm/javaio/飘花落叶言子楪世哲苏兰;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
