.class public final synthetic Lvg;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lvg;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lvg;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    iget p1, p0, Lvg;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lvg;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lva2;

    .line 9
    .line 10
    invoke-virtual {p0}, Lva2;->α()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p0, Lvv1;

    .line 15
    .line 16
    iget-object p0, p0, Lvv1;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_1
    check-cast p0, Landroid/app/Activity;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-static {p0, p1}, Ldd1;->δ(Landroid/app/Activity;Z)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_2
    check-cast p0, Lli0;

    .line 31
    .line 32
    iget-object p1, p0, Lli0;->φ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lli0;->Κ:Lii0;

    .line 39
    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    sget-object v1, Lmi0;->α:Landroid/os/Handler;

    .line 43
    .line 44
    invoke-virtual {v1, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object p1, p0, Lli0;->Μ:Lnt;

    .line 48
    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    invoke-virtual {p1}, Lnt;->invoke()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_1
    const/4 p1, 0x0

    .line 55
    iput-object p1, p0, Lli0;->Μ:Lnt;

    .line 56
    .line 57
    iget-object p0, p0, Lli0;->Λ:Ln5;

    .line 58
    .line 59
    if-eqz p0, :cond_2

    .line 60
    .line 61
    iget-object p1, p0, Ln5;->η:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-virtual {p1, v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    iget-object p0, p0, Ln5;->ζ:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Lp3;

    .line 75
    .line 76
    invoke-virtual {p0}, Lp3;->invoke()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    :cond_2
    return-void

    .line 80
    :pswitch_3
    check-cast p0, Lnd0;

    .line 81
    .line 82
    iget-object p1, p0, Lnd0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 83
    .line 84
    const/4 v0, 0x1

    .line 85
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lnd0;->Ι:Lnt;

    .line 89
    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    invoke-virtual {p1}, Lnt;->invoke()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    :cond_3
    const/4 p1, 0x0

    .line 96
    iput-object p1, p0, Lnd0;->Ι:Lnt;

    .line 97
    .line 98
    iget-object p0, p0, Lnd0;->γ:Landroid/os/Handler;

    .line 99
    .line 100
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :pswitch_4
    check-cast p0, Ldc0;

    .line 105
    .line 106
    iget-object p1, p0, Ldc0;->ο:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 107
    .line 108
    const/4 v0, 0x1

    .line 109
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 110
    .line 111
    .line 112
    iget-object p1, p0, Ldc0;->ω:Lnt;

    .line 113
    .line 114
    if-eqz p1, :cond_4

    .line 115
    .line 116
    invoke-virtual {p1}, Lnt;->invoke()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    :cond_4
    const/4 p1, 0x0

    .line 120
    iput-object p1, p0, Ldc0;->ω:Lnt;

    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_5
    check-cast p0, Lum1;

    .line 124
    .line 125
    iget-object p1, p0, Lum1;->ε:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p1, Lt90;

    .line 128
    .line 129
    const/4 v0, 0x0

    .line 130
    if-eqz p1, :cond_5

    .line 131
    .line 132
    iget-object v1, p1, Lt90;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 133
    .line 134
    const/4 v2, 0x1

    .line 135
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_5

    .line 140
    .line 141
    iget-object p1, p1, Lt90;->α:Lp3;

    .line 142
    .line 143
    invoke-virtual {p1}, Lp3;->invoke()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    :cond_5
    const/4 p1, 0x0

    .line 147
    iput-object p1, p0, Lum1;->ε:Ljava/lang/Object;

    .line 148
    .line 149
    sget-object p0, Lu90;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 150
    .line 151
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :pswitch_6
    check-cast p0, Landroid/app/AlertDialog;

    .line 156
    .line 157
    sget-object p1, Lpd2;->μ:Ljava/lang/ref/WeakReference;

    .line 158
    .line 159
    const/4 v0, 0x0

    .line 160
    if-eqz p1, :cond_6

    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    check-cast p1, Landroid/app/AlertDialog;

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_6
    move-object p1, v0

    .line 170
    :goto_0
    if-ne p1, p0, :cond_7

    .line 171
    .line 172
    sput-object v0, Lpd2;->μ:Ljava/lang/ref/WeakReference;

    .line 173
    .line 174
    :cond_7
    return-void

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
