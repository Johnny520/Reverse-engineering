.class public final synthetic Lzg;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/widget/Button;II)V
    .locals 0

    .line 14
    iput p4, p0, Lzg;->h:I

    iput-object p1, p0, Lzg;->i:Ljava/lang/Object;

    iput-object p2, p0, Lzg;->j:Ljava/lang/Object;

    iput p3, p0, Lzg;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp70;ILjava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lzg;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lzg;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, Lzg;->k:I

    .line 10
    .line 11
    iput-object p3, p0, Lzg;->j:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lzg;->h:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lzg;->j:Ljava/lang/Object;

    .line 5
    .line 6
    iget v3, p0, Lzg;->k:I

    .line 7
    .line 8
    iget-object p0, p0, Lzg;->i:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Lp70;

    .line 14
    .line 15
    iget-object p0, p0, Lp70;->a:Lhh1;

    .line 16
    .line 17
    invoke-virtual {p0, v3, v2}, Lhh1;->C(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    check-cast p0, Landroid/app/Activity;

    .line 22
    .line 23
    check-cast v2, Landroid/widget/Button;

    .line 24
    .line 25
    sget-object v0, Lhh;->d:Lhh;

    .line 26
    .line 27
    sub-int/2addr v3, v1

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v0, Lzg;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, p0, v2, v3, v1}, Lzg;-><init>(Landroid/app/Activity;Landroid/widget/Button;II)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_1
    check-cast p0, Landroid/app/Activity;

    .line 42
    .line 43
    check-cast v2, Landroid/widget/Button;

    .line 44
    .line 45
    sget-object v0, Lhh;->h:Ljava/lang/String;

    .line 46
    .line 47
    sget-object v4, Lhh;->d:Lhh;

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-nez v5, :cond_4

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->isShown()Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_1

    .line 67
    .line 68
    invoke-virtual {v2}, Landroid/view/View;->isEnabled()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_1

    .line 73
    .line 74
    invoke-virtual {v2}, Landroid/view/View;->performClick()Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_1

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    const-string p0, "Red packet open button performClick succeeded"

    .line 84
    .line 85
    invoke-static {v0, p0}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    if-gt v3, v1, :cond_3

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    if-eqz p0, :cond_2

    .line 96
    .line 97
    const-string v1, "Nuke.AutoReceiveRedPacket.ClickReceiveScheduled"

    .line 98
    .line 99
    invoke-virtual {p0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    const-string p0, "Red packet open button was not clickable"

    .line 106
    .line 107
    invoke-static {v0, p0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_3
    new-instance v0, Lzg;

    .line 112
    .line 113
    invoke-direct {v0, p0, v2, v3, v1}, Lzg;-><init>(Landroid/app/Activity;Landroid/widget/Button;II)V

    .line 114
    .line 115
    .line 116
    const-wide/16 v3, 0x50

    .line 117
    .line 118
    invoke-virtual {v2, v0, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 119
    .line 120
    .line 121
    :cond_4
    :goto_0
    return-void

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
