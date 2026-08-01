.class public final synthetic L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;

.field public final synthetic 飘花落叶言子楪哲兰苏世:I

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;II)V
    .locals 0

    .line 1
    iput p3, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;

    .line 4
    .line 5
    iput p2, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:I

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
    iget v0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget v1, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:I

    .line 4
    .line 5
    iget-object p0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏:Landroid/widget/HorizontalScrollView;

    .line 11
    .line 12
    iget-object v2, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Landroid/view/View;

    .line 19
    .line 20
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-virtual {v0, v3, v4}, Landroid/widget/HorizontalScrollView;->scrollTo(II)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Landroid/view/View;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const v1, 0x2408012f

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-virtual {p0, v1, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_0
    new-instance v0, Landroid/os/Handler;

    .line 51
    .line 52
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 57
    .line 58
    .line 59
    new-instance v2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    invoke-direct {v2, p0, v1, v3}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;-><init>(L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;II)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
