.class public final Lcom/google/android/material/textfield/飘花落叶言子楪哲苏世兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/google/android/material/textfield/飘花落叶言子世楪哲兰苏;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世哲楪苏兰:Lcom/google/android/material/textfield/飘花落叶言子楪哲世兰苏;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏哲兰楪:Landroid/widget/EditText;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏哲兰楪:Landroid/widget/EditText;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏哲兰楪:Landroid/widget/EditText;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/view/View;->getOnFocusChangeListener()Landroid/view/View$OnFocusChangeListener;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲()Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲()Landroid/view/View$OnFocusChangeListener;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-ne v1, v2, :cond_1

    .line 36
    .line 37
    iget-object v1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏哲兰楪:Landroid/widget/EditText;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏哲兰楪:Landroid/widget/EditText;

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲()Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏哲兰楪:Landroid/widget/EditText;

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏兰哲世(Landroid/widget/EditText;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲()Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰世哲(Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
