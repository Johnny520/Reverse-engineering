.class public final L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世哲苏兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroid/app/Activity;


# direct methods
.method public constructor <init>(L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世哲苏兰;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroid/app/Activity;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    iget-object p1, p0, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    iget-object p1, p1, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子哲楪兰苏世:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 4
    .line 5
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p0, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroid/app/Activity;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰()Landroid/app/Activity;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-ne v3, v2, :cond_0

    .line 32
    .line 33
    if-eq v1, p1, :cond_0

    .line 34
    .line 35
    iget-object v2, v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    .line 38
    .line 39
    if-ne v2, v3, :cond_0

    .line 40
    .line 41
    instance-of v2, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;

    .line 42
    .line 43
    if-nez v2, :cond_0

    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    new-instance p0, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v0, "onTouch: dialog="

    .line 54
    .line 55
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v0, "  baseDialog="

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    const-string p1, ">>>"

    .line 74
    .line 75
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0, p2}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 83
    .line 84
    .line 85
    const/4 p0, 0x1

    .line 86
    return p0

    .line 87
    :cond_1
    instance-of p0, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;

    .line 88
    .line 89
    if-eqz p0, :cond_2

    .line 90
    .line 91
    invoke-virtual {v2, p2}, Landroid/app/Activity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    return p0

    .line 96
    :cond_2
    const/4 p0, 0x0

    .line 97
    return p0
.end method
