.class public final Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:I

.field public 飘花落叶言子楪世兰苏哲:I

.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/List;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

.field public 飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

.field public final synthetic 飘花落叶言子楪苏世兰哲:Landroidx/recyclerview/widget/RecyclerView;

.field public 飘花落叶言子楪苏世哲兰:Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世兰哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    iput p1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世兰苏哲:I

    .line 31
    .line 32
    iput p1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世兰哲苏:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;Z)V
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世哲兰:Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰:Landroid/util/SparseArray;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲苏兰:Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    if-nez p2, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    move p1, p0

    .line 22
    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-ge p1, p2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    check-cast p2, Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;

    .line 37
    .line 38
    iget-object p2, p2, Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 39
    .line 40
    move v1, p0

    .line 41
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-ge v1, v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 52
    .line 53
    iget-object v2, v2, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 54
    .line 55
    invoke-static {v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世哲兰:Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世兰哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世苏哲兰楪:Z

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p0, v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲苏兰:Ljava/util/Set;

    .line 16
    .line 17
    invoke-interface {p0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(I)Landroid/view/View;
    .locals 2

    .line 1
    const-wide v0, 0x7fffffffffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏兰哲世(IJ)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 11
    .line 12
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世哲兰:Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰:Landroid/util/SparseArray;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 19
    .line 20
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲苏兰:Ljava/util/Set;

    .line 30
    .line 31
    iput-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世哲兰:Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世兰苏哲()V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世哲兰:Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;

    .line 37
    .line 38
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(I)I
    .locals 4

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世兰哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰哲世楪:Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;

    .line 4
    .line 5
    if-ltz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge p1, v1, :cond_1

    .line 12
    .line 13
    iget-boolean v0, v0, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return p1

    .line 18
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪兰世哲苏:Landroidx/appcompat/widget/飘花落叶言子楪兰世哲苏;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲(II)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 27
    .line 28
    const-string v2, "invalid position "

    .line 29
    .line 30
    const-string v3, ". State item count is "

    .line 31
    .line 32
    invoke-static {p1, v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪兰哲苏()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {v1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v1
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;Z)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪哲世苏兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世兰哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子哲世楪苏兰:Landroidx/recyclerview/widget/飘花落叶言子哲楪兰世苏;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iget-object v2, v2, Landroidx/recyclerview/widget/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪兰世哲苏:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏兰世;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v2, v2, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪兰世哲苏:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroidx/core/view/飘花落叶言子楪世苏兰哲;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v2, v3

    .line 27
    :goto_0
    invoke-static {v0, v2}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏兰世(Landroid/view/View;Landroidx/core/view/飘花落叶言子楪世苏兰哲;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    if-eqz p2, :cond_5

    .line 31
    .line 32
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪兰哲苏:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-gtz v0, :cond_4

    .line 39
    .line 40
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 41
    .line 42
    if-eqz p2, :cond_2

    .line 43
    .line 44
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲兰苏世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰哲世楪:Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;

    .line 48
    .line 49
    if-eqz p2, :cond_3

    .line 50
    .line 51
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪兰苏哲世:Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪哲苏兰世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    sget-boolean p2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子哲兰世苏楪:Z

    .line 57
    .line 58
    if-eqz p2, :cond_5

    .line 59
    .line 60
    new-instance p2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v0, "dispatchViewRecycled: "

    .line 63
    .line 64
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    const-string v0, "RecyclerView"

    .line 75
    .line 76
    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    const/4 p0, 0x0

    .line 81
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_5
    :goto_1
    iput-object v3, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mBindingAdapter:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 93
    .line 94
    iput-object v3, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mOwnerRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 95
    .line 96
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲苏兰()Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getItemViewType()I

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰(I)Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object v0, v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 112
    .line 113
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰:Landroid/util/SparseArray;

    .line 114
    .line 115
    invoke-virtual {p0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;

    .line 120
    .line 121
    iget p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    if-gt p0, p2, :cond_6

    .line 128
    .line 129
    iget-object p0, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 130
    .line 131
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏(Landroid/view/View;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_6
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子哲兰世楪苏:Z

    .line 136
    .line 137
    if-eqz p0, :cond_8

    .line 138
    .line 139
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    if-nez p0, :cond_7

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_7
    const-string p0, "this scrap item already exists"

    .line 147
    .line 148
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_8
    :goto_2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->resetInternal()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    return-void
.end method

.method public final 飘花落叶言子楪哲世兰苏()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世兰哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪兰苏哲:Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世兰苏哲:I

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    iput v1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世兰哲苏:I

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    :goto_1
    if-ltz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget v3, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世兰哲苏:I

    .line 31
    .line 32
    if-le v2, v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世兰哲(I)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, -0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪哲世苏兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mInChangeScrap:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 p0, 0x0

    .line 17
    iput-object p0, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mScrapContainer:Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    iput-boolean p0, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mInChangeScrap:Z

    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->clearReturnedFromScrapFlag()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(I)V
    .locals 5

    .line 1
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子哲兰世苏楪:Z

    .line 2
    .line 3
    const-string v1, "RecyclerView"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "Recycling cached view at index "

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 31
    .line 32
    sget-boolean v3, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子哲兰世苏楪:Z

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    new-instance v3, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v4, "CachedViewHolder to be recycled: "

    .line 39
    .line 40
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    :cond_1
    const/4 v1, 0x1

    .line 54
    invoke-virtual {p0, v2, v1}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏哲兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世兰哲(I)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 18
    .line 19
    .line 20
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子兰楪世哲苏:Z

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世兰哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰哲楪世:Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, [I

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const/4 v1, -0x1

    .line 35
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 36
    .line 37
    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    iput v0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:I

    .line 40
    .line 41
    :cond_2
    return-void
.end method

.method public final 飘花落叶言子楪苏兰世哲(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世哲兰楪苏(Landroid/view/View;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/16 v0, 0xc

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->hasAnyOfTheFlags(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世兰哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isUpdated()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏楪兰哲世:Landroidx/recyclerview/widget/飘花落叶言子苏楪兰世哲;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getUnmodifiedPayloads()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget-boolean v0, v0, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世哲兰:Z

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isInvalid()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 49
    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    new-instance v0, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 58
    .line 59
    :cond_1
    const/4 v0, 0x1

    .line 60
    invoke-virtual {p1, p0, v0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->setScrapContainer(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Z)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isInvalid()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRemoved()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_4

    .line 80
    .line 81
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 82
    .line 83
    iget-boolean v0, v0, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 84
    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪兰哲苏()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const-string p1, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    .line 93
    .line 94
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_4
    :goto_1
    const/4 v0, 0x0

    .line 103
    invoke-virtual {p1, p0, v0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->setScrapContainer(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Z)V

    .line 104
    .line 105
    .line 106
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final 飘花落叶言子楪苏兰哲世(IJ)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世兰哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v3, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰哲世楪:Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;

    .line 8
    .line 9
    if-ltz v1, :cond_4c

    .line 10
    .line 11
    invoke-virtual {v3}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-ge v1, v4, :cond_4c

    .line 16
    .line 17
    iget-boolean v4, v3, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 18
    .line 19
    const/16 v5, 0x20

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    if-eqz v4, :cond_5

    .line 24
    .line 25
    iget-object v4, v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 26
    .line 27
    if-eqz v4, :cond_4

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_0
    move v9, v8

    .line 37
    :goto_0
    if-ge v9, v4, :cond_2

    .line 38
    .line 39
    iget-object v10, v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v10

    .line 45
    check-cast v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 46
    .line 47
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->wasReturnedFromScrap()Z

    .line 48
    .line 49
    .line 50
    move-result v11

    .line 51
    if-nez v11, :cond_1

    .line 52
    .line 53
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getLayoutPosition()I

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    if-ne v11, v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {v10, v5}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->addFlags(I)V

    .line 60
    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 67
    .line 68
    iget-boolean v9, v9, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 69
    .line 70
    if-eqz v9, :cond_4

    .line 71
    .line 72
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪兰世哲苏:Landroidx/appcompat/widget/飘花落叶言子楪兰世哲苏;

    .line 73
    .line 74
    invoke-virtual {v9, v1, v8}, Landroidx/appcompat/widget/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲(II)I

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    if-lez v9, :cond_4

    .line 79
    .line 80
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 81
    .line 82
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲苏兰()I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-ge v9, v10, :cond_4

    .line 87
    .line 88
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 89
    .line 90
    invoke-virtual {v10, v9}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲兰苏(I)J

    .line 91
    .line 92
    .line 93
    move-result-wide v9

    .line 94
    move v11, v8

    .line 95
    :goto_1
    if-ge v11, v4, :cond_4

    .line 96
    .line 97
    iget-object v12, v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v12

    .line 103
    check-cast v12, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 104
    .line 105
    invoke-virtual {v12}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->wasReturnedFromScrap()Z

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    if-nez v13, :cond_3

    .line 110
    .line 111
    invoke-virtual {v12}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getItemId()J

    .line 112
    .line 113
    .line 114
    move-result-wide v13

    .line 115
    cmp-long v13, v13, v9

    .line 116
    .line 117
    if-nez v13, :cond_3

    .line 118
    .line 119
    invoke-virtual {v12, v5}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->addFlags(I)V

    .line 120
    .line 121
    .line 122
    move-object v10, v12

    .line 123
    goto :goto_3

    .line 124
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    :goto_2
    move-object v10, v6

    .line 128
    :goto_3
    if-eqz v10, :cond_6

    .line 129
    .line 130
    const/4 v4, 0x1

    .line 131
    goto :goto_4

    .line 132
    :cond_5
    move-object v10, v6

    .line 133
    :cond_6
    move v4, v8

    .line 134
    :goto_4
    iget-object v9, v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 135
    .line 136
    iget-object v11, v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 137
    .line 138
    const-string v12, "RecyclerView"

    .line 139
    .line 140
    if-nez v10, :cond_1f

    .line 141
    .line 142
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    move v13, v8

    .line 147
    :goto_5
    if-ge v13, v10, :cond_9

    .line 148
    .line 149
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v14

    .line 153
    check-cast v14, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 154
    .line 155
    invoke-virtual {v14}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->wasReturnedFromScrap()Z

    .line 156
    .line 157
    .line 158
    move-result v15

    .line 159
    if-nez v15, :cond_8

    .line 160
    .line 161
    invoke-virtual {v14}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getLayoutPosition()I

    .line 162
    .line 163
    .line 164
    move-result v15

    .line 165
    if-ne v15, v1, :cond_8

    .line 166
    .line 167
    invoke-virtual {v14}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isInvalid()Z

    .line 168
    .line 169
    .line 170
    move-result v15

    .line 171
    if-nez v15, :cond_8

    .line 172
    .line 173
    iget-boolean v15, v3, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 174
    .line 175
    if-nez v15, :cond_7

    .line 176
    .line 177
    invoke-virtual {v14}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRemoved()Z

    .line 178
    .line 179
    .line 180
    move-result v15

    .line 181
    if-nez v15, :cond_8

    .line 182
    .line 183
    :cond_7
    invoke-virtual {v14, v5}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->addFlags(I)V

    .line 184
    .line 185
    .line 186
    move-object v10, v14

    .line 187
    const/16 v17, 0x1

    .line 188
    .line 189
    goto/16 :goto_b

    .line 190
    .line 191
    :cond_8
    add-int/lit8 v13, v13, 0x1

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_9
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪兰苏世哲:Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;

    .line 195
    .line 196
    iget-object v10, v10, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v10, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 201
    .line 202
    .line 203
    move-result v13

    .line 204
    move v14, v8

    .line 205
    :goto_6
    if-ge v14, v13, :cond_b

    .line 206
    .line 207
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v15

    .line 211
    check-cast v15, Landroid/view/View;

    .line 212
    .line 213
    invoke-static {v15}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世哲兰楪苏(Landroid/view/View;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 214
    .line 215
    .line 216
    move-result-object v16

    .line 217
    const/16 v17, 0x1

    .line 218
    .line 219
    invoke-virtual/range {v16 .. v16}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getLayoutPosition()I

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    if-ne v7, v1, :cond_a

    .line 224
    .line 225
    invoke-virtual/range {v16 .. v16}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isInvalid()Z

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    if-nez v7, :cond_a

    .line 230
    .line 231
    invoke-virtual/range {v16 .. v16}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRemoved()Z

    .line 232
    .line 233
    .line 234
    move-result v7

    .line 235
    if-nez v7, :cond_a

    .line 236
    .line 237
    goto :goto_7

    .line 238
    :cond_a
    add-int/lit8 v14, v14, 0x1

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_b
    const/16 v17, 0x1

    .line 242
    .line 243
    move-object v15, v6

    .line 244
    :goto_7
    if-eqz v15, :cond_11

    .line 245
    .line 246
    invoke-static {v15}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世哲兰楪苏(Landroid/view/View;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪兰苏世哲:Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;

    .line 251
    .line 252
    iget-object v13, v10, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v13, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;

    .line 255
    .line 256
    iget-object v14, v10, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v14, Landroidx/recyclerview/widget/飘花落叶言子世兰苏哲楪;

    .line 259
    .line 260
    iget-object v14, v14, Landroidx/recyclerview/widget/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/RecyclerView;

    .line 261
    .line 262
    invoke-virtual {v14, v15}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 263
    .line 264
    .line 265
    move-result v14

    .line 266
    if-ltz v14, :cond_10

    .line 267
    .line 268
    invoke-virtual {v13, v14}, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(I)Z

    .line 269
    .line 270
    .line 271
    move-result v16

    .line 272
    if-eqz v16, :cond_f

    .line 273
    .line 274
    invoke-virtual {v13, v14}, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v10, v15}, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世(Landroid/view/View;)V

    .line 278
    .line 279
    .line 280
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪兰苏世哲:Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;

    .line 281
    .line 282
    iget-object v13, v10, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v13, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;

    .line 285
    .line 286
    iget-object v10, v10, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v10, Landroidx/recyclerview/widget/飘花落叶言子世兰苏哲楪;

    .line 289
    .line 290
    iget-object v10, v10, Landroidx/recyclerview/widget/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/RecyclerView;

    .line 291
    .line 292
    invoke-virtual {v10, v15}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 293
    .line 294
    .line 295
    move-result v10

    .line 296
    const/4 v14, -0x1

    .line 297
    if-ne v10, v14, :cond_c

    .line 298
    .line 299
    goto :goto_8

    .line 300
    :cond_c
    invoke-virtual {v13, v10}, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(I)Z

    .line 301
    .line 302
    .line 303
    move-result v16

    .line 304
    if-eqz v16, :cond_d

    .line 305
    .line 306
    :goto_8
    move v10, v14

    .line 307
    goto :goto_9

    .line 308
    :cond_d
    invoke-virtual {v13, v10}, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)I

    .line 309
    .line 310
    .line 311
    move-result v13

    .line 312
    sub-int/2addr v10, v13

    .line 313
    :goto_9
    if-eq v10, v14, :cond_e

    .line 314
    .line 315
    iget-object v13, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪兰苏世哲:Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;

    .line 316
    .line 317
    invoke-virtual {v13, v10}, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0, v15}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏兰世哲(Landroid/view/View;)V

    .line 321
    .line 322
    .line 323
    const/16 v10, 0x2020

    .line 324
    .line 325
    invoke-virtual {v7, v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->addFlags(I)V

    .line 326
    .line 327
    .line 328
    move-object v10, v7

    .line 329
    goto :goto_b

    .line 330
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    const-string v1, "layout index should not be -1 after unhiding a view:"

    .line 333
    .line 334
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪兰哲苏()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 345
    .line 346
    .line 347
    return-object v6

    .line 348
    :cond_f
    const-string v0, "trying to unhide a view that was not hidden"

    .line 349
    .line 350
    invoke-static {v15, v0}, Lcom/google/protobuf/飘花落叶言楪苏兰哲子世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    return-object v6

    .line 354
    :cond_10
    const-string v0, "view is not a child, cannot hide "

    .line 355
    .line 356
    invoke-static {v15, v0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    return-object v6

    .line 360
    :cond_11
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 361
    .line 362
    .line 363
    move-result v7

    .line 364
    move v10, v8

    .line 365
    :goto_a
    if-ge v10, v7, :cond_14

    .line 366
    .line 367
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v13

    .line 371
    check-cast v13, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 372
    .line 373
    invoke-virtual {v13}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isInvalid()Z

    .line 374
    .line 375
    .line 376
    move-result v14

    .line 377
    if-nez v14, :cond_13

    .line 378
    .line 379
    invoke-virtual {v13}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getLayoutPosition()I

    .line 380
    .line 381
    .line 382
    move-result v14

    .line 383
    if-ne v14, v1, :cond_13

    .line 384
    .line 385
    invoke-virtual {v13}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isAttachedToTransitionOverlay()Z

    .line 386
    .line 387
    .line 388
    move-result v14

    .line 389
    if-nez v14, :cond_13

    .line 390
    .line 391
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    sget-boolean v7, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子哲兰世苏楪:Z

    .line 395
    .line 396
    if-eqz v7, :cond_12

    .line 397
    .line 398
    new-instance v7, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    const-string v10, "getScrapOrHiddenOrCachedHolderForPosition("

    .line 401
    .line 402
    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    const-string v10, ") found match in cache: "

    .line 409
    .line 410
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    invoke-static {v12, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 421
    .line 422
    .line 423
    :cond_12
    move-object v10, v13

    .line 424
    goto :goto_b

    .line 425
    :cond_13
    add-int/lit8 v10, v10, 0x1

    .line 426
    .line 427
    goto :goto_a

    .line 428
    :cond_14
    move-object v10, v6

    .line 429
    :goto_b
    if-eqz v10, :cond_20

    .line 430
    .line 431
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRemoved()Z

    .line 432
    .line 433
    .line 434
    move-result v7

    .line 435
    if-eqz v7, :cond_17

    .line 436
    .line 437
    sget-boolean v7, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子哲兰世楪苏:Z

    .line 438
    .line 439
    if-eqz v7, :cond_16

    .line 440
    .line 441
    iget-boolean v7, v3, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 442
    .line 443
    if-eqz v7, :cond_15

    .line 444
    .line 445
    goto :goto_c

    .line 446
    :cond_15
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪兰哲苏()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    const-string v1, "should not receive a removed view unless it is pre layout"

    .line 451
    .line 452
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    return-object v6

    .line 460
    :cond_16
    :goto_c
    iget-boolean v7, v3, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 461
    .line 462
    goto :goto_d

    .line 463
    :cond_17
    iget v7, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mPosition:I

    .line 464
    .line 465
    if-ltz v7, :cond_1e

    .line 466
    .line 467
    iget-object v13, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 468
    .line 469
    invoke-virtual {v13}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲苏兰()I

    .line 470
    .line 471
    .line 472
    move-result v13

    .line 473
    if-ge v7, v13, :cond_1e

    .line 474
    .line 475
    iget-boolean v7, v3, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 476
    .line 477
    if-nez v7, :cond_19

    .line 478
    .line 479
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 480
    .line 481
    iget v13, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mPosition:I

    .line 482
    .line 483
    invoke-virtual {v7, v13}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世兰苏哲(I)I

    .line 484
    .line 485
    .line 486
    move-result v7

    .line 487
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getItemViewType()I

    .line 488
    .line 489
    .line 490
    move-result v13

    .line 491
    if-eq v7, v13, :cond_19

    .line 492
    .line 493
    :cond_18
    move v7, v8

    .line 494
    goto :goto_d

    .line 495
    :cond_19
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 496
    .line 497
    iget-boolean v7, v7, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 498
    .line 499
    if-eqz v7, :cond_1a

    .line 500
    .line 501
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getItemId()J

    .line 502
    .line 503
    .line 504
    move-result-wide v13

    .line 505
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 506
    .line 507
    iget v15, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mPosition:I

    .line 508
    .line 509
    invoke-virtual {v7, v15}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲兰苏(I)J

    .line 510
    .line 511
    .line 512
    move-result-wide v15

    .line 513
    cmp-long v7, v13, v15

    .line 514
    .line 515
    if-nez v7, :cond_18

    .line 516
    .line 517
    :cond_1a
    move/from16 v7, v17

    .line 518
    .line 519
    :goto_d
    if-nez v7, :cond_1d

    .line 520
    .line 521
    const/4 v7, 0x4

    .line 522
    invoke-virtual {v10, v7}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->addFlags(I)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isScrap()Z

    .line 526
    .line 527
    .line 528
    move-result v7

    .line 529
    if-eqz v7, :cond_1b

    .line 530
    .line 531
    iget-object v7, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 532
    .line 533
    invoke-virtual {v2, v7, v8}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->unScrap()V

    .line 537
    .line 538
    .line 539
    goto :goto_e

    .line 540
    :cond_1b
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->wasReturnedFromScrap()Z

    .line 541
    .line 542
    .line 543
    move-result v7

    .line 544
    if-eqz v7, :cond_1c

    .line 545
    .line 546
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->clearReturnedFromScrapFlag()V

    .line 547
    .line 548
    .line 549
    :cond_1c
    :goto_e
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏哲兰世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V

    .line 550
    .line 551
    .line 552
    move-object v10, v6

    .line 553
    goto :goto_f

    .line 554
    :cond_1d
    move/from16 v4, v17

    .line 555
    .line 556
    goto :goto_f

    .line 557
    :cond_1e
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 558
    .line 559
    new-instance v1, Ljava/lang/StringBuilder;

    .line 560
    .line 561
    const-string v3, "Inconsistency detected. Invalid view holder adapter position"

    .line 562
    .line 563
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪兰哲苏()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    throw v0

    .line 584
    :cond_1f
    const/16 v17, 0x1

    .line 585
    .line 586
    :cond_20
    :goto_f
    const-wide/16 v18, 0x0

    .line 587
    .line 588
    const-wide v20, 0x7fffffffffffffffL

    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    if-nez v10, :cond_35

    .line 594
    .line 595
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪兰世哲苏:Landroidx/appcompat/widget/飘花落叶言子楪兰世哲苏;

    .line 596
    .line 597
    invoke-virtual {v7, v1, v8}, Landroidx/appcompat/widget/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲(II)I

    .line 598
    .line 599
    .line 600
    move-result v7

    .line 601
    if-ltz v7, :cond_34

    .line 602
    .line 603
    const-wide/16 v22, 0x3

    .line 604
    .line 605
    iget-object v13, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 606
    .line 607
    invoke-virtual {v13}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲苏兰()I

    .line 608
    .line 609
    .line 610
    move-result v13

    .line 611
    if-ge v7, v13, :cond_34

    .line 612
    .line 613
    iget-object v13, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 614
    .line 615
    invoke-virtual {v13, v7}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世兰苏哲(I)I

    .line 616
    .line 617
    .line 618
    move-result v13

    .line 619
    iget-object v14, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 620
    .line 621
    const-wide/16 v24, 0x4

    .line 622
    .line 623
    iget-boolean v15, v14, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 624
    .line 625
    if-eqz v15, :cond_28

    .line 626
    .line 627
    invoke-virtual {v14, v7}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲兰苏(I)J

    .line 628
    .line 629
    .line 630
    move-result-wide v14

    .line 631
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 632
    .line 633
    .line 634
    move-result v10

    .line 635
    add-int/lit8 v10, v10, -0x1

    .line 636
    .line 637
    :goto_10
    if-ltz v10, :cond_24

    .line 638
    .line 639
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v16

    .line 643
    move-object/from16 v6, v16

    .line 644
    .line 645
    check-cast v6, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 646
    .line 647
    invoke-virtual {v6}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getItemId()J

    .line 648
    .line 649
    .line 650
    move-result-wide v27

    .line 651
    cmp-long v16, v27, v14

    .line 652
    .line 653
    if-nez v16, :cond_23

    .line 654
    .line 655
    invoke-virtual {v6}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->wasReturnedFromScrap()Z

    .line 656
    .line 657
    .line 658
    move-result v16

    .line 659
    if-nez v16, :cond_23

    .line 660
    .line 661
    invoke-virtual {v6}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getItemViewType()I

    .line 662
    .line 663
    .line 664
    move-result v8

    .line 665
    if-ne v13, v8, :cond_22

    .line 666
    .line 667
    invoke-virtual {v6, v5}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->addFlags(I)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v6}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRemoved()Z

    .line 671
    .line 672
    .line 673
    move-result v5

    .line 674
    if-eqz v5, :cond_21

    .line 675
    .line 676
    iget-boolean v5, v3, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 677
    .line 678
    if-nez v5, :cond_21

    .line 679
    .line 680
    const/4 v5, 0x2

    .line 681
    const/16 v8, 0xe

    .line 682
    .line 683
    invoke-virtual {v6, v5, v8}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->setFlags(II)V

    .line 684
    .line 685
    .line 686
    :cond_21
    :goto_11
    move-object v10, v6

    .line 687
    goto :goto_13

    .line 688
    :cond_22
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    iget-object v8, v6, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 692
    .line 693
    const/4 v5, 0x0

    .line 694
    invoke-virtual {v2, v8, v5}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 695
    .line 696
    .line 697
    iget-object v6, v6, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 698
    .line 699
    invoke-static {v6}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世哲兰楪苏(Landroid/view/View;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 700
    .line 701
    .line 702
    move-result-object v6

    .line 703
    const/4 v8, 0x0

    .line 704
    iput-object v8, v6, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mScrapContainer:Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;

    .line 705
    .line 706
    iput-boolean v5, v6, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mInChangeScrap:Z

    .line 707
    .line 708
    invoke-virtual {v6}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->clearReturnedFromScrapFlag()V

    .line 709
    .line 710
    .line 711
    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏哲兰世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V

    .line 712
    .line 713
    .line 714
    :cond_23
    add-int/lit8 v10, v10, -0x1

    .line 715
    .line 716
    const/16 v5, 0x20

    .line 717
    .line 718
    const/4 v6, 0x0

    .line 719
    const/4 v8, 0x0

    .line 720
    goto :goto_10

    .line 721
    :cond_24
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 722
    .line 723
    .line 724
    move-result v5

    .line 725
    add-int/lit8 v5, v5, -0x1

    .line 726
    .line 727
    :goto_12
    if-ltz v5, :cond_26

    .line 728
    .line 729
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v6

    .line 733
    check-cast v6, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 734
    .line 735
    invoke-virtual {v6}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getItemId()J

    .line 736
    .line 737
    .line 738
    move-result-wide v8

    .line 739
    cmp-long v8, v8, v14

    .line 740
    .line 741
    if-nez v8, :cond_27

    .line 742
    .line 743
    invoke-virtual {v6}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isAttachedToTransitionOverlay()Z

    .line 744
    .line 745
    .line 746
    move-result v8

    .line 747
    if-nez v8, :cond_27

    .line 748
    .line 749
    invoke-virtual {v6}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getItemViewType()I

    .line 750
    .line 751
    .line 752
    move-result v8

    .line 753
    if-ne v13, v8, :cond_25

    .line 754
    .line 755
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    goto :goto_11

    .line 759
    :cond_25
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世兰哲(I)V

    .line 760
    .line 761
    .line 762
    :cond_26
    const/4 v10, 0x0

    .line 763
    goto :goto_13

    .line 764
    :cond_27
    add-int/lit8 v5, v5, -0x1

    .line 765
    .line 766
    goto :goto_12

    .line 767
    :goto_13
    if-eqz v10, :cond_28

    .line 768
    .line 769
    iput v7, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mPosition:I

    .line 770
    .line 771
    move/from16 v4, v17

    .line 772
    .line 773
    :cond_28
    if-nez v10, :cond_2d

    .line 774
    .line 775
    sget-boolean v5, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子哲兰世苏楪:Z

    .line 776
    .line 777
    if-eqz v5, :cond_29

    .line 778
    .line 779
    new-instance v5, Ljava/lang/StringBuilder;

    .line 780
    .line 781
    const-string v6, "tryGetViewHolderForPositionByDeadline("

    .line 782
    .line 783
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    const-string v6, ") fetching from shared pool"

    .line 790
    .line 791
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v5

    .line 798
    invoke-static {v12, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 799
    .line 800
    .line 801
    :cond_29
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲苏兰()Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;

    .line 802
    .line 803
    .line 804
    move-result-object v5

    .line 805
    iget-object v5, v5, Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰:Landroid/util/SparseArray;

    .line 806
    .line 807
    invoke-virtual {v5, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v5

    .line 811
    check-cast v5, Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;

    .line 812
    .line 813
    if-eqz v5, :cond_2b

    .line 814
    .line 815
    iget-object v5, v5, Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 816
    .line 817
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 818
    .line 819
    .line 820
    move-result v6

    .line 821
    if-nez v6, :cond_2b

    .line 822
    .line 823
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 824
    .line 825
    .line 826
    move-result v6

    .line 827
    add-int/lit8 v6, v6, -0x1

    .line 828
    .line 829
    :goto_14
    if-ltz v6, :cond_2b

    .line 830
    .line 831
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v7

    .line 835
    check-cast v7, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 836
    .line 837
    invoke-virtual {v7}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isAttachedToTransitionOverlay()Z

    .line 838
    .line 839
    .line 840
    move-result v7

    .line 841
    if-nez v7, :cond_2a

    .line 842
    .line 843
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v5

    .line 847
    check-cast v5, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 848
    .line 849
    goto :goto_15

    .line 850
    :cond_2a
    add-int/lit8 v6, v6, -0x1

    .line 851
    .line 852
    goto :goto_14

    .line 853
    :cond_2b
    const/4 v5, 0x0

    .line 854
    :goto_15
    if-eqz v5, :cond_2c

    .line 855
    .line 856
    invoke-virtual {v5}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->resetInternal()V

    .line 857
    .line 858
    .line 859
    sget-boolean v6, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子哲兰世楪苏:Z

    .line 860
    .line 861
    :cond_2c
    move-object v10, v5

    .line 862
    :cond_2d
    if-nez v10, :cond_36

    .line 863
    .line 864
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 865
    .line 866
    .line 867
    move-result-wide v5

    .line 868
    cmp-long v7, p2, v20

    .line 869
    .line 870
    if-eqz v7, :cond_2f

    .line 871
    .line 872
    iget-object v7, v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世哲兰:Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;

    .line 873
    .line 874
    invoke-virtual {v7, v13}, Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰(I)Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;

    .line 875
    .line 876
    .line 877
    move-result-object v7

    .line 878
    iget-wide v7, v7, Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世哲苏兰:J

    .line 879
    .line 880
    cmp-long v9, v7, v18

    .line 881
    .line 882
    if-eqz v9, :cond_2f

    .line 883
    .line 884
    add-long/2addr v7, v5

    .line 885
    cmp-long v7, v7, p2

    .line 886
    .line 887
    if-gez v7, :cond_2e

    .line 888
    .line 889
    goto :goto_16

    .line 890
    :cond_2e
    const/16 v26, 0x0

    .line 891
    .line 892
    return-object v26

    .line 893
    :cond_2f
    :goto_16
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 894
    .line 895
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    :try_start_0
    invoke-static {}, Landroidx/core/os/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰()Z

    .line 899
    .line 900
    .line 901
    move-result v8

    .line 902
    if-eqz v8, :cond_30

    .line 903
    .line 904
    const-string v8, "RV onCreateViewHolder type=0x%X"

    .line 905
    .line 906
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 907
    .line 908
    .line 909
    move-result-object v9

    .line 910
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v9

    .line 914
    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v8

    .line 918
    invoke-static {v8}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 919
    .line 920
    .line 921
    :cond_30
    invoke-virtual {v7, v13, v2}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲世苏兰(ILandroid/view/ViewGroup;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 922
    .line 923
    .line 924
    move-result-object v10

    .line 925
    iget-object v7, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 926
    .line 927
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 928
    .line 929
    .line 930
    move-result-object v7

    .line 931
    if-nez v7, :cond_33

    .line 932
    .line 933
    iput v13, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mItemViewType:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 934
    .line 935
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 936
    .line 937
    .line 938
    sget-boolean v7, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子兰楪世哲苏:Z

    .line 939
    .line 940
    if-eqz v7, :cond_31

    .line 941
    .line 942
    iget-object v7, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 943
    .line 944
    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世苏兰楪哲(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 945
    .line 946
    .line 947
    move-result-object v7

    .line 948
    if-eqz v7, :cond_31

    .line 949
    .line 950
    new-instance v8, Ljava/lang/ref/WeakReference;

    .line 951
    .line 952
    invoke-direct {v8, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 953
    .line 954
    .line 955
    iput-object v8, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mNestedRecyclerView:Ljava/lang/ref/WeakReference;

    .line 956
    .line 957
    :cond_31
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 958
    .line 959
    .line 960
    move-result-wide v7

    .line 961
    iget-object v9, v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世哲兰:Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;

    .line 962
    .line 963
    sub-long/2addr v7, v5

    .line 964
    invoke-virtual {v9, v13}, Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰(I)Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;

    .line 965
    .line 966
    .line 967
    move-result-object v5

    .line 968
    iget-wide v13, v5, Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世哲苏兰:J

    .line 969
    .line 970
    cmp-long v6, v13, v18

    .line 971
    .line 972
    if-nez v6, :cond_32

    .line 973
    .line 974
    goto :goto_17

    .line 975
    :cond_32
    div-long v13, v13, v24

    .line 976
    .line 977
    mul-long v13, v13, v22

    .line 978
    .line 979
    div-long v7, v7, v24

    .line 980
    .line 981
    add-long/2addr v7, v13

    .line 982
    :goto_17
    iput-wide v7, v5, Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世哲苏兰:J

    .line 983
    .line 984
    sget-boolean v5, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子哲兰世苏楪:Z

    .line 985
    .line 986
    if-eqz v5, :cond_36

    .line 987
    .line 988
    const-string v5, "tryGetViewHolderForPositionByDeadline created new ViewHolder"

    .line 989
    .line 990
    invoke-static {v12, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 991
    .line 992
    .line 993
    goto :goto_18

    .line 994
    :cond_33
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 995
    .line 996
    const-string v1, "ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"

    .line 997
    .line 998
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1002
    :catchall_0
    move-exception v0

    .line 1003
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1004
    .line 1005
    .line 1006
    throw v0

    .line 1007
    :cond_34
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 1008
    .line 1009
    const-string v4, "(offset:"

    .line 1010
    .line 1011
    const-string v5, ").state:"

    .line 1012
    .line 1013
    const-string v6, "Inconsistency detected. Invalid item position "

    .line 1014
    .line 1015
    invoke-static {v1, v7, v6, v4, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v1

    .line 1019
    invoke-virtual {v3}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 1020
    .line 1021
    .line 1022
    move-result v3

    .line 1023
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1024
    .line 1025
    .line 1026
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪兰哲苏()Ljava/lang/String;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v2

    .line 1030
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v1

    .line 1037
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1038
    .line 1039
    .line 1040
    throw v0

    .line 1041
    :cond_35
    const-wide/16 v22, 0x3

    .line 1042
    .line 1043
    const-wide/16 v24, 0x4

    .line 1044
    .line 1045
    :cond_36
    :goto_18
    if-eqz v4, :cond_37

    .line 1046
    .line 1047
    iget-boolean v5, v3, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 1048
    .line 1049
    if-nez v5, :cond_37

    .line 1050
    .line 1051
    const/16 v5, 0x2000

    .line 1052
    .line 1053
    invoke-virtual {v10, v5}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->hasAnyOfTheFlags(I)Z

    .line 1054
    .line 1055
    .line 1056
    move-result v6

    .line 1057
    if-eqz v6, :cond_37

    .line 1058
    .line 1059
    const/4 v6, 0x0

    .line 1060
    invoke-virtual {v10, v6, v5}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->setFlags(II)V

    .line 1061
    .line 1062
    .line 1063
    iget-boolean v5, v3, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏哲兰世:Z

    .line 1064
    .line 1065
    if-eqz v5, :cond_37

    .line 1066
    .line 1067
    invoke-static {v10}, Landroidx/recyclerview/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏兰哲(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V

    .line 1068
    .line 1069
    .line 1070
    iget-object v5, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏楪兰哲世:Landroidx/recyclerview/widget/飘花落叶言子苏楪兰世哲;

    .line 1071
    .line 1072
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getUnmodifiedPayloads()Ljava/util/List;

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1076
    .line 1077
    .line 1078
    new-instance v5, Landroidx/compose/foundation/text/飘花落叶言子哲楪苏兰世;

    .line 1079
    .line 1080
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v5, v10}, Landroidx/compose/foundation/text/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世哲苏兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual {v2, v10, v5}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏世楪哲兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;Landroidx/compose/foundation/text/飘花落叶言子哲楪苏兰世;)V

    .line 1087
    .line 1088
    .line 1089
    :cond_37
    iget-boolean v5, v3, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 1090
    .line 1091
    if-eqz v5, :cond_38

    .line 1092
    .line 1093
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isBound()Z

    .line 1094
    .line 1095
    .line 1096
    move-result v5

    .line 1097
    if-eqz v5, :cond_38

    .line 1098
    .line 1099
    iput v1, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mPreLayoutPosition:I

    .line 1100
    .line 1101
    goto :goto_19

    .line 1102
    :cond_38
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isBound()Z

    .line 1103
    .line 1104
    .line 1105
    move-result v5

    .line 1106
    if-eqz v5, :cond_3a

    .line 1107
    .line 1108
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->needsUpdate()Z

    .line 1109
    .line 1110
    .line 1111
    move-result v5

    .line 1112
    if-nez v5, :cond_3a

    .line 1113
    .line 1114
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isInvalid()Z

    .line 1115
    .line 1116
    .line 1117
    move-result v5

    .line 1118
    if-eqz v5, :cond_39

    .line 1119
    .line 1120
    goto :goto_1a

    .line 1121
    :cond_39
    :goto_19
    move/from16 v5, v17

    .line 1122
    .line 1123
    const/4 v6, 0x0

    .line 1124
    const/16 v16, 0x0

    .line 1125
    .line 1126
    goto/16 :goto_23

    .line 1127
    .line 1128
    :cond_3a
    :goto_1a
    sget-boolean v5, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子哲兰世楪苏:Z

    .line 1129
    .line 1130
    if-eqz v5, :cond_3b

    .line 1131
    .line 1132
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRemoved()Z

    .line 1133
    .line 1134
    .line 1135
    move-result v5

    .line 1136
    if-nez v5, :cond_3c

    .line 1137
    .line 1138
    :cond_3b
    const/4 v8, 0x0

    .line 1139
    goto :goto_1b

    .line 1140
    :cond_3c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1141
    .line 1142
    const-string v1, "Removed holder should be bound and it should come here only in pre-layout. Holder: "

    .line 1143
    .line 1144
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪兰哲苏()Ljava/lang/String;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v1

    .line 1154
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 1155
    .line 1156
    .line 1157
    const/4 v8, 0x0

    .line 1158
    return-object v8

    .line 1159
    :goto_1b
    iget-object v5, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪兰世哲苏:Landroidx/appcompat/widget/飘花落叶言子楪兰世哲苏;

    .line 1160
    .line 1161
    const/4 v6, 0x0

    .line 1162
    invoke-virtual {v5, v1, v6}, Landroidx/appcompat/widget/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲(II)I

    .line 1163
    .line 1164
    .line 1165
    move-result v5

    .line 1166
    iput-object v8, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mBindingAdapter:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 1167
    .line 1168
    iput-object v2, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mOwnerRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 1169
    .line 1170
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getItemViewType()I

    .line 1171
    .line 1172
    .line 1173
    move-result v7

    .line 1174
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1175
    .line 1176
    .line 1177
    move-result-wide v11

    .line 1178
    cmp-long v9, p2, v20

    .line 1179
    .line 1180
    if-eqz v9, :cond_3e

    .line 1181
    .line 1182
    iget-object v9, v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世哲兰:Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;

    .line 1183
    .line 1184
    invoke-virtual {v9, v7}, Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰(I)Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v7

    .line 1188
    iget-wide v13, v7, Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世哲兰苏:J

    .line 1189
    .line 1190
    cmp-long v7, v13, v18

    .line 1191
    .line 1192
    if-eqz v7, :cond_3e

    .line 1193
    .line 1194
    add-long/2addr v13, v11

    .line 1195
    cmp-long v7, v13, p2

    .line 1196
    .line 1197
    if-gez v7, :cond_3d

    .line 1198
    .line 1199
    goto :goto_1c

    .line 1200
    :cond_3d
    move v0, v6

    .line 1201
    move/from16 v5, v17

    .line 1202
    .line 1203
    goto/16 :goto_22

    .line 1204
    .line 1205
    :cond_3e
    :goto_1c
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isTmpDetached()Z

    .line 1206
    .line 1207
    .line 1208
    move-result v7

    .line 1209
    if-eqz v7, :cond_3f

    .line 1210
    .line 1211
    iget-object v7, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 1212
    .line 1213
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1214
    .line 1215
    .line 1216
    move-result v9

    .line 1217
    iget-object v13, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 1218
    .line 1219
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v13

    .line 1223
    invoke-static {v2, v7, v9, v13}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪苏世哲兰(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 1224
    .line 1225
    .line 1226
    move/from16 v7, v17

    .line 1227
    .line 1228
    goto :goto_1d

    .line 1229
    :cond_3f
    move v7, v6

    .line 1230
    :goto_1d
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 1231
    .line 1232
    invoke-virtual {v9, v10, v5}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;I)V

    .line 1233
    .line 1234
    .line 1235
    if-eqz v7, :cond_40

    .line 1236
    .line 1237
    iget-object v5, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 1238
    .line 1239
    invoke-static {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪苏世兰哲(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)V

    .line 1240
    .line 1241
    .line 1242
    :cond_40
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1243
    .line 1244
    .line 1245
    move-result-wide v13

    .line 1246
    iget-object v0, v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世哲兰:Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;

    .line 1247
    .line 1248
    invoke-virtual {v10}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getItemViewType()I

    .line 1249
    .line 1250
    .line 1251
    move-result v5

    .line 1252
    sub-long/2addr v13, v11

    .line 1253
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰(I)Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v0

    .line 1257
    iget-wide v11, v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世哲兰苏:J

    .line 1258
    .line 1259
    cmp-long v5, v11, v18

    .line 1260
    .line 1261
    if-nez v5, :cond_41

    .line 1262
    .line 1263
    goto :goto_1e

    .line 1264
    :cond_41
    div-long v11, v11, v24

    .line 1265
    .line 1266
    mul-long v11, v11, v22

    .line 1267
    .line 1268
    div-long v13, v13, v24

    .line 1269
    .line 1270
    add-long/2addr v13, v11

    .line 1271
    :goto_1e
    iput-wide v13, v0, Landroidx/recyclerview/widget/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世哲兰苏:J

    .line 1272
    .line 1273
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世兰楪苏哲:Landroid/view/accessibility/AccessibilityManager;

    .line 1274
    .line 1275
    if-eqz v0, :cond_47

    .line 1276
    .line 1277
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 1278
    .line 1279
    .line 1280
    move-result v0

    .line 1281
    if-eqz v0, :cond_47

    .line 1282
    .line 1283
    iget-object v0, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 1284
    .line 1285
    invoke-virtual {v0}, Landroid/view/View;->getImportantForAccessibility()I

    .line 1286
    .line 1287
    .line 1288
    move-result v5

    .line 1289
    if-nez v5, :cond_42

    .line 1290
    .line 1291
    move/from16 v5, v17

    .line 1292
    .line 1293
    invoke-virtual {v0, v5}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1294
    .line 1295
    .line 1296
    goto :goto_1f

    .line 1297
    :cond_42
    move/from16 v5, v17

    .line 1298
    .line 1299
    :goto_1f
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子哲世楪苏兰:Landroidx/recyclerview/widget/飘花落叶言子哲楪兰世苏;

    .line 1300
    .line 1301
    if-nez v7, :cond_43

    .line 1302
    .line 1303
    goto :goto_21

    .line 1304
    :cond_43
    iget-object v7, v7, Landroidx/recyclerview/widget/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪兰世哲苏:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏兰世;

    .line 1305
    .line 1306
    if-eqz v7, :cond_46

    .line 1307
    .line 1308
    invoke-static {v0}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v9

    .line 1312
    if-nez v9, :cond_44

    .line 1313
    .line 1314
    goto :goto_20

    .line 1315
    :cond_44
    instance-of v8, v9, Landroidx/core/view/飘花落叶言子楪世苏哲兰;

    .line 1316
    .line 1317
    if-eqz v8, :cond_45

    .line 1318
    .line 1319
    check-cast v9, Landroidx/core/view/飘花落叶言子楪世苏哲兰;

    .line 1320
    .line 1321
    iget-object v8, v9, Landroidx/core/view/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子楪世苏兰哲;

    .line 1322
    .line 1323
    goto :goto_20

    .line 1324
    :cond_45
    new-instance v8, Landroidx/core/view/飘花落叶言子楪世苏兰哲;

    .line 1325
    .line 1326
    invoke-direct {v8, v9}, Landroidx/core/view/飘花落叶言子楪世苏兰哲;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 1327
    .line 1328
    .line 1329
    :goto_20
    if-eqz v8, :cond_46

    .line 1330
    .line 1331
    if-eq v8, v7, :cond_46

    .line 1332
    .line 1333
    iget-object v9, v7, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪兰世哲苏:Ljava/util/WeakHashMap;

    .line 1334
    .line 1335
    invoke-virtual {v9, v0, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1336
    .line 1337
    .line 1338
    :cond_46
    invoke-static {v0, v7}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏兰世(Landroid/view/View;Landroidx/core/view/飘花落叶言子楪世苏兰哲;)V

    .line 1339
    .line 1340
    .line 1341
    goto :goto_21

    .line 1342
    :cond_47
    move/from16 v5, v17

    .line 1343
    .line 1344
    :goto_21
    iget-boolean v0, v3, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 1345
    .line 1346
    if-eqz v0, :cond_48

    .line 1347
    .line 1348
    iput v1, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mPreLayoutPosition:I

    .line 1349
    .line 1350
    :cond_48
    move v0, v5

    .line 1351
    :goto_22
    move/from16 v16, v0

    .line 1352
    .line 1353
    :goto_23
    iget-object v0, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 1354
    .line 1355
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v0

    .line 1359
    if-nez v0, :cond_49

    .line 1360
    .line 1361
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v0

    .line 1365
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;

    .line 1366
    .line 1367
    iget-object v1, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 1368
    .line 1369
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1370
    .line 1371
    .line 1372
    goto :goto_24

    .line 1373
    :cond_49
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 1374
    .line 1375
    .line 1376
    move-result v1

    .line 1377
    if-nez v1, :cond_4a

    .line 1378
    .line 1379
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v0

    .line 1383
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;

    .line 1384
    .line 1385
    iget-object v1, v10, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 1386
    .line 1387
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1388
    .line 1389
    .line 1390
    goto :goto_24

    .line 1391
    :cond_4a
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;

    .line 1392
    .line 1393
    :goto_24
    iput-object v10, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 1394
    .line 1395
    if-eqz v4, :cond_4b

    .line 1396
    .line 1397
    if-eqz v16, :cond_4b

    .line 1398
    .line 1399
    move v7, v5

    .line 1400
    goto :goto_25

    .line 1401
    :cond_4b
    move v7, v6

    .line 1402
    :goto_25
    iput-boolean v7, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪兰世苏哲:Z

    .line 1403
    .line 1404
    return-object v10

    .line 1405
    :cond_4c
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 1406
    .line 1407
    const-string v4, "("

    .line 1408
    .line 1409
    const-string v5, "). Item count:"

    .line 1410
    .line 1411
    const-string v6, "Invalid item position "

    .line 1412
    .line 1413
    invoke-static {v1, v1, v6, v4, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v1

    .line 1417
    invoke-virtual {v3}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 1418
    .line 1419
    .line 1420
    move-result v3

    .line 1421
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1422
    .line 1423
    .line 1424
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪兰哲苏()Ljava/lang/String;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v2

    .line 1428
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v1

    .line 1435
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1436
    .line 1437
    .line 1438
    throw v0
.end method

.method public final 飘花落叶言子楪苏哲世兰(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世哲兰楪苏(Landroid/view/View;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isTmpDetached()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世兰哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v2, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isScrap()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->unScrap()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->wasReturnedFromScrap()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->clearReturnedFromScrapFlag()V

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏哲兰世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V

    .line 37
    .line 38
    .line 39
    iget-object p0, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏楪兰哲世:Landroidx/recyclerview/widget/飘花落叶言子苏楪兰世哲;

    .line 40
    .line 41
    if-eqz p0, :cond_3

    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRecyclable()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_3

    .line 48
    .line 49
    iget-object p0, v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏楪兰哲世:Landroidx/recyclerview/widget/飘花落叶言子苏楪兰世哲;

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲兰苏(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    return-void
.end method

.method public final 飘花落叶言子楪苏哲兰世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世兰哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰哲楪世:Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isScrap()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-nez v2, :cond_12

    .line 12
    .line 13
    iget-object v2, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_a

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isTmpDetached()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_11

    .line 28
    .line 29
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->shouldIgnore()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_10

    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->doesTransientStatePreventRecycling()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 40
    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-virtual {v5, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲苏世兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_1

    .line 50
    .line 51
    move v5, v4

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move v5, v3

    .line 54
    :goto_0
    sget-boolean v6, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子哲兰世楪苏:Z

    .line 55
    .line 56
    iget-object v7, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 57
    .line 58
    if-eqz v6, :cond_3

    .line 59
    .line 60
    invoke-virtual {v7, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-nez v6, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v1, "cached view received recycle internal? "

    .line 70
    .line 71
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪兰哲苏()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    :goto_1
    if-nez v5, :cond_6

    .line 86
    .line 87
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRecyclable()Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_4

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子哲兰世苏楪:Z

    .line 95
    .line 96
    if-eqz p0, :cond_5

    .line 97
    .line 98
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪兰哲苏()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    const-string v1, "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists"

    .line 103
    .line 104
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    const-string v1, "RecyclerView"

    .line 109
    .line 110
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    :cond_5
    move v4, v3

    .line 114
    goto/16 :goto_9

    .line 115
    .line 116
    :cond_6
    :goto_2
    iget v5, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世兰哲苏:I

    .line 117
    .line 118
    if-lez v5, :cond_d

    .line 119
    .line 120
    const/16 v5, 0x20e

    .line 121
    .line 122
    invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->hasAnyOfTheFlags(I)Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-nez v5, :cond_d

    .line 127
    .line 128
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    iget v6, p0, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世兰哲苏:I

    .line 133
    .line 134
    if-lt v5, v6, :cond_7

    .line 135
    .line 136
    if-lez v5, :cond_7

    .line 137
    .line 138
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世兰哲(I)V

    .line 139
    .line 140
    .line 141
    add-int/lit8 v5, v5, -0x1

    .line 142
    .line 143
    :cond_7
    sget-boolean v6, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子兰楪世哲苏:Z

    .line 144
    .line 145
    if-eqz v6, :cond_c

    .line 146
    .line 147
    if-lez v5, :cond_c

    .line 148
    .line 149
    iget v6, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mPosition:I

    .line 150
    .line 151
    iget-object v8, v1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v8, [I

    .line 154
    .line 155
    if-eqz v8, :cond_9

    .line 156
    .line 157
    iget v8, v1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:I

    .line 158
    .line 159
    mul-int/lit8 v8, v8, 0x2

    .line 160
    .line 161
    move v9, v3

    .line 162
    :goto_3
    if-ge v9, v8, :cond_9

    .line 163
    .line 164
    iget-object v10, v1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v10, [I

    .line 167
    .line 168
    aget v10, v10, v9

    .line 169
    .line 170
    if-ne v10, v6, :cond_8

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_8
    add-int/lit8 v9, v9, 0x2

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_9
    add-int/lit8 v5, v5, -0x1

    .line 177
    .line 178
    :goto_4
    if-ltz v5, :cond_b

    .line 179
    .line 180
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    check-cast v6, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 185
    .line 186
    iget v6, v6, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mPosition:I

    .line 187
    .line 188
    iget-object v8, v1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v8, [I

    .line 191
    .line 192
    if-eqz v8, :cond_b

    .line 193
    .line 194
    iget v8, v1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:I

    .line 195
    .line 196
    mul-int/lit8 v8, v8, 0x2

    .line 197
    .line 198
    move v9, v3

    .line 199
    :goto_5
    if-ge v9, v8, :cond_b

    .line 200
    .line 201
    iget-object v10, v1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v10, [I

    .line 204
    .line 205
    aget v10, v10, v9

    .line 206
    .line 207
    if-ne v10, v6, :cond_a

    .line 208
    .line 209
    add-int/lit8 v5, v5, -0x1

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_a
    add-int/lit8 v9, v9, 0x2

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_b
    add-int/2addr v5, v4

    .line 216
    :cond_c
    :goto_6
    invoke-virtual {v7, v5, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    move v1, v4

    .line 220
    goto :goto_7

    .line 221
    :cond_d
    move v1, v3

    .line 222
    :goto_7
    if-nez v1, :cond_e

    .line 223
    .line 224
    invoke-virtual {p0, p1, v4}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏哲兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;Z)V

    .line 225
    .line 226
    .line 227
    :goto_8
    move v3, v1

    .line 228
    goto :goto_9

    .line 229
    :cond_e
    move v4, v3

    .line 230
    goto :goto_8

    .line 231
    :goto_9
    iget-object p0, v0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪兰苏哲世:Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;

    .line 232
    .line 233
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪哲苏兰世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V

    .line 234
    .line 235
    .line 236
    if-nez v3, :cond_f

    .line 237
    .line 238
    if-nez v4, :cond_f

    .line 239
    .line 240
    if-eqz v2, :cond_f

    .line 241
    .line 242
    iget-object p0, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 243
    .line 244
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏(Landroid/view/View;)V

    .line 245
    .line 246
    .line 247
    const/4 p0, 0x0

    .line 248
    iput-object p0, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mBindingAdapter:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 249
    .line 250
    iput-object p0, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mOwnerRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 251
    .line 252
    :cond_f
    return-void

    .line 253
    :cond_10
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪兰哲苏()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    const-string p1, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    .line 258
    .line 259
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :cond_11
    new-instance p0, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    const-string v1, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    .line 270
    .line 271
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪兰哲苏()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 282
    .line 283
    .line 284
    return-void

    .line 285
    :cond_12
    :goto_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 286
    .line 287
    new-instance v1, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    const-string v2, "Scrapped or attached views may not be recycled. isScrap:"

    .line 290
    .line 291
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isScrap()Z

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    const-string v2, " isAttached:"

    .line 302
    .line 303
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    iget-object p1, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 307
    .line 308
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    if-eqz p1, :cond_13

    .line 313
    .line 314
    move v3, v4

    .line 315
    :cond_13
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪兰哲苏()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    throw p0
.end method
