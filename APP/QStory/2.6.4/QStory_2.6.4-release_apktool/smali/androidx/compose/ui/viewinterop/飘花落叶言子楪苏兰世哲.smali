.class public final Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;
.super Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/compose/ui/focus/飘花落叶言子楪兰世苏哲;
.implements Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;


# instance fields
.field public 飘花落叶言子世楪兰哲苏:Landroid/view/ViewTreeObserver;

.field public final 飘花落叶言子世苏楪兰哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

.field public final 飘花落叶言子世苏楪哲兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode$onEnter$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode$onEnter$1;-><init>(Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏楪哲兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 10
    .line 11
    new-instance v0, Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode$onExit$1;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode$onExit$1;-><init>(Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏楪兰哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final onGlobalFocusChanged(Landroid/view/View;Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getFocusOwner()Landroidx/compose/ui/focus/飘花落叶言子楪苏兰哲世;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v3, 0x1

    .line 30
    const/4 v4, 0x0

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-nez v5, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_0
    if-eqz p1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    if-ne p1, v5, :cond_1

    .line 50
    .line 51
    move p1, v3

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move p1, v4

    .line 59
    :goto_1
    if-eqz p2, :cond_4

    .line 60
    .line 61
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_4

    .line 66
    .line 67
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    :goto_2
    if-eqz p2, :cond_4

    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    if-ne p2, v2, :cond_3

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_3
    invoke-interface {p2}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    goto :goto_2

    .line 85
    :cond_4
    move v3, v4

    .line 86
    :goto_3
    if-eqz p1, :cond_5

    .line 87
    .line 88
    if-eqz v3, :cond_5

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_5
    if-eqz v3, :cond_6

    .line 92
    .line 93
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;->飘花落叶言子哲兰世苏楪()Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子兰楪苏世哲()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusStateImpl;->getHasFocus()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-nez p1, :cond_7

    .line 106
    .line 107
    invoke-static {p0}, Landroidx/compose/ui/focus/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;)Z

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_6
    if-eqz p1, :cond_7

    .line 112
    .line 113
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;->飘花落叶言子哲兰世苏楪()Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p0}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子兰楪苏世哲()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusStateImpl;->isFocused()Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    if-eqz p0, :cond_7

    .line 126
    .line 127
    const/16 p0, 0x8

    .line 128
    .line 129
    check-cast v1, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;

    .line 130
    .line 131
    invoke-virtual {v1, p0, v4, v4}, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏(IZZ)Z

    .line 132
    .line 133
    .line 134
    :cond_7
    :goto_4
    return-void
.end method

.method public final 飘花落叶言子世楪哲苏兰(Landroidx/compose/ui/focus/飘花落叶言子楪哲兰世苏;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏楪哲兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    invoke-interface {p1, v0}, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏楪兰哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 11
    .line 12
    invoke-interface {p1, p0}, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final 飘花落叶言子哲兰世苏楪()Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    iget-boolean v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitLocalDescendants called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, L飘花落叶言子苏楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 13
    .line 14
    iget v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:I

    .line 15
    .line 16
    and-int/lit16 v0, v0, 0x400

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_a

    .line 20
    .line 21
    iget-object p0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    move v2, v0

    .line 25
    :goto_0
    if-eqz p0, :cond_a

    .line 26
    .line 27
    iget v3, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 28
    .line 29
    and-int/lit16 v3, v3, 0x400

    .line 30
    .line 31
    if-eqz v3, :cond_9

    .line 32
    .line 33
    move-object v3, p0

    .line 34
    move-object v4, v1

    .line 35
    :goto_1
    if-eqz v3, :cond_9

    .line 36
    .line 37
    instance-of v5, v3, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    move-object v5, v3

    .line 43
    check-cast v5, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    return-object v5

    .line 48
    :cond_1
    move v5, v0

    .line 49
    move v2, v6

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move v5, v6

    .line 52
    :goto_2
    if-eqz v5, :cond_8

    .line 53
    .line 54
    iget v5, v3, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 55
    .line 56
    and-int/lit16 v5, v5, 0x400

    .line 57
    .line 58
    if-eqz v5, :cond_8

    .line 59
    .line 60
    instance-of v5, v3, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 61
    .line 62
    if-eqz v5, :cond_8

    .line 63
    .line 64
    move-object v5, v3

    .line 65
    check-cast v5, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 66
    .line 67
    iget-object v5, v5, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 68
    .line 69
    move v7, v0

    .line 70
    :goto_3
    if-eqz v5, :cond_7

    .line 71
    .line 72
    iget v8, v5, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 73
    .line 74
    and-int/lit16 v8, v8, 0x400

    .line 75
    .line 76
    if-eqz v8, :cond_6

    .line 77
    .line 78
    add-int/lit8 v7, v7, 0x1

    .line 79
    .line 80
    if-ne v7, v6, :cond_3

    .line 81
    .line 82
    move-object v3, v5

    .line 83
    goto :goto_4

    .line 84
    :cond_3
    if-nez v4, :cond_4

    .line 85
    .line 86
    new-instance v4, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 87
    .line 88
    const/16 v8, 0x10

    .line 89
    .line 90
    new-array v8, v8, [Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 91
    .line 92
    invoke-direct {v4, v0, v8}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_4
    if-eqz v3, :cond_5

    .line 96
    .line 97
    invoke-virtual {v4, v3}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    move-object v3, v1

    .line 101
    :cond_5
    invoke-virtual {v4, v5}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_6
    :goto_4
    iget-object v5, v5, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_7
    if-ne v7, v6, :cond_8

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_8
    invoke-static {v4}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    goto :goto_1

    .line 115
    :cond_9
    iget-object p0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_a
    const-string p0, "Could not find focus target of embedded view wrapper"

    .line 119
    .line 120
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-object v1
.end method

.method public final 飘花落叶言子哲苏世楪兰()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪兰哲苏:Landroid/view/ViewTreeObserver;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪兰哲苏:Landroid/view/ViewTreeObserver;

    .line 16
    .line 17
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final 飘花落叶言子哲苏楪兰世()V
    .locals 1

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪兰哲苏:Landroid/view/ViewTreeObserver;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
