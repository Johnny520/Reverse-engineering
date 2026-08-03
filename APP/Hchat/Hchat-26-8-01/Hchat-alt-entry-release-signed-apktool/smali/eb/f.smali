.class public final Leb/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Leb/f;

.field public static final b:Log/k;

.field public static volatile c:Z

.field public static final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final e:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Leb/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Leb/f;->a:Leb/f;

    .line 7
    .line 8
    new-instance v0, Log/k;

    .line 9
    .line 10
    const-string v1, "[a-z0-9_\\-.]{3,}"

    .line 11
    .line 12
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Leb/f;->b:Log/k;

    .line 16
    .line 17
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Leb/f;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    .line 24
    new-instance v0, Lc9/q;

    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    invoke-direct {v0, v1}, Lc9/q;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Leb/f;->e:Ljava/util/concurrent/ExecutorService;

    .line 35
    .line 36
    return-void
.end method
