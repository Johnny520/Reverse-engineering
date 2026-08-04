.class public Lcom/qmdeve/blurview/BlurNative;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᛴᛳᛲ:Ljava/util/concurrent/ExecutorService;

.field public static final ᲇᲈᛵᛷ:I


# instance fields
.field public final ᛲᲈᲁ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ᛵᛸᛸᛷ:F

.field public ᲀᛲᛳᲀ:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x5

    .line 10
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    sput v0, Lcom/qmdeve/blurview/BlurNative;->ᲇᲈᛵᛷ:I

    .line 20
    .line 21
    new-instance v1, Lyyds/ᛷᛶᛲᛵ;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lcom/qmdeve/blurview/BlurNative;->ᛲᛴᛳᛲ:Ljava/util/concurrent/ExecutorService;

    .line 31
    .line 32
    const-string v0, "QmBlur"

    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/qmdeve/blurview/BlurNative;->ᛲᲈᲁ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    const/high16 v0, 0x42c80000    # 100.0f

    .line 13
    .line 14
    iput v0, p0, Lcom/qmdeve/blurview/BlurNative;->ᛵᛸᛸᛷ:F

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    iput v0, p0, Lcom/qmdeve/blurview/BlurNative;->ᲀᛲᛳᲀ:I

    .line 18
    .line 19
    return-void
.end method

.method public static native blur(Ljava/lang/Object;IIII)V
.end method


# virtual methods
.method public final ᛲᲈᲁ(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 6

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    if-eqz p2, :cond_5

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_5

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_4

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/qmdeve/blurview/BlurNative;->ᛲᲈᲁ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    goto :goto_4

    .line 29
    :cond_1
    const/4 v3, 0x0

    .line 30
    if-eq p1, p2, :cond_2

    .line 31
    .line 32
    :try_start_0
    invoke-virtual {p2, v1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 33
    .line 34
    .line 35
    new-instance v4, Landroid/graphics/Canvas;

    .line 36
    .line 37
    invoke-direct {v4, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 38
    .line 39
    .line 40
    const/4 v5, 0x0

    .line 41
    invoke-virtual {v4, p1, v5, v5, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_3

    .line 47
    :catch_0
    move-exception p0

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    :goto_0
    move p1, v1

    .line 50
    :goto_1
    iget v4, p0, Lcom/qmdeve/blurview/BlurNative;->ᲀᛲᛳᲀ:I

    .line 51
    .line 52
    if-ge p1, v4, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0, p2, v2}, Lcom/qmdeve/blurview/BlurNative;->ᛵᛸᛸᛷ(Landroid/graphics/Bitmap;I)V

    .line 55
    .line 56
    .line 57
    const/4 v4, 0x2

    .line 58
    invoke-virtual {p0, p2, v4}, Lcom/qmdeve/blurview/BlurNative;->ᛵᛸᛸᛷ(Landroid/graphics/Bitmap;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    add-int/lit8 p1, p1, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :goto_2
    :try_start_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {p1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    .line 79
    :cond_4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :goto_3
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 84
    .line 85
    .line 86
    throw p0

    .line 87
    :cond_5
    :goto_4
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Landroid/graphics/Bitmap;I)V
    .locals 7

    .line 1
    iget p0, p0, Lcom/qmdeve/blurview/BlurNative;->ᛵᛸᛸᛷ:F

    .line 2
    .line 3
    float-to-int v2, p0

    .line 4
    const/4 p0, 0x0

    .line 5
    sget v6, Lcom/qmdeve/blurview/BlurNative;->ᲇᲈᛵᛷ:I

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-ne v6, v0, :cond_0

    .line 9
    .line 10
    invoke-static {p1, v2, v0, p0, p2}, Lcom/qmdeve/blurview/BlurNative;->blur(Ljava/lang/Object;IIII)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v5, Ljava/util/concurrent/CountDownLatch;

    .line 15
    .line 16
    invoke-direct {v5, v6}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 17
    .line 18
    .line 19
    move v3, p0

    .line 20
    :goto_0
    if-ge v3, v6, :cond_1

    .line 21
    .line 22
    new-instance v0, Lyyds/ᲈᲇᛲᛷ;

    .line 23
    .line 24
    move-object v1, p1

    .line 25
    move v4, p2

    .line 26
    invoke-direct/range {v0 .. v5}, Lyyds/ᲈᲇᛲᛷ;-><init>(Landroid/graphics/Bitmap;IIILjava/util/concurrent/CountDownLatch;)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lcom/qmdeve/blurview/BlurNative;->ᛲᛴᛳᛲ:Ljava/util/concurrent/ExecutorService;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    :try_start_0
    invoke-virtual {v5}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 46
    .line 47
    .line 48
    return-void
.end method
