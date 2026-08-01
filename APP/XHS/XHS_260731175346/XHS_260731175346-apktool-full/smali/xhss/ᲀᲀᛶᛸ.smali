.class public final Lxhss/ᲀᲀᛶᛸ;
.super Ljava/lang/Thread;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lxhss/ᲀᲀᛶᛸ;->ᛱᛱᛲᲇ:I

    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 8
    const/4 v0, 0x0

    iput v0, p0, Lxhss/ᲀᲀᛶᛸ;->ᛱᛱᛲᲇ:I

    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᲀᲀᛶᛸ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xa

    .line 7
    .line 8
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    :cond_0
    :goto_0
    :pswitch_0
    :try_start_0
    sget-object p0, Lxhss/ᲈᲀᲇᛶ;->ᛸᛷᲈᲈ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    :try_start_1
    invoke-static {}, Lxhss/ᛷᛸᲀᲀ;->ᲇᛴᲇᛵ()Lxhss/ᲈᲀᲇᛶ;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v1, Lxhss/ᲈᲀᲇᛶ;->ᛸᛲᲀᛵ:Lxhss/ᲈᲀᲇᛶ;

    .line 25
    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    sput-object v0, Lxhss/ᲈᲀᲇᛶ;->ᛸᛲᲀᛵ:Lxhss/ᲈᲀᲇᛶ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    :try_start_2
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 38
    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0}, Lxhss/ᲈᲀᲇᛶ;->ᛸᛷᲈᲈ()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 47
    .line 48
    .line 49
    throw v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
