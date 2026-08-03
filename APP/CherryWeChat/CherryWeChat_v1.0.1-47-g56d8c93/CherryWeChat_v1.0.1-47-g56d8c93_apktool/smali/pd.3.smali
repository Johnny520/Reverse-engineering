.class public final Lpd;
.super Lcr;
.source ""


# instance fields
.field public final f:Ljava/lang/Object;

.field public final g:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lpd;->f:Ljava/lang/Object;

    new-instance v0, Lod;

    invoke-direct {v0}, Lod;-><init>()V

    const/4 v1, 0x4

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lpd;->g:Ljava/util/concurrent/ExecutorService;

    return-void
.end method
