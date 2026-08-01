.class public final synthetic Ltv1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ltv1;->ε:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget p0, p0, Ltv1;->ε:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    sget-object v1, Ls62;->α:Ls62;

    .line 5
    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object p0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 10
    .line 11
    new-instance p0, Lcom/example/dyhelper/ui/χ;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Lcom/example/dyhelper/ui/а;->κ(Lp70;)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :pswitch_0
    sget-object p0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 21
    .line 22
    invoke-static {}, Lcom/example/dyhelper/ui/а;->θ()V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :pswitch_1
    sget-object p0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 27
    .line 28
    invoke-static {}, Lcom/example/dyhelper/ui/а;->θ()V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :pswitch_2
    sget-object p0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 33
    .line 34
    invoke-static {}, Lcom/example/dyhelper/ui/а;->θ()V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :pswitch_3
    sget-object p0, Lry1;->α:Lry1;

    .line 39
    .line 40
    invoke-static {}, Lry1;->х()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_4
    sget-object p0, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-eqz p0, :cond_0

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    const/4 v0, 0x0

    .line 59
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :pswitch_5
    sget-object p0, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    xor-int/2addr p0, v0

    .line 71
    goto :goto_0

    .line 72
    :pswitch_6
    return-object v1

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
