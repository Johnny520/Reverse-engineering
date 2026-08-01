.class public final synthetic Lm9;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:I

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;

.field public final synthetic κ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lec1;Ljava/util/Set;ILnb1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lm9;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lm9;->η:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lm9;->θ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lm9;->ι:Ljava/lang/Object;

    .line 12
    .line 13
    iput p4, p0, Lm9;->ζ:I

    .line 14
    .line 15
    iput-object p5, p0, Lm9;->κ:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Dialog;Landroid/util/DisplayMetrics;Landroid/view/View;Landroid/view/Window;I)V
    .locals 1

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lm9;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9;->η:Ljava/lang/Object;

    iput-object p2, p0, Lm9;->θ:Ljava/lang/Object;

    iput-object p3, p0, Lm9;->ι:Ljava/lang/Object;

    iput-object p4, p0, Lm9;->κ:Ljava/lang/Object;

    iput p5, p0, Lm9;->ζ:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILqm1;Lum1;Ljava/util/concurrent/CountDownLatch;)V
    .locals 1

    .line 19
    const/4 v0, 0x1

    iput v0, p0, Lm9;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9;->η:Ljava/lang/Object;

    iput p2, p0, Lm9;->ζ:I

    iput-object p3, p0, Lm9;->θ:Ljava/lang/Object;

    iput-object p4, p0, Lm9;->ι:Ljava/lang/Object;

    iput-object p5, p0, Lm9;->κ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lm9;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lm9;->κ:Ljava/lang/Object;

    .line 5
    .line 6
    iget v3, p0, Lm9;->ζ:I

    .line 7
    .line 8
    iget-object v4, p0, Lm9;->ι:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, p0, Lm9;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p0, p0, Lm9;->η:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, Landroid/app/Activity;

    .line 18
    .line 19
    check-cast v5, Lec1;

    .line 20
    .line 21
    check-cast v4, Ljava/util/Set;

    .line 22
    .line 23
    check-cast v2, Lnb1;

    .line 24
    .line 25
    :try_start_0
    invoke-static {p0, v5, v4, v3, v2}, Lxd1;->κ(Landroid/app/Activity;Lec1;Ljava/util/Set;ILnb1;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    new-instance v2, Leo1;

    .line 33
    .line 34
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object v0, v2

    .line 38
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    const-string v2, "DYHelper"

    .line 45
    .line 46
    const-string v3, "\u6253\u5f00\u8425\u5730\u79cd\u5b50\u6392\u9664\u9762\u677f\u5931\u8d25"

    .line 47
    .line 48
    invoke-static {v2, v3, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    const-string v0, ""

    .line 58
    .line 59
    :cond_0
    const-string v2, "\u6253\u5f00\u79cd\u5b50\u6392\u9664\u9762\u677f\u5931\u8d25: "

    .line 60
    .line 61
    invoke-static {v1, p0, v2, v0}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    return-void

    .line 65
    :pswitch_0
    const-string v0, "DYHelperExportFull"

    .line 66
    .line 67
    check-cast v5, Lqm1;

    .line 68
    .line 69
    check-cast v4, Lum1;

    .line 70
    .line 71
    check-cast v2, Ljava/util/concurrent/CountDownLatch;

    .line 72
    .line 73
    :try_start_1
    sget-object v6, Lqe0;->α:Ljava/lang/Object;

    .line 74
    .line 75
    const-string v6, "loadOld"

    .line 76
    .line 77
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    filled-new-array {v3, v0}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {p0, v6, v0}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    iput-boolean v1, v5, Lqm1;->ε:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 89
    .line 90
    :goto_1
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :catchall_1
    move-exception p0

    .line 95
    :try_start_2
    iput-object p0, v4, Lum1;->ε:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :goto_2
    return-void

    .line 99
    :catchall_2
    move-exception p0

    .line 100
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 101
    .line 102
    .line 103
    throw p0

    .line 104
    :pswitch_1
    check-cast p0, Landroid/app/Dialog;

    .line 105
    .line 106
    check-cast v5, Landroid/util/DisplayMetrics;

    .line 107
    .line 108
    check-cast v4, Landroid/view/View;

    .line 109
    .line 110
    check-cast v2, Landroid/view/Window;

    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-nez p0, :cond_2

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_2
    iget p0, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 120
    .line 121
    int-to-float p0, p0

    .line 122
    const v0, 0x3f333333    # 0.7f

    .line 123
    .line 124
    .line 125
    mul-float/2addr p0, v0

    .line 126
    float-to-int p0, p0

    .line 127
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-le v0, p0, :cond_3

    .line 132
    .line 133
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iput p0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 138
    .line 139
    invoke-virtual {v4, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4}, Landroid/view/View;->requestLayout()V

    .line 143
    .line 144
    .line 145
    const/4 p0, -0x2

    .line 146
    invoke-virtual {v2, v3, p0}, Landroid/view/Window;->setLayout(II)V

    .line 147
    .line 148
    .line 149
    :cond_3
    :goto_3
    return-void

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
