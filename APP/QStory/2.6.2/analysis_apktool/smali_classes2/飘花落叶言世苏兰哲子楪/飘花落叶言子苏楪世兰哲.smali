.class public final L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲楪兰世;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    new-instance v0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲楪兰世;

    .line 10
    .line 11
    invoke-interface {p1}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;->getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {v0, p1}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲楪兰世;-><init>(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲楪兰世;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final deserialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子世哲楪兰苏()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    check-cast p0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子世哲兰苏楪(L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    const-class v2, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪世兰哲;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪世兰哲;

    .line 18
    .line 19
    iget-object p0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    iget-object p1, p1, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_2

    .line 28
    .line 29
    return v1

    .line 30
    :cond_2
    return v0

    .line 31
    :cond_3
    :goto_0
    return v1
.end method

.method public final getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲楪兰世;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final serialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    check-cast p0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-interface {p1, p0, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子世哲楪苏兰(L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-interface {p1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
