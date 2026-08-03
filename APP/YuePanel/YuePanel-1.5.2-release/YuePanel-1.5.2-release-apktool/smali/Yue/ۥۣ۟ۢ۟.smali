.class public abstract LYue/ۥۣ۟ۢ۟;
.super LYue/ۥۣ۠ۧۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۟ۢ۟$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
        "TD;>;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠۟:Ljava/lang/String; = "AsyncTaskLoader"

.field public static final ۥ۟۟۠۠:Z


# instance fields
.field public final ۥ۟۟۟ۤ:Ljava/util/concurrent/Executor;

.field public volatile ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e2\u06df\u06e3<",
            "TD;>.\u06e5;"
        }
    .end annotation
.end field

.field public volatile ۥ۟۟۟ۦ:LYue/ۥۣ۟ۢ۟$ۥ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e2\u06df\u06e3<",
            "TD;>.\u06e5;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟ۧ:J

.field public ۥ۟۟۟ۨ:J

.field public ۥ۟۟۠:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    sget-object v0, LYue/ۥۡۡۢ۠;->ۥۣ۟۟ۡ:Ljava/util/concurrent/Executor;

    invoke-direct {p0, p1, v0}, LYue/ۥۣ۟ۢ۟;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0, p1}, LYue/ۥۣ۠ۧۥ;-><init>(Landroid/content/Context;)V

    const-wide/16 v0, -0x2710

    .line 3
    iput-wide v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۨ:J

    .line 4
    iput-object p2, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۤ:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1, p2, p3, p4}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    iget-object p2, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    const-string p4, " waiting="

    if-eqz p2, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mTask="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    iget-boolean p2, p2, LYue/ۥۣ۟ۢ۟$ۥ;->ۥ۟۟ۢ:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    :cond_0
    iget-object p2, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۦ:LYue/ۥۣ۟ۢ۟$ۥ;

    if-eqz p2, :cond_1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mCancellingTask="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۦ:LYue/ۥۣ۟ۢ۟$ۥ;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۦ:LYue/ۥۣ۟ۢ۟$ۥ;

    iget-boolean p2, p2, LYue/ۥۣ۟ۢ۟$ۥ;->ۥ۟۟ۢ:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    :cond_1
    iget-wide v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۧ:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-eqz p2, :cond_2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "mUpdateThrottle="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-wide p1, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۧ:J

    invoke-static {p1, p2, p3}, LYue/ۥۢۡۤ;->ۥ۟۟(JLjava/io/PrintWriter;)V

    const-string p1, " mLastLoadCompleteTime="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-wide p1, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۨ:J

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1, p3}, LYue/ۥۢۡۤ;->ۥ۟(JJLjava/io/PrintWriter;)V

    invoke-virtual {p3}, Ljava/io/PrintWriter;->println()V

    :cond_2
    return-void
.end method

.method public ۥ۟۟۠()Z
    .locals 4

    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    iget-boolean v0, p0, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۟۟:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۟ۢ:Z

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۦ:LYue/ۥۣ۟ۢ۟$ۥ;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    iget-boolean v0, v0, LYue/ۥۣ۟ۢ۟$ۥ;->ۥ۟۟ۢ:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    iput-boolean v1, v0, LYue/ۥۣ۟ۢ۟$ۥ;->ۥ۟۟ۢ:Z

    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۠:Landroid/os/Handler;

    iget-object v3, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    iput-object v2, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    return v1

    :cond_2
    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    iget-boolean v0, v0, LYue/ۥۣ۟ۢ۟$ۥ;->ۥ۟۟ۢ:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    iput-boolean v1, v0, LYue/ۥۣ۟ۢ۟$ۥ;->ۥ۟۟ۢ:Z

    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۠:Landroid/os/Handler;

    iget-object v3, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iput-object v2, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    return v1

    :cond_3
    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    invoke-virtual {v0, v1}, LYue/ۥۡۡۢ۠;->ۥ(Z)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v1, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    iput-object v1, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۦ:LYue/ۥۣ۟ۢ۟$ۥ;

    invoke-virtual {p0}, LYue/ۥۣ۟ۢ۟;->ۥ۟۟ۡۢ()V

    :cond_4
    iput-object v2, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    return v0

    :cond_5
    return v1
