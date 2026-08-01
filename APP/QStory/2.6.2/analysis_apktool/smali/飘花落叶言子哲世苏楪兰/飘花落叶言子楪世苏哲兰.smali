.class public final L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世苏哲兰;
.super Landroid/text/style/ClickableSpan;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;

.field public final 飘花落叶言子楪哲兰苏世:I

.field public final 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(IL飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    iput p3, p0, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance p1, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "ACCESSIBILITY_CLICKABLE_SPAN_ID"

    .line 7
    .line 8
    iget v1, p0, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    iget v0, p0, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:I

    .line 14
    .line 15
    iget-object p0, p0, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;

    .line 16
    .line 17
    iget-object p0, p0, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 18
    .line 19
    invoke-virtual {p0, v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->performAction(ILandroid/os/Bundle;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method
