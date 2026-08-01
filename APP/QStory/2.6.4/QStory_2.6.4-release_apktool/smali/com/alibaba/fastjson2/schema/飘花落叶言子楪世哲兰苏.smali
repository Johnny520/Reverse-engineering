.class public final Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;
.super Lcom/alibaba/fastjson2/schema/JSONSchema;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:[Lcom/alibaba/fastjson2/schema/JSONSchema;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;-><init>(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "anyOf"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getJSONArray(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONArray;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_3

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    new-array v0, v0, [Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:[Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    :goto_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:[Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 28
    .line 29
    array-length v1, v1

    .line 30
    if-ge v0, v1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    instance-of v2, v1, Ljava/lang/Boolean;

    .line 37
    .line 38
    iget-object v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:[Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 39
    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    check-cast v1, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    sget-object v1, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲苏兰;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏哲兰世;

    .line 54
    .line 55
    :goto_1
    aput-object v1, v3, v0

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    check-cast v1, Lcom/alibaba/fastjson2/JSONObject;

    .line 59
    .line 60
    invoke-static {v1, p2}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰哲世(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    aput-object v1, v3, v0

    .line 65
    .line 66
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    return-void

    .line 70
    :cond_3
    const-string p0, "anyOf not found"

    .line 71
    .line 72
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    throw p0
.end method

.method public constructor <init>([Lcom/alibaba/fastjson2/schema/JSONSchema;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/alibaba/fastjson2/schema/JSONSchema;-><init>()V

    .line 78
    iput-object p1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:[Lcom/alibaba/fastjson2/schema/JSONSchema;

    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:[Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    aget-object v2, p0, v1

    .line 8
    .line 9
    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v3, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 14
    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    return-object v3

    .line 18
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏世兰哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 22
    .line 23
    return-object p0
.end method

.method public final 飘花落叶言子楪哲苏兰世()Lcom/alibaba/fastjson2/JSONObject;
    .locals 1

    .line 1
    const-string v0, "anyOf"

    .line 2
    .line 3
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:[Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lcom/alibaba/fastjson2/JSONObject;->of(Ljava/lang/String;Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONObject;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲兰世()Lcom/alibaba/fastjson2/schema/JSONSchema$Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->AnyOf:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 2
    .line 3
    return-object p0
.end method
