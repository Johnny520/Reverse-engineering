.class public final synthetic Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:I

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪哲苏兰世:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/view/View;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪兰世哲苏(Landroid/view/View;IZ)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void

    .line 31
    :pswitch_0
    check-cast p0, L飘花落叶言子哲楪世兰苏/飘花落叶言子楪世苏兰哲;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, L飘花落叶言子哲楪世兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲(I)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世苏兰哲楪(I)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 46
    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    sget-object v0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世哲苏;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const-wide v0, -0x36a57a37051405a7L    # -2.3658947967854835E45

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->clearAnimation()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 77
    .line 78
    const v2, -0xd93926

    .line 79
    .line 80
    .line 81
    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 82
    .line 83
    .line 84
    new-instance v2, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰哲世;

    .line 85
    .line 86
    const/4 v3, 0x1

    .line 87
    invoke-direct {v2, p0, v1, v0, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰哲世;-><init>(Landroid/view/View;Landroid/graphics/drawable/ColorDrawable;Landroid/graphics/drawable/Drawable;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 91
    .line 92
    .line 93
    :cond_2
    return-void

    .line 94
    :pswitch_2
    check-cast p0, Lcom/google/android/material/button/MaterialButton;

    .line 95
    .line 96
    sget-object v0, Lcom/google/android/material/button/MaterialButton;->飘花落叶言子苏世楪哲兰:[I

    .line 97
    .line 98
    invoke-virtual {p0, v1}, Lcom/google/android/material/button/MaterialButton;->setIconSize(I)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_3
    check-cast p0, Ljava/util/function/IntConsumer;

    .line 103
    .line 104
    invoke-interface {p0, v1}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
