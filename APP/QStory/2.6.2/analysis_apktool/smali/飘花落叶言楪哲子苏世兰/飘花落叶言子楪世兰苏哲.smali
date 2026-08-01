.class public L飘花落叶言楪哲子苏世兰/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/google/gson/飘花落叶言子楪哲兰世苏;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY"

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/google/gson/飘花落叶言子楪苏世哲兰;L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;)Lcom/google/gson/飘花落叶言子楪哲苏兰世;
    .locals 0

    .line 1
    iget-object p0, p2, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 2
    .line 3
    const-class p1, Ljava/util/Date;

    .line 4
    .line 5
    if-ne p0, p1, :cond_0

    .line 6
    .line 7
    new-instance p0, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏世兰哲;

    .line 8
    .line 9
    sget-object p1, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪哲子苏世兰/飘花落叶言子楪世兰哲苏;

    .line 10
    .line 11
    const/4 p2, 0x2

    .line 12
    invoke-direct {p0, p1, p2, p2}, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏世兰哲;-><init>(L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏世哲兰;II)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method
