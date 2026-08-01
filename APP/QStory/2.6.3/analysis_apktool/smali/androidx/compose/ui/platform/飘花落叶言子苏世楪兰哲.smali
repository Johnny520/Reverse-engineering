.class public final Landroidx/compose/ui/platform/飘花落叶言子苏世楪兰哲;
.super Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子世楪苏兰哲:Z

.field public final 飘花落叶言子世楪苏哲兰:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;


# direct methods
.method public constructor <init>(Landroidx/activity/ComponentActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-static {p1}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/Object;)Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子苏世楪兰哲;->飘花落叶言子世楪苏哲兰:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic getShouldCreateCompositionOnAttachedToWindow$annotations()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    const-class p0, Landroidx/compose/ui/platform/飘花落叶言子苏世楪兰哲;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/ui/platform/飘花落叶言子苏世楪兰哲;->飘花落叶言子世楪苏兰哲:Z

    .line 2
    .line 3
    return p0
.end method

.method public final setContent(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/compose/ui/platform/飘花落叶言子苏世楪兰哲;->飘花落叶言子世楪苏兰哲:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/ui/platform/飘花落叶言子苏世楪兰哲;->飘花落叶言子世楪苏哲兰:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 5
    .line 6
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;->getComposeViewContext$ui()Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void

    .line 25
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 5

    .line 1
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 2
    .line 3
    const v0, 0x190bf45a

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p2, 0x6

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v1

    .line 23
    :goto_0
    or-int/2addr v0, p2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v0, p2

    .line 26
    :goto_1
    and-int/lit8 v2, v0, 0x3

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    const/4 v4, 0x0

    .line 30
    if-eq v2, v1, :cond_2

    .line 31
    .line 32
    move v1, v3

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move v1, v4

    .line 35
    :goto_2
    and-int/2addr v0, v3

    .line 36
    invoke-virtual {p1, v0, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    iget-object v0, p0, Landroidx/compose/ui/platform/飘花落叶言子苏世楪兰哲;->飘花落叶言子世楪苏哲兰:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 43
    .line 44
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 51
    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    const v0, -0x49d6f281

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世哲兰(I)V

    .line 58
    .line 59
    .line 60
    :goto_3
    invoke-virtual {p1, v4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲苏兰世(Z)V

    .line 61
    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_3
    const v1, 0x5e04ac2

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世哲兰(I)V

    .line 68
    .line 69
    .line 70
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v0, p1, v1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 79
    .line 80
    .line 81
    :goto_4
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    new-instance v0, Landroidx/compose/ui/platform/ComposeView$Content$1;

    .line 88
    .line 89
    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/platform/ComposeView$Content$1;-><init>(Landroidx/compose/ui/platform/飘花落叶言子苏世楪兰哲;I)V

    .line 90
    .line 91
    .line 92
    iput-object v0, p1, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 93
    .line 94
    :cond_5
    return-void
.end method
