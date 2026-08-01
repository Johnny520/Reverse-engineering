.class public final Lsq0;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/String;

.field public final synthetic γ:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Class;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lsq0;->α:I

    .line 2
    .line 3
    iput-object p3, p0, Lsq0;->β:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lsq0;->γ:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-direct {p0}, Lm01;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lk01;)V
    .locals 5

    .line 1
    iget v0, p0, Lsq0;->α:I

    .line 2
    .line 3
    iget-object v1, p0, Lsq0;->γ:Ljava/lang/Class;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x7

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object p0, p0, Lsq0;->β:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    instance-of v0, p1, Landroid/view/View;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    move-object v4, p1

    .line 30
    check-cast v4, Landroid/view/View;

    .line 31
    .line 32
    :cond_0
    if-nez v4, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    sget-object p1, Lq10;->α:Lq10;

    .line 36
    .line 37
    new-instance p1, Lp3;

    .line 38
    .line 39
    invoke-direct {p1, p0, v3, v4}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {p1}, Lp3;->invoke()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    sget-object v0, Lq10;->γ:Landroid/os/Handler;

    .line 61
    .line 62
    new-instance v3, Lr0;

    .line 63
    .line 64
    invoke-direct {v3, v2, p1}, Lr0;-><init>(ILp70;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 68
    .line 69
    .line 70
    :goto_0
    invoke-static {p0}, Lui1;->ω(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    sget-object p1, Ltq0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const-string v0, "onViewCreated:"

    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {v4, p0, p1}, Ltq0;->α(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :goto_1
    return-void

    .line 93
    :pswitch_0
    iget-object p1, p1, Lk01;->ε:Ljava/lang/Object;

    .line 94
    .line 95
    instance-of v0, p1, Landroid/view/View;

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    move-object v4, p1

    .line 100
    check-cast v4, Landroid/view/View;

    .line 101
    .line 102
    :cond_4
    if-nez v4, :cond_5

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_5
    sget-object p1, Lq10;->α:Lq10;

    .line 106
    .line 107
    new-instance p1, Lp3;

    .line 108
    .line 109
    invoke-direct {p1, p0, v3, v4}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {v0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_6

    .line 125
    .line 126
    invoke-virtual {p1}, Lp3;->invoke()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_6
    sget-object v0, Lq10;->γ:Landroid/os/Handler;

    .line 131
    .line 132
    new-instance v3, Lr0;

    .line 133
    .line 134
    invoke-direct {v3, v2, p1}, Lr0;-><init>(ILp70;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 138
    .line 139
    .line 140
    :goto_2
    invoke-static {p0}, Lui1;->ω(Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-nez p1, :cond_7

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_7
    sget-object p1, Ltq0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    const-string v0, "onCreateView:"

    .line 154
    .line 155
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-static {v4, p0, p1}, Ltq0;->α(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :goto_3
    return-void

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
