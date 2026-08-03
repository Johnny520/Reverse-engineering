.class public Lcom/shooker/ReplaceCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:[Lcom/shooker/a;

.field private static final b:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x1f4

    new-array v0, v0, [Lcom/shooker/a;

    sput-object v0, Lcom/shooker/ReplaceCallback;->a:[Lcom/shooker/a;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/shooker/ReplaceCallback;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public static a()Lcom/shooker/a;
    .locals 4

    sget-object v0, Lcom/shooker/ReplaceCallback;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    new-instance v2, Lcom/shooker/a;

    invoke-direct {v2}, Lcom/shooker/a;-><init>()V

    sget-object v3, Lcom/shooker/ReplaceCallback;->a:[Lcom/shooker/a;

    aput-object v2, v3, v1

    iput v1, v2, Lcom/shooker/a;->c:I

    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static doCall(ILjava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/shooker/ReplaceCallback;->a:[Lcom/shooker/a;

    aget-object p0, v0, p0

    iget-object p0, p0, Lcom/shooker/a;->d:Lo/a;

    iget-object v0, p0, Lo/a;->c:La/b;

    invoke-virtual {v0, p0, p1, p2}, La/b;->n(Lo/a;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
