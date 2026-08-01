.class public L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/gson/飘花落叶言子楪哲苏兰世;


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

.method public final 飘花落叶言子楪世苏哲兰(Lcom/google/gson/飘花落叶言子楪苏世哲兰;L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏哲兰;)Lcom/google/gson/飘花落叶言子楪哲苏世兰;
    .locals 0

    .line 1
    iget-object p0, p2, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 2
    .line 3
    const-class p1, Ljava/util/Date;

    .line 4
    .line 5
    if-ne p0, p1, :cond_0

    .line 6
    .line 7
    new-instance p0, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪苏世兰哲;

    .line 8
    .line 9
    sget-object p1, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世兰哲苏;

    .line 10
    .line 11
    invoke-direct {p0, p1}, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪苏世兰哲;-><init>(L飘花落叶言楪哲世子苏兰/飘花落叶言子楪苏世哲兰;)V

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method
