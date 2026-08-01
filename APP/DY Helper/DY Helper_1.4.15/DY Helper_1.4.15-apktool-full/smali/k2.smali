.class public final Lk2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lk2;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lk2;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final α(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final β(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final γ(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget v0, p0, Lk2;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lk2;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    return-void

    .line 9
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Lgt0;

    .line 13
    .line 14
    iget-object p1, p0, Lgt0;->β:Lw0;

    .line 15
    .line 16
    invoke-virtual {p1}, Lw0;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0, p1}, Lgt0;->ε(Z)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object v0, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 34
    .line 35
    check-cast p0, Lk20;

    .line 36
    .line 37
    invoke-static {p1, p0}, Lcom/example/dyhelper/hook/γ;->г(Landroid/view/View;Lk20;)V

    .line 38
    .line 39
    .line 40
    :pswitch_3
    return-void

    .line 41
    :pswitch_4
    check-cast p0, Ll2;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-boolean v0, p0, Ll2;->γ:Z

    .line 48
    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object v0, p0, Ll2;->δ:Lj2;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 58
    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    iput-boolean p1, p0, Ll2;->γ:Z

    .line 62
    .line 63
    :cond_0
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget v0, p0, Lk2;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lk2;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lxz1;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Lfo0;->ν(Ljava/util/concurrent/CancellationException;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lk2;->ζ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lyz1;

    .line 21
    .line 22
    iget-object v1, v0, Lyz1;->τ:Landroid/view/ViewTreeObserver;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, v0, Lyz1;->τ:Landroid/view/ViewTreeObserver;

    .line 37
    .line 38
    :cond_0
    iget-object v1, v0, Lyz1;->τ:Landroid/view/ViewTreeObserver;

    .line 39
    .line 40
    iget-object v0, v0, Lyz1;->ν:Ld;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Lk2;->ζ:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, Lgt0;

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    invoke-virtual {p0, p1}, Lgt0;->ε(Z)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_3
    iget-object v0, p0, Lk2;->ζ:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lie;

    .line 68
    .line 69
    iget-object v1, v0, Lie;->Δ:Landroid/view/ViewTreeObserver;

    .line 70
    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_2

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iput-object v1, v0, Lie;->Δ:Landroid/view/ViewTreeObserver;

    .line 84
    .line 85
    :cond_2
    iget-object v1, v0, Lie;->Δ:Landroid/view/ViewTreeObserver;

    .line 86
    .line 87
    iget-object v0, v0, Lie;->ν:Ld;

    .line 88
    .line 89
    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 90
    .line 91
    .line 92
    :cond_3
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_4
    iget-object p0, p0, Lk2;->ζ:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p0, Ll2;

    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-boolean v0, p0, Ll2;->γ:Z

    .line 105
    .line 106
    if-eqz v0, :cond_4

    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iget-object v0, p0, Ll2;->δ:Lj2;

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 115
    .line 116
    .line 117
    const/4 p1, 0x0

    .line 118
    iput-boolean p1, p0, Ll2;->γ:Z

    .line 119
    .line 120
    :cond_4
    return-void

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
