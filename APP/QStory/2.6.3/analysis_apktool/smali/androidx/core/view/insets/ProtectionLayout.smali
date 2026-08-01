.class public Landroidx/core/view/insets/ProtectionLayout;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 3
    .line 4
    .line 5
    new-instance p1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 11
    .line 12
    return-void
.end method

.method private getOrInstallSystemBarStateMonitor()L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    const v0, 0x24090343

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    instance-of v2, v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    check-cast v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_0
    new-instance v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 22
    .line 23
    invoke-direct {v1, p0}, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;-><init>(Landroid/view/ViewGroup;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object v1
.end method


# virtual methods
.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 8
    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    sub-int/2addr v1, v0

    .line 28
    if-gt p2, v1, :cond_1

    .line 29
    .line 30
    if-gez p2, :cond_2

    .line 31
    .line 32
    :cond_1
    move p2, v1

    .line 33
    :cond_2
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪世苏哲兰()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪世苏兰哲()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroid/view/ViewGroup;

    .line 12
    .line 13
    const v0, 0x24090343

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    instance-of v2, v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    check-cast v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 26
    .line 27
    iget-object v2, v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    :goto_0
    return-void

    .line 36
    :cond_1
    iget-object v2, v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲兰苏;

    .line 37
    .line 38
    new-instance v3, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 39
    .line 40
    const/16 v4, 0x14

    .line 41
    .line 42
    invoke-direct {v3, v1, v4}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 46
    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public setProtections(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u4e16\u5170\u696a\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪世苏哲兰()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 10
    .line 11
    iget-object v1, v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sub-int/2addr v0, v1

    .line 18
    iget-object v1, p0, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 19
    .line 20
    iget-object v1, v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->removeViews(II)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 30
    .line 31
    iget-object v0, v0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v1, p0, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    if-gtz v0, :cond_2

    .line 41
    .line 42
    iget-object v0, v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 43
    .line 44
    iget-boolean v3, v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:Z

    .line 45
    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    const/4 v3, 0x1

    .line 50
    iput-boolean v3, v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:Z

    .line 51
    .line 52
    iget-object v4, v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 53
    .line 54
    iget-object v4, v4, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    sub-int/2addr v1, v3

    .line 64
    :goto_0
    if-ltz v1, :cond_1

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 71
    .line 72
    iput-object v2, v3, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 73
    .line 74
    add-int/lit8 v1, v1, -0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 78
    .line 79
    .line 80
    :goto_1
    iput-object v2, p0, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    iget-object p0, v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    throw v2

    .line 96
    :cond_3
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪世苏兰哲()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-direct {p0}, Landroidx/core/view/insets/ProtectionLayout;->getOrInstallSystemBarStateMonitor()L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0}, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪世苏兰哲()V

    .line 18
    .line 19
    .line 20
    new-instance v2, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 21
    .line 22
    invoke-direct {v2, v1, v0}, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;Ljava/util/ArrayList;)V

    .line 23
    .line 24
    .line 25
    iput-object v2, p0, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 31
    .line 32
    iget-object v0, v0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-gtz v0, :cond_1

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 42
    .line 43
    iget-object v0, v0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const-string p0, "Unexpected side: "

    .line 59
    .line 60
    invoke-static {v1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
