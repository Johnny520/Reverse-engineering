.class public final Landroidx/appcompat/widget/飘花落叶言子世楪兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

.field public final 飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;

    .line 5
    .line 6
    new-instance v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;-><init>(Landroid/widget/TextView;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲苏兰(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, L飘花落叶言子楪苏世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:[I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/16 p2, 0xe

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x1

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 24
    .line 25
    .line 26
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲苏兰(Z)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 38
    .line 39
    .line 40
    throw p0
.end method
