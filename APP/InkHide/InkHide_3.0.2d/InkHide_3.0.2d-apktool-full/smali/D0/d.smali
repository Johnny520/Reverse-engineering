.class public abstract LD0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/ThreadPoolExecutor;

.field public static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 6
    .line 7
    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 8
    .line 9
    .line 10
    const/16 v2, 0x10

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LD0/d;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 20
    .line 21
    new-instance v0, LE0/c;

    .line 22
    .line 23
    const-string v1, "Cache-Control"

    .line 24
    .line 25
    const-string v2, "no-cache"

    .line 26
    .line 27
    invoke-direct {v0, v1, v2}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, LF0/v;->Z(LE0/c;)Ljava/util/Map;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, LD0/d;->b:Ljava/util/Map;

    .line 35
    .line 36
    return-void
.end method
