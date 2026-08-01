.class public final Landroidx/appcompat/widget/飘花落叶言子哲苏楪兰世;
.super Landroid/database/DataSetObserver;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子世哲兰楪苏:Landroidx/appcompat/widget/飘花落叶言子世苏哲兰楪;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->show()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final onInvalidated()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->dismiss()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
