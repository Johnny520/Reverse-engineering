.class public final Lyyds/ᲀᛵᲁᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᲈᛲᲈ;
.implements Lyyds/ᛳᛷ;
.implements Lyyds/ᲈᛲᛵ;
.implements Lyyds/ᛵᲀᛴᲁ;
.implements Lyyds/ᛳᛲᛴᛳ;
.implements Lyyds/ᛲᛷᛵᲈ;
.implements Lyyds/ᛵᛱᲈᛳ;
.implements Lyyds/ᛵᛴᲁᛶ;
.implements Lyyds/ᛲᲈᲁᛲ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲀᛲᛳᲀ:I

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-array p1, p1, [I

    .line 61
    new-instance v0, Lyyds/ᛳᛱᛳᲇ;

    invoke-direct {v0, p1}, Lyyds/ᛳᛱᛳᲇ;-><init>(Ljava/lang/Object;)V

    .line 62
    iput-object v0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(IB)V
    .locals 2

    .line 1
    iput p1, p0, Lyyds/ᲀᛵᲁᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lyyds/ᲇᛸᛵᛶ;

    .line 10
    .line 11
    const-wide/16 v0, 0x1f4

    .line 12
    .line 13
    invoke-direct {p1, v0, v1}, Lyyds/ᲁᛱᲈᛳ;-><init>(J)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 17
    .line 18
    return-void

    .line 19
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p1, Ljava/util/WeakHashMap;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 28
    .line 29
    return-void

    .line 30
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 43
    .line 44
    return-void

    .line 45
    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_2
        0x15 -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 51
    iput p1, p0, Lyyds/ᲀᛵᲁᛴ;->ᲀᛲᛳᲀ:I

    iput-object p2, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲀᛲᛳᲀ:I

    .line 48
    new-instance v0, Lyyds/ᛷᛱᛷᲇ;

    const/4 v1, 0x4

    invoke-direct {v0, p1, v1}, Lyyds/ᛷᛱᛷᲇ;-><init>(Landroid/content/Context;I)V

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object v0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Lyyds/ᲁᛶᲇᛱ;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲀᛲᛳᲀ:I

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Lyyds/ᛴᛴᛸᲈ;

    invoke-direct {v0, p1, p2}, Lyyds/ᛴᛴᛸᲈ;-><init>(Ljava/io/InputStream;Lyyds/ᲁᛶᲇᛱ;)V

    iput-object v0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    const/high16 p0, 0x500000

    .line 47
    invoke-virtual {v0, p0}, Lyyds/ᛴᛴᛸᲈ;->mark(I)V

    return-void
.end method

.method public constructor <init>(Lyyds/ᛸᛴᛸᛸ;)V
    .locals 9

    const/16 v0, 0x14

    iput v0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲀᛲᛳᲀ:I

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 57
    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const/4 v2, 0x0

    const v3, 0x7fffffff

    const-wide/16 v4, 0x3c

    .line 58
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v8, p1

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v1, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lyyds/ᲈᛵᛳᲀ;)V
    .locals 0

    const/4 p1, 0x5

    iput p1, p0, Lyyds/ᲀᛵᲁᛴ;->ᲀᛲᛳᲀ:I

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 54
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    return-void
.end method

