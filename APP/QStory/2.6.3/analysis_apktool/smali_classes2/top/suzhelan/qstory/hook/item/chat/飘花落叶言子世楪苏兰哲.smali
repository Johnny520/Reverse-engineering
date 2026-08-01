.class public final synthetic Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:J

.field public final synthetic 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p3, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    new-instance v2, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    invoke-direct {v2, v0}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const v3, 0x240c0032

    .line 21
    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-virtual {v0, v3, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const v3, 0x240900e2

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Landroid/widget/EditText;

    .line 36
    .line 37
    sget-object v4, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    iget-wide v5, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 40
    .line 41
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-virtual {v4, v7}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Ljava/lang/String;

    .line 50
    .line 51
    if-nez v4, :cond_1

    .line 52
    .line 53
    iget-object v4, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 54
    .line 55
    :cond_1
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    invoke-virtual {v3, p0}, Landroid/widget/EditText;->setSelection(I)V

    .line 67
    .line 68
    .line 69
    const p0, 0x240900e3

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Landroid/widget/Button;

    .line 77
    .line 78
    new-instance v4, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲苏兰;

    .line 79
    .line 80
    invoke-direct {v4, v5, v6, v3, v2}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲苏兰;-><init>(JLandroid/widget/EditText;L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v0}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;->setContentView(Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 90
    .line 91
    .line 92
    return-object v1
.end method
