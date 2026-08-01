.class public final synthetic L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏兰哲楪;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroid/view/View;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰世苏:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/high16 v2, 0x42480000    # 50.0f

    .line 7
    .line 8
    iget-object p0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰世苏:Landroid/view/View;

    .line 9
    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    cmpl-float p1, p1, v2

    .line 18
    .line 19
    if-ltz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 26
    .line 27
    .line 28
    :goto_0
    return-void

    .line 29
    :pswitch_0
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    cmpl-float p1, p1, v2

    .line 34
    .line 35
    if-ltz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 42
    .line 43
    .line 44
    :goto_1
    return-void

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
