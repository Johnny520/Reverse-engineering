.class public L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世哲苏兰;
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
.method public final 飘花落叶言子楪世苏哲兰(Lcom/google/gson/飘花落叶言子楪苏世哲兰;L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏哲兰;)Lcom/google/gson/飘花落叶言子楪哲苏世兰;
    .locals 0

    .line 1
    iget-object p0, p2, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 2
    .line 3
    const-class p2, Ljava/sql/Timestamp;

    .line 4
    .line 5
    if-ne p0, p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    const-class p2, Ljava/util/Date;

    .line 13
    .line 14
    invoke-direct {p0, p2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/reflect/Type;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0}, Lcom/google/gson/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏哲兰;)Lcom/google/gson/飘花落叶言子楪哲苏世兰;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance p1, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世哲兰苏;

    .line 22
    .line 23
    invoke-direct {p1, p0}, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世哲兰苏;-><init>(Lcom/google/gson/飘花落叶言子楪哲苏世兰;)V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method
