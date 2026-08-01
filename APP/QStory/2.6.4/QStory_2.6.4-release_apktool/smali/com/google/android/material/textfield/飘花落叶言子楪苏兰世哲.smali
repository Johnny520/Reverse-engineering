.class public final synthetic Lcom/google/android/material/textfield/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onTouchExplorationStateChanged(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲:Landroid/widget/AutoCompleteTextView;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/TextView;->getInputType()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Lcom/google/android/material/internal/CheckableImageButton;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, 0x1

    .line 21
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 22
    .line 23
    .line 24
    :cond_2
    return-void
.end method
