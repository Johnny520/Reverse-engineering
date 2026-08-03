.class public final Landroidx/recyclerview/widget/ۥ۟۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/ۥ۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟:Ljava/lang/Object;

.field public static ۥ۟۟۟۟:Ljava/util/concurrent/Executor;


# instance fields
.field public ۥ:Ljava/util/concurrent/Executor;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public ۥ۟:Ljava/util/concurrent/Executor;

.field public final ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df\u06df\u06e1$\u06e5\u06df\u06df\u06df<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;->ۥ۟۟۟:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df\u06df\u06e1$\u06e5\u06df\u06df\u06df<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;

    return-void
.end method


# virtual methods
.method public ۥ()Landroidx/recyclerview/widget/ۥ۟۟;
    .locals 4
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;->ۥ۟:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_1

    sget-object v0, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;->ۥ۟۟۟:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;->ۥ۟۟۟۟:Ljava/util/concurrent/Executor;

    if-nez v1, :cond_0

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    sput-object v1, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;->ۥ۟۟۟۟:Ljava/util/concurrent/Executor;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;->ۥ۟۟۟۟:Ljava/util/concurrent/Executor;

    iput-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;->ۥ۟:Ljava/util/concurrent/Executor;

    goto :goto_2

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_1
    :goto_2
    new-instance v0, Landroidx/recyclerview/widget/ۥ۟۟;

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;->ۥ:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;->ۥ۟:Ljava/util/concurrent/Executor;

    iget-object v3, p0, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;

    invoke-direct {v0, v1, v2, v3}, Landroidx/recyclerview/widget/ۥ۟۟;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;)V

    return-object v0
.end method

.method public ۥ۟(Ljava/util/concurrent/Executor;)Landroidx/recyclerview/widget/ۥ۟۟$ۥ;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df$\u06e5<",
            "TT;>;"
        }
    .end annotation

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;->ۥ۟:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public ۥ۟۟(Ljava/util/concurrent/Executor;)Landroidx/recyclerview/widget/ۥ۟۟$ۥ;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df$\u06e5<",
            "TT;>;"
        }
    .end annotation

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;->ۥ:Ljava/util/concurrent/Executor;

    return-object p0
.end method
