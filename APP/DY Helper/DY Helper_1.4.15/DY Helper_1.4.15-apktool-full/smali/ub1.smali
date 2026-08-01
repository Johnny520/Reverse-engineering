.class public final Lub1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:Landroid/app/AlertDialog;

.field public final synthetic ζ:Lum1;

.field public final synthetic η:Landroid/app/Activity;

.field public final synthetic θ:Landroid/view/View;

.field public final synthetic ι:Lum1;

.field public final synthetic κ:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/app/AlertDialog;Lum1;Landroid/app/Activity;Landroid/view/View;Lum1;Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lub1;->ε:Landroid/app/AlertDialog;

    .line 5
    .line 6
    iput-object p2, p0, Lub1;->ζ:Lum1;

    .line 7
    .line 8
    iput-object p3, p0, Lub1;->η:Landroid/app/Activity;

    .line 9
    .line 10
    iput-object p4, p0, Lub1;->θ:Landroid/view/View;

    .line 11
    .line 12
    iput-object p5, p0, Lub1;->ι:Lum1;

    .line 13
    .line 14
    iput-object p6, p0, Lub1;->κ:Landroid/os/Handler;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-object v0, p0, Lub1;->ι:Lum1;

    .line 2
    .line 3
    iget-object v1, p0, Lub1;->η:Landroid/app/Activity;

    .line 4
    .line 5
    iget-object v2, p0, Lub1;->θ:Landroid/view/View;

    .line 6
    .line 7
    iget-object v3, p0, Lub1;->ε:Landroid/app/AlertDialog;

    .line 8
    .line 9
    invoke-virtual {v3}, Landroid/app/Dialog;->isShowing()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget-object v3, Ljc1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    sget-object v3, Ljc1;->γ:La;

    .line 19
    .line 20
    iget-object v3, v3, La;->β:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Lｚ;

    .line 23
    .line 24
    iget-wide v4, v3, Lｚ;->α:J

    .line 25
    .line 26
    iget-boolean v6, v3, Lｚ;->β:Z

    .line 27
    .line 28
    iget-object v7, v3, Lｚ;->γ:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v7, Lgc1;

    .line 31
    .line 32
    iget-object v3, v3, Lｚ;->δ:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Ldc1;

    .line 35
    .line 36
    iget-object v8, p0, Lub1;->ζ:Lum1;

    .line 37
    .line 38
    if-eqz v6, :cond_2

    .line 39
    .line 40
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, v8, Lum1;->ε:Ljava/lang/Object;

    .line 45
    .line 46
    if-eqz v7, :cond_1

    .line 47
    .line 48
    invoke-static {v1, v2, v7}, Lxn0;->П(Landroid/app/Activity;Landroid/view/View;Lgc1;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const-string v0, "\u8425\u5730\u4efb\u52a1\u6b63\u5728\u6267\u884c"

    .line 53
    .line 54
    const-string v3, "\u6b63\u5728\u7b49\u5f85\u9996\u4e2a\u8fdb\u5ea6\u56de\u8c03"

    .line 55
    .line 56
    invoke-static {v1, v2, v0, v3}, Lxn0;->ξ(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    const/4 v0, 0x1

    .line 60
    invoke-static {v2, v0}, Lxn0;->В(Landroid/view/View;Z)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    iget-object v6, v8, Lum1;->ε:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v6, Ljava/lang/Long;

    .line 67
    .line 68
    if-nez v6, :cond_3

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide v6

    .line 75
    cmp-long v6, v6, v4

    .line 76
    .line 77
    if-nez v6, :cond_5

    .line 78
    .line 79
    iget-object v6, v0, Lum1;->ε:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v6, Ljava/lang/Long;

    .line 82
    .line 83
    if-nez v6, :cond_4

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v6

    .line 90
    cmp-long v6, v6, v4

    .line 91
    .line 92
    if-eqz v6, :cond_5

    .line 93
    .line 94
    :goto_1
    if-eqz v3, :cond_5

    .line 95
    .line 96
    invoke-static {v1, v2, v3}, Lxn0;->Ξ(Landroid/app/Activity;Landroid/view/View;Ldc1;)Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_5

    .line 101
    .line 102
    invoke-virtual {v3}, Ldc1;->α()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-static {v1, v2, v3}, Lxn0;->т(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    iput-object v1, v0, Lum1;->ε:Ljava/lang/Object;

    .line 114
    .line 115
    :cond_5
    :goto_2
    iget-object v0, p0, Lub1;->κ:Landroid/os/Handler;

    .line 116
    .line 117
    const-wide/16 v1, 0xfa

    .line 118
    .line 119
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 120
    .line 121
    .line 122
    return-void
.end method
