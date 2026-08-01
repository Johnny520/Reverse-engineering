.class public final Lof;
.super Lco0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic ι:I

.field public final κ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lof;->ι:I

    .line 2
    .line 3
    invoke-direct {p0}, Lkotlinx/coroutines/internal/α;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lof;->κ:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final λ()Z
    .locals 0

    .line 1
    iget p0, p0, Lof;->ι:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    :pswitch_0
    const/4 p0, 0x0

    .line 9
    return p0

    .line 10
    :pswitch_1
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final μ(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    iget v0, p0, Lof;->ι:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lof;->κ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La80;

    .line 9
    .line 10
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p0, p0, Lof;->κ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lae;

    .line 17
    .line 18
    sget-object p1, Ls62;->α:Ls62;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lae;->ζ(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    iget-object p1, p0, Lof;->κ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lae;

    .line 27
    .line 28
    invoke-virtual {p0}, Lco0;->κ()Lfo0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Lfo0;->Β()Ljava/util/concurrent/CancellationException;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p1}, Lae;->ω()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    iget-object v0, p1, Lae;->θ:Lop;

    .line 44
    .line 45
    check-cast v0, Lgt;

    .line 46
    .line 47
    sget-object v1, Lgt;->μ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 48
    .line 49
    :goto_0
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    sget-object v3, Ljx0;->ζ:Luy;

    .line 54
    .line 55
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_3

    .line 60
    .line 61
    :cond_1
    invoke-virtual {v1, v0, v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    if-eq v2, v3, :cond_1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    instance-of v3, v2, Ljava/lang/Throwable;

    .line 76
    .line 77
    if-eqz v3, :cond_4

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    const/4 v3, 0x0

    .line 81
    invoke-virtual {v1, v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_6

    .line 86
    .line 87
    :goto_1
    invoke-virtual {p1, p0}, Lae;->ο(Ljava/lang/Throwable;)Z

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lae;->ω()Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-nez p0, :cond_5

    .line 95
    .line 96
    invoke-virtual {p1}, Lae;->π()V

    .line 97
    .line 98
    .line 99
    :cond_5
    :goto_2
    return-void

    .line 100
    :cond_6
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    if-eq v3, v2, :cond_4

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
