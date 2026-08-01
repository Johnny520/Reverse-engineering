.class public abstract Landroidx/activity/compose/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup$LayoutParams;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/activity/compose/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const v1, 0x1020002

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/view/ViewGroup;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v1, v0, Landroidx/compose/ui/platform/飘花落叶言子苏世楪兰哲;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    check-cast v0, Landroidx/compose/ui/platform/飘花落叶言子苏世楪兰哲;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v0, v2

    .line 32
    :goto_0
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;->setParentCompositionContext(Landroidx/compose/runtime/飘花落叶言子楪苏兰哲世;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/飘花落叶言子苏世楪兰哲;->setContent(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    new-instance v0, Landroidx/compose/ui/platform/飘花落叶言子苏世楪兰哲;

    .line 42
    .line 43
    invoke-direct {v0, p0}, Landroidx/compose/ui/platform/飘花落叶言子苏世楪兰哲;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2}, Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;->setParentCompositionContext(Landroidx/compose/runtime/飘花落叶言子楪苏兰哲世;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/飘花落叶言子苏世楪兰哲;->setContent(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1}, Landroidx/lifecycle/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-nez v1, :cond_2

    .line 65
    .line 66
    const v1, 0x240903cc

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-static {p1}, Landroidx/lifecycle/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰哲苏(Landroid/view/View;)Landroidx/lifecycle/飘花落叶言子苏兰世楪哲;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-nez v1, :cond_3

    .line 77
    .line 78
    const v1, 0x240903d0

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Landroid/view/View;)L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰哲苏;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-nez v1, :cond_4

    .line 89
    .line 90
    const v1, 0x240903cf

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    sget-object p1, Landroidx/activity/compose/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup$LayoutParams;

    .line 97
    .line 98
    invoke-virtual {p0, v0, p1}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method
