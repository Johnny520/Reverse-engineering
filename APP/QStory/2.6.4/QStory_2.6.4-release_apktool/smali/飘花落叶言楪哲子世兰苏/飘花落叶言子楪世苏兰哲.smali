.class public final synthetic L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言子哲世苏楪兰/飘花落叶言子楪哲苏世兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:I

.field public final synthetic 飘花落叶言子楪哲苏兰世:Lcom/google/android/material/sidesheet/SideSheetBehavior;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 5
    .line 6
    iput p2, p0, L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Landroid/view/View;)Z
    .locals 4

    .line 1
    iget p1, p0, L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_4

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object p0, p0, L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪哲苏兰世:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪哲苏兰世:Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Landroid/view/View;

    .line 30
    .line 31
    new-instance v2, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏世哲兰;

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    invoke-direct {v2, p0, p1, v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    invoke-interface {p0}, Landroid/view/ViewParent;->isLayoutRequested()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_2

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 56
    .line 57
    .line 58
    return v0

    .line 59
    :cond_2
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏世哲兰;->run()V

    .line 60
    .line 61
    .line 62
    return v0

    .line 63
    :cond_3
    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪哲兰苏世(I)V

    .line 64
    .line 65
    .line 66
    return v0

    .line 67
    :cond_4
    :goto_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 68
    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v2, "STATE_"

    .line 72
    .line 73
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    if-ne p1, v0, :cond_5

    .line 77
    .line 78
    const-string p1, "DRAGGING"

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    const-string p1, "SETTLING"

    .line 82
    .line 83
    :goto_2
    const-string v0, " should not be set externally."

    .line 84
    .line 85
    invoke-static {v1, p1, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p0
.end method
