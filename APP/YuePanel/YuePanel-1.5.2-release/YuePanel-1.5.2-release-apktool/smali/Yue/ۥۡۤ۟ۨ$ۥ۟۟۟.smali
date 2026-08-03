.class public LYue/ۥۡۤ۟ۨ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۤ۟ۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/util/concurrent/CountDownLatch;

.field public ۥ۟۟۠ۤ:Landroid/app/PendingIntent$OnFinished;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:Z


# direct methods
.method public constructor <init>(Landroid/app/PendingIntent$OnFinished;)V
    .locals 2
    .param p1    # Landroid/app/PendingIntent$OnFinished;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, LYue/ۥۡۤ۟ۨ$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/util/concurrent/CountDownLatch;

    iput-object p1, p0, LYue/ۥۡۤ۟ۨ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Landroid/app/PendingIntent$OnFinished;

    const/4 p1, 0x0

    iput-boolean p1, p0, LYue/ۥۡۤ۟ۨ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Z

    return-void
.end method

.method public static synthetic ۥ۟(LYue/ۥۡۤ۟ۨ$ۥ۟۟۟;Landroid/app/PendingIntent;Landroid/content/Intent;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, LYue/ۥۡۤ۟ۨ$ۥ۟۟۟;->ۥ۟۟۟(Landroid/app/PendingIntent;Landroid/content/Intent;ILjava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۤ۟ۨ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۡۤ۟ۨ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Landroid/app/PendingIntent$OnFinished;

    :cond_0
    iget-object v0, p0, LYue/ۥۡۤ۟ۨ$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public complete()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۡۤ۟ۨ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Z

    return-void
.end method

.method public ۥ۟۟()Landroid/app/PendingIntent$OnFinished;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۤ۟ۨ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Landroid/app/PendingIntent$OnFinished;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, LYue/ۥۡۤ۠;

    invoke-direct {v0, p0}, LYue/ۥۡۤ۠;-><init>(LYue/ۥۡۤ۟ۨ$ۥ۟۟۟;)V

    return-object v0
.end method

.method public final ۥ۟۟۟(Landroid/app/PendingIntent;Landroid/content/Intent;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    iget-object v1, p0, LYue/ۥۡۤ۟ۨ$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    iget-object v1, p0, LYue/ۥۡۤ۟ۨ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Landroid/app/PendingIntent$OnFinished;

    if-eqz v1, :cond_1

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Landroid/app/PendingIntent$OnFinished;->onSendFinished(Landroid/app/PendingIntent;Landroid/content/Intent;ILjava/lang/String;Landroid/os/Bundle;)V

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۡۤ۟ۨ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Landroid/app/PendingIntent$OnFinished;

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    throw p1

    :catch_0
    const/4 v0, 0x1

    goto :goto_0
.end method
