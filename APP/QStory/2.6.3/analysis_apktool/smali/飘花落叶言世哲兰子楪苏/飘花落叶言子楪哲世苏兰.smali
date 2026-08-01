.class public final L飘花落叶言世哲兰子楪苏/飘花落叶言子楪哲世苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:Landroid/widget/Button;

.field public final synthetic 飘花落叶言子楪兰世苏哲:Landroid/widget/Button;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;Ljava/lang/String;L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;Landroid/widget/Button;Landroid/widget/Button;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Landroid/widget/EditText;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    iput-object p4, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Landroid/widget/Button;

    .line 11
    .line 12
    iput-object p5, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏:Landroid/widget/Button;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "\u55b5\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c"

    .line 6
    .line 7
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v2, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, ""

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Landroid/widget/EditText;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object p0, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {p0, p1}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    const-string p1, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u545c\u545c\u545c\u55b5\u55b5\u545c\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u545c\u545c\u545c\u545c\u55b5\u545c\u55b5\u55b5"

    .line 59
    .line 60
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object v0, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Landroid/widget/Button;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    const-string p1, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u55b5\u55b5\u545c\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u545c\u545c\u545c\u55b5\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u55b5\u545c\u545c\u545c\u545c"

    .line 70
    .line 71
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-object p0, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏:Landroid/widget/Button;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    new-instance p1, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;

    .line 81
    .line 82
    const/16 v0, 0xd

    .line 83
    .line 84
    invoke-direct {p1, v2, v0}, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method
