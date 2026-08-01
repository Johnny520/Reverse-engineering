.class public final Lcom/google/android/material/datepicker/飘花落叶言子世楪哲兰苏;
.super Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

.field public final 飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;Z)V
    .locals 8

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    const v0, 0x24090215

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/widget/TextView;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;

    .line 14
    .line 15
    sget-object v1, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 16
    .line 17
    new-instance v2, Landroidx/core/view/飘花落叶言子世哲兰楪苏;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v7, 0x2

    .line 21
    const v3, 0x24090339

    .line 22
    .line 23
    .line 24
    const-class v4, Ljava/lang/Boolean;

    .line 25
    .line 26
    const/16 v6, 0x1c

    .line 27
    .line 28
    invoke-direct/range {v2 .. v7}, Landroidx/core/view/飘花落叶言子世哲兰楪苏;-><init>(ILjava/lang/Class;III)V

    .line 29
    .line 30
    .line 31
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v2, v1, v0}, Landroidx/core/view/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    const v1, 0x24090210

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 44
    .line 45
    iput-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 46
    .line 47
    if-nez p2, :cond_0

    .line 48
    .line 49
    const/16 p0, 0x8

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method
