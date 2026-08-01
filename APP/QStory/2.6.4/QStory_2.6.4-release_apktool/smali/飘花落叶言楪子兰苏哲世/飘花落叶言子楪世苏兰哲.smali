.class public final L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:I

.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;


# direct methods
.method public constructor <init>(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    iput p2, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    iget p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    iget p1, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(II)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲兰世;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰苏世;

    .line 19
    .line 20
    invoke-virtual {p0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰苏世;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
