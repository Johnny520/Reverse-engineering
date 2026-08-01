.class public final synthetic L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲世苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
    iput p4, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Landroid/view/View;

    .line 4
    .line 5
    iput-object p2, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Landroid/graphics/drawable/ColorDrawable;

    .line 6
    .line 7
    iput-object p3, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Landroid/graphics/drawable/Drawable;

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
    .locals 7

    .line 1
    iget v0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide/16 v2, 0xc8

    .line 5
    .line 6
    const v4, 0x3f19999a    # 0.6f

    .line 7
    .line 8
    .line 9
    iget-object v5, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    iget-object v6, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Landroid/graphics/drawable/ColorDrawable;

    .line 12
    .line 13
    iget-object p0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Landroid/view/View;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v4}, Landroid/view/View;->setAlpha(F)V

    .line 22
    .line 23
    .line 24
    new-instance v0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲世兰苏;

    .line 25
    .line 26
    const/4 v4, 0x3

    .line 27
    invoke-direct {v0, p0, v5, v4}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲世兰苏;-><init>(Landroid/view/View;Landroid/graphics/drawable/Drawable;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 31
    .line 32
    .line 33
    new-instance v0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲世苏兰;

    .line 34
    .line 35
    invoke-direct {v0, p0, v6, v5, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲世苏兰;-><init>(Landroid/view/View;Landroid/graphics/drawable/ColorDrawable;Landroid/graphics/drawable/Drawable;I)V

    .line 36
    .line 37
    .line 38
    const-wide/16 v1, 0x258

    .line 39
    .line 40
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_0
    invoke-virtual {p0, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v4}, Landroid/view/View;->setAlpha(F)V

    .line 48
    .line 49
    .line 50
    new-instance v0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲世兰苏;

    .line 51
    .line 52
    invoke-direct {v0, p0, v5, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲世兰苏;-><init>(Landroid/view/View;Landroid/graphics/drawable/Drawable;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

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
