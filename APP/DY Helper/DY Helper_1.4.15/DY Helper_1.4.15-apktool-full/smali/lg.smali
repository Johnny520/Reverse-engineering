.class public final Llg;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Llg;->ε:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p0, p0, Llg;->ε:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-static {p1}, Lcp0;->α(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_1
    sget-object p0, Lug;->κ:Landroid/os/Handler;

    .line 15
    .line 16
    new-instance v0, Ljb;

    .line 17
    .line 18
    const/16 v1, 0x12

    .line 19
    .line 20
    invoke-direct {v0, p1, v1}, Ljb;-><init>(Landroid/view/View;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_2
    sget-object p0, Lug;->α:Ltg;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ltg;->о(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_3
    sget-object p0, Lug;->α:Ltg;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Ltg;->о(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_4
    sget-object p0, Lug;->α:Ltg;

    .line 40
    .line 41
    const-string v0, "attached"

    .line 42
    .line 43
    invoke-virtual {p0, p1, v0}, Ltg;->п(Landroid/view/View;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

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
    .locals 3

    .line 1
    iget v0, p0, Llg;->ε:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, La01;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Landroid/widget/TextView;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v2, v1

    .line 31
    :goto_0
    if-ne v2, p1, :cond_3

    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eq p1, v0, :cond_1

    .line 45
    .line 46
    :cond_3
    :goto_1
    return-void

    .line 47
    :pswitch_0
    sget-object p0, Lcp0;->δ:Ljava/util/Set;

    .line 48
    .line 49
    check-cast p0, Ljava/lang/Iterable;

    .line 50
    .line 51
    new-instance v0, Lwk0;

    .line 52
    .line 53
    const/4 v1, 0x2

    .line 54
    invoke-direct {v0, p1, v1}, Lwk0;-><init>(Landroid/view/View;I)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v0}, Lxh;->Ц(Ljava/lang/Iterable;La80;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_1
    sget-object p0, Lug;->κ:Landroid/os/Handler;

    .line 62
    .line 63
    new-instance p1, Ls0;

    .line 64
    .line 65
    const/4 v0, 0x6

    .line 66
    invoke-direct {p1, v0}, Ls0;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_2
    const p0, 0x7f0deaea

    .line 74
    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    invoke-virtual {p1, p0, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_3
    const p0, 0x7f0deaea

    .line 82
    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    invoke-virtual {p1, p0, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_4
    const p0, 0x7f0deae5

    .line 90
    .line 91
    .line 92
    const/4 v0, 0x0

    .line 93
    invoke-virtual {p1, p0, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
