.class public LYue/ۥ۟ۢ۟ۤ;
.super LYue/ۥۢۡۤۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۢ۟ۤ$ۥ;,
        LYue/ۥ۟ۢ۟ۤ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۟:LYue/ۥ۟ۢ۟ۤ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۤ:Ljava/util/concurrent/locks/ReentrantLock;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۥ:Ljava/util/concurrent/locks/Condition;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۦ:I = 0x10000

.field public static final ۥ۟۟۟ۧ:J

.field public static final ۥ۟۟۟ۨ:J

.field public static ۥ۟۟۠:LYue/ۥ۟ۢ۟ۤ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# instance fields
.field public ۥ۟۟۟۠:Z

.field public ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۤ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۟ۢ:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥ۟ۢ۟ۤ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۟ۢ۟ۤ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۟ۢ۟ۤ;->ۥۣ۟۟۟:LYue/ۥ۟ۢ۟ۤ$ۥ;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۟ۤ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    const-string v1, "newCondition(...)"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۟ۥ:Ljava/util/concurrent/locks/Condition;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3c

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۟ۧ:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۟ۨ:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۢۡۤۧ;-><init>()V

    return-void
.end method

.method public static final synthetic ۥ۟۟۟ۧ()Ljava/util/concurrent/locks/Condition;
    .locals 1

    sget-object v0, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۟ۥ:Ljava/util/concurrent/locks/Condition;

    return-object v0
.end method

.method public static final synthetic ۥ۟۟۟ۨ()LYue/ۥ۟ۢ۟ۤ;
    .locals 1

    sget-object v0, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۠:LYue/ۥ۟ۢ۟ۤ;

    return-object v0
.end method

.method public static final synthetic ۥ۟۟۠()J
    .locals 2

    sget-wide v0, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۟ۧ:J

    return-wide v0
.end method

.method public static final synthetic ۥ۟۟۠۟()J
    .locals 2

    sget-wide v0, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۟ۨ:J

    return-wide v0
.end method

.method public static final synthetic ۥ۟۟۠۠(LYue/ۥ۟ۢ۟ۤ;)Z
    .locals 0

    iget-boolean p0, p0, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۟۠:Z

    return p0
.end method

.method public static final synthetic ۥ۟۟۠ۡ()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    sget-object v0, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۟ۤ:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method

.method public static final synthetic ۥ۟۟۠ۢ(LYue/ۥ۟ۢ۟ۤ;)LYue/ۥ۟ۢ۟ۤ;
    .locals 0

    iget-object p0, p0, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۤ;

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۠ۤ(LYue/ۥ۟ۢ۟ۤ;J)J
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡۡ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic ۥ۟۟۠ۥ(LYue/ۥ۟ۢ۟ۤ;)V
    .locals 0

    sput-object p0, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۠:LYue/ۥ۟ۢ۟ۤ;

    return-void
.end method

.method public static final synthetic ۥ۟۟۠ۦ(LYue/ۥ۟ۢ۟ۤ;Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۟۠:Z

    return-void
.end method

.method public static final synthetic ۥ۟۟۠ۧ(LYue/ۥ۟ۢ۟ۤ;LYue/ۥ۟ۢ۟ۤ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۤ;

    return-void
.end method

.method public static final synthetic ۥ۟۟۠ۨ(LYue/ۥ۟ۢ۟ۤ;J)V
    .locals 0

    iput-wide p1, p0, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۟ۢ:J

    return-void
.end method


# virtual methods
.method public final ۥۣ۟۟۠(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 0
    .param p1    # Ljava/io/IOException;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡ۠(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟ۡ()V
    .locals 5

    invoke-virtual {p0}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۥ()J

    move-result-wide v0

    invoke-virtual {p0}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۡ()Z

    move-result v2

    const-wide/16 v3, 0x0

    cmp-long v3, v0, v3

    if-nez v3, :cond_0

    if-nez v2, :cond_0

    return-void

    :cond_0
    sget-object v3, LYue/ۥ۟ۢ۟ۤ;->ۥۣ۟۟۟:LYue/ۥ۟ۢ۟ۤ$ۥ;

    invoke-static {v3, p0, v0, v1, v2}, LYue/ۥ۟ۢ۟ۤ$ۥ;->ۥ۟(LYue/ۥ۟ۢ۟ۤ$ۥ;LYue/ۥ۟ۢ۟ۤ;JZ)V

    return-void
.end method

.method public final ۥ۟۟ۡ۟()Z
    .locals 1

    sget-object v0, LYue/ۥ۟ۢ۟ۤ;->ۥۣ۟۟۟:LYue/ۥ۟ۢ۟ۤ$ۥ;

    invoke-static {v0, p0}, LYue/ۥ۟ۢ۟ۤ$ۥ;->ۥ(LYue/ۥ۟ۢ۟ۤ$ۥ;LYue/ۥ۟ۢ۟ۤ;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟ۡ۠(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2
    .param p1    # Ljava/io/IOException;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method public final ۥ۟۟ۡۡ(J)J
    .locals 2

    iget-wide v0, p0, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۟ۢ:J

    sub-long/2addr v0, p1

    return-wide v0
.end method

.method public final ۥ۟۟ۡۢ(LYue/ۥۣۢ۟ۡ;)LYue/ۥۣۢ۟ۡ;
    .locals 1
    .param p1    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟ۢ۟ۤ$ۥ۟۟;

    invoke-direct {v0, p0, p1}, LYue/ۥ۟ۢ۟ۤ$ۥ۟۟;-><init>(LYue/ۥ۟ۢ۟ۤ;LYue/ۥۣۢ۟ۡ;)V

    return-object v0
.end method

.method public final ۥۣ۟۟ۡ(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۢ۟ۦ;
    .locals 1
    .param p1    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟ۢ۟ۤ$ۥ۟۟۟;

    invoke-direct {v0, p0, p1}, LYue/ۥ۟ۢ۟ۤ$ۥ۟۟۟;-><init>(LYue/ۥ۟ۢ۟ۤ;LYue/ۥۣۢ۟ۦ;)V

    return-object v0
.end method

.method public ۥ۟۟ۡۤ()V
    .locals 0

    return-void
.end method

.method public final ۥ۟۟ۡۥ(LYue/ۥۣ۠۠ۨ;)Ljava/lang/Object;
    .locals 2
    .param p1    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;)TT;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡ()V

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p1}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-virtual {p0}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡ۟()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢ۟ۤ;->ۥۣ۟۟۠(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    invoke-virtual {p0}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡ۟()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, LYue/ۥ۟ۢ۟ۤ;->ۥۣ۟۟۠(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    :goto_0
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-virtual {p0}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡ۟()Z

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p1
.end method
