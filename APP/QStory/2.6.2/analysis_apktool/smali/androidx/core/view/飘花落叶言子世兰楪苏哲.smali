.class public abstract Landroidx/core/view/飘花落叶言子世兰楪苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

.field public 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:I

.field public 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    sget-object p0, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;

    if-nez p0, :cond_0

    .line 21
    new-instance p0, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;

    const/4 v0, 0x7

    .line 22
    invoke-direct {p0, v0}, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 23
    sput-object p0, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;

    :cond_0
    return-void
.end method

.method public constructor <init>(Lkotlin/collections/builders/MapBuilder;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 8
    .line 9
    invoke-static {p1}, Lkotlin/collections/builders/MapBuilder;->access$getModCount$p(Lkotlin/collections/builders/MapBuilder;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iput p1, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世兰哲苏()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lkotlin/collections/builders/MapBuilder;

    .line 6
    .line 7
    invoke-static {p0}, Lkotlin/collections/builders/MapBuilder;->access$getLength$p(Lkotlin/collections/builders/MapBuilder;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-ge v0, p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public remove()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlin/collections/builders/MapBuilder;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世哲苏兰()V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 9
    .line 10
    const/4 v2, -0x1

    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lkotlin/collections/builders/MapBuilder;->checkIsMutable$kotlin_stdlib()V

    .line 14
    .line 15
    .line 16
    iget v1, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/collections/builders/MapBuilder;->access$removeEntryAt(Lkotlin/collections/builders/MapBuilder;I)V

    .line 19
    .line 20
    .line 21
    iput v2, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/collections/builders/MapBuilder;->access$getModCount$p(Lkotlin/collections/builders/MapBuilder;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string p0, "Call next() before removing element from the iterator."

    .line 31
    .line 32
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public 飘花落叶言子楪世兰哲苏()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlin/collections/builders/MapBuilder;

    .line 4
    .line 5
    :goto_0
    iget v1, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/collections/builders/MapBuilder;->access$getLength$p(Lkotlin/collections/builders/MapBuilder;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/collections/builders/MapBuilder;->access$getPresenceArray$p(Lkotlin/collections/builders/MapBuilder;)[I

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v2, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 18
    .line 19
    aget v1, v1, v2

    .line 20
    .line 21
    if-gez v1, :cond_0

    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    iput v2, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public abstract 飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Landroid/view/View;)V
.end method

.method public abstract 飘花落叶言子楪世哲兰苏(Landroid/view/View;)Ljava/lang/Object;
.end method

.method public 飘花落叶言子楪世哲苏兰()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlin/collections/builders/MapBuilder;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/collections/builders/MapBuilder;->access$getModCount$p(Lkotlin/collections/builders/MapBuilder;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget p0, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 10
    .line 11
    if-ne v0, p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-static {}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public 飘花落叶言子楪世苏哲兰(I)I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iget p0, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 10
    .line 11
    add-int/2addr p0, p1

    .line 12
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public abstract 飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public 飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Landroid/view/View;)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    iget v1, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    iget v1, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-lt v0, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p2}, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世哲兰苏(Landroid/view/View;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget v0, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 24
    .line 25
    invoke-virtual {p2, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ljava/lang/Class;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move-object v0, v2

    .line 41
    :goto_0
    invoke-virtual {p0, v0, p1}, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_6

    .line 46
    .line 47
    invoke-static {p2}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    instance-of v1, v0, Landroidx/core/view/飘花落叶言子楪世苏哲兰;

    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    check-cast v0, Landroidx/core/view/飘花落叶言子楪世苏哲兰;

    .line 59
    .line 60
    iget-object v2, v0, Landroidx/core/view/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子楪世苏兰哲;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    new-instance v2, Landroidx/core/view/飘花落叶言子楪世苏兰哲;

    .line 64
    .line 65
    invoke-direct {v2, v0}, Landroidx/core/view/飘花落叶言子楪世苏兰哲;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 66
    .line 67
    .line 68
    :goto_1
    if-nez v2, :cond_5

    .line 69
    .line 70
    new-instance v2, Landroidx/core/view/飘花落叶言子楪世苏兰哲;

    .line 71
    .line 72
    invoke-direct {v2}, Landroidx/core/view/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 73
    .line 74
    .line 75
    :cond_5
    invoke-static {p2, v2}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏兰世(Landroid/view/View;Landroidx/core/view/飘花落叶言子楪世苏兰哲;)V

    .line 76
    .line 77
    .line 78
    iget v0, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 79
    .line 80
    invoke-virtual {p2, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget p0, p0, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 84
    .line 85
    invoke-static {p2, p0}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪苏哲世兰(Landroid/view/View;I)V

    .line 86
    .line 87
    .line 88
    :cond_6
    return-void
.end method
