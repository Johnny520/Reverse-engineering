.class public final Lio/ktor/server/http/content/飘花落叶言子楪苏世哲兰;
.super Lio/ktor/http/content/飘花落叶言子楪苏兰世哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lio/ktor/server/http/content/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/io/File;

    .line 11
    .line 12
    iput-object p2, p0, Lio/ktor/server/http/content/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    sget-object v0, Lio/ktor/http/content/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏(Lio/ktor/util/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/util/List;

    .line 31
    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 35
    .line 36
    :cond_0
    new-instance v2, Lio/ktor/http/content/飘花落叶言子楪世哲兰苏;

    .line 37
    .line 38
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Long;)L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世哲兰苏;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-direct {v2, p1}, Lio/ktor/http/content/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世哲兰苏;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v2}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪苏哲世(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p0, v0, p1}, Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰哲苏(Lio/ktor/util/飘花落叶言子楪世苏哲兰;Ljava/util/ArrayList;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    const-string p0, "No such file "

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1, p0}, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 p0, 0x0

    .line 67
    throw p0
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲()L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/server/http/content/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/lang/Long;
    .locals 2

    .line 1
    iget-object p0, p0, Lio/ktor/server/http/content/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰()Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/server/http/content/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/io/File;

    .line 2
    .line 3
    invoke-static {p0}, Lio/ktor/util/cio/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/io/File;)Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
