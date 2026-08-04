.class public final Lyyds/ᛷᛱᛷᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲈᲁᛸᲀ;
.implements Lyyds/ᛱᲇᛷᲈ;
.implements Lyyds/ᛷᛵᲁᲁ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final ᲇᲈᛵᛷ:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lyyds/ᛷᛱᛷᲇ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lyyds/ᛷᛱᛷᲇ;->ᲇᲈᛵᛷ:Landroid/content/Context;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 14
    iput p2, p0, Lyyds/ᛷᛱᛷᲇ;->ᲀᛲᛳᲀ:I

    iput-object p1, p0, Lyyds/ᛷᛱᛷᲇ;->ᲇᲈᛵᛷ:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛱᛷᲇ;->ᲇᲈᛵᛷ:Landroid/content/Context;

    .line 2
    .line 3
    const-string v0, "connectivity"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/net/ConnectivityManager;

    .line 10
    .line 11
    return-object p0
.end method

.method public ᛲᛲᲈᲈ(Lyyds/ᛳᛷᲀᛴ;)Lyyds/ᛴᛷᛷ;
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛷᛱᛷᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const-class v1, Ljava/lang/Integer;

    .line 4
    .line 5
    iget-object v2, p0, Lyyds/ᛷᛱᛷᲇ;->ᲇᲈᛵᛷ:Landroid/content/Context;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    new-instance p0, Lyyds/ᲇᛷᛵᛸ;

    .line 11
    .line 12
    const-class v0, Ljava/io/InputStream;

    .line 13
    .line 14
    invoke-virtual {p1, v1, v0}, Lyyds/ᛳᛷᲀᛴ;->ᛷᛲᲈᛱ(Ljava/lang/Class;Ljava/lang/Class;)Lyyds/ᛴᛷᛷ;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {p0, v2, p1}, Lyyds/ᲇᛷᛵᛸ;-><init>(Landroid/content/Context;Lyyds/ᛴᛷᛷ;)V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_1
    new-instance p0, Lyyds/ᲇᛷᛵᛸ;

    .line 23
    .line 24
    const-class v0, Landroid/content/res/AssetFileDescriptor;

    .line 25
    .line 26
    invoke-virtual {p1, v1, v0}, Lyyds/ᛳᛷᲀᛴ;->ᛷᛲᲈᛱ(Ljava/lang/Class;Ljava/lang/Class;)Lyyds/ᛴᛷᛷ;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {p0, v2, p1}, Lyyds/ᲇᛷᛵᛸ;-><init>(Landroid/content/Context;Lyyds/ᛴᛷᛷ;)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_2
    new-instance p0, Lyyds/ᛷᛸᲈᛸ;

    .line 35
    .line 36
    const/4 p1, 0x2

    .line 37
    invoke-direct {p0, v2, p1}, Lyyds/ᛷᛸᲈᛸ;-><init>(Landroid/content/Context;I)V

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_3
    new-instance p0, Lyyds/ᛷᛸᲈᛸ;

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    invoke-direct {p0, v2, p1}, Lyyds/ᛷᛸᲈᛸ;-><init>(Landroid/content/Context;I)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_4
    new-instance p0, Lyyds/ᛷᛸᲈᛸ;

    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    invoke-direct {p0, v2, p1}, Lyyds/ᛷᛸᲈᛸ;-><init>(Landroid/content/Context;I)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_5
    new-instance p1, Lyyds/ᲇᛷᛵᛸ;

    .line 56
    .line 57
    invoke-direct {p1, v2, p0}, Lyyds/ᲇᛷᛵᛸ;-><init>(Landroid/content/Context;Lyyds/ᛷᛱᛷᲇ;)V

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_6
    new-instance p1, Lyyds/ᲇᛷᛵᛸ;

    .line 62
    .line 63
    invoke-direct {p1, v2, p0}, Lyyds/ᲇᛷᛵᛸ;-><init>(Landroid/content/Context;Lyyds/ᛷᛱᛷᲇ;)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :pswitch_7
    new-instance p1, Lyyds/ᲇᛷᛵᛸ;

    .line 68
    .line 69
    invoke-direct {p1, v2, p0}, Lyyds/ᲇᛷᛵᛸ;-><init>(Landroid/content/Context;Lyyds/ᛷᛱᛷᲇ;)V

    .line 70
    .line 71
    .line 72
    return-object p1

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public ᛲᲈᲁ(Lyyds/ᛲᲇᲁᛳ;)V
    .locals 8

    .line 1
    new-instance v7, Lyyds/ᛴᛲᛱᲇ;

    .line 2
    .line 3
    const-string v0, "EmojiCompatInitializer"

    .line 4
    .line 5
    invoke-direct {v7, v0}, Lyyds/ᛴᛲᛱᲇ;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 9
    .line 10
    new-instance v6, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 11
    .line 12
    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    const-wide/16 v3, 0xf

    .line 18
    .line 19
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 20
    .line 21
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 26
    .line 27
    .line 28
    new-instance v2, Lyyds/ᛶᛵ;

    .line 29
    .line 30
    invoke-direct {v2, p0, p1, v0, v1}, Lyyds/ᛶᛵ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
