.class public final Lcom/google/android/material/timepicker/飘花落叶言子楪世苏兰哲;
.super Lcom/google/android/material/internal/飘花落叶言子楪哲苏世兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Lcom/google/android/material/timepicker/ChipTextInputComboView;


# direct methods
.method public constructor <init>(Lcom/google/android/material/timepicker/ChipTextInputComboView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/timepicker/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/timepicker/ChipTextInputComboView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "00"

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/material/timepicker/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/timepicker/ChipTextInputComboView;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {p0, v1}, Lcom/google/android/material/timepicker/ChipTextInputComboView;->飘花落叶言子楪世苏哲兰(Lcom/google/android/material/timepicker/ChipTextInputComboView;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lcom/google/android/material/timepicker/ChipTextInputComboView;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-static {p0, p1}, Lcom/google/android/material/timepicker/ChipTextInputComboView;->飘花落叶言子楪世苏哲兰(Lcom/google/android/material/timepicker/ChipTextInputComboView;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-static {p0, v1}, Lcom/google/android/material/timepicker/ChipTextInputComboView;->飘花落叶言子楪世苏哲兰(Lcom/google/android/material/timepicker/ChipTextInputComboView;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :cond_1
    iput-object p1, p0, Lcom/google/android/material/timepicker/ChipTextInputComboView;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 33
    .line 34
    return-void
.end method
