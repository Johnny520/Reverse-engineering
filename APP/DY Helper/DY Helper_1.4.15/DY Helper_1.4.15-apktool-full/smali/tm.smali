.class public final Ltm;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lfr0;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroidx/activity/ComponentActivity;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/ComponentActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltm;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Ltm;->ζ:Landroidx/activity/ComponentActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final κ(Lhr0;Lbr0;)V
    .locals 1

    .line 1
    iget v0, p0, Ltm;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lbr0;->ON_CREATE:Lbr0;

    .line 7
    .line 8
    if-ne p2, v0, :cond_0

    .line 9
    .line 10
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v0, 0x21

    .line 13
    .line 14
    if-lt p2, v0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Ltm;->ζ:Landroidx/activity/ComponentActivity;

    .line 17
    .line 18
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->λ:Ld51;

    .line 19
    .line 20
    check-cast p1, Landroidx/activity/ComponentActivity;

    .line 21
    .line 22
    invoke-static {p1}, Lum;->α(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Ld51;->ε:Landroid/window/OnBackInvokedDispatcher;

    .line 33
    .line 34
    iget-boolean p1, p0, Ld51;->η:Z

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Ld51;->β(Z)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void

    .line 40
    :pswitch_0
    iget-object p1, p0, Ltm;->ζ:Landroidx/activity/ComponentActivity;

    .line 41
    .line 42
    iget-object p2, p1, Landroidx/activity/ComponentActivity;->κ:Lq92;

    .line 43
    .line 44
    if-nez p2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, Lvm;

    .line 51
    .line 52
    if-eqz p2, :cond_1

    .line 53
    .line 54
    iget-object p2, p2, Lvm;->α:Lq92;

    .line 55
    .line 56
    iput-object p2, p1, Landroidx/activity/ComponentActivity;->κ:Lq92;

    .line 57
    .line 58
    :cond_1
    iget-object p2, p1, Landroidx/activity/ComponentActivity;->κ:Lq92;

    .line 59
    .line 60
    if-nez p2, :cond_2

    .line 61
    .line 62
    new-instance p2, Lq92;

    .line 63
    .line 64
    invoke-direct {p2}, Lq92;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p2, p1, Landroidx/activity/ComponentActivity;->κ:Lq92;

    .line 68
    .line 69
    :cond_2
    iget-object p1, p1, Landroidx/activity/ComponentActivity;->θ:Ljr0;

    .line 70
    .line 71
    invoke-virtual {p1, p0}, Ljr0;->ζ(Lgr0;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_1
    sget-object p1, Lbr0;->ON_DESTROY:Lbr0;

    .line 76
    .line 77
    if-ne p2, p1, :cond_4

    .line 78
    .line 79
    iget-object p1, p0, Ltm;->ζ:Landroidx/activity/ComponentActivity;

    .line 80
    .line 81
    iget-object p1, p1, Landroidx/activity/ComponentActivity;->ζ:La;

    .line 82
    .line 83
    const/4 p2, 0x0

    .line 84
    iput-object p2, p1, La;->β:Ljava/lang/Object;

    .line 85
    .line 86
    iget-object p1, p0, Ltm;->ζ:Landroidx/activity/ComponentActivity;

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-nez p1, :cond_3

    .line 93
    .line 94
    iget-object p1, p0, Ltm;->ζ:Landroidx/activity/ComponentActivity;

    .line 95
    .line 96
    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->γ()Lq92;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1}, Lq92;->α()V

    .line 101
    .line 102
    .line 103
    :cond_3
    iget-object p0, p0, Ltm;->ζ:Landroidx/activity/ComponentActivity;

    .line 104
    .line 105
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->μ:Lwm;

    .line 106
    .line 107
    iget-object p1, p0, Lwm;->θ:Landroidx/activity/ComponentActivity;

    .line 108
    .line 109
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-virtual {p2, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 133
    .line 134
    .line 135
    :cond_4
    return-void

    .line 136
    :pswitch_2
    sget-object p1, Lbr0;->ON_STOP:Lbr0;

    .line 137
    .line 138
    if-ne p2, p1, :cond_6

    .line 139
    .line 140
    iget-object p0, p0, Ltm;->ζ:Landroidx/activity/ComponentActivity;

    .line 141
    .line 142
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    if-eqz p0, :cond_5

    .line 147
    .line 148
    invoke-virtual {p0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    goto :goto_0

    .line 153
    :cond_5
    const/4 p0, 0x0

    .line 154
    :goto_0
    if-eqz p0, :cond_6

    .line 155
    .line 156
    invoke-virtual {p0}, Landroid/view/View;->cancelPendingInputEvents()V

    .line 157
    .line 158
    .line 159
    :cond_6
    return-void

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
