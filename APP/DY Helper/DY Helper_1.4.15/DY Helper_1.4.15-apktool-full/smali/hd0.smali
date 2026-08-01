.class public final synthetic Lhd0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lnd0;


# direct methods
.method public synthetic constructor <init>(Lnd0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lhd0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lhd0;->ζ:Lnd0;

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
    .locals 8

    .line 1
    iget v0, p0, Lhd0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lhd0;->ζ:Lnd0;

    .line 7
    .line 8
    iget-object v0, p0, Lnd0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    iget-object v1, p0, Lnd0;->ο:Landroid/widget/EditText;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Lnd0;->Α:Landroid/app/AlertDialog;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lnd0;->α:Landroid/app/Activity;

    .line 31
    .line 32
    const-string v0, "input_method"

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    instance-of v0, p0, Landroid/view/inputmethod/InputMethodManager;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 p0, 0x0

    .line 46
    :goto_0
    if-eqz p0, :cond_2

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    invoke-virtual {p0, v1, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_1
    return-void

    .line 53
    :pswitch_0
    iget-object p0, p0, Lhd0;->ζ:Lnd0;

    .line 54
    .line 55
    iget-object v1, p0, Lnd0;->ε:Ljava/lang/ClassLoader;

    .line 56
    .line 57
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance v2, Llj0;

    .line 61
    .line 62
    sget-object v0, Lvh0;->α:Lvh0;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lvh0;->δ(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    sget-object v4, Lnz;->ε:Lnz;

    .line 69
    .line 70
    const-string v7, ""

    .line 71
    .line 72
    const/4 v5, 0x0

    .line 73
    const/4 v6, 0x0

    .line 74
    invoke-direct/range {v2 .. v7}, Llj0;-><init>(Ljava/util/List;Ljava/util/Set;ZZLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    new-instance v2, Leo1;

    .line 80
    .line 81
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    :goto_2
    instance-of v0, v2, Leo1;

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    move-object v0, v3

    .line 90
    goto :goto_3

    .line 91
    :cond_3
    move-object v0, v2

    .line 92
    :goto_3
    check-cast v0, Llj0;

    .line 93
    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    iget-object v0, v0, Llj0;->α:Ljava/util/List;

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_4
    move-object v0, v3

    .line 100
    :goto_4
    sget-object v4, Ljz;->ε:Ljz;

    .line 101
    .line 102
    if-nez v0, :cond_5

    .line 103
    .line 104
    move-object v0, v4

    .line 105
    :cond_5
    invoke-static {v0}, Lnd0;->ζ(Ljava/util/List;)V

    .line 106
    .line 107
    .line 108
    new-instance v0, Lp3;

    .line 109
    .line 110
    const/16 v5, 0xf

    .line 111
    .line 112
    invoke-direct {v0, p0, v5, v2}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v0}, Lnd0;->δ(Lp70;)V

    .line 116
    .line 117
    .line 118
    :try_start_1
    new-instance v0, Lη;

    .line 119
    .line 120
    const/16 v5, 0xa

    .line 121
    .line 122
    invoke-direct {v0, v5, p0}, Lη;-><init>(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v1, v0}, Ls1;->ρ(Ljava/lang/ClassLoader;Lp70;)Llj0;

    .line 126
    .line 127
    .line 128
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 129
    goto :goto_5

    .line 130
    :catchall_1
    move-exception v0

    .line 131
    new-instance v1, Leo1;

    .line 132
    .line 133
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    move-object v0, v1

    .line 137
    :goto_5
    instance-of v1, v0, Leo1;

    .line 138
    .line 139
    if-eqz v1, :cond_6

    .line 140
    .line 141
    move-object v1, v3

    .line 142
    goto :goto_6

    .line 143
    :cond_6
    move-object v1, v0

    .line 144
    :goto_6
    check-cast v1, Llj0;

    .line 145
    .line 146
    if-eqz v1, :cond_7

    .line 147
    .line 148
    iget-object v3, v1, Llj0;->α:Ljava/util/List;

    .line 149
    .line 150
    :cond_7
    if-nez v3, :cond_8

    .line 151
    .line 152
    goto :goto_7

    .line 153
    :cond_8
    move-object v4, v3

    .line 154
    :goto_7
    invoke-static {v4}, Lnd0;->ζ(Ljava/util/List;)V

    .line 155
    .line 156
    .line 157
    new-instance v1, Lz7;

    .line 158
    .line 159
    const/16 v3, 0x8

    .line 160
    .line 161
    invoke-direct {v1, p0, v0, v2, v3}, Lz7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, v1}, Lnd0;->δ(Lp70;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
