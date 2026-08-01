.class public final synthetic Lsb1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Lec1;

.field public final synthetic θ:Lum1;

.field public final synthetic ι:Landroid/widget/Button;

.field public final synthetic κ:Lum1;

.field public final synthetic λ:Lum1;

.field public final synthetic μ:Landroid/widget/Button;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lec1;Lum1;Landroid/widget/Button;Lum1;Lum1;Landroid/widget/Button;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lsb1;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lsb1;->ζ:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lsb1;->η:Lec1;

    .line 10
    .line 11
    iput-object p3, p0, Lsb1;->θ:Lum1;

    .line 12
    .line 13
    iput-object p4, p0, Lsb1;->ι:Landroid/widget/Button;

    .line 14
    .line 15
    iput-object p5, p0, Lsb1;->κ:Lum1;

    .line 16
    .line 17
    iput-object p6, p0, Lsb1;->λ:Lum1;

    .line 18
    .line 19
    iput-object p7, p0, Lsb1;->μ:Landroid/widget/Button;

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Lum1;Lum1;Lec1;Landroid/widget/Button;Landroid/widget/Button;Lum1;)V
    .locals 1

    .line 22
    const/4 v0, 0x0

    iput v0, p0, Lsb1;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsb1;->ζ:Landroid/app/Activity;

    iput-object p2, p0, Lsb1;->θ:Lum1;

    iput-object p3, p0, Lsb1;->κ:Lum1;

    iput-object p4, p0, Lsb1;->η:Lec1;

    iput-object p5, p0, Lsb1;->ι:Landroid/widget/Button;

    iput-object p6, p0, Lsb1;->μ:Landroid/widget/Button;

    iput-object p7, p0, Lsb1;->λ:Lum1;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 11

    .line 1
    iget p1, p0, Lsb1;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p1, Lxd1;->α:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    iget-object v1, p0, Lsb1;->θ:Lum1;

    .line 9
    .line 10
    iget-object p1, v1, Lum1;->ε:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Ljava/util/Set;

    .line 13
    .line 14
    invoke-static {}, Lv81;->ι()Lqd;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v6, v0, Lqd;->ζ:I

    .line 19
    .line 20
    new-instance v0, Lnb1;

    .line 21
    .line 22
    iget-object v2, p0, Lsb1;->ι:Landroid/widget/Button;

    .line 23
    .line 24
    iget-object v3, p0, Lsb1;->κ:Lum1;

    .line 25
    .line 26
    iget-object v4, p0, Lsb1;->λ:Lum1;

    .line 27
    .line 28
    iget-object v5, p0, Lsb1;->μ:Landroid/widget/Button;

    .line 29
    .line 30
    invoke-direct/range {v0 .. v5}, Lnb1;-><init>(Lum1;Landroid/widget/Button;Lum1;Lum1;Landroid/widget/Button;)V

    .line 31
    .line 32
    .line 33
    iget-object v3, p0, Lsb1;->ζ:Landroid/app/Activity;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v2, Lm9;

    .line 42
    .line 43
    iget-object v4, p0, Lsb1;->η:Lec1;

    .line 44
    .line 45
    move-object v5, p1

    .line 46
    move-object v7, v0

    .line 47
    invoke-direct/range {v2 .. v7}, Lm9;-><init>(Landroid/app/Activity;Lec1;Ljava/util/Set;ILnb1;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_0
    invoke-static {}, Lv81;->ι()Lqd;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    sget-object v0, Lxd1;->α:Ljava/util/concurrent/ExecutorService;

    .line 59
    .line 60
    new-instance v4, Lvd1;

    .line 61
    .line 62
    iget-object v6, p0, Lsb1;->θ:Lum1;

    .line 63
    .line 64
    iget-object v0, v6, Lum1;->ε:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Ltd;

    .line 67
    .line 68
    iget-object v7, p0, Lsb1;->κ:Lum1;

    .line 69
    .line 70
    iget-object v1, v7, Lum1;->ε:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-direct {v4, v0, v1}, Lvd1;-><init>(Ltd;Ljava/lang/Integer;)V

    .line 75
    .line 76
    .line 77
    iget p1, p1, Lqd;->ζ:I

    .line 78
    .line 79
    new-instance v5, Lnb1;

    .line 80
    .line 81
    iget-object v8, p0, Lsb1;->ι:Landroid/widget/Button;

    .line 82
    .line 83
    iget-object v9, p0, Lsb1;->μ:Landroid/widget/Button;

    .line 84
    .line 85
    iget-object v10, p0, Lsb1;->λ:Lum1;

    .line 86
    .line 87
    invoke-direct/range {v5 .. v10}, Lnb1;-><init>(Lum1;Lum1;Landroid/widget/Button;Landroid/widget/Button;Lum1;)V

    .line 88
    .line 89
    .line 90
    iget-object v2, p0, Lsb1;->ζ:Landroid/app/Activity;

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object p0, p0, Lsb1;->η:Lec1;

    .line 96
    .line 97
    iget-object v0, p0, Lec1;->δ:Ljava/lang/String;

    .line 98
    .line 99
    const-string v1, " \u7684\u79cd\u5b50\u7b56\u7565"

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    iget-object p0, p0, Lec1;->η:Lid;

    .line 106
    .line 107
    const/4 v0, 0x0

    .line 108
    if-eqz p0, :cond_0

    .line 109
    .line 110
    iget-object v1, p0, Lid;->γ:Lzd1;

    .line 111
    .line 112
    if-eqz v1, :cond_0

    .line 113
    .line 114
    iget-object v1, v1, Lzd1;->β:Ljava/lang/Integer;

    .line 115
    .line 116
    move-object v6, v1

    .line 117
    goto :goto_0

    .line 118
    :cond_0
    move-object v6, v0

    .line 119
    :goto_0
    if-eqz p0, :cond_1

    .line 120
    .line 121
    iget-object p0, p0, Lid;->γ:Lzd1;

    .line 122
    .line 123
    if-eqz p0, :cond_1

    .line 124
    .line 125
    sget-object v0, Lqc1;->α:Lqc1;

    .line 126
    .line 127
    invoke-static {p0}, Lqc1;->β(Lzd1;)Ljava/lang/Long;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    :cond_1
    move-object v7, v0

    .line 132
    new-instance v1, Lpd1;

    .line 133
    .line 134
    const/4 v8, 0x0

    .line 135
    const/4 v9, 0x1

    .line 136
    move-object v10, v5

    .line 137
    move v5, p1

    .line 138
    invoke-direct/range {v1 .. v10}, Lpd1;-><init>(Landroid/app/Activity;Ljava/lang/String;Lvd1;ILjava/lang/Integer;Ljava/lang/Long;ZZLa80;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
