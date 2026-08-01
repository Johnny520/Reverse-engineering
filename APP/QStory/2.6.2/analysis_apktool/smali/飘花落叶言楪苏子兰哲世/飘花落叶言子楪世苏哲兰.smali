.class public final synthetic L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroid/view/View;

.field public final synthetic 飘花落叶言子楪哲兰苏世:L飘花落叶言子苏兰哲楪世/飘花落叶言子楪世苏哲兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言子苏兰哲楪世/飘花落叶言子楪世苏哲兰;Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p3, p0, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言子苏兰哲楪世/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    iput-object p2, p0, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Landroid/view/View;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onTouchExplorationStateChanged(Z)V
    .locals 3

    .line 1
    iget v0, p0, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Landroid/view/View;

    .line 5
    .line 6
    iget-object p0, p0, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言子苏兰哲楪世/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏哲兰世:I

    .line 16
    .line 17
    if-ne p1, v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪兰世苏哲(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :pswitch_0
    check-cast p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏哲兰世:I

    .line 28
    .line 29
    if-ne p1, v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, v2}, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪哲兰苏世(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
