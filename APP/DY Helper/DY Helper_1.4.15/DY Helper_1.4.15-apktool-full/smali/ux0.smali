.class public final synthetic Lux0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:Lf8;

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:I

.field public final synthetic θ:I

.field public final synthetic ι:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic κ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic λ:Ljava/util/concurrent/CountDownLatch;

.field public final synthetic μ:Z

.field public final synthetic ν:Landroid/app/NotificationManager;

.field public final synthetic ξ:I


# direct methods
.method public synthetic constructor <init>(Lf8;Landroid/app/Activity;IILjava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/CountDownLatch;ZLandroid/app/NotificationManager;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lux0;->ε:Lf8;

    .line 5
    .line 6
    iput-object p2, p0, Lux0;->ζ:Landroid/app/Activity;

    .line 7
    .line 8
    iput p3, p0, Lux0;->η:I

    .line 9
    .line 10
    iput p4, p0, Lux0;->θ:I

    .line 11
    .line 12
    iput-object p5, p0, Lux0;->ι:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    iput-object p6, p0, Lux0;->κ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    iput-object p7, p0, Lux0;->λ:Ljava/util/concurrent/CountDownLatch;

    .line 17
    .line 18
    iput-boolean p8, p0, Lux0;->μ:Z

    .line 19
    .line 20
    iput-object p9, p0, Lux0;->ν:Landroid/app/NotificationManager;

    .line 21
    .line 22
    iput p10, p0, Lux0;->ξ:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget-object v8, p0, Lux0;->ε:Lf8;

    .line 2
    .line 3
    iget-object v4, p0, Lux0;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iget v9, p0, Lux0;->η:I

    .line 6
    .line 7
    iget v2, p0, Lux0;->θ:I

    .line 8
    .line 9
    iget-object v3, p0, Lux0;->ι:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    .line 11
    iget-object v1, p0, Lux0;->κ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    iget-object v10, p0, Lux0;->λ:Ljava/util/concurrent/CountDownLatch;

    .line 14
    .line 15
    iget-boolean v5, p0, Lux0;->μ:Z

    .line 16
    .line 17
    iget-object v6, p0, Lux0;->ν:Landroid/app/NotificationManager;

    .line 18
    .line 19
    iget v7, p0, Lux0;->ξ:I

    .line 20
    .line 21
    const-string p0, "DYHelper: \u6279\u91cf\u4e0b\u8f7d\u5931\u8d25 \u7b2c"

    .line 22
    .line 23
    :try_start_0
    invoke-static/range {v1 .. v8}, Lqy0;->Δ(Ljava/util/concurrent/atomic/AtomicInteger;ILjava/util/concurrent/atomic/AtomicInteger;Landroid/app/Activity;ZLandroid/app/NotificationManager;ILf8;)V

    .line 24
    .line 25
    .line 26
    sget-object v0, Lqy0;->α:Lqy0;

    .line 27
    .line 28
    invoke-virtual {v0, v4, v8, v9, v2}, Lqy0;->Θ(Landroid/content/Context;Lf8;II)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 41
    .line 42
    .line 43
    invoke-static/range {v1 .. v8}, Lqy0;->Δ(Ljava/util/concurrent/atomic/AtomicInteger;ILjava/util/concurrent/atomic/AtomicInteger;Landroid/app/Activity;ZLandroid/app/NotificationManager;ILf8;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v10}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :goto_1
    add-int/lit8 v9, v9, 0x1

    .line 51
    .line 52
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v11, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v11, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p0, "\u4e2a: "

    .line 65
    .line 66
    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p0}, Lux;->ζ(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_1
    move-exception v0

    .line 81
    move-object p0, v0

    .line 82
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 83
    .line 84
    .line 85
    invoke-static/range {v1 .. v8}, Lqy0;->Δ(Ljava/util/concurrent/atomic/AtomicInteger;ILjava/util/concurrent/atomic/AtomicInteger;Landroid/app/Activity;ZLandroid/app/NotificationManager;ILf8;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v10}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 89
    .line 90
    .line 91
    throw p0
.end method
