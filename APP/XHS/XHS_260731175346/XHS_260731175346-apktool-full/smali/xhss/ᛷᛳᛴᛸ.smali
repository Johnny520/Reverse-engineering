.class public final synthetic Lxhss/ᛷᛳᛴᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 10
    iput p2, p0, Lxhss/ᛷᛳᛴᛸ;->ᛱᛱᛲᲇ:I

    iput-object p1, p0, Lxhss/ᛷᛳᛴᛸ;->ᛳᲁᲇᛸ:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/profileinstaller/ProfileInstallerInitializer;Landroid/content/Context;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lxhss/ᛷᛳᛴᛸ;->ᛱᛱᛲᲇ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lxhss/ᛷᛳᛴᛸ;->ᛳᲁᲇᛸ:Landroid/content/Context;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lxhss/ᛷᛳᛴᛸ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛷᛳᛴᛸ;->ᛳᲁᲇᛸ:Landroid/content/Context;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lxhss/ᛲᲀᛸᛶ;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sget-object v1, Lxhss/ᛱᛱᛷᛸ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛵᲇᛸ;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {p0, v0, v1, v2}, Lxhss/ᛱᛱᛷᛸ;->ᛸᛶᲈᛶ(Landroid/content/Context;Ljava/util/concurrent/Executor;Lxhss/ᛸᲈᛷ;Z)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    new-instance v3, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 21
    .line 22
    new-instance v9, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 23
    .line 24
    invoke-direct {v9}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 25
    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x1

    .line 29
    const-wide/16 v6, 0x0

    .line 30
    .line 31
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 32
    .line 33
    invoke-direct/range {v3 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lxhss/ᛷᛳᛴᛸ;

    .line 37
    .line 38
    const/4 v1, 0x2

    .line 39
    invoke-direct {v0, p0, v1}, Lxhss/ᛷᛳᛴᛸ;-><init>(Landroid/content/Context;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Lxhss/ᛲᛲᛸᲁ;->ᛷᛵᛵᲈ(Landroid/os/Looper;)Landroid/os/Handler;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, Ljava/util/Random;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    .line 57
    .line 58
    .line 59
    const/16 v2, 0x3e8

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    new-instance v2, Lxhss/ᛷᛳᛴᛸ;

    .line 71
    .line 72
    invoke-direct {v2, p0, v3}, Lxhss/ᛷᛳᛴᛸ;-><init>(Landroid/content/Context;I)V

    .line 73
    .line 74
    .line 75
    add-int/lit16 v1, v1, 0x1388

    .line 76
    .line 77
    int-to-long v3, v1

    .line 78
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
