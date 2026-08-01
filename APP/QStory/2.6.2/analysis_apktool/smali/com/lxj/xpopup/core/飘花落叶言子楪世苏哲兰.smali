.class public final Lcom/lxj/xpopup/core/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getHostWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->beforeShow()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->lifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 19
    .line 20
    sget-object v1, Landroidx/lifecycle/Lifecycle$Event;->ON_START:Landroidx/lifecycle/Lifecycle$Event;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->focusAndProcessBackPress()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->initAnimator()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->doShowAnimation()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->doAfterShow()V

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void

    .line 38
    :pswitch_0
    sget-object v0, Lcom/lxj/xpopup/enums/PopupStatus;->Show:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 39
    .line 40
    iput-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupStatus:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 41
    .line 42
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->lifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 43
    .line 44
    sget-object v1, Landroidx/lifecycle/Lifecycle$Event;->ON_RESUME:Landroidx/lifecycle/Lifecycle$Event;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->onShow()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getHostWindow()Landroid/view/Window;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getHostWindow()Landroid/view/Window;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Landroid/view/Window;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-lez v0, :cond_1

    .line 67
    .line 68
    iget-boolean v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->hasMoveUp:Z

    .line 69
    .line 70
    if-nez v0, :cond_1

    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getHostWindow()Landroid/view/Window;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Landroid/view/Window;)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    sput v0, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏:I

    .line 81
    .line 82
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 83
    .line 84
    const/16 v1, 0xb

    .line 85
    .line 86
    invoke-direct {v0, p0, v1}, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;-><init>(Ljava/lang/Object;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 90
    .line 91
    .line 92
    :cond_1
    return-void

    .line 93
    :pswitch_1
    sget-object v0, Lcom/lxj/xpopup/enums/PopupStatus;->Dismiss:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 94
    .line 95
    iput-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupStatus:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 96
    .line 97
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->lifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 98
    .line 99
    sget-object v1, Landroidx/lifecycle/Lifecycle$Event;->ON_STOP:Landroidx/lifecycle/Lifecycle$Event;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 105
    .line 106
    if-nez v0, :cond_2

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->onDismiss()V

    .line 110
    .line 111
    .line 112
    sget v0, L飘花落叶言楪哲苏兰子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 113
    .line 114
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dismissWithRunnable:Ljava/lang/Runnable;

    .line 120
    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 124
    .line 125
    .line 126
    const/4 v0, 0x0

    .line 127
    iput-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dismissWithRunnable:Ljava/lang/Runnable;

    .line 128
    .line 129
    :cond_3
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dialog:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;

    .line 140
    .line 141
    if-eqz p0, :cond_4

    .line 142
    .line 143
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 144
    .line 145
    .line 146
    :cond_4
    :goto_1
    return-void

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