.method public static ᛶᛸᲀᲁ(Lyyds/ᲀᛵᲁᛴ;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᛴᛸᛲᛳ;

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    iput v0, p0, Lyyds/ᛴᛸᛲᛳ;->ᲇᲈᛵᛷ:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public ᛱᛳᲇ()V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lyyds/ᲇᛵᲈᲈ;

    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᲇᛵᲈᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛷᲀᛳᛱ;

    .line 11
    .line 12
    iget-object p0, p0, Lyyds/ᛷᲀᛳᛱ;->ᛱᛳᛶᛳ:Lyyds/ᛸᲈᛳᛱ;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lyyds/ᛸᲈᛳᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lyyds/ᛷᲀᛳᛱ;->ᛲᲀᛵᛷ()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object p0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    :goto_0
    return-void

    .line 31
    :pswitch_0
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Lyyds/ᲁᛷᲇᛸ;

    .line 34
    .line 35
    iget-object p0, p0, Lyyds/ᲁᛷᲇᛸ;->ᛵᛶᛲᲀ:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Lyyds/ᛵᲀᲀᛱ;

    .line 38
    .line 39
    invoke-virtual {p0}, Lyyds/ᛵᲀᲀᛱ;->ᛶᛴᛱᛲ()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {p0}, Lyyds/ᛵᲀᲀᛱ;->ᛲᲀᛲᛲ()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0}, Lyyds/ᛵᲀᲀᛱ;->ᛲᲀᛵᛷ()V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_1
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public ᛱᲈᲁ(Ljava/lang/Object;Ljava/io/File;Lyyds/ᛴᛳᲀᲈ;)Z
    .locals 4

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    const-string p3, "StreamEncoder"

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lyyds/ᲁᛶᲇᛱ;

    .line 8
    .line 9
    const/high16 v0, 0x10000

    .line 10
    .line 11
    const-class v1, [B

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Lyyds/ᲁᛶᲇᛱ;->ᲀᛲᛳᲀ(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, [B

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    :try_start_0
    new-instance v3, Ljava/io/FileOutputStream;

    .line 22
    .line 23
    invoke-direct {v3, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    .line 25
    .line 26
    :goto_0
    :try_start_1
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const/4 v2, -0x1

    .line 31
    if-eq p2, v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v3, v0, v1, p2}, Ljava/io/OutputStream;->write([BII)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    move-object v2, v3

    .line 39
    goto :goto_3

    .line 40
    :catch_0
    move-exception p1

    .line 41
    move-object v2, v3

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    .line 46
    :try_start_2
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 47
    .line 48
    .line 49
    :catch_1
    invoke-virtual {p0, v0}, Lyyds/ᲁᛶᲇᛱ;->ᛶᛷᛲᲁ(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    goto :goto_2

    .line 54
    :catchall_1
    move-exception p1

    .line 55
    goto :goto_3

    .line 56
    :catch_2
    move-exception p1

    .line 57
    :goto_1
    const/4 p2, 0x3

    .line 58
    :try_start_3
    invoke-static {p3, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_1

    .line 63
    .line 64
    const-string p2, "Failed to encode data onto the OutputStream"

    .line 65
    .line 66
    invoke-static {p3, p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 67
    .line 68
    .line 69
    :cond_1
    if-eqz v2, :cond_2

    .line 70
    .line 71
    :try_start_4
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 72
    .line 73
    .line 74
    :catch_3
    :cond_2
    invoke-virtual {p0, v0}, Lyyds/ᲁᛶᲇᛱ;->ᛶᛷᛲᲁ(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :goto_2
    return v1

    .line 78
    :goto_3
    if-eqz v2, :cond_3

    .line 79
    .line 80
    :try_start_5
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 81
    .line 82
    .line 83
    :catch_4
    :cond_3
    invoke-virtual {p0, v0}, Lyyds/ᲁᛶᲇᛱ;->ᛶᛷᛲᲁ(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    throw p1
.end method

.method public ᛲᛲᲈᲈ()F
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getVerticalScrollFactorCompat()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    neg-float p0, p0

    .line 10
    return p0
.end method

.method public ᛲᛳᛶᲁ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public ᛲᛴᛳᛲ()Lyyds/ᛸᲀᛷᛷ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᛸᲀᛷᛷ;

    .line 4
    .line 5
    return-object p0
.end method

.method public ᛲᲈᲁ(Ljava/lang/String;)Lyyds/ᛱᛵᛷ;
    .locals 4

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᲀᛴᲁᛷ;

    .line 4
    .line 5
    invoke-interface {p0}, Lyyds/ᲀᛴᲁᛷ;->getDatabaseName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const-string v2, "\' was requested."

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const-string v0, ":memory:"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p0, "This driver is configured to open an in-memory database but a file-based named \'"

    .line 24
    .line 25
    invoke-static {p0, p1, v2}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_3

    .line 38
    .line 39
    const/16 v3, 0x2f

    .line 40
    .line 41
    invoke-static {v0, v3}, Lyyds/ᛲᲇᛸᲇ;->ᛶᛴᛱᛲ(Ljava/lang/String;C)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {p1, v3}, Lyyds/ᛲᲇᛸᲇ;->ᛶᛴᛱᛲ(Ljava/lang/String;C)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-interface {p0}, Lyyds/ᲀᛴᲁᛷ;->getDatabaseName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const-string v0, "\' but \'"

    .line 61
    .line 62
    const-string v3, "This driver is configured to open a database named \'"

    .line 63
    .line 64
    invoke-static {v3, p0, v0, p1, v2}, Lyyds/ᛷᲈᲈᛶ;->ᛲᛳᛶᲁ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    :goto_0
    new-instance p1, Lyyds/ᛷᛳᲇᛲ;

    .line 69
    .line 70
    invoke-interface {p0}, Lyyds/ᲀᛴᲁᛷ;->ᛲᛳᛴᛸ()Lyyds/ᛳᛴᲀᛷ;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-direct {p1, p0}, Lyyds/ᛷᛳᲇᛲ;-><init>(Lyyds/ᛳᛴᲀᛷ;)V

    .line 75
    .line 76
    .line 77
    return-object p1
.end method

.method public ᛳᛸᛴᛶ(Ljava/util/Set;)V
    .locals 7

    .line 1
    sget-object v0, Lyyds/ᲈᲈᲈᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lyyds/ᛳᛱᛳᲇ;

    .line 13
    .line 14
    :goto_0
    sget-object v1, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 15
    .line 16
    sget-wide v2, Lyyds/ᛳᛱᛳᲇ;->ᛱᲈᲁ:J

    .line 17
    .line 18
    invoke-virtual {v1, p0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-ne v1, v0, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    :cond_1
    move-object v2, v1

    .line 26
    check-cast v2, [I

    .line 27
    .line 28
    array-length v3, v2

    .line 29
    new-array v4, v3, [I

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    :goto_1
    if-ge v5, v3, :cond_3

    .line 33
    .line 34
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-interface {p1, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_2

    .line 43
    .line 44
    aget v6, v2, v5

    .line 45
    .line 46
    add-int/lit8 v6, v6, 0x1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    aget v6, v2, v5

    .line 50
    .line 51
    :goto_2
    aput v6, v4, v5

    .line 52
    .line 53
    add-int/lit8 v5, v5, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    if-nez v1, :cond_4

    .line 57
    .line 58
    move-object v1, v0

    .line 59
    :cond_4
    monitor-enter p0

    .line 60
    :try_start_0
    sget-object v2, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 61
    .line 62
    sget-wide v5, Lyyds/ᛳᛱᛳᲇ;->ᛱᲈᲁ:J

    .line 63
    .line 64
    invoke-virtual {v2, p0, v5, v6}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v3, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 72
    if-nez v1, :cond_5

    .line 73
    .line 74
    monitor-exit p0

    .line 75
    goto :goto_0

    .line 76
    :cond_5
    :try_start_1
    invoke-static {v3, v4}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    if-eqz p1, :cond_6

    .line 81
    .line 82
    monitor-exit p0

    .line 83
    return-void

    .line 84
    :cond_6
    :try_start_2
    invoke-virtual {v2, p0, v5, v6, v4}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget p1, p0, Lyyds/ᛳᛱᛳᲇ;->ᛶᛷᛲᲁ:I

    .line 88
    .line 89
    and-int/lit8 v0, p1, 0x1

    .line 90
    .line 91
    if-nez v0, :cond_8

    .line 92
    .line 93
    add-int/lit8 p1, p1, 0x1

    .line 94
    .line 95
    iput p1, p0, Lyyds/ᛳᛱᛳᲇ;->ᛶᛷᛲᲁ:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 96
    .line 97
    monitor-exit p0

    .line 98
    :goto_3
    monitor-enter p0

    .line 99
    :try_start_3
    iget v0, p0, Lyyds/ᛳᛱᛳᲇ;->ᛶᛷᛲᲁ:I

    .line 100
    .line 101
    if-ne v0, p1, :cond_7

    .line 102
    .line 103
    add-int/lit8 p1, p1, 0x1

    .line 104
    .line 105
    iput p1, p0, Lyyds/ᛳᛱᛳᲇ;->ᛶᛷᛲᲁ:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 106
    .line 107
    monitor-exit p0

    .line 108
    return-void

    .line 109
    :catchall_0
    move-exception p1

    .line 110
    goto :goto_4

    .line 111
    :cond_7
    monitor-exit p0

    .line 112
    move p1, v0

    .line 113
    goto :goto_3

    .line 114
    :goto_4
    monitor-exit p0

    .line 115
    throw p1

    .line 116
    :catchall_1
    move-exception p1

    .line 117
    goto :goto_5

    .line 118
    :cond_8
    add-int/lit8 p1, p1, 0x2

    .line 119
    .line 120
    :try_start_4
    iput p1, p0, Lyyds/ᛳᛱᛳᲇ;->ᛶᛷᛲᲁ:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 121
    .line 122
    monitor-exit p0

    .line 123
    return-void

    .line 124
    :goto_5
    monitor-exit p0

    .line 125
    throw p1
.end method

.method public ᛵᛶᛲᲀ(Landroid/content/res/AssetManager;Lyyds/ᲈᛵᛶᛸ;)Z
    .locals 2

    .line 1
    const-wide v0, -0x1ffe6e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x1ffeae68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/util/WeakHashMap;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    iget-object v1, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ljava/util/WeakHashMap;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    invoke-virtual {p2}, Lyyds/ᲈᛵᛶᛸ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Ljava/util/WeakHashMap;

    .line 48
    .line 49
    invoke-virtual {p0, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    :goto_1
    monitor-exit v0

    .line 60
    return p0

    .line 61
    :goto_2
    monitor-exit v0

    .line 62
    throw p0
.end method

.method public ᛵᛸᛸᛷ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᛴᛴᛸᲈ;

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛴᛸᲈ;->ᲇᲇᲇᛱ()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public ᛶᛳᛶᛵ(Lyyds/ᲀᛶᲁᛵ;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᲈᲁᲁᛶ;

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᲈᲁᲁᛶ;->ᲇᲇᲇᛱ:Lyyds/ᲀᛶᲁᛵ;

    .line 6
    .line 7
    iput-object p1, v0, Lyyds/ᲀᛶᲁᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛶᲁᛵ;

    .line 8
    .line 9
    iput-object v0, p1, Lyyds/ᲀᛶᲁᛵ;->ᛲᲈᲁ:Lyyds/ᲀᛶᲁᛵ;

    .line 10
    .line 11
    iput-object p1, p0, Lyyds/ᲈᲁᲁᛶ;->ᲇᲇᲇᛱ:Lyyds/ᲀᛶᲁᛵ;

    .line 12
    .line 13
    return-void
.end method

.method public ᛶᛷᛲᲁ()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᛴᛴᛸᲈ;

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛴᛸᲈ;->reset()V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public ᛶᲈᛴᲈ()Lyyds/ᛵᲀᲀᛶ;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛵᲀᲀᛶ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᲁᛳᛶᛶ;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lyyds/ᛴᛸᛲᛳ;

    .line 9
    .line 10
    iput-object p0, v0, Lyyds/ᲇᛴᲇᛶ;->ᛲᲈᲁ:Lyyds/ᛴᛸᛲᛳ;

    .line 11
    .line 12
    return-object v0
.end method

.method public ᛷᛲᲈᛱ(ILjava/lang/Object;)V
    .locals 3

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, ""

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :pswitch_2
    const-string v0, "RESULT_INSTALL_SKIP_FILE_SUCCESS"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_3
    const-string v0, "RESULT_PARSE_EXCEPTION"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_4
    const-string v0, "RESULT_IO_EXCEPTION"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_5
    const-string v0, "RESULT_BASELINE_PROFILE_NOT_FOUND"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_6
    const-string v0, "RESULT_DESIRED_FORMAT_UNSUPPORTED"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_7
    const-string v0, "RESULT_NOT_WRITABLE"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_8
    const-string v0, "RESULT_UNSUPPORTED_ART_VERSION"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_9
    const-string v0, "RESULT_ALREADY_INSTALLED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_a
    const-string v0, "RESULT_INSTALL_SUCCESS"

    .line 35
    .line 36
    :goto_0
    const/4 v1, 0x6

    .line 37
    const-string v2, "ProfileInstaller"

    .line 38
    .line 39
    if-eq p1, v1, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x7

    .line 42
    if-eq p1, v1, :cond_0

    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    if-eq p1, v1, :cond_0

    .line 47
    .line 48
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    .line 53
    .line 54
    invoke-static {v2, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    .line 56
    .line 57
    :goto_1
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Landroidx/profileinstaller/ProfileInstallReceiver;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public ᛷᛵᲇᲀ(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᛸᛴᛷᲇ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛸᛴᛷᲇ;->ᛲᲈᲁ:Lyyds/ᛴᲈᛳᛶ;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of p0, p1, Ljava/util/List;

    .line 13
    .line 14
    return p0
.end method

.method public ᛷᲈᲈᲁ()V
    .locals 1

    .line 1
    const-string p0, "DIAGNOSTIC_PROFILE_IS_COMPRESSED"

    .line 2
    .line 3
    const-string v0, "ProfileInstaller"

    .line 4
    .line 5
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public ᲀᛲᛲᲇ()Lyyds/ᛴᛲᛶᛶ;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛴᛲᛶᛶ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᲇᛴᲇᛶ;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lyyds/ᛴᛸᛲᛳ;

    .line 9
    .line 10
    iput-object p0, v0, Lyyds/ᲇᛴᲇᛶ;->ᛲᲈᲁ:Lyyds/ᛴᛸᛲᛳ;

    .line 11
    .line 12
    return-object v0
.end method

.method public ᲀᛲᛳᲀ()Lyyds/ᲈᛸᲀᛸ;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Lyyds/ᛸᲀᛷᛷ;

    .line 6
    .line 7
    iget-object v2, v2, Lyyds/ᛸᲀᛷᛷ;->ᛷᛲᲈᛱ:Lyyds/ᲈᲀᛱᛷ;

    .line 8
    .line 9
    iget-boolean v2, v2, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛲᲇ:Z

    .line 10
    .line 11
    if-nez v2, :cond_6

    .line 12
    .line 13
    :try_start_0
    iget-object v2, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lyyds/ᛸᲀᛷᛷ;

    .line 16
    .line 17
    invoke-virtual {v2}, Lyyds/ᛸᲀᛷᛷ;->ᛵᛸᛸᛷ()Lyyds/ᲀᲈᲇ;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, Lyyds/ᲀᲈᲇ;->ᛲᛴᛳᛲ()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_3

    .line 26
    .line 27
    invoke-interface {v2}, Lyyds/ᲀᲈᲇ;->ᛶᛷᛲᲁ()Lyyds/ᲈᛷᛲᛱ;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v4, v3, Lyyds/ᲈᛷᛲᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲀᲈᲇ;

    .line 32
    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    iget-object v4, v3, Lyyds/ᲈᛷᛲᛱ;->ᲀᛲᛳᲀ:Ljava/lang/Throwable;

    .line 36
    .line 37
    if-nez v4, :cond_0

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    const/4 v4, 0x0

    .line 42
    :goto_1
    if-eqz v4, :cond_1

    .line 43
    .line 44
    invoke-interface {v2}, Lyyds/ᲀᲈᲇ;->ᛵᛸᛸᛷ()Lyyds/ᲈᛷᛲᛱ;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    goto :goto_2

    .line 49
    :catch_0
    move-exception v2

    .line 50
    goto :goto_3

    .line 51
    :cond_1
    :goto_2
    iget-object v4, v3, Lyyds/ᲈᛷᛲᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲀᲈᲇ;

    .line 52
    .line 53
    iget-object v3, v3, Lyyds/ᲈᛷᛲᛱ;->ᲀᛲᛳᲀ:Ljava/lang/Throwable;

    .line 54
    .line 55
    if-nez v3, :cond_2

    .line 56
    .line 57
    if-eqz v4, :cond_3

    .line 58
    .line 59
    iget-object v2, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Lyyds/ᛸᲀᛷᛷ;

    .line 62
    .line 63
    iget-object v2, v2, Lyyds/ᛸᲀᛷᛷ;->ᲇᛱᛲ:Lyyds/ᛱᲁᛳᛵ;

    .line 64
    .line 65
    invoke-virtual {v2, v4}, Lyyds/ᛱᲁᛳᛵ;->addFirst(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    throw v3

    .line 70
    :cond_3
    invoke-interface {v2}, Lyyds/ᲀᲈᲇ;->ᲀᛲᛳᲀ()Lyyds/ᲈᛸᲀᛸ;

    .line 71
    .line 72
    .line 73
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    return-object p0

    .line 75
    :goto_3
    if-nez v1, :cond_4

    .line 76
    .line 77
    move-object v1, v2

    .line 78
    goto :goto_4

    .line 79
    :cond_4
    invoke-static {v1, v2}, Lyyds/ᛷᛶᛷᛵ;->ᛲᲈᲁ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :goto_4
    iget-object v2, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Lyyds/ᛸᲀᛷᛷ;

    .line 85
    .line 86
    invoke-virtual {v2, v0}, Lyyds/ᛸᲀᛷᛷ;->ᛲᲈᲁ(Lyyds/ᲈᛸᲀᛸ;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_5

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    throw v1

    .line 94
    :cond_6
    const-string p0, "Canceled"

    .line 95
    .line 96
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-object v0
.end method

.method public ᲇᛱᛲ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->ᲇᲇᲇᛱ:Landroid/widget/OverScroller;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public ᲇᲇᲇᛱ(F)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lyyds/ᲀᛵᲁᛴ;->ᲇᛱᛲ()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Landroidx/core/widget/NestedScrollView;

    .line 14
    .line 15
    float-to-int p1, p1

    .line 16
    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->ᛷᲈᲈᲁ(I)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0
.end method

.method public ᲇᲈᛵᛷ(Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    const-wide v0, -0x159b4e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x159c0e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lcom/ss/android/ugc/awemes/MainActivity;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᛱᛲ()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    iget-object p1, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᛸᛸᛷᛱ:Lyyds/ᛱᛷᛲᲀ;

    .line 45
    .line 46
    new-instance v0, Lyyds/ᲇᛶᲁᲀ;

    .line 47
    .line 48
    const-wide v1, -0xf34fe68a836eL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-wide v2, -0xf355e68a836eL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const-wide v3, -0xf375e68a836eL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    new-instance v4, Lyyds/ᛳᲀᲀᛶ;

    .line 76
    .line 77
    const/4 v5, 0x0

    .line 78
    invoke-direct {v4, p0, v5}, Lyyds/ᛳᲀᲀᛶ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, v1, v2, v3, v4}, Lyyds/ᲇᛶᲁᲀ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyyds/ᲁᛶᲁᲀ;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v0}, Lyyds/ᛱᛷᛲᲀ;->ᛱᲈᲁ(Lyyds/ᲇᛶᲁᲀ;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    :goto_0
    return-void
.end method
