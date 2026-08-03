.class public Lcom/tendcloud/tenddata/bp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lcom/tendcloud/tenddata/bp;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object v0

    invoke-static {}, Lcom/tendcloud/tenddata/bp;->a()Lcom/tendcloud/tenddata/bp;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/z;->register(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/tendcloud/tenddata/bp;
    .locals 2

    sget-object v0, Lcom/tendcloud/tenddata/bp;->a:Lcom/tendcloud/tenddata/bp;

    if-nez v0, :cond_1

    const-class v0, Lcom/tendcloud/tenddata/bp;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/bp;->a:Lcom/tendcloud/tenddata/bp;

    if-nez v1, :cond_0

    new-instance v1, Lcom/tendcloud/tenddata/bp;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/bp;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/bp;->a:Lcom/tendcloud/tenddata/bp;

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
    sget-object v0, Lcom/tendcloud/tenddata/bp;->a:Lcom/tendcloud/tenddata/bp;

    return-object v0
.end method

.method private a(JLcom/tendcloud/tenddata/a;)V
    .locals 8

    const-string v0, "["

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "][Session] - New session!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "][Session] - Id: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    invoke-static {p3}, Lcom/tendcloud/tenddata/i;->f(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v2

    sub-long v4, p1, v2

    const-wide/16 v6, 0x0

    cmp-long v0, v6, v2

    if-nez v0, :cond_0

    move-wide v4, v6

    :cond_0
    invoke-static {v1, p3}, Lcom/tendcloud/tenddata/i;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    invoke-static {p1, p2, p3}, Lcom/tendcloud/tenddata/i;->a(JLcom/tendcloud/tenddata/a;)V

    invoke-static {v1, p3}, Lcom/tendcloud/tenddata/i;->b(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    invoke-static {}, Lcom/tendcloud/tenddata/ct;->a()Lcom/tendcloud/tenddata/ct;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/ct;->setSessionId(Ljava/lang/String;)V

    invoke-static {}, Lcom/tendcloud/tenddata/ct;->a()Lcom/tendcloud/tenddata/ct;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/tendcloud/tenddata/ct;->setSessionStartTime(J)V

    new-instance p1, Lcom/tendcloud/tenddata/bv;

    invoke-direct {p1}, Lcom/tendcloud/tenddata/bv;-><init>()V

    const-string p2, "session"

    iput-object p2, p1, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    const-string p2, "begin"

    iput-object p2, p1, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    new-instance p2, Ljava/util/TreeMap;

    invoke-direct {p2}, Ljava/util/TreeMap;-><init>()V

    const-string v0, "sessionId"

    invoke-virtual {p2, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "interval"

    const-wide/16 v1, 0x3e8

    div-long/2addr v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p1, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    iput-object p3, p1, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    new-instance p2, Lcom/tendcloud/tenddata/bp$2;

    invoke-direct {p2, p0, p3}, Lcom/tendcloud/tenddata/bp$2;-><init>(Lcom/tendcloud/tenddata/bp;Lcom/tendcloud/tenddata/a;)V

    iput-object p2, p1, Lcom/tendcloud/tenddata/bv;->f:Lcom/tendcloud/tenddata/cs;

    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V

    sget-object p1, Lcom/tendcloud/tenddata/ab;->Z:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private a(Lcom/tendcloud/tenddata/a;)V
    .locals 8

    :try_start_0
    invoke-static {p1}, Lcom/tendcloud/tenddata/i;->a(Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {p1}, Lcom/tendcloud/tenddata/i;->c(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v1

    invoke-static {p1}, Lcom/tendcloud/tenddata/i;->f(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v3

    sub-long/2addr v3, v1

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v5

    const-string v6, "APP"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v5

    const-string v6, "APP_SQL"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v5

    const-string v6, "TRACKING"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v5

    const-string v6, "SDK"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    :cond_0
    const-wide/16 v5, 0x1f4

    cmp-long v5, v3, v5

    if-gez v5, :cond_1

    const-wide/16 v3, -0x3e8

    :cond_1
    new-instance v5, Lcom/tendcloud/tenddata/bv;

    invoke-direct {v5}, Lcom/tendcloud/tenddata/bv;-><init>()V

    const-string v6, "session"

    iput-object v6, v5, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    const-string v6, "end"

    iput-object v6, v5, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    new-instance v6, Ljava/util/TreeMap;

    invoke-direct {v6}, Ljava/util/TreeMap;-><init>()V

    const-string v7, "sessionId"

    invoke-virtual {v6, v7, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "start"

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "duration"

    const-wide/16 v1, 0x3e8

    div-long/2addr v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v6, v5, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    iput-object p1, v5, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    new-instance v0, Lcom/tendcloud/tenddata/bp$1;

    invoke-direct {v0, p0, p1}, Lcom/tendcloud/tenddata/bp$1;-><init>(Lcom/tendcloud/tenddata/bp;Lcom/tendcloud/tenddata/a;)V

    iput-object v0, v5, Lcom/tendcloud/tenddata/bv;->f:Lcom/tendcloud/tenddata/cs;

    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/i;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    return-void
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/bp;Lcom/tendcloud/tenddata/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/bp;->b(Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method private final a(Ljava/util/HashMap;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    const-string v0, "service"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tendcloud/tenddata/a;

    const-string v1, "occurTime"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v0}, Lcom/tendcloud/tenddata/i;->c(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v3

    invoke-static {v0}, Lcom/tendcloud/tenddata/i;->f(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long p1, v5, v3

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    move-wide v5, v3

    :goto_0
    sub-long v5, v1, v5

    const-wide/16 v7, 0x7530

    cmp-long p1, v5, v7

    const-string v5, ""

    if-lez p1, :cond_1

    :try_start_1
    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/bp;->a(Lcom/tendcloud/tenddata/a;)V

    :goto_1
    invoke-direct {p0, v1, v2, v0}, Lcom/tendcloud/tenddata/bp;->a(JLcom/tendcloud/tenddata/a;)V

    invoke-static {v5}, Lcom/tendcloud/tenddata/i;->setLastActivity(Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    invoke-static {v0}, Lcom/tendcloud/tenddata/i;->a(Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "][Session] - Same session as before! Session id is "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    invoke-static {}, Lcom/tendcloud/tenddata/ct;->a()Lcom/tendcloud/tenddata/ct;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/ct;->setSessionId(Ljava/lang/String;)V

    invoke-static {}, Lcom/tendcloud/tenddata/ct;->a()Lcom/tendcloud/tenddata/ct;

    move-result-object p1

    invoke-virtual {p1, v3, v4}, Lcom/tendcloud/tenddata/ct;->setSessionStartTime(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :goto_2
    return-void
.end method

.method private b(Lcom/tendcloud/tenddata/a;)V
    .locals 1

    new-instance v0, Lcom/tendcloud/tenddata/bu;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bu;-><init>()V

    iput-object p1, v0, Lcom/tendcloud/tenddata/bu;->a:Lcom/tendcloud/tenddata/a;

    sget-object p1, Lcom/tendcloud/tenddata/bu$a;->IMMEDIATELY:Lcom/tendcloud/tenddata/bu$a;

    iput-object p1, v0, Lcom/tendcloud/tenddata/bu;->b:Lcom/tendcloud/tenddata/bu$a;

    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V

    return-void
.end method

.method private final b(Ljava/util/HashMap;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pageName"

    :try_start_0
    const-string v1, "service"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tendcloud/tenddata/a;

    const-string v2, "occurTime"

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    const-string v4, "sessionEnd"

    invoke-virtual {p1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-direct {p0, v1}, Lcom/tendcloud/tenddata/bp;->a(Lcom/tendcloud/tenddata/a;)V

    return-void

    :cond_0
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/i;->setLastActivity(Ljava/lang/String;)V

    :cond_1
    invoke-direct {p0, v1}, Lcom/tendcloud/tenddata/bp;->b(Lcom/tendcloud/tenddata/a;)V

    invoke-static {v2, v3, v1}, Lcom/tendcloud/tenddata/i;->c(JLcom/tendcloud/tenddata/a;)V

    const/4 p1, 0x0

    sput-object p1, Lcom/tendcloud/tenddata/ab;->I:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method


# virtual methods
.method public final onTDEBEventSession(Lcom/tendcloud/tenddata/zz$a;)V
    .locals 2

    if-eqz p1, :cond_2

    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    const-string v1, "apiType"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    iget-object p1, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/bp;->a(Ljava/util/HashMap;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0xb

    if-ne v0, v1, :cond_2

    iget-object p1, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/bp;->b(Ljava/util/HashMap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method
