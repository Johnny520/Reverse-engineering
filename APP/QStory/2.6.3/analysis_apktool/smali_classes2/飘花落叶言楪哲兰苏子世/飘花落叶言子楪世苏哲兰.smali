.class public final L飘花落叶言楪哲兰苏子世/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

.field public final 飘花落叶言子楪世苏兰哲:D

.field public final 飘花落叶言子楪世苏哲兰:D


# direct methods
.method public constructor <init>(DD)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, L飘花落叶言楪哲兰苏子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:D

    .line 5
    .line 6
    iput-wide p3, p0, L飘花落叶言楪哲兰苏子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:D

    .line 7
    .line 8
    new-instance p1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, L飘花落叶言楪哲兰苏子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(I)D
    .locals 9

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, L飘花落叶言楪哲兰苏子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    const-wide/high16 v5, 0x4069000000000000L    # 200.0

    .line 14
    .line 15
    int-to-double v7, p1

    .line 16
    iget-wide v3, p0, L飘花落叶言楪哲兰苏子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:D

    .line 17
    .line 18
    invoke-static/range {v3 .. v8}, L飘花落叶言楪哲兰世苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(DDD)L飘花落叶言楪哲兰世苏子/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iget-wide p0, p0, L飘花落叶言楪哲兰世苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:D

    .line 23
    .line 24
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_0
    check-cast v2, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 34
    .line 35
    .line 36
    move-result-wide p0

    .line 37
    return-wide p0
.end method
