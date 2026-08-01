.class public final L飘花落叶言楪苏世哲子兰/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/ViewGroup$OnHierarchyChangeListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:L飘花落叶言楪苏世哲子兰/飘花落叶言子楪苏世兰哲;

.field public 飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup$OnHierarchyChangeListener;


# direct methods
.method public constructor <init>(L飘花落叶言楪苏世哲子兰/飘花落叶言子楪苏世兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪苏世哲子兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪苏世哲子兰/飘花落叶言子楪苏世兰哲;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onChildViewAdded(Landroid/view/View;Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, L飘花落叶言楪苏世哲子兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪苏世哲子兰/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    if-ne p1, v0, :cond_2

    .line 4
    .line 5
    instance-of v1, p2, Lcom/google/android/material/chip/Chip;

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, -0x1

    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p2, v1}, Landroid/view/View;->setId(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, v0, L飘花落叶言楪苏世哲子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰哲世苏:Lcom/google/android/material/internal/飘花落叶言子楪世苏兰哲;

    .line 24
    .line 25
    move-object v1, p2

    .line 26
    check-cast v1, Lcom/google/android/material/chip/Chip;

    .line 27
    .line 28
    iget-object v2, v0, Lcom/google/android/material/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-interface {v1}, Lcom/google/android/material/internal/飘花落叶言子楪苏哲兰世;->getId()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    invoke-interface {v1}, Landroid/widget/Checkable;->isChecked()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lcom/google/android/material/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Lcom/google/android/material/internal/飘花落叶言子楪苏哲兰世;)Z

    .line 48
    .line 49
    .line 50
    :cond_1
    new-instance v2, Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 51
    .line 52
    const/16 v3, 0xc

    .line 53
    .line 54
    invoke-direct {v2, v0, v3}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;I)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v1, v2}, Lcom/google/android/material/internal/飘花落叶言子楪苏哲兰世;->setInternalOnCheckedChangeListener(Lcom/google/android/material/internal/飘花落叶言子楪苏哲世兰;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    iget-object p0, p0, L飘花落叶言楪苏世哲子兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    .line 61
    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    invoke-interface {p0, p1, p2}, Landroid/view/ViewGroup$OnHierarchyChangeListener;->onChildViewAdded(Landroid/view/View;Landroid/view/View;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    return-void
.end method

.method public final onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, L飘花落叶言楪苏世哲子兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪苏世哲子兰/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    instance-of v1, p2, Lcom/google/android/material/chip/Chip;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, L飘花落叶言楪苏世哲子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰哲世苏:Lcom/google/android/material/internal/飘花落叶言子楪世苏兰哲;

    .line 10
    .line 11
    move-object v1, p2

    .line 12
    check-cast v1, Lcom/google/android/material/chip/Chip;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-interface {v1, v2}, Lcom/google/android/material/internal/飘花落叶言子楪苏哲兰世;->setInternalOnCheckedChangeListener(Lcom/google/android/material/internal/飘花落叶言子楪苏哲世兰;)V

    .line 19
    .line 20
    .line 21
    iget-object v2, v0, Lcom/google/android/material/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-interface {v1}, Lcom/google/android/material/internal/飘花落叶言子楪苏哲兰世;->getId()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    iget-object v0, v0, Lcom/google/android/material/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/HashSet;

    .line 35
    .line 36
    invoke-interface {v1}, Lcom/google/android/material/internal/飘花落叶言子楪苏哲兰世;->getId()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object p0, p0, L飘花落叶言楪苏世哲子兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    .line 48
    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    invoke-interface {p0, p1, p2}, Landroid/view/ViewGroup$OnHierarchyChangeListener;->onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
.end method
