.class public final Lio/sentry/android/replay/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Lio/sentry/util/a;

.field public final c:Lio/sentry/android/core/C;

.field public final d:Lio/sentry/android/replay/r;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lio/sentry/android/replay/s;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/replay/s;->b:Lio/sentry/util/a;

    new-instance v0, Lio/sentry/android/core/C;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Lio/sentry/android/core/C;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lio/sentry/android/replay/s;->c:Lio/sentry/android/core/C;

    new-instance v0, Lio/sentry/android/replay/r;

    invoke-direct {v0, p0}, Lio/sentry/android/replay/r;-><init>(Lio/sentry/android/replay/s;)V

    iput-object v0, p0, Lio/sentry/android/replay/s;->d:Lio/sentry/android/replay/r;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/replay/s;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lio/sentry/android/replay/s;->c:Lio/sentry/android/core/C;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    return-void
.end method
