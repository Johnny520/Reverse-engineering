.class public final Ln22;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:J

.field public final synthetic ζ:Landroid/app/Activity;


# direct methods
.method public constructor <init>(JLandroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Ln22;->ε:J

    .line 5
    .line 6
    iput-object p3, p0, Ln22;->ζ:Landroid/app/Activity;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    sget-object v0, Lo22;->α:Lo22;

    .line 2
    .line 3
    invoke-static {}, Lo22;->ζ()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    sget-object p0, Lo22;->ψ:Landroid/os/Handler;

    .line 14
    .line 15
    sget-object v0, Lo22;->φ:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v2, p0, Ln22;->ζ:Landroid/app/Activity;

    .line 22
    .line 23
    :try_start_0
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {v0, v2, v1}, Lo22;->Θ(Landroid/view/View;Ljava/util/Set;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    :goto_0
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :goto_1
    new-instance v1, Leo1;

    .line 46
    .line 47
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    move-object v0, v1

    .line 51
    :goto_2
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    new-instance v1, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v2, "rb7f5fa32cd8e8a76"

    .line 60
    .line 61
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    iget-wide v2, p0, Ln22;->ε:J

    .line 79
    .line 80
    cmp-long v0, v0, v2

    .line 81
    .line 82
    if-gez v0, :cond_4

    .line 83
    .line 84
    sget-object v0, Lo22;->ψ:Landroid/os/Handler;

    .line 85
    .line 86
    sget-object v1, Lo22;->φ:Ljava/lang/Object;

    .line 87
    .line 88
    const-wide/16 v2, 0xfa

    .line 89
    .line 90
    invoke-virtual {v0, p0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    sget-object p0, Lo22;->ψ:Landroid/os/Handler;

    .line 95
    .line 96
    sget-object v0, Lo22;->φ:Ljava/lang/Object;

    .line 97
    .line 98
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    sget-object p0, Lo22;->α:Lo22;

    .line 102
    .line 103
    invoke-static {}, Lo22;->Δ()V

    .line 104
    .line 105
    .line 106
    const-string p0, "r516e1415d637b702"

    .line 107
    .line 108
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :goto_3
    return-void
.end method
