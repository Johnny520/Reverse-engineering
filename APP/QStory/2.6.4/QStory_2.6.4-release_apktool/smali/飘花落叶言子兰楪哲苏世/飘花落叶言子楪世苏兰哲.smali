.class public final L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashMap;

.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲兰世;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/locks/ReentrantLock;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    sget-object v1, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    new-instance v2, Ljava/util/concurrent/locks/ReentrantLock;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_2

    .line 26
    :cond_0
    :goto_0
    check-cast v2, Ljava/util/concurrent/locks/ReentrantLock;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    monitor-exit v0

    .line 29
    iput-object v2, p0, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/locks/ReentrantLock;

    .line 30
    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲兰世;

    .line 34
    .line 35
    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲兰世;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/4 p2, 0x0

    .line 40
    :goto_1
    iput-object p2, p0, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲兰世;

    .line 41
    .line 42
    return-void

    .line 43
    :goto_2
    monitor-exit v0

    .line 44
    throw p0
.end method
