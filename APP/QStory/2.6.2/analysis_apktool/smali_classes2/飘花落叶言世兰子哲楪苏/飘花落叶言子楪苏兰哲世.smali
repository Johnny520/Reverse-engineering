.class public final synthetic L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:Landroid/graphics/drawable/Drawable;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroid/view/View;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroid/graphics/drawable/ColorDrawable;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroid/graphics/drawable/ColorDrawable;Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 1
    iput p4, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Landroid/view/View;

    .line 4
    .line 5
    iput-object p2, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:Landroid/graphics/drawable/ColorDrawable;

    .line 6
    .line 7
    iput-object p3, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世苏哲:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const-wide/16 v1, 0xc8

    .line 4
    .line 5
    const v3, 0x3f19999a    # 0.6f

    .line 6
    .line 7
    .line 8
    iget-object v4, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世苏哲:Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    iget-object v5, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:Landroid/graphics/drawable/ColorDrawable;

    .line 11
    .line 12
    iget-object p0, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Landroid/view/View;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 21
    .line 22
    .line 23
    new-instance v0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰世哲;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-direct {v0, p0, v4, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰世哲;-><init>(Landroid/view/View;Landroid/graphics/drawable/Drawable;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 30
    .line 31
    .line 32
    new-instance v0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰哲世;

    .line 33
    .line 34
    invoke-direct {v0, p0, v5, v4, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰哲世;-><init>(Landroid/view/View;Landroid/graphics/drawable/ColorDrawable;Landroid/graphics/drawable/Drawable;I)V

    .line 35
    .line 36
    .line 37
    const-wide/16 v1, 0x258

    .line 38
    .line 39
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_0
    invoke-virtual {p0, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 47
    .line 48
    .line 49
    new-instance v0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰世哲;

    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    invoke-direct {v0, p0, v4, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏兰世哲;-><init>(Landroid/view/View;Landroid/graphics/drawable/Drawable;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
