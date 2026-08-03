.class public final L۟/h1;
.super L۟/ob;
.source "SourceFile"


# instance fields
.field public final ۥ:Ljava/lang/Object;

.field public final ۥ۟:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, L۟/ob;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, L۟/h1;->ۥ:Ljava/lang/Object;

    new-instance v0, L۟/h1$a;

    invoke-direct {v0}, L۟/h1$a;-><init>()V

    const/4 v1, 0x4

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, L۟/h1;->ۥ۟:Ljava/util/concurrent/ExecutorService;

    return-void
.end method
