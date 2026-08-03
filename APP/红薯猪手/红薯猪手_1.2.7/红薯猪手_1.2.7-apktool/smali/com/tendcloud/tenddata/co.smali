.class public Lcom/tendcloud/tenddata/co;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String; = "utf-8"

.field private static final b:Ljava/util/zip/CRC32;

.field private static final c:I = 0x5

.field private static final d:I = 0x7530

.field private static final g:Z = true

.field private static final h:I = 0x10000

.field private static volatile i:Lcom/tendcloud/tenddata/co;

.field private static j:Landroid/os/HandlerThread;


# instance fields
.field private e:J

.field private f:Z

.field private k:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    sput-object v0, Lcom/tendcloud/tenddata/co;->b:Ljava/util/zip/CRC32;

    const/4 v0, 0x0

    sput-object v0, Lcom/tendcloud/tenddata/co;->i:Lcom/tendcloud/tenddata/co;

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object v0

    invoke-static {}, Lcom/tendcloud/tenddata/co;->a()Lcom/tendcloud/tenddata/co;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/z;->register(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tendcloud/tenddata/co;->e:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tendcloud/tenddata/co;->f:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tendcloud/tenddata/co;->k:Landroid/os/Handler;

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "ModuleDataForward"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tendcloud/tenddata/co;->j:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v0, Lcom/tendcloud/tenddata/co$1;

    sget-object v1, Lcom/tendcloud/tenddata/co;->j:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/tendcloud/tenddata/co$1;-><init>(Lcom/tendcloud/tenddata/co;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tendcloud/tenddata/co;->k:Landroid/os/Handler;

    invoke-direct {p0}, Lcom/tendcloud/tenddata/co;->b()V

    return-void
.end method

.method public static a()Lcom/tendcloud/tenddata/co;
    .locals 2

    sget-object v0, Lcom/tendcloud/tenddata/co;->i:Lcom/tendcloud/tenddata/co;

    if-nez v0, :cond_1

    const-class v0, Lcom/tendcloud/tenddata/co;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/co;->i:Lcom/tendcloud/tenddata/co;

    if-nez v1, :cond_0

    new-instance v1, Lcom/tendcloud/tenddata/co;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/co;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/co;->i:Lcom/tendcloud/tenddata/co;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lcom/tendcloud/tenddata/co;->i:Lcom/tendcloud/tenddata/co;

    return-object v0
.end method

.method private static a(Ljava/util/TreeSet;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/TreeSet<",
            "Lcom/tendcloud/tenddata/cq;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "["

    .line 1
    invoke-static {v0}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tendcloud/tenddata/cq;

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/cq;->c()[B

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/cq;->c()[B

    move-result-object v2

    array-length v2, v2

    if-lez v2, :cond_0

    new-instance v2, Ljava/lang/String;

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/cq;->c()[B

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private a(Lcom/tendcloud/tenddata/a;)V
    .locals 12

    const-string v0, "SDK"

    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v1}, Lcom/tendcloud/tenddata/o;->b(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->needToSendData()Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->index()I

    move-result v2

    invoke-static {v2}, Lcom/tendcloud/tenddata/n$b;->getFeatureLockFileName(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/tendcloud/tenddata/n;->a(Ljava/lang/String;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v2, :cond_3

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->index()I

    move-result p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/n$b;->getFeatureLockFileName(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/n;->releaseFileLock(Ljava/lang/String;)V

    :cond_2
    return-void

    :cond_3
    :try_start_1
    invoke-static {}, Lcom/tendcloud/tenddata/cp;->a()Lcom/tendcloud/tenddata/cp;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/tendcloud/tenddata/cp;->a(Lcom/tendcloud/tenddata/a;)Ljava/util/TreeSet;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Ljava/util/TreeSet;->size()I

    move-result v4

    if-gtz v4, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v4, "New local data found!"

    invoke-direct {p0, v4, p1, v1}, Lcom/tendcloud/tenddata/co;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;Z)V

    invoke-static {v3}, Lcom/tendcloud/tenddata/co;->a(Ljava/util/TreeSet;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/tendcloud/tenddata/y;->f(Ljava/lang/String;)[B

    move-result-object v4

    invoke-static {v3, v4}, Lcom/tendcloud/tenddata/co;->a(Ljava/util/TreeSet;[B)[B

    move-result-object v3

    new-instance v4, Lcom/tendcloud/tenddata/ap;

    invoke-direct {v4}, Lcom/tendcloud/tenddata/ap;-><init>()V

    const/4 v5, 0x0

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v6

    const-string v7, "PUSH"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    invoke-static {v3}, Lcom/tendcloud/tenddata/u;->a([B)[B

    move-result-object v5

    const-string v6, "decrypt-version"

    const-string v7, "v1.0.0"

    invoke-virtual {v4, v6, v7}, Lcom/tendcloud/tenddata/ap;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/tendcloud/tenddata/ap;

    :cond_5
    if-eqz v5, :cond_6

    move-object v3, v5

    :cond_6
    sget-object v5, Lcom/tendcloud/tenddata/co;->b:Ljava/util/zip/CRC32;

    invoke-virtual {v5}, Ljava/util/zip/CRC32;->reset()V

    invoke-virtual {v5, v3}, Ljava/util/zip/CRC32;->update([B)V

    const/4 v6, 0x1

    if-eqz v3, :cond_7

    array-length v7, v3

    if-lez v7, :cond_7

    const-string v7, "Submit local data to collector server ..."

    invoke-direct {p0, v7, p1, v6}, Lcom/tendcloud/tenddata/co;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;Z)V

    :cond_7
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v9, "TD_app_pefercen_profile"

    if-eqz v8, :cond_8

    :try_start_2
    sget-object v8, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v10, "TD_sdk_last_send_url"

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->getUrl()Ljava/lang/String;

    move-result-object v11

    invoke-static {v8, v9, v10, v11}, Lcom/tendcloud/tenddata/s;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    :cond_8
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->getUrl()Ljava/lang/String;

    move-result-object v8

    :goto_0
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v8

    const-string v10, "TRACKING"

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v10, "/"

    if-eqz v8, :cond_9

    :try_start_3
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/1"

    :goto_1
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_9
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :goto_2
    sget-object v5, Lcom/tendcloud/tenddata/an$a;->EMPTY:Lcom/tendcloud/tenddata/an$a;

    new-instance v8, Lcom/tendcloud/tenddata/an;

    invoke-direct {v8, v5, v3}, Lcom/tendcloud/tenddata/an;-><init>(Lcom/tendcloud/tenddata/an$a;[B)V

    invoke-static {}, Lcom/tendcloud/tenddata/al;->a()Lcom/tendcloud/tenddata/am$a;

    move-result-object v3

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/tendcloud/tenddata/am$a;->url(Ljava/lang/String;)Lcom/tendcloud/tenddata/am$a;

    move-result-object v3

    invoke-virtual {v3, v8}, Lcom/tendcloud/tenddata/am$a;->body(Lcom/tendcloud/tenddata/an;)Lcom/tendcloud/tenddata/am$a;

    move-result-object v3

    sget-object v5, Lcom/tendcloud/tenddata/aq;->b:Lcom/tendcloud/tenddata/aq;

    invoke-virtual {v3, v5}, Lcom/tendcloud/tenddata/am$a;->method(Lcom/tendcloud/tenddata/aq;)Lcom/tendcloud/tenddata/am$a;

    move-result-object v3

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->getCert()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/tendcloud/tenddata/am$a;->cert(Ljava/lang/String;)Lcom/tendcloud/tenddata/am$a;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/tendcloud/tenddata/am$a;->header(Lcom/tendcloud/tenddata/ap;)Lcom/tendcloud/tenddata/am$a;

    move-result-object v3

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v4, "TD_sdk_last_send_host"

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->getHost()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v9, v4, v5}, Lcom/tendcloud/tenddata/s;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_a
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->getHost()Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-virtual {v3, v0}, Lcom/tendcloud/tenddata/am$a;->host(Ljava/lang/String;)Lcom/tendcloud/tenddata/am$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->getIP()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/tendcloud/tenddata/am$a;->ip(Ljava/lang/String;)Lcom/tendcloud/tenddata/am$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/am$a;->build()Lcom/tendcloud/tenddata/am;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/al;->a(Lcom/tendcloud/tenddata/am;Lcom/tendcloud/tenddata/a;)Lcom/tendcloud/tenddata/ar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result v3

    const/16 v4, 0xc8

    if-ne v3, v4, :cond_b

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/tendcloud/tenddata/co;->e:J

    iput-boolean v6, p0, Lcom/tendcloud/tenddata/co;->f:Z

    invoke-static {}, Lcom/tendcloud/tenddata/cp;->a()Lcom/tendcloud/tenddata/cp;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/cp;->sendMessageSuccess(Lcom/tendcloud/tenddata/a;)V

    const-string v0, "Data submitted successfully!"

    invoke-direct {p0, v0, p1, v6}, Lcom/tendcloud/tenddata/co;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;Z)V

    sget-object v0, Lcom/tendcloud/tenddata/ab;->X:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    goto :goto_4

    :cond_b
    sget-object v3, Lcom/tendcloud/tenddata/ab;->X:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    invoke-static {}, Lcom/tendcloud/tenddata/cp;->a()Lcom/tendcloud/tenddata/cp;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/tendcloud/tenddata/cp;->sendMessageFaild(Lcom/tendcloud/tenddata/a;)V

    iput-boolean v1, p0, Lcom/tendcloud/tenddata/co;->f:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to submit data! Response code "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, v6}, Lcom/tendcloud/tenddata/co;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;Z)V

    :goto_4
    if-eqz v2, :cond_e

    goto :goto_6

    :cond_c
    :goto_5
    const-string v0, "No new data found!"

    invoke-direct {p0, v0, p1, v1}, Lcom/tendcloud/tenddata/co;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v2, :cond_d

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->index()I

    move-result p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/n$b;->getFeatureLockFileName(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/n;->releaseFileLock(Ljava/lang/String;)V

    :cond_d
    return-void

    :catchall_0
    move v1, v2

    :catchall_1
    if-eqz v1, :cond_e

    :goto_6
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->index()I

    move-result p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/n$b;->getFeatureLockFileName(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/n;->releaseFileLock(Ljava/lang/String;)V

    :cond_e
    return-void
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/co;)V
    .locals 0

    invoke-direct {p0}, Lcom/tendcloud/tenddata/co;->b()V

    return-void
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/co;Lcom/tendcloud/tenddata/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/co;->a(Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method private a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;Z)V
    .locals 3

    const-string v0, "["

    .line 6
    invoke-static {v0}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 7
    invoke-virtual {p2}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/tendcloud/tenddata/a;->index()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    if-eq p2, v1, :cond_0

    const/4 v2, 0x3

    if-eq p2, v2, :cond_0

    const/16 v2, 0x63

    if-eq p2, v2, :cond_0

    const/4 v2, 0x7

    if-eq p2, v2, :cond_0

    const/16 v2, 0x8

    if-eq p2, v2, :cond_0

    new-array p2, v1, [Ljava/lang/String;

    aput-object p1, p2, v0

    invoke-static {p2}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-array p2, v1, [Ljava/lang/String;

    aput-object p1, p2, v0

    invoke-static {p2}, Lcom/tendcloud/tenddata/h;->dForInternal([Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private static a(Ljava/util/TreeSet;[B)[B
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/TreeSet<",
            "Lcom/tendcloud/tenddata/cq;",
            ">;[B)[B"
        }
    .end annotation

    :try_start_0
    array-length v0, p1

    const/high16 v1, 0x10000

    if-lt v0, v1, :cond_2

    invoke-virtual {p0}, Ljava/util/TreeSet;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-object p1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    div-int/lit8 v2, v0, 0x2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0}, Ljava/util/TreeSet;->pollLast()Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lcom/tendcloud/tenddata/co;->a(Ljava/util/TreeSet;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->f(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/co;->a(Ljava/util/TreeSet;[B)[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object p1, p0

    :catchall_0
    :cond_2
    return-object p1
.end method

.method public static a([B)[B
    .locals 6

    const/16 v0, 0x800

    new-array v0, v0, [B

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/io/BufferedInputStream;

    new-instance v3, Ljava/util/zip/InflaterInputStream;

    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-direct {v4, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance p0, Ljava/util/zip/Inflater;

    const/4 v5, 0x0

    invoke-direct {p0, v5}, Ljava/util/zip/Inflater;-><init>(Z)V

    invoke-direct {v3, v4, p0}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;Ljava/util/zip/Inflater;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance p0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :goto_0
    invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    invoke-virtual {p0, v0, v5, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->close()V

    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V

    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_0
    move-object v2, v1

    :catch_1
    if-eqz v2, :cond_1

    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_1
    return-object v1
.end method

.method private b()V
    .locals 7

    iget-object v0, p0, Lcom/tendcloud/tenddata/co;->k:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_4

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/y;->b()Ljava/security/SecureRandom;

    move-result-object v0

    invoke-static {}, Lcom/tendcloud/tenddata/ab;->a()[I

    move-result-object v2

    sget-object v3, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v3}, Lcom/tendcloud/tenddata/o;->i(Landroid/content/Context;)Z

    move-result v3

    const/16 v4, 0x7530

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    iget-boolean v3, p0, Lcom/tendcloud/tenddata/co;->f:Z

    if-nez v3, :cond_0

    aget v2, v2, v5

    mul-int/2addr v2, v5

    invoke-virtual {v0, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/2addr v2, v0

    goto :goto_1

    :cond_0
    aget v2, v2, v5

    goto :goto_1

    :cond_1
    iget-boolean v3, p0, Lcom/tendcloud/tenddata/co;->f:Z

    const/4 v6, 0x0

    if-nez v3, :cond_2

    aget v2, v2, v6

    mul-int/2addr v2, v5

    const v3, 0xea60

    invoke-virtual {v0, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    sub-int/2addr v0, v4

    add-int/2addr v0, v2

    goto :goto_0

    :cond_2
    aget v0, v2, v6

    :goto_0
    move v2, v0

    :goto_1
    const v0, 0x1b7740

    if-le v2, v0, :cond_3

    move v2, v0

    :cond_3
    invoke-static {}, Lcom/tendcloud/tenddata/a;->getFeaturesList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tendcloud/tenddata/a;

    iget-object v4, p0, Lcom/tendcloud/tenddata/co;->k:Landroid/os/Handler;

    invoke-static {v4, v1, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v3

    int-to-long v5, v2

    invoke-virtual {v4, v3, v5, v6}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    :cond_4
    return-void
.end method


# virtual methods
.method public final onTDEBEventForwardRequest(Lcom/tendcloud/tenddata/bu;)V
    .locals 6

    if-eqz p1, :cond_5

    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/bu;->b:Lcom/tendcloud/tenddata/bu$a;

    sget-object v1, Lcom/tendcloud/tenddata/bu$a;->IMMEDIATELY:Lcom/tendcloud/tenddata/bu$a;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x5

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/tendcloud/tenddata/co;->k:Landroid/os/Handler;

    iget-object v2, p1, Lcom/tendcloud/tenddata/bu;->a:Lcom/tendcloud/tenddata/a;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->hasMessages(ILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tendcloud/tenddata/co;->k:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/co;->k:Landroid/os/Handler;

    iget-object p1, p1, Lcom/tendcloud/tenddata/bu;->a:Lcom/tendcloud/tenddata/a;

    invoke-static {v0, v1, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_1

    :cond_2
    iget-object v0, p1, Lcom/tendcloud/tenddata/bu;->b:Lcom/tendcloud/tenddata/bu$a;

    sget-object v2, Lcom/tendcloud/tenddata/bu$a;->HIGH:Lcom/tendcloud/tenddata/bu$a;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/tendcloud/tenddata/co;->k:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/tendcloud/tenddata/co;->k:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/tendcloud/tenddata/co;->e:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x7530

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    cmp-long v0, v2, v4

    if-lez v0, :cond_4

    goto :goto_0

    :cond_4
    move-wide v4, v2

    :goto_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/co;->k:Landroid/os/Handler;

    iget-object p1, p1, Lcom/tendcloud/tenddata/bu;->a:Lcom/tendcloud/tenddata/a;

    invoke-static {v0, v1, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Lcom/tendcloud/tenddata/co;->k:Landroid/os/Handler;

    invoke-virtual {v0, p1, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_5
    :goto_1
    return-void
.end method
