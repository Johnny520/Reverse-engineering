.class public final L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲兰苏;
.super Landroid/view/View;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;Landroid/content/Context;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    iput-object p1, p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    iput-object p3, p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Landroid/view/ViewGroup;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    iget-object p1, p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    iget-object v0, p1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object p0, p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    instance-of v1, p0, Landroid/graphics/drawable/ColorDrawable;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast p0, Landroid/graphics/drawable/ColorDrawable;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    :goto_0
    iget v1, p1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲:I

    .line 24
    .line 25
    if-eq v1, p0, :cond_1

    .line 26
    .line 27
    iput p0, p1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲:I

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    add-int/lit8 p1, p1, -0x1

    .line 34
    .line 35
    :goto_1
    if-ltz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 42
    .line 43
    invoke-virtual {v1, p0}, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(I)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 p1, p1, -0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    return-void
.end method