.end method

.method public ۥ۟۟۠۠()V
    .locals 1

    invoke-super {p0}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۠۠()V

    invoke-virtual {p0}, LYue/ۥۣ۠ۧۥ;->ۥ۟()Z

    new-instance v0, LYue/ۥۣ۟ۢ۟$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۣ۟ۢ۟$ۥ;-><init>(LYue/ۥۣ۟ۢ۟;)V

    iput-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    invoke-virtual {p0}, LYue/ۥۣ۟ۢ۟;->ۥ۟۟ۡۥ()V

    return-void
.end method

.method public ۥ۟۟ۡۢ()V
    .locals 0

    return-void
.end method

.method public ۥۣ۟۟ۡ(LYue/ۥۣ۟ۢ۟$ۥ;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e2\u06df\u06e3<",
            "TD;>.\u06e5;TD;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, LYue/ۥۣ۟ۢ۟;->ۥ۟۟ۡۨ(Ljava/lang/Object;)V

    iget-object p2, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۦ:LYue/ۥۣ۟ۢ۟$ۥ;

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۠ۧ()V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۨ:J

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۦ:LYue/ۥۣ۟ۢ۟$ۥ;

    invoke-virtual {p0}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۟۟()V

    invoke-virtual {p0}, LYue/ۥۣ۟ۢ۟;->ۥ۟۟ۡۥ()V

    :cond_0
    return-void
.end method

.method public ۥ۟۟ۡۤ(LYue/ۥۣ۟ۢ۟$ۥ;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e2\u06df\u06e3<",
            "TD;>.\u06e5;TD;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    if-eq v0, p1, :cond_0

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟ۢ۟;->ۥۣ۟۟ۡ(LYue/ۥۣ۟ۢ۟$ۥ;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۟ۥ()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, p2}, LYue/ۥۣ۟ۢ۟;->ۥ۟۟ۡۨ(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟()V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۨ:J

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    invoke-virtual {p0, p2}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۟۠(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public ۥ۟۟ۡۥ()V
    .locals 6

    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۦ:LYue/ۥۣ۟ۢ۟$ۥ;

    if-nez v0, :cond_2

    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    if-eqz v0, :cond_2

    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    iget-boolean v0, v0, LYue/ۥۣ۟ۢ۟$ۥ;->ۥ۟۟ۢ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    const/4 v1, 0x0

    iput-boolean v1, v0, LYue/ۥۣ۟ۢ۟$ۥ;->ۥ۟۟ۢ:Z

    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۠:Landroid/os/Handler;

    iget-object v1, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    iget-wide v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۧ:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۨ:J

    iget-wide v4, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۧ:J

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    const/4 v1, 0x1

    iput-boolean v1, v0, LYue/ۥۣ۟ۢ۟$ۥ;->ۥ۟۟ۢ:Z

    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۠:Landroid/os/Handler;

    iget-object v1, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    iget-wide v2, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۨ:J

    iget-wide v4, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۧ:J

    add-long/2addr v2, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    iget-object v1, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۤ:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LYue/ۥۡۡۢ۠;->ۥ۟۟۟۟(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)LYue/ۥۡۡۢ۠;

    :cond_2
    return-void
.end method

.method public ۥ۟۟ۡۦ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۦ:LYue/ۥۣ۟ۢ۟$ۥ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract ۥ۟۟ۡۧ()Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TD;"
        }
    .end annotation
.end method

.method public ۥ۟۟ۡۨ(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)V"
        }
    .end annotation

    return-void
.end method

.method public ۥ۟۟ۢ()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TD;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۟ۢ۟;->ۥ۟۟ۡۧ()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۢ۟(J)V
    .locals 2

    iput-wide p1, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۧ:J

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-eqz p1, :cond_0

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۠:Landroid/os/Handler;

    :cond_0
    return-void
.end method

.method public ۥ۟۟ۢ۠()V
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟ۥ:LYue/ۥۣ۟ۢ۟$ۥ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥۣ۟ۢ۟$ۥ;->ۥ۟۟۠ۥ()V

    :cond_0
    return-void
.end method
