.class public abstract L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/ExecutorService;

.field public static final 飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ExecutorService;

.field public static final 飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sput-object v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/ExecutorService;

    .line 20
    .line 21
    return-void
.end method
