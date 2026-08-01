.class public final Lq3;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lw3;


# direct methods
.method public synthetic constructor <init>(Lw3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq3;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lq3;->e:Lw3;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lq3;->d:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    iget-object p0, p0, Lq3;->e:Lw3;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lhw;

    .line 11
    .line 12
    invoke-virtual {p0}, Lw3;->getUncaughtExceptionHandler$ui()Lyv0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-ne v0, v2, :cond_1

    .line 32
    .line 33
    invoke-interface {p1}, Lhw;->invoke()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    new-instance v0, Lv1;

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    invoke-direct {v0, v2, p1}, Lv1;-><init>(ILhw;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_1
    return-object v1

    .line 53
    :pswitch_0
    check-cast p1, Lqu;

    .line 54
    .line 55
    iget p1, p1, Lqu;->a:I

    .line 56
    .line 57
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Lzu;

    .line 62
    .line 63
    iget-object v0, p0, Lzu;->a:Lw3;

    .line 64
    .line 65
    new-instance v2, Lzt0;

    .line 66
    .line 67
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 71
    .line 72
    iput-object v3, v2, Lzt0;->d:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-virtual {p0}, Lzu;->f()Ldv;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v0}, Lw3;->getEmbeddedViewFocusRect()Lst0;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    new-instance v4, Lyu;

    .line 83
    .line 84
    invoke-direct {v4, p1, v2}, Lyu;-><init>(ILzt0;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1, v0, v4}, Lzu;->e(ILst0;Lsw;)Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-static {p1, v0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    invoke-virtual {p0}, Lzu;->f()Ldv;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-eq v3, p0, :cond_3

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    if-eqz p1, :cond_5

    .line 107
    .line 108
    iget-object p0, v2, Lzt0;->d:Ljava/lang/Object;

    .line 109
    .line 110
    if-nez p0, :cond_4

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    if-eqz p0, :cond_5

    .line 118
    .line 119
    iget-object p0, v2, Lzt0;->d:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p0, Ljava/lang/Boolean;

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    :cond_5
    :goto_2
    return-object v1

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
