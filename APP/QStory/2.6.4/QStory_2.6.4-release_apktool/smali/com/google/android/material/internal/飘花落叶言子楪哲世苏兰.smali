.class public final Lcom/google/android/material/internal/飘花落叶言子楪哲世苏兰;
.super L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世哲苏兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final 飘花落叶言子苏世兰哲楪(I)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世兰哲楪苏(I)V
    .locals 0

    .line 1
    iget p1, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 13
    .line 14
    iget-object p0, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏兰哲;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子世苏哲楪兰()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪苏兰世哲;->invalidateSelf()V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子世兰哲苏楪(Landroid/graphics/Typeface;Z)V
    .locals 0

    .line 1
    iget p1, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lcom/google/android/material/chip/Chip;

    .line 9
    .line 10
    iget-object p1, p0, Lcom/google/android/material/chip/Chip;->飘花落叶言子楪兰世哲苏:L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    iget-boolean p2, p1, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子兰世苏楪哲:Z

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏世楪哲兰:Ljava/lang/CharSequence;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    if-eqz p2, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    check-cast p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    iput-boolean p1, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 40
    .line 41
    iget-object p0, p0, Lcom/google/android/material/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/ref/WeakReference;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏兰哲;

    .line 48
    .line 49
    if-eqz p0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子世苏哲楪兰()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪苏兰世哲;->invalidateSelf()V

    .line 55
    .line 56
    .line 57
    :cond_2
    :goto_1
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
