.class public final synthetic L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世哲苏兰;


# direct methods
.method public synthetic constructor <init>(L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世哲苏兰;L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    iget-object p1, p1, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const-wide p1, -0x36a5fc83051405a7L    # -2.3204929622614242E45

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {p1, p2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    const-wide p1, -0x36a57c86051405a7L    # -2.3650903692700824E45

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-static {p1, p2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    new-instance p1, Landroid/content/Intent;

    .line 31
    .line 32
    const-wide p4, -0x36a5115f051405a7L    # -2.4024275116981154E45

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {p4, p5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;

    .line 45
    .line 46
    iget-object p2, p0, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p2, Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    check-cast p2, Ltop/suzhelan/qstory/entity/PayItem;

    .line 55
    .line 56
    invoke-virtual {p2}, Ltop/suzhelan/qstory/entity/PayItem;->getPayUrl()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    const-wide p3, -0x36a4320c051405a7L    # -2.4802446444950633E45

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    invoke-static {p3, p4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 76
    .line 77
    .line 78
    iget-object p0, p0, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p0, Landroid/app/Activity;

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method
