.class public final Lio/sentry/android/replay/n;
.super LBn;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic b:Landroid/graphics/Bitmap;

.field public final synthetic c:LIv;

.field public final synthetic d:Lio/sentry/android/replay/ReplayIntegration;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;LIv;Lio/sentry/android/replay/ReplayIntegration;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/android/replay/n;->b:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lio/sentry/android/replay/n;->c:LIv;

    iput-object p3, p0, Lio/sentry/android/replay/n;->d:Lio/sentry/android/replay/ReplayIntegration;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, LBn;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    check-cast p1, Lio/sentry/android/replay/j;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    iget-object p2, p0, Lio/sentry/android/replay/n;->c:LIv;

    iget-object p2, p2, LIv;->a:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1}, Lio/sentry/android/replay/j;->f()Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/android/replay/n;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lio/sentry/android/replay/j;->f()Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    :cond_1
    new-instance v3, Ljava/io/File;

    invoke-virtual {p1}, Lio/sentry/android/replay/j;->f()Ljava/io/File;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, ".jpg"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    :try_start_0
    sget-object v5, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    iget-object v6, p1, Lio/sentry/android/replay/j;->a:Lio/sentry/v2;

    invoke-virtual {v6}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v6

    iget-object v6, v6, Lio/sentry/z2;->e:Lio/sentry/y2;

    iget v6, v6, Lio/sentry/y2;->screenshotQuality:I

    invoke-virtual {v2, v5, v6, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    new-instance v2, Lio/sentry/android/replay/k;

    invoke-direct {v2, v3, v0, v1, p2}, Lio/sentry/android/replay/k;-><init>(Ljava/io/File;JLjava/lang/String;)V

    iget-object p1, p1, Lio/sentry/android/replay/j;->h:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v4, p1}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    :goto_0
    iget-object p1, p0, Lio/sentry/android/replay/n;->d:Lio/sentry/android/replay/ReplayIntegration;

    iget-object p2, p1, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    instance-of p2, p2, Lio/sentry/android/replay/capture/q;

    if-eqz p2, :cond_6

    iget-object p2, p1, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez p2, :cond_3

    const/4 p2, 0x0

    :cond_3
    invoke-virtual {p2}, Lio/sentry/v2;->getConnectionStatusProvider()Lio/sentry/O;

    move-result-object p2

    invoke-interface {p2}, Lio/sentry/O;->g()Lio/sentry/M;

    move-result-object p2

    sget-object v0, Lio/sentry/M;->DISCONNECTED:Lio/sentry/M;

    if-eq p2, v0, :cond_5

    iget-object p2, p1, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/w1;

    const/4 v0, 0x1

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lio/sentry/w1;->c()Lio/sentry/transport/p;

    move-result-object p2

    if-eqz p2, :cond_4

    sget-object v1, Lio/sentry/n;->All:Lio/sentry/n;

    invoke-virtual {p2, v1}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    move-result p2

    if-ne p2, v0, :cond_4

    goto :goto_1

    :cond_4
    iget-object p2, p1, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/w1;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lio/sentry/w1;->c()Lio/sentry/transport/p;

    move-result-object p2

    if-eqz p2, :cond_6

    sget-object v1, Lio/sentry/n;->Replay:Lio/sentry/n;

    invoke-virtual {p2, v1}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    move-result p2

    if-ne p2, v0, :cond_6

    :cond_5
    :goto_1
    invoke-virtual {p1}, Lio/sentry/android/replay/ReplayIntegration;->v()V

    :cond_6
    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method
