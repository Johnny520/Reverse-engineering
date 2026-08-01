.class public final synthetic L飘花落叶言苏哲楪子世兰/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:L飘花落叶言苏哲楪子世兰/飘花落叶言子楪苏哲兰世;


# direct methods
.method public synthetic constructor <init>(L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;L飘花落叶言苏哲楪子世兰/飘花落叶言子楪苏哲兰世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏哲楪子世兰/飘花落叶言子楪苏哲兰世;

    .line 5
    .line 6
    iput-object p1, p0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏哲楪子世兰/飘花落叶言子楪苏哲兰世;

    .line 8
    .line 9
    iget-object p1, p1, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪兰哲;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    invoke-virtual {p1, p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪兰哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method
