.class public final synthetic Lpb1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Landroid/widget/Button;

.field public final synthetic θ:Landroid/widget/Button;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/widget/Button;Landroid/widget/Button;I)V
    .locals 0

    .line 1
    iput p4, p0, Lpb1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lpb1;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lpb1;->η:Landroid/widget/Button;

    .line 6
    .line 7
    iput-object p3, p0, Lpb1;->θ:Landroid/widget/Button;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 13

    .line 1
    iget p1, p0, Lpb1;->ε:I

    .line 2
    .line 3
    iget-object v0, p0, Lpb1;->θ:Landroid/widget/Button;

    .line 4
    .line 5
    iget-object v1, p0, Lpb1;->η:Landroid/widget/Button;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lv81;->ι()Lqd;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v2, Lxd1;->α:Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    iget p1, p1, Lqd;->ζ:I

    .line 17
    .line 18
    new-instance v2, Lrb1;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    iget-object p0, p0, Lpb1;->ζ:Landroid/app/Activity;

    .line 22
    .line 23
    invoke-direct {v2, p0, v1, v0, v3}, Lrb1;-><init>(Landroid/app/Activity;Landroid/widget/Button;Landroid/widget/Button;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v0, Lgs;

    .line 30
    .line 31
    const/4 v1, 0x6

    .line 32
    invoke-direct {v0, p1, v1, p0, v2}, Lgs;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_0
    invoke-static {}, Lv81;->ι()Lqd;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget-object v2, Lxd1;->α:Ljava/util/concurrent/ExecutorService;

    .line 44
    .line 45
    new-instance v6, Lvd1;

    .line 46
    .line 47
    invoke-virtual {p1}, Lqd;->α()Ltd;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iget-object v3, p1, Lqd;->ε:Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-direct {v6, v2, v3}, Lvd1;-><init>(Ltd;Ljava/lang/Integer;)V

    .line 54
    .line 55
    .line 56
    iget v7, p1, Lqd;->ζ:I

    .line 57
    .line 58
    new-instance v12, Lrb1;

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    iget-object v4, p0, Lpb1;->ζ:Landroid/app/Activity;

    .line 62
    .line 63
    invoke-direct {v12, v4, v1, v0, p1}, Lrb1;-><init>(Landroid/app/Activity;Landroid/widget/Button;Landroid/widget/Button;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance v3, Lpd1;

    .line 70
    .line 71
    const-string v5, "\u8bbe\u7f6e\u5168\u5c40\u79cd\u5b50"

    .line 72
    .line 73
    const/4 v8, 0x0

    .line 74
    const/4 v9, 0x0

    .line 75
    const/4 v10, 0x1

    .line 76
    const/4 v11, 0x0

    .line 77
    invoke-direct/range {v3 .. v12}, Lpd1;-><init>(Landroid/app/Activity;Ljava/lang/String;Lvd1;ILjava/lang/Integer;Ljava/lang/Long;ZZLa80;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
