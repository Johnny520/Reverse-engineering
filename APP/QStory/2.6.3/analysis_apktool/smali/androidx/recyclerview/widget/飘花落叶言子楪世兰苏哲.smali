.class public final Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;
.super Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;


# direct methods
.method public varargs constructor <init>(Landroidx/recyclerview/widget/飘花落叶言子楪世哲兰苏;[Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;)V
    .locals 1

    .line 1
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;-><init>(Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;Landroidx/recyclerview/widget/飘花落叶言子楪世哲兰苏;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 14
    .line 15
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 30
    .line 31
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲(Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 36
    .line 37
    iget-object p1, p1, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Landroidx/recyclerview/widget/ConcatAdapter$Config$StableIdMode;

    .line 40
    .line 41
    sget-object p2, Landroidx/recyclerview/widget/ConcatAdapter$Config$StableIdMode;->NO_STABLE_IDS:Landroidx/recyclerview/widget/ConcatAdapter$Config$StableIdMode;

    .line 42
    .line 43
    if-eq p1, p2, :cond_1

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 p1, 0x0

    .line 48
    :goto_1
    iget-object p2, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;

    .line 49
    .line 50
    invoke-virtual {p2}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏哲兰()Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-nez p2, :cond_2

    .line 55
    .line 56
    iput-boolean p1, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    const-string p0, "Cannot change whether this adapter has stable IDs while the adapter has registered observers."

    .line 60
    .line 61
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    throw p0
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(I)I
    .locals 8

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(I)Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 10
    .line 11
    iget v1, p1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 12
    .line 13
    iget-object v2, v0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 14
    .line 15
    iget-object v0, v0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世兰苏哲(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v1, v2, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Landroid/util/SparseIntArray;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, -0x1

    .line 30
    if-le v3, v4, :cond_0

    .line 31
    .line 32
    invoke-virtual {v1, v3}, Landroid/util/SparseIntArray;->valueAt(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v3, v2, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

    .line 40
    .line 41
    iget-object v5, v2, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v5, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 44
    .line 45
    iget v6, v3, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 46
    .line 47
    add-int/lit8 v7, v6, 0x1

    .line 48
    .line 49
    iput v7, v3, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 50
    .line 51
    iget-object v3, v3, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v3, Landroid/util/SparseArray;

    .line 54
    .line 55
    invoke-virtual {v3, v6, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v0, v6}, Landroid/util/SparseIntArray;->put(II)V

    .line 59
    .line 60
    .line 61
    iget-object v1, v2, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Landroid/util/SparseIntArray;

    .line 64
    .line 65
    invoke-virtual {v1, v6, v0}, Landroid/util/SparseIntArray;->put(II)V

    .line 66
    .line 67
    .line 68
    move v0, v6

    .line 69
    :goto_0
    const/4 v1, 0x0

    .line 70
    iput-boolean v1, p1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    iput-object v1, p1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 74
    .line 75
    iput v4, p1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 76
    .line 77
    iput-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 78
    .line 79
    return v0
.end method

.method public final 飘花落叶言子楪世哲兰苏(I)J
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(I)Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 10
    .line 11
    iget v1, p1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 12
    .line 13
    iget-object v2, v0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲兰苏(I)J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    iget-object v0, v0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏兰哲:Landroidx/recyclerview/widget/飘花落叶言子哲世苏楪兰;

    .line 20
    .line 21
    invoke-interface {v0, v1, v2}, Landroidx/recyclerview/widget/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世苏哲兰(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    const/4 v2, 0x0

    .line 26
    iput-boolean v2, p1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    iput-object v2, p1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v2, -0x1

    .line 32
    iput v2, p1, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 33
    .line 34
    iput-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 35
    .line 36
    return-wide v0
.end method

.method public final 飘花落叶言子楪世哲苏兰()I
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 23
    .line 24
    iget v1, v1, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 25
    .line 26
    add-int/2addr v0, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return v0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;I)I
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 p0, -0x1

    .line 16
    return p0

    .line 17
    :cond_0
    iget-object v1, v0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    sub-int/2addr p3, p0

    .line 24
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲苏兰()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-ltz p3, :cond_1

    .line 29
    .line 30
    if-ge p3, p0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1, p1, p2, p3}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲(Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;I)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_1
    const-string v0, " which is out of bounds for the adapter with size "

    .line 38
    .line 39
    const-string v1, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:"

    .line 40
    .line 41
    const-string v2, "Detected inconsistent adapter updates. The local position of the view holder maps to "

    .line 42
    .line 43
    invoke-static {p3, p0, v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string p3, "adapter:"

    .line 48
    .line 49
    invoke-static {p0, p2, p3, p1}, Landroidx/fragment/app/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return p0
.end method

.method public final 飘花落叶言子楪兰世苏哲(Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;)V
    .locals 6

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ltz v1, :cond_9

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-gt v1, v2, :cond_9

    .line 18
    .line 19
    iget-object v2, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Landroidx/recyclerview/widget/ConcatAdapter$Config$StableIdMode;

    .line 22
    .line 23
    sget-object v3, Landroidx/recyclerview/widget/ConcatAdapter$Config$StableIdMode;->NO_STABLE_IDS:Landroidx/recyclerview/widget/ConcatAdapter$Config$StableIdMode;

    .line 24
    .line 25
    if-eq v2, v3, :cond_0

    .line 26
    .line 27
    iget-boolean v2, p1, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 28
    .line 29
    const-string v3, "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS"

    .line 30
    .line 31
    invoke-static {v3, v2}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-boolean v2, p1, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    const-string v2, "ConcatAdapter"

    .line 40
    .line 41
    const-string v3, "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids"

    .line 42
    .line 43
    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const/4 v3, 0x0

    .line 51
    :goto_1
    const/4 v4, -0x1

    .line 52
    if-ge v3, v2, :cond_3

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 59
    .line 60
    iget-object v5, v5, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 61
    .line 62
    if-ne v5, p1, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    move v3, v4

    .line 69
    :goto_2
    if-ne v3, v4, :cond_4

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    goto :goto_3

    .line 73
    :cond_4
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 78
    .line 79
    :goto_3
    if-eqz v2, :cond_5

    .line 80
    .line 81
    return-void

    .line 82
    :cond_5
    new-instance v2, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 83
    .line 84
    iget-object v3, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v3, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

    .line 87
    .line 88
    iget-object v4, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v4, Landroidx/recyclerview/widget/飘花落叶言子哲世苏兰楪;

    .line 91
    .line 92
    invoke-interface {v4}, Landroidx/recyclerview/widget/飘花落叶言子哲世苏兰楪;->飘花落叶言子楪世苏哲兰()Landroidx/recyclerview/widget/飘花落叶言子哲世苏楪兰;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-direct {v2, p1, p0, v3, v4}, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;-><init>(Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;Landroidx/recyclerview/widget/飘花落叶言子哲世苏楪兰;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    :cond_6
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_7

    .line 115
    .line 116
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 127
    .line 128
    if-eqz v1, :cond_6

    .line 129
    .line 130
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏哲兰世(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_7
    iget p1, v2, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 135
    .line 136
    if-lez p1, :cond_8

    .line 137
    .line 138
    iget-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast p1, Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;

    .line 141
    .line 142
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    iget v1, v2, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 147
    .line 148
    invoke-virtual {p1, v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏哲世兰(II)V

    .line 149
    .line 150
    .line 151
    :cond_8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_9
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    const-string v2, "Index must be between 0 and "

    .line 164
    .line 165
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string p1, ". Given:"

    .line 172
    .line 173
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw p0
.end method

.method public final 飘花落叶言子楪哲世兰苏(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 4

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v1, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-ne v2, p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, -0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_2
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 63
    .line 64
    iget-object v0, v0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲世兰苏(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_3
    return-void
.end method

.method public final 飘花落叶言子楪哲世苏兰(ILandroid/view/ViewGroup;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;
    .locals 4

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/util/SparseArray;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 21
    .line 22
    iget-object v2, v1, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Landroid/util/SparseIntArray;

    .line 25
    .line 26
    invoke-virtual {v2, p1}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ltz v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/util/SparseIntArray;->valueAt(I)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲世苏兰(ILandroid/view/ViewGroup;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_0
    const-string p0, "requested global type "

    .line 44
    .line 45
    const-string p2, " does not belong to the adapter:"

    .line 46
    .line 47
    invoke-static {p1, p0, p2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    iget-object p1, v1, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 54
    .line 55
    iget-object p1, p1, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 56
    .line 57
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_1
    const-string p0, "Cannot find the wrapper for global view type "

    .line 62
    .line 63
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v0
.end method

.method public final 飘花落叶言子楪哲兰世苏(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲兰世苏(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final 飘花落叶言子楪哲兰苏世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object p0, v1, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲兰苏世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string v0, "Cannot find wrapper for "

    .line 25
    .line 26
    const-string v1, ", seems like it is not bound by this adapter: "

    .line 27
    .line 28
    invoke-static {v0, p1, v1, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)Z
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object p0, v1, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲苏世兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return p0

    .line 25
    :cond_0
    const-string v0, "Cannot find wrapper for "

    .line 26
    .line 27
    const-string v1, ", seems like it is not bound by this adapter: "

    .line 28
    .line 29
    invoke-static {v0, p1, v1, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public final 飘花落叶言子楪哲苏兰世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲苏兰世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final 飘花落叶言子楪苏兰世哲(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;I)V
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(I)Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 10
    .line 11
    iget-object v1, p2, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 14
    .line 15
    invoke-virtual {v0, p1, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iget-object v0, p2, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 21
    .line 22
    iget v1, p2, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 23
    .line 24
    iget-object v0, v0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 25
    .line 26
    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;I)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput-boolean p1, p2, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    iput-object p1, p2, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 34
    .line 35
    const/4 p1, -0x1

    .line 36
    iput p1, p2, Landroidx/appcompat/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 37
    .line 38
    iput-object p2, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 39
    .line 40
    return-void
.end method

.method public final 飘花落叶言子楪苏哲兰世(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-ne v2, p1, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;

    .line 57
    .line 58
    iget-object v0, v0, Landroidx/recyclerview/widget/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏哲兰世(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    :goto_1
    return-void
.end method
