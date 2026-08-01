.class public L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲苏兰;
.super Landroidx/fragment/app/飘花落叶言子楪哲苏世兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子哲世楪苏兰:Ljava/lang/ref/WeakReference;

.field public 飘花落叶言子哲楪兰世苏:Landroid/view/View;

.field public 飘花落叶言子哲楪兰苏世:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/飘花落叶言子楪哲苏世兰;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子哲世楪苏兰:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰哲世苏()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲世苏()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子哲世楪苏兰:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/app/Activity;

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/fragment/app/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲楪世苏兰:Landroid/app/Dialog;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :cond_1
    const/16 v2, 0x8

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 27
    .line 28
    .line 29
    const/16 v2, 0x10

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const/4 v3, -0x1

    .line 39
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 40
    .line 41
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 45
    .line 46
    const/4 v3, -0x2

    .line 47
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 48
    .line 49
    iget-object v3, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子哲楪兰世苏:Landroid/view/View;

    .line 50
    .line 51
    new-instance v4, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世苏兰哲;

    .line 52
    .line 53
    invoke-direct {v4, p0, v0}, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲苏兰;Landroid/app/Activity;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 60
    .line 61
    .line 62
    const/high16 p0, 0x4000000

    .line 63
    .line 64
    invoke-virtual {v1, p0}, Landroid/view/Window;->addFlags(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-virtual {p0, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 73
    .line 74
    .line 75
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 76
    .line 77
    const/16 v4, 0x1c

    .line 78
    .line 79
    if-lt p0, v4, :cond_2

    .line 80
    .line 81
    invoke-static {v2}, L飘花落叶言楪世苏哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世(Landroid/view/WindowManager$LayoutParams;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    new-instance p0, Landroid/graphics/drawable/ColorDrawable;

    .line 85
    .line 86
    invoke-direct {p0, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, p0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 90
    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    const/16 v0, 0x2000

    .line 107
    .line 108
    and-int/2addr p0, v0

    .line 109
    if-ne p0, v0, :cond_3

    .line 110
    .line 111
    const/16 p0, 0x2500

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    const/16 p0, 0x500

    .line 115
    .line 116
    :goto_1
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0, p0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 121
    .line 122
    .line 123
    const/high16 p0, -0x78000000

    .line 124
    .line 125
    invoke-virtual {v1, p0}, Landroid/view/Window;->addFlags(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v3}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v3}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public final 飘花落叶言子楪哲兰苏世(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子哲楪兰世苏:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method
