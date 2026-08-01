.class public final Landroidx/appcompat/widget/飘花落叶言子世兰哲楪苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroidx/appcompat/widget/飘花落叶言子世兰哲苏楪;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroidx/appcompat/widget/飘花落叶言子世哲兰苏楪;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/飘花落叶言子世兰哲苏楪;Landroidx/appcompat/widget/飘花落叶言子世哲兰苏楪;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/widget/飘花落叶言子世兰哲苏楪;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/appcompat/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲苏兰世:Landroidx/appcompat/widget/飘花落叶言子世哲兰苏楪;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/widget/飘花落叶言子世兰哲苏楪;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/appcompat/widget/飘花落叶言子世兰哲苏楪;->飘花落叶言子世兰哲苏楪:Landroidx/appcompat/widget/飘花落叶言子苏楪世兰哲;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲苏兰世:Landroidx/appcompat/widget/飘花落叶言子世哲兰苏楪;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
