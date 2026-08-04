.class public final synthetic Lyyds/ᲈᲇᛲᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:I

.field public final synthetic ᛶᛷᛲᲁ:Ljava/util/concurrent/CountDownLatch;

.field public final synthetic ᲀᛲᛳᲀ:Landroid/graphics/Bitmap;

.field public final synthetic ᲇᲇᲇᛱ:I

.field public final synthetic ᲇᲈᛵᛷ:I


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Bitmap;IIILjava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᲇᛲᛷ;->ᲀᛲᛳᲀ:Landroid/graphics/Bitmap;

    .line 5
    .line 6
    iput p2, p0, Lyyds/ᲈᲇᛲᛷ;->ᲇᲈᛵᛷ:I

    .line 7
    .line 8
    iput p3, p0, Lyyds/ᲈᲇᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 9
    .line 10
    iput p4, p0, Lyyds/ᲈᲇᛲᛷ;->ᲇᲇᲇᛱ:I

    .line 11
    .line 12
    iput-object p5, p0, Lyyds/ᲈᲇᛲᛷ;->ᛶᛷᛲᲁ:Ljava/util/concurrent/CountDownLatch;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᲈᲇᛲᛷ;->ᲀᛲᛳᲀ:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    iget v1, p0, Lyyds/ᲈᲇᛲᛷ;->ᲇᲈᛵᛷ:I

    .line 4
    .line 5
    iget v2, p0, Lyyds/ᲈᲇᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 6
    .line 7
    iget v3, p0, Lyyds/ᲈᲇᛲᛷ;->ᲇᲇᲇᛱ:I

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᲈᲇᛲᛷ;->ᛶᛷᛲᲁ:Ljava/util/concurrent/CountDownLatch;

    .line 10
    .line 11
    :try_start_0
    sget v4, Lcom/qmdeve/blurview/BlurNative;->ᲇᲈᛵᛷ:I

    .line 12
    .line 13
    invoke-static {v0, v1, v4, v2, v3}, Lcom/qmdeve/blurview/BlurNative;->blur(Ljava/lang/Object;IIII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    :try_start_1
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 40
    .line 41
    .line 42
    throw v0
.end method
