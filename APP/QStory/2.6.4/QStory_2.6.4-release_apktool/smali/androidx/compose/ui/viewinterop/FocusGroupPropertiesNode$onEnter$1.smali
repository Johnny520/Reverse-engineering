.class final Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode$onEnter$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/focus/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "(Landroidx/compose/ui/focus/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode$onEnter$1;->this$0:Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 123
    check-cast p1, Landroidx/compose/ui/focus/飘花落叶言子楪世兰苏哲;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode$onEnter$1;->invoke(Landroidx/compose/ui/focus/飘花落叶言子楪世兰苏哲;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/ui/focus/飘花落叶言子楪世兰苏哲;)V
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode$onEnter$1;->this$0:Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode$onEnter$1;->this$0:Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;

    .line 20
    .line 21
    invoke-static {v1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getFocusOwner()Landroidx/compose/ui/focus/飘花落叶言子楪苏兰哲世;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode$onEnter$1;->this$0:Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;

    .line 32
    .line 33
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    move-object v2, p1

    .line 38
    check-cast v2, Landroidx/compose/ui/focus/飘花落叶言子楪世苏哲兰;

    .line 39
    .line 40
    iget v2, v2, Landroidx/compose/ui/focus/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 41
    .line 42
    invoke-static {v2}, Landroidx/compose/ui/focus/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const/4 v3, 0x2

    .line 47
    new-array v4, v3, [I

    .line 48
    .line 49
    invoke-virtual {p0, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 50
    .line 51
    .line 52
    new-array p0, v3, [I

    .line 53
    .line 54
    invoke-virtual {v0, p0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 55
    .line 56
    .line 57
    check-cast v1, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;

    .line 58
    .line 59
    iget-object v1, v1, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 60
    .line 61
    invoke-static {v1}, Landroidx/compose/ui/focus/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏(Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;)Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const/4 v3, 0x0

    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    invoke-static {v1}, Landroidx/compose/ui/focus/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏哲世兰(Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    move-object v1, v3

    .line 74
    :goto_0
    const/4 v5, 0x1

    .line 75
    if-nez v1, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    new-instance v3, Landroid/graphics/Rect;

    .line 79
    .line 80
    iget v6, v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:F

    .line 81
    .line 82
    float-to-int v6, v6

    .line 83
    const/4 v7, 0x0

    .line 84
    aget v8, v4, v7

    .line 85
    .line 86
    add-int/2addr v6, v8

    .line 87
    aget v7, p0, v7

    .line 88
    .line 89
    sub-int/2addr v6, v7

    .line 90
    iget v9, v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:F

    .line 91
    .line 92
    float-to-int v9, v9

    .line 93
    aget v4, v4, v5

    .line 94
    .line 95
    add-int/2addr v9, v4

    .line 96
    aget p0, p0, v5

    .line 97
    .line 98
    sub-int/2addr v9, p0

    .line 99
    iget v10, v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:F

    .line 100
    .line 101
    float-to-int v10, v10

    .line 102
    add-int/2addr v10, v8

    .line 103
    sub-int/2addr v10, v7

    .line 104
    iget v1, v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:F

    .line 105
    .line 106
    float-to-int v1, v1

    .line 107
    add-int/2addr v1, v4

    .line 108
    sub-int/2addr v1, p0

    .line 109
    invoke-direct {v3, v6, v9, v10, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 110
    .line 111
    .line 112
    :goto_1
    invoke-static {v0, v2, v3}, Landroidx/compose/ui/focus/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-nez p0, :cond_2

    .line 117
    .line 118
    check-cast p1, Landroidx/compose/ui/focus/飘花落叶言子楪世苏哲兰;

    .line 119
    .line 120
    iput-boolean v5, p1, Landroidx/compose/ui/focus/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 121
    .line 122
    :cond_2
    return-void
.end method
