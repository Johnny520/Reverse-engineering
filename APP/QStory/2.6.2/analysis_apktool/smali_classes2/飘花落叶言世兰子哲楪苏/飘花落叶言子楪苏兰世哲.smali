.class public final synthetic L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroid/view/View;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroid/graphics/drawable/Drawable;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 1
    iput p3, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:Landroid/view/View;

    .line 4
    .line 5
    iput-object p2, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:Landroid/graphics/drawable/Drawable;

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
    .locals 5

    .line 1
    iget v0, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const-wide/16 v1, 0x12c

    .line 4
    .line 5
    const/high16 v3, 0x3f800000    # 1.0f

    .line 6
    .line 7
    iget-object v4, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    iget-object p0, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:Landroid/view/View;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-virtual {p0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰世哲;

    .line 35
    .line 36
    const/4 v2, 0x3

    .line 37
    invoke-direct {v1, p0, v4, v2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰世哲;-><init>(Landroid/view/View;Landroid/graphics/drawable/Drawable;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_2
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰世哲;

    .line 61
    .line 62
    const/4 v2, 0x2

    .line 63
    invoke-direct {v1, p0, v4, v2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰世哲;-><init>(Landroid/view/View;Landroid/graphics/drawable/Drawable;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
