.class public final synthetic L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/widget/PopupMenu$OnMenuItemClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世兰苏哲:Landroid/widget/ProgressBar;

.field public final synthetic 飘花落叶言子楪世哲兰苏:Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;

.field public final synthetic 飘花落叶言子楪世哲苏兰:Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪世苏兰哲:Landroid/view/View;

.field public final synthetic 飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世兰哲苏;


# direct methods
.method public synthetic constructor <init>(L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世兰哲苏;Landroid/view/View;Ljava/lang/String;Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;Landroid/widget/ProgressBar;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:Landroid/view/View;

    .line 7
    .line 8
    iput-object p3, p0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;

    .line 11
    .line 12
    iput-object p5, p0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Landroid/widget/ProgressBar;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 5

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const v0, 0x24090206

    .line 6
    .line 7
    .line 8
    const-string v1, "popular"

    .line 9
    .line 10
    const-string v2, "latest"

    .line 11
    .line 12
    if-ne p1, v0, :cond_0

    .line 13
    .line 14
    move-object p1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const v0, 0x24090207

    .line 17
    .line 18
    .line 19
    if-ne p1, v0, :cond_4

    .line 20
    .line 21
    move-object p1, v1

    .line 22
    :goto_0
    iget-object v0, p0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世兰哲苏;

    .line 23
    .line 24
    iget-object v3, v0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v3, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_3

    .line 31
    .line 32
    iput-object p1, v0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v3, p0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:Landroid/view/View;

    .line 35
    .line 36
    check-cast v3, Landroid/widget/TextView;

    .line 37
    .line 38
    invoke-static {p1, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const-string v4, "\u6700\u65b0\u53d1\u5e03"

    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-static {p1, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    const-string v4, "\u6700\u591a\u4e0b\u8f7d"

    .line 54
    .line 55
    :cond_2
    :goto_1
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v1, p0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;

    .line 61
    .line 62
    iget-object p0, p0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Landroid/widget/ProgressBar;

    .line 63
    .line 64
    invoke-virtual {v0, p1, v1, p0}, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪苏兰哲(Ljava/lang/String;Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;Landroid/widget/ProgressBar;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    const/4 p0, 0x1

    .line 68
    return p0

    .line 69
    :cond_4
    const/4 p0, 0x0

    .line 70
    return p0
.end method
