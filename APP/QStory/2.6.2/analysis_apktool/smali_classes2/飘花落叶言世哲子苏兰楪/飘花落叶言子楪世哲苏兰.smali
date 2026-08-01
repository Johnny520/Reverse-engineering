.class public final L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;
.super L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;

.field public 飘花落叶言子楪兰世苏哲:Ljava/lang/String;

.field public final 飘花落叶言子楪哲兰世苏:Landroid/widget/TextView;

.field public final 飘花落叶言子楪哲兰苏世:[Ljava/lang/String;

.field public final 飘花落叶言子楪哲苏兰世:Landroid/widget/RadioGroup;


# direct methods
.method public constructor <init>(Landroid/app/Activity;[Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const v0, 0x240c00f8

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Landroid/widget/LinearLayout;

    .line 17
    .line 18
    const v0, 0x2409011e

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/widget/RadioGroup;

    .line 26
    .line 27
    iput-object v0, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/widget/RadioGroup;

    .line 28
    .line 29
    const v0, 0x240902fa

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroid/widget/TextView;

    .line 37
    .line 38
    iput-object v0, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Landroid/widget/TextView;

    .line 39
    .line 40
    iput-object p2, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:[Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;->setContentView(Landroid/view/View;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final show()V
    .locals 8

    .line 1
    iget-object v0, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const v5, 0x240c00ea

    .line 18
    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-virtual {v4, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Landroid/widget/RadioButton;

    .line 26
    .line 27
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    new-instance v5, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;

    .line 31
    .line 32
    const/4 v6, 0x2

    .line 33
    invoke-direct {v5, p0, v6, v3}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 37
    .line 38
    .line 39
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 40
    .line 41
    const/4 v6, -0x1

    .line 42
    const/4 v7, -0x2

    .line 43
    invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 44
    .line 45
    .line 46
    iget-object v6, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/widget/RadioGroup;

    .line 47
    .line 48
    invoke-virtual {v6, v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    .line 50
    .line 51
    iget-object v5, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    invoke-virtual {v4, v3}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 61
    .line 62
    .line 63
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 67
    .line 68
    .line 69
    return-void
.end method
