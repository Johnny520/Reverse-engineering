.class public final L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰哲世:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    iget-object v0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 28
    .line 29
    iget-object v1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    int-to-float v1, v1

    .line 36
    invoke-virtual {v0, v1}, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->setY(F)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰哲世:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;

    .line 40
    .line 41
    iget-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世兰苏哲楪:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;

    .line 42
    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    new-instance v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;

    .line 46
    .line 47
    const/4 v2, 0x2

    .line 48
    invoke-direct {v1, p0, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世兰苏哲楪:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;

    .line 52
    .line 53
    :cond_1
    iget-object p0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世兰苏哲楪:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;

    .line 54
    .line 55
    iget-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世兰哲苏楪:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;

    .line 56
    .line 57
    invoke-virtual {p0, v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰楪哲苏(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    sget-object p0, Landroidx/lifecycle/Lifecycle$State;->RESUMED:Landroidx/lifecycle/Lifecycle$State;

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏兰楪哲(Landroidx/lifecycle/Lifecycle$State;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
