.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏哲兰;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:J

.field public static final 飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏哲兰;

    .line 2
    .line 3
    const-class v1, [Ljava/lang/Long;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏哲兰;

    .line 9
    .line 10
    const-string v0, "[String"

    .line 11
    .line 12
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    sput-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世哲兰苏:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏兰子()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    new-array p0, p0, [Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 p2, 0x0

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    if-eqz p3, :cond_2

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    if-nez p3, :cond_0

    .line 23
    .line 24
    const/4 p3, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    instance-of v0, p3, Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    check-cast p3, Ljava/lang/String;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    :goto_1
    add-int/lit8 v0, p2, 0x1

    .line 38
    .line 39
    aput-object p3, p0, p2

    .line 40
    .line 41
    move p2, v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏兰子()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
