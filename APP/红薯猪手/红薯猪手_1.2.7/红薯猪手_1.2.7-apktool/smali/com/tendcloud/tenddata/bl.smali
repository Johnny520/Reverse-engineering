.class public Lcom/tendcloud/tenddata/bl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/bl$a;,
        Lcom/tendcloud/tenddata/bl$b;
    }
.end annotation


# static fields
.field private static a:Ljava/util/concurrent/ScheduledThreadPoolExecutor; = null

.field private static final b:J = 0x7530L

.field private static c:J = 0x0L

.field private static d:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:J = 0x2L

.field private static volatile f:Lcom/tendcloud/tenddata/bl;

.field private static g:Z

.field private static h:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object v0

    invoke-static {}, Lcom/tendcloud/tenddata/bl;->a()Lcom/tendcloud/tenddata/bl;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/z;->register(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    const/4 v0, 0x0

    sput-object v0, Lcom/tendcloud/tenddata/bl;->f:Lcom/tendcloud/tenddata/bl;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/tendcloud/tenddata/bl;->g:Z

    sput-boolean v0, Lcom/tendcloud/tenddata/bl;->h:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/tendcloud/tenddata/bl;
    .locals 2

    sget-object v0, Lcom/tendcloud/tenddata/bl;->f:Lcom/tendcloud/tenddata/bl;

    if-nez v0, :cond_1

    const-class v0, Lcom/tendcloud/tenddata/bl;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/bl;->f:Lcom/tendcloud/tenddata/bl;

    if-nez v1, :cond_0

    new-instance v1, Lcom/tendcloud/tenddata/bl;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/bl;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/bl;->f:Lcom/tendcloud/tenddata/bl;

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
    sget-object v0, Lcom/tendcloud/tenddata/bl;->f:Lcom/tendcloud/tenddata/bl;

    return-object v0
.end method

.method private a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    sget-boolean v0, Lcom/tendcloud/tenddata/bl;->h:Z

    if-nez v0, :cond_0

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/ab;->c()Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/ab;->a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/ab;->b(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/ab;->c(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    sget-boolean p1, Lcom/tendcloud/tenddata/ab;->b:Z

    const/4 p1, 0x1

    sput-boolean p1, Lcom/tendcloud/tenddata/bl;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/a;)V
    .locals 0

    invoke-static {p0}, Lcom/tendcloud/tenddata/bl;->d(Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method private static a(Landroid/content/Context;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    :try_start_0
    const-string p0, "[ModuleInit] current context is null..."

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/h;->eForInternal([Ljava/lang/String;)V

    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v2, 0x1000

    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    array-length v1, p0

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    const-string v4, "android.permission.READ_PHONE_STATE"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    :cond_2
    return v0
.end method

.method public static synthetic b()V
    .locals 0

    invoke-static {}, Lcom/tendcloud/tenddata/bl;->e()V

    return-void
.end method

.method public static synthetic b(Lcom/tendcloud/tenddata/a;)V
    .locals 0

    invoke-static {p0}, Lcom/tendcloud/tenddata/bl;->g(Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static synthetic c()Ljava/util/Map;
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/bl;->d:Ljava/util/Map;

    return-object v0
.end method

.method public static synthetic c(Lcom/tendcloud/tenddata/a;)V
    .locals 0

    invoke-static {p0}, Lcom/tendcloud/tenddata/bl;->h(Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static synthetic d()J
    .locals 2

    sget-wide v0, Lcom/tendcloud/tenddata/bl;->c:J

    return-wide v0
.end method

.method private static d(Lcom/tendcloud/tenddata/a;)V
    .locals 4

    if-nez p0, :cond_0

    :try_start_0
    const-string p0, "TDFeatures is null..."

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/h;->eForInternal([Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/i;->d(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1, p0}, Lcom/tendcloud/tenddata/i;->b(JLcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method

.method private static e()V
    .locals 4

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/i;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/tendcloud/tenddata/i;->setInitTime(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method private static e(Lcom/tendcloud/tenddata/a;)V
    .locals 4

    :try_start_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/i;->d(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p0}, Lcom/tendcloud/tenddata/i;->d(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x5265c00

    cmp-long p0, v0, v2

    if-lez p0, :cond_1

    const/4 p0, 0x1

    sput-boolean p0, Lcom/tendcloud/tenddata/y;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method

.method private static f()V
    .locals 9

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/tendcloud/tenddata/bl;->c:J

    new-instance v2, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 v0, 0x1

    new-instance v1, Lcom/tendcloud/tenddata/bl$b;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Lcom/tendcloud/tenddata/bl$b;-><init>(Lcom/tendcloud/tenddata/bl$1;)V

    invoke-direct {v2, v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    sput-object v2, Lcom/tendcloud/tenddata/bl;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v0, Lcom/tendcloud/tenddata/bl$a;

    invoke-direct {v0, v3}, Lcom/tendcloud/tenddata/bl$a;-><init>(Lcom/tendcloud/tenddata/bl$1;)V

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x2

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v3, v0

    invoke-virtual/range {v2 .. v8}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private static f(Lcom/tendcloud/tenddata/a;)V
    .locals 4

    :try_start_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    new-instance v1, Lcom/tendcloud/tenddata/bl$1;

    invoke-direct {v1, p0}, Lcom/tendcloud/tenddata/bl$1;-><init>(Lcom/tendcloud/tenddata/a;)V

    sget-wide v2, Lcom/tendcloud/tenddata/ab;->q:J

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->eForInternal(Ljava/lang/Throwable;)V

    invoke-static {p0}, Lcom/tendcloud/tenddata/bl;->g(Lcom/tendcloud/tenddata/a;)V

    :goto_0
    return-void
.end method

.method private static g()V
    .locals 4

    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/bv;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bv;-><init>()V

    const-string v1, "env"

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    const-string v1, "getProp"

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    const-string v2, "sysproperty"

    invoke-static {}, Lcom/tendcloud/tenddata/y;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    sget-object v1, Lcom/tendcloud/tenddata/a;->ENV:Lcom/tendcloud/tenddata/a;

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private static g(Lcom/tendcloud/tenddata/a;)V
    .locals 9

    const-string v0, "isDeclareIMEI"

    const-string v1, "targetAPI"

    if-nez p0, :cond_0

    :try_start_0
    const-string p0, "TDFeatures is null..."

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/h;->eForInternal([Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    invoke-static {p0}, Lcom/tendcloud/tenddata/ab;->a(Lcom/tendcloud/tenddata/a;)Z

    move-result v3

    const-string v4, "first"

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/tendcloud/tenddata/zz;->a:Ljava/lang/String;

    invoke-static {v4}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "custom"

    sget-object v5, Lcom/tendcloud/tenddata/zz;->a:Ljava/lang/String;

    invoke-static {v5}, Lcom/tendcloud/tenddata/y;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :cond_1
    :try_start_1
    sget-object v4, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v4}, Lcom/tendcloud/tenddata/y;->c(Landroid/content/Context;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v2, v1, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v5

    const-string v6, "TRACKING"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {p0}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v5

    const-string v6, "SDK"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_2
    if-eqz v3, :cond_3

    sget-object v5, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v5}, Lcom/tendcloud/tenddata/bl;->a(Landroid/content/Context;)Z

    move-result v5

    sget-object v6, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v7, "android.permission.READ_PHONE_STATE"

    invoke-static {v6, v7}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {v2, v0, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "isGetIMEI"

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-virtual {v2, v7, v8}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v5, :cond_3

    if-nez v6, :cond_3

    const/16 v6, 0x17

    if-lt v4, v6, :cond_3

    new-instance v6, Ljava/util/TreeMap;

    invoke-direct {v6}, Ljava/util/TreeMap;-><init>()V

    sput-object v6, Lcom/tendcloud/tenddata/bl;->d:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/tendcloud/tenddata/bl;->d:Ljava/util/Map;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/tendcloud/tenddata/bl;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_3
    :try_start_2
    new-instance v0, Lcom/tendcloud/tenddata/bv;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bv;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    const-string v1, "app"

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    const-string v1, "init"

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    iput-object v2, v0, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    iput-object p0, v0, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    if-eqz v3, :cond_4

    new-instance v1, Lcom/tendcloud/tenddata/bl$2;

    invoke-direct {v1, p0}, Lcom/tendcloud/tenddata/bl$2;-><init>(Lcom/tendcloud/tenddata/a;)V

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->f:Lcom/tendcloud/tenddata/cs;

    :cond_4
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    :try_start_4
    new-instance v0, Lcom/tendcloud/tenddata/bu;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bu;-><init>()V

    iput-object p0, v0, Lcom/tendcloud/tenddata/bu;->a:Lcom/tendcloud/tenddata/a;

    sget-object p0, Lcom/tendcloud/tenddata/bu$a;->IMMEDIATELY:Lcom/tendcloud/tenddata/bu$a;

    iput-object p0, v0, Lcom/tendcloud/tenddata/bu;->b:Lcom/tendcloud/tenddata/bu$a;

    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V

    if-eqz v3, :cond_5

    invoke-static {}, Lcom/tendcloud/tenddata/bl;->g()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    :cond_5
    return-void
.end method

.method private static h(Lcom/tendcloud/tenddata/a;)V
    .locals 2

    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/bv;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bv;-><init>()V

    const-string v1, "app"

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    const-string v1, "getIMEI"

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    sget-object v1, Lcom/tendcloud/tenddata/bl;->d:Ljava/util/Map;

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    iput-object p0, v0, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V

    new-instance v0, Lcom/tendcloud/tenddata/bu;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bu;-><init>()V

    iput-object p0, v0, Lcom/tendcloud/tenddata/bu;->a:Lcom/tendcloud/tenddata/a;

    sget-object p0, Lcom/tendcloud/tenddata/bu$a;->IMMEDIATELY:Lcom/tendcloud/tenddata/bu$a;

    iput-object p0, v0, Lcom/tendcloud/tenddata/bu;->b:Lcom/tendcloud/tenddata/bu$a;

    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V

    sget-object p0, Lcom/tendcloud/tenddata/bl;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {p0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method


# virtual methods
.method public final onTDEBEventInitEvent(Lcom/tendcloud/tenddata/zz$a;)V
    .locals 6

    :try_start_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v1, "apiType"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v2, "action"

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v3, "service"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tendcloud/tenddata/a;

    const-string v3, "install"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "SDK"

    if-nez v3, :cond_1

    :try_start_1
    const-string v3, "deeplink"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    invoke-virtual {v2}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v3

    const-string v5, "TRACKING"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v2}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    const-string p1, "init"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {}, Lcom/tendcloud/tenddata/bp;->a()Lcom/tendcloud/tenddata/bp;

    invoke-static {}, Lcom/tendcloud/tenddata/be;->a()Lcom/tendcloud/tenddata/be;

    invoke-static {}, Lcom/tendcloud/tenddata/bj;->a()Lcom/tendcloud/tenddata/bj;

    invoke-static {}, Lcom/tendcloud/tenddata/bf;->a()Lcom/tendcloud/tenddata/bf;

    invoke-static {}, Lcom/tendcloud/tenddata/bn;->a()Lcom/tendcloud/tenddata/bn;

    invoke-static {}, Lcom/tendcloud/tenddata/bg;->a()Lcom/tendcloud/tenddata/bg;

    invoke-static {}, Lcom/tendcloud/tenddata/bk;->a()Lcom/tendcloud/tenddata/bk;

    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Lcom/tendcloud/tenddata/bd;->a()Lcom/tendcloud/tenddata/bd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/bd;->b()V

    :cond_3
    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->b:Z

    invoke-virtual {v2}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0, p1, v2}, Lcom/tendcloud/tenddata/bl;->a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    :cond_4
    invoke-static {v2}, Lcom/tendcloud/tenddata/bl;->e(Lcom/tendcloud/tenddata/a;)V

    invoke-static {v2}, Lcom/tendcloud/tenddata/bl;->f(Lcom/tendcloud/tenddata/a;)V

    goto :goto_1

    :cond_5
    :goto_0
    new-instance v1, Lcom/tendcloud/tenddata/bv;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/bv;-><init>()V

    iget-object v3, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v4, "data"

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iget-object p1, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    const-string v4, "domain"

    invoke-virtual {p1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    iput-object v0, v1, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    if-eqz v3, :cond_6

    instance-of p1, v3, Ljava/util/Map;

    if-eqz p1, :cond_6

    check-cast v3, Ljava/util/Map;

    iput-object v3, v1, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    :cond_6
    iput-object v2, v1, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_7
    :goto_1
    return-void
.end method
