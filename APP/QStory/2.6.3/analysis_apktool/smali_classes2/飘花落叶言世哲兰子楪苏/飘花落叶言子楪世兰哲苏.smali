.class public final synthetic L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroid/app/Dialog;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroid/content/Context;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/io/File;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Landroid/app/Dialog;

    .line 7
    .line 8
    iput-object p3, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p4, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 5

    .line 1
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-direct {v0, p1}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const v4, 0x240c00ed

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v4, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 24
    .line 25
    const v2, 0x240902d3

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Landroid/widget/TextView;

    .line 33
    .line 34
    const/16 v3, 0x22f

    .line 35
    .line 36
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    const v3, 0x2406048a

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v3}, Landroid/content/Context;->getColor(I)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 51
    .line 52
    .line 53
    const p1, 0x240903d3

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Landroid/widget/EditText;

    .line 61
    .line 62
    iget-object v2, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/io/File;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    new-instance v3, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏哲世兰;

    .line 72
    .line 73
    invoke-direct {v3, p1, v2, v0}, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏哲世兰;-><init>(Landroid/widget/EditText;Ljava/io/File;L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 77
    .line 78
    .line 79
    const v3, 0x240903e3

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, Landroid/widget/Button;

    .line 87
    .line 88
    const-string v4, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u545c~\u545c\u545c\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 89
    .line 90
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    .line 96
    .line 97
    new-instance v4, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;

    .line 98
    .line 99
    invoke-direct {v4, v2, v0}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;-><init>(Ljava/io/File;L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    .line 104
    .line 105
    const v3, 0x240902d1

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, Landroid/widget/Button;

    .line 113
    .line 114
    const/16 v4, 0x230

    .line 115
    .line 116
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    .line 122
    .line 123
    new-instance v4, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;

    .line 124
    .line 125
    invoke-direct {v4, p1, v2, v0}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;-><init>(Landroid/widget/EditText;Ljava/io/File;L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v1}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;->setContentView(Landroid/view/View;)V

    .line 132
    .line 133
    .line 134
    new-instance p1, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏世哲兰;

    .line 135
    .line 136
    iget-object v1, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Landroid/app/Dialog;

    .line 137
    .line 138
    iget-object v2, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Landroid/content/Context;

    .line 139
    .line 140
    iget-object p0, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 141
    .line 142
    invoke-direct {p1, v1, v2, p0}, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏世哲兰;-><init>(Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 149
    .line 150
    .line 151
    const/4 p0, 0x1

    .line 152
    return p0
.end method
