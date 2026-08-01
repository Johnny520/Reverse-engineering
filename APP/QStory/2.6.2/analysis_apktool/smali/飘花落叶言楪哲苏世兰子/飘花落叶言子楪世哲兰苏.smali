.class public abstract L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;
.super Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Landroid/util/SparseArray;

.field public final 飘花落叶言子楪世兰苏哲:Landroid/util/SparseArray;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/List;

.field public final 飘花落叶言子楪苏世哲兰:L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 8
    .line 9
    new-instance p1, Landroid/util/SparseArray;

    .line 10
    .line 11
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Landroid/util/SparseArray;

    .line 15
    .line 16
    new-instance p1, Landroid/util/SparseArray;

    .line 17
    .line 18
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:Landroid/util/SparseArray;

    .line 22
    .line 23
    new-instance p1, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;

    .line 24
    .line 25
    const/16 v0, 0x9

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {p1, v0, v1}, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;-><init>(IZ)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Landroid/util/SparseArray;

    .line 32
    .line 33
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p1, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 37
    .line 38
    iput-object p1, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final setMOnItemClickListener(L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setOnItemClickListener(L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲(I)I
    .locals 3

    .line 1
    iget-object v0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ge p1, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏(I)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    sub-int/2addr p1, v1

    .line 25
    invoke-virtual {p0}, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sub-int/2addr v1, v0

    .line 34
    iget-object p0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:Landroid/util/SparseArray;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    sub-int/2addr v1, v0

    .line 41
    sub-int/2addr p1, v1

    .line 42
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :cond_1
    iget-object v1, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;

    .line 48
    .line 49
    iget-object v2, v1, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Landroid/util/SparseArray;

    .line 52
    .line 53
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-lez v2, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    sub-int/2addr p1, v2

    .line 64
    iget-object p0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 70
    .line 71
    .line 72
    iget-object p0, v1, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Landroid/util/SparseArray;

    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    add-int/lit8 p1, p1, -0x1

    .line 81
    .line 82
    const/4 v0, -0x1

    .line 83
    if-ge v0, p1, :cond_2

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世苏哲兰;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    return p0

    .line 99
    :cond_2
    const/4 p0, 0x0

    .line 100
    return p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()I
    .locals 2

    .line 1
    iget-object v0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Landroid/util/SparseArray;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object p0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:Landroid/util/SparseArray;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    add-int/2addr p0, v1

    .line 20
    add-int/2addr p0, v0

    .line 21
    return p0
.end method

.method public final 飘花落叶言子楪兰世哲苏(I)Z
    .locals 3

    .line 1
    iget-object v0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sub-int/2addr v2, v0

    .line 16
    iget-object p0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:Landroid/util/SparseArray;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    sub-int/2addr v2, p0

    .line 23
    add-int/2addr v2, v1

    .line 24
    if-lt p1, v2, :cond_0

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public final 飘花落叶言子楪兰世苏哲(L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;Ljava/lang/Object;Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getAdapterPosition()I

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Landroid/util/SparseArray;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-lez v0, :cond_2

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;

    .line 35
    .line 36
    if-eqz p3, :cond_1

    .line 37
    .line 38
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-eqz p3, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {p0, p1, p2}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲(L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲(L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void
.end method

.method public final 飘花落叶言子楪哲世苏兰(ILandroid/view/ViewGroup;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;
    .locals 2

    .line 1
    iget-object v0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast p0, Landroid/view/View;

    .line 19
    .line 20
    new-instance p1, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;

    .line 21
    .line 22
    invoke-direct {p1, p0}, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;-><init>(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    iget-object v0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:Landroid/util/SparseArray;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    sget p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    check-cast p0, Landroid/view/View;

    .line 44
    .line 45
    new-instance p1, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;

    .line 46
    .line 47
    invoke-direct {p1, p0}, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;-><init>(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_1
    iget-object v0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;

    .line 52
    .line 53
    iget-object v0, v0, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Landroid/util/SparseArray;

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    check-cast p1, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世苏哲兰;

    .line 65
    .line 66
    iget-object p1, p1, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;

    .line 67
    .line 68
    iget p1, p1, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:I

    .line 69
    .line 70
    sget v0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 71
    .line 72
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const/4 v1, 0x0

    .line 88
    invoke-virtual {v0, p1, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    new-instance p2, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-direct {p2, p1}, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;-><init>(Landroid/view/View;)V

    .line 98
    .line 99
    .line 100
    iget-object p1, p2, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    new-instance v0, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;

    .line 106
    .line 107
    invoke-direct {v0, p0, p2}, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    .line 112
    .line 113
    new-instance v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪苏哲兰;

    .line 114
    .line 115
    invoke-direct {v0, p0, p2}, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪苏哲兰;-><init>(L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 119
    .line 120
    .line 121
    return-object p2
.end method

.method public final 飘花落叶言子楪哲苏兰世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V
    .locals 2

    .line 1
    check-cast p1, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getLayoutPosition()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Landroid/util/SparseArray;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0, v0}, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏(I)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    :goto_0
    iget-object p0, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    instance-of p1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲世兰苏楪;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    check-cast p0, Landroidx/recyclerview/widget/飘花落叶言子哲世兰苏楪;

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    iput-boolean p1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲世兰苏楪;->飘花落叶言子楪兰苏世哲:Z

    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪苏兰世哲(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;I)V
    .locals 2

    .line 1
    check-cast p1, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    iget-object v0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Landroid/util/SparseArray;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ge p2, v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0, p2}, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sub-int/2addr p2, v0

    .line 24
    iget-object v0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-virtual {p0, p1, p2, v0}, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲(L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;Ljava/lang/Object;Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final 飘花落叶言子楪苏兰哲世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILjava/util/List;)V
    .locals 2

    .line 1
    check-cast p1, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Landroid/util/SparseArray;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-ge p2, v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0, p2}, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏(I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    sub-int/2addr p2, v0

    .line 27
    iget-object v0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p0, p1, p2, p3}, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲(L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰苏哲;Ljava/lang/Object;Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final 飘花落叶言子楪苏哲兰世(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/飘花落叶言子苏楪世哲兰;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/飘花落叶言子苏楪世哲兰;-><init>(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    instance-of p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    check-cast p0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 17
    .line 18
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子苏楪哲兰世:Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;

    .line 19
    .line 20
    new-instance v1, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰哲苏;

    .line 21
    .line 22
    invoke-direct {v1, v0, p0, p1}, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰哲苏;-><init>(Landroidx/compose/foundation/飘花落叶言子苏楪世哲兰;Landroidx/recyclerview/widget/GridLayoutManager;Landroidx/recyclerview/widget/飘花落叶言子楪兰哲苏世;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子兰苏世哲(L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世兰哲苏;)V

    .line 26
    .line 27
    .line 28
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言子世兰哲楪苏:I

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->飘花落叶言楪子兰世哲苏(I)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method
