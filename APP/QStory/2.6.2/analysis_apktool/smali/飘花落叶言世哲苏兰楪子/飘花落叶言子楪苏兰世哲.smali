.class public final L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

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
    iput-object p1, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Landroid/widget/EditText;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    iput-object p4, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:Landroid/widget/Button;

    .line 11
    .line 12
    iput-object p5, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏:Landroid/widget/Button;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-wide v1, -0x36a50696051405a7L    # -2.4061855901583903E45

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v3, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-wide v4, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    iget-object p1, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Landroid/widget/EditText;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object p0, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Landroid/app/Dialog;->dismiss()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_0
    const-wide v0, -0x36a52167051405a7L    # -2.3968414363627413E45

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object v0, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:Landroid/widget/Button;

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    const-wide v0, -0x36a53d6e051405a7L    # -2.3870753324321103E45

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iget-object p0, p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏:Landroid/widget/Button;

    .line 96
    .line 97
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    .line 100
    new-instance p1, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;

    .line 101
    .line 102
    const/16 v0, 0x11

    .line 103
    .line 104
    invoke-direct {p1, v3, v0}, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 108
    .line 109
    .line 110
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
