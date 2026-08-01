.class public final synthetic Laf0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Z

.field public final synthetic θ:Z


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;ZZ)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Laf0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p2, p0, Laf0;->η:Z

    .line 8
    .line 9
    iput-object p1, p0, Laf0;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-boolean p3, p0, Laf0;->θ:Z

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lz81;ZZI)V
    .locals 0

    .line 14
    iput p4, p0, Laf0;->ε:I

    iput-object p1, p0, Laf0;->ζ:Ljava/lang/Object;

    iput-boolean p2, p0, Laf0;->η:Z

    iput-boolean p3, p0, Laf0;->θ:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Laf0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Laf0;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    iget-boolean v1, p0, Laf0;->θ:Z

    .line 11
    .line 12
    sget-object v2, Ls62;->α:Ls62;

    .line 13
    .line 14
    :try_start_0
    invoke-static {v0, v1}, Lmj;->α(Landroid/view/ViewGroup;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    move-object v3, v2

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    new-instance v3, Leo1;

    .line 21
    .line 22
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v3, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v4, "apply failed: "

    .line 38
    .line 39
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v1}, Lmj;->σ(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    iget-boolean p0, p0, Laf0;->η:Z

    .line 53
    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    new-instance p0, Lgj;

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-direct {p0, v0, v1}, Lgj;-><init>(Landroid/view/ViewGroup;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 63
    .line 64
    .line 65
    new-instance p0, Lgj;

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    invoke-direct {p0, v0, v1}, Lgj;-><init>(Landroid/view/ViewGroup;I)V

    .line 69
    .line 70
    .line 71
    const-wide/16 v3, 0xb4

    .line 72
    .line 73
    invoke-virtual {v0, p0, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 74
    .line 75
    .line 76
    new-instance p0, Lgj;

    .line 77
    .line 78
    const/4 v1, 0x2

    .line 79
    invoke-direct {p0, v0, v1}, Lgj;-><init>(Landroid/view/ViewGroup;I)V

    .line 80
    .line 81
    .line 82
    const-wide/16 v3, 0x208

    .line 83
    .line 84
    invoke-virtual {v0, p0, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 85
    .line 86
    .line 87
    :cond_1
    return-object v2

    .line 88
    :pswitch_0
    iget-object v0, p0, Laf0;->ζ:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Lz81;

    .line 91
    .line 92
    iget-boolean v1, p0, Laf0;->θ:Z

    .line 93
    .line 94
    sget-object v2, Lug;->α:Ltg;

    .line 95
    .line 96
    iget-boolean p0, p0, Laf0;->η:Z

    .line 97
    .line 98
    invoke-virtual {v2, v0, p0, v1}, Ltg;->Ι(Lz81;ZZ)V

    .line 99
    .line 100
    .line 101
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_1
    iget-object v0, p0, Laf0;->ζ:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lz81;

    .line 107
    .line 108
    iget-boolean v1, p0, Laf0;->θ:Z

    .line 109
    .line 110
    sget-object v2, Lug;->α:Ltg;

    .line 111
    .line 112
    iget-boolean p0, p0, Laf0;->η:Z

    .line 113
    .line 114
    invoke-virtual {v2, v0, p0, v1}, Ltg;->Ι(Lz81;ZZ)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
