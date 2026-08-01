.class public final L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:Landroid/widget/TextView;

.field public final synthetic 飘花落叶言子楪兰世苏哲:Landroid/widget/TextView;

.field public final synthetic 飘花落叶言子楪兰苏世哲:Llin/xposed/hook/view/main/MainSettingActivity;

.field public final synthetic 飘花落叶言子楪兰苏哲世:Landroid/app/Dialog;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroid/widget/LinearLayout;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroidx/recyclerview/widget/RecyclerView;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/TextView;Llin/xposed/hook/view/main/MainSettingActivity;Landroid/app/Dialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Landroid/widget/ImageView;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    iput-object p3, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    iput-object p4, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p5, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世哲苏:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p6, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰苏世哲:Llin/xposed/hook/view/main/MainSettingActivity;

    .line 15
    .line 16
    iput-object p7, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰苏哲世:Landroid/app/Dialog;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 7

    .line 1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲苏楪兰世(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/16 v2, 0x8

    .line 19
    .line 20
    if-lez v0, :cond_0

    .line 21
    .line 22
    move v0, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v0, v2

    .line 25
    :goto_0
    iget-object v3, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Landroid/widget/ImageView;

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v3, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世哲苏:Landroid/widget/TextView;

    .line 35
    .line 36
    iget-object v4, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:Landroid/widget/TextView;

    .line 37
    .line 38
    iget-object v5, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Landroidx/recyclerview/widget/RecyclerView;

    .line 39
    .line 40
    iget-object v6, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Landroid/widget/LinearLayout;

    .line 41
    .line 42
    if-lez v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v6, v2}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    sget-object v0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世哲苏;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5, v2}, Landroid/view/View;->setVisibility(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_1
    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v1}, Landroid/view/View;->setVisibility(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 85
    .line 86
    .line 87
    new-instance v0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰哲苏世;

    .line 88
    .line 89
    new-instance v1, Landroidx/activity/compose/飘花落叶言子楪世哲兰苏;

    .line 90
    .line 91
    const/16 v2, 0x1d

    .line 92
    .line 93
    iget-object v3, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰苏哲世:Landroid/app/Dialog;

    .line 94
    .line 95
    iget-object p0, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰苏世哲:Llin/xposed/hook/view/main/MainSettingActivity;

    .line 96
    .line 97
    invoke-direct {v1, v3, v2, p0}, Landroidx/activity/compose/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-direct {v0, p1, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰哲苏世;-><init>(Ljava/util/List;Landroidx/activity/compose/飘花落叶言子楪世哲兰苏;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_2
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5, v2}, Landroid/view/View;->setVisibility(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method
